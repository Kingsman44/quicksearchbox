package com.google.android.apps.gsa.staticplugins.p7794df;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.android.apps.gsa.search.core.p6507ag.p6509b.C84486a;
import com.google.android.apps.gsa.search.core.p6513aj.p6514a.C84515a;
import com.google.android.apps.gsa.search.core.p6519al.p6672ct.C85207a;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.df.d */
/* compiled from: PG */
public final class C99518d extends C86734a implements C85207a {

    /* renamed from: a */
    public static final C59071e f278464a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.df.d");

    /* renamed from: b */
    public final Context f278465b;

    /* renamed from: c */
    public final C84515a f278466c;

    /* renamed from: f */
    private final C118561t f278467f;

    /* renamed from: g */
    private final C86034c f278468g;

    /* renamed from: h */
    private final Executor f278469h;

    /* renamed from: i */
    private final C84486a f278470i;

    /* renamed from: com.google.android.apps.gsa.staticplugins.df.d$a */
    /* compiled from: PG */
    public interface C99519a {
        /* renamed from: hj */
        C58833ax mo91479hj();
    }

    public C99518d(Context context, C84515a aVar, C118561t tVar, C86034c cVar, Executor executor, C84486a aVar2) {
        super(C118575h.WORKER_SEARCH_NOW_BOOTSTRAP, "searchnowbootstrap");
        this.f278465b = context;
        this.f278466c = aVar;
        this.f278467f = tVar;
        this.f278468g = cVar;
        this.f278469h = executor;
        this.f278470i = aVar2;
    }

