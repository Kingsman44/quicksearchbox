package com.google.android.apps.gsa.staticplugins.smartspace.p8766g;

import android.content.Context;
import android.graphics.BitmapFactory;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7019bc.C89407a;
import com.google.android.apps.gsa.shared.p7066m.C89985ax;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3886c.C50750bo;
import com.google.assistant.p3886c.C50751bp;
import com.google.assistant.p3886c.C50790cn;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50801cy;
import com.google.assistant.p3886c.C50802cz;
import com.google.assistant.p3886c.C50812di;
import com.google.assistant.p3886c.C50813dj;
import com.google.assistant.p3886c.C50818do;
import com.google.assistant.p3886c.p3888b.C50716a;
import com.google.assistant.p3886c.p3888b.C50717b;
import com.google.assistant.p3886c.p3888b.C50719d;
import com.google.assistant.p3886c.p3888b.C50720e;
import com.google.assistant.p3886c.p3888b.C50722g;
import com.google.assistant.p3886c.p3888b.C50723h;
import com.google.p4283bv.p4345d.p4350b.p4353c.C57012d;
import com.google.p4283bv.p4345d.p4350b.p4353c.C57017i;
import com.google.protobuf.C62940bt;
import dagger.C68214a;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.smartspace.g.u */
/* compiled from: PG */
public final class C117417u extends C117414r {
    public C117417u(C91189au auVar, Context context, C86124t tVar, C21370a aVar, C68214a aVar2) {
        super(auVar, context, tVar, aVar, aVar2);
    }

    /* renamed from: a */
    public final long mo103291a(C57017i iVar) {
        return iVar.f152213h + this.f325921b.mo79743a(C89985ax.f246707ao);
    }

    /* renamed from: b */
    public final C50794cr mo103282b() {
        return C50794cr.STOCK_EARNINGS_CALL;
    }

    /* renamed from: e */
    public final boolean mo103285e(Object obj) {
        return super.mo103285e(obj) && ((C57017i) obj).f152207b == 15;
    }

    /* renamed from: f */
    public final Optional mo103293f(C57017i iVar) {
        return Optional.m71637of(BitmapFactory.decodeResource(this.f325920a.getResources(), R.drawable.quantum_gm_ic_finance_white_24));
    }

    /* renamed from: g */
    public final Optional mo103294g(C57017i iVar) {
        return Optional.empty();
    }

