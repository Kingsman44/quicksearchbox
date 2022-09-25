package com.google.android.apps.gsa.staticplugins.searchwidget;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p7066m.C89985ax;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.m */
/* compiled from: PG */
public final /* synthetic */ class C117282m implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C117289t f325560a;

    public /* synthetic */ C117282m(C117289t tVar) {
        this.f325560a = tVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C117289t tVar = this.f325560a;
        C118826c cVar = (C118826c) obj;
        long millis = Duration.ofMinutes(tVar.f325573f.mo79743a(C89985ax.f246691aR)).toMillis();
        Optional c = tVar.mo103233c();
        if (c.isEmpty() || millis > ((Long) c.get()).longValue()) {
            C58976aa aaVar = C58975e.f156826a;
        } else {
            C117289t.m194912i();
            C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
            afVar.copyOnWrite();
            C118472ag agVar = (C118472ag) afVar.instance;
            agVar.f328821a |= 1;
            agVar.f328822b = millis;
            long j = C117289t.f325566a;
            afVar.copyOnWrite();
            C118472ag agVar2 = (C118472ag) afVar.instance;
            agVar2.f328821a |= 2;
            agVar2.f328823c = j;
            afVar.copyOnWrite();
            C118472ag agVar3 = (C118472ag) afVar.instance;
            agVar3.f328824d = 1;
            agVar3.f328821a |= 4;
            ((C118561t) tVar.f325576i.mo27525b()).mo103754e(C118522by.DOODLE_DATA_UPDATE_TASK, (C118472ag) afVar.build());
        }
        Optional c2 = tVar.mo103233c();
        if (c2.isPresent()) {
            ((Long) c2.get()).longValue();
            C117289t.m194912i();
            C118471af afVar2 = (C118471af) C118472ag.f328819i.createBuilder();
            long longValue = ((Long) c2.get()).longValue();
            afVar2.copyOnWrite();
            C118472ag agVar4 = (C118472ag) afVar2.instance;
            agVar4.f328821a = 1 | agVar4.f328821a;
            agVar4.f328822b = longValue;
            long j2 = C117289t.f325570e;
            afVar2.copyOnWrite();
            C118472ag agVar5 = (C118472ag) afVar2.instance;
            agVar5.f328821a |= 2;
            agVar5.f328823c = j2;
            afVar2.copyOnWrite();
            C118472ag agVar6 = (C118472ag) afVar2.instance;
            agVar6.f328824d = 0;
            agVar6.f328821a |= 4;
            ((C118561t) tVar.f325576i.mo27525b()).mo103754e(C118522by.DOODLE_EXPIRATION_TASK, (C118472ag) afVar2.build());
        } else {
            C58976aa aaVar2 = C58975e.f156826a;
        }
        tVar.mo103238h("widget_doodle_download_retry_count");
        tVar.mo103237g(C89849ae.WIDGET_DOODLE_DOWNLOAD_SUCCESS);
        return C118826c.f331422a;
    }
}
