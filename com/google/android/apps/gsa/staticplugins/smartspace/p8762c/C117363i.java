package com.google.android.apps.gsa.staticplugins.smartspace.p8762c;

import com.google.android.apps.gsa.opa.smartspace.C83802r;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3886c.C50706ar;
import com.google.assistant.p3886c.C50738bc;
import com.google.assistant.p3886c.C50790cn;
import com.google.assistant.p3886c.C50801cy;
import com.google.assistant.p3886c.C50802cz;
import com.google.assistant.p3886c.C50804da;
import com.google.assistant.p3886c.C50806dc;
import com.google.assistant.p3886c.C50808de;
import com.google.assistant.p3886c.C50810dg;
import com.google.assistant.p3886c.C50811dh;
import com.google.assistant.p3886c.C50818do;
import com.google.assistant.p3886c.C50840l;
import com.google.assistant.p3886c.p3888b.C50716a;
import com.google.assistant.p3886c.p3888b.C50722g;
import com.google.assistant.p3886c.p3888b.C50723h;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.regex.Pattern;

/* renamed from: com.google.android.apps.gsa.staticplugins.smartspace.c.i */
/* compiled from: PG */
public final /* synthetic */ class C117363i implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C117364j f325805a;

    /* renamed from: b */
    public final /* synthetic */ C83802r f325806b;

    public /* synthetic */ C117363i(C117364j jVar, C83802r rVar) {
        this.f325805a = jVar;
        this.f325806b = rVar;
    }

    public final Object apply(Object obj) {
        Object obj2;
        C117364j jVar = this.f325805a;
        C83802r rVar = this.f325806b;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            ((C58970a) ((C58970a) jVar.f325807a.mo56226d()).mo56372aa(33092)).mo56386p("convertSmartspaceCard(): null card");
            return axVar;
        }
        C50738bc bcVar = (C50738bc) rVar.mo77094d().mo56111f();
        if (bcVar == null) {
            ((C58970a) ((C58970a) jVar.f325807a.mo56226d()).mo56372aa(33091)).mo56386p("convertSmartspaceCard(): null chip");
            return axVar;
        }
        ((C58970a) ((C58970a) jVar.f325807a.mo56224b()).mo56372aa(33090)).mo56386p("convertSmartspaceCard(): start converting");
        C50790cn cnVar = (C50790cn) ((C50818do) axVar.mo56107c()).toBuilder();
        if (jVar.f325809c.mo79746e(C90017bw.f248041r)) {
            C50804da daVar = (C50804da) C50811dh.f132269h.createBuilder();
            daVar.copyOnWrite();
            C50811dh dhVar = (C50811dh) daVar.instance;
            dhVar.f132271a |= 1;
            dhVar.f132272b = "com.google.android.googlequicksearchbox";
            daVar.copyOnWrite();
            C50811dh dhVar2 = (C50811dh) daVar.instance;
            dhVar2.f132271a |= 2;
            dhVar2.f132273c = "morris2.new.drivingscreen.NOTIFICATION_CHANNEL";
            C50808de deVar = C50808de.NOTIFICATION_TITLE;
            daVar.copyOnWrite();
            C50811dh dhVar3 = (C50811dh) daVar.instance;
            dhVar3.f132274d = deVar.f132262d;
            dhVar3.f132271a |= 4;
            String quote = Pattern.quote(jVar.f325808b.getString(R.string.drive_mode_dedup_string));
            daVar.copyOnWrite();
            C50811dh dhVar4 = (C50811dh) daVar.instance;
            quote.getClass();
            dhVar4.f132271a |= 8;
            dhVar4.f132275e = quote;
            C50810dg dgVar = C50810dg.CONTAINS_MATCH;
            daVar.copyOnWrite();
            C50811dh dhVar5 = (C50811dh) daVar.instance;
            dhVar5.f132276f = dgVar.f132268d;
            dhVar5.f132271a |= 16;
            C50806dc dcVar = C50806dc.HIDE;
            daVar.copyOnWrite();
            C50811dh dhVar6 = (C50811dh) daVar.instance;
            dhVar6.f132277g = dcVar.f132256d;
            dhVar6.f132271a |= 32;
            C50811dh dhVar7 = (C50811dh) daVar.build();
            cnVar.copyOnWrite();
            C50818do doVar = (C50818do) cnVar.instance;
            dhVar7.getClass();
            doVar.f132296B = dhVar7;
            doVar.f132304a |= 134217728;
        }
        C50801cy cyVar = (C50801cy) C50802cz.f132236g.createBuilder();
        C50716a aVar = (C50716a) C50723h.f131999e.createBuilder();
        String str = bcVar.f132037d;
        aVar.copyOnWrite();
        C50723h hVar = (C50723h) aVar.instance;
        str.getClass();
        hVar.f132001a |= 1;
        hVar.f132002b = str;
        C50722g gVar = C50722g.UNSPECIFIED;
        aVar.copyOnWrite();
        C50723h hVar2 = (C50723h) aVar.instance;
        hVar2.f132003c = gVar.f131998e;
        hVar2.f132001a |= 2;
        cyVar.copyOnWrite();
        C50802cz czVar = (C50802cz) cyVar.instance;
        C50723h hVar3 = (C50723h) aVar.build();
        hVar3.getClass();
        czVar.f132239b = hVar3;
        czVar.f132238a |= 1;
        C50716a aVar2 = (C50716a) C50723h.f131999e.createBuilder();
        C50706ar arVar = bcVar.f132044k;
        if (arVar == null) {
            arVar = C50706ar.f131960a;
        }
        C62940bt r3 = C62942bv.checkIsLite(C50840l.f132374d);
        arVar.mo58887l(r3);
        Object l = arVar.f169962ag.mo58854l(r3.f169971d);
        if (l == null) {
            obj2 = r3.f169969b;
        } else {
            obj2 = r3.mo58889c(l);
        }
        String str2 = ((C50840l) obj2).f132377b;
        aVar2.copyOnWrite();
        C50723h hVar4 = (C50723h) aVar2.instance;
        str2.getClass();
        hVar4.f132001a |= 1;
        hVar4.f132002b = str2;
        C50722g gVar2 = C50722g.UNSPECIFIED;
        aVar2.copyOnWrite();
        C50723h hVar5 = (C50723h) aVar2.instance;
        hVar5.f132003c = gVar2.f131998e;
        hVar5.f132001a |= 2;
        cyVar.copyOnWrite();
        C50802cz czVar2 = (C50802cz) cyVar.instance;
        C50723h hVar6 = (C50723h) aVar2.build();
        hVar6.getClass();
        czVar2.f132241d = hVar6;
        czVar2.f132238a |= 4;
        C50802cz czVar3 = (C50802cz) cyVar.build();
        cnVar.copyOnWrite();
        C50818do doVar2 = (C50818do) cnVar.instance;
        czVar3.getClass();
        doVar2.f132309f = czVar3;
        doVar2.f132304a |= 16;
        return C58833ax.m90834k((C50818do) cnVar.build());
    }
}
