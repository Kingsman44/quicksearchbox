package com.google.android.libraries.play.unison.binding;

import androidx.lifecycle.C2383n;
import androidx.lifecycle.C2391v;

/* renamed from: com.google.android.libraries.play.unison.binding.aw */
/* compiled from: PG */
public final class C31974aw {

    /* renamed from: a */
    public C31979e f85969a;

    /* renamed from: b */
    private final C2391v f85970b;

    /* renamed from: c */
    private final C31995u f85971c;

    public C31974aw(C2391v vVar, C31995u uVar, C31979e eVar) {
        this.f85970b = vVar;
        this.f85971c = uVar;
        this.f85969a = eVar;
    }

    /* renamed from: a */
    public final void mo37740a(Object obj) {
        C31979e eVar = this.f85969a;
        if (eVar == null) {
            throw new IllegalStateException("Associated activity or fragment view has already been destroyed. If this error occurs at a data observer that calls bind(), did you use the correct LifecycleOwner?");
        } else if (this.f85970b.getLifecycle().mo5789a().mo5788a(C2383n.STARTED)) {
            eVar.f85983c.mo37759a(eVar.f85981a, obj, "com.google.android.libraries.play.u:root", eVar.f85982b);
        }
    }

    /* renamed from: b */
    public final void mo37741b() {
        C31979e eVar = this.f85969a;
        if (eVar != null) {
            eVar.f85981a.mo37746h();
        }
    }
}
