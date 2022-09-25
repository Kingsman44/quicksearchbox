package com.google.android.apps.gsa.staticplugins.opa.morris2.framework.p8388a;

import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14735e;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14371gt;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14390hl;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14391hm;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf;
import com.google.assistant.p3897e.p3929l.p3930a.C52686as;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.framework.a.ak */
/* compiled from: PG */
final class C109584ak implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C52686as f305196a;

    /* renamed from: b */
    final /* synthetic */ C109585al f305197b;

    public C109584ak(C109585al alVar, C52686as asVar) {
        this.f305197b = alVar;
        this.f305196a = asVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C109585al.f305198a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "Morris.SettingsDataSrc");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(24897)).mo56386p("Failed writing Morris driving settings to Geller!");
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        C109585al alVar = this.f305197b;
        C52686as asVar = this.f305196a;
        alVar.mo97908f(asVar);
        alVar.f305205h = Optional.m71637of(asVar);
        if (((C52686as) alVar.f305205h.get()).f138306n != alVar.f305201d.get()) {
            alVar.f305201d.set(((C52686as) alVar.f305205h.get()).f138306n);
            C14986h hVar = alVar.f305199b;
            boolean z = ((C52686as) alVar.f305205h.get()).f138299g;
            boolean z2 = alVar.f305201d.get();
            C14371gt gtVar = (C14371gt) C14492lf.f43796e.createBuilder();
            C14390hl hlVar = (C14390hl) C14391hm.f43529d.createBuilder();
            hlVar.copyOnWrite();
            ((C14391hm) hlVar.instance).f43531a = 2;
            hlVar.copyOnWrite();
            ((C14391hm) hlVar.instance).f43532b = z;
            hlVar.copyOnWrite();
            ((C14391hm) hlVar.instance).f43533c = z2;
            gtVar.copyOnWrite();
            C14492lf lfVar = (C14492lf) gtVar.instance;
            C14391hm hmVar = (C14391hm) hlVar.build();
            hmVar.getClass();
            lfVar.f43801d = hmVar;
            lfVar.f43800c = 22;
            hVar.mo21875g((C14492lf) gtVar.build());
        }
        if (((C52686as) alVar.f305205h.get()).f138299g != alVar.f305200c.get()) {
            alVar.f305200c.set(((C52686as) alVar.f305205h.get()).f138299g);
            alVar.f305199b.mo21875g(C14735e.m31019a(alVar.f305200c.get(), ((C52686as) alVar.f305205h.get()).f138306n));
        }
    }
}
