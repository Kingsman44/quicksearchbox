package com.google.android.apps.gsa.assistant.settings.features.appactions;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p566b.C10222a;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p566b.C10224c;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10255ac;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10256ad;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10281z;
import com.google.android.apps.gsa.assistant.settings.features.e.p;
import com.google.android.apps.gsa.assistant.shared.appactions.p5805d.C73812a;
import com.google.android.apps.gsa.shared.p7066m.C90019by;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.apps.tiktok.p3674l.p3679c.C47400m;
import com.google.assistant.p3861at.C49838aw;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.da */
/* compiled from: PG */
public final class C10312da {

    /* renamed from: a */
    public final C10304cw f34933a;

    /* renamed from: b */
    public final C91189au f34934b;

    /* renamed from: c */
    public final C28310af f34935c;

    /* renamed from: d */
    public final boolean f34936d;

    /* renamed from: e */
    public final boolean f34937e;

    /* renamed from: f */
    public final boolean f34938f;

    /* renamed from: g */
    public final boolean f34939g;

    /* renamed from: h */
    public final C10224c f34940h;

    /* renamed from: i */
    public final C73812a f34941i;

    /* renamed from: j */
    public final C90021c f34942j;

    /* renamed from: k */
    public Optional f34943k = Optional.empty();

    /* renamed from: l */
    public Optional f34944l = Optional.empty();

    /* renamed from: m */
    public Optional f34945m = Optional.empty();

    /* renamed from: n */
    public C58495hd f34946n = C58729pv.f156485a;

    /* renamed from: o */
    public Optional f34947o = Optional.empty();

    /* renamed from: p */
    public Optional f34948p = Optional.empty();

    /* renamed from: q */
    public Optional f34949q = Optional.empty();

    /* renamed from: r */
    public Optional f34950r = Optional.empty();

    /* renamed from: s */
    public final int f34951s;

    /* renamed from: t */
    public final int f34952t;

    /* renamed from: u */
    private final C47400m f34953u;

    /* renamed from: v */
    private final boolean f34954v;

    /* renamed from: w */
    private final boolean f34955w;

    public C10312da(C10304cw cwVar, C91189au auVar, C28310af afVar, C10256ad adVar, C10224c cVar, C73812a aVar, C47400m mVar, C90021c cVar2) {
        this.f34933a = cwVar;
        this.f34934b = auVar;
        this.f34935c = afVar;
        this.f34953u = mVar;
        int a = C10255ac.m25160a(adVar.f34769c);
        int i = 1;
        this.f34951s = a == 0 ? 1 : a;
        int a2 = C10281z.m25164a(adVar.f34770d);
        this.f34952t = a2 != 0 ? a2 : i;
        this.f34940h = cVar;
        this.f34941i = aVar;
        this.f34936d = adVar.f34771e;
        this.f34937e = adVar.f34772f;
        this.f34938f = adVar.f34773g;
        this.f34939g = adVar.f34768b;
        this.f34954v = adVar.f34774h;
        this.f34955w = adVar.f34775i;
        this.f34942j = cVar2;
    }

    /* renamed from: b */
    private final View.OnClickListener m25237b() {
        return new C10222a(this.f34940h, new C10305cx(this));
    }

    /* renamed from: c */
    private final void m25238c(C49838aw awVar, Optional optional) {
        if (this.f34942j.mo79746e(C90019by.f248086t) && !optional.isEmpty() && p.a(awVar.f129507b) && this.f34951s == 3) {
            ViewStub viewStub = (ViewStub) optional.get();
            Context context = this.f34933a.getContext();
            viewStub.setLayoutResource(R.layout.app_specific_integrations_link);
            View inflate = viewStub.inflate();
            viewStub.setVisibility(0);
            ((TextView) inflate.findViewById(R.id.app_specific_shortcuts_link_description)).setText(context.getString(R.string.app_integrations_link_description, new Object[]{awVar.f129508c}));
            this.f34953u.mo51252a(inflate, new C10226bb(awVar.f129507b));
        }
    }

