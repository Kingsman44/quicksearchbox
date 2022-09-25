package com.google.android.apps.gsa.staticplugins.smartspace.p8762c;

import com.google.android.apps.gsa.shared.p7066m.C89985ax;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3886c.C50790cn;
import com.google.assistant.p3886c.C50801cy;
import com.google.assistant.p3886c.C50802cz;
import com.google.assistant.p3886c.C50818do;
import com.google.assistant.p3886c.p3888b.C50716a;
import com.google.assistant.p3886c.p3888b.C50722g;
import com.google.assistant.p3886c.p3888b.C50723h;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.apps.gsa.staticplugins.smartspace.c.o */
/* compiled from: PG */
public final /* synthetic */ class C117369o implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C117370p f325826a;

    public /* synthetic */ C117369o(C117370p pVar) {
        this.f325826a = pVar;
    }

    public final Object apply(Object obj) {
        C117370p pVar = this.f325826a;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            ((C58970a) ((C58970a) pVar.f325829c.mo56226d()).mo56372aa(33098)).mo56386p("Weather basic card is absent");
            return axVar;
        }
        C50818do doVar = (C50818do) axVar.mo56107c();
        C50802cz czVar = doVar.f132309f;
        if (czVar == null) {
            czVar = C50802cz.f132236g;
        }
        C50723h hVar = czVar.f132239b;
        if (hVar == null) {
            hVar = C50723h.f131999e;
        }
        String str = hVar.f132002b;
        if (!doVar.f132297C.isEmpty() && pVar.f325828b.mo79746e(C89985ax.f246718az)) {
            str = pVar.f325827a.getString(R.string.temperature_display_city, new Object[]{str, doVar.f132297C});
        }
        C50716a aVar = (C50716a) C50723h.f131999e.createBuilder();
        aVar.copyOnWrite();
        C50723h hVar2 = (C50723h) aVar.instance;
        str.getClass();
        hVar2.f132001a |= 1;
        hVar2.f132002b = str;
        C50722g gVar = C50722g.END;
        aVar.copyOnWrite();
        C50723h hVar3 = (C50723h) aVar.instance;
        hVar3.f132003c = gVar.f131998e;
        hVar3.f132001a |= 2;
        C50723h hVar4 = (C50723h) aVar.build();
        C50790cn cnVar = (C50790cn) doVar.toBuilder();
        C50802cz czVar2 = doVar.f132309f;
        if (czVar2 == null) {
            czVar2 = C50802cz.f132236g;
        }
        C50801cy cyVar = (C50801cy) czVar2.toBuilder();
        cyVar.copyOnWrite();
        C50802cz czVar3 = (C50802cz) cyVar.instance;
        hVar4.getClass();
        czVar3.f132239b = hVar4;
        czVar3.f132238a |= 1;
        C50802cz czVar4 = (C50802cz) cyVar.build();
        cnVar.copyOnWrite();
        C50818do doVar2 = (C50818do) cnVar.instance;
        czVar4.getClass();
        doVar2.f132309f = czVar4;
        doVar2.f132304a |= 16;
        return C58833ax.m90834k(pVar.f325830d.mo110204b((C50818do) cnVar.build()).mo110198a());
    }
}
