package com.google.android.apps.gsa.nga.engine.p6144ui.p6149d.p6152c;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6149d.p6150a.C78115g;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128052aa;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128054ac;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128056ae;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128059ah;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128060ai;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128066ao;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128069ar;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128070as;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128071at;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128077az;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128116q;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.d.c.o */
/* compiled from: PG */
public final /* synthetic */ class C78138o implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C78139p f215158a;

    /* renamed from: b */
    public final /* synthetic */ C128071at f215159b;

    /* renamed from: c */
    public final /* synthetic */ C70862aj f215160c;

    public /* synthetic */ C78138o(C78139p pVar, C128071at atVar, C70862aj ajVar) {
        this.f215158a = pVar;
        this.f215159b = atVar;
        this.f215160c = ajVar;
    }

    public final void run() {
        int i;
        C128070as asVar;
        C128066ao aoVar;
        C128052aa aaVar;
        C128056ae aeVar;
        C128060ai aiVar;
        C78139p pVar = this.f215158a;
        C128071at atVar = this.f215159b;
        C70862aj ajVar = this.f215160c;
        int i2 = atVar.f352398a;
        switch (i2) {
            case 0:
                i = 7;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            case 5:
                i = 5;
                break;
            case 6:
                i = 6;
                break;
            default:
                i = 0;
                break;
        }
        int i3 = i - 1;
        if (i != 0) {
            switch (i3) {
                case 0:
                    if (i2 == 1) {
                        asVar = (C128070as) atVar.f352399b;
                    } else {
                        asVar = C128070as.f352392c;
                    }
                    C128069ar a = C128069ar.m209203a(asVar.f352395b);
                    if (a == null) {
                        a = C128069ar.NOT_SET;
                    }
                    if (a == C128069ar.NOT_SET) {
                        ajVar.mo20122b(new IllegalArgumentException("Trigger Source is not set!"));
                        return;
                    }
                    C78115g gVar = pVar.f215163c;
                    C128069ar a2 = C128069ar.m209203a(asVar.f352395b);
                    if (a2 == null) {
                        a2 = C128069ar.NOT_SET;
                    }
                    gVar.mo73086e(a2);
                    ajVar.mo20123c(C128077az.f352403a);
                    ajVar.mo20121a();
                    return;
                case 1:
                    if (i2 == 2) {
                        aoVar = (C128066ao) atVar.f352399b;
                    } else {
                        aoVar = C128066ao.f352380e;
                    }
                    if ((aoVar.f352382a & 16) == 0) {
                        ajVar.mo20122b(new IllegalArgumentException("missing trigger type!"));
                        return;
                    } else if (aoVar.f352383b != 0) {
                        pVar.f215163c.mo73085d(aoVar);
                        ajVar.mo20123c(C128077az.f352403a);
                        ajVar.mo20121a();
                        return;
                    } else {
                        ajVar.mo20122b(new IllegalArgumentException("No valid type of query is set!"));
                        return;
                    }
                case 2:
                    if (i2 == 3) {
                        aaVar = (C128052aa) atVar.f352399b;
                    } else {
                        aaVar = C128052aa.f352355c;
                    }
                    if ((aaVar.f352357a & 1) != 0) {
                        try {
                            C78115g gVar2 = pVar.f215163c;
                            C83320io ioVar = aaVar.f352358b;
                            if (ioVar == null) {
                                ioVar = C83320io.f227132d;
                            }
                            gVar2.mo73082a(ioVar);
                            ajVar.mo20123c(C128077az.f352403a);
                            ajVar.mo20121a();
                            return;
                        } catch (IllegalArgumentException e) {
                            ajVar.mo20122b(e);
                            return;
                        }
                    } else {
                        ajVar.mo20122b(new IllegalArgumentException("UtteranceId is not set!"));
                        return;
                    }
                case 3:
                    if (i2 == 4) {
                        C128054ac acVar = (C128054ac) atVar.f352399b;
                    } else {
                        C128054ac acVar2 = C128054ac.f352359a;
                    }
                    pVar.f215163c.mo73087f();
                    ajVar.mo20123c(C128077az.f352403a);
                    ajVar.mo20121a();
                    return;
                case 4:
                    if (i2 == 5) {
                        aeVar = (C128056ae) atVar.f352399b;
                    } else {
                        aeVar = C128056ae.f352361c;
                    }
                    if ((aeVar.f352363a & 1) != 0) {
                        C78115g gVar3 = pVar.f215163c;
                        C128116q a3 = C128116q.m209218a(aeVar.f352364b);
                        if (a3 == null) {
                            a3 = C128116q.ONBOARDING_TYPE_UNKNOWN;
                        }
                        gVar3.mo73083b(a3);
                        ajVar.mo20123c(C128077az.f352403a);
                        ajVar.mo20121a();
                        return;
                    }
                    ajVar.mo20122b(new IllegalArgumentException("openOnboarding does not have type set!"));
                    return;
                case 5:
                    if (i2 == 6) {
                        aiVar = (C128060ai) atVar.f352399b;
                    } else {
                        aiVar = C128060ai.f352370c;
                    }
                    C128059ah a4 = C128059ah.m209200a(aiVar.f352373b);
                    if (a4 == null) {
                        a4 = C128059ah.NOT_SET;
                    }
                    if (a4.equals(C128059ah.NOT_SET)) {
                        ajVar.mo20122b(new IllegalArgumentException("startVoicePlate does not have reason set!"));
                        return;
                    }
                    C59052c cVar = (C59052c) ((C59052c) C78139p.f215161a.mo56224b()).mo56372aa(5038);
                    C128059ah a5 = C128059ah.m209200a(aiVar.f352373b);
                    if (a5 == null) {
                        a5 = C128059ah.NOT_SET;
                    }
                    cVar.mo56389s("startVoicePlate request with reason %s", a5);
                    pVar.f215163c.mo73084c();
                    ajVar.mo20123c(C128077az.f352403a);
                    ajVar.mo20121a();
                    return;
                case 6:
                    ajVar.mo20122b(new IllegalArgumentException("No event type is given!"));
                    return;
                default:
                    return;
            }
        } else {
            throw null;
        }
    }
}
