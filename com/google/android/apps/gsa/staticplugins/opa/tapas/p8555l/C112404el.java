package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79952b;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79954bb;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79955bc;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79982cc;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80007da;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80008e;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80009f;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80011h;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80012i;
import com.google.android.apps.gsa.shared.util.p7171i.C91042a;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113371dl;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.assistant.p3781ad.p3789d.C48576aj;
import com.google.assistant.p3781ad.p3789d.C48578al;
import com.google.assistant.p3781ad.p3789d.p3791b.C48674ai;
import com.google.p4242bp.p4257f.p4262c.p4263a.C56339j;
import java.util.List;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.el */
/* compiled from: PG */
public final /* synthetic */ class C112404el implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ C112435fh f311864a;

    /* renamed from: b */
    public final /* synthetic */ List f311865b;

    /* renamed from: c */
    public final /* synthetic */ C113405ep f311866c;

    /* renamed from: d */
    public final /* synthetic */ C80007da f311867d;

    public /* synthetic */ C112404el(C112435fh fhVar, List list, C113405ep epVar, C80007da daVar) {
        this.f311864a = fhVar;
        this.f311865b = list;
        this.f311866c = epVar;
        this.f311867d = daVar;
    }

    public final Object get() {
        C79952b bVar;
        C112435fh fhVar = this.f311864a;
        List<C113415ez> list = this.f311865b;
        C113405ep epVar = this.f311866c;
        C80007da daVar = this.f311867d;
        C56339j jVar = C56339j.f150165b;
        if (epVar.mo100028k().isPresent()) {
            jVar = ((C113408es) epVar.mo100028k().get()).mo100118a().mo100027j();
        }
        if (jVar.f150167a.isEmpty()) {
            jVar = epVar.mo100027j();
        }
        C80008e eVar = (C80008e) C80012i.f219558i.createBuilder();
        String p = epVar.mo100033p();
        eVar.copyOnWrite();
        C80012i iVar = (C80012i) eVar.instance;
        p.getClass();
        iVar.f219561a |= 2;
        iVar.f219562b = p;
        if (epVar.mo100024h() == C48674ai.INTENT_LAUNCHER) {
            bVar = C79952b.IL_CLIENT;
        } else {
            bVar = C79952b.CLIENT_ORIGIN;
        }
        eVar.copyOnWrite();
        C80012i iVar2 = (C80012i) eVar.instance;
        iVar2.f219566f = bVar.f219268e;
        iVar2.f219561a |= 32;
        eVar.copyOnWrite();
        C80012i iVar3 = (C80012i) eVar.instance;
        daVar.getClass();
        iVar3.f219564d = daVar;
        iVar3.f219561a |= 4;
        long b = C91042a.m148718b(epVar.mo100033p() + fhVar.f311933f.mo26870b());
        eVar.copyOnWrite();
        C80012i iVar4 = (C80012i) eVar.instance;
        iVar4.f219561a = iVar4.f219561a | 16;
        iVar4.f219565e = b;
        C79954bb bbVar = (C79954bb) C79955bc.f219276i.createBuilder();
        for (C113415ez ezVar : list) {
            if (Thread.interrupted()) {
                return C80012i.f219558i;
            }
            eVar.mo74275a(fhVar.f311936i.mo99586a(C113371dl.m187573c(ezVar.mo100204d()), ezVar));
            if (!ezVar.mo100195H().isPresent() || ((C48578al) ezVar.mo100195H().get()).f125509c.size() <= 0) {
                bbVar.mo74274a(C79982cc.f219380z);
            } else {
                C79982cc ccVar = ((C48576aj) ((C48578al) ezVar.mo100195H().get()).f125509c.get(0)).f125501f;
                if (ccVar == null) {
                    ccVar = C79982cc.f219380z;
                }
                bbVar.mo74274a(ccVar);
            }
        }
        C80009f fVar = (C80009f) C80011h.f219551d.createBuilder();
        fVar.copyOnWrite();
        C80011h hVar = (C80011h) fVar.instance;
        jVar.getClass();
        hVar.f219554b = jVar;
        hVar.f219553a |= 1;
        fVar.copyOnWrite();
        C80011h hVar2 = (C80011h) fVar.instance;
        C79955bc bcVar = (C79955bc) bbVar.build();
        bcVar.getClass();
        hVar2.f219555c = bcVar;
        hVar2.f219553a |= 8;
        eVar.copyOnWrite();
        C80012i iVar5 = (C80012i) eVar.instance;
        C80011h hVar3 = (C80011h) fVar.build();
        hVar3.getClass();
        iVar5.f219567g = hVar3;
        iVar5.f219561a |= 64;
        return (C80012i) eVar.build();
    }
}
