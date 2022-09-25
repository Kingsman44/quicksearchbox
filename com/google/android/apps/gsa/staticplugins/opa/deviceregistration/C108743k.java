package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import com.google.assistant.p3861at.C49875cf;
import java.net.InetAddress;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.k */
/* compiled from: PG */
final class C108743k extends C108741i {

    /* renamed from: b */
    public final String f302405b;

    /* renamed from: c */
    public final String f302406c;

    /* renamed from: d */
    public final String f302407d;

    /* renamed from: e */
    public final String f302408e;

    /* renamed from: f */
    public final InetAddress f302409f;

    /* renamed from: g */
    public final Integer f302410g;

    /* renamed from: h */
    public final String f302411h;

    /* renamed from: i */
    public final String f302412i;

    /* renamed from: j */
    public final String f302413j;

    /* renamed from: k */
    public final String f302414k;

    /* renamed from: l */
    public final String f302415l;

    /* renamed from: m */
    public final String f302416m;

    /* renamed from: n */
    public final boolean f302417n;

    /* renamed from: o */
    public final String f302418o;

    /* renamed from: p */
    public final C49875cf f302419p;

    public C108743k(String str, String str2, String str3, String str4, InetAddress inetAddress, Integer num, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, String str11, C49875cf cfVar) {
        this.f302405b = str;
        this.f302406c = str2;
        this.f302407d = str3;
        this.f302408e = str4;
        this.f302409f = inetAddress;
        this.f302410g = num;
        this.f302411h = str5;
        this.f302412i = str6;
        this.f302413j = str7;
        this.f302414k = str8;
        this.f302415l = str9;
        this.f302416m = str10;
        this.f302417n = z;
        this.f302418o = str11;
        this.f302419p = cfVar;
    }

    /* renamed from: a */
    public final C108735h mo97098a() {
        return new C108742j(this);
    }

    /* renamed from: b */
    public final C49875cf mo97099b() {
        return this.f302419p;
    }

    /* renamed from: c */
    public final Integer mo97100c() {
        return this.f302410g;
    }

    /* renamed from: d */
    public final String mo97101d() {
        return this.f302418o;
    }

