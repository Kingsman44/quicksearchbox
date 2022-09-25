package com.google.android.libraries.social.populous;

/* renamed from: com.google.android.libraries.social.populous.$AutoValue_GroupMember  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_GroupMember extends GroupMember {

    /* renamed from: a */
    public final Person f110329a;

    /* renamed from: b */
    public final int f110330b;

    public C$AutoValue_GroupMember(int i, Person person) {
        if (i != 0) {
            this.f110330b = i;
            this.f110329a = person;
            return;
        }
        throw new NullPointerException("Null memberType");
    }

    /* renamed from: a */
    public final Person mo44788a() {
        return this.f110329a;
    }

    /* renamed from: b */
    public final int mo44789b() {
        return this.f110330b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        r1 = r4.f110329a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.social.populous.GroupMember
            r2 = 0
            if (r1 == 0) goto L_0x002a
            com.google.android.libraries.social.populous.GroupMember r5 = (com.google.android.libraries.social.populous.GroupMember) r5
            int r1 = r4.f110330b
            int r3 = r5.mo44789b()
            if (r1 != r3) goto L_0x002a
            com.google.android.libraries.social.populous.Person r1 = r4.f110329a
            if (r1 != 0) goto L_0x001e
            com.google.android.libraries.social.populous.Person r5 = r5.mo44788a()
            if (r5 != 0) goto L_0x002a
            goto L_0x0029
        L_0x001e:
            com.google.android.libraries.social.populous.Person r5 = r5.mo44788a()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            return r0
        L_0x002a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.populous.C$AutoValue_GroupMember.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = (this.f110330b ^ 1000003) * 1000003;
        Person person = this.f110329a;
        return i ^ (person == null ? 0 : person.hashCode());
    }

    public final String toString() {
        String str = this.f110330b != 1 ? "PERSON" : "UNSPECIFIED";
        String valueOf = String.valueOf(this.f110329a);
        return "GroupMember{memberType=" + str + ", person=" + valueOf + "}";
    }
}
