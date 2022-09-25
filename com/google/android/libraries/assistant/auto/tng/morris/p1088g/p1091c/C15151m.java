package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1091c;

import android.view.View;
import android.view.WindowManager;
import com.google.android.libraries.p10982ad.C147445i;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.c.m */
/* compiled from: PG */
public final /* synthetic */ class C15151m implements C147445i {

    /* renamed from: a */
    public final /* synthetic */ C15152n f45455a;

    public /* synthetic */ C15151m(C15152n nVar) {
        this.f45455a = nVar;
    }

    /* renamed from: a */
    public final void mo18517a() {
        C15152n nVar = this.f45455a;
        if (nVar.f45464h != 2) {
            View view = nVar.f45463g;
            view.getClass();
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) view.getLayoutParams();
            View view2 = nVar.f45463g;
            view2.getClass();
            layoutParams.x = ((int) nVar.f45461e.mo21996a().mo21997a()) - (view2.getWidth() / 2);
            View view3 = nVar.f45463g;
            view3.getClass();
            layoutParams.y = ((int) nVar.f45461e.mo21996a().mo21998b()) - (view3.getHeight() / 2);
            View view4 = nVar.f45463g;
            view4.getClass();
            if (view4.isAttachedToWindow()) {
                WindowManager windowManager = nVar.f45460d;
                View view5 = nVar.f45463g;
                view5.getClass();
                windowManager.updateViewLayout(view5, layoutParams);
            }
        }
    }
}
