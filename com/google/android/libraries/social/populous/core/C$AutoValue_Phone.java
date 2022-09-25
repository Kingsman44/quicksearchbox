package com.google.android.libraries.social.populous.core;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.social.populous.core.$AutoValue_Phone  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_Phone extends Phone {

    /* renamed from: a */
    public final CharSequence f110661a;

    /* renamed from: b */
    public final CharSequence f110662b;

    /* renamed from: c */
    public final PersonFieldMetadata f110663c;

    /* renamed from: d */
    public final C58833ax f110664d;

    /* renamed from: e */
    public final C58833ax f110665e;

    /* renamed from: f */
    public final C58833ax f110666f;

    public C$AutoValue_Phone(CharSequence charSequence, CharSequence charSequence2, PersonFieldMetadata personFieldMetadata, C58833ax axVar, C58833ax axVar2, C58833ax axVar3) {
        if (charSequence != null) {
            this.f110661a = charSequence;
            this.f110662b = charSequence2;
            if (personFieldMetadata != null) {
                this.f110663c = personFieldMetadata;
                if (axVar != null) {
                    this.f110664d = axVar;
                    if (axVar2 != null) {
                        this.f110665e = axVar2;
                        if (axVar3 != null) {
                            this.f110666f = axVar3;
                            return;
                        }
                        throw new NullPointerException("Null photo");
                    }
                    throw new NullPointerException("Null name");
                }
                throw new NullPointerException("Null typeLabel");
            }
            throw new NullPointerException("Null metadata");
        }
        throw new NullPointerException("Null value");
    }

    /* renamed from: b */
    public final PersonFieldMetadata mo44976b() {
        return this.f110663c;
    }

    /* renamed from: c */
    public final C58833ax mo45039c() {
        return this.f110665e;
    }

    /* renamed from: d */
    public final C58833ax mo45040d() {
        return this.f110666f;
    }

    /* renamed from: e */
    public final C58833ax mo45041e() {
        return this.f110664d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f110662b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.social.populous.core.Phone
            r2 = 0
            if (r1 == 0) goto L_0x005e
            com.google.android.libraries.social.populous.core.Phone r5 = (com.google.android.libraries.social.populous.core.Phone) r5
            java.lang.CharSequence r1 = r4.f110661a
            java.lang.CharSequence r3 = r5.mo44982g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x005e
            java.lang.CharSequence r1 = r4.f110662b
            if (r1 != 0) goto L_0x0022
            java.lang.CharSequence r1 = r5.mo45043f()
            if (r1 != 0) goto L_0x005e
            goto L_0x002d
        L_0x0022:
            java.lang.CharSequence r3 = r5.mo45043f()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x002d
            goto L_0x005e
        L_0x002d:
            com.google.android.libraries.social.populous.core.PersonFieldMetadata r1 = r4.f110663c
            com.google.android.libraries.social.populous.core.PersonFieldMetadata r3 = r5.mo44976b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x005e
            com.google.common.base.ax r1 = r4.f110664d
            com.google.common.base.ax r3 = r5.mo45041e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x005e
            com.google.common.base.ax r1 = r4.f110665e
            com.google.common.base.ax r3 = r5.mo45039c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x005e
            com.google.common.base.ax r1 = r4.f110666f
            com.google.common.base.ax r5 = r5.mo45040d()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x005e
            return r0
        L_0x005e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.populous.core.C$AutoValue_Phone.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final CharSequence mo45043f() {
        return this.f110662b;
    }

    /* renamed from: g */
    public final CharSequence mo44982g() {
        return this.f110661a;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f110661a.hashCode() ^ 1000003) * 1000003;
        CharSequence charSequence = this.f110662b;
        if (charSequence == null) {
            i = 0;
        } else {
            i = charSequence.hashCode();
        }
        return ((((((((hashCode ^ i) * 1000003) ^ this.f110663c.hashCode()) * 1000003) ^ this.f110664d.hashCode()) * 1000003) ^ this.f110665e.hashCode()) * 1000003) ^ this.f110666f.hashCode();
    }

    public final String toString() {
        CharSequence charSequence = this.f110661a;
        String valueOf = String.valueOf(this.f110662b);
        String obj = this.f110663c.toString();
        String obj2 = this.f110664d.toString();
        String obj3 = this.f110665e.toString();
        String obj4 = this.f110666f.toString();
        return "Phone{value=" + ((String) charSequence) + ", canonicalValue=" + valueOf + ", metadata=" + obj + ", typeLabel=" + obj2 + ", name=" + obj3 + ", photo=" + obj4 + "}";
    }
}
