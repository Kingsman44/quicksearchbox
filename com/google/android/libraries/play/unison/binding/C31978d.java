package com.google.android.libraries.play.unison.binding;

import android.view.View;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.play.unison.binding.d */
/* compiled from: PG */
public abstract class C31978d {

    /* renamed from: f */
    public final View f85977f;

    /* renamed from: g */
    public BindableStateStore f85978g;

    /* renamed from: h */
    public C31977c f85979h;

    /* renamed from: i */
    public boolean f85980i;

    protected C31978d(View view) {
        C69664n.m101061g(view, "itemView");
        this.f85977f = view;
        view.setSaveFromParentEnabled(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo37735a(Object obj, C31989o oVar);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo37736b() {
    }

    /* renamed from: f */
    public final View mo37744f() {
        View view = this.f85977f;
        C69664n.m101059e(view, "null cannot be cast to non-null type T of com.google.android.libraries.play.unison.binding.Bindable.itemView");
        return view;
    }

    /* renamed from: g */
    public final void mo37745g() {
        C31977c cVar = this.f85979h;
        if (cVar != null) {
            mo37737i(cVar);
        }
        this.f85980i = false;
    }

    /* renamed from: h */
    public final void mo37746h() {
        if (this.f85980i) {
            mo37745g();
        }
        if (this.f85979h != null) {
            mo37736b();
            this.f85979h = null;
            this.f85978g = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo37737i(C31983i iVar) {
    }

    /* renamed from: j */
    public final boolean mo37747j() {
        return this.f85979h != null;
    }
}
