package com.google.android.apps.gsa.staticplugins.opa.p8592ui;

import android.graphics.drawable.Drawable;
import com.google.android.apps.gsa.shared.util.p7159c.C90880an;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ui.k */
/* compiled from: PG */
final class C113723k extends C90880an {

    /* renamed from: a */
    final /* synthetic */ SwipeViewListElement f314953a;

    /* renamed from: b */
    final /* synthetic */ C113725m f314954b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C113723k(C113725m mVar, SwipeViewListElement swipeViewListElement) {
        super("Retrieve app icon", 1, 0);
        this.f314954b = mVar;
        this.f314953a = swipeViewListElement;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        Drawable drawable;
        if (this.f314953a.f314921a == null) {
            drawable = this.f314954b.getActivity().getPackageManager().getDefaultActivityIcon();
        } else {
            drawable = this.f314954b.getActivity().getPackageManager().getApplicationIcon(this.f314953a.f314921a);
        }
        if (drawable == null) {
            return C58836b.f156633a;
        }
        return C58833ax.m90834k(drawable);
    }
}
