package com.google.android.libraries.social.populous.core;

import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58528ij;

/* renamed from: com.google.android.libraries.social.populous.core.$$AutoValue_GroupMetadata  reason: invalid class name */
/* compiled from: PG */
abstract class C$$AutoValue_GroupMetadata extends GroupMetadata {

    /* renamed from: a */
    public final C58833ax f110597a;

    /* renamed from: b */
    public final boolean f110598b;

    /* renamed from: c */
    public final long f110599c;

    /* renamed from: d */
    public final String f110600d;

    /* renamed from: e */
    public final PeopleApiAffinity f110601e;

    /* renamed from: f */
    public final C58528ij f110602f;

    public C$$AutoValue_GroupMetadata(C58833ax axVar, boolean z, long j, String str, PeopleApiAffinity peopleApiAffinity, C58528ij ijVar) {
        if (axVar != null) {
            this.f110597a = axVar;
            this.f110598b = z;
            this.f110599c = j;
            if (str != null) {
                this.f110600d = str;
                if (peopleApiAffinity != null) {
                    this.f110601e = peopleApiAffinity;
                    this.f110602f = ijVar;
                    return;
                }
                throw new NullPointerException("Null peopleApiAffinity");
            }
            throw new NullPointerException("Null query");
        }
        throw new NullPointerException("Null size");
    }

    /* renamed from: a */
    public final long mo44928a() {
        return this.f110599c;
    }

    /* renamed from: b */
    public final PeopleApiAffinity mo44929b() {
        return this.f110601e;
    }

    /* renamed from: c */
    public final C58833ax mo44930c() {
        return this.f110597a;
    }

    /* renamed from: d */
    public final C58528ij mo44931d() {
        return this.f110602f;
    }

    /* renamed from: e */
    public final String mo44932e() {
        return this.f110600d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        r1 = r7.f110602f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof com.google.android.libraries.social.populous.core.GroupMetadata
            r2 = 0
            if (r1 == 0) goto L_0x0058
            com.google.android.libraries.social.populous.core.GroupMetadata r8 = (com.google.android.libraries.social.populous.core.GroupMetadata) r8
            com.google.common.base.ax r1 = r7.f110597a
            com.google.common.base.ax r3 = r8.mo44930c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0058
            boolean r1 = r7.f110598b
            boolean r3 = r8.mo44934f()
            if (r1 != r3) goto L_0x0058
            long r3 = r7.f110599c
            long r5 = r8.mo44928a()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0058
            java.lang.String r1 = r7.f110600d
            java.lang.String r3 = r8.mo44932e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0058
            com.google.android.libraries.social.populous.core.PeopleApiAffinity r1 = r7.f110601e
            com.google.android.libraries.social.populous.core.PeopleApiAffinity r3 = r8.mo44929b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0058
            com.google.common.b.ij r1 = r7.f110602f
            if (r1 != 0) goto L_0x004c
            com.google.common.b.ij r8 = r8.mo44931d()
            if (r8 != 0) goto L_0x0058
            goto L_0x0057
        L_0x004c:
            com.google.common.b.ij r8 = r8.mo44931d()
            boolean r8 = r1.equals(r8)
            if (r8 != 0) goto L_0x0057
            goto L_0x0058
        L_0x0057:
            return r0
        L_0x0058:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.populous.core.C$$AutoValue_GroupMetadata.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final boolean mo44934f() {
        return this.f110598b;
    }

    public int hashCode() {
        int i;
        int hashCode = (this.f110597a.hashCode() ^ 1000003) * 1000003;
        int i2 = true != this.f110598b ? 1237 : 1231;
        long j = this.f110599c;
        int hashCode2 = (((((((hashCode ^ i2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f110600d.hashCode()) * 1000003) ^ this.f110601e.hashCode()) * 1000003;
        C58528ij ijVar = this.f110602f;
        if (ijVar == null) {
            i = 0;
        } else {
            i = ijVar.hashCode();
        }
        return hashCode2 ^ i;
    }

    public String toString() {
        String obj = this.f110597a.toString();
        boolean z = this.f110598b;
        long j = this.f110599c;
        String str = this.f110600d;
        String obj2 = this.f110601e.toString();
        String valueOf = String.valueOf(this.f110602f);
        return "GroupMetadata{size=" + obj + ", canExpandMembers=" + z + ", querySessionId=" + j + ", query=" + str + ", peopleApiAffinity=" + obj2 + ", provenances=" + valueOf + "}";
    }
}
