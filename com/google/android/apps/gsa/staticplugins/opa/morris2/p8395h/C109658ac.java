package com.google.android.apps.gsa.staticplugins.opa.morris2.p8395h;

import android.app.ActivityManager;
import android.content.Context;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14096x;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14113an;
import com.google.android.libraries.assistant.auto.tng.morris.p1072f.p1076c.C14645a;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.assistant.p3897e.p3929l.p3930a.C52686as;
import com.google.assistant.p3897e.p3929l.p3930a.C52690aw;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59071e;
import com.google.common.p4580v.C60950i;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protos.p5129p.p5131b.C65849r;
import java.util.concurrent.Executor;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.h.ac */
/* compiled from: PG */
public final class C109658ac {

    /* renamed from: a */
    public static final C59071e f305404a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.morris2.h.ac");

    /* renamed from: b */
    public static final C58495hd f305405b;

    /* renamed from: c */
    public final C86124t f305406c;

    /* renamed from: d */
    public final C14645a f305407d;

    /* renamed from: e */
    public final Executor f305408e;

    /* renamed from: f */
    private final Optional f305409f;

    /* renamed from: g */
    private final C14113an f305410g;

    /* renamed from: h */
    private final Context f305411h;

    /* renamed from: i */
    private final C69464a f305412i;

    /* renamed from: j */
    private final C14096x f305413j;

    /* renamed from: k */
    private final C60950i f305414k;

