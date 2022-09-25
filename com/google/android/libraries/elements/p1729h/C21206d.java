package com.google.android.libraries.elements.p1729h;

import com.google.common.p4522b.C58528ij;
import p5488io.grpc.Status;

/* renamed from: com.google.android.libraries.elements.h.d */
/* compiled from: PG */
final class C21206d extends C21198aa {

    /* renamed from: a */
    private final C58528ij f59502a;

    /* renamed from: b */
    private final C21225w f59503b;

    /* renamed from: c */
    private final String f59504c;

    /* renamed from: d */
    private final int f59505d;

    public C21206d(C58528ij ijVar, C21225w wVar, String str, int i) {
        this.f59502a = ijVar;
        this.f59503b = wVar;
        this.f59504c = str;
        this.f59505d = i;
    }

    /* renamed from: a */
    public final int mo26222a() {
        return this.f59505d;
    }

    /* renamed from: b */
    public final C21225w mo26223b() {
        return this.f59503b;
    }

    /* renamed from: c */
    public final C58528ij mo26224c() {
        return this.f59502a;
    }

    /* renamed from: d */
    public final Status mo26225d() {
        return null;
    }

    /* renamed from: e */
    public final Boolean mo26226e() {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        r1 = r4.f59504c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f59503b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.elements.p1729h.C21198aa
            r2 = 0
            if (r1 == 0) goto L_0x006f
            com.google.android.libraries.elements.h.aa r5 = (com.google.android.libraries.elements.p1729h.C21198aa) r5
            com.google.common.b.ij r1 = r4.f59502a
            com.google.common.b.ij r3 = r5.mo26224c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x006f
            com.google.android.libraries.elements.h.w r1 = r4.f59503b
            if (r1 != 0) goto L_0x0022
            com.google.android.libraries.elements.h.w r1 = r5.mo26223b()
            if (r1 != 0) goto L_0x006f
            goto L_0x002c
        L_0x0022:
            com.google.android.libraries.elements.h.w r3 = r5.mo26223b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x006f
        L_0x002c:
            java.lang.String r1 = r4.f59504c
            if (r1 != 0) goto L_0x0037
            java.lang.String r1 = r5.mo26231j()
            if (r1 != 0) goto L_0x006f
            goto L_0x0042
        L_0x0037:
            java.lang.String r3 = r5.mo26231j()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0042
            goto L_0x006f
        L_0x0042:
            java.lang.Integer r1 = r5.mo26227f()
            if (r1 != 0) goto L_0x006f
            io.grpc.Status r1 = r5.mo26225d()
            if (r1 != 0) goto L_0x006f
            java.lang.String r1 = r5.mo26230i()
            if (r1 != 0) goto L_0x006f
            java.lang.String r1 = r5.mo26229h()
            if (r1 != 0) goto L_0x006f
            java.lang.Integer r1 = r5.mo26228g()
            if (r1 != 0) goto L_0x006f
            java.lang.Boolean r1 = r5.mo26226e()
            if (r1 != 0) goto L_0x006f
            int r1 = r4.f59505d
            int r5 = r5.mo26222a()
            if (r1 != r5) goto L_0x006f
            return r0
        L_0x006f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.elements.p1729h.C21206d.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final Integer mo26227f() {
        return null;
    }

    /* renamed from: g */
    public final Integer mo26228g() {
        return null;
    }

    /* renamed from: h */
    public final String mo26229h() {
        return null;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f59502a.hashCode() ^ 1000003) * 1000003;
        C21225w wVar = this.f59503b;
        int i2 = 0;
        if (wVar == null) {
            i = 0;
        } else {
            i = wVar.hashCode();
        }
        int i3 = (hashCode ^ i) * 1000003;
        String str = this.f59504c;
        if (str != null) {
            i2 = str.hashCode();
        }
        return ((i3 ^ i2) * 1071616587) ^ this.f59505d;
    }

    /* renamed from: i */
    public final String mo26230i() {
        return null;
    }

    /* renamed from: j */
    public final String mo26231j() {
        return this.f59504c;
    }

    public final String toString() {
        String obj = this.f59502a.toString();
        String valueOf = String.valueOf(this.f59503b);
        String str = this.f59504c;
        int i = this.f59505d;
        return "SpanInfo{templateUris=" + obj + ", threadInfo=" + valueOf + ", nodeId=" + str + ", commandExtensionId=null, commandExecutionStatus=null, jsModuleIdentifier=null, jsFunctionName=null, jsBindingExtensionId=null, jsIsSynchronous=null, materializationCount=" + i + "}";
    }
}
