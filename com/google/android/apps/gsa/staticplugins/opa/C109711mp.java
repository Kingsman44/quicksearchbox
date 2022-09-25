package com.google.android.apps.gsa.staticplugins.opa;

import android.content.Context;
import android.os.PowerManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.gsa.opa.C83578ai;
import com.google.android.apps.gsa.opa.C83579aj;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.p6941ui.C88523c;
import com.google.android.apps.gsa.searchplate.C88911am;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90029ch;
import com.google.android.apps.gsa.shared.util.C90740ax;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113987f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.logoview.C22901am;
import com.google.android.libraries.gsa.logoview.LogoView;
import com.google.common.p4522b.C58425eo;
import com.google.common.p4522b.C58781rt;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Queue;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.mp */
/* compiled from: PG */
public final class C109711mp implements C22901am, C83579aj {

    /* renamed from: a */
    public final C86124t f305651a;

    /* renamed from: b */
    public final LogoView f305652b;

    /* renamed from: c */
    public final View.OnClickListener f305653c;

    /* renamed from: d */
    public boolean f305654d = false;

    /* renamed from: e */
    public boolean f305655e;

    /* renamed from: f */
    public boolean f305656f;

    /* renamed from: g */
    public boolean f305657g = false;

    /* renamed from: h */
    public C88911am f305658h;

    /* renamed from: i */
    public int f305659i;

    /* renamed from: j */
    public LogoView f305660j;

    /* renamed from: k */
    public C88523c f305661k;

    /* renamed from: l */
    private final Context f305662l;

    /* renamed from: m */
    private final Queue f305663m;

    /* renamed from: n */
    private final C109738nl f305664n;

    /* renamed from: o */
    private final C83578ai f305665o;

    /* renamed from: p */
    private final PowerManager f305666p;

    /* renamed from: q */
    private C109476mo f305667q = null;

    public C109711mp(C83578ai aiVar, C86124t tVar, Context context, C109738nl nlVar) {
        this.f305662l = context;
        this.f305651a = tVar;
        this.f305664n = nlVar;
        this.f305665o = aiVar;
        this.f305666p = (PowerManager) context.getSystemService("power");
        LogoView logoView = (LogoView) LayoutInflater.from(context).inflate(R.layout.opa_logo_view, (ViewGroup) null);
        this.f305652b = logoView;
        logoView.mo28223c((float) context.getResources().getInteger(R.integer.logo_view_logo_width), (float) context.getResources().getInteger(R.integer.logo_view_logo_height));
        this.f305660j = logoView;
        this.f305663m = new C58781rt(new C58425eo(10));
        C89943l lVar = new C89943l(new C109475mn(this));
        this.f305653c = lVar;
        logoView.setOnClickListener(lVar);
        int b = aiVar.mo76910b();
        logoView.mo28225e(b, false);
        mo28252j(b);
        logoView.mo28224d(this);
    }

    /* renamed from: a */
    public final void mo76914a(ViewGroup viewGroup, int i) {
        int i2;
        FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(i);
        if (this.f305651a.mo79746e(C90029ch.f248210X)) {
            i2 = this.f305662l.getResources().getDimensionPixelSize(R.dimen.opa_logo_view_width_v3);
        } else {
            i2 = this.f305662l.getResources().getDimensionPixelSize(true != C113987f.m188690a(this.f305651a) ? R.dimen.opa_logo_view_width : R.dimen.opa_logo_view_width_v2);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, this.f305662l.getResources().getDimensionPixelSize(R.dimen.opa_logo_view_height));
        layoutParams.gravity = 80;
        if (frameLayout != null) {
            frameLayout.addView(this.f305660j, layoutParams);
        }
    }

    /* renamed from: b */
    public final void mo76915b(int i) {
        int i2 = this.f305659i;
        if (i2 == i) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        this.f305659i = i;
        if (i == 2 || i == 3 || i == 4 || i == 10) {
            this.f305654d = true;
        }
        mo98042h(i2);
    }

