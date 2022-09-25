package com.google.ads.interactivemedia.p367v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.cy */
/* compiled from: PG */
public final class C6864cy implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C6862cw();

    /* renamed from: A */
    public final int f21795A;

    /* renamed from: B */
    public final int f21796B;

    /* renamed from: C */
    public final int f21797C;

    /* renamed from: D */
    public final int f21798D;

    /* renamed from: E */
    public final Class f21799E;

    /* renamed from: F */
    private int f21800F;

    /* renamed from: a */
    public final String f21801a;

    /* renamed from: b */
    public final String f21802b;

    /* renamed from: c */
    public final String f21803c;

    /* renamed from: d */
    public final int f21804d;

    /* renamed from: e */
    public final int f21805e;

    /* renamed from: f */
    public final int f21806f;

    /* renamed from: g */
    public final int f21807g;

    /* renamed from: h */
    public final int f21808h;

    /* renamed from: i */
    public final String f21809i;

    /* renamed from: j */
    public final C7243qz f21810j;

    /* renamed from: k */
    public final String f21811k;

    /* renamed from: l */
    public final String f21812l;

    /* renamed from: m */
    public final int f21813m;

    /* renamed from: n */
    public final List f21814n;

    /* renamed from: o */
    public final C7031jc f21815o;

    /* renamed from: p */
    public final long f21816p;

    /* renamed from: q */
    public final int f21817q;

    /* renamed from: r */
    public final int f21818r;

    /* renamed from: s */
    public final float f21819s;

    /* renamed from: t */
    public final int f21820t;

    /* renamed from: u */
    public final float f21821u;

    /* renamed from: v */
    public final byte[] f21822v;

    /* renamed from: w */
    public final int f21823w;

    /* renamed from: x */
    public final aex f21824x;

    /* renamed from: y */
    public final int f21825y;

    /* renamed from: z */
    public final int f21826z;

    public C6864cy(Parcel parcel) {
        this.f21801a = parcel.readString();
        this.f21802b = parcel.readString();
        this.f21803c = parcel.readString();
        this.f21804d = parcel.readInt();
        this.f21805e = parcel.readInt();
        int readInt = parcel.readInt();
        this.f21806f = readInt;
        int readInt2 = parcel.readInt();
        this.f21807g = readInt2;
        this.f21808h = readInt2 != -1 ? readInt2 : readInt;
        this.f21809i = parcel.readString();
        this.f21810j = (C7243qz) parcel.readParcelable(C7243qz.class.getClassLoader());
        this.f21811k = parcel.readString();
        this.f21812l = parcel.readString();
        this.f21813m = parcel.readInt();
        int readInt3 = parcel.readInt();
        this.f21814n = new ArrayList(readInt3);
        for (int i = 0; i < readInt3; i++) {
            this.f21814n.add((byte[]) ary.m19467t(parcel.createByteArray()));
        }
        C7031jc jcVar = (C7031jc) parcel.readParcelable(C7031jc.class.getClassLoader());
        this.f21815o = jcVar;
        this.f21816p = parcel.readLong();
        this.f21817q = parcel.readInt();
        this.f21818r = parcel.readInt();
        this.f21819s = parcel.readFloat();
        this.f21820t = parcel.readInt();
        this.f21821u = parcel.readFloat();
        Class cls = null;
        this.f21822v = aeu.m18549s(parcel) ? parcel.createByteArray() : null;
        this.f21823w = parcel.readInt();
        this.f21824x = (aex) parcel.readParcelable(aex.class.getClassLoader());
        this.f21825y = parcel.readInt();
        this.f21826z = parcel.readInt();
        this.f21795A = parcel.readInt();
        this.f21796B = parcel.readInt();
        this.f21797C = parcel.readInt();
        this.f21798D = parcel.readInt();
        this.f21799E = jcVar != null ? C7040jl.class : cls;
    }

    public /* synthetic */ C6864cy(C6863cx cxVar) {
        this.f21801a = cxVar.f21769a;
        this.f21802b = cxVar.f21770b;
        this.f21803c = aeu.m18552v(cxVar.f21771c);
        this.f21804d = cxVar.f21772d;
        this.f21805e = cxVar.f21773e;
        int g = cxVar.f21774f;
        this.f21806f = g;
        int h = cxVar.f21775g;
        this.f21807g = h;
        this.f21808h = h != -1 ? h : g;
        this.f21809i = cxVar.f21776h;
        this.f21810j = cxVar.f21777i;
        this.f21811k = cxVar.f21778j;
        this.f21812l = cxVar.f21779k;
        this.f21813m = cxVar.f21780l;
        this.f21814n = cxVar.f21781m == null ? Collections.emptyList() : cxVar.f21781m;
        C7031jc o = cxVar.f21782n;
        this.f21815o = o;
        this.f21816p = cxVar.f21783o;
        this.f21817q = cxVar.f21784p;
        this.f21818r = cxVar.f21785q;
        this.f21819s = cxVar.f21786r;
        int i = 0;
        this.f21820t = cxVar.f21787s == -1 ? 0 : cxVar.f21787s;
        this.f21821u = cxVar.f21788t == -1.0f ? 1.0f : cxVar.f21788t;
        this.f21822v = cxVar.f21789u;
        this.f21823w = cxVar.f21790v;
        this.f21824x = cxVar.f21791w;
        this.f21825y = cxVar.f21792x;
        this.f21826z = cxVar.f21793y;
        this.f21795A = cxVar.f21794z;
        this.f21796B = cxVar.f21765A == -1 ? 0 : cxVar.f21765A;
        this.f21797C = cxVar.f21766B != -1 ? cxVar.f21766B : i;
        this.f21798D = cxVar.f21767C;
        this.f21799E = (cxVar.f21768D != null || o == null) ? cxVar.f21768D : C7040jl.class;
    }

    /* renamed from: a */
    public final C6863cx mo15636a() {
        return new C6863cx(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0045  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.ads.interactivemedia.p367v3.internal.C6864cy mo15637b(com.google.ads.interactivemedia.p367v3.internal.C6864cy r14) {
        /*
            r13 = this;
            if (r13 != r14) goto L_0x0003
            return r13
        L_0x0003:
            java.lang.String r0 = r13.f21812l
            int r0 = com.google.ads.interactivemedia.p367v3.internal.adz.m18358j(r0)
            java.lang.String r1 = r14.f21801a
            java.lang.String r2 = r14.f21802b
            if (r2 != 0) goto L_0x0011
            java.lang.String r2 = r13.f21802b
        L_0x0011:
            java.lang.String r3 = r13.f21803c
            r4 = 3
            r5 = 1
            if (r0 == r4) goto L_0x001a
            if (r0 != r5) goto L_0x001f
            r0 = 1
        L_0x001a:
            java.lang.String r4 = r14.f21803c
            if (r4 == 0) goto L_0x001f
            r3 = r4
        L_0x001f:
            int r4 = r13.f21806f
            r6 = -1
            if (r4 != r6) goto L_0x0026
            int r4 = r14.f21806f
        L_0x0026:
            int r7 = r13.f21807g
            if (r7 != r6) goto L_0x002c
            int r7 = r14.f21807g
        L_0x002c:
            java.lang.String r6 = r13.f21809i
            if (r6 != 0) goto L_0x003e
            java.lang.String r8 = r14.f21809i
            java.lang.String r8 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18502T(r8, r0)
            java.lang.String[] r9 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18503U(r8)
            int r9 = r9.length
            if (r9 != r5) goto L_0x003e
            r6 = r8
        L_0x003e:
            com.google.ads.interactivemedia.v3.internal.qz r5 = r13.f21810j
            if (r5 != 0) goto L_0x0045
            com.google.ads.interactivemedia.v3.internal.qz r5 = r14.f21810j
            goto L_0x004b
        L_0x0045:
            com.google.ads.interactivemedia.v3.internal.qz r8 = r14.f21810j
            com.google.ads.interactivemedia.v3.internal.qz r5 = r5.mo16343c(r8)
        L_0x004b:
            float r8 = r13.f21819s
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r9 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r9 != 0) goto L_0x0058
            r9 = 2
            if (r0 != r9) goto L_0x0058
            float r8 = r14.f21819s
        L_0x0058:
            int r0 = r13.f21804d
            int r9 = r14.f21804d
            int r10 = r13.f21805e
            int r11 = r14.f21805e
            com.google.ads.interactivemedia.v3.internal.jc r14 = r14.f21815o
            com.google.ads.interactivemedia.v3.internal.jc r12 = r13.f21815o
            com.google.ads.interactivemedia.v3.internal.jc r14 = com.google.ads.interactivemedia.p367v3.internal.C7031jc.m20845a(r14, r12)
            com.google.ads.interactivemedia.v3.internal.cx r12 = r13.mo15636a()
            r12.mo15617S(r1)
            r12.mo15619U(r2)
            r12.mo15620V(r3)
            r0 = r0 | r9
            r12.mo15632ag(r0)
            r0 = r10 | r11
            r12.mo15628ac(r0)
            r12.mo15605G(r4)
            r12.mo15624Z(r7)
            r12.mo15607I(r6)
            r12.mo15622X(r5)
            r12.mo15610L(r14)
            r12.mo15614P(r8)
            com.google.ads.interactivemedia.v3.internal.cy r14 = r12.mo15625a()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C6864cy.mo15637b(com.google.ads.interactivemedia.v3.internal.cy):com.google.ads.interactivemedia.v3.internal.cy");
    }

    /* renamed from: c */
    public final C6864cy mo15638c(Class cls) {
        C6863cx a = mo15636a();
        a.mo15613O(cls);
        return a.mo15625a();
    }

    /* renamed from: d */
    public final int mo15639d() {
        int i;
        int i2 = this.f21817q;
        if (i2 == -1 || (i = this.f21818r) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final boolean mo15641e(C6864cy cyVar) {
        if (this.f21814n.size() != cyVar.f21814n.size()) {
            return false;
        }
        for (int i = 0; i < this.f21814n.size(); i++) {
            if (!Arrays.equals((byte[]) this.f21814n.get(i), (byte[]) cyVar.f21814n.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C6864cy cyVar = (C6864cy) obj;
            int i2 = this.f21800F;
            if ((i2 == 0 || (i = cyVar.f21800F) == 0 || i2 == i) && this.f21804d == cyVar.f21804d && this.f21805e == cyVar.f21805e && this.f21806f == cyVar.f21806f && this.f21807g == cyVar.f21807g && this.f21813m == cyVar.f21813m && this.f21816p == cyVar.f21816p && this.f21817q == cyVar.f21817q && this.f21818r == cyVar.f21818r && this.f21820t == cyVar.f21820t && this.f21823w == cyVar.f21823w && this.f21825y == cyVar.f21825y && this.f21826z == cyVar.f21826z && this.f21795A == cyVar.f21795A && this.f21796B == cyVar.f21796B && this.f21797C == cyVar.f21797C && this.f21798D == cyVar.f21798D && Float.compare(this.f21819s, cyVar.f21819s) == 0 && Float.compare(this.f21821u, cyVar.f21821u) == 0 && aeu.m18533c(this.f21799E, cyVar.f21799E) && aeu.m18533c(this.f21801a, cyVar.f21801a) && aeu.m18533c(this.f21802b, cyVar.f21802b) && aeu.m18533c(this.f21809i, cyVar.f21809i) && aeu.m18533c(this.f21811k, cyVar.f21811k) && aeu.m18533c(this.f21812l, cyVar.f21812l) && aeu.m18533c(this.f21803c, cyVar.f21803c) && Arrays.equals(this.f21822v, cyVar.f21822v) && aeu.m18533c(this.f21810j, cyVar.f21810j) && aeu.m18533c(this.f21824x, cyVar.f21824x) && aeu.m18533c(this.f21815o, cyVar.f21815o) && mo15641e(cyVar)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        String str = this.f21801a;
        String str2 = this.f21802b;
        String str3 = this.f21811k;
        String str4 = this.f21812l;
        String str5 = this.f21809i;
        int i = this.f21808h;
        String str6 = this.f21803c;
        int i2 = this.f21817q;
        int i3 = this.f21818r;
        float f = this.f21819s;
        int i4 = this.f21825y;
        int i5 = this.f21826z;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        int length4 = String.valueOf(str4).length();
        StringBuilder sb = new StringBuilder(length + 104 + length2 + length3 + length4 + String.valueOf(str5).length() + String.valueOf(str6).length());
        sb.append("Format(");
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(str4);
        sb.append(", ");
        sb.append(str5);
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        sb.append(str6);
        sb.append(", [");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(f);
        sb.append("], [");
        sb.append(i4);
        sb.append(", ");
        sb.append(i5);
        sb.append("])");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f21801a);
        parcel.writeString(this.f21802b);
        parcel.writeString(this.f21803c);
        parcel.writeInt(this.f21804d);
        parcel.writeInt(this.f21805e);
        parcel.writeInt(this.f21806f);
        parcel.writeInt(this.f21807g);
        parcel.writeString(this.f21809i);
        boolean z = false;
        parcel.writeParcelable(this.f21810j, 0);
        parcel.writeString(this.f21811k);
        parcel.writeString(this.f21812l);
        parcel.writeInt(this.f21813m);
        int size = this.f21814n.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray((byte[]) this.f21814n.get(i2));
        }
        parcel.writeParcelable(this.f21815o, 0);
        parcel.writeLong(this.f21816p);
        parcel.writeInt(this.f21817q);
        parcel.writeInt(this.f21818r);
        parcel.writeFloat(this.f21819s);
        parcel.writeInt(this.f21820t);
        parcel.writeFloat(this.f21821u);
        if (this.f21822v != null) {
            z = true;
        }
        aeu.m18550t(parcel, z);
        byte[] bArr = this.f21822v;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.f21823w);
        parcel.writeParcelable(this.f21824x, i);
        parcel.writeInt(this.f21825y);
        parcel.writeInt(this.f21826z);
        parcel.writeInt(this.f21795A);
        parcel.writeInt(this.f21796B);
        parcel.writeInt(this.f21797C);
        parcel.writeInt(this.f21798D);
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = this.f21800F;
        if (i7 != 0) {
            return i7;
        }
        String str = this.f21801a;
        int i8 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i9 = (i + 527) * 31;
        String str2 = this.f21802b;
        int hashCode = (i9 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f21803c;
        if (str3 == null) {
            i2 = 0;
        } else {
            i2 = str3.hashCode();
        }
        int i10 = (((((((((hashCode + i2) * 31) + this.f21804d) * 31) + this.f21805e) * 31) + this.f21806f) * 31) + this.f21807g) * 31;
        String str4 = this.f21809i;
        if (str4 == null) {
            i3 = 0;
        } else {
            i3 = str4.hashCode();
        }
        int i11 = (i10 + i3) * 31;
        C7243qz qzVar = this.f21810j;
        if (qzVar == null) {
            i4 = 0;
        } else {
            i4 = qzVar.hashCode();
        }
        int i12 = (i11 + i4) * 31;
        String str5 = this.f21811k;
        if (str5 == null) {
            i5 = 0;
        } else {
            i5 = str5.hashCode();
        }
        int i13 = (i12 + i5) * 31;
        String str6 = this.f21812l;
        if (str6 == null) {
            i6 = 0;
        } else {
            i6 = str6.hashCode();
        }
        int floatToIntBits = (((((((((((((((((((((((((((((i13 + i6) * 31) + this.f21813m) * 31) + ((int) this.f21816p)) * 31) + this.f21817q) * 31) + this.f21818r) * 31) + Float.floatToIntBits(this.f21819s)) * 31) + this.f21820t) * 31) + Float.floatToIntBits(this.f21821u)) * 31) + this.f21823w) * 31) + this.f21825y) * 31) + this.f21826z) * 31) + this.f21795A) * 31) + this.f21796B) * 31) + this.f21797C) * 31) + this.f21798D) * 31;
        Class cls = this.f21799E;
        if (cls != null) {
            i8 = cls.hashCode();
        }
        int i14 = floatToIntBits + i8;
        this.f21800F = i14;
        return i14;
    }
}
