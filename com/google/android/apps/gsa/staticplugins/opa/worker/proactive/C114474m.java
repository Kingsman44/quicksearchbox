package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3897e.p3921j.aax;
import com.google.assistant.p3897e.p3921j.abc;
import com.google.common.base.C58817ah;
import com.google.p3717aq.p3718a.p3719a.C47867a;
import com.google.p3717aq.p3718a.p3719a.C47868b;
import com.google.p3717aq.p3718a.p3719a.C47872f;
import com.google.p3717aq.p3718a.p3719a.C47873g;
import com.google.p3717aq.p3718a.p3719a.C47874h;
import com.google.p3717aq.p3718a.p3719a.C47875i;
import com.google.p3717aq.p3718a.p3719a.C47885s;
import com.google.p3717aq.p3718a.p3719a.C47886t;
import com.google.p3717aq.p3718a.p3719a.C47887u;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.m */
/* compiled from: PG */
public final /* synthetic */ class C114474m implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C114476o f317426a;

    /* renamed from: b */
    public final /* synthetic */ aax f317427b;

    public /* synthetic */ C114474m(C114476o oVar, aax aax) {
        this.f317426a = oVar;
        this.f317427b = aax;
    }

    public final Object apply(Object obj) {
        C114476o oVar = this.f317426a;
        aax aax = this.f317427b;
        if (!((Boolean) obj).booleanValue()) {
            C47887u uVar = ((abc) aax.instance).f134698e;
            if (uVar == null) {
                uVar = C47887u.f123976l;
            }
            C47872f fVar = (C47872f) uVar.toBuilder();
            fVar.copyOnWrite();
            ((C47887u) fVar.instance).f123986i = C47887u.emptyProtobufList();
            C47873g gVar = (C47873g) C47875i.f123945g.createBuilder();
            String string = oVar.f317434g.getString(R.string.opa_notification_useful_button_title);
            gVar.copyOnWrite();
            C47875i iVar = (C47875i) gVar.instance;
            string.getClass();
            iVar.f123947a = 1;
            iVar.f123948b = string;
            C47868b bVar = ((C47887u) fVar.instance).f123984g;
            if (bVar == null) {
                bVar = C47868b.f123936f;
            }
            gVar.copyOnWrite();
            bVar.getClass();
            ((C47875i) gVar.instance).f123950d = bVar;
            gVar.copyOnWrite();
            ((C47875i) gVar.instance).f123949c = 1;
            gVar.copyOnWrite();
            ((C47875i) gVar.instance).f123951e = C47874h.m85091a(3);
            gVar.copyOnWrite();
            ((C47875i) gVar.instance).f123952f = 47412;
            fVar.mo51702a(gVar);
            C47873g gVar2 = (C47873g) C47875i.f123945g.createBuilder();
            String string2 = oVar.f317434g.getString(R.string.opa_notification_not_useful_button_title);
            gVar2.copyOnWrite();
            C47875i iVar2 = (C47875i) gVar2.instance;
            string2.getClass();
            iVar2.f123947a = 1;
            iVar2.f123948b = string2;
            C47867a aVar = (C47867a) C47868b.f123936f.createBuilder();
            C47885s sVar = (C47885s) C47886t.f123973b.createBuilder();
            sVar.copyOnWrite();
            ((C47886t) sVar.instance).f123975a = "EMPTY";
            aVar.copyOnWrite();
            C47868b bVar2 = (C47868b) aVar.instance;
            C47886t tVar = (C47886t) sVar.build();
            tVar.getClass();
            bVar2.f123939b = tVar;
            bVar2.f123938a = 4;
            gVar2.copyOnWrite();
            C47868b bVar3 = (C47868b) aVar.build();
            bVar3.getClass();
            ((C47875i) gVar2.instance).f123950d = bVar3;
            gVar2.copyOnWrite();
            ((C47875i) gVar2.instance).f123949c = 2;
            gVar2.copyOnWrite();
            ((C47875i) gVar2.instance).f123951e = C47874h.m85091a(4);
            gVar2.copyOnWrite();
            ((C47875i) gVar2.instance).f123952f = 47413;
            fVar.mo51702a(gVar2);
            C47887u uVar2 = (C47887u) fVar.build();
            aax.copyOnWrite();
            abc abc = (abc) aax.instance;
            uVar2.getClass();
            abc.f134698e = uVar2;
            abc.f134694a |= 2;
        }
        return aax;
    }
}
