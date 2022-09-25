package com.google.android.apps.search.googleapp.searchwidget;

import android.content.Context;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.android.libraries.search.p2871b.p2895i.C37259h;
import com.google.common.p4526f.C59071e;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62942bv;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;
import p5535j.p5536a.p5545c.p5553d.C71160a;
import p5535j.p5536a.p5545c.p5553d.C71161b;
import p5535j.p5536a.p5545c.p5553d.C71162c;
import p5535j.p5536a.p5545c.p5553d.C71163d;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.y */
/* compiled from: PG */
public final class C139134y implements C139131v {

    /* renamed from: d */
    private static final C59071e f378391d = C59071e.m91331h();

    /* renamed from: a */
    public final C139033k f378392a;

    /* renamed from: b */
    public final C139135z f378393b;

    /* renamed from: c */
    public final C37215b f378394c;

    /* renamed from: e */
    private final C71422aw f378395e;

    /* renamed from: f */
    private final C139032j f378396f;

    public C139134y(C139033k kVar, C139135z zVar, C37215b bVar, C71422aw awVar, C139032j jVar) {
        C69664n.m101061g(awVar, "lightweightScope");
        this.f378392a = kVar;
        this.f378393b = zVar;
        this.f378394c = bVar;
        this.f378395e = awVar;
        this.f378396f = jVar;
    }

    /* renamed from: b */
    private final void m226012b(boolean z) {
        C71160a aVar = (C71160a) C71163d.f189848d.createBuilder();
        C71161b bVar = (C71161b) C71162c.f189843d.createBuilder();
        bVar.copyOnWrite();
        C71162c cVar = (C71162c) bVar.instance;
        cVar.f189845a |= 2;
        cVar.f189846b = z;
        aVar.copyOnWrite();
        C71163d dVar = (C71163d) aVar.instance;
        C71162c cVar2 = (C71162c) bVar.build();
        cVar2.getClass();
        dVar.f189852b = cVar2;
        dVar.f189851a |= 1;
        C62942bv build = aVar.build();
        C69664n.m101060f(build, "newBuilder()\n        .se…       )\n        .build()");
        C37215b bVar2 = this.f378394c;
        C37252a c = C37182a.f98235iv.mo40779c();
        ((C37253b) c).mo40792p(C71163d.f189849e, (C71163d) build);
        c.mo40781e(C62722b.OK);
        bVar2.mo19974a(c);
    }