    /* renamed from: l */
    private Optional f305415l = Optional.empty();

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C109657ab.NOT_ELIGIBLE_DISABLED_BY_SETTING, C37182a.f98021eo.mo40805c(C62722b.CANCELLED));
        gzVar.mo55429h(C109657ab.NOT_ELIGIBLE_DISABLED_BY_EXPERIMENT_FLAG, C37182a.f98016ej.mo40805c(C62722b.CANCELLED));
        gzVar.mo55429h(C109657ab.NOT_ELIGIBLE_DISABLED_BY_RAM_SIZE, C37182a.f97993eM.mo40805c(C62722b.CANCELLED));
        gzVar.mo55429h(C109657ab.NOT_ELIGIBLE_DISABLED_BY_SDK_VERSION, C37182a.f97994eN.mo40805c(C62722b.CANCELLED));
        gzVar.mo55429h(C109657ab.NOT_ELIGIBLE_DISABLED_BY_TALKBACK, C37182a.f98022ep.mo40805c(C62722b.CANCELLED));
        gzVar.mo55429h(C109657ab.NOT_ELIGIBLE_DISABLED_BY_OPA_AVAILABILITY, C37182a.f98020en.mo40805c(C62722b.CANCELLED));
        gzVar.mo55429h(C109657ab.NOT_ELIGIBLE_DISABLED_BY_CAR_MODE_ALREADY_ENABLED, C37182a.f98015ei.mo40805c(C62722b.CANCELLED));
        gzVar.mo55429h(C109657ab.NOT_ELIGIBLE_DISABLED_BY_OOBE, C37182a.f98019em.mo40805c(C62722b.CANCELLED));
        gzVar.mo55429h(C109657ab.NOT_ELIGIBLE_DISABLED_BY_LANDSCAPE, C37182a.f98017ek.mo40805c(C62722b.CANCELLED));
        gzVar.mo55429h(C109657ab.NOT_ELIGIBLE_DISABLED_BY_UPSIDE_DOWN, C37182a.f98018el.mo40805c(C62722b.CANCELLED));
        gzVar.mo55429h(C109657ab.NOT_ELIGIBLE_OPT_IN_NEEDED, C37182a.f98023eq.mo40805c(C62722b.CANCELLED));
        gzVar.mo55429h(C109657ab.NOT_ELIGIBLE_DISABLED_BY_OPT_IN, C37182a.f98024er.mo40805c(C62722b.CANCELLED));
        gzVar.mo55429h(C109657ab.NOT_ELIGIBLE_OPT_OUT_DIALOG_A_NEEDED, C37182a.f98025es.mo40805c(C62722b.CANCELLED));
        gzVar.mo55429h(C109657ab.NOT_ELIGIBLE_DISABLED_BY_OPT_OUT, C37182a.f98026et.mo40805c(C62722b.CANCELLED));
        gzVar.mo55429h(C109657ab.NOT_ELIGIBLE_OPT_OUT_DIALOG_B_NEEDED, C37182a.f98027eu.mo40805c(C62722b.CANCELLED));
        f305405b = gzVar.mo55427f(false);
    }

    public C109658ac(Context context, C86124t tVar, C14113an anVar, Optional optional, C69464a aVar, C14096x xVar, C14645a aVar2, Executor executor, C60950i iVar) {
        this.f305411h = context;
        this.f305409f = optional;
        this.f305406c = tVar;
        this.f305410g = anVar;
        this.f305412i = aVar;
        this.f305413j = xVar;
        this.f305407d = aVar2;
        this.f305408e = executor;
        this.f305414k = iVar;
    }

    /* renamed from: f */
    private final long m182501f() {
        ActivityManager activityManager = (ActivityManager) this.f305411h.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getClass();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0126  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.apps.gsa.staticplugins.opa.morris2.p8395h.C109657ab mo97941a() {
        /*
            r11 = this;
            g.a.a r0 = r11.f305412i
            java.lang.Object r0 = r0.mo17428b()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0013
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.staticplugins.opa.morris2.h.ab r0 = com.google.android.apps.gsa.staticplugins.opa.morris2.p8395h.C109657ab.NOT_ELIGIBLE_DISABLED_BY_EXPERIMENT_FLAG
            goto L_0x006a
        L_0x0013:
            long r0 = r11.m182501f()
            com.google.android.apps.gsa.search.core.i.t r2 = r11.f305406c
            com.google.android.apps.gsa.shared.m.f r3 = com.google.android.apps.gsa.shared.p7066m.C90051dc.f248884bm
            long r2 = r2.mo79743a(r3)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x0031
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            android.content.Context r0 = r11.f305411h
            long r1 = r11.m182501f()
            android.text.format.Formatter.formatFileSize(r0, r1)
            com.google.android.apps.gsa.staticplugins.opa.morris2.h.ab r0 = com.google.android.apps.gsa.staticplugins.opa.morris2.p8395h.C109657ab.NOT_ELIGIBLE_DISABLED_BY_RAM_SIZE
            goto L_0x006a
        L_0x0031:
            int r0 = android.os.Build.VERSION.SDK_INT
            long r0 = (long) r0
            com.google.android.apps.gsa.search.core.i.t r2 = r11.f305406c
            com.google.android.apps.gsa.shared.m.f r3 = com.google.android.apps.gsa.shared.p7066m.C90051dc.f248885bn
            long r2 = r2.mo79743a(r3)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x004c
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.search.core.i.t r0 = r11.f305406c
            com.google.android.apps.gsa.shared.m.f r1 = com.google.android.apps.gsa.shared.p7066m.C90051dc.f248885bn
            r0.mo79743a(r1)
            com.google.android.apps.gsa.staticplugins.opa.morris2.h.ab r0 = com.google.android.apps.gsa.staticplugins.opa.morris2.p8395h.C109657ab.NOT_ELIGIBLE_DISABLED_BY_SDK_VERSION
            goto L_0x006a
        L_0x004c:
            j$.util.Optional r0 = r11.f305409f
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0066
            j$.util.Optional r0 = r11.f305409f
            java.lang.Object r0 = r0.get()
            com.google.android.apps.gsa.assistant.shared.be r0 = (com.google.android.apps.gsa.assistant.shared.be) r0
            boolean r0 = r0.g()
            if (r0 != 0) goto L_0x0063
            goto L_0x0066
        L_0x0063:
            com.google.android.apps.gsa.staticplugins.opa.morris2.h.ab r0 = com.google.android.apps.gsa.staticplugins.opa.morris2.p8395h.C109657ab.ELIGIBLE
            goto L_0x006a
        L_0x0066:
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.staticplugins.opa.morris2.h.ab r0 = com.google.android.apps.gsa.staticplugins.opa.morris2.p8395h.C109657ab.NOT_ELIGIBLE_DISABLED_BY_OPA_AVAILABILITY
        L_0x006a:
            com.google.android.apps.gsa.staticplugins.opa.morris2.h.ab r1 = com.google.android.apps.gsa.staticplugins.opa.morris2.p8395h.C109657ab.ELIGIBLE
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x0073
            return r0
        L_0x0073:
            com.google.protos.p.b.r r0 = r11.mo97944d()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            int r1 = r0.f179004a
            r2 = 10
            if (r1 != r2) goto L_0x0084
            java.lang.Object r1 = r0.f179005b
            com.google.assistant.e.l.a.as r1 = (com.google.assistant.p3897e.p3929l.p3930a.C52686as) r1
            goto L_0x0086
        L_0x0084:
            com.google.assistant.e.l.a.as r1 = com.google.assistant.p3897e.p3929l.p3930a.C52686as.f138291q
        L_0x0086:
            com.google.assistant.e.l.a.aw r1 = r11.mo97943c(r0)
            com.google.assistant.e.l.a.aw r3 = com.google.assistant.p3897e.p3929l.p3930a.C52690aw.UNKNOWN_ENABLE_STATUS
            boolean r3 = r3.equals(r1)
            r4 = 4
            r5 = 1
            if (r3 != 0) goto L_0x009c
            com.google.assistant.e.l.a.aw r3 = com.google.assistant.p3897e.p3929l.p3930a.C52690aw.DEFAULT
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x0128
        L_0x009c:
            com.google.android.libraries.assistant.auto.tng.morris.b.x r1 = r11.f305413j
            com.google.android.libraries.storage.protostore.ab r1 = r1.f42764b     // Catch:{ InterruptedException -> 0x00ad, ExecutionException -> 0x00ab }
            com.google.common.util.concurrent.cx r1 = r1.mo46042d()     // Catch:{ InterruptedException -> 0x00ad, ExecutionException -> 0x00ab }
            java.lang.Object r1 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148472f(r1)     // Catch:{ InterruptedException -> 0x00ad, ExecutionException -> 0x00ab }
            com.google.android.libraries.assistant.auto.tng.morris.b.e r1 = (com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14077e) r1     // Catch:{ InterruptedException -> 0x00ad, ExecutionException -> 0x00ab }
            goto L_0x00c4
        L_0x00ab:
            r1 = move-exception
            goto L_0x00ae
        L_0x00ad:
            r1 = move-exception
        L_0x00ae:
            com.google.common.f.e r3 = com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14096x.f42763a
            com.google.common.f.x r3 = r3.mo56226d()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r7 = "Morris.DataStore"
            r3.mo56378ag(r6, r7)
            java.lang.String r6 = "#getDataBlocking: failed to get Morris data."
            r7 = 45313(0xb101, float:6.3497E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r1)).mo56372aa(r7)).mo56386p(r6)
            r1 = 0
        L_0x00c4:
            r3 = 2
            if (r1 == 0) goto L_0x00ee
            int r6 = r1.f42733a
            r6 = r6 & 8
            if (r6 == 0) goto L_0x0102
            com.google.android.libraries.assistant.auto.tng.morris.b.ah r6 = r1.f42738f
            if (r6 != 0) goto L_0x00d3
            com.google.android.libraries.assistant.auto.tng.morris.b.ah r6 = com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14073ah.f42721c
        L_0x00d3:
            int r6 = r6.f42723a
            com.google.android.libraries.assistant.auto.tng.morris.b.ah r1 = r1.f42738f
            if (r1 != 0) goto L_0x00db
            com.google.android.libraries.assistant.auto.tng.morris.b.ah r1 = com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14073ah.f42721c
        L_0x00db:
            int r1 = r1.f42723a
            if (r1 == 0) goto L_0x00e9
            if (r1 == r5) goto L_0x00e7
            if (r1 == r3) goto L_0x00e5
            r1 = 0
            goto L_0x00ea
        L_0x00e5:
            r1 = 4
            goto L_0x00ea
        L_0x00e7:
            r1 = 3
            goto L_0x00ea
        L_0x00e9:
            r1 = 2
        L_0x00ea:
            if (r1 != 0) goto L_0x0103
            r1 = 1
            goto L_0x0103
        L_0x00ee:
            com.google.common.f.e r1 = f305404a
            com.google.common.f.x r1 = r1.mo56226d()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r7 = "Morris.TriggerCond"
            r1.mo56378ag(r6, r7)
            java.lang.String r6 = "Received empty MorrisData."
            r7 = 25104(0x6210, float:3.5178E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r7)).mo56386p(r6)
        L_0x0102:
            r1 = 2
        L_0x0103:
            int r1 = r1 + -2
            if (r1 == r5) goto L_0x0126
            if (r1 == r3) goto L_0x0123
            int r1 = r0.f179004a
            if (r1 != r2) goto L_0x0112
            java.lang.Object r1 = r0.f179005b
            com.google.assistant.e.l.a.as r1 = (com.google.assistant.p3897e.p3929l.p3930a.C52686as) r1
            goto L_0x0114
        L_0x0112:
            com.google.assistant.e.l.a.as r1 = com.google.assistant.p3897e.p3929l.p3930a.C52686as.f138291q
        L_0x0114:
            int r3 = r1.f138293a
            r3 = r3 & r5
            if (r3 == 0) goto L_0x0120
            boolean r1 = r1.f138294b
            if (r1 != 0) goto L_0x0120
            com.google.assistant.e.l.a.aw r1 = com.google.assistant.p3897e.p3929l.p3930a.C52690aw.OPTED_OUT
            goto L_0x0128
        L_0x0120:
            com.google.assistant.e.l.a.aw r1 = com.google.assistant.p3897e.p3929l.p3930a.C52690aw.DEFAULT
            goto L_0x0128
        L_0x0123:
            com.google.assistant.e.l.a.aw r1 = com.google.assistant.p3897e.p3929l.p3930a.C52690aw.OPTED_OUT_FROM_PREVIEW
            goto L_0x0128
        L_0x0126:
            com.google.assistant.e.l.a.aw r1 = com.google.assistant.p3897e.p3929l.p3930a.C52690aw.ENABLED
        L_0x0128:
            com.google.assistant.e.l.a.aw r3 = com.google.assistant.p3897e.p3929l.p3930a.C52690aw.OPTED_OUT
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x0133
            com.google.android.apps.gsa.staticplugins.opa.morris2.h.ab r0 = com.google.android.apps.gsa.staticplugins.opa.morris2.p8395h.C109657ab.NOT_ELIGIBLE_DISABLED_BY_SETTING
            return r0
        L_0x0133:
            com.google.android.apps.gsa.search.core.i.t r3 = r11.f305406c
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90051dc.f248899ca
            boolean r3 = r3.mo79746e(r6)
            r6 = 5
            if (r3 == 0) goto L_0x0151
            int r0 = r1.ordinal()
            if (r0 == 0) goto L_0x014e
            if (r0 == r5) goto L_0x014e
            if (r0 == r4) goto L_0x014b
            if (r0 == r6) goto L_0x014b
            goto L_0x01a6
        L_0x014b:
            com.google.android.apps.gsa.staticplugins.opa.morris2.h.ab r0 = com.google.android.apps.gsa.staticplugins.opa.morris2.p8395h.C109657ab.NOT_ELIGIBLE_DISABLED_BY_OPT_IN
            return r0
        L_0x014e:
            com.google.android.apps.gsa.staticplugins.opa.morris2.h.ab r0 = com.google.android.apps.gsa.staticplugins.opa.morris2.p8395h.C109657ab.NOT_ELIGIBLE_OPT_IN_NEEDED
            return r0
        L_0x0151:
            com.google.android.apps.gsa.search.core.i.t r3 = r11.f305406c
            com.google.android.apps.gsa.shared.m.f r7 = com.google.android.apps.gsa.shared.p7066m.C90051dc.f248808aP
            long r7 = r3.mo79743a(r7)
            r9 = 0
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 <= 0) goto L_0x01a6
            int r1 = r1.ordinal()
            if (r1 == 0) goto L_0x01a3
            if (r1 == r5) goto L_0x01a3
            if (r1 == r4) goto L_0x01a3
            if (r1 == r6) goto L_0x016c
            goto L_0x01a6
        L_0x016c:
            int r1 = r0.f179004a
            if (r1 != r2) goto L_0x0175
            java.lang.Object r0 = r0.f179005b
            com.google.assistant.e.l.a.as r0 = (com.google.assistant.p3897e.p3929l.p3930a.C52686as) r0
            goto L_0x0177
        L_0x0175:
            com.google.assistant.e.l.a.as r0 = com.google.assistant.p3897e.p3929l.p3930a.C52686as.f138291q
        L_0x0177:
            com.google.protobuf.fg r0 = r0.f138308p
            if (r0 != 0) goto L_0x017d
            com.google.protobuf.fg r0 = com.google.protobuf.C63042fg.f170152c
        L_0x017d:
            j$.time.Instant r0 = com.google.protobuf.p4750c.C62950b.m95474e(r0)
            com.google.android.apps.gsa.search.core.i.t r1 = r11.f305406c
            com.google.android.apps.gsa.shared.m.f r2 = com.google.android.apps.gsa.shared.p7066m.C90051dc.f248925v
            long r1 = r1.mo79743a(r2)
            j$.time.Duration r1 = p3186j$.time.Duration.ofSeconds(r1)
            j$.time.Instant r0 = r0.plus(r1)
            com.google.common.v.i r1 = r11.f305414k
            j$.time.Instant r1 = r1.mo57444a()
            boolean r0 = r0.isBefore(r1)
            if (r0 == 0) goto L_0x01a0
            com.google.android.apps.gsa.staticplugins.opa.morris2.h.ab r0 = com.google.android.apps.gsa.staticplugins.opa.morris2.p8395h.C109657ab.NOT_ELIGIBLE_OPT_OUT_DIALOG_B_NEEDED
            goto L_0x01a2
        L_0x01a0:
            com.google.android.apps.gsa.staticplugins.opa.morris2.h.ab r0 = com.google.android.apps.gsa.staticplugins.opa.morris2.p8395h.C109657ab.NOT_ELIGIBLE_DISABLED_BY_OPT_OUT
        L_0x01a2:
            return r0
        L_0x01a3:
            com.google.android.apps.gsa.staticplugins.opa.morris2.h.ab r0 = com.google.android.apps.gsa.staticplugins.opa.morris2.p8395h.C109657ab.NOT_ELIGIBLE_OPT_OUT_DIALOG_A_NEEDED
            return r0
        L_0x01a6:
            com.google.android.apps.gsa.staticplugins.opa.morris2.h.ab r0 = com.google.android.apps.gsa.staticplugins.opa.morris2.p8395h.C109657ab.ELIGIBLE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.morris2.p8395h.C109658ac.mo97941a():com.google.android.apps.gsa.staticplugins.opa.morris2.h.ab");
    }

    /* renamed from: b */
    public final C52690aw mo97942b() {
        if (this.f305415l.isEmpty()) {
            return mo97943c(mo97944d());
        }
        return (C52690aw) this.f305415l.get();
    }

    /* renamed from: c */
    public final C52690aw mo97943c(C65849r rVar) {
        C52686as asVar;
        if (rVar.f179004a == 10) {
            asVar = (C52686as) rVar.f179005b;
        } else {
            asVar = C52686as.f138291q;
        }
        C52690aw a = C52690aw.m86687a(asVar.f138307o);
        if (a == null) {
            a = C52690aw.DEFAULT;
        }
        Optional of = Optional.m71637of(a);
        this.f305415l = of;
        return (C52690aw) of.get();
    }

    /* renamed from: d */
    public final C65849r mo97944d() {
        this.f305410g.mo21424b(C37182a.f97947dT.mo40813g());
        C65849r rVar = (C65849r) Collection.EL.stream(this.f305407d.mo21588a()).findFirst().orElse(C65849r.f179002c);
        this.f305410g.mo21424b(C37182a.f97948dU.mo40813g());
        return rVar;
    }

    /* renamed from: e */
    public final boolean mo97945e() {
        return mo97941a() == C109657ab.ELIGIBLE;
    }
}
