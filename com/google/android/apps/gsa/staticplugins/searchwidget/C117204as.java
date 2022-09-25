package com.google.android.apps.gsa.staticplugins.searchwidget;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.databinding.C0118a;
import android.os.Bundle;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p6995aq.C89257aa;
import com.google.android.apps.gsa.shared.p6995aq.C89258ab;
import com.google.android.apps.gsa.shared.p6995aq.C89267j;
import com.google.android.apps.gsa.shared.p6995aq.C89283z;
import com.google.android.apps.gsa.shared.p7007ay.C89331a;
import com.google.android.apps.gsa.shared.p7066m.C89985ax;
import com.google.android.apps.gsa.staticplugins.searchwidget.p8757d.C117271h;
import com.google.android.apps.gsa.staticplugins.searchwidget.p8757d.C117273j;
import com.google.android.apps.search.googleapp.searchwidget.C139032j;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59661bo;
import com.google.common.p4552o.C59663bq;
import com.google.common.p4552o.C59687cb;
import com.google.common.p4552o.C60462qy;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import dagger.C68214a;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.as */
/* compiled from: PG */
public final class C117204as {

    /* renamed from: a */
    public static final C59071e f325347a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.searchwidget.as");

    /* renamed from: b */
    public final C117241bi f325348b;

    /* renamed from: c */
    public final C86338r f325349c;

    /* renamed from: d */
    public final C86124t f325350d;

    /* renamed from: e */
    public final C89331a f325351e;

    /* renamed from: f */
    public final C117293x f325352f;

    /* renamed from: g */
    public final C68214a f325353g;

    /* renamed from: h */
    public final C117233ba f325354h;

    /* renamed from: i */
    public final C89257aa f325355i;

    /* renamed from: j */
    public final C21370a f325356j;

    /* renamed from: k */
    public final C42876ab f325357k;

    /* renamed from: l */
    public final C68214a f325358l;

    /* renamed from: m */
    public final C68214a f325359m;

    /* renamed from: n */
    public final C68214a f325360n;

    /* renamed from: o */
    public final C84474e f325361o;

    /* renamed from: p */
    public final C117255bw f325362p;

    /* renamed from: q */
    public final C139032j f325363q;

    /* renamed from: r */
    private final C117239bg f325364r;

    /* renamed from: s */
    private final C117271h f325365s;

    /* renamed from: t */
    private final C117273j f325366t;

    public C117204as(C117241bi biVar, C86338r rVar, C86124t tVar, C89331a aVar, C117239bg bgVar, C117293x xVar, C68214a aVar2, C117233ba baVar, C89257aa aaVar, C21370a aVar3, C42876ab abVar, C117271h hVar, C117273j jVar, C68214a aVar4, C68214a aVar5, C68214a aVar6, C84474e eVar, C117255bw bwVar, C139032j jVar2) {
        this.f325348b = biVar;
        this.f325349c = rVar;
        this.f325350d = tVar;
        this.f325351e = aVar;
        this.f325364r = bgVar;
        this.f325352f = xVar;
        this.f325353g = aVar2;
        this.f325354h = baVar;
        this.f325355i = aaVar;
        this.f325356j = aVar3;
        this.f325357k = abVar;
        this.f325365s = hVar;
        this.f325366t = jVar;
        this.f325358l = aVar4;
        this.f325359m = aVar5;
        this.f325360n = aVar6;
        this.f325361o = eVar;
        this.f325362p = bwVar;
        this.f325363q = jVar2;
    }

