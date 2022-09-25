package com.google.android.libraries.onegoogle.p2380c.p2382b;

import android.view.View;
import com.google.android.libraries.onegoogle.accountmanagement.C30253a;
import com.google.android.libraries.onegoogle.accountmanagement.C30281j;
import com.google.android.libraries.onegoogle.accountmanagement.C30282k;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30306o;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30312u;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30313v;

/* renamed from: com.google.android.libraries.onegoogle.c.b.g */
/* compiled from: PG */
final class C30878g implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    final /* synthetic */ C30879h f83271a;

    /* renamed from: b */
    private final C30282k f83272b;

    /* renamed from: c */
    private final C30312u f83273c;

    public C30878g(C30879h hVar, View view, int i) {
        this.f83271a = hVar;
        this.f83272b = new C30877f(this, view, i);
        this.f83273c = new C30875d(this, view, i);
    }

    public final void onViewAttachedToWindow(View view) {
        C30253a aVar = this.f83271a.f83274a;
        ((C30306o) aVar).f81934a.f81880a.add(this.f83272b);
        C30313v vVar = this.f83271a.f83275b;
        if (vVar != null) {
            vVar.f81975a.add(this.f83273c);
        }
        C30281j jVar = ((C30306o) this.f83271a.f83274a).f81934a;
        if (jVar.f81882c) {
            this.f83272b.mo18106c(C30281j.m56319c(jVar.f81883d));
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        C30253a aVar = this.f83271a.f83274a;
        ((C30306o) aVar).f81934a.f81880a.remove(this.f83272b);
        C30313v vVar = this.f83271a.f83275b;
        if (vVar != null) {
            vVar.f81975a.remove(this.f83273c);
        }
    }
}
