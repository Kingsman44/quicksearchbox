package com.google.android.apps.gsa.staticplugins.opa.samson.p8442n;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.opa.smartspace.C83793i;
import com.google.android.apps.gsa.smartspace.C92122r;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8264h.p8273g.C107071k;
import com.google.assistant.p3886c.C50818do;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.akp;
import org.p5633c.p5634a.C72210d;
import org.p5633c.p5634a.C72290n;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.n.x */
/* compiled from: PG */
public final class C110287x {

    /* renamed from: m */
    private static final C59071e f307359m = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.samson.n.x");

    /* renamed from: n */
    private static final C72290n f307360n = C72290n.m106814e(5);

    /* renamed from: a */
    public final Activity f307361a;

    /* renamed from: b */
    public final View f307362b;

    /* renamed from: c */
    public final ImageView f307363c;

    /* renamed from: d */
    public final AlarmManager f307364d;

    /* renamed from: e */
    public final C110263ac f307365e;

    /* renamed from: f */
    public final C83793i f307366f;

    /* renamed from: g */
    public final akp f307367g;

    /* renamed from: h */
    public final C107071k f307368h;

    /* renamed from: i */
    public final C92122r f307369i;

    /* renamed from: j */
    public C50818do f307370j;

    /* renamed from: k */
    C72210d f307371k;

    /* renamed from: l */
    public PendingIntent f307372l;

    /* renamed from: o */
    private final C110289z f307373o;

    /* renamed from: p */
    private final TextView f307374p;

    /* renamed from: q */
    private final TextView f307375q;

    public C110287x(C110289z zVar, Activity activity, C107071k kVar, C110263ac acVar, C83793i iVar, C92122r rVar, akp akp) {
        this.f307361a = activity;
        this.f307368h = kVar;
        this.f307373o = zVar;
        this.f307362b = zVar.f307387e;
        this.f307363c = zVar.f307389g;
        this.f307374p = zVar.f307390h;
        this.f307375q = zVar.f307391i;
        this.f307365e = acVar;
        this.f307366f = iVar;
        this.f307369i = rVar;
        this.f307367g = akp;
        this.f307364d = (AlarmManager) activity.getSystemService("alarm");
    }