    /* renamed from: a */
    public final C60870cx mo78789a() {
        Object obj;
        C59071e eVar = f278464a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SNBWorker");
        ((C59052c) ((C59052c) b).mo56372aa(32629)).mo56386p("Updating bootstrap data");
        mo78790b(0);
        C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
        long millis = TimeUnit.SECONDS.toMillis(10);
        afVar.copyOnWrite();
        C118472ag agVar = (C118472ag) afVar.instance;
        agVar.f328821a |= 2;
        agVar.f328823c = millis;
        this.f278467f.mo103754e(C118522by.UPDATE_LAUNCHER_SHORTCUT, (C118472ag) afVar.build());
        AppWidgetManager instance = AppWidgetManager.getInstance(this.f278465b);
        ComponentName componentName = new ComponentName(this.f278465b, "com.google.android.googlequicksearchbox.SearchWidgetProvider");
        int[] appWidgetIds = instance.getAppWidgetIds(componentName);
        if (!(appWidgetIds == null || appWidgetIds.length == 0)) {
            Intent intent = new Intent();
            intent.setComponent(componentName);
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("appWidgetIds", appWidgetIds);
            this.f278465b.sendBroadcast(intent);
        }
        C58480gp e = C58485gu.m89837e();
        if (this.f278470i.mo78207n() || this.f278470i.mo78205l()) {
            C59104x b2 = eVar.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "SNBWorker");
            ((C59052c) ((C59052c) b2).mo56372aa(32628)).mo56386p("Updating TNG bootstrap data");
            obj = C47633f.m84733g(this.f278468g.mo79697b()).mo51516i(new C99516b(this), this.f278469h).mo51515h(C99517c.f278463a, C60826bg.f164896a);
        } else {
            obj = C118826c.f331423b;
        }
        e.mo55395g(obj);
        return C60856cj.m92894c(e.mo55394f()).mo57334a(C99515a.f278461a, this.f278469h);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r10 = com.google.android.apps.gsa.shared.monet.p7116h.C90334c.f252282a.mo56224b();
        r10.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "MonetActivityIntentUtil");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(10767)).mo56386p("Failed to close file writer.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r10 = com.google.android.apps.gsa.shared.monet.p7116h.C90334c.f252282a.mo56224b();
        r10.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "MonetActivityIntentUtil");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(10769)).mo56386p("Failed to close file writer.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0096 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00d6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x00ed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d2 A[SYNTHETIC, Splitter:B:34:0x00d2] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e9 A[SYNTHETIC, Splitter:B:40:0x00e9] */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo78790b(long r10) {
        /*
            r9 = this;
            java.lang.String r0 = "TYPE_SEARCHNOW"
            java.lang.String r1 = "searchnow"
            java.lang.String r2 = "Failed to close file writer."
            java.lang.String r3 = "MonetActivityIntentUtil"
            com.google.android.apps.gsa.shared.s.a.a r4 = com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.f254254a
            r4 = 0
            android.content.Intent r5 = new android.content.Intent     // Catch:{ b -> 0x0035 }
            r5.<init>()     // Catch:{ b -> 0x0035 }
            android.content.Context r6 = r9.f278465b     // Catch:{ b -> 0x0035 }
            com.google.android.libraries.gsa.monet.shared.y r7 = new com.google.android.libraries.gsa.monet.shared.y     // Catch:{ b -> 0x0035 }
            r7.<init>(r1, r0)     // Catch:{ b -> 0x0035 }
            com.google.android.apps.gsa.shared.monet.p7116h.C90334c.m146890e(r6, r5, r7)     // Catch:{ b -> 0x0035 }
            com.google.android.libraries.gsa.monet.shared.InitializationData r5 = com.google.android.apps.gsa.shared.monet.p7116h.C90334c.m146887b(r5)     // Catch:{ b -> 0x0035 }
            com.google.android.libraries.gsa.monet.shared.ProtoParcelable r5 = r5.f63419b     // Catch:{ b -> 0x0035 }
            com.google.android.apps.gsa.shared.monet.b.v.g r6 = com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90291g.f252163T     // Catch:{ b -> 0x0035 }
            com.google.protobuf.eb r6 = r6.getParserForType()     // Catch:{ b -> 0x0035 }
            com.google.protobuf.ba r7 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ b -> 0x0035 }
            r8 = 1
            com.google.protobuf.bv r5 = com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b.m43557b(r5, r6, r7, r8)     // Catch:{ b -> 0x0035 }
            com.google.android.apps.gsa.shared.monet.b.v.g r5 = (com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90291g) r5     // Catch:{ b -> 0x0035 }
            goto L_0x0059
        L_0x0032:
            r10 = move-exception
            goto L_0x0100
        L_0x0035:
            r5 = move-exception
            com.google.common.f.e r6 = f278464a     // Catch:{ all -> 0x0032 }
            com.google.common.f.x r6 = r6.mo56225c()     // Catch:{ all -> 0x0032 }
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0032 }
            java.lang.String r8 = "SNBWorker"
            r6.mo56378ag(r7, r8)     // Catch:{ all -> 0x0032 }
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6     // Catch:{ all -> 0x0032 }
            com.google.common.f.x r5 = r6.mo56382g(r5)     // Catch:{ all -> 0x0032 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x0032 }
            r6 = 32626(0x7f72, float:4.5719E-41)
            com.google.common.f.x r5 = r5.mo56372aa(r6)     // Catch:{ all -> 0x0032 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x0032 }
            java.lang.String r6 = "Could not read saved SearchNowInitModel."
            r5.mo56386p(r6)     // Catch:{ all -> 0x0032 }
            r5 = r4
        L_0x0059:
            r6 = 0
            int r8 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r8 > 0) goto L_0x0063
            if (r5 == 0) goto L_0x0063
            long r10 = r5.f252196l
        L_0x0063:
            com.google.android.apps.gsa.search.core.aj.a.a r5 = r9.f278466c     // Catch:{ all -> 0x00fe }
            java.lang.String r6 = "and.gsa.launcher.icon"
            com.google.android.apps.gsa.shared.monet.b.v.g r10 = r5.mo78223f(r6, r10)     // Catch:{ all -> 0x00fe }
            com.google.android.libraries.gsa.monet.shared.ProtoParcelable r10 = com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b.m43556a(r10)     // Catch:{ all -> 0x00fe }
            android.content.Context r11 = r9.f278465b     // Catch:{ all -> 0x00fe }
            com.google.android.libraries.gsa.monet.shared.y r5 = new com.google.android.libraries.gsa.monet.shared.y     // Catch:{ all -> 0x00fe }
            r5.<init>(r1, r0)     // Catch:{ all -> 0x00fe }
            java.lang.String r0 = "monet_init_data"
            r1 = 0
            java.io.File r11 = r11.getDir(r0, r1)     // Catch:{ IOException -> 0x00af }
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x00af }
            java.lang.String r1 = com.google.android.apps.gsa.shared.monet.p7116h.C90334c.m146888c(r5)     // Catch:{ IOException -> 0x00af }
            r0.<init>(r11, r1)     // Catch:{ IOException -> 0x00af }
            java.io.FileOutputStream r11 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00af }
            r11.<init>(r0)     // Catch:{ IOException -> 0x00af }
            byte[] r10 = r10.mo28513b()     // Catch:{ IOException -> 0x00aa, all -> 0x00a7 }
            r11.write(r10)     // Catch:{ IOException -> 0x00aa, all -> 0x00a7 }
            r11.close()     // Catch:{ IOException -> 0x0096 }
            return
        L_0x0096:
            com.google.common.f.e r10 = com.google.android.apps.gsa.shared.monet.p7116h.C90334c.f252282a     // Catch:{ all -> 0x00fe }
            com.google.common.f.x r10 = r10.mo56224b()     // Catch:{ all -> 0x00fe }
            com.google.common.f.aa r11 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00fe }
            r10.mo56378ag(r11, r3)     // Catch:{ all -> 0x00fe }
            r11 = 10767(0x2a0f, float:1.5088E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r11)).mo56386p(r2)     // Catch:{ all -> 0x00fe }
            return
        L_0x00a7:
            r10 = move-exception
            r4 = r11
            goto L_0x00e7
        L_0x00aa:
            r10 = move-exception
            r4 = r11
            goto L_0x00b0
        L_0x00ad:
            r10 = move-exception
            goto L_0x00e7
        L_0x00af:
            r10 = move-exception
        L_0x00b0:
            com.google.common.f.e r11 = com.google.android.apps.gsa.shared.monet.p7116h.C90334c.f252282a     // Catch:{ all -> 0x00ad }
            com.google.common.f.x r11 = r11.mo56226d()     // Catch:{ all -> 0x00ad }
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00ad }
            r11.mo56378ag(r0, r3)     // Catch:{ all -> 0x00ad }
            com.google.common.f.c r11 = (com.google.common.p4526f.C59052c) r11     // Catch:{ all -> 0x00ad }
            com.google.common.f.x r10 = r11.mo56382g(r10)     // Catch:{ all -> 0x00ad }
            com.google.common.f.c r10 = (com.google.common.p4526f.C59052c) r10     // Catch:{ all -> 0x00ad }
            r11 = 10768(0x2a10, float:1.5089E-41)
            com.google.common.f.x r10 = r10.mo56372aa(r11)     // Catch:{ all -> 0x00ad }
            com.google.common.f.c r10 = (com.google.common.p4526f.C59052c) r10     // Catch:{ all -> 0x00ad }
            java.lang.String r11 = "Failed to write initialization data to disk"
            r10.mo56386p(r11)     // Catch:{ all -> 0x00ad }
            if (r4 == 0) goto L_0x00e6
            r4.close()     // Catch:{ IOException -> 0x00d6 }
            return
        L_0x00d6:
            com.google.common.f.e r10 = com.google.android.apps.gsa.shared.monet.p7116h.C90334c.f252282a     // Catch:{ all -> 0x00fe }
            com.google.common.f.x r10 = r10.mo56224b()     // Catch:{ all -> 0x00fe }
            com.google.common.f.aa r11 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00fe }
            r10.mo56378ag(r11, r3)     // Catch:{ all -> 0x00fe }
            r11 = 10769(0x2a11, float:1.509E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r11)).mo56386p(r2)     // Catch:{ all -> 0x00fe }
        L_0x00e6:
            return
        L_0x00e7:
            if (r4 == 0) goto L_0x00fd
            r4.close()     // Catch:{ IOException -> 0x00ed }
            goto L_0x00fd
        L_0x00ed:
            com.google.common.f.e r11 = com.google.android.apps.gsa.shared.monet.p7116h.C90334c.f252282a     // Catch:{ all -> 0x00fe }
            com.google.common.f.x r11 = r11.mo56224b()     // Catch:{ all -> 0x00fe }
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00fe }
            r11.mo56378ag(r0, r3)     // Catch:{ all -> 0x00fe }
            r0 = 10770(0x2a12, float:1.5092E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56372aa(r0)).mo56386p(r2)     // Catch:{ all -> 0x00fe }
        L_0x00fd:
            throw r10     // Catch:{ all -> 0x00fe }
        L_0x00fe:
            r10 = move-exception
            throw r10
        L_0x0100:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7794df.C99518d.mo78790b(long):void");
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("SearchNowBootstrapWorker");
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }
}
