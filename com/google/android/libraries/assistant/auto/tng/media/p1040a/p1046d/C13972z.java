package com.google.android.libraries.assistant.auto.tng.media.p1040a.p1046d;

import com.google.android.libraries.assistant.p1363c.p1364a.p1365a.C16941d;
import com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16979c;
import com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16980d;
import com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16981e;
import com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16982f;
import com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16983g;
import com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16984h;
import com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16993q;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.assistant.auto.tng.media.a.d.z */
/* compiled from: PG */
public final /* synthetic */ class C13972z implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C13946al f42547a;

    /* renamed from: b */
    public final /* synthetic */ C52176ia f42548b;

    public /* synthetic */ C13972z(C13946al alVar, C52176ia iaVar) {
        this.f42547a = alVar;
        this.f42548b = iaVar;
    }

    public final C60870cx apply(Object obj) {
        C13946al alVar = this.f42547a;
        C52176ia iaVar = this.f42548b;
        C16941d dVar = (C16941d) obj;
        C16983g gVar = (C16983g) C16984h.f49615b.createBuilder();
        for (C52174hz hzVar : iaVar.f136914b) {
            if (((Boolean) alVar.f42449d.mo17428b()).booleanValue()) {
                C59104x b = C13946al.f42444a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "MediaInitPerformer");
                C59052c cVar = (C59052c) ((C59052c) b).mo56372aa(45212);
                C52568wo woVar = hzVar.f136897d;
                if (woVar == null) {
                    woVar = C52568wo.f137992v;
                }
                cVar.mo56389s("News media item title: %s", woVar.f137998e);
            }
            C16979c cVar2 = (C16979c) C16980d.f49601e.createBuilder();
            String str = hzVar.f136895b;
            cVar2.copyOnWrite();
            str.getClass();
            ((C16980d) cVar2.instance).f49603a = str;
            C16981e eVar = (C16981e) C16982f.f49608e.createBuilder();
            C52568wo woVar2 = hzVar.f136897d;
            if (woVar2 == null) {
                woVar2 = C52568wo.f137992v;
            }
            String str2 = woVar2.f137998e;
            eVar.copyOnWrite();
            str2.getClass();
            ((C16982f) eVar.instance).f49610a = str2;
            C52568wo woVar3 = hzVar.f136897d;
            if (woVar3 == null) {
                woVar3 = C52568wo.f137992v;
            }
            String str3 = woVar3.f138002i;
            eVar.copyOnWrite();
            str3.getClass();
            ((C16982f) eVar.instance).f49612c = str3;
            C52568wo woVar4 = hzVar.f136897d;
            if (woVar4 == null) {
                woVar4 = C52568wo.f137992v;
            }
            C51012dc dcVar = woVar4.f138004k;
            if (dcVar == null) {
                dcVar = C51012dc.f132813k;
            }
            eVar.copyOnWrite();
            dcVar.getClass();
            ((C16982f) eVar.instance).f49613d = dcVar;
            C16982f fVar = (C16982f) eVar.build();
            cVar2.copyOnWrite();
            fVar.getClass();
            ((C16980d) cVar2.instance).f49604b = fVar;
            gVar.mo23168a(cVar2);
        }
        int a = C16993q.m34086a(dVar.mo23095e((C16984h) gVar.build()).f49621a);
        if (a != 0 && a == 3) {
            C59104x d = C13946al.f42444a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "MediaInitPerformer");
            ((C59052c) ((C59052c) d).mo56372aa(45223)).mo56386p("Amp preload is not successful.");
            return C60856cj.m92900i(C22402a.m41822b(C52235kf.UNKNOWN, "Amp preload is not successful."));
        }
        int a2 = C16993q.m34086a(dVar.mo23094d().f49621a);
        if (a2 != 0 && a2 == 3) {
            C59104x d2 = C13946al.f42444a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "MediaInitPerformer");
            ((C59052c) ((C59052c) d2).mo56372aa(45222)).mo56386p("Amp playback is not successful.");
            return C60856cj.m92900i(C22402a.m41822b(C52235kf.UNKNOWN, "Amp playback is not successful."));
        }
        alVar.f42448c.mo21391a(iaVar);
        return C60856cj.m92900i(C22402a.f61893a);
    }
}
