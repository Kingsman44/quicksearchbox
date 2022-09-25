package com.google.android.apps.search.googleapp.search.voicesearch.p10469c;

import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.search.googleapp.search.voicesearch.p10468b.C138717c;
import com.google.android.libraries.assistant.p1533o.C18439ab;
import com.google.android.libraries.assistant.p1533o.C18457at;
import com.google.android.libraries.assistant.p1533o.C18460aw;
import com.google.android.libraries.assistant.p1533o.C18461ax;
import com.google.android.libraries.assistant.p1533o.C18462ay;
import com.google.android.libraries.assistant.p1533o.C18470bf;
import com.google.android.libraries.assistant.p1533o.C18474bj;
import com.google.android.libraries.assistant.p1533o.C18478bn;
import com.google.android.libraries.assistant.p1533o.C18479bo;
import com.google.android.libraries.assistant.p1533o.C18482br;
import java.util.concurrent.Executor;
import p5488io.grpc.C70297cz;
import p5488io.grpc.C70334de;
import p5488io.grpc.p5533i.C70862aj;
import p5488io.grpc.p5533i.C70879r;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.c.k */
/* compiled from: PG */
public final class C138774k {

    /* renamed from: a */
    public final Executor f377466a;

    /* renamed from: b */
    public final C138717c f377467b;

    /* renamed from: c */
    public final C89859i f377468c;

    /* renamed from: d */
    public final C18460aw f377469d;

    /* renamed from: e */
    public final C138772i f377470e;

    /* renamed from: f */
    public final C18470bf f377471f;

    /* renamed from: g */
    public final boolean f377472g;

    /* renamed from: h */
    public final boolean f377473h;

    /* renamed from: i */
    public final boolean f377474i;

    /* renamed from: j */
    public boolean f377475j = false;

    public C138774k(C89859i iVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, Executor executor, C138717c cVar, C138772i iVar2, C18470bf bfVar) {
        C70334de deVar = new C70334de();
        C70297cz czVar = C18439ab.f52340a;
        C18461ax axVar = (C18461ax) C18462ay.f52389b.createBuilder();
        boolean z8 = z4 && z7;
        axVar.copyOnWrite();
        ((C18462ay) axVar.instance).f52391a = z8;
        deVar.mo62033h(czVar, (C18462ay) axVar.build());
        this.f377467b = cVar;
        this.f377468c = iVar;
        this.f377472g = z3;
        this.f377473h = z5;
        this.f377474i = z6;
        this.f377466a = executor;
        C18457at atVar = (C18457at) C18460aw.f52380h.createBuilder();
        atVar.copyOnWrite();
        ((C18460aw) atVar.instance).f52383b = z2;
        atVar.copyOnWrite();
        ((C18460aw) atVar.instance).f52384c = z;
        boolean z9 = z4 && z7;
        atVar.copyOnWrite();
        ((C18460aw) atVar.instance).f52388g = z9;
        this.f377469d = (C18460aw) atVar.build();
        this.f377470e = iVar2;
        this.f377471f = (C18470bf) bfVar.mo62576o(new C70879r(deVar));
    }

    /* renamed from: a */
    public static void m225430a(C70862aj ajVar, C18460aw awVar) {
        C18474bj bjVar = (C18474bj) C18482br.f52415c.createBuilder();
        C18478bn bnVar = (C18478bn) C18479bo.f52410b.createBuilder();
        bnVar.copyOnWrite();
        awVar.getClass();
        ((C18479bo) bnVar.instance).f52412a = awVar;
        bjVar.copyOnWrite();
        C18482br brVar = (C18482br) bjVar.instance;
        C18479bo boVar = (C18479bo) bnVar.build();
        boVar.getClass();
        brVar.f52418b = boVar;
        brVar.f52417a = 1;
        ajVar.mo20123c((C18482br) bjVar.build());
    }
}