    /* renamed from: d */
    private static C10307cz m25239d(int i, int i2, boolean z, C58485gu guVar) {
        if (!guVar.isEmpty()) {
            return C10307cz.NON_ZERO_STATE;
        }
        if (i != 2) {
            if (i == 3) {
                if (i2 == 2) {
                    return C10307cz.MAIN_PAGE_YOUR_TAB;
                }
                i = 3;
            }
            if (i == 3 && i2 == 1) {
                if (z) {
                    return C10307cz.MAIN_PAGE_YOUR_PAGE;
                }
                return C10307cz.APP_SPECIFIC_PAGE_YOUR_TAB;
            } else if (i == 4 && i2 == 1) {
                return C10307cz.APP_SPECIFIC_PAGE_ALL_TAB;
            } else {
                return C10307cz.NON_ZERO_STATE;
            }
        } else if (i2 == 1) {
            return C10307cz.MAIN_PAGE_EXPLORE_PAGE;
        } else {
            return C10307cz.MAIN_PAGE_EXPLORE_TAB;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v91, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: com.google.common.b.gu} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18409a(java.util.List r20, java.util.List r21, com.google.common.p4522b.C58495hd r22, p3186j$.util.Optional r23) {
        /*
            r19 = this;
            r0 = r19
            r1 = r22
            r2 = r23
            j$.util.Optional r3 = r0.f34943k
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x001f
            j$.util.Optional r3 = p3186j$.util.Optional.m71637of(r20)
            r0.f34944l = r3
            j$.util.Optional r3 = p3186j$.util.Optional.m71637of(r21)
            r0.f34945m = r3
            r0.f34946n = r1
            r0.f34947o = r2
            return
        L_0x001f:
            int r3 = r0.f34951s
            int r3 = r3 + -1
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == r6) goto L_0x003b
            if (r3 == r5) goto L_0x0036
            if (r3 == r4) goto L_0x0031
            com.google.common.b.gu r3 = com.google.common.p4522b.C58485gu.m89845m()
            goto L_0x003f
        L_0x0031:
            com.google.common.b.gu r3 = com.google.common.p4522b.C58485gu.m89842j(r20)
            goto L_0x003f
        L_0x0036:
            com.google.common.b.gu r3 = com.google.android.apps.gsa.assistant.settings.features.appactions.p570f.C10383ae.m25352h(r20)
            goto L_0x003f
        L_0x003b:
            com.google.common.b.gu r3 = com.google.android.apps.gsa.assistant.settings.features.appactions.p570f.C10383ae.m25347c(r20)
        L_0x003f:
            j$.util.Optional r7 = r0.f34948p
            boolean r7 = r7.isPresent()
            r8 = 5
            r9 = 0
            r10 = 0
            if (r7 == 0) goto L_0x0165
            j$.util.Optional r7 = r0.f34948p
            java.lang.Object r7 = r7.get()
            com.google.android.apps.gsa.assistant.settings.features.appactions.q r7 = (com.google.android.apps.gsa.assistant.settings.features.appactions.C10419q) r7
            com.google.common.b.gu r11 = r7.f35133e
            com.google.common.b.gu r11 = com.google.common.p4522b.C58485gu.m89842j(r11)
            int r12 = r3.size()
            if (r12 <= r8) goto L_0x0060
            r12 = 1
            goto L_0x0061
        L_0x0060:
            r12 = 0
        L_0x0061:
            r7.f35132d = r12
            int r12 = r7.f35134f
            if (r12 != r4) goto L_0x007e
            com.google.common.b.gu r12 = com.google.android.apps.gsa.assistant.settings.features.appactions.p570f.C10383ae.m25351g(r3)
            boolean r13 = r7.f35129a
            if (r13 != 0) goto L_0x007b
            int r13 = r3.size()
            int r13 = java.lang.Math.min(r8, r13)
            com.google.common.b.gu r12 = r12.subList(r10, r13)
        L_0x007b:
            r7.f35133e = r12
            goto L_0x00b0
        L_0x007e:
            boolean r12 = r22.isEmpty()
            if (r12 != 0) goto L_0x009c
            boolean r12 = r7.f35129a
            if (r12 == 0) goto L_0x008d
            com.google.common.b.gu r12 = com.google.android.apps.gsa.assistant.settings.features.appactions.p570f.C10383ae.m25350f(r3, r1)
            goto L_0x0099
        L_0x008d:
            int r12 = r3.size()
            int r12 = java.lang.Math.min(r8, r12)
            com.google.common.b.gu r12 = com.google.android.apps.gsa.assistant.settings.features.appactions.p570f.C10383ae.m25349e(r3, r12, r1)
        L_0x0099:
            r7.f35133e = r12
            goto L_0x00b0
        L_0x009c:
            boolean r12 = r7.f35129a
            if (r12 == 0) goto L_0x00a2
            r12 = r3
            goto L_0x00ae
        L_0x00a2:
            int r12 = r3.size()
            int r12 = java.lang.Math.min(r8, r12)
            com.google.common.b.gu r12 = com.google.android.apps.gsa.assistant.settings.features.appactions.p570f.C10383ae.m25348d(r3, r12)
        L_0x00ae:
            r7.f35133e = r12
        L_0x00b0:
            com.google.android.apps.gsa.shared.m.c r12 = r7.f35131c
            com.google.android.apps.gsa.shared.m.d r13 = com.google.android.apps.gsa.shared.p7066m.C90019by.f248071e
            boolean r12 = r12.mo79746e(r13)
            if (r12 == 0) goto L_0x0160
            com.google.common.b.gu r12 = r7.f35133e
            com.google.android.apps.gsa.assistant.settings.features.appactions.f.l r11 = com.google.android.apps.gsa.assistant.settings.features.appactions.p570f.C10395m.m25367b(r11, r12)
            com.google.android.apps.gsa.assistant.settings.features.appactions.f.j r11 = (com.google.android.apps.gsa.assistant.settings.features.appactions.p570f.C10392j) r11
            boolean r12 = r11.f35096a
            if (r12 == 0) goto L_0x00cd
            android.support.v7.widget.fc r7 = r7.mObservable
            r7.mo2879a()
            goto L_0x0165
        L_0x00cd:
            j$.util.Optional r12 = r11.f35098c
            j$.util.Optional r11 = r11.f35097b
            boolean r13 = r12.isEmpty()
            if (r13 == 0) goto L_0x00f8
            java.lang.Object r12 = r11.get()
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r7.notifyItemInserted(r12)
            java.lang.Object r11 = r11.get()
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            int r12 = r7.getItemCount()
            android.support.v7.widget.fc r7 = r7.mObservable
            r7.mo2881c(r11, r12, r9)
            goto L_0x0165
        L_0x00f8:
            boolean r13 = r11.isEmpty()
            if (r13 == 0) goto L_0x011f
            java.lang.Object r11 = r12.get()
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r7.notifyItemRemoved(r11)
            java.lang.Object r11 = r12.get()
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            int r12 = r7.getItemCount()
            android.support.v7.widget.fc r7 = r7.mObservable
            r7.mo2881c(r11, r12, r9)
            goto L_0x0165
        L_0x011f:
            java.lang.Object r13 = r12.get()
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            r7.notifyItemRemoved(r13)
            java.lang.Object r12 = r12.get()
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            int r13 = r7.getItemCount()
            android.support.v7.widget.fc r14 = r7.mObservable
            r14.mo2881c(r12, r13, r9)
            java.lang.Object r12 = r11.get()
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r7.notifyItemInserted(r12)
            java.lang.Object r11 = r11.get()
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            int r12 = r7.getItemCount()
            android.support.v7.widget.fc r7 = r7.mObservable
            r7.mo2881c(r11, r12, r9)
            goto L_0x0165
        L_0x0160:
            android.support.v7.widget.fc r7 = r7.mObservable
            r7.mo2879a()
        L_0x0165:
            j$.util.Optional r7 = r0.f34949q
            boolean r7 = r7.isPresent()
            if (r7 == 0) goto L_0x0322
            j$.util.Optional r7 = r0.f34949q
            java.lang.Object r7 = r7.get()
            com.google.android.apps.gsa.assistant.settings.features.appactions.m r7 = (com.google.android.apps.gsa.assistant.settings.features.appactions.C10415m) r7
            com.google.common.b.gu r11 = r7.f35121c
            com.google.common.b.gu r11 = com.google.common.p4522b.C58485gu.m89842j(r11)
            int r12 = r7.f35122d
            int r12 = r12 + -1
            if (r12 == r6) goto L_0x020d
            if (r12 != r5) goto L_0x0205
            j$.util.stream.Stream r12 = p3186j$.util.Collection.EL.stream(r20)
            com.google.android.apps.gsa.assistant.settings.features.appactions.f.e r13 = com.google.android.apps.gsa.assistant.settings.features.appactions.p570f.C10387e.f35092a
            j$.util.stream.Stream r12 = r12.map(r13)
            j$.util.stream.Stream r12 = r12.distinct()
            j$.util.stream.Collector r13 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r12 = r12.collect(r13)
            com.google.common.b.gu r12 = (com.google.common.p4522b.C58485gu) r12
            boolean r13 = r22.isEmpty()
            if (r13 == 0) goto L_0x01a0
            goto L_0x0202
        L_0x01a0:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            int r14 = r12.size()
            r15 = 0
        L_0x01aa:
            if (r15 >= r14) goto L_0x01e1
            java.lang.Object r16 = r12.get(r15)
            r8 = r16
            com.google.android.apps.gsa.assistant.settings.features.appactions.c.f r8 = (com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10261f) r8
            com.google.assistant.at.aw r4 = r8.f34787b
            if (r4 != 0) goto L_0x01ba
            com.google.assistant.at.aw r4 = com.google.assistant.p3861at.C49838aw.f129504g
        L_0x01ba:
            java.lang.String r4 = r4.f129507b
            android.util.Pair r5 = new android.util.Pair
            boolean r17 = r1.containsKey(r4)
            if (r17 == 0) goto L_0x01cf
            java.lang.Object r4 = r1.get(r4)
            android.app.usage.UsageStats r4 = (android.app.usage.UsageStats) r4
            long r17 = r4.getTotalTimeInForeground()
            goto L_0x01d1
        L_0x01cf:
            r17 = 0
        L_0x01d1:
            java.lang.Long r4 = java.lang.Long.valueOf(r17)
            r5.<init>(r8, r4)
            r13.add(r5)
            int r15 = r15 + 1
            r4 = 3
            r5 = 2
            r8 = 5
            goto L_0x01aa
        L_0x01e1:
            j$.util.stream.Stream r1 = p3186j$.util.Collection.EL.stream(r13)
            com.google.android.apps.gsa.assistant.settings.features.appactions.f.f r4 = com.google.android.apps.gsa.assistant.settings.features.appactions.p570f.C10388f.f35093a
            java.util.Comparator r5 = p3186j$.util.Comparator.CC.reverseOrder()
            java.util.Comparator r4 = p3186j$.util.Comparator.CC.comparing(r4, r5)
            j$.util.stream.Stream r1 = r1.sorted(r4)
            com.google.android.apps.gsa.assistant.settings.features.appactions.f.g r4 = com.google.android.apps.gsa.assistant.settings.features.appactions.p570f.C10389g.f35094a
            j$.util.stream.Stream r1 = r1.map(r4)
            j$.util.stream.Collector r4 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r1 = r1.collect(r4)
            r12 = r1
            com.google.common.b.gu r12 = (com.google.common.p4522b.C58485gu) r12
        L_0x0202:
            r7.f35121c = r12
            goto L_0x0265
        L_0x0205:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            java.lang.String r2 = "unknown app section type."
            r1.<init>(r2)
            throw r1
        L_0x020d:
            android.content.Context r1 = r7.f35119a
            android.content.res.Resources r1 = r1.getResources()
            com.google.common.b.bb r4 = new com.google.common.b.bb
            r4.<init>()
            j$.util.stream.Stream r5 = p3186j$.util.Collection.EL.stream(r20)
            com.google.android.apps.gsa.assistant.settings.features.appactions.f.a r8 = com.google.android.apps.gsa.assistant.settings.features.appactions.p570f.C10378a.f35081a
            j$.util.stream.Stream r5 = r5.filter(r8)
            com.google.android.apps.gsa.assistant.settings.features.appactions.f.b r8 = new com.google.android.apps.gsa.assistant.settings.features.appactions.f.b
            r8.<init>(r4)
            r5.forEach(r8)
            java.util.Map r4 = r4.mo54950C()
            java.util.Set r4 = r4.entrySet()
            j$.util.stream.Stream r4 = p3186j$.util.Collection.EL.stream(r4)
            com.google.android.apps.gsa.assistant.settings.features.appactions.f.c r5 = com.google.android.apps.gsa.assistant.settings.features.appactions.p570f.C10385c.f35090a
            j$.util.stream.Stream r4 = r4.filter(r5)
            com.google.android.apps.gsa.assistant.settings.features.appactions.f.d r5 = new com.google.android.apps.gsa.assistant.settings.features.appactions.f.d
            r5.<init>(r1)
            j$.util.stream.Stream r1 = r4.map(r5)
            j$.util.stream.Collector r4 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r1 = r1.collect(r4)
            com.google.common.b.gu r1 = (com.google.common.p4522b.C58485gu) r1
            j$.util.stream.Stream r1 = p3186j$.util.Collection.EL.stream(r1)
            com.google.android.apps.gsa.assistant.settings.features.appactions.f.h r4 = com.google.android.apps.gsa.assistant.settings.features.appactions.p570f.C10390h.f35095a
            java.util.Comparator r4 = p3186j$.util.Comparator.CC.comparing(r4)
            j$.util.stream.Stream r1 = r1.sorted(r4)
            j$.util.stream.Collector r4 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r1 = r1.collect(r4)
            com.google.common.b.gu r1 = (com.google.common.p4522b.C58485gu) r1
            r7.f35121c = r1
        L_0x0265:
            com.google.android.apps.gsa.shared.m.c r1 = r7.f35120b
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90019by.f248071e
            boolean r1 = r1.mo79746e(r4)
            if (r1 == 0) goto L_0x031d
            com.google.common.b.gu r1 = r7.f35121c
            com.google.android.apps.gsa.assistant.settings.features.appactions.f.l r1 = com.google.android.apps.gsa.assistant.settings.features.appactions.p570f.C10395m.m25367b(r11, r1)
            com.google.android.apps.gsa.assistant.settings.features.appactions.f.j r1 = (com.google.android.apps.gsa.assistant.settings.features.appactions.p570f.C10392j) r1
            boolean r4 = r1.f35096a
            if (r4 == 0) goto L_0x0282
            android.support.v7.widget.fc r1 = r7.mObservable
            r1.mo2879a()
            goto L_0x0322
        L_0x0282:
            j$.util.Optional r4 = r1.f35098c
            j$.util.Optional r1 = r1.f35097b
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x02af
            java.lang.Object r4 = r1.get()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r7.notifyItemInserted(r4)
            java.lang.Object r1 = r1.get()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            com.google.common.b.gu r4 = r7.f35121c
            int r4 = r4.size()
            android.support.v7.widget.fc r5 = r7.mObservable
            r5.mo2881c(r1, r4, r9)
            goto L_0x0322
        L_0x02af:
            boolean r5 = r1.isEmpty()
            if (r5 == 0) goto L_0x02d8
            java.lang.Object r1 = r4.get()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r7.notifyItemRemoved(r1)
            java.lang.Object r1 = r4.get()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            com.google.common.b.gu r4 = r7.f35121c
            int r4 = r4.size()
            android.support.v7.widget.fc r5 = r7.mObservable
            r5.mo2881c(r1, r4, r9)
            goto L_0x0322
        L_0x02d8:
            java.lang.Object r5 = r4.get()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r7.notifyItemRemoved(r5)
            java.lang.Object r4 = r4.get()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            com.google.common.b.gu r5 = r7.f35121c
            int r5 = r5.size()
            android.support.v7.widget.fc r8 = r7.mObservable
            r8.mo2881c(r4, r5, r9)
            java.lang.Object r4 = r1.get()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r7.notifyItemInserted(r4)
            java.lang.Object r1 = r1.get()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            com.google.common.b.gu r4 = r7.f35121c
            int r4 = r4.size()
            android.support.v7.widget.fc r5 = r7.mObservable
            r5.mo2881c(r1, r4, r9)
            goto L_0x0322
        L_0x031d:
            android.support.v7.widget.fc r1 = r7.mObservable
            r1.mo2879a()
        L_0x0322:
            com.google.android.apps.gsa.assistant.settings.features.appactions.cy r1 = com.google.android.apps.gsa.assistant.settings.features.appactions.C10306cy.f34911a
            j$.util.Optional r1 = r2.map(r1)
            j$.util.Optional r4 = r0.f34950r
            boolean r4 = r4.isPresent()
            if (r4 == 0) goto L_0x035d
            boolean r4 = r21.isEmpty()
            if (r4 != 0) goto L_0x035d
            j$.util.Optional r4 = r0.f34950r
            java.lang.Object r4 = r4.get()
            com.google.android.apps.gsa.assistant.settings.features.appactions.bl r4 = (com.google.android.apps.gsa.assistant.settings.features.appactions.C10236bl) r4
            com.google.common.b.gu r5 = com.google.common.p4522b.C58485gu.m89842j(r21)
            r4.f34724a = r5
            r4.f34725b = r1
            android.support.v7.widget.fc r1 = r4.mObservable
            r1.mo2879a()
            j$.util.Optional r1 = r0.f34943k
            java.lang.Object r1 = r1.get()
            android.view.View r1 = (android.view.View) r1
            r4 = 2131430390(0x7f0b0bf6, float:1.848248E38)
            android.view.View r1 = r1.findViewById(r4)
            r1.setVisibility(r10)
        L_0x035d:
            boolean r1 = r23.isPresent()
            if (r1 == 0) goto L_0x0381
            java.lang.Object r1 = r23.get()
            com.google.assistant.at.aw r1 = (com.google.assistant.p3861at.C49838aw) r1
            j$.util.Optional r4 = r0.f34943k
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            r5 = 2131435266(0x7f0b1f02, float:1.849237E38)
            android.view.View r4 = r4.findViewById(r5)
            android.view.ViewStub r4 = (android.view.ViewStub) r4
            j$.util.Optional r4 = p3186j$.util.Optional.ofNullable(r4)
            r0.m25238c(r1, r4)
        L_0x0381:
            boolean r1 = r20.isEmpty()
            r4 = 2131436923(0x7f0b257b, float:1.849573E38)
            if (r1 == 0) goto L_0x03d6
            j$.util.Optional r1 = r0.f34943k
            java.lang.Object r1 = r1.get()
            android.view.View r1 = (android.view.View) r1
            r1.getClass()
            android.view.View r1 = r1.findViewById(r4)
            android.widget.ViewFlipper r1 = (android.widget.ViewFlipper) r1
            r2 = 4
            r1.setDisplayedChild(r2)
            int r1 = r0.f34951s
            int r2 = r0.f34952t
            boolean r4 = r0.f34939g
            com.google.android.apps.gsa.assistant.settings.features.appactions.cz r1 = m25239d(r1, r2, r4, r3)
            com.google.android.apps.gsa.assistant.settings.features.appactions.cz r2 = com.google.android.apps.gsa.assistant.settings.features.appactions.C10307cz.APP_SPECIFIC_PAGE_ALL_TAB
            if (r1 == r2) goto L_0x03b1
            com.google.android.apps.gsa.assistant.settings.features.appactions.cz r2 = com.google.android.apps.gsa.assistant.settings.features.appactions.C10307cz.APP_SPECIFIC_PAGE_YOUR_TAB
            if (r1 != r2) goto L_0x04fd
        L_0x03b1:
            j$.util.Optional r1 = r0.f34943k
            java.lang.Object r1 = r1.get()
            android.view.View r1 = (android.view.View) r1
            r1.getClass()
            r2 = 2131437362(0x7f0b2732, float:1.849662E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            com.google.android.apps.gsa.assistant.settings.features.appactions.cw r2 = r0.f34933a
            android.content.Context r2 = r2.getContext()
            r3 = 2132093821(0x7f152b7d, float:1.9828078E38)
            java.lang.String r2 = r2.getString(r3)
            r1.setText(r2)
            return
        L_0x03d6:
            j$.util.Optional r1 = r0.f34943k
            java.lang.Object r1 = r1.get()
            android.view.View r1 = (android.view.View) r1
            r1.getClass()
            android.view.View r1 = r1.findViewById(r4)
            android.widget.ViewFlipper r1 = (android.widget.ViewFlipper) r1
            int r4 = r0.f34951s
            int r5 = r0.f34952t
            boolean r7 = r0.f34939g
            com.google.android.apps.gsa.assistant.settings.features.appactions.cz r4 = m25239d(r4, r5, r7, r3)
            int r5 = r4.f34921i
            r1.setDisplayedChild(r5)
            int r1 = r4.f34921i
            r5 = 8
            if (r1 != 0) goto L_0x041c
            j$.util.Optional r1 = r0.f34943k
            java.lang.Object r1 = r1.get()
            android.view.View r1 = (android.view.View) r1
            r1.getClass()
            r2 = 2131437294(0x7f0b26ee, float:1.8496483E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            com.google.android.apps.gsa.assistant.settings.features.appactions.cz r2 = com.google.android.apps.gsa.assistant.settings.features.appactions.C10307cz.MAIN_PAGE_EXPLORE_TAB
            if (r4 != r2) goto L_0x0416
            r2 = 0
            goto L_0x0418
        L_0x0416:
            r2 = 8
        L_0x0418:
            r1.setVisibility(r2)
            goto L_0x0491
        L_0x041c:
            com.google.android.apps.gsa.assistant.settings.features.appactions.cz r1 = com.google.android.apps.gsa.assistant.settings.features.appactions.C10307cz.MAIN_PAGE_YOUR_TAB
            java.lang.String r7 = "TabFragmentPeer"
            if (r4 != r1) goto L_0x0447
            j$.util.Optional r1 = r0.f34943k
            java.lang.Object r1 = r1.get()
            android.view.View r1 = (android.view.View) r1
            r1.getClass()
            r2 = 2131437340(0x7f0b271c, float:1.8496576E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.Button r1 = (android.widget.Button) r1
            r1.setVisibility(r10)
            com.google.android.apps.gsa.assistant.settings.features.appactions.b.c r2 = r0.f34940h
            r1.getClass()
            com.google.android.apps.gsa.assistant.settings.features.appactions.a.h r4 = new com.google.android.apps.gsa.assistant.settings.features.appactions.a.h
            r4.<init>(r6)
            r2.mo18355b(r1, r4, r7)
            goto L_0x0491
        L_0x0447:
            com.google.android.apps.gsa.assistant.settings.features.appactions.cz r1 = com.google.android.apps.gsa.assistant.settings.features.appactions.C10307cz.APP_SPECIFIC_PAGE_YOUR_TAB
            if (r4 != r1) goto L_0x0491
            j$.util.Optional r1 = r0.f34943k
            java.lang.Object r1 = r1.get()
            android.view.View r1 = (android.view.View) r1
            r1.getClass()
            r4 = 2131437261(0x7f0b26cd, float:1.8496416E38)
            android.view.View r1 = r1.findViewById(r4)
            android.widget.Button r1 = (android.widget.Button) r1
            r1.setVisibility(r10)
            com.google.android.apps.gsa.assistant.settings.features.appactions.b.c r4 = r0.f34940h
            r1.getClass()
            com.google.android.apps.gsa.assistant.settings.features.appactions.a.h r6 = new com.google.android.apps.gsa.assistant.settings.features.appactions.a.h
            r8 = 2
            r6.<init>(r8)
            r4.mo18355b(r1, r6, r7)
            java.lang.Object r1 = r23.get()
            com.google.assistant.at.aw r1 = (com.google.assistant.p3861at.C49838aw) r1
            j$.util.Optional r2 = r0.f34943k
            java.lang.Object r2 = r2.get()
            android.view.View r2 = (android.view.View) r2
            r2.getClass()
            r4 = 2131437260(0x7f0b26cc, float:1.8496414E38)
            android.view.View r2 = r2.findViewById(r4)
            android.view.ViewStub r2 = (android.view.ViewStub) r2
            j$.util.Optional r2 = p3186j$.util.Optional.ofNullable(r2)
            r0.m25238c(r1, r2)
        L_0x0491:
            int r1 = r3.size()
            com.google.android.apps.gsa.shared.m.c r2 = r0.f34942j
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90019by.f248051A
            boolean r2 = r2.mo79746e(r3)
            if (r2 == 0) goto L_0x04fd
            boolean r2 = r0.f34954v
            if (r2 == 0) goto L_0x04c3
            j$.util.Optional r2 = r0.f34943k
            java.lang.Object r2 = r2.get()
            android.view.View r2 = (android.view.View) r2
            r3 = 2131436302(0x7f0b230e, float:1.849447E38)
            android.view.View r2 = r2.findViewById(r3)
            r2.setVisibility(r10)
            r3 = 2131436927(0x7f0b257f, float:1.8495738E38)
            android.view.View r2 = r2.findViewById(r3)
            android.view.View$OnClickListener r3 = r19.m25237b()
            r2.setOnClickListener(r3)
        L_0x04c3:
            boolean r2 = r0.f34955w
            if (r2 == 0) goto L_0x04fd
            int r2 = r0.f34951s
            r3 = 2131433052(0x7f0b165c, float:1.8487879E38)
            r4 = 3
            if (r2 != r4) goto L_0x04e7
            int r2 = r0.f34952t
            r4 = 2
            if (r2 != r4) goto L_0x04e7
            r2 = 5
            if (r1 <= r2) goto L_0x04e7
            j$.util.Optional r1 = r0.f34943k
            java.lang.Object r1 = r1.get()
            android.view.View r1 = (android.view.View) r1
            android.view.View r1 = r1.findViewById(r3)
            r1.setVisibility(r5)
            return
        L_0x04e7:
            j$.util.Optional r1 = r0.f34943k
            java.lang.Object r1 = r1.get()
            android.view.View r1 = (android.view.View) r1
            android.view.View r1 = r1.findViewById(r3)
            r1.setVisibility(r10)
            android.view.View$OnClickListener r2 = r19.m25237b()
            r1.setOnClickListener(r2)
        L_0x04fd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.assistant.settings.features.appactions.C10312da.mo18409a(java.util.List, java.util.List, com.google.common.b.hd, j$.util.Optional):void");
    }
}
