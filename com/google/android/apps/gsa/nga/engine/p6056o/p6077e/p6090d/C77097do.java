package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6090d;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.engine.am.d.g;
import com.google.android.apps.gsa.nga.engine.am.t;
import com.google.android.apps.gsa.nga.engine.p6044n.p6051d.C76393s;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80303ay;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.p3922a.C51643a;
import com.google.assistant.p3897e.p3921j.p3922a.C51644b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63088z;
import com.google.protos.p4985f.p5030q.C65192ez;
import com.google.protos.p4985f.p5030q.C65196fc;
import java.util.ArrayList;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.d.do */
/* compiled from: PG */
public final /* synthetic */ class C77097do implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C77123en f212770a;

    /* renamed from: b */
    public final /* synthetic */ C51809dy f212771b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f212772c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f212773d;

    /* renamed from: e */
    public final /* synthetic */ String f212774e;

    /* renamed from: f */
    public final /* synthetic */ C77131l f212775f;

    /* renamed from: g */
    public final /* synthetic */ C80399l f212776g;

    /* renamed from: h */
    public final /* synthetic */ C80303ay f212777h;

    public /* synthetic */ C77097do(C77123en enVar, C51809dy dyVar, C60870cx cxVar, C60870cx cxVar2, String str, C77131l lVar, C80399l lVar2, C80303ay ayVar) {
        this.f212770a = enVar;
        this.f212771b = dyVar;
        this.f212772c = cxVar;
        this.f212773d = cxVar2;
        this.f212774e = str;
        this.f212775f = lVar;
        this.f212776g = lVar2;
        this.f212777h = ayVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C77123en enVar = this.f212770a;
        C51809dy dyVar = this.f212771b;
        C60870cx cxVar = this.f212772c;
        C60870cx cxVar2 = this.f212773d;
        String str = this.f212774e;
        C77131l lVar = this.f212775f;
        C80399l lVar2 = this.f212776g;
        C80303ay ayVar = this.f212777h;
        List list = (List) obj;
        g gVar = enVar.f212861r;
        Optional optional = (Optional) C60856cj.m92909r(cxVar);
        Optional optional2 = (Optional) C60856cj.m92909r(cxVar2);
        String str2 = lVar.mo72435c().b().i;
        C81442m.m129557s(lVar2, gVar.b());
        String str3 = str2;
        C81442m.m129557s(lVar2, gVar.a(Optional.empty(), optional, optional2, str3, str));
        C80399l lVar3 = (C80399l) C80401n.f220656k.createBuilder();
        ArrayList arrayList = new ArrayList();
        arrayList.add(dyVar);
        ArrayList arrayList2 = arrayList;
        arrayList2.addAll(gVar.d(BuildConfig.FLAVOR, (String) optional.orElse(BuildConfig.FLAVOR), (String) optional2.orElse(BuildConfig.FLAVOR), str3, str));
        t tVar = gVar.b;
        arrayList2.add(t.j());
        t tVar2 = gVar.b;
        C51643a aVar = (C51643a) C51644b.f134574d.createBuilder();
        aVar.copyOnWrite();
        C51644b bVar = (C51644b) aVar.instance;
        bVar.f134576a |= 1;
        bVar.f134577b = true;
        aVar.copyOnWrite();
        C51644b bVar2 = (C51644b) aVar.instance;
        bVar2.f134576a |= 2;
        bVar2.f134578c = true;
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a = 1 | kaVar.f137059a;
        kaVar.f137060b = "assistant.api.client_op.core.DismissAssistantArgs";
        C63088z byteString = ((C51644b) aVar.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        C51809dy a = t.a("core.DISMISS_ASSISTANT", "dismiss_assistant_args", (C52230ka) jzVar.build());
        arrayList2.add(a);
        C65192ez ezVar = (C65192ez) C65196fc.f176453l.createBuilder();
        C52081en b = C76393s.m123006b(arrayList2);
        ezVar.copyOnWrite();
        b.getClass();
        ((C65196fc) ezVar.instance).f176461g = b;
        lVar3.copyOnWrite();
        C65196fc fcVar = (C65196fc) ezVar.build();
        fcVar.getClass();
        ((C80401n) lVar3.instance).f220666i = fcVar;
        C80399l lVar4 = (C80399l) C80401n.f220656k.createBuilder();
        g.h(ayVar, lVar3, lVar4);
        C80399l lVar5 = (C80399l) ((C80401n) lVar4.build()).toBuilder();
        ArrayList arrayList3 = new ArrayList(gVar.c(false));
        t tVar3 = gVar.b;
        arrayList3.add(t.j());
        arrayList3.add(a);
        C65192ez ezVar2 = (C65192ez) C65196fc.f176453l.createBuilder();
        C52081en b2 = C76393s.m123006b(arrayList3);
        ezVar2.copyOnWrite();
        b2.getClass();
        ((C65196fc) ezVar2.instance).f176461g = b2;
        lVar5.copyOnWrite();
        C65196fc fcVar2 = (C65196fc) ezVar2.build();
        fcVar2.getClass();
        ((C80401n) lVar5.instance).f220666i = fcVar2;
        lVar2.mo74320l("confirmation_button_id", (C80401n) lVar3.build());
        lVar2.mo74320l("dismiss_id", (C80401n) lVar4.build());
        lVar2.mo74320l("cancel_button_id", (C80401n) lVar5.build());
        return Optional.m71637of((C80401n) lVar2.build());
    }
}