    /* renamed from: b */
    private final void m183630b() {
        C58976aa aaVar = C58975e.f156826a;
        this.f307370j = null;
        this.f307374p.setText(BuildConfig.FLAVOR);
        this.f307363c.setImageDrawable((Drawable) null);
        this.f307363c.setVisibility(8);
        this.f307362b.setOnClickListener((View.OnClickListener) null);
        this.f307373o.mo98538a(this.f307362b, 8);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0172  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo98537a() {
        /*
            r9 = this;
            com.google.assistant.c.do r0 = r9.f307370j
            if (r0 != 0) goto L_0x0007
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            return
        L_0x0007:
            org.c.a.d r1 = r9.f307371k
            java.lang.String r2 = "genericCardCtl"
            if (r1 != 0) goto L_0x0023
            com.google.common.f.e r0 = f307359m
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r2)
            java.lang.String r1 = "Card has now event time, clearing"
            r2 = 25952(0x6560, float:3.6366E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            r9.m183630b()
            return
        L_0x0023:
            com.google.android.apps.gsa.staticplugins.opa.samson.n.ac r1 = r9.f307365e
            com.google.assistant.c.cz r3 = r1.mo98508b(r0)
            java.lang.String r4 = "no message"
            r5 = 1
            r6 = 0
            java.lang.String r7 = "SmspCardPrPrsr"
            if (r3 != 0) goto L_0x0043
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.opa.samson.p8442n.C110263ac.f307283a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r7)
            r1 = 25969(0x6571, float:3.639E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r1)).mo56386p(r4)
        L_0x0041:
            r0 = r6
            goto L_0x0066
        L_0x0043:
            int r8 = r3.f132238a
            r8 = r8 & r5
            if (r8 == 0) goto L_0x0053
            com.google.assistant.c.b.h r3 = r3.f132239b
            if (r3 != 0) goto L_0x004e
            com.google.assistant.c.b.h r3 = com.google.assistant.p3886c.p3888b.C50723h.f131999e
        L_0x004e:
            java.lang.String r0 = r1.mo98509c(r3, r0)
            goto L_0x0066
        L_0x0053:
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.opa.samson.p8442n.C110263ac.f307283a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r7)
            java.lang.String r1 = "no title"
            r3 = 25968(0x6570, float:3.6389E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r1)
            goto L_0x0041
        L_0x0066:
            if (r0 == 0) goto L_0x0172
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0172
            android.widget.TextView r1 = r9.f307374p
            r3 = 0
            r1.setVisibility(r3)
            android.widget.TextView r1 = r9.f307374p
            r1.setText(r0)
            com.google.android.apps.gsa.staticplugins.opa.samson.n.ac r0 = r9.f307365e
            com.google.assistant.c.do r1 = r9.f307370j
            r1.getClass()
            com.google.assistant.c.cz r8 = r0.mo98508b(r1)
            if (r8 != 0) goto L_0x0097
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.opa.samson.p8442n.C110263ac.f307283a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r7)
            r1 = 25967(0x656f, float:3.6388E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r1)).mo56386p(r4)
            goto L_0x00ba
        L_0x0097:
            int r4 = r8.f132238a
            r4 = r4 & 4
            if (r4 == 0) goto L_0x00a8
            com.google.assistant.c.b.h r4 = r8.f132241d
            if (r4 != 0) goto L_0x00a3
            com.google.assistant.c.b.h r4 = com.google.assistant.p3886c.p3888b.C50723h.f131999e
        L_0x00a3:
            java.lang.String r6 = r0.mo98509c(r4, r1)
            goto L_0x00ba
        L_0x00a8:
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.opa.samson.p8442n.C110263ac.f307283a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r7)
            java.lang.String r1 = "no subtitle"
            r4 = 25966(0x656e, float:3.6386E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r4)).mo56386p(r1)
        L_0x00ba:
            if (r6 == 0) goto L_0x00cd
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x00cd
            android.widget.TextView r0 = r9.f307375q
            r0.setVisibility(r3)
            android.widget.TextView r0 = r9.f307375q
            r0.setText(r6)
            goto L_0x00d4
        L_0x00cd:
            android.widget.TextView r0 = r9.f307375q
            r1 = 8
            r0.setVisibility(r1)
        L_0x00d4:
            org.c.a.d r0 = new org.c.a.d
            r0.<init>()
            org.c.a.d r1 = r9.f307371k
            r1.getClass()
            long r6 = org.p5633c.p5634a.C72285i.m106773a(r1)
            boolean r1 = r0.mo63389t(r6)
            if (r1 == 0) goto L_0x0117
            org.c.a.a r1 = r0.f191963b
            org.c.a.e r1 = r1.mo63366v()
            long r6 = r0.f191962a
            int r1 = r1.mo63444a(r6)
            if (r1 == 0) goto L_0x0106
            org.c.a.a r2 = r0.f191963b
            org.c.a.o r2 = r2.mo63334L()
            long r6 = r0.f191962a
            long r1 = r2.mo63673f(r6, r1)
            org.c.a.d r0 = r0.mo63546d(r1)
        L_0x0106:
            org.c.a.a r1 = r0.f191963b
            org.c.a.o r1 = r1.mo63332J()
            long r6 = r0.f191962a
            long r1 = r1.mo63474b(r6, r5)
            org.c.a.d r0 = r0.mo63546d(r1)
            goto L_0x0135
        L_0x0117:
            org.c.a.d r1 = r9.f307371k
            r1.getClass()
            org.c.a.n r4 = f307360n
            org.c.a.d r1 = r1.mo63551i(r4)
            long r6 = org.p5633c.p5634a.C72285i.m106773a(r1)
            boolean r0 = r0.mo63389t(r6)
            if (r0 == 0) goto L_0x015c
            org.c.a.d r0 = r9.f307371k
            r0.getClass()
            org.c.a.d r0 = r0.mo63551i(r4)
        L_0x0135:
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "com.google.android.apps.gsa.ambient.UPDATE_GENERIC_CARD_INTERNAL"
            r1.<init>(r2)
            android.app.Activity r2 = r9.f307361a
            r4 = 335544320(0x14000000, float:6.4623485E-27)
            android.app.PendingIntent r1 = android.app.PendingIntent.getBroadcast(r2, r3, r1, r4)
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 31
            if (r2 < r3) goto L_0x0152
            android.app.AlarmManager r2 = r9.f307364d
            boolean r2 = r2.canScheduleExactAlarms()
            if (r2 == 0) goto L_0x0159
        L_0x0152:
            android.app.AlarmManager r2 = r9.f307364d
            long r3 = r0.f191962a
            r2.setExact(r5, r3, r1)
        L_0x0159:
            r9.f307372l = r1
            return
        L_0x015c:
            com.google.common.f.e r0 = f307359m
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r2)
            java.lang.String r1 = "Event has already passed, clearing"
            r2 = 25951(0x655f, float:3.6365E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            r9.m183630b()
            return
        L_0x0172:
            com.google.common.f.e r0 = f307359m
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r2)
            java.lang.String r1 = "Card has no title, clearing"
            r2 = 25950(0x655e, float:3.6364E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            r9.m183630b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.samson.p8442n.C110287x.mo98537a():void");
    }
}