    /* renamed from: h */
    public final Optional mo103295h(C57017i iVar) {
        C57012d dVar;
        if (!this.f325921b.mo79746e(C90014bt.f247649lD)) {
            return Optional.empty();
        }
        if (iVar.f152207b == 15) {
            dVar = (C57012d) iVar.f152208c;
        } else {
            dVar = C57012d.f152187a;
        }
        C50812di diVar = (C50812di) C50813dj.f132278a.createBuilder();
        C62940bt btVar = C50751bp.f132069d;
        C50750bo boVar = (C50750bo) C50751bp.f132068c.createBuilder();
        boVar.copyOnWrite();
        C50751bp bpVar = (C50751bp) boVar.instance;
        dVar.getClass();
        bpVar.f132072b = dVar;
        bpVar.f132071a |= 1;
        diVar.mo58885m(btVar, (C50751bp) boVar.build());
        C50813dj djVar = (C50813dj) diVar.build();
        CharSequence a = C89407a.m145418a(this.f325920a, iVar.f152213h, 0, false);
        C50717b bVar = (C50717b) C50720e.f131985f.createBuilder();
        String str = iVar.f152210e;
        bVar.copyOnWrite();
        C50720e eVar = (C50720e) bVar.instance;
        str.getClass();
        eVar.f131987a |= 1;
        eVar.f131988b = str;
        C50722g gVar = C50722g.END;
        bVar.copyOnWrite();
        C50720e eVar2 = (C50720e) bVar.instance;
        eVar2.f131989c = gVar.f131998e;
        eVar2.f131987a |= 2;
        C50719d dVar2 = C50719d.FIXED_STRING;
        bVar.copyOnWrite();
        C50720e eVar3 = (C50720e) bVar.instance;
        eVar3.f131990d = dVar2.f131984e;
        eVar3.f131987a |= 4;
        C50720e eVar4 = (C50720e) bVar.build();
        C50717b bVar2 = (C50717b) C50720e.f131985f.createBuilder();
        C50722g gVar2 = C50722g.UNSPECIFIED;
        bVar2.copyOnWrite();
        C50720e eVar5 = (C50720e) bVar2.instance;
        eVar5.f131989c = gVar2.f131998e;
        eVar5.f131987a |= 2;
        C50719d dVar3 = C50719d.EVENT_START_TIME;
        bVar2.copyOnWrite();
        C50720e eVar6 = (C50720e) bVar2.instance;
        eVar6.f131990d = dVar3.f131984e;
        eVar6.f131987a |= 4;
        bVar2.copyOnWrite();
        C50720e eVar7 = (C50720e) bVar2.instance;
        eVar7.f131987a |= 8;
        eVar7.f131991e = true;
        C50717b bVar3 = (C50717b) C50720e.f131985f.createBuilder();
        String obj = a.toString();
        bVar3.copyOnWrite();
        C50720e eVar8 = (C50720e) bVar3.instance;
        obj.getClass();
        eVar8.f131987a |= 1;
        eVar8.f131988b = obj;
        C50722g gVar3 = C50722g.UNSPECIFIED;
        bVar3.copyOnWrite();
        C50720e eVar9 = (C50720e) bVar3.instance;
        eVar9.f131989c = gVar3.f131998e;
        eVar9.f131987a |= 2;
        C50719d dVar4 = C50719d.FIXED_STRING;
        bVar3.copyOnWrite();
        C50720e eVar10 = (C50720e) bVar3.instance;
        eVar10.f131990d = dVar4.f131984e;
        eVar10.f131987a |= 4;
        C50716a aVar = (C50716a) C50723h.f131999e.createBuilder();
        String string = this.f325920a.getResources().getString(R.string.earnings_call_pre_event_title_with_dynamic_time, new Object[]{"%1$s", "%2$s"});
        aVar.copyOnWrite();
        C50723h hVar = (C50723h) aVar.instance;
        string.getClass();
        hVar.f132001a |= 1;
        hVar.f132002b = string;
        aVar.mo53428a(eVar4);
        aVar.mo53428a((C50720e) bVar2.build());
        C50722g gVar4 = C50722g.UNSPECIFIED;
        aVar.copyOnWrite();
        C50723h hVar2 = (C50723h) aVar.instance;
        hVar2.f132003c = gVar4.f131998e;
        hVar2.f132001a |= 2;
        C50723h hVar3 = (C50723h) aVar.build();
        C50716a aVar2 = (C50716a) C50723h.f131999e.createBuilder();
        String string2 = this.f325920a.getResources().getString(R.string.earnings_call_during_event_title_with_dynamic_time, new Object[]{"%1$s"});
        aVar2.copyOnWrite();
        C50723h hVar4 = (C50723h) aVar2.instance;
        string2.getClass();
        hVar4.f132001a |= 1;
        hVar4.f132002b = string2;
        aVar2.mo53428a(eVar4);
        C50722g gVar5 = C50722g.UNSPECIFIED;
        aVar2.copyOnWrite();
        C50723h hVar5 = (C50723h) aVar2.instance;
        hVar5.f132003c = gVar5.f131998e;
        hVar5.f132001a |= 2;
        C50723h hVar6 = (C50723h) aVar2.build();
        C50716a aVar3 = (C50716a) C50723h.f131999e.createBuilder();
        String string3 = this.f325920a.getResources().getString(R.string.earnings_call_title_with_static_time, new Object[]{"%1$s", "%2$s"});
        aVar3.copyOnWrite();
        C50723h hVar7 = (C50723h) aVar3.instance;
        string3.getClass();
        hVar7.f132001a |= 1;
        hVar7.f132002b = string3;
        aVar3.mo53428a(eVar4);
        aVar3.mo53428a((C50720e) bVar3.build());
        C50722g gVar6 = C50722g.UNSPECIFIED;
        aVar3.copyOnWrite();
        C50723h hVar8 = (C50723h) aVar3.instance;
        hVar8.f132003c = gVar6.f131998e;
        hVar8.f132001a |= 2;
        C50723h hVar9 = (C50723h) aVar3.build();
        C50716a aVar4 = (C50716a) C50723h.f131999e.createBuilder();
        String format = String.format(Locale.getDefault(), "%s", new Object[]{a});
        aVar4.copyOnWrite();
        C50723h hVar10 = (C50723h) aVar4.instance;
        format.getClass();
        hVar10.f132001a |= 1;
        hVar10.f132002b = format;
        C50722g gVar7 = C50722g.UNSPECIFIED;
        aVar4.copyOnWrite();
        C50723h hVar11 = (C50723h) aVar4.instance;
        hVar11.f132003c = gVar7.f131998e;
        hVar11.f132001a |= 2;
        C50723h hVar12 = (C50723h) aVar4.build();
        C50790cn cnVar = (C50790cn) C50818do.f132293H.createBuilder();
        C50801cy cyVar = (C50801cy) C50802cz.f132236g.createBuilder();
        cyVar.copyOnWrite();
        C50802cz czVar = (C50802cz) cyVar.instance;
        hVar3.getClass();
        czVar.f132239b = hVar3;
        czVar.f132238a |= 1;
        cyVar.copyOnWrite();
        C50802cz czVar2 = (C50802cz) cyVar.instance;
        hVar12.getClass();
        czVar2.f132241d = hVar12;
        czVar2.f132238a |= 4;
        cnVar.copyOnWrite();
        C50818do doVar = (C50818do) cnVar.instance;
        C50802cz czVar3 = (C50802cz) cyVar.build();
        czVar3.getClass();
        doVar.f132308e = czVar3;
        doVar.f132304a |= 8;
        C50801cy cyVar2 = (C50801cy) C50802cz.f132236g.createBuilder();
        cyVar2.copyOnWrite();
        C50802cz czVar4 = (C50802cz) cyVar2.instance;
        hVar9.getClass();
        czVar4.f132239b = hVar9;
        czVar4.f132238a |= 1;
        cyVar2.copyOnWrite();
        C50802cz czVar5 = (C50802cz) cyVar2.instance;
        hVar12.getClass();
        czVar5.f132241d = hVar12;
        czVar5.f132238a |= 4;
        cnVar.copyOnWrite();
        C50818do doVar2 = (C50818do) cnVar.instance;
        C50802cz czVar6 = (C50802cz) cyVar2.build();
        czVar6.getClass();
        doVar2.f132311h = czVar6;
        doVar2.f132304a |= 64;
        C50801cy cyVar3 = (C50801cy) C50802cz.f132236g.createBuilder();
        cyVar3.copyOnWrite();
        C50802cz czVar7 = (C50802cz) cyVar3.instance;
        hVar6.getClass();
        czVar7.f132239b = hVar6;
        czVar7.f132238a |= 1;
        cyVar3.copyOnWrite();
        C50802cz czVar8 = (C50802cz) cyVar3.instance;
        hVar12.getClass();
        czVar8.f132241d = hVar12;
        czVar8.f132238a |= 4;
        cnVar.copyOnWrite();
        C50818do doVar3 = (C50818do) cnVar.instance;
        C50802cz czVar9 = (C50802cz) cyVar3.build();
        czVar9.getClass();
        doVar3.f132309f = czVar9;
        doVar3.f132304a |= 16;
        C50801cy cyVar4 = (C50801cy) C50802cz.f132236g.createBuilder();
        cyVar4.copyOnWrite();
        C50802cz czVar10 = (C50802cz) cyVar4.instance;
        hVar9.getClass();
        czVar10.f132239b = hVar9;
        czVar10.f132238a |= 1;
        cyVar4.copyOnWrite();
        C50802cz czVar11 = (C50802cz) cyVar4.instance;
        hVar12.getClass();
        czVar11.f132241d = hVar12;
        czVar11.f132238a |= 4;
        cnVar.copyOnWrite();
        C50818do doVar4 = (C50818do) cnVar.instance;
        C50802cz czVar12 = (C50802cz) cyVar4.build();
        czVar12.getClass();
        doVar4.f132312i = czVar12;
        doVar4.f132304a |= 128;
        cnVar.copyOnWrite();
        C50818do doVar5 = (C50818do) cnVar.instance;
        djVar.getClass();
        doVar5.f132329z = djVar;
        doVar5.f132304a |= 33554432;
        cnVar.copyOnWrite();
        C50818do doVar6 = (C50818do) cnVar.instance;
        doVar6.f132304a |= 524288;
        doVar6.f132324u = true;
        return Optional.m71637of((C50818do) cnVar.build());
    }
}
