package com.google.android.libraries.play.unison.binding;

import android.view.View;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.play.unison.binding.b */
/* compiled from: PG */
public abstract class C31976b extends C31978d {

    /* renamed from: a */
    public final C31988n f85974a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C31976b(View view) {
        super(view);
        C69664n.m101061g(view, "itemView");
        C31988n nVar = new C31988n((C31982h) null);
        this.f85974a = nVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo37742e(C31978d dVar, Object obj, Object obj2) {
        C69664n.m101061g(dVar, "childBindable");
        C69664n.m101061g(obj, "childViewData");
        C31988n nVar = this.f85974a;
        BindableStateStore bindableStateStore = this.f85978g;
        if (bindableStateStore != null) {
            nVar.mo37759a(dVar, obj, obj2, bindableStateStore);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C31976b(View view, C31982h hVar) {
        super(view);
        C31988n nVar = new C31988n(hVar);
        this.f85974a = nVar;
    }
}
