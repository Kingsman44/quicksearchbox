package com.google.android.apps.gsa.search.core.p6511ah;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.apps.gsa.configuration.C74464a;
import com.google.android.apps.gsa.hotword.c.z;
import com.google.android.apps.gsa.search.core.C86140k;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.speech.microdetection.adapter.C92518d;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118551j;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2878f.C37188a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58847bk;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60887da;
import dagger.C68214a;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.search.core.ah.c */
/* compiled from: PG */
public final class C84496c implements C84506m {

    /* renamed from: a */
    public final Context f229959a;

    /* renamed from: b */
    public final C86124t f229960b;

    /* renamed from: c */
    public final C92518d f229961c;

    /* renamed from: d */
    public final C58833ax f229962d;

    /* renamed from: e */
    private final C69464a f229963e;

    /* renamed from: f */
    private final C90931ca f229964f;

    /* renamed from: g */
    private final C74464a f229965g;

    /* renamed from: h */
    private final C118561t f229966h;

    /* renamed from: i */
    private final C68214a f229967i;

    /* renamed from: j */
    private final C60887da f229968j;

    /* renamed from: k */
    private final C86140k f229969k;

    /* renamed from: l */
    private final C58833ax f229970l;

    /* renamed from: m */
    private final C68214a f229971m;

    /* renamed from: n */
    private final C58833ax f229972n;

    public C84496c(Context context, C69464a aVar, C90931ca caVar, C74464a aVar2, C86124t tVar, C118561t tVar2, C68214a aVar3, C60887da daVar, C86140k kVar, C58833ax axVar, C92518d dVar, C58833ax axVar2, C68214a aVar4, C58833ax axVar3) {
        this.f229959a = context;
        this.f229963e = aVar;
        this.f229964f = caVar;
        this.f229965g = aVar2;
        this.f229960b = tVar;
        this.f229966h = tVar2;
        this.f229967i = aVar3;
        this.f229968j = daVar;
        this.f229969k = kVar;
        this.f229970l = axVar;
        this.f229961c = dVar;
        this.f229962d = axVar2;
        this.f229971m = aVar4;
        this.f229972n = axVar3;
    }

    /* renamed from: a */
    public final void mo78211a(C84505l lVar) {
        synchronized (C84496c.class) {
            int a = C84504k.m135127a(lVar.f229982b);
            if (a != 0) {
                if (a == 2) {
                    this.f229966h.mo103751b(C118522by.UPDATE_GSERVICES_CONFIG, C118472ag.f328819i);
                    C118561t tVar = this.f229966h;
                    C118522by byVar = C118522by.FETCH_OPT_IN_STATUSES;
                    C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
                    afVar.copyOnWrite();
                    C118472ag agVar = (C118472ag) afVar.instance;
                    agVar.f328824d = 1;
                    agVar.f328821a |= 4;
                    tVar.mo103754e(byVar, (C118472ag) afVar.build());
                    this.f229969k.mo79786a(0);
                    this.f229966h.mo103754e(C118522by.REFRESH_NOW_CONFIGURATION, C118472ag.f328819i);
                    this.f229966h.mo103754e(C118522by.PREDICTIVE_CARD_PREFERENCES_SYNC, C118472ag.f328819i);
                    this.f229966h.mo103752c(C118522by.SEND_GSA_HOME_REQUEST);
                    this.f229965g.mo70781b();
                    ((C118551j) this.f229967i.mo27525b()).mo103747a(C118522by.REFRESH_AUTH_TOKENS);
                    this.f229966h.mo103754e(C118522by.REFRESH_SEARCH_COOKIES, C118472ag.f328819i);
                    this.f229966h.mo103754e(C118522by.SYNC_GEL_SHARED_PREFS, C118472ag.f328819i);
                    ((C89859i) this.f229971m.mo27525b()).mo83702b(C89849ae.SILENT_ENROLLMENT_START_APP_UPGRADE);
                    this.f229966h.mo103754e(C118522by.SPEAKERID_SILENT_ENROLLMENT, C118472ag.f328819i);
                    ((C37215b) ((C58847bk) this.f229972n).f156646a).mo19974a(C37188a.f98368l);
                    C60856cj.m92911t(((z) ((C58847bk) this.f229970l).f156646a).a(), C47810es.m84974n(new C84494a(this)), this.f229968j);
                    SharedPreferences.Editor edit = ((SharedPreferences) this.f229963e.mo17428b()).edit();
                    Object systemService = this.f229959a.getSystemService("activity");
                    int i = -1;
                    if (systemService instanceof ActivityManager) {
                        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                        ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
                        long j = memoryInfo.totalMem / 1048576;
                        if (j > 0) {
                            if (j <= 2147483647L) {
                                i = (int) j;
                            }
                        }
                    }
                    edit.putInt("ram_mb", i).apply();
                    this.f229964f.mo85139d(new C84495b(this));
                }
            }
        }
    }
}
