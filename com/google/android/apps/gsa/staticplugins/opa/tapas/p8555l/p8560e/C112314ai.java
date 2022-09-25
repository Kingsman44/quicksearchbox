package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e;

import com.google.android.apps.gsa.assistant.shared.l.l;
import com.google.android.apps.gsa.assistant.shared.l.m;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.research.p5181a.p5183b.p5184a.C66302c;
import com.google.research.p5181a.p5187e.C66355e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.ai */
/* compiled from: PG */
public final /* synthetic */ class C112314ai implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C112331az f311686a;

    public /* synthetic */ C112314ai(C112331az azVar) {
        this.f311686a = azVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C112331az azVar = this.f311686a;
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            ((C59052c) ((C59052c) C112331az.f311705b.mo56224b()).mo56372aa(27691)).mo56386p("Got empty training buffers from Geller, loading from OpaStore as fallback.");
            return azVar.mo99500d();
        }
        l lVar = ((m) optional.get()).a;
        if (lVar == null) {
            lVar = l.d;
        }
        return C60856cj.m92900i(C66355e.m97089a(lVar.a.mo59174N(), new C66302c()));
    }
}
