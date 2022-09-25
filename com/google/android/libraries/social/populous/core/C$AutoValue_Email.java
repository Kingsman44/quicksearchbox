package com.google.android.libraries.social.populous.core;

import com.google.android.libraries.social.populous.core.Email;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.social.populous.core.$AutoValue_Email  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_Email extends Email {

    /* renamed from: a */
    public final CharSequence f110626a;

    /* renamed from: b */
    public final PersonFieldMetadata f110627b;

    /* renamed from: c */
    public final C58833ax f110628c;

    /* renamed from: d */
    public final C58833ax f110629d;

    /* renamed from: e */
    public final C58833ax f110630e;

    /* renamed from: f */
    public final Email.ExtendedData f110631f;

    /* renamed from: g */
    public final C58485gu f110632g;

    public C$AutoValue_Email(CharSequence charSequence, PersonFieldMetadata personFieldMetadata, C58833ax axVar, C58833ax axVar2, C58833ax axVar3, Email.ExtendedData extendedData, C58485gu guVar) {
        if (charSequence != null) {
            this.f110626a = charSequence;
            if (personFieldMetadata != null) {
                this.f110627b = personFieldMetadata;
                if (axVar != null) {
                    this.f110628c = axVar;
                    if (axVar2 != null) {
                        this.f110629d = axVar2;
                        if (axVar3 != null) {
                            this.f110630e = axVar3;
                            this.f110631f = extendedData;
                            if (guVar != null) {
                                this.f110632g = guVar;
                                return;
                            }
                            throw new NullPointerException("Null certificates");
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

    /* renamed from: a */
    public final Email.ExtendedData mo44975a() {
        return this.f110631f;
    }

    /* renamed from: b */
    public final PersonFieldMetadata mo44976b() {
        return this.f110627b;
    }

    /* renamed from: c */
    public final C58833ax mo44977c() {
        return this.f110629d;
    }

    /* renamed from: d */
    public final C58833ax mo44978d() {
        return this.f110630e;
    }

    /* renamed from: e */
    public final C58833ax mo44979e() {
        return this.f110628c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        r1 = r4.f110631f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.social.populous.core.Email
            r2 = 0
            if (r1 == 0) goto L_0x006a
            com.google.android.libraries.social.populous.core.Email r5 = (com.google.android.libraries.social.populous.core.Email) r5
            java.lang.CharSequence r1 = r4.f110626a
            java.lang.CharSequence r3 = r5.mo44982g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x006a
            com.google.android.libraries.social.populous.core.PersonFieldMetadata r1 = r4.f110627b
            com.google.android.libraries.social.populous.core.PersonFieldMetadata r3 = r5.mo44976b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x006a
            com.google.common.base.ax r1 = r4.f110628c
            com.google.common.base.ax r3 = r5.mo44979e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x006a
            com.google.common.base.ax r1 = r4.f110629d
            com.google.common.base.ax r3 = r5.mo44977c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x006a
            com.google.common.base.ax r1 = r4.f110630e
            com.google.common.base.ax r3 = r5.mo44978d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x006a
            com.google.android.libraries.social.populous.core.Email$ExtendedData r1 = r4.f110631f
            if (r1 != 0) goto L_0x0052
            com.google.android.libraries.social.populous.core.Email$ExtendedData r1 = r5.mo44975a()
            if (r1 != 0) goto L_0x006a
            goto L_0x005d
        L_0x0052:
            com.google.android.libraries.social.populous.core.Email$ExtendedData r3 = r5.mo44975a()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x005d
            goto L_0x006a
        L_0x005d:
            com.google.common.b.gu r1 = r4.f110632g
            com.google.common.b.gu r5 = r5.mo44981f()
            boolean r5 = com.google.common.p4522b.C58597ky.m90218i(r1, r5)
            if (r5 == 0) goto L_0x006a
            return r0
        L_0x006a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.populous.core.C$AutoValue_Email.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final C58485gu mo44981f() {
        return this.f110632g;
    }

    /* renamed from: g */
    public final CharSequence mo44982g() {
        return this.f110626a;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((((this.f110626a.hashCode() ^ 1000003) * 1000003) ^ this.f110627b.hashCode()) * 1000003) ^ this.f110628c.hashCode()) * 1000003) ^ this.f110629d.hashCode()) * 1000003) ^ this.f110630e.hashCode()) * 1000003;
        Email.ExtendedData extendedData = this.f110631f;
        if (extendedData == null) {
            i = 0;
        } else {
            i = extendedData.hashCode();
        }
        return ((hashCode ^ i) * 1000003) ^ this.f110632g.hashCode();
    }

    public final String toString() {
        CharSequence charSequence = this.f110626a;
        String obj = this.f110627b.toString();
        String obj2 = this.f110628c.toString();
        String obj3 = this.f110629d.toString();
        String obj4 = this.f110630e.toString();
        String valueOf = String.valueOf(this.f110631f);
        String obj5 = this.f110632g.toString();
        return "Email{value=" + ((String) charSequence) + ", metadata=" + obj + ", typeLabel=" + obj2 + ", name=" + obj3 + ", photo=" + obj4 + ", extendedData=" + valueOf + ", certificates=" + obj5 + "}";
    }
}
