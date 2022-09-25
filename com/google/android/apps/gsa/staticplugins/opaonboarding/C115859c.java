package com.google.android.apps.gsa.staticplugins.opaonboarding;

import android.app.Activity;
import android.app.FragmentManager;
import com.google.android.apps.gsa.opaonboarding.C83880an;
import com.google.android.apps.gsa.opaonboarding.C83882ap;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.opaonboarding.C83900bf;
import com.google.android.apps.gsa.opaonboarding.C83901bg;
import com.google.android.apps.gsa.opaonboarding.C83906bl;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.util.C90719ac;
import com.google.android.apps.gsa.shared.util.C90743b;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.p4553a.C59567w;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opaonboarding.c */
/* compiled from: PG */
public final class C115859c implements C83901bg, C83906bl {

    /* renamed from: a */
    public static final C59071e f321265a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opaonboarding.c");

    /* renamed from: b */
    public final Map f321266b;

    /* renamed from: c */
    public final String f321267c;

    /* renamed from: d */
    public final Activity f321268d;

    /* renamed from: e */
    public final int f321269e;

    /* renamed from: f */
    public final C86124t f321270f;

    /* renamed from: g */
    public final C83880an f321271g;

    /* renamed from: h */
    public C83882ap f321272h;

    /* renamed from: i */
    public C83907bm f321273i;

    /* renamed from: j */
    public boolean f321274j = false;

    /* renamed from: k */
    public boolean f321275k;

    /* renamed from: l */
    public boolean f321276l;

    /* renamed from: m */
    public boolean f321277m;

    /* renamed from: n */
    public final C58833ax f321278n;

    /* renamed from: o */
    private final C59567w f321279o;

    /* renamed from: p */
    private final FragmentManager f321280p;

    /* renamed from: q */
    private final C83900bf f321281q;

    /* renamed from: r */
    private final C83893b f321282r;

    /* renamed from: s */
    private final long f321283s;

    /* renamed from: t */
    private final C90743b f321284t;

    public C115859c(C59567w wVar, Activity activity, int i, C83900bf bfVar, C58833ax axVar, C90743b bVar, C86124t tVar, Map map, String str, C83893b bVar2, C83880an anVar) {
        if ((wVar.f158060a & 2) == 0) {
            C59104x d = f321265a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SequenceController");
            ((C59052c) ((C59052c) d).mo56372aa(30109)).mo56386p("AssistantOnboarding must contain an EntryId in order to analyze logs.");
        }
        this.f321266b = map;
        this.f321267c = str;
        this.f321279o = wVar;
        this.f321268d = activity;
        this.f321280p = activity.getFragmentManager();
        this.f321269e = i;
        this.f321281q = bfVar;
        this.f321278n = axVar;
        this.f321283s = C90719ac.f253778a.f253779b.nextLong();
        this.f321284t = bVar;
        this.f321270f = tVar;
        this.f321282r = bVar2;
        this.f321271g = anVar;
    }

    /* renamed from: a */
    public final void mo77312a() {
        C58976aa aaVar = C58975e.f156826a;
        mo102287c();
    }

