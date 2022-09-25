package com.google.android.apps.gsa.staticplugins.opa.tapas.p8552k;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8552k.p8554b.C112116a;
import com.google.android.libraries.assistant.p1594s.p1595a.C19130c;
import com.google.android.libraries.assistant.p1594s.p1599c.C19199a;
import com.google.android.libraries.assistant.p1594s.p1599c.C19200b;
import com.google.android.libraries.assistant.p1594s.p1599c.C19202d;
import com.google.android.libraries.assistant.p1594s.p1599c.C19207i;
import com.google.android.libraries.assistant.p1594s.p1599c.C19208j;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.k.p */
/* compiled from: PG */
public final class C112130p {

    /* renamed from: a */
    public final C112116a f311374a;

    /* renamed from: b */
    private final C22871g f311375b;

    public C112130p(C112116a aVar, C22871g gVar) {
        this.f311374a = aVar;
        this.f311375b = gVar;
        C19130c a = aVar.mo99400a();
        if (aVar.mo99400a() == null) {
            C60856cj.m92900i(C19202d.f53762d);
            return;
        }
        C19199a aVar2 = (C19199a) C19200b.f53754f.createBuilder();
        C19207i iVar = (C19207i) C19208j.f53782h.createBuilder();
        iVar.mo24316a("assistant_tapas_grammar_pumpkin_config");
        iVar.copyOnWrite();
        C19208j jVar = (C19208j) iVar.instance;
        jVar.f53784a |= 2;
        jVar.f53789f = true;
        aVar2.copyOnWrite();
        C19200b bVar = (C19200b) aVar2.instance;
        C19208j jVar2 = (C19208j) iVar.build();
        jVar2.getClass();
        bVar.f53760e = jVar2;
        bVar.f53756a |= 256;
        gVar.mo28209i(a.mo24295b((C19200b) aVar2.build()), "initialize Pumpkin", new C112128n(this));
    }
}
