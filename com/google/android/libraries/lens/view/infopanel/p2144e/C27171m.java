package com.google.android.libraries.lens.view.infopanel.p2144e;

import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.lens.view.infopanel.e.m */
/* compiled from: PG */
final class C27171m implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ MaterialButton f74261a;

    /* renamed from: b */
    final /* synthetic */ C27177s f74262b;

    public C27171m(C27177s sVar, MaterialButton materialButton) {
        this.f74262b = sVar;
        this.f74261a = materialButton;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) ((C58970a) C27177s.f74277a.mo56226d()).mo56382g(th)).mo56372aa(49572)).mo56386p("Failed to load image.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C58974d dVar = C27177s.f74277a;
        this.f74262b.mo32609a(this.f74261a, (Drawable) obj);
        C27177s sVar = this.f74262b;
        RecyclerView recyclerView = sVar.f74280d;
        if (recyclerView != null && !sVar.f74283g) {
            recyclerView.scrollToPosition(0);
        }
    }
}
