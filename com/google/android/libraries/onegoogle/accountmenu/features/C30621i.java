package com.google.android.libraries.onegoogle.accountmenu.features;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.i */
/* compiled from: PG */
final class C30621i extends C30637t {

    /* renamed from: a */
    private final C58833ax f82719a;

    public C30621i(C58833ax axVar) {
        this.f82719a = axVar;
    }

    /* renamed from: a */
    public final C58833ax mo36339a() {
        return this.f82719a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C30637t) {
            return this.f82719a.equals(((C30637t) obj).mo36339a());
        }
        return false;
    }

    public final int hashCode() {
        return 2041338095;
    }

    public final String toString() {
        return "NonCollapsibleFlavorFeatureImpl{minimizableStorageCardRetriever=Optional.absent()}";
    }
}
