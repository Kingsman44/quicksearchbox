package com.google.android.apps.gsa.staticplugins.bisto.p7459aa.p7463d;

import com.google.android.apps.gsa.p6486s.C84272l;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.opa.audio.C107616a;
import com.google.android.apps.gsa.staticplugins.opa.audio.C107617b;
import com.google.assistant.p3897e.p3921j.C52170hv;
import com.google.assistant.p3897e.p3921j.C52171hw;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.common.base.C58833ax;
import com.google.common.base.C58847bk;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.aa.d.e */
/* compiled from: PG */
public final /* synthetic */ class C94781e implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C94783g f265017a;

    /* renamed from: b */
    public final /* synthetic */ C52176ia f265018b;

    public /* synthetic */ C94781e(C94783g gVar, C52176ia iaVar) {
        this.f265017a = gVar;
        this.f265018b = iaVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C94783g gVar = this.f265017a;
        C52176ia iaVar = this.f265018b;
        C84272l lVar = (C84272l) obj;
        gVar.f265026g = iaVar;
        gVar.f265027h = iaVar.f136916d;
        long longValue = ((Long) ((C58847bk) C58833ax.m90834k(Long.valueOf(iaVar.f136917e))).f156646a).longValue();
        C107616a aVar = (C107616a) C107617b.f299379e.createBuilder();
        aVar.copyOnWrite();
        C107617b bVar = (C107617b) aVar.instance;
        bVar.f299381a |= 2;
        bVar.f299383c = longValue;
        aVar.copyOnWrite();
        C107617b bVar2 = (C107617b) aVar.instance;
        bVar2.f299381a |= 1;
        bVar2.f299382b = Long.MAX_VALUE;
        C52176ia iaVar2 = gVar.f265026g;
        if (iaVar2 != null && gVar.f265027h < iaVar2.f136914b.size()) {
            C52170hv hvVar = (C52170hv) gVar.f265026g.toBuilder();
            int i = gVar.f265027h;
            hvVar.copyOnWrite();
            C52176ia iaVar3 = (C52176ia) hvVar.instance;
            iaVar3.f136913a |= 8;
            iaVar3.f136916d = i;
            int i2 = gVar.f265027h;
            C52171hw hwVar = (C52171hw) hvVar.mo53805a(i2).toBuilder();
            hwVar.copyOnWrite();
            C52174hz hzVar = (C52174hz) hwVar.instance;
            hzVar.f136894a |= 16;
            hzVar.f136898e = 0;
            hvVar.mo53810f(i2, hwVar);
            gVar.f265026g = (C52176ia) hvVar.build();
            C52176ia iaVar4 = gVar.f265026g;
            aVar.copyOnWrite();
            C107617b bVar3 = (C107617b) aVar.instance;
            iaVar4.getClass();
            bVar3.f299384d = iaVar4;
            bVar3.f299381a |= 4;
        }
        C86337q b = ((C86338r) gVar.f265022c.mo27525b()).mo80076b();
        b.mo80068c("opa_active_media_session_data_".concat(String.valueOf(((C86054o) gVar.f265023d.mo27525b()).mo79659F())), ((C107617b) aVar.build()).toByteArray());
        b.apply();
        gVar.mo88606a();
    }
}