    /* renamed from: k */
    static boolean m194763k(Bundle bundle) {
        if (!m194764l(bundle) && (bundle.getInt("appWidgetCategory") & 4) == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    static boolean m194764l(Bundle bundle) {
        return "com.google.android.googlequicksearchbox".equals(bundle.getString("attached-launcher-identifier", BuildConfig.FLAVOR));
    }

    /* renamed from: m */
    static boolean m194765m(Bundle bundle) {
        if (!m194764l(bundle) && (bundle.getInt("appWidgetCategory") & 1) != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final C89267j mo103182a() {
        byte[] e = this.f325349c.mo80079e("search_widget_hint_text_update_context", (byte[]) null);
        if (e == null) {
            return null;
        }
        try {
            return (C89267j) C62942bv.parseFrom((C62942bv) C89267j.f242039f, e, C62921ba.m95368a());
        } catch (C62974ct unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final C60870cx mo103183b(int[] iArr, C60462qy qyVar) {
        if (this.f325361o.mo78061F()) {
            return C60866ct.f164955a;
        }
        int[] r = this.f325355i.mo83225r(iArr);
        if (r.length == 0) {
            ((C59052c) ((C59052c) f325347a.mo56226d()).mo56372aa(32712)).mo56386p("No loggable search widgets available");
            return C60866ct.f164955a;
        }
        C89283z a = this.f325348b.mo103214a();
        C117233ba baVar = this.f325354h;
        if (qyVar == C60462qy.UPDATED || qyVar == C60462qy.UPDATED_OPTIONS_CHANGED) {
            return baVar.f325430g.mo19399b(new C117209ax(baVar, qyVar, r, a));
        }
        ((C59052c) ((C59052c) C117233ba.f325424a.mo56225c()).mo56372aa(32738)).mo56389s("handleInfrequentLifecycleEvent: cannot handle lifecycleEventType=%s.", qyVar);
        return C60866ct.f164955a;
    }

    /* renamed from: c */
    public final C60870cx mo103184c(Context context, boolean z) {
        C60870cx cxVar;
        C117271h hVar = this.f325365s;
        C89257aa aaVar = hVar.f325528b;
        aaVar.mo83219k();
        aaVar.mo83218j();
        if (!hVar.f325528b.mo83220l()) {
            cxVar = C60866ct.f164955a;
        } else if (!hVar.f325528b.mo83221m()) {
            cxVar = hVar.mo103222a(hVar.f325528b.mo83217h());
        } else {
            cxVar = C60866ct.f164955a;
        }
        return C60922j.m93045h(cxVar, new C117195aj(this, z, context), (Executor) this.f325360n.mo27525b());
    }

    /* renamed from: d */
    public final C60870cx mo103185d(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        int length;
        C59071e eVar = f325347a;
        C0118a.m108p(eVar.mo56224b(), "SearchWidget:onUpdate", 32724, C58975e.f156826a, "SearchWidgetFlow");
        if (iArr != null && (length = iArr.length) > 1) {
            C59052c cVar = (C59052c) eVar.mo56226d();
            cVar.mo56378ag(C58975e.f156826a, "SearchWidgetFlow");
            ((C59052c) cVar.mo56372aa(32725)).mo56387q("SearchWidget:onUpdate:%d widget ids exist", length);
        }
        C60870cx e = mo103186e(context, appWidgetManager, iArr, false);
        C60870cx b = mo103183b(iArr, C60462qy.UPDATED);
        C89267j a = mo103182a();
        if (a != null) {
            long a2 = this.f325350d.mo79743a(C89985ax.f246664R);
            long seconds = TimeUnit.MILLISECONDS.toSeconds(this.f325356j.mo26870b()) - this.f325349c.getLong("search_widget_hint_text_update_timestamp", 0);
            if (seconds >= a2 || ((a.f242041a & 8) != 0 && seconds > ((long) a.f242045e))) {
                this.f325352f.mo103248k(C58485gu.m89846n(BuildConfig.FLAVOR), C58485gu.m89846n(BuildConfig.FLAVOR));
                mo103190i();
            }
        }
        return C60856cj.m92895d(e, b).mo57334a(C117198am.f325336a, (Executor) this.f325360n.mo27525b());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0182, code lost:
        if (r0 < r3) goto L_0x0186;
     */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x013c A[SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo103186e(android.content.Context r23, android.appwidget.AppWidgetManager r24, int[] r25, boolean r26) {
        /*
            r22 = this;
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            java.lang.String r12 = "SelectableWidgetRndr"
            com.google.android.apps.gsa.staticplugins.searchwidget.bi r0 = r8.f325348b
            com.google.android.apps.gsa.shared.aq.z r13 = r0.mo103214a()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            int r15 = r11.length
            r6 = 0
        L_0x0017:
            if (r6 >= r15) goto L_0x0361
            r5 = r11[r6]
            com.google.android.apps.gsa.shared.aq.aa r0 = r8.f325355i
            boolean r1 = r0.mo83220l()
            r2 = 1
            if (r1 == 0) goto L_0x019e
            boolean r1 = r0.mo83222n(r5)
            if (r1 == 0) goto L_0x019e
            boolean r0 = r0.mo83221m()
            if (r0 != 0) goto L_0x019e
            com.google.android.apps.gsa.search.core.ag.a.e r0 = r8.f325361o
            boolean r0 = r0.mo78102ap()
            if (r0 == 0) goto L_0x0059
            com.google.android.apps.gsa.search.core.ag.a.e r0 = r8.f325361o
            boolean r0 = r0.mo78098al()
            if (r0 != 0) goto L_0x0041
            goto L_0x0059
        L_0x0041:
            com.google.android.apps.gsa.staticplugins.searchwidget.bw r0 = r8.f325362p
            com.google.common.util.concurrent.cx r0 = r0.mo103218a()
            com.google.android.apps.gsa.staticplugins.searchwidget.ao r1 = new com.google.android.apps.gsa.staticplugins.searchwidget.ao
            r1.<init>(r8, r9, r10)
            dagger.a r2 = r8.f325360n
            java.lang.Object r2 = r2.mo27525b()
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60922j.m93044g(r0, r1, r2)
            return r0
        L_0x0059:
            r8.mo103188g(r5)
            com.google.android.apps.gsa.staticplugins.searchwidget.d.j r1 = r8.f325366t
            r18 = 0
            com.google.android.libraries.storage.protostore.ab r0 = r1.f325542d     // Catch:{ ExecutionException -> 0x0071, InterruptedException -> 0x006f }
            com.google.common.util.concurrent.cx r0 = r0.mo46042d()     // Catch:{ ExecutionException -> 0x0071, InterruptedException -> 0x006f }
            com.google.android.apps.gsa.shared.s.a.a r19 = com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.f254254a     // Catch:{ ExecutionException -> 0x0071, InterruptedException -> 0x006f }
            java.lang.Object r0 = r0.get()     // Catch:{ ExecutionException -> 0x0071, InterruptedException -> 0x006f }
            com.google.android.apps.search.googleapp.searchwidget.d.f r0 = (com.google.android.apps.search.googleapp.searchwidget.p10480d.C139006f) r0     // Catch:{ ExecutionException -> 0x0071, InterruptedException -> 0x006f }
            goto L_0x0087
        L_0x006f:
            r0 = move-exception
            goto L_0x0072
        L_0x0071:
            r0 = move-exception
        L_0x0072:
            com.google.common.f.e r19 = com.google.android.apps.gsa.staticplugins.searchwidget.p8757d.C117273j.f325539a
            com.google.common.f.x r4 = r19.mo56225c()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4.mo56378ag(r3, r12)
            java.lang.String r3 = "An error occurred while reading the SelectedProviderProtoDataStore"
            r7 = 32811(0x802b, float:4.5978E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56382g(r0)).mo56372aa(r7)).mo56386p(r3)
            r0 = r18
        L_0x0087:
            r1.f325545g = r0
            com.google.android.libraries.storage.protostore.ab r0 = r1.f325543e     // Catch:{ ExecutionException -> 0x009a, InterruptedException -> 0x0098 }
            com.google.common.util.concurrent.cx r0 = r0.mo46042d()     // Catch:{ ExecutionException -> 0x009a, InterruptedException -> 0x0098 }
            com.google.android.apps.gsa.shared.s.a.a r3 = com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.f254254a     // Catch:{ ExecutionException -> 0x009a, InterruptedException -> 0x0098 }
            java.lang.Object r0 = r0.get()     // Catch:{ ExecutionException -> 0x009a, InterruptedException -> 0x0098 }
            com.google.android.apps.search.googleapp.searchwidget.d.j r0 = (com.google.android.apps.search.googleapp.searchwidget.p10480d.C139010j) r0     // Catch:{ ExecutionException -> 0x009a, InterruptedException -> 0x0098 }
            goto L_0x00b0
        L_0x0098:
            r0 = move-exception
            goto L_0x009b
        L_0x009a:
            r0 = move-exception
        L_0x009b:
            com.google.common.f.e r3 = com.google.android.apps.gsa.staticplugins.searchwidget.p8757d.C117273j.f325539a
            com.google.common.f.x r3 = r3.mo56225c()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r4, r12)
            java.lang.String r4 = "An error occurred while reading the ProviderSearchIconImageProtoDataStore"
            r7 = 32812(0x802c, float:4.598E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r0)).mo56372aa(r7)).mo56386p(r4)
            r0 = r18
        L_0x00b0:
            r1.f325546h = r0
            com.google.android.libraries.storage.protostore.ab r0 = r1.f325544f     // Catch:{ ExecutionException -> 0x00c3, InterruptedException -> 0x00c1 }
            com.google.common.util.concurrent.cx r0 = r0.mo46042d()     // Catch:{ ExecutionException -> 0x00c3, InterruptedException -> 0x00c1 }
            com.google.android.apps.gsa.shared.s.a.a r3 = com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.f254254a     // Catch:{ ExecutionException -> 0x00c3, InterruptedException -> 0x00c1 }
            java.lang.Object r0 = r0.get()     // Catch:{ ExecutionException -> 0x00c3, InterruptedException -> 0x00c1 }
            com.google.android.apps.search.googleapp.searchwidget.d.l r0 = (com.google.android.apps.search.googleapp.searchwidget.p10480d.C139012l) r0     // Catch:{ ExecutionException -> 0x00c3, InterruptedException -> 0x00c1 }
            goto L_0x00d9
        L_0x00c1:
            r0 = move-exception
            goto L_0x00c4
        L_0x00c3:
            r0 = move-exception
        L_0x00c4:
            com.google.common.f.e r3 = com.google.android.apps.gsa.staticplugins.searchwidget.p8757d.C117273j.f325539a
            com.google.common.f.x r3 = r3.mo56225c()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r4, r12)
            java.lang.String r4 = "An error occurred while reading the ProviderVoiceIconImageProtoDataStore"
            r7 = 32813(0x802d, float:4.5981E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r0)).mo56372aa(r7)).mo56386p(r4)
            r0 = r18
        L_0x00d9:
            r1.f325547i = r0
            android.os.Bundle r0 = r10.getAppWidgetOptions(r5)
            boolean r3 = androidx.core.p094f.C1888a.m5149c()
            if (r3 == 0) goto L_0x0144
            android.widget.RemoteViews r0 = r1.mo103226c(r2)
            r2 = 0
            android.widget.RemoteViews r3 = r1.mo103226c(r2)
            android.content.Context r2 = r1.f325540b
            android.content.res.Resources r2 = r2.getResources()
            androidx.c.g r4 = new androidx.c.g
            r4.<init>()
            if (r0 == 0) goto L_0x0118
            android.util.SizeF r7 = new android.util.SizeF
            r18 = r6
            r6 = 2131493150(0x7f0c011e, float:1.8609772E38)
            int r6 = r2.getInteger(r6)
            float r6 = (float) r6
            r20 = r12
            r11 = 2131493146(0x7f0c011a, float:1.8609764E38)
            int r12 = r2.getInteger(r11)
            float r12 = (float) r12
            r7.<init>(r6, r12)
            r4.put(r7, r0)
            goto L_0x011f
        L_0x0118:
            r18 = r6
            r20 = r12
            r11 = 2131493146(0x7f0c011a, float:1.8609764E38)
        L_0x011f:
            if (r3 == 0) goto L_0x0136
            android.util.SizeF r0 = new android.util.SizeF
            r6 = 2131493149(0x7f0c011d, float:1.860977E38)
            int r6 = r2.getInteger(r6)
            float r6 = (float) r6
            int r2 = r2.getInteger(r11)
            float r2 = (float) r2
            r0.<init>(r6, r2)
            r4.put(r0, r3)
        L_0x0136:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x013e
        L_0x013c:
            r2 = 0
            goto L_0x0199
        L_0x013e:
            android.widget.RemoteViews r0 = new android.widget.RemoteViews
            r0.<init>(r4)
            goto L_0x018a
        L_0x0144:
            r18 = r6
            r20 = r12
            if (r0 == 0) goto L_0x0185
            android.content.Context r3 = r1.f325540b
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r4 = r3.getConfiguration()
            int r4 = r4.orientation
            android.content.res.Configuration r6 = r3.getConfiguration()
            int r6 = r6.orientation
            r7 = 2131493150(0x7f0c011e, float:1.8609772E38)
            int r7 = r3.getInteger(r7)
            r11 = 2131493149(0x7f0c011d, float:1.860977E38)
            int r3 = r3.getInteger(r11)
            if (r4 != r2) goto L_0x0173
            java.lang.String r4 = "appWidgetMinWidth"
            int r0 = r0.getInt(r4)
            goto L_0x017e
        L_0x0173:
            r4 = 2
            if (r6 != r4) goto L_0x017d
            java.lang.String r4 = "appWidgetMaxWidth"
            int r0 = r0.getInt(r4)
            goto L_0x017e
        L_0x017d:
            r0 = 0
        L_0x017e:
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            if (r0 < r7) goto L_0x0185
            if (r0 >= r3) goto L_0x0185
            goto L_0x0186
        L_0x0185:
            r2 = 0
        L_0x0186:
            android.widget.RemoteViews r0 = r1.mo103226c(r2)
        L_0x018a:
            if (r0 == 0) goto L_0x013c
            dagger.a r1 = r1.f325541c
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.shared.logger.f r1 = (com.google.android.apps.gsa.shared.logger.C89911f) r1
            r2 = 0
            com.google.android.apps.gsa.shared.p6995aq.C89257aa.m145196i(r10, r5, r0, r2, r1)
            goto L_0x01dc
        L_0x0199:
            com.google.common.util.concurrent.cx r0 = r8.mo103184c(r9, r2)
            return r0
        L_0x019e:
            r18 = r6
            r20 = r12
            com.google.android.apps.gsa.search.core.ag.a.e r0 = r8.f325361o
            boolean r0 = r0.mo78102ap()
            if (r0 == 0) goto L_0x01bc
            com.google.android.apps.gsa.staticplugins.searchwidget.bi r0 = r8.f325348b
            com.google.android.apps.gsa.shared.aq.z r0 = r0.mo103214a()
            com.google.android.apps.gsa.staticplugins.searchwidget.bi r1 = r8.f325348b
            com.google.android.apps.gsa.shared.aq.z r1 = r1.mo103215b()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01c2
        L_0x01bc:
            boolean r0 = r22.mo103193o()
            if (r0 == 0) goto L_0x01e2
        L_0x01c2:
            com.google.android.apps.gsa.staticplugins.searchwidget.bw r0 = r8.f325362p
            com.google.common.util.concurrent.cx r0 = r0.mo103218a()
            com.google.android.apps.gsa.staticplugins.searchwidget.ap r1 = new com.google.android.apps.gsa.staticplugins.searchwidget.ap
            r1.<init>(r8, r9, r10)
            dagger.a r2 = r8.f325360n
            java.lang.Object r2 = r2.mo27525b()
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60922j.m93044g(r0, r1, r2)
            r14.add(r0)
        L_0x01dc:
            r9 = r26
            r19 = 0
            goto L_0x0357
        L_0x01e2:
            android.os.Bundle r0 = r10.getAppWidgetOptions(r5)
            boolean r1 = m194765m(r0)
            if (r1 != 0) goto L_0x0201
            boolean r1 = m194763k(r0)
            if (r1 != 0) goto L_0x0201
            r1 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            r9 = r26
            r19 = 0
            goto L_0x0354
        L_0x0201:
            boolean r1 = m194765m(r0)
            if (r1 == 0) goto L_0x020a
            r8.mo103188g(r5)
        L_0x020a:
            boolean r1 = androidx.core.p094f.C1888a.m5149c()
            if (r1 == 0) goto L_0x0312
            com.google.android.apps.gsa.search.core.preferences.r r1 = r8.f325349c
            java.lang.String r3 = "last_gel_app_widget_id"
            r4 = -1
            int r1 = r1.getInt(r3, r4)
            boolean r3 = m194764l(r0)
            if (r3 != 0) goto L_0x0224
            if (r5 != r1) goto L_0x0222
            goto L_0x0224
        L_0x0222:
            r1 = 0
            goto L_0x0225
        L_0x0224:
            r1 = 1
        L_0x0225:
            boolean r3 = m194763k(r0)
            java.lang.String r4 = "vertical-layout"
            r7 = 0
            boolean r4 = r0.getBoolean(r4, r7)
            if (r1 == 0) goto L_0x0234
            if (r4 != 0) goto L_0x0312
        L_0x0234:
            if (r3 == 0) goto L_0x0238
            goto L_0x0312
        L_0x0238:
            android.content.res.Resources r1 = r23.getResources()
            androidx.c.g r11 = new androidx.c.g
            r11.<init>()
            androidx.c.g r12 = new androidx.c.g
            r12.<init>()
            android.util.SizeF r3 = new android.util.SizeF
            r4 = 2131493146(0x7f0c011a, float:1.8609764E38)
            int r6 = r1.getInteger(r4)
            float r6 = (float) r6
            r7 = 0
            r3.<init>(r7, r6)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r11.put(r3, r2)
            android.util.SizeF r3 = new android.util.SizeF
            r6 = 2131493150(0x7f0c011e, float:1.8609772E38)
            int r6 = r1.getInteger(r6)
            float r6 = (float) r6
            int r7 = r1.getInteger(r4)
            float r7 = (float) r7
            r3.<init>(r6, r7)
            r6 = 3
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r11.put(r3, r6)
            android.util.SizeF r3 = new android.util.SizeF
            r6 = 2131493149(0x7f0c011d, float:1.860977E38)
            int r6 = r1.getInteger(r6)
            float r6 = (float) r6
            int r7 = r1.getInteger(r4)
            float r7 = (float) r7
            r3.<init>(r6, r7)
            r6 = 2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r11.put(r3, r6)
            android.util.SizeF r3 = new android.util.SizeF
            r6 = 2131493147(0x7f0c011b, float:1.8609766E38)
            int r6 = r1.getInteger(r6)
            float r6 = (float) r6
            int r1 = r1.getInteger(r4)
            float r1 = (float) r1
            r3.<init>(r6, r1)
            r11.put(r3, r2)
            java.util.Set r1 = r11.keySet()
            java.util.Iterator r16 = r1.iterator()
        L_0x02ac:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x02df
            java.lang.Object r1 = r16.next()
            r7 = r1
            android.util.SizeF r7 = (android.util.SizeF) r7
            com.google.android.apps.gsa.staticplugins.searchwidget.bg r1 = r8.f325364r
            r3 = 1
            java.lang.Object r2 = r11.get(r7)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r17 = r2.intValue()
            r2 = r0
            r4 = r5
            r6 = r5
            r5 = r13
            r21 = r6
            r6 = r26
            r9 = r7
            r19 = 0
            r7 = r17
            com.google.common.util.concurrent.cx r1 = r1.mo103210c(r2, r3, r4, r5, r6, r7)
            r12.put(r9, r1)
            r9 = r23
            r5 = r21
            goto L_0x02ac
        L_0x02df:
            r21 = r5
            r19 = 0
            java.util.Collection r0 = r12.values()
            com.google.common.util.concurrent.cf r0 = com.google.common.util.concurrent.C60856cj.m92892a(r0)
            com.google.android.apps.gsa.staticplugins.searchwidget.ag r1 = new com.google.android.apps.gsa.staticplugins.searchwidget.ag
            r1.<init>(r12)
            dagger.a r2 = r8.f325360n
            java.lang.Object r2 = r2.mo27525b()
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            com.google.common.util.concurrent.cx r0 = r0.mo57334a(r1, r2)
            com.google.android.apps.gsa.staticplugins.searchwidget.ah r1 = new com.google.android.apps.gsa.staticplugins.searchwidget.ah
            r9 = r26
            r11 = r21
            r1.<init>(r8, r10, r11, r9)
            dagger.a r2 = r8.f325360n
            java.lang.Object r2 = r2.mo27525b()
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60922j.m93044g(r0, r1, r2)
            goto L_0x0354
        L_0x0312:
            r9 = r26
            r11 = r5
            r6 = 2
            r19 = 0
            com.google.android.apps.gsa.staticplugins.searchwidget.bg r1 = r8.f325364r
            r3 = 1
            r7 = 0
            r12 = 1
            r2 = r0
            r4 = r11
            r5 = r13
            r12 = 2
            r6 = r26
            com.google.common.util.concurrent.cx r17 = r1.mo103210c(r2, r3, r4, r5, r6, r7)
            com.google.android.apps.gsa.staticplugins.searchwidget.bg r1 = r8.f325364r
            r3 = 2
            com.google.common.util.concurrent.cx r4 = r1.mo103210c(r2, r3, r4, r5, r6, r7)
            com.google.common.util.concurrent.cx[] r0 = new com.google.common.util.concurrent.C60870cx[r12]
            r0[r19] = r17
            r1 = 1
            r0[r1] = r4
            com.google.common.util.concurrent.cf r0 = com.google.common.util.concurrent.C60856cj.m92893b(r0)
            com.google.android.apps.gsa.staticplugins.searchwidget.ai r12 = new com.google.android.apps.gsa.staticplugins.searchwidget.ai
            r1 = r12
            r2 = r22
            r3 = r17
            r5 = r24
            r6 = r11
            r7 = r26
            r1.<init>(r2, r3, r4, r5, r6, r7)
            dagger.a r1 = r8.f325360n
            java.lang.Object r1 = r1.mo27525b()
            java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1
            com.google.common.util.concurrent.cx r0 = r0.mo57334a(r12, r1)
        L_0x0354:
            r14.add(r0)
        L_0x0357:
            int r6 = r18 + 1
            r9 = r23
            r11 = r25
            r12 = r20
            goto L_0x0017
        L_0x0361:
            com.google.common.util.concurrent.cf r0 = com.google.common.util.concurrent.C60856cj.m92892a(r14)
            com.google.android.apps.gsa.staticplugins.searchwidget.aq r1 = new com.google.android.apps.gsa.staticplugins.searchwidget.aq
            r1.<init>(r8, r14)
            dagger.a r2 = r8.f325360n
            java.lang.Object r2 = r2.mo27525b()
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            com.google.common.util.concurrent.cx r0 = r0.mo57334a(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.searchwidget.C117204as.mo103186e(android.content.Context, android.appwidget.AppWidgetManager, int[], boolean):com.google.common.util.concurrent.cx");
    }

    /* renamed from: f */
    public final Set mo103187f() {
        Set stringSet = this.f325349c.getStringSet("home_screen_widget_ids", (Set) null);
        if (stringSet != null) {
            return new HashSet(stringSet);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo103188g(int i) {
        Set f = mo103187f();
        if (f == null) {
            f = new HashSet(1);
        }
        String num = Integer.toString(i);
        if (!f.contains(num)) {
            f.add(num);
            C86337q b = this.f325349c.mo80076b();
            b.mo80074i("home_screen_widget_ids", f);
            b.apply();
        }
    }

    /* renamed from: h */
    public final void mo103189h(boolean z) {
        int i = 1;
        if (true == z) {
            i = 2;
        }
        C89856f fVar = new C89856f();
        fVar.f246201a = C89849ae.SELECTABLE_SEARCH_WIDGET_UPDATE_APP_STATE_RECORDED;
        C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
        C59661bo boVar = (C59661bo) C59663bq.f159984d.createBuilder();
        boVar.copyOnWrite();
        C59663bq bqVar = (C59663bq) boVar.instance;
        bqVar.f159988c = i - 1;
        bqVar.f159986a = 2 | bqVar.f159986a;
        C59663bq bqVar2 = (C59663bq) boVar.build();
        ajVar.copyOnWrite();
        C59687cb cbVar = (C59687cb) ajVar.instance;
        bqVar2.getClass();
        cbVar.f160103ao = bqVar2;
        cbVar.f160122c |= 64;
        fVar.f246203c = (C59687cb) ajVar.build();
        ((C89859i) this.f325358l.mo27525b()).mo74236a(fVar.mo83699a());
    }

    /* renamed from: i */
    public final void mo103190i() {
        C86337q b = this.f325349c.mo80076b();
        b.mo80075j("search_widget_hint_text_update_context");
        b.mo80075j("search_widget_hint_text_update_timestamp");
        b.apply();
    }

    /* renamed from: j */
    public final boolean mo103191j(Intent intent) {
        ComponentName component = intent.getComponent();
        component.getClass();
        return "com.google.android.googlequicksearchbox.SearchWidgetProvider".equals(component.getClassName()) && this.f325355i.mo83220l() && !this.f325355i.mo83221m();
    }

    /* renamed from: n */
    public final boolean mo103192n(int i) {
        return C89257aa.m145195g(this.f325349c, i) == C89258ab.HIDDEN;
    }

    /* renamed from: o */
    public final boolean mo103193o() {
        return this.f325361o.mo78102ap() && this.f325361o.mo78101ao() && !this.f325348b.mo103214a().equals(this.f325348b.mo103215b());
    }
}
