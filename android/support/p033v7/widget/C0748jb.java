package android.support.p033v7.widget;

import android.support.p033v7.view.menu.C0446a;
import android.view.View;
import android.view.Window;

/* renamed from: android.support.v7.widget.jb */
/* compiled from: PG */
final class C0748jb implements View.OnClickListener {

    /* renamed from: a */
    final C0446a f2609a;

    /* renamed from: b */
    final /* synthetic */ C0750jd f2610b;

    public C0748jb(C0750jd jdVar) {
        this.f2610b = jdVar;
        this.f2609a = new C0446a(jdVar.f2614a.getContext(), jdVar.f2617d);
    }

    public final void onClick(View view) {
        C0750jd jdVar = this.f2610b;
        Window.Callback callback = jdVar.f2619f;
        if (callback != null && jdVar.f2620g) {
            callback.onMenuItemSelected(0, this.f2609a);
        }
    }
}
