package com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1149g;

import android.content.pm.PackageManager;
import com.google.android.libraries.assistant.auto.ondevice.p705a.C11836c;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.C15593a;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1152b.C15658j;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1152b.C15666r;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1152b.C15668t;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.c.a.g.n */
/* compiled from: PG */
public final class C15642n implements C15593a {

    /* renamed from: a */
    public static final C59071e f46753a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.r.c.a.g.n");

    /* renamed from: d */
    private static final Pattern f46754d = Pattern.compile("video|Video");

    /* renamed from: b */
    public final Executor f46755b;

    /* renamed from: c */
    public final C11836c f46756c;

    /* renamed from: e */
    private final PackageManager f46757e;

    /* renamed from: f */
    private final C69464a f46758f;

    public C15642n(PackageManager packageManager, C69464a aVar, C11836c cVar, Executor executor) {
        this.f46757e = packageManager;
        this.f46758f = aVar;
        this.f46756c = cVar;
        this.f46755b = executor;
    }

    /* renamed from: a */
    public final C15668t mo22414a(C15666r rVar) {
        C15639k kVar = new C15639k(this, rVar);
        C60870cx n = C60856cj.m92905n(C47810es.m84965e(kVar), this.f46755b);
        C15658j jVar = new C15658j();
        jVar.f46787a = n;
        return jVar.mo22491a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x036a  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0389  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0390  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo22458b(com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1149g.C15641m r9, java.lang.String r10) {
        /*
            r8 = this;
            java.util.regex.Pattern r0 = f46754d
            java.util.regex.Matcher r10 = r0.matcher(r10)
            boolean r10 = r10.find()
            if (r10 == 0) goto L_0x0022
            com.google.android.libraries.assistant.auto.ondevice.a.c r9 = r8.f46756c
            r10 = 2132090162(0x7f151d32, float:1.9820656E38)
            com.google.common.util.concurrent.cx r9 = r9.mo20177a(r10)
            com.google.android.libraries.assistant.auto.tng.r.c.a.g.f r10 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1149g.C15634f.f46745a
            java.util.concurrent.Executor r0 = r8.f46755b
            com.google.common.base.ah r10 = com.google.apps.tiktok.tracing.C47810es.m84963c(r10)
            com.google.common.util.concurrent.cx r9 = com.google.common.util.concurrent.C60922j.m93044g(r9, r10, r0)
            return r9
        L_0x0022:
            g.a.a r10 = r8.f46758f
            java.lang.Object r10 = r10.mo17428b()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L_0x0046
            com.google.android.libraries.assistant.auto.ondevice.a.c r9 = r8.f46756c
            r10 = 2132091731(0x7f152353, float:1.9823839E38)
            com.google.common.util.concurrent.cx r9 = r9.mo20177a(r10)
            com.google.android.libraries.assistant.auto.tng.r.c.a.g.g r10 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1149g.C15635g.f46746a
            java.util.concurrent.Executor r0 = r8.f46755b
            com.google.common.base.ah r10 = com.google.apps.tiktok.tracing.C47810es.m84963c(r10)
            com.google.common.util.concurrent.cx r9 = com.google.common.util.concurrent.C60922j.m93044g(r9, r10, r0)
            return r9
        L_0x0046:
            com.google.assistant.e.j.hz r10 = com.google.assistant.p3897e.p3921j.C52174hz.f136892m
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.assistant.e.j.hw r10 = (com.google.assistant.p3897e.p3921j.C52171hw) r10
            com.google.assistant.e.j.wo r0 = com.google.assistant.p3897e.p3921j.C52568wo.f137992v
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.j.wj r0 = (com.google.assistant.p3897e.p3921j.C52563wj) r0
            com.google.common.base.ax r1 = r9.mo22454g()
            boolean r1 = r1.mo56113h()
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x00b7
            com.google.assistant.e.j.wn r1 = com.google.assistant.p3897e.p3921j.C52567wn.TRACK
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.assistant.e.j.wo r4 = (com.google.assistant.p3897e.p3921j.C52568wo) r4
            int r1 = r1.f137991y
            r4.f138003j = r1
            int r1 = r4.f137994a
            r1 = r1 | 512(0x200, float:7.175E-43)
            r4.f137994a = r1
            com.google.common.base.ax r1 = r9.mo22454g()
            java.lang.Object r1 = r1.mo56107c()
            java.lang.String r1 = (java.lang.String) r1
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.assistant.e.j.wo r4 = (com.google.assistant.p3897e.p3921j.C52568wo) r4
            r1.getClass()
            int r5 = r4.f137994a
            r5 = r5 | r3
            r4.f137994a = r5
            r4.f137998e = r1
            com.google.common.base.ax r1 = r9.mo22450d()
            boolean r1 = r1.mo56113h()
            if (r1 == 0) goto L_0x01c0
            com.google.common.base.ax r1 = r9.mo22450d()
            java.lang.Object r1 = r1.mo56107c()
            java.lang.String r1 = (java.lang.String) r1
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.assistant.e.j.wo r4 = (com.google.assistant.p3897e.p3921j.C52568wo) r4
            r1.getClass()
            int r5 = r4.f137994a
            r5 = r5 | r2
            r4.f137994a = r5
            r4.f137999f = r1
            goto L_0x01c0
        L_0x00b7:
            com.google.common.base.ax r1 = r9.mo22447a()
            boolean r1 = r1.mo56113h()
            if (r1 == 0) goto L_0x0116
            com.google.assistant.e.j.wn r1 = com.google.assistant.p3897e.p3921j.C52567wn.ALBUM
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.assistant.e.j.wo r4 = (com.google.assistant.p3897e.p3921j.C52568wo) r4
            int r1 = r1.f137991y
            r4.f138003j = r1
            int r1 = r4.f137994a
            r1 = r1 | 512(0x200, float:7.175E-43)
            r4.f137994a = r1
            com.google.common.base.ax r1 = r9.mo22447a()
            java.lang.Object r1 = r1.mo56107c()
            java.lang.String r1 = (java.lang.String) r1
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.assistant.e.j.wo r4 = (com.google.assistant.p3897e.p3921j.C52568wo) r4
            r1.getClass()
            int r5 = r4.f137994a
            r5 = r5 | r3
            r4.f137994a = r5
            r4.f137998e = r1
            com.google.common.base.ax r1 = r9.mo22450d()
            boolean r1 = r1.mo56113h()
            if (r1 == 0) goto L_0x01c0
            com.google.common.base.ax r1 = r9.mo22450d()
            java.lang.Object r1 = r1.mo56107c()
            java.lang.String r1 = (java.lang.String) r1
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.assistant.e.j.wo r4 = (com.google.assistant.p3897e.p3921j.C52568wo) r4
            r1.getClass()
            int r5 = r4.f137994a
            r5 = r5 | r2
            r4.f137994a = r5
            r4.f137999f = r1
            goto L_0x01c0
        L_0x0116:
            com.google.common.base.ax r1 = r9.mo22450d()
            boolean r1 = r1.mo56113h()
            if (r1 == 0) goto L_0x014f
            com.google.assistant.e.j.wn r1 = com.google.assistant.p3897e.p3921j.C52567wn.ARTIST
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.assistant.e.j.wo r4 = (com.google.assistant.p3897e.p3921j.C52568wo) r4
            int r1 = r1.f137991y
            r4.f138003j = r1
            int r1 = r4.f137994a
            r1 = r1 | 512(0x200, float:7.175E-43)
            r4.f137994a = r1
            com.google.common.base.ax r1 = r9.mo22450d()
            java.lang.Object r1 = r1.mo56107c()
            java.lang.String r1 = (java.lang.String) r1
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.assistant.e.j.wo r4 = (com.google.assistant.p3897e.p3921j.C52568wo) r4
            r1.getClass()
            int r5 = r4.f137994a
            r5 = r5 | r3
            r4.f137994a = r5
            r4.f137998e = r1
            goto L_0x01c0
        L_0x014f:
            com.google.common.base.ax r1 = r9.mo22453f()
            boolean r1 = r1.mo56113h()
            if (r1 == 0) goto L_0x0188
            com.google.assistant.e.j.wn r1 = com.google.assistant.p3897e.p3921j.C52567wn.PLAYLIST
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.assistant.e.j.wo r4 = (com.google.assistant.p3897e.p3921j.C52568wo) r4
            int r1 = r1.f137991y
            r4.f138003j = r1
            int r1 = r4.f137994a
            r1 = r1 | 512(0x200, float:7.175E-43)
            r4.f137994a = r1
            com.google.common.base.ax r1 = r9.mo22453f()
            java.lang.Object r1 = r1.mo56107c()
            java.lang.String r1 = (java.lang.String) r1
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.assistant.e.j.wo r4 = (com.google.assistant.p3897e.p3921j.C52568wo) r4
            r1.getClass()
            int r5 = r4.f137994a
            r5 = r5 | r3
            r4.f137994a = r5
            r4.f137998e = r1
            goto L_0x01c0
        L_0x0188:
            com.google.common.base.ax r1 = r9.mo22451e()
            boolean r1 = r1.mo56113h()
            if (r1 == 0) goto L_0x01cb
            com.google.assistant.e.j.wn r1 = com.google.assistant.p3897e.p3921j.C52567wn.MUSIC_GENRE
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.assistant.e.j.wo r4 = (com.google.assistant.p3897e.p3921j.C52568wo) r4
            int r1 = r1.f137991y
            r4.f138003j = r1
            int r1 = r4.f137994a
            r1 = r1 | 512(0x200, float:7.175E-43)
            r4.f137994a = r1
            com.google.common.base.ax r1 = r9.mo22451e()
            java.lang.Object r1 = r1.mo56107c()
            java.lang.String r1 = (java.lang.String) r1
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.assistant.e.j.wo r4 = (com.google.assistant.p3897e.p3921j.C52568wo) r4
            r1.getClass()
            int r5 = r4.f137994a
            r5 = r5 | r3
            r4.f137994a = r5
            r4.f137998e = r1
        L_0x01c0:
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.j.wo r0 = (com.google.assistant.p3897e.p3921j.C52568wo) r0
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)
            goto L_0x01cd
        L_0x01cb:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
        L_0x01cd:
            boolean r1 = r0.mo56113h()
            if (r1 == 0) goto L_0x0210
            java.lang.Object r1 = r0.mo56107c()
            com.google.assistant.e.j.wo r1 = (com.google.assistant.p3897e.p3921j.C52568wo) r1
            r10.copyOnWrite()
            com.google.protobuf.bv r4 = r10.instance
            com.google.assistant.e.j.hz r4 = (com.google.assistant.p3897e.p3921j.C52174hz) r4
            r1.getClass()
            r4.f136897d = r1
            int r1 = r4.f136894a
            r1 = r1 | 8
            r4.f136894a = r1
            java.lang.Object r1 = r0.mo56107c()
            com.google.assistant.e.j.wo r1 = (com.google.assistant.p3897e.p3921j.C52568wo) r1
            int r1 = r1.f137994a
            r1 = r1 & r3
            if (r1 == 0) goto L_0x0210
            java.lang.Object r0 = r0.mo56107c()
            com.google.assistant.e.j.wo r0 = (com.google.assistant.p3897e.p3921j.C52568wo) r0
            java.lang.String r0 = r0.f137998e
            r10.copyOnWrite()
            com.google.protobuf.bv r1 = r10.instance
            com.google.assistant.e.j.hz r1 = (com.google.assistant.p3897e.p3921j.C52174hz) r1
            r0.getClass()
            int r4 = r1.f136894a
            r4 = r4 | 32
            r1.f136894a = r4
            r1.f136901h = r0
        L_0x0210:
            com.google.common.base.ax r0 = r9.mo22449c()
            boolean r0 = r0.mo56113h()
            r1 = 0
            if (r0 == 0) goto L_0x0221
            com.google.common.base.ax r9 = r9.mo22449c()
            goto L_0x0295
        L_0x0221:
            com.google.common.base.ax r0 = r9.mo22448b()
            boolean r0 = r0.mo56113h()
            if (r0 == 0) goto L_0x0293
            com.google.common.base.ax r9 = r9.mo22448b()
            java.lang.Object r9 = r9.mo56107c()
            java.lang.String r9 = (java.lang.String) r9
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r4 = "android.intent.action.MAIN"
            android.content.Intent r0 = r0.setAction(r4)
            java.lang.String r4 = "android.intent.category.LAUNCHER"
            r0.addCategory(r4)
            android.content.pm.PackageManager r4 = r8.f46757e
            java.util.List r0 = r4.queryIntentActivities(r0, r1)
            if (r0 != 0) goto L_0x0250
            com.google.common.base.b r9 = com.google.common.base.C58836b.f156633a
            goto L_0x0295
        L_0x0250:
            java.util.Iterator r0 = r0.iterator()
        L_0x0254:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0293
            java.lang.Object r4 = r0.next()
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            android.content.pm.ActivityInfo r5 = r4.activityInfo
            if (r5 == 0) goto L_0x0254
            android.content.pm.ActivityInfo r5 = r4.activityInfo
            android.content.pm.ApplicationInfo r5 = r5.applicationInfo
            if (r5 == 0) goto L_0x0254
            android.content.pm.ActivityInfo r5 = r4.activityInfo
            java.lang.String r5 = r5.packageName
            if (r5 == 0) goto L_0x0254
            android.content.pm.ActivityInfo r5 = r4.activityInfo
            java.lang.String r5 = r5.packageName
            android.content.pm.PackageManager r6 = r8.f46757e
            android.content.pm.ActivityInfo r4 = r4.activityInfo
            android.content.pm.ApplicationInfo r4 = r4.applicationInfo
            java.lang.CharSequence r4 = r6.getApplicationLabel(r4)
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            if (r6 != 0) goto L_0x0254
            java.lang.String r4 = r4.toString()
            boolean r4 = com.google.common.base.C58890d.m90990e(r9, r4)
            if (r4 == 0) goto L_0x0254
            com.google.common.base.ax r9 = com.google.common.base.C58833ax.m90834k(r5)
            goto L_0x0295
        L_0x0293:
            com.google.common.base.b r9 = com.google.common.base.C58836b.f156633a
        L_0x0295:
            boolean r0 = r9.mo56113h()
            if (r0 == 0) goto L_0x036a
            java.lang.Object r0 = r9.mo56107c()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x02a9
            goto L_0x036a
        L_0x02a9:
            java.lang.Object r9 = r9.mo56107c()
            java.lang.String r9 = (java.lang.String) r9
            com.google.assistant.e.c.c.ev r0 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.c.c.es r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51055es) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.assistant.e.c.c.ev r4 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r4
            r9.getClass()
            int r5 = r4.f132943a
            r5 = r5 | r3
            r4.f132943a = r5
            r4.f132944b = r9
            android.content.pm.PackageManager r4 = r8.f46757e
            android.content.Intent r4 = r4.getLaunchIntentForPackage(r9)
            if (r4 == 0) goto L_0x02e6
            java.lang.String r4 = r4.toUri(r1)
            r0.copyOnWrite()
            com.google.protobuf.bv r5 = r0.instance
            com.google.assistant.e.c.c.ev r5 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r5
            r4.getClass()
            int r6 = r5.f132943a
            r6 = r6 | 32
            r5.f132943a = r6
            r5.f132949g = r4
        L_0x02e6:
            android.content.pm.PackageManager r4 = r8.f46757e     // Catch:{ NameNotFoundException -> 0x0358 }
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo(r9, r1)     // Catch:{ NameNotFoundException -> 0x0358 }
            android.content.pm.PackageManager r5 = r8.f46757e     // Catch:{ NameNotFoundException -> 0x0358 }
            java.lang.CharSequence r4 = r5.getApplicationLabel(r4)     // Catch:{ NameNotFoundException -> 0x0358 }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ NameNotFoundException -> 0x0358 }
            if (r5 != 0) goto L_0x030e
            java.lang.String r4 = r4.toString()     // Catch:{ NameNotFoundException -> 0x0358 }
            r0.copyOnWrite()     // Catch:{ NameNotFoundException -> 0x0358 }
            com.google.protobuf.bv r5 = r0.instance     // Catch:{ NameNotFoundException -> 0x0358 }
            com.google.assistant.e.c.c.ev r5 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r5     // Catch:{ NameNotFoundException -> 0x0358 }
            r4.getClass()     // Catch:{ NameNotFoundException -> 0x0358 }
            int r6 = r5.f132943a     // Catch:{ NameNotFoundException -> 0x0358 }
            r6 = r6 | 16
            r5.f132943a = r6     // Catch:{ NameNotFoundException -> 0x0358 }
            r5.f132948f = r4     // Catch:{ NameNotFoundException -> 0x0358 }
        L_0x030e:
            android.content.pm.PackageManager r4 = r8.f46757e     // Catch:{ NameNotFoundException -> 0x0358 }
            android.content.pm.PackageInfo r4 = r4.getPackageInfo(r9, r1)     // Catch:{ NameNotFoundException -> 0x0358 }
            android.content.pm.ApplicationInfo r5 = r4.applicationInfo     // Catch:{ NameNotFoundException -> 0x0358 }
            if (r5 == 0) goto L_0x0331
            android.content.pm.ApplicationInfo r5 = r4.applicationInfo     // Catch:{ NameNotFoundException -> 0x0358 }
            boolean r5 = r5.enabled     // Catch:{ NameNotFoundException -> 0x0358 }
            if (r5 == 0) goto L_0x0331
            long r4 = r4.getLongVersionCode()     // Catch:{ NameNotFoundException -> 0x0358 }
            r0.copyOnWrite()     // Catch:{ NameNotFoundException -> 0x0358 }
            com.google.protobuf.bv r6 = r0.instance     // Catch:{ NameNotFoundException -> 0x0358 }
            com.google.assistant.e.c.c.ev r6 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r6     // Catch:{ NameNotFoundException -> 0x0358 }
            int r7 = r6.f132943a     // Catch:{ NameNotFoundException -> 0x0358 }
            r7 = r7 | 4
            r6.f132943a = r7     // Catch:{ NameNotFoundException -> 0x0358 }
            r6.f132946d = r4     // Catch:{ NameNotFoundException -> 0x0358 }
        L_0x0331:
            com.google.assistant.e.c.c.gh r9 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.assistant.e.c.c.gg r9 = (com.google.assistant.p3897e.p3902c.p3907c.C51097gg) r9
            r9.copyOnWrite()
            com.google.protobuf.bv r4 = r9.instance
            com.google.assistant.e.c.c.gh r4 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r4
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.c.c.ev r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r0
            r0.getClass()
            r4.f133013c = r0
            r4.f133012b = r3
            com.google.protobuf.bv r9 = r9.build()
            com.google.assistant.e.c.c.gh r9 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r9
            com.google.common.base.ax r9 = com.google.common.base.C58833ax.m90834k(r9)
            goto L_0x037a
        L_0x0358:
            r0 = move-exception
            com.google.common.f.e r4 = f46753a
            com.google.common.f.x r4 = r4.mo56226d()
            java.lang.String r5 = "Failed to get app; couldn't find package name: %s"
            r6 = 46232(0xb498, float:6.4785E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56382g(r0)).mo56372aa(r6)).mo56389s(r5, r9)
            com.google.common.base.b r9 = com.google.common.base.C58836b.f156633a
            goto L_0x037a
        L_0x036a:
            com.google.common.f.e r9 = f46753a
            com.google.common.f.x r9 = r9.mo56226d()
            java.lang.String r0 = "Failed to populate provider, null or empty package name."
            r4 = 46230(0xb496, float:6.4782E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56372aa(r4)).mo56386p(r0)
            com.google.common.base.b r9 = com.google.common.base.C58836b.f156633a
        L_0x037a:
            com.google.android.libraries.assistant.auto.tng.r.c.a.g.c r0 = new com.google.android.libraries.assistant.auto.tng.r.c.a.g.c
            r0.<init>(r10)
            com.google.common.base.ax r9 = r9.mo56106b(r0)
            boolean r10 = r9.mo56113h()
            if (r10 != 0) goto L_0x0390
            com.google.common.base.b r9 = com.google.common.base.C58836b.f156633a
            com.google.common.util.concurrent.cx r9 = com.google.common.util.concurrent.C60856cj.m92900i(r9)
            return r9
        L_0x0390:
            com.google.assistant.e.j.ia r10 = com.google.assistant.p3897e.p3921j.C52176ia.f136911k
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.assistant.e.j.hv r10 = (com.google.assistant.p3897e.p3921j.C52170hv) r10
            java.lang.Object r9 = r9.mo56107c()
            com.google.assistant.e.j.hz r9 = (com.google.assistant.p3897e.p3921j.C52174hz) r9
            r10.mo53808d(r9)
            com.google.protobuf.bv r9 = r10.build()
            com.google.assistant.e.j.ia r9 = (com.google.assistant.p3897e.p3921j.C52176ia) r9
            com.google.assistant.e.j.dw r10 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.assistant.e.j.dv r10 = (com.google.assistant.p3897e.p3921j.C51806dv) r10
            com.google.assistant.e.j.kc r0 = com.google.assistant.p3897e.p3921j.C52232kc.f137062d
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.j.kb r0 = (com.google.assistant.p3897e.p3921j.C52231kb) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.assistant.e.j.kc r4 = (com.google.assistant.p3897e.p3921j.C52232kc) r4
            int r5 = r4.f137064a
            r5 = r5 | r3
            r4.f137064a = r5
            java.lang.String r5 = "play_media_args"
            r4.f137065b = r5
            com.google.assistant.e.j.ka r4 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.assistant.e.j.jz r4 = (com.google.assistant.p3897e.p3921j.C52228jz) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.assistant.e.j.ka r5 = (com.google.assistant.p3897e.p3921j.C52230ka) r5
            int r6 = r5.f137059a
            r6 = r6 | r3
            r5.f137059a = r6
            java.lang.String r6 = "assistant.api.client_op.PlayMediaArgs"
            r5.f137060b = r6
            com.google.protobuf.z r5 = r9.toByteString()
            r4.copyOnWrite()
            com.google.protobuf.bv r6 = r4.instance
            com.google.assistant.e.j.ka r6 = (com.google.assistant.p3897e.p3921j.C52230ka) r6
            r5.getClass()
            int r7 = r6.f137059a
            r7 = r7 | r2
            r6.f137059a = r7
            r6.f137061c = r5
            r0.copyOnWrite()
            com.google.protobuf.bv r5 = r0.instance
            com.google.assistant.e.j.kc r5 = (com.google.assistant.p3897e.p3921j.C52232kc) r5
            com.google.protobuf.bv r4 = r4.build()
            com.google.assistant.e.j.ka r4 = (com.google.assistant.p3897e.p3921j.C52230ka) r4
            r4.getClass()
            r5.f137066c = r4
            int r4 = r5.f137064a
            r4 = r4 | r2
            r5.f137064a = r4
            r10.mo53732b(r0)
            com.google.protobuf.bv r10 = r10.build()
            com.google.assistant.e.j.dw r10 = (com.google.assistant.p3897e.p3921j.C51807dw) r10
            com.google.assistant.e.j.dy r0 = com.google.assistant.p3897e.p3921j.C51809dy.f135933f
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.j.dx r0 = (com.google.assistant.p3897e.p3921j.C51808dx) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.assistant.e.j.dy r4 = (com.google.assistant.p3897e.p3921j.C51809dy) r4
            int r5 = r4.f135935a
            r5 = r5 | r3
            r4.f135935a = r5
            java.lang.String r5 = "media.PLAY_MEDIA"
            r4.f135936b = r5
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.assistant.e.j.dy r4 = (com.google.assistant.p3897e.p3921j.C51809dy) r4
            r10.getClass()
            r4.f135938d = r10
            int r5 = r4.f135935a
            r5 = r5 | 4
            r4.f135935a = r5
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.j.dy r0 = (com.google.assistant.p3897e.p3921j.C51809dy) r0
            com.google.assistant.e.j.dy r4 = com.google.assistant.p3897e.p3921j.C51809dy.f135933f
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.assistant.e.j.dx r4 = (com.google.assistant.p3897e.p3921j.C51808dx) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.assistant.e.j.dy r5 = (com.google.assistant.p3897e.p3921j.C51809dy) r5
            int r6 = r5.f135935a
            r6 = r6 | r3
            r5.f135935a = r6
            java.lang.String r6 = "media.PREPARE_MEDIA"
            r5.f135936b = r6
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.assistant.e.j.dy r5 = (com.google.assistant.p3897e.p3921j.C51809dy) r5
            r10.getClass()
            r5.f135938d = r10
            int r10 = r5.f135935a
            r10 = r10 | 4
            r5.f135935a = r10
            com.google.protobuf.bv r10 = r4.build()
            com.google.assistant.e.j.dy r10 = (com.google.assistant.p3897e.p3921j.C51809dy) r10
            com.google.protobuf.cq r4 = r9.f136914b
            java.lang.Object r4 = r4.get(r1)
            com.google.assistant.e.j.hz r4 = (com.google.assistant.p3897e.p3921j.C52174hz) r4
            com.google.assistant.e.j.wo r4 = r4.f136897d
            if (r4 != 0) goto L_0x0482
            com.google.assistant.e.j.wo r4 = com.google.assistant.p3897e.p3921j.C52568wo.f137992v
        L_0x0482:
            java.lang.String r4 = r4.f137998e
            com.google.protobuf.cq r9 = r9.f136914b
            java.lang.Object r9 = r9.get(r1)
            com.google.assistant.e.j.hz r9 = (com.google.assistant.p3897e.p3921j.C52174hz) r9
            com.google.assistant.e.c.c.gh r9 = r9.f136896c
            if (r9 != 0) goto L_0x0492
            com.google.assistant.e.c.c.gh r9 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
        L_0x0492:
            int r5 = r9.f133012b
            if (r5 != r3) goto L_0x049b
            java.lang.Object r9 = r9.f133013c
            com.google.assistant.e.c.c.ev r9 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r9
            goto L_0x049d
        L_0x049b:
            com.google.assistant.e.c.c.ev r9 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
        L_0x049d:
            java.lang.String r9 = r9.f132948f
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x04bf
            com.google.android.libraries.assistant.auto.ondevice.a.c r2 = r8.f46756c
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r1] = r9
            r9 = 2132091304(0x7f1521a8, float:1.9822972E38)
            com.google.common.util.concurrent.cx r9 = r2.mo20178b(r9, r3)
            com.google.android.libraries.assistant.auto.tng.r.c.a.g.d r1 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1149g.C15632d.f46743a
            java.util.concurrent.Executor r2 = r8.f46755b
            com.google.common.base.ah r1 = com.google.apps.tiktok.tracing.C47810es.m84963c(r1)
            com.google.common.util.concurrent.cx r9 = com.google.common.util.concurrent.C60922j.m93044g(r9, r1, r2)
            goto L_0x04da
        L_0x04bf:
            com.google.android.libraries.assistant.auto.ondevice.a.c r5 = r8.f46756c
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r9
            r2[r3] = r4
            r9 = 2132091303(0x7f1521a7, float:1.982297E38)
            com.google.common.util.concurrent.cx r9 = r5.mo20178b(r9, r2)
            com.google.android.libraries.assistant.auto.tng.r.c.a.g.e r1 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1149g.C15633e.f46744a
            java.util.concurrent.Executor r2 = r8.f46755b
            com.google.common.base.ah r1 = com.google.apps.tiktok.tracing.C47810es.m84963c(r1)
            com.google.common.util.concurrent.cx r9 = com.google.common.util.concurrent.C60922j.m93044g(r9, r1, r2)
        L_0x04da:
            com.google.android.libraries.assistant.auto.tng.r.c.a.g.h r1 = new com.google.android.libraries.assistant.auto.tng.r.c.a.g.h
            r1.<init>(r10, r0)
            java.util.concurrent.Executor r10 = r8.f46755b
            com.google.common.base.ah r0 = com.google.apps.tiktok.tracing.C47810es.m84963c(r1)
            com.google.common.util.concurrent.cx r9 = com.google.common.util.concurrent.C60922j.m93044g(r9, r0, r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1149g.C15642n.mo22458b(com.google.android.libraries.assistant.auto.tng.r.c.a.g.m, java.lang.String):com.google.common.util.concurrent.cx");
    }
}
