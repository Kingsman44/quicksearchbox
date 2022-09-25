package com.google.android.libraries.assistant.trainingcache.p1615a.p1616a;

import com.google.protobuf.C63088z;
import java.io.File;

/* renamed from: com.google.android.libraries.assistant.trainingcache.a.a.f */
/* compiled from: PG */
final class C19402f extends C19414r {

    /* renamed from: a */
    private final String f54285a;

    /* renamed from: b */
    private final int f54286b;

    /* renamed from: c */
    private final File f54287c;

    /* renamed from: d */
    private final File f54288d;

    /* renamed from: e */
    private final File f54289e;

    /* renamed from: f */
    private final C63088z f54290f;

    /* renamed from: g */
    private final Object f54291g;

    public C19402f(String str, int i, File file, File file2, File file3, C63088z zVar, Object obj) {
        this.f54285a = str;
        this.f54286b = i;
        this.f54287c = file;
        this.f54288d = file2;
        this.f54289e = file3;
        this.f54290f = zVar;
        this.f54291g = obj;
    }

    /* renamed from: a */
    public final int mo24565a() {
        return this.f54286b;
    }

    /* renamed from: b */
    public final C63088z mo24566b() {
        return this.f54290f;
    }

    /* renamed from: c */
    public final File mo24567c() {
        return this.f54287c;
    }

    /* renamed from: d */
    public final File mo24568d() {
        return this.f54289e;
    }

    /* renamed from: e */
    public final File mo24569e() {
        return this.f54288d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
        r1 = r4.f54290f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0058, code lost:
        r1 = r4.f54291g;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.assistant.trainingcache.p1615a.p1616a.C19414r
            r2 = 0
            if (r1 == 0) goto L_0x006f
            com.google.android.libraries.assistant.trainingcache.a.a.r r5 = (com.google.android.libraries.assistant.trainingcache.p1615a.p1616a.C19414r) r5
            java.lang.String r1 = r4.f54285a
            java.lang.String r3 = r5.mo24572g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x006f
            int r1 = r4.f54286b
            int r3 = r5.mo24565a()
            if (r1 != r3) goto L_0x006f
            java.io.File r1 = r4.f54287c
            java.io.File r3 = r5.mo24567c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x006f
            java.io.File r1 = r4.f54288d
            java.io.File r3 = r5.mo24569e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x006f
            java.io.File r1 = r4.f54289e
            java.io.File r3 = r5.mo24568d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x006f
            com.google.protobuf.z r1 = r4.f54290f
            if (r1 != 0) goto L_0x004e
            com.google.protobuf.z r1 = r5.mo24566b()
            if (r1 != 0) goto L_0x006f
            goto L_0x0058
        L_0x004e:
            com.google.protobuf.z r3 = r5.mo24566b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x006f
        L_0x0058:
            java.lang.Object r1 = r4.f54291g
            if (r1 != 0) goto L_0x0063
            java.lang.Object r5 = r5.mo24571f()
            if (r5 != 0) goto L_0x006f
            goto L_0x006e
        L_0x0063:
            java.lang.Object r5 = r5.mo24571f()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x006e
            goto L_0x006f
        L_0x006e:
            return r0
        L_0x006f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.trainingcache.p1615a.p1616a.C19402f.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final Object mo24571f() {
        return this.f54291g;
    }

    /* renamed from: g */
    public final String mo24572g() {
        return this.f54285a;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((((this.f54285a.hashCode() ^ 1000003) * 1000003) ^ this.f54286b) * 1000003) ^ this.f54287c.hashCode()) * 1000003) ^ this.f54288d.hashCode()) * 1000003) ^ this.f54289e.hashCode()) * 1000003;
        C63088z zVar = this.f54290f;
        int i2 = 0;
        if (zVar == null) {
            i = 0;
        } else {
            i = zVar.hashCode();
        }
        int i3 = (hashCode ^ i) * 1000003;
        Object obj = this.f54291g;
        if (obj != null) {
            i2 = obj.hashCode();
        }
        return i3 ^ i2;
    }

    public final String toString() {
        String str = this.f54285a;
        int i = this.f54286b;
        String obj = this.f54287c.toString();
        String obj2 = this.f54288d.toString();
        String obj3 = this.f54289e.toString();
        String valueOf = String.valueOf(this.f54290f);
        String valueOf2 = String.valueOf(this.f54291g);
        return "FedoraLcTrainerOptions{sessionName=" + str + ", sessionJobId=" + i + ", inputDirectory=" + obj + ", outputDirectory=" + obj2 + ", lcPlanFile=" + obj3 + ", trainingContext=" + valueOf + ", loggingContext=" + valueOf2 + "}";
    }
}