    /* renamed from: b */
    public final void mo77313b() {
        C58976aa aaVar = C58975e.f156826a;
        mo102288d();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x019a, code lost:
        r3 = (android.widget.TextView) r0.getView().findViewById(com.google.android.googlequicksearchbox.R.id.opa_error_title);
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo102287c() {
        /*
            r10 = this;
            boolean r0 = r10.f321274j
            r1 = 1
            if (r0 != 0) goto L_0x000a
            r10.f321275k = r1
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            return
        L_0x000a:
            com.google.android.apps.gsa.opaonboarding.ap r0 = r10.f321272h
            com.google.android.apps.gsa.opaonboarding.t r0 = r0.mo77244a()
            com.google.common.base.ax r0 = r0.mo77209c()
            boolean r2 = r0.mo56113h()
            r3 = 16777216(0x1000000, float:2.3509887E-38)
            r4 = 0
            if (r2 != 0) goto L_0x0095
            boolean r0 = r10.f321276l
            if (r0 == 0) goto L_0x0085
            boolean r0 = r10.f321277m
            if (r0 == 0) goto L_0x0026
            goto L_0x0085
        L_0x0026:
            com.google.common.o.uf r0 = com.google.common.p4552o.C60555uf.f164065cO
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.common.o.tz r0 = (com.google.common.p4552o.C60548tz) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.common.o.uf r2 = (com.google.common.p4552o.C60555uf) r2
            int r5 = r2.f164093a
            r5 = r5 | 2
            r2.f164093a = r5
            r5 = 1027(0x403, float:1.439E-42)
            r2.f164258m = r5
            com.google.android.apps.gsa.opaonboarding.b r2 = r10.f321282r
            com.google.common.base.ax r2 = r2.mo77278a()
            boolean r2 = r2.mo56113h()
            if (r2 == 0) goto L_0x007a
            com.google.common.o.a.w r2 = com.google.common.p4552o.p4553a.C59567w.f158058g
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.common.o.a.v r2 = (com.google.common.p4552o.p4553a.C59566v) r2
            long r5 = r10.f321283s
            r2.copyOnWrite()
            com.google.protobuf.bv r7 = r2.instance
            com.google.common.o.a.w r7 = (com.google.common.p4552o.p4553a.C59567w) r7
            int r8 = r7.f158060a
            r8 = r8 | r1
            r7.f158060a = r8
            r7.f158061b = r5
            r0.copyOnWrite()
            com.google.protobuf.bv r5 = r0.instance
            com.google.common.o.uf r5 = (com.google.common.p4552o.C60555uf) r5
            com.google.protobuf.bv r2 = r2.build()
            com.google.common.o.a.w r2 = (com.google.common.p4552o.p4553a.C59567w) r2
            r2.getClass()
            r5.f164173ba = r2
            int r2 = r5.f164251f
            r2 = r2 | r3
            r5.f164251f = r2
        L_0x007a:
            com.google.protobuf.bv r0 = r0.build()
            com.google.common.o.uf r0 = (com.google.common.p4552o.C60555uf) r0
            com.google.android.apps.gsa.shared.logger.C89949q.m146525j(r0, r4, r4, r4)
            r10.f321277m = r1
        L_0x0085:
            com.google.android.apps.gsa.opaonboarding.bf r0 = r10.f321281q
            com.google.android.apps.gsa.opaonboarding.ap r1 = r10.f321272h
            com.google.android.apps.gsa.opaonboarding.bj r1 = r1.mo77245b()
            com.google.android.apps.gsa.opaonboarding.bi r1 = r1.mo77310b()
            r0.mo77303jI(r1)
            return
        L_0x0095:
            boolean r2 = r10.f321276l
            if (r2 == 0) goto L_0x009a
            goto L_0x00f9
        L_0x009a:
            com.google.common.o.uf r2 = com.google.common.p4552o.C60555uf.f164065cO
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.common.o.tz r2 = (com.google.common.p4552o.C60548tz) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.common.o.uf r5 = (com.google.common.p4552o.C60555uf) r5
            int r6 = r5.f164093a
            r6 = r6 | 2
            r5.f164093a = r6
            r6 = 1026(0x402, float:1.438E-42)
            r5.f164258m = r6
            com.google.android.apps.gsa.opaonboarding.b r5 = r10.f321282r
            com.google.common.base.ax r5 = r5.mo77278a()
            boolean r5 = r5.mo56113h()
            if (r5 == 0) goto L_0x00ee
            com.google.common.o.a.w r5 = r10.f321279o
            com.google.protobuf.bn r5 = r5.toBuilder()
            com.google.common.o.a.v r5 = (com.google.common.p4552o.p4553a.C59566v) r5
            long r6 = r10.f321283s
            r5.copyOnWrite()
            com.google.protobuf.bv r8 = r5.instance
            com.google.common.o.a.w r8 = (com.google.common.p4552o.p4553a.C59567w) r8
            int r9 = r8.f158060a
            r9 = r9 | r1
            r8.f158060a = r9
            r8.f158061b = r6
            r2.copyOnWrite()
            com.google.protobuf.bv r6 = r2.instance
            com.google.common.o.uf r6 = (com.google.common.p4552o.C60555uf) r6
            com.google.protobuf.bv r5 = r5.build()
            com.google.common.o.a.w r5 = (com.google.common.p4552o.p4553a.C59567w) r5
            r5.getClass()
            r6.f164173ba = r5
            int r5 = r6.f164251f
            r5 = r5 | r3
            r6.f164251f = r5
        L_0x00ee:
            com.google.protobuf.bv r2 = r2.build()
            com.google.common.o.uf r2 = (com.google.common.p4552o.C60555uf) r2
            com.google.android.apps.gsa.shared.logger.C89949q.m146525j(r2, r4, r4, r4)
            r10.f321276l = r1
        L_0x00f9:
            com.google.android.apps.gsa.opaonboarding.bm r2 = r10.f321273i
            if (r2 == 0) goto L_0x00ff
            r2.f228534a = r4
        L_0x00ff:
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.opaonboarding.bm r0 = (com.google.android.apps.gsa.opaonboarding.C83907bm) r0
            r0.f228534a = r10
            android.app.FragmentManager r2 = r10.f321280p
            android.app.FragmentTransaction r2 = r2.beginTransaction()
            int r5 = r10.f321269e
            r2.replace(r5, r0)
            r5 = 17498112(0x10b0000, float:2.5530268E-38)
            r6 = 17498113(0x10b0001, float:2.553027E-38)
            r2.setCustomAnimations(r5, r6)
            r2.commit()
            android.app.FragmentManager r2 = r10.f321280p
            r2.executePendingTransactions()
            com.google.common.o.uf r2 = com.google.common.p4552o.C60555uf.f164065cO
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.common.o.tz r2 = (com.google.common.p4552o.C60548tz) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.common.o.uf r5 = (com.google.common.p4552o.C60555uf) r5
            int r6 = r5.f164093a
            r6 = r6 | 2
            r5.f164093a = r6
            r6 = 1300(0x514, float:1.822E-42)
            r5.f164258m = r6
            com.google.android.apps.gsa.opaonboarding.b r5 = r10.f321282r
            com.google.common.base.ax r5 = r5.mo77278a()
            boolean r5 = r5.mo56113h()
            if (r5 == 0) goto L_0x0176
            com.google.common.o.a.w r5 = com.google.common.p4552o.p4553a.C59567w.f158058g
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.common.o.a.v r5 = (com.google.common.p4552o.p4553a.C59566v) r5
            long r6 = r10.f321283s
            r5.copyOnWrite()
            com.google.protobuf.bv r8 = r5.instance
            com.google.common.o.a.w r8 = (com.google.common.p4552o.p4553a.C59567w) r8
            int r9 = r8.f158060a
            r1 = r1 | r9
            r8.f158060a = r1
            r8.f158061b = r6
            r2.copyOnWrite()
            com.google.protobuf.bv r1 = r2.instance
            com.google.common.o.uf r1 = (com.google.common.p4552o.C60555uf) r1
            com.google.protobuf.bv r5 = r5.build()
            com.google.common.o.a.w r5 = (com.google.common.p4552o.p4553a.C59567w) r5
            r5.getClass()
            r1.f164173ba = r5
            int r5 = r1.f164251f
            r3 = r3 | r5
            r1.f164251f = r3
        L_0x0176:
            android.view.View r1 = r0.getView()
            r3 = 472(0x1d8, float:6.61E-43)
            com.google.common.o.oe r1 = com.google.android.libraries.logging.C28285c.m52874a(r1, r3)
            if (r1 == 0) goto L_0x018c
            com.google.protobuf.bv r2 = r2.build()
            com.google.common.o.uf r2 = (com.google.common.p4552o.C60555uf) r2
            com.google.android.apps.gsa.shared.logger.C89949q.m146525j(r2, r1, r4, r4)
            goto L_0x018e
        L_0x018c:
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
        L_0x018e:
            com.google.android.apps.gsa.shared.util.b r1 = r10.f321284t
            if (r1 == 0) goto L_0x01c1
            android.app.Activity r2 = r10.f321268d
            android.view.View r3 = r0.getView()
            if (r3 == 0) goto L_0x01bc
            android.view.View r3 = r0.getView()
            r4 = 2131434059(0x7f0b1a4b, float:1.8489921E38)
            android.view.View r3 = r3.findViewById(r4)
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r3 == 0) goto L_0x01bc
            java.lang.CharSequence r4 = r3.getText()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x01bc
            java.lang.CharSequence r3 = r3.getText()
            java.lang.String r3 = r3.toString()
            goto L_0x01be
        L_0x01bc:
            java.lang.String r3 = ""
        L_0x01be:
            r1.mo85089b(r2, r3)
        L_0x01c1:
            r10.f321273i = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opaonboarding.C115859c.mo102287c():void");
    }

    /* renamed from: d */
    public final void mo102288d() {
        this.f321281q.mo77303jI(this.f321272h.mo77245b().mo77311i());
    }
}
