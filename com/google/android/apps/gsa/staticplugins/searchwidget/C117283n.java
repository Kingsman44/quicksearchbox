package com.google.android.apps.gsa.staticplugins.searchwidget;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.n */
/* compiled from: PG */
public final /* synthetic */ class C117283n implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C117289t f325561a;

    public /* synthetic */ C117283n(C117289t tVar) {
        this.f325561a = tVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C117289t tVar = this.f325561a;
        Throwable th = (Throwable) obj;
        tVar.mo103237g(C89849ae.WIDGET_DOODLE_DOWNLOAD_FAIL);
        C118522by byVar = C118522by.DOODLE_DATA_UPDATE_TASK;
        Optional c = tVar.mo103233c();
        int i = tVar.f325574g.getInt("widget_doodle_download_retry_count", 0);
        C86337q b = tVar.f325574g.mo80076b();
        b.mo80070e("widget_doodle_download_retry_count", i + 1);
        b.apply();
        long min = Math.min(C117289t.f325568c * ((long) Math.pow(2.0d, (double) i)), C117289t.f325569d);
        if (!c.isPresent() || min <= ((Long) c.get()).longValue()) {
            C117289t.m194912i();
            C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
            afVar.copyOnWrite();
            C118472ag agVar = (C118472ag) afVar.instance;
            agVar.f328821a |= 1;
            agVar.f328822b = min;
            long j = C117289t.f325566a;
            afVar.copyOnWrite();
            C118472ag agVar2 = (C118472ag) afVar.instance;
            agVar2.f328821a |= 2;
            agVar2.f328823c = j;
            afVar.copyOnWrite();
            C118472ag agVar3 = (C118472ag) afVar.instance;
            agVar3.f328824d = 1;
            agVar3.f328821a |= 4;
            ((C118561t) tVar.f325576i.mo27525b()).mo103754e(byVar, (C118472ag) afVar.build());
        } else {
            C58976aa aaVar = C58975e.f156826a;
        }
        return C118826c.f331422a;
    }
}
