package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: kotlinx.coroutines.ba */
/* compiled from: PG */
public final class C71600ba {

    /* renamed from: a */
    public static final boolean f191036a;

    /* renamed from: b */
    public static final boolean f191037b;

    /* renamed from: c */
    public static final AtomicLong f191038c = new AtomicLong(0);

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        if (r0.equals("on") != false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        if (r0.equals(com.evernote.android.state.BuildConfig.FLAVOR) != false) goto L_0x0041;
     */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.debug"
            java.lang.String r0 = kotlinx.coroutines.p5579e.C71710ar.m104848a(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x005c
            int r3 = r0.hashCode()
            if (r3 == 0) goto L_0x0039
            r4 = 3551(0xddf, float:4.976E-42)
            if (r3 == r4) goto L_0x0030
            r4 = 109935(0x1ad6f, float:1.54052E-40)
            if (r3 == r4) goto L_0x0027
            r4 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r3 != r4) goto L_0x0043
            java.lang.String r3 = "auto"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0043
            goto L_0x005c
        L_0x0027:
            java.lang.String r3 = "off"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0043
            goto L_0x005c
        L_0x0030:
            java.lang.String r3 = "on"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0043
            goto L_0x0041
        L_0x0039:
            java.lang.String r3 = ""
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0043
        L_0x0041:
            r0 = 1
            goto L_0x005d
        L_0x0043:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "System property 'kotlinx.coroutines.debug' has unrecognized value '"
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = "'"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x005c:
            r0 = 0
        L_0x005d:
            f191036a = r0
            if (r0 == 0) goto L_0x006a
            java.lang.String r0 = "kotlinx.coroutines.stacktrace.recovery"
            boolean r0 = kotlinx.coroutines.p5579e.C71711as.m104850b(r0, r1)
            if (r0 == 0) goto L_0x006a
            goto L_0x006b
        L_0x006a:
            r1 = 0
        L_0x006b:
            f191037b = r1
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 0
            r0.<init>(r1)
            f191038c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C71600ba.<clinit>():void");
    }
}