    /* renamed from: c */
    private final void m226013c(Context context, C37259h hVar) {
        C71803m.m105043d(this.f378395e, (C69585o) null, (C71424ay) null, new C139132w(this, context, (C69577g) null), 3).mo62873s(new C139133x(this, hVar));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00e3, code lost:
        if (r0.equals("update-widget-intent") != false) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00eb, code lost:
        if (r5.hasExtra("update_widget_customization") == false) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ed, code lost:
        r3.f378396f.mo114659a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f2, code lost:
        r5 = r3.f378392a;
        r0 = android.appwidget.AppWidgetManager.getInstance(r4);
        p5462h.p5473f.p5475b.C69664n.m101060f(r0, "getInstance(context)");
        r5.onUpdate(r4, r0, r3.f378393b.mo114766p());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0106, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0107, code lost:
        r3.f378392a.onReceive(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x010c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
        if (r0.equals("update-widget") == false) goto L_0x0107;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo114757a(android.content.Context r4, android.content.Intent r5) {
        /*
            r3 = this;
            java.lang.String r0 = "context"
            p5462h.p5473f.p5475b.C69664n.m101061g(r4, r0)
            java.lang.String r0 = "intent"
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r0)
            java.lang.String r0 = r5.getAction()
            if (r0 != 0) goto L_0x0011
            return
        L_0x0011:
            int r1 = r0.hashCode()
            java.lang.String r2 = "Third party search provider choice selection is disabled"
            switch(r1) {
                case -1625683903: goto L_0x00dd;
                case -170597621: goto L_0x0073;
                case 1604096151: goto L_0x0026;
                case 1629276104: goto L_0x001c;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x0107
        L_0x001c:
            java.lang.String r1 = "update-widget"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00e5
            goto L_0x0107
        L_0x0026:
            java.lang.String r1 = "com.google.android.finsky.intent.action.UPDATE_DSE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            com.google.android.libraries.search.b.b r5 = r3.f378394c
            com.google.android.libraries.search.b.i.g r0 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f98229ip
            r5.mo19974a(r0)
            com.google.android.apps.search.googleapp.searchwidget.z r5 = r3.f378393b
            boolean r5 = r5.mo114763l()
            if (r5 != 0) goto L_0x0061
            com.google.common.f.e r4 = f378391d
            com.google.common.f.x r4 = r4.mo56226d()
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            com.google.common.f.n r5 = new com.google.common.f.n
            r0 = 41314(0xa162, float:5.7893E-41)
            r5.<init>(r0)
            r4.mo56379ah(r5)
            r4.mo56386p(r2)
            com.google.android.libraries.search.b.b r4 = r3.f378394c
            com.google.android.libraries.search.b.i.f r5 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f98233it
            com.google.net.a.a.b r0 = com.google.net.p4726a.p4727a.C62722b.OK
            com.google.android.libraries.search.b.i.a r5 = r5.mo40805c(r0)
            r4.mo19974a(r5)
            return
        L_0x0061:
            com.google.android.apps.search.googleapp.searchwidget.z r5 = r3.f378393b
            r5.mo114762k()
            r5.mo114760i()
            com.google.android.libraries.search.b.i.f r5 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f98231ir
            com.google.android.libraries.search.b.i.h r5 = r5.mo40806d()
            r3.m226013c(r4, r5)
            return
        L_0x0073:
            java.lang.String r1 = "com.google.android.finsky.intent.action.UPDATE_DSE_APP_STATE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
            com.google.android.libraries.search.b.b r0 = r3.f378394c
            com.google.android.libraries.search.b.i.g r1 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f98230iq
            r0.mo19974a(r1)
            com.google.android.apps.search.googleapp.searchwidget.z r0 = r3.f378393b
            boolean r0 = r0.mo114763l()
            if (r0 != 0) goto L_0x00ae
            com.google.common.f.e r4 = f378391d
            com.google.common.f.x r4 = r4.mo56226d()
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            com.google.common.f.n r5 = new com.google.common.f.n
            r0 = 41312(0xa160, float:5.789E-41)
            r5.<init>(r0)
            r4.mo56379ah(r5)
            r4.mo56386p(r2)
            com.google.android.libraries.search.b.b r4 = r3.f378394c
            com.google.android.libraries.search.b.i.f r5 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f98234iu
            com.google.net.a.a.b r0 = com.google.net.p4726a.p4727a.C62722b.OK
            com.google.android.libraries.search.b.i.a r5 = r5.mo40805c(r0)
            r4.mo19974a(r5)
            return
        L_0x00ae:
            android.os.Bundle r5 = r5.getExtras()
            if (r5 == 0) goto L_0x00d3
            java.lang.String r0 = "is_install"
            boolean r1 = r5.containsKey(r0)
            if (r1 == 0) goto L_0x00d3
            boolean r5 = r5.getBoolean(r0)
            if (r5 != 0) goto L_0x00cf
            com.google.android.apps.search.googleapp.searchwidget.z r5 = r3.f378393b
            r5.mo114762k()
            r5.mo114760i()
            r5 = 0
            r3.m226012b(r5)
            goto L_0x00d3
        L_0x00cf:
            r5 = 1
            r3.m226012b(r5)
        L_0x00d3:
            com.google.android.libraries.search.b.i.f r5 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f98232is
            com.google.android.libraries.search.b.i.h r5 = r5.mo40806d()
            r3.m226013c(r4, r5)
            return
        L_0x00dd:
            java.lang.String r1 = "update-widget-intent"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0107
        L_0x00e5:
            java.lang.String r0 = "update_widget_customization"
            boolean r5 = r5.hasExtra(r0)
            if (r5 == 0) goto L_0x00f2
            com.google.android.apps.search.googleapp.searchwidget.j r5 = r3.f378396f
            r5.mo114659a()
        L_0x00f2:
            com.google.android.apps.search.googleapp.searchwidget.k r5 = r3.f378392a
            android.appwidget.AppWidgetManager r0 = android.appwidget.AppWidgetManager.getInstance(r4)
            java.lang.String r1 = "getInstance(context)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r1)
            com.google.android.apps.search.googleapp.searchwidget.z r1 = r3.f378393b
            int[] r1 = r1.mo114766p()
            r5.onUpdate(r4, r0, r1)
            return
        L_0x0107:
            com.google.android.apps.search.googleapp.searchwidget.k r0 = r3.f378392a
            r0.onReceive(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.searchwidget.C139134y.mo114757a(android.content.Context, android.content.Intent):void");
    }
}
