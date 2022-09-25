package com.google.android.libraries.play.unison.binding;

import androidx.lifecycle.C2391v;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class RootBindableController$Builder {

    /* renamed from: a */
    public boolean f85926a;

    /* renamed from: b */
    private final C2391v f85927b;

    /* renamed from: c */
    private final BindableStateStore f85928c;

    /* renamed from: d */
    private final C31978d f85929d;

    /* renamed from: e */
    private final C31995u f85930e = C31973av.f85968a;

    public RootBindableController$Builder(C2391v vVar, BindableStateStore bindableStateStore, C31978d dVar) {
        C69664n.m101061g(vVar, "lifecycleOwner");
        C69664n.m101061g(bindableStateStore, "bindableStateStore");
        this.f85927b = vVar;
        this.f85928c = bindableStateStore;
        this.f85929d = dVar;
    }

    /* renamed from: a */
    public final C31974aw mo37724a() {
        C31978d dVar = this.f85929d;
        boolean z = this.f85926a;
        C31979e eVar = new C31979e(dVar, this.f85928c);
        eVar.f85983c.mo37760b((Object) null);
        C31974aw awVar = new C31974aw(this.f85927b, this.f85930e, eVar);
        this.f85927b.getLifecycle().mo5790b(new RootBindableController$Builder$build$1(z, eVar, dVar, awVar));
        return awVar;
    }
}
