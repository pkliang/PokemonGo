package com.upsight.android.marketing.internal.content;

import dagger.internal.Factory;
import javax.inject.Provider;

public final class ContentModule_ProvideMarketingContentStoreFactory implements Factory<MarketingContentStore> {
    static final /* synthetic */ boolean $assertionsDisabled = (!ContentModule_ProvideMarketingContentStoreFactory.class.desiredAssertionStatus());
    private final Provider<MarketingContentStoreImpl> implProvider;
    private final ContentModule module;

    public ContentModule_ProvideMarketingContentStoreFactory(ContentModule module, Provider<MarketingContentStoreImpl> implProvider) {
        if ($assertionsDisabled || module != null) {
            this.module = module;
            if ($assertionsDisabled || implProvider != null) {
                this.implProvider = implProvider;
                return;
            }
            throw new AssertionError();
        }
        throw new AssertionError();
    }

    public MarketingContentStore get() {
        MarketingContentStore provided = this.module.provideMarketingContentStore((MarketingContentStoreImpl) this.implProvider.get());
        if (provided != null) {
            return provided;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static Factory<MarketingContentStore> create(ContentModule module, Provider<MarketingContentStoreImpl> implProvider) {
        return new ContentModule_ProvideMarketingContentStoreFactory(module, implProvider);
    }
}