    /* renamed from: e */
    public final String mo97102e() {
        return this.f302416m;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00f4, code lost:
        r1 = r4.f302418o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0109, code lost:
        r1 = r4.f302419p;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.apps.gsa.staticplugins.opa.deviceregistration.C108741i
            r2 = 0
            if (r1 == 0) goto L_0x0120
            com.google.android.apps.gsa.staticplugins.opa.deviceregistration.i r5 = (com.google.android.apps.gsa.staticplugins.opa.deviceregistration.C108741i) r5
            java.lang.String r1 = r4.f302405b
            if (r1 != 0) goto L_0x0016
            java.lang.String r1 = r5.mo97109m()
            if (r1 != 0) goto L_0x0120
            goto L_0x0020
        L_0x0016:
            java.lang.String r3 = r5.mo97109m()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0120
        L_0x0020:
            java.lang.String r1 = r4.f302406c
            if (r1 != 0) goto L_0x002b
            java.lang.String r1 = r5.mo97110n()
            if (r1 != 0) goto L_0x0120
            goto L_0x0035
        L_0x002b:
            java.lang.String r3 = r5.mo97110n()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0120
        L_0x0035:
            java.lang.String r1 = r4.f302407d
            if (r1 != 0) goto L_0x0040
            java.lang.String r1 = r5.mo97107k()
            if (r1 != 0) goto L_0x0120
            goto L_0x004a
        L_0x0040:
            java.lang.String r3 = r5.mo97107k()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0120
        L_0x004a:
            java.lang.String r1 = r4.f302408e
            if (r1 != 0) goto L_0x0055
            java.lang.String r1 = r5.mo97111o()
            if (r1 != 0) goto L_0x0120
            goto L_0x005f
        L_0x0055:
            java.lang.String r3 = r5.mo97111o()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0120
        L_0x005f:
            java.net.InetAddress r1 = r4.f302409f
            if (r1 != 0) goto L_0x006a
            java.net.InetAddress r1 = r5.mo97112p()
            if (r1 != 0) goto L_0x0120
            goto L_0x0074
        L_0x006a:
            java.net.InetAddress r3 = r5.mo97112p()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0120
        L_0x0074:
            java.lang.Integer r1 = r4.f302410g
            if (r1 != 0) goto L_0x007f
            java.lang.Integer r1 = r5.mo97100c()
            if (r1 != 0) goto L_0x0120
            goto L_0x0089
        L_0x007f:
            java.lang.Integer r3 = r5.mo97100c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0120
        L_0x0089:
            java.lang.String r1 = r4.f302411h
            if (r1 != 0) goto L_0x0094
            java.lang.String r1 = r5.mo97105h()
            if (r1 != 0) goto L_0x0120
            goto L_0x009e
        L_0x0094:
            java.lang.String r3 = r5.mo97105h()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0120
        L_0x009e:
            java.lang.String r1 = r4.f302412i
            if (r1 != 0) goto L_0x00a9
            java.lang.String r1 = r5.mo97106i()
            if (r1 != 0) goto L_0x0120
            goto L_0x00b3
        L_0x00a9:
            java.lang.String r3 = r5.mo97106i()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0120
        L_0x00b3:
            java.lang.String r1 = r4.f302413j
            if (r1 != 0) goto L_0x00be
            java.lang.String r1 = r5.mo97108l()
            if (r1 != 0) goto L_0x0120
            goto L_0x00c8
        L_0x00be:
            java.lang.String r3 = r5.mo97108l()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0120
        L_0x00c8:
            java.lang.String r1 = r4.f302414k
            java.lang.String r3 = r5.mo97103f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0120
            java.lang.String r1 = r4.f302415l
            java.lang.String r3 = r5.mo97104g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0120
            java.lang.String r1 = r4.f302416m
            java.lang.String r3 = r5.mo97102e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0120
            boolean r1 = r4.f302417n
            boolean r3 = r5.mo97114r()
            if (r1 != r3) goto L_0x0120
            java.lang.String r1 = r4.f302418o
            if (r1 != 0) goto L_0x00ff
            java.lang.String r1 = r5.mo97101d()
            if (r1 != 0) goto L_0x0120
            goto L_0x0109
        L_0x00ff:
            java.lang.String r3 = r5.mo97101d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0120
        L_0x0109:
            com.google.assistant.at.cf r1 = r4.f302419p
            if (r1 != 0) goto L_0x0114
            com.google.assistant.at.cf r5 = r5.mo97099b()
            if (r5 != 0) goto L_0x0120
            goto L_0x011f
        L_0x0114:
            com.google.assistant.at.cf r5 = r5.mo97099b()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x011f
            goto L_0x0120
        L_0x011f:
            return r0
        L_0x0120:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.C108743k.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final String mo97103f() {
        return this.f302414k;
    }

    /* renamed from: g */
    public final String mo97104g() {
        return this.f302415l;
    }

    /* renamed from: h */
    public final String mo97105h() {
        return this.f302411h;
    }

    /* renamed from: i */
    public final String mo97106i() {
        return this.f302412i;
    }

    /* renamed from: k */
    public final String mo97107k() {
        return this.f302407d;
    }

    /* renamed from: l */
    public final String mo97108l() {
        return this.f302413j;
    }

    /* renamed from: m */
    public final String mo97109m() {
        return this.f302405b;
    }

    /* renamed from: n */
    public final String mo97110n() {
        return this.f302406c;
    }

    /* renamed from: o */
    public final String mo97111o() {
        return this.f302408e;
    }

    /* renamed from: p */
    public final InetAddress mo97112p() {
        return this.f302409f;
    }

    /* renamed from: r */
    public final boolean mo97114r() {
        return this.f302417n;
    }

    public final String toString() {
        String str = this.f302405b;
        String str2 = this.f302406c;
        String str3 = this.f302407d;
        String str4 = this.f302408e;
        String valueOf = String.valueOf(this.f302409f);
        Integer num = this.f302410g;
        String str5 = this.f302411h;
        String str6 = this.f302412i;
        String str7 = this.f302413j;
        String str8 = this.f302414k;
        String str9 = this.f302415l;
        String str10 = this.f302416m;
        boolean z = this.f302417n;
        String str11 = this.f302418o;
        return "AssistantSdkDeviceInfo{libassistantId=" + str + ", oemDeviceId=" + str2 + ", homeGraphId=" + str3 + ", oemDeviceUrl=" + str4 + ", oemDeviceIp=" + valueOf + ", oemDevicePort=" + num + ", deviceName=" + str5 + ", externalName=" + str6 + ", iconImageUrl=" + str7 + ", clientId=" + str8 + ", deviceModelId=" + str9 + ", certificate=" + str10 + ", voiceMatchSupported=" + z + ", assistantDeviceId=" + str11 + ", assistantDeviceType=" + String.valueOf(this.f302419p) + "}";
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str = this.f302405b;
        int i6 = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f302406c;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f302407d;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f302408e;
        int hashCode4 = (hashCode3 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        InetAddress inetAddress = this.f302409f;
        int hashCode5 = (hashCode4 ^ (inetAddress == null ? 0 : inetAddress.hashCode())) * 1000003;
        Integer num = this.f302410g;
        if (num == null) {
            i = 0;
        } else {
            i = num.hashCode();
        }
        int i7 = (hashCode5 ^ i) * 1000003;
        String str5 = this.f302411h;
        if (str5 == null) {
            i2 = 0;
        } else {
            i2 = str5.hashCode();
        }
        int i8 = (i7 ^ i2) * 1000003;
        String str6 = this.f302412i;
        if (str6 == null) {
            i3 = 0;
        } else {
            i3 = str6.hashCode();
        }
        int i9 = (i8 ^ i3) * 1000003;
        String str7 = this.f302413j;
        if (str7 == null) {
            i4 = 0;
        } else {
            i4 = str7.hashCode();
        }
        int hashCode6 = (((((((((i9 ^ i4) * 1000003) ^ this.f302414k.hashCode()) * 1000003) ^ this.f302415l.hashCode()) * 1000003) ^ this.f302416m.hashCode()) * 1000003) ^ (true != this.f302417n ? 1237 : 1231)) * 1000003;
        String str8 = this.f302418o;
        if (str8 == null) {
            i5 = 0;
        } else {
            i5 = str8.hashCode();
        }
        int i10 = (hashCode6 ^ i5) * 1000003;
        C49875cf cfVar = this.f302419p;
        if (cfVar != null) {
            i6 = cfVar.hashCode();
        }
        return i10 ^ i6;
    }
}