    /* renamed from: c */
    public final void mo76916c(boolean z) {
        this.f305654d = true;
        this.f305660j.mo28225e(this.f305665o.mo76909a(), z);
    }

    /* renamed from: e */
    public final void mo76917e(boolean z) {
        this.f305660j.setVisibility(true != z ? 8 : 0);
    }

    /* renamed from: f */
    public final void mo76918f(C90740ax axVar) {
        if (this.f305658h == null) {
            this.f305658h = new C88911am();
        }
        C88911am amVar = this.f305658h;
        amVar.f240858a = axVar;
        this.f305660j.f63000g.mo28247c(amVar, 2);
    }

    /* renamed from: g */
    public final void mo76919g(int i) {
        if (!this.f305651a.mo79746e(C90014bt.f247464he)) {
            boolean z = (i & 8192) != 0;
            if (this.f305656f != z) {
                this.f305656f = z;
                mo98042h(this.f305659i);
            }
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("OpaLogoViewController");
        C91006f e = fVar.mo85281e((Object) null);
        e.mo85291r("Recent snapshots");
        synchronized (this.f305663m) {
            for (C109476mo m : this.f305663m) {
                e.mo85286m(m);
            }
        }
        C109476mo moVar = this.f305667q;
        if (moVar != null) {
            e.mo85286m(moVar);
        }
        fVar.mo85279c("Initialized").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f305654d)));
        fVar.mo85279c("Waiting").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f305656f)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a5, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c5, code lost:
        if (r14.f305656f == false) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c7, code lost:
        r6 = r14.f305665o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00cd, code lost:
        if (r15 == r6.mo76909a()) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00cf, code lost:
        if (r15 != 0) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00d1, code lost:
        r15 = r6.mo76911c();
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00d6, code lost:
        if (r15 != 0) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00d8, code lost:
        r15 = r14.f305660j.f63000g.f63060j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0100, code lost:
        if (r15 != 16) goto L_0x010a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0120 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0144  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo98042h(int r15) {
        /*
            r14 = this;
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.libraries.gsa.logoview.LogoView r0 = r14.f305660j
            com.google.android.libraries.gsa.logoview.ak r0 = r0.f63000g
            int r0 = r0.f63060j
            com.google.android.apps.gsa.staticplugins.opa.mo r1 = r14.f305667q
            r9 = 1
            if (r1 == 0) goto L_0x002f
            boolean r2 = r1.f304932d
            boolean r3 = r14.f305655e
            if (r2 != r3) goto L_0x002f
            int r2 = r1.f304930b
            int r3 = r14.f305659i
            if (r2 != r3) goto L_0x002f
            boolean r2 = r1.f304931c
            boolean r3 = r14.f305656f
            if (r2 != r3) goto L_0x002f
            boolean r2 = r1.f304933e
            boolean r3 = r14.f305654d
            if (r2 != r3) goto L_0x002f
            int r2 = r1.f304934f
            if (r2 != r0) goto L_0x002f
            int r2 = r1.f304935g
            int r2 = r2 + r9
            r1.f304935g = r2
            goto L_0x004b
        L_0x002f:
            if (r1 == 0) goto L_0x0036
            java.util.Queue r2 = r14.f305663m
            r2.add(r1)
        L_0x0036:
            com.google.android.apps.gsa.staticplugins.opa.mo r10 = new com.google.android.apps.gsa.staticplugins.opa.mo
            boolean r2 = r14.f305655e
            long r3 = java.lang.System.currentTimeMillis()
            int r5 = r14.f305659i
            boolean r6 = r14.f305656f
            boolean r7 = r14.f305654d
            r1 = r10
            r8 = r0
            r1.<init>(r2, r3, r5, r6, r7, r8)
            r14.f305667q = r10
        L_0x004b:
            boolean r1 = r14.f305655e
            r2 = 2
            r3 = 16
            r4 = 15
            r5 = 0
            if (r1 == 0) goto L_0x005e
            com.google.android.apps.gsa.opa.ai r15 = r14.f305665o
            int r15 = r15.mo76912d()
            r1 = 0
            goto L_0x00de
        L_0x005e:
            int r1 = r14.f305659i
            switch(r1) {
                case 1: goto L_0x00a7;
                case 2: goto L_0x00a7;
                case 3: goto L_0x00a4;
                case 4: goto L_0x009c;
                case 5: goto L_0x006c;
                case 6: goto L_0x0065;
                case 7: goto L_0x0065;
                case 8: goto L_0x0063;
                case 9: goto L_0x0065;
                case 10: goto L_0x0063;
                default: goto L_0x0063;
            }
        L_0x0063:
            r15 = 0
            goto L_0x00a5
        L_0x0065:
            com.google.android.apps.gsa.opa.ai r15 = r14.f305665o
            int r15 = r15.mo76909a()
            goto L_0x00a5
        L_0x006c:
            boolean r1 = r14.f305657g
            if (r1 != 0) goto L_0x0095
            if (r0 == r9) goto L_0x008c
            if (r0 == r4) goto L_0x008c
            if (r0 == r3) goto L_0x008c
            if (r0 == r2) goto L_0x008c
            com.google.android.apps.gsa.search.core.i.t r1 = r14.f305651a
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247559jT
            boolean r1 = r1.mo79746e(r6)
            if (r1 == 0) goto L_0x0095
            r1 = 4
            if (r0 != r1) goto L_0x0095
            r0 = 5
            if (r15 == r0) goto L_0x008a
            r0 = 4
            goto L_0x008c
        L_0x008a:
            r0 = 4
            goto L_0x0095
        L_0x008c:
            r14.f305656f = r5
            com.google.android.apps.gsa.search.shared.ui.c r15 = r14.f305661k
            if (r15 == 0) goto L_0x0095
            r15.mo82150f()
        L_0x0095:
            com.google.android.apps.gsa.opa.ai r15 = r14.f305665o
            int r15 = r15.mo76909a()
            goto L_0x00a5
        L_0x009c:
            com.google.android.apps.gsa.opa.ai r15 = r14.f305665o
            int r15 = r15.mo76911c()
            r1 = 1
            goto L_0x00c3
        L_0x00a4:
            r15 = 2
        L_0x00a5:
            r1 = 0
            goto L_0x00c3
        L_0x00a7:
            com.google.android.apps.gsa.search.core.i.t r15 = r14.f305651a
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90060dl.f249191c
            boolean r15 = r15.mo79746e(r1)
            if (r15 == 0) goto L_0x00b4
            r15 = 15
            goto L_0x00a5
        L_0x00b4:
            com.google.android.apps.gsa.search.core.i.t r15 = r14.f305651a
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90060dl.f249190b
            boolean r15 = r15.mo79746e(r1)
            if (r15 == 0) goto L_0x00c1
            r15 = 16
            goto L_0x00a5
        L_0x00c1:
            r15 = 1
            goto L_0x00a5
        L_0x00c3:
            boolean r6 = r14.f305656f
            if (r6 == 0) goto L_0x00d6
            com.google.android.apps.gsa.opa.ai r6 = r14.f305665o
            int r7 = r6.mo76909a()
            if (r15 == r7) goto L_0x00d1
            if (r15 != 0) goto L_0x00d6
        L_0x00d1:
            int r15 = r6.mo76911c()
            r1 = 1
        L_0x00d6:
            if (r15 != 0) goto L_0x00de
            com.google.android.libraries.gsa.logoview.LogoView r15 = r14.f305660j
            com.google.android.libraries.gsa.logoview.ak r15 = r15.f63000g
            int r15 = r15.f63060j
        L_0x00de:
            com.google.android.libraries.gsa.logoview.LogoView r6 = r14.f305660j
            android.content.res.Resources r6 = r6.getResources()
            r7 = 2132085942(0x7f150cb6, float:1.9812097E38)
            java.lang.String r7 = r6.getString(r7)
            if (r15 == r9) goto L_0x0114
            if (r15 == r2) goto L_0x010c
            r2 = 7
            if (r15 == r2) goto L_0x0103
            r2 = 13
            if (r15 == r2) goto L_0x0103
            r2 = 10
            if (r15 == r2) goto L_0x0103
            r2 = 11
            if (r15 == r2) goto L_0x0103
            if (r15 == r4) goto L_0x0114
            if (r15 == r3) goto L_0x0114
            goto L_0x010a
        L_0x0103:
            r2 = 2132093613(0x7f152aad, float:1.9827656E38)
            java.lang.String r7 = r6.getString(r2)
        L_0x010a:
            r2 = 0
            goto L_0x011c
        L_0x010c:
            r2 = 2132093612(0x7f152aac, float:1.9827654E38)
            java.lang.String r7 = r6.getString(r2)
            goto L_0x011b
        L_0x0114:
            r2 = 2132093611(0x7f152aab, float:1.9827652E38)
            java.lang.String r7 = r6.getString(r2)
        L_0x011b:
            r2 = 1
        L_0x011c:
            boolean r6 = r14.f305655e
            if (r6 != 0) goto L_0x0129
            if (r2 == 0) goto L_0x0123
            goto L_0x0129
        L_0x0123:
            com.google.android.apps.gsa.staticplugins.opa.nl r2 = r14.f305664n
            r2.mo98059d()
            goto L_0x0138
        L_0x0129:
            com.google.android.apps.gsa.search.core.i.t r2 = r14.f305651a
            com.google.android.apps.gsa.shared.m.f r6 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247510iX
            long r10 = r2.mo79743a(r6)
            com.google.android.apps.gsa.staticplugins.opa.nl r2 = r14.f305664n
            r12 = 0
            r2.mo98058b(r12, r10)
        L_0x0138:
            com.google.android.apps.gsa.opa.ai r2 = r14.f305665o
            boolean r2 = r2.mo76913e()
            if (r2 == 0) goto L_0x0183
            boolean r2 = r14.f305654d
            if (r2 == 0) goto L_0x0183
            com.google.android.libraries.gsa.logoview.LogoView r2 = r14.f305660j
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x0154
            android.os.PowerManager r2 = r14.f305666p
            boolean r2 = r2.isPowerSaveMode()
            if (r2 == 0) goto L_0x0155
        L_0x0154:
            r5 = 1
        L_0x0155:
            com.google.android.libraries.gsa.logoview.LogoView r2 = r14.f305660j
            r2.mo28225e(r15, r5)
            com.google.android.libraries.gsa.logoview.LogoView r2 = r14.f305660j
            r2.setContentDescription(r7)
            if (r1 == 0) goto L_0x0170
            com.google.android.apps.gsa.opa.ai r1 = r14.f305665o
            int r1 = r1.mo76911c()
            if (r0 == r1) goto L_0x0170
            com.google.android.apps.gsa.search.shared.ui.c r1 = r14.f305661k
            if (r1 == 0) goto L_0x0170
            r1.mo82148d()
        L_0x0170:
            if (r15 == r9) goto L_0x0176
            if (r15 == r4) goto L_0x0176
            if (r15 != r3) goto L_0x0183
        L_0x0176:
            if (r0 == r9) goto L_0x0183
            if (r0 == r4) goto L_0x0183
            if (r0 == r3) goto L_0x0183
            com.google.android.apps.gsa.search.shared.ui.c r15 = r14.f305661k
            if (r15 == 0) goto L_0x0183
            r15.mo82147c()
        L_0x0183:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.C109711mp.mo98042h(int):void");
    }

    /* renamed from: i */
    public final void mo28251i(int i) {
        C58976aa aaVar = C58975e.f156826a;
        if (i == 13) {
            this.f305660j.setElevation(0.0f);
            C88523c cVar = this.f305661k;
            if (cVar != null) {
                cVar.mo82149e();
            }
        }
    }

    /* renamed from: j */
    public final void mo28252j(int i) {
        C88523c cVar;
        C58976aa aaVar = C58975e.f156826a;
        if (i == 13 && (cVar = this.f305661k) != null) {
            cVar.mo82146b();
        }
    }
}
