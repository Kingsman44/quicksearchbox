package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8259c;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.smartspace.C92122r;
import com.google.android.apps.gsa.staticplugins.opa.ambient.activity.media.PlayMediaActivity;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106595g;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106596h;
import com.google.assistant.p3886c.C50690ab;
import com.google.assistant.p3886c.C50691ac;
import com.google.assistant.p3886c.C50692ad;
import com.google.assistant.p3886c.C50693ae;
import com.google.assistant.p3886c.C50696ah;
import com.google.assistant.p3886c.C50697ai;
import com.google.assistant.p3886c.C50705aq;
import com.google.assistant.p3886c.C50706ar;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50845q;
import com.google.assistant.p3886c.C50846r;
import com.google.assistant.p3886c.C50854z;
import com.google.assistant.p3886c.p3888b.C50731p;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C63088z;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.c.bw */
/* compiled from: PG */
public final /* synthetic */ class C106915bw implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C106918bz f297822a;

    /* renamed from: b */
    public final /* synthetic */ C106596h f297823b;

    public /* synthetic */ C106915bw(C106918bz bzVar, C106596h hVar) {
        this.f297822a = bzVar;
        this.f297823b = hVar;
    }

    public final Object apply(Object obj) {
        C106918bz bzVar = this.f297822a;
        C106596h hVar = this.f297823b;
        C58485gu guVar = (C58485gu) obj;
        ((C58970a) ((C58970a) bzVar.f297829d.mo56224b()).mo56372aa(23379)).mo56386p("Media Card Recommendations:");
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C106868ac acVar = (C106868ac) guVar.get(i);
            ((C58970a) ((C58970a) bzVar.f297829d.mo56224b()).mo56372aa(23380)).mo56361N("  %s, %s, %s, %s, %s", Integer.valueOf(acVar.mo95702c().f131877e), acVar.mo95709j(), acVar.mo95708i(), acVar.mo95706g(), acVar.mo95707h());
        }
        C50705aq aqVar = (C50705aq) C50706ar.f131960a.createBuilder();
        C62940bt btVar = C50693ae.f131889h;
        ArrayList arrayList = new ArrayList();
        int size2 = guVar.size();
        int i2 = 0;
        while (i2 < size2) {
            C106868ac acVar2 = (C106868ac) guVar.get(i2);
            String f = acVar2.mo95705f(arrayList.size());
            C50845q qVar = (C50845q) C50846r.f132401d.createBuilder();
            C52568wo woVar = acVar2.mo95703d().f137950f;
            if (woVar == null) {
                woVar = C52568wo.f137992v;
            }
            C51012dc dcVar = woVar.f138004k;
            if (dcVar == null) {
                dcVar = C51012dc.f132813k;
            }
            if (!acVar2.mo95704e().mo56113h()) {
                C58970a aVar = (C58970a) ((C58970a) bzVar.f297829d.mo56225c()).mo56372aa(23377);
                String j = acVar2.mo95709j();
                C52568wo woVar2 = acVar2.mo95703d().f137950f;
                if (woVar2 == null) {
                    woVar2 = C52568wo.f137992v;
                }
                aVar.mo56354G("#mediaItemWrapperToMediaItem: No imageContent { app: %s, title: %s }", j, woVar2.f137998e);
            } else {
                C63088z zVar = (C63088z) acVar2.mo95704e().mo56107c();
                qVar.copyOnWrite();
                C50846r rVar = (C50846r) qVar.instance;
                zVar.getClass();
                rVar.f132403a |= 1;
                rVar.f132404b = zVar;
            }
            if ((dcVar.f132815a & 2) != 0) {
                String str = dcVar.f132817c;
                qVar.copyOnWrite();
                C50846r rVar2 = (C50846r) qVar.instance;
                str.getClass();
                rVar2.f132403a |= 2;
                rVar2.f132405c = str;
            }
            C50854z zVar2 = (C50854z) C50691ac.f131878i.createBuilder();
            zVar2.copyOnWrite();
            C50691ac acVar3 = (C50691ac) zVar2.instance;
            f.getClass();
            acVar3.f131880a |= 2;
            acVar3.f131882c = f;
            String i3 = acVar2.mo95708i();
            zVar2.copyOnWrite();
            C50691ac acVar4 = (C50691ac) zVar2.instance;
            i3.getClass();
            acVar4.f131880a |= 16;
            acVar4.f131884e = i3;
            String g = acVar2.mo95706g();
            zVar2.copyOnWrite();
            C50691ac acVar5 = (C50691ac) zVar2.instance;
            g.getClass();
            acVar5.f131880a |= 128;
            acVar5.f131887h = g;
            String h = acVar2.mo95707h();
            zVar2.copyOnWrite();
            C50691ac acVar6 = (C50691ac) zVar2.instance;
            h.getClass();
            acVar6.f131880a |= 32;
            acVar6.f131885f = h;
            String j2 = acVar2.mo95709j();
            zVar2.copyOnWrite();
            C50691ac acVar7 = (C50691ac) zVar2.instance;
            j2.getClass();
            acVar7.f131880a |= 4;
            acVar7.f131883d = j2;
            C50690ab c = acVar2.mo95702c();
            zVar2.copyOnWrite();
            C50691ac acVar8 = (C50691ac) zVar2.instance;
            acVar8.f131886g = c.f131877e;
            acVar8.f131880a |= 64;
            zVar2.copyOnWrite();
            C50691ac acVar9 = (C50691ac) zVar2.instance;
            C50846r rVar3 = (C50846r) qVar.build();
            rVar3.getClass();
            acVar9.f131881b = rVar3;
            acVar9.f131880a |= 1;
            arrayList.add((C50691ac) zVar2.build());
            i2++;
        }
        Context context = bzVar.f297827b;
        String j3 = ((C106868ac) guVar.get(0)).mo95709j();
        Intent intent = new Intent(context, PlayMediaActivity.class);
        intent.setAction("ACTION_OPEN");
        intent.putExtra("KEY_PACKAGE_NAME", j3);
        intent.putExtra("KEY_OPEN_IN_FOREGROUND", true);
        intent.setFlags(268435456);
        String uri = C92122r.m151185c(intent.toUri(1), C50794cr.MEDIA, C50731p.START_ACTIVITY, false).toUri(1);
        ((C58970a) ((C58970a) bzVar.f297829d.mo56224b()).mo56372aa(23378)).mo56389s("#generateMediaPayload: Tap intent: %s", uri);
        C50692ad adVar = (C50692ad) C50693ae.f131888g.createBuilder();
        long j4 = hVar.f297209d;
        adVar.copyOnWrite();
        C50693ae aeVar = (C50693ae) adVar.instance;
        aeVar.f131891a |= 2;
        aeVar.f131893c = j4;
        C106595g a = C106595g.m177369a(hVar.f297218m);
        if (a == null) {
            a = C106595g.UNSPECIFIED;
        }
        adVar.copyOnWrite();
        C50693ae aeVar2 = (C50693ae) adVar.instance;
        aeVar2.f131894d = a.f297203i;
        aeVar2.f131891a |= 4;
        C50696ah ahVar = (C50696ah) C50697ai.f131903b.createBuilder();
        ahVar.mo53426a(arrayList);
        adVar.copyOnWrite();
        C50693ae aeVar3 = (C50693ae) adVar.instance;
        C50697ai aiVar = (C50697ai) ahVar.build();
        aiVar.getClass();
        aeVar3.f131892b = aiVar;
        aeVar3.f131891a |= 1;
        long a2 = bzVar.f297830e.mo79743a(C90017bw.f248010cj);
        adVar.copyOnWrite();
        C50693ae aeVar4 = (C50693ae) adVar.instance;
        aeVar4.f131891a |= 8;
        aeVar4.f131895e = a2;
        adVar.copyOnWrite();
        C50693ae aeVar5 = (C50693ae) adVar.instance;
        uri.getClass();
        aeVar5.f131891a |= 16;
        aeVar5.f131896f = uri;
        aqVar.mo58885m(btVar, (C50693ae) adVar.build());
        return (C50706ar) aqVar.build();
    }
}
