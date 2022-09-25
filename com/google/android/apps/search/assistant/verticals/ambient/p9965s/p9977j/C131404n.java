package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9977j;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.C123943as;
import com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.C123976m;
import com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.PlayMediaActivity;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3886c.C50690ab;
import com.google.assistant.p3886c.C50691ac;
import com.google.assistant.p3886c.C50696ah;
import com.google.assistant.p3886c.C50697ai;
import com.google.assistant.p3886c.C50760by;
import com.google.assistant.p3886c.C50761bz;
import com.google.assistant.p3886c.C50790cn;
import com.google.assistant.p3886c.C50792cp;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50801cy;
import com.google.assistant.p3886c.C50802cz;
import com.google.assistant.p3886c.C50812di;
import com.google.assistant.p3886c.C50813dj;
import com.google.assistant.p3886c.C50818do;
import com.google.assistant.p3886c.C50845q;
import com.google.assistant.p3886c.C50846r;
import com.google.assistant.p3886c.C50854z;
import com.google.assistant.p3886c.p3888b.C50716a;
import com.google.assistant.p3886c.p3888b.C50723h;
import com.google.assistant.p3886c.p3888b.C50731p;
import com.google.assistant.p3886c.p3888b.C50732q;
import com.google.assistant.p3886c.p3888b.C50733r;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.protobuf.C62940bt;
import java.util.ArrayList;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.j.n */
/* compiled from: PG */
public final /* synthetic */ class C131404n implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C131377ai f359208a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f359209b;

    public /* synthetic */ C131404n(C131377ai aiVar, C58485gu guVar) {
        this.f359208a = aiVar;
        this.f359209b = guVar;
    }

    public final Object apply(Object obj) {
        C131377ai aiVar = this.f359208a;
        C58485gu guVar = this.f359209b;
        C58485gu guVar2 = (C58485gu) obj;
        if (guVar2.size() < 3) {
            ((C58970a) ((C58970a) aiVar.f359119b.mo56225c()).mo56372aa(39244)).mo56387q("Not enough media items after loading images. %d images failed to load.", guVar.size() - guVar2.size());
            return Optional.empty();
        }
        C131401k kVar = aiVar.f359122e;
        if (guVar2.isEmpty()) {
            ((C58970a) ((C58970a) kVar.f359202e.mo56225c()).mo56372aa(39238)).mo56386p("No media items.");
            return Optional.empty();
        }
        Context context = kVar.f359198a;
        String i = ((C123976m) guVar2.get(0)).mo106214i();
        Intent intent = new Intent(context, PlayMediaActivity.class);
        intent.setAction("ACTION_OPEN");
        intent.putExtra("KEY_PACKAGE_NAME", i);
        intent.putExtra("KEY_OPEN_IN_FOREGROUND", true);
        intent.setFlags(268435456);
        String uri = C123943as.m203259a(intent.toUri(1)).toUri(1);
        ((C58970a) ((C58970a) kVar.f359202e.mo56224b()).mo56372aa(39237)).mo56389s("#partiallyGenerateSmartspaceCard: Tap intent: %s", uri);
        C50790cn cnVar = (C50790cn) C50818do.f132293H.createBuilder();
        C50794cr crVar = C50794cr.MEDIA;
        cnVar.copyOnWrite();
        C50818do doVar = (C50818do) cnVar.instance;
        doVar.f132315l = crVar.f132222T;
        doVar.f132304a |= 1024;
        C50792cp cpVar = C50792cp.OTHER;
        cnVar.copyOnWrite();
        C50818do doVar2 = (C50818do) cnVar.instance;
        doVar2.f132306c = cpVar.f132174e;
        doVar2.f132304a |= 2;
        String string = kVar.f359198a.getString(R.string.assistant_ama_media_only_chip);
        C50716a aVar = (C50716a) C50723h.f131999e.createBuilder();
        aVar.copyOnWrite();
        C50723h hVar = (C50723h) aVar.instance;
        string.getClass();
        hVar.f132001a |= 1;
        hVar.f132002b = string;
        C50723h hVar2 = (C50723h) aVar.build();
        C50801cy cyVar = (C50801cy) C50802cz.f132236g.createBuilder();
        cyVar.copyOnWrite();
        C50802cz czVar = (C50802cz) cyVar.instance;
        hVar2.getClass();
        czVar.f132239b = hVar2;
        czVar.f132238a |= 1;
        C50802cz czVar2 = (C50802cz) cyVar.build();
        cnVar.copyOnWrite();
        C50818do doVar3 = (C50818do) cnVar.instance;
        czVar2.getClass();
        doVar3.f132309f = czVar2;
        doVar3.f132304a |= 16;
        C50732q qVar = (C50732q) C50733r.f132021d.createBuilder();
        C50731p pVar = C50731p.START_ACTIVITY;
        qVar.copyOnWrite();
        C50733r rVar = (C50733r) qVar.instance;
        rVar.f132024b = pVar.f132020d;
        rVar.f132023a |= 1;
        qVar.copyOnWrite();
        C50733r rVar2 = (C50733r) qVar.instance;
        uri.getClass();
        rVar2.f132023a |= 2;
        rVar2.f132025c = uri;
        cnVar.copyOnWrite();
        C50818do doVar4 = (C50818do) cnVar.instance;
        C50733r rVar3 = (C50733r) qVar.build();
        rVar3.getClass();
        doVar4.f132316m = rVar3;
        doVar4.f132304a |= 2048;
        C50812di diVar = (C50812di) C50813dj.f132278a.createBuilder();
        C62940bt btVar = C50761bz.f132094e;
        C50760by byVar = (C50760by) C50761bz.f132093d.createBuilder();
        ArrayList arrayList = new ArrayList();
        int size = guVar2.size();
        for (int i2 = 0; i2 < size; i2++) {
            C123976m mVar = (C123976m) guVar2.get(i2);
            String e = mVar.mo106210e(arrayList.size());
            C50845q qVar2 = (C50845q) C50846r.f132401d.createBuilder();
            Optional d = mVar.mo106209d();
            Objects.requireNonNull(qVar2);
            d.ifPresentOrElse(new C131399i(qVar2), new C131400j(kVar, mVar));
            C52568wo woVar = mVar.mo106207b().f137950f;
            if (woVar == null) {
                woVar = C52568wo.f137992v;
            }
            C51012dc dcVar = woVar.f138004k;
            if (dcVar == null) {
                dcVar = C51012dc.f132813k;
            }
            if ((dcVar.f132815a & 2) != 0) {
                String str = dcVar.f132817c;
                qVar2.copyOnWrite();
                C50846r rVar4 = (C50846r) qVar2.instance;
                str.getClass();
                rVar4.f132403a |= 2;
                rVar4.f132405c = str;
            }
            C50854z zVar = (C50854z) C50691ac.f131878i.createBuilder();
            zVar.copyOnWrite();
            C50691ac acVar = (C50691ac) zVar.instance;
            e.getClass();
            acVar.f131880a |= 2;
            acVar.f131882c = e;
            String h = mVar.mo106213h();
            zVar.copyOnWrite();
            C50691ac acVar2 = (C50691ac) zVar.instance;
            h.getClass();
            acVar2.f131880a |= 16;
            acVar2.f131884e = h;
            String f = mVar.mo106211f();
            zVar.copyOnWrite();
            C50691ac acVar3 = (C50691ac) zVar.instance;
            f.getClass();
            acVar3.f131880a |= 128;
            acVar3.f131887h = f;
            String g = mVar.mo106212g();
            zVar.copyOnWrite();
            C50691ac acVar4 = (C50691ac) zVar.instance;
            g.getClass();
            acVar4.f131880a |= 32;
            acVar4.f131885f = g;
            String i3 = mVar.mo106214i();
            zVar.copyOnWrite();
            C50691ac acVar5 = (C50691ac) zVar.instance;
            i3.getClass();
            acVar5.f131880a |= 4;
            acVar5.f131883d = i3;
            C50690ab a = mVar.mo106206a();
            zVar.copyOnWrite();
            C50691ac acVar6 = (C50691ac) zVar.instance;
            acVar6.f131886g = a.f131877e;
            acVar6.f131880a |= 64;
            zVar.copyOnWrite();
            C50691ac acVar7 = (C50691ac) zVar.instance;
            C50846r rVar5 = (C50846r) qVar2.build();
            rVar5.getClass();
            acVar7.f131881b = rVar5;
            acVar7.f131880a |= 1;
            arrayList.add((C50691ac) zVar.build());
        }
        C50696ah ahVar = (C50696ah) C50697ai.f131903b.createBuilder();
        ahVar.mo53426a(arrayList);
        C50697ai aiVar2 = (C50697ai) ahVar.build();
        byVar.copyOnWrite();
        C50761bz bzVar = (C50761bz) byVar.instance;
        aiVar2.getClass();
        bzVar.f132097b = aiVar2;
        bzVar.f132096a |= 2;
        long seconds = kVar.f359203f.toSeconds();
        byVar.copyOnWrite();
        C50761bz bzVar2 = (C50761bz) byVar.instance;
        bzVar2.f132096a |= 4;
        bzVar2.f132098c = seconds;
        diVar.mo58885m(btVar, (C50761bz) byVar.build());
        cnVar.copyOnWrite();
        C50818do doVar5 = (C50818do) cnVar.instance;
        C50813dj djVar = (C50813dj) diVar.build();
        djVar.getClass();
        doVar5.f132329z = djVar;
        doVar5.f132304a |= 33554432;
        return Optional.m71637of((C50818do) cnVar.build());
    }
}
