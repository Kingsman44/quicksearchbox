package com.google.android.apps.search.googleapp.p10117aa;

import com.google.android.apps.search.googleapp.p10117aa.p10121d.C133118a;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.common.base.C58817ah;
import com.google.protobuf.C63042fg;
import com.google.protobuf.C63088z;
import com.google.protobuf.p4750c.C62953e;

/* renamed from: com.google.android.apps.search.googleapp.aa.af */
/* compiled from: PG */
public final /* synthetic */ class C133088af implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C133103au f362853a;

    /* renamed from: b */
    public final /* synthetic */ C133124i f362854b;

    /* renamed from: c */
    public final /* synthetic */ boolean f362855c;

    public /* synthetic */ C133088af(C133103au auVar, C133124i iVar, boolean z) {
        this.f362853a = auVar;
        this.f362854b = iVar;
        this.f362855c = z;
    }

    public final Object apply(Object obj) {
        C133103au auVar = this.f362853a;
        C133124i iVar = this.f362854b;
        boolean z = this.f362855c;
        C133127l lVar = (C133127l) obj;
        C63042fg i = C62953e.m95484i(auVar.f362882h.mo26870b());
        iVar.copyOnWrite();
        C133125j jVar = (C133125j) iVar.instance;
        C133125j jVar2 = C133125j.f362919l;
        i.getClass();
        jVar.f362931k = i;
        jVar.f362921a |= 512;
        iVar.copyOnWrite();
        C133125j jVar3 = (C133125j) iVar.instance;
        i.getClass();
        jVar3.f362929i = i;
        jVar3.f362921a |= 128;
        int a = C133103au.m216064a(lVar, jVar3.f362925e);
        if (a == -1) {
            if ((((C133125j) iVar.instance).f362921a & 4) == 0) {
                C133118a aVar = auVar.f362883i;
                aVar.mo110983c();
                aVar.f362914b.mo19974a(C37182a.f97776aH);
                aVar.f362915c = true;
            }
            C133126k kVar = (C133126k) lVar.toBuilder();
            kVar.mo110986b(iVar);
            return (C133127l) kVar.build();
        }
        C133125j jVar4 = (C133125j) lVar.f362935b.get(a);
        if (jVar4.f362930j) {
            return lVar;
        }
        if (z) {
            if ((jVar4.f362921a & 4) != 0) {
                String str = jVar4.f362924d;
                iVar.copyOnWrite();
                C133125j jVar5 = (C133125j) iVar.instance;
                str.getClass();
                jVar5.f362921a |= 4;
                jVar5.f362924d = str;
            }
            if ((jVar4.f362921a & 32) != 0) {
                C63088z zVar = jVar4.f362927g;
                iVar.copyOnWrite();
                C133125j jVar6 = (C133125j) iVar.instance;
                zVar.getClass();
                jVar6.f362921a |= 32;
                jVar6.f362927g = zVar;
            }
        }
        if ((((C133125j) iVar.instance).f362921a & 16) == 0 && (jVar4.f362921a & 16) != 0) {
            C63088z zVar2 = jVar4.f362926f;
            iVar.copyOnWrite();
            C133125j jVar7 = (C133125j) iVar.instance;
            zVar2.getClass();
            jVar7.f362921a |= 16;
            jVar7.f362926f = zVar2;
        }
        if ((jVar4.f362921a & 512) != 0) {
            C63042fg fgVar = jVar4.f362931k;
            if (fgVar == null) {
                fgVar = C63042fg.f170152c;
            }
            iVar.copyOnWrite();
            C133125j jVar8 = (C133125j) iVar.instance;
            fgVar.getClass();
            jVar8.f362931k = fgVar;
            jVar8.f362921a |= 512;
        }
        C133126k kVar2 = (C133126k) lVar.toBuilder();
        kVar2.mo110987c(a);
        kVar2.mo110986b(iVar);
        return (C133127l) kVar2.build();
    }
}
