package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.cast.internal.CastEurekaInfo;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
public class CastDevice extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C143604m();

    /* renamed from: a */
    public final String f388599a;

    /* renamed from: b */
    String f388600b;

    /* renamed from: c */
    public InetAddress f388601c;

    /* renamed from: d */
    public final String f388602d;

    /* renamed from: e */
    public final String f388603e;

    /* renamed from: f */
    public final String f388604f;

    /* renamed from: g */
    public final int f388605g;

    /* renamed from: h */
    public final List f388606h;

    /* renamed from: i */
    public final int f388607i;

    /* renamed from: j */
    public final int f388608j;

    /* renamed from: k */
    public final String f388609k;

    /* renamed from: l */
    public final String f388610l;

    /* renamed from: m */
    public final int f388611m;

    /* renamed from: n */
    public final String f388612n;

    /* renamed from: o */
    public final byte[] f388613o;

    /* renamed from: p */
    public final String f388614p;

    /* renamed from: q */
    public final boolean f388615q;

    /* renamed from: r */
    private final CastEurekaInfo f388616r;

    public CastDevice(String str, String str2, String str3, String str4, String str5, int i, List list, int i2, int i3, String str6, String str7, int i4, String str8, byte[] bArr, String str9, boolean z, CastEurekaInfo castEurekaInfo) {
        List list2;
        this.f388599a = m232554e(str);
        String e = m232554e(str2);
        this.f388600b = e;
        if (!TextUtils.isEmpty(e)) {
            try {
                this.f388601c = InetAddress.getByName(this.f388600b);
            } catch (UnknownHostException e2) {
                String str10 = this.f388600b;
                String message = e2.getMessage();
                Log.i("CastDevice", "Unable to convert host address (" + str10 + ") to ipaddress: " + message);
            }
        }
        this.f388602d = m232554e(str3);
        this.f388603e = m232554e(str4);
        this.f388604f = m232554e(str5);
        this.f388605g = i;
        if (list != null) {
            list2 = list;
        } else {
            list2 = new ArrayList();
        }
        this.f388606h = list2;
        this.f388607i = i2;
        this.f388608j = i3;
        this.f388609k = m232554e(str6);
        this.f388610l = str7;
        this.f388611m = i4;
        this.f388612n = str8;
        this.f388613o = bArr;
        this.f388614p = str9;
        this.f388615q = z;
        this.f388616r = castEurekaInfo;
    }

    /* renamed from: a */
    public static CastDevice m232553a(Bundle bundle) {
        ClassLoader classLoader;
        if (bundle == null || (classLoader = CastDevice.class.getClassLoader()) == null) {
            return null;
        }
        bundle.setClassLoader(classLoader);
        return (CastDevice) bundle.getParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE");
    }

    /* renamed from: e */
    private static String m232554e(String str) {
        return str == null ? BuildConfig.FLAVOR : str;
    }

    /* renamed from: b */
    public final CastEurekaInfo mo118382b() {
        CastEurekaInfo castEurekaInfo = this.f388616r;
        if (castEurekaInfo != null) {
            return castEurekaInfo;
        }
        return (mo118384d(32) || mo118384d(64)) ? new CastEurekaInfo(1, false) : castEurekaInfo;
    }

    /* renamed from: c */
    public final String mo118383c() {
        return this.f388599a.startsWith("__cast_nearby__") ? this.f388599a.substring(16) : this.f388599a;
    }

    /* renamed from: d */
    public final boolean mo118384d(int i) {
        return (this.f388607i & i) == i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009a, code lost:
        r1 = r4.f388613o;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.gms.cast.CastDevice
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            com.google.android.gms.cast.CastDevice r5 = (com.google.android.gms.cast.CastDevice) r5
            java.lang.String r1 = r4.f388599a
            java.lang.String r3 = r5.f388599a
            boolean r1 = com.google.android.gms.cast.internal.C143596v.m233278k(r1, r3)
            if (r1 == 0) goto L_0x00c9
            java.net.InetAddress r1 = r4.f388601c
            java.net.InetAddress r3 = r5.f388601c
            boolean r1 = com.google.android.gms.cast.internal.C143596v.m233278k(r1, r3)
            if (r1 == 0) goto L_0x00c9
            java.lang.String r1 = r4.f388603e
            java.lang.String r3 = r5.f388603e
            boolean r1 = com.google.android.gms.cast.internal.C143596v.m233278k(r1, r3)
            if (r1 == 0) goto L_0x00c9
            java.lang.String r1 = r4.f388602d
            java.lang.String r3 = r5.f388602d
            boolean r1 = com.google.android.gms.cast.internal.C143596v.m233278k(r1, r3)
            if (r1 == 0) goto L_0x00c9
            java.lang.String r1 = r4.f388604f
            java.lang.String r3 = r5.f388604f
            boolean r1 = com.google.android.gms.cast.internal.C143596v.m233278k(r1, r3)
            if (r1 == 0) goto L_0x00c9
            int r1 = r4.f388605g
            int r3 = r5.f388605g
            if (r1 != r3) goto L_0x00c9
            java.util.List r1 = r4.f388606h
            java.util.List r3 = r5.f388606h
            boolean r1 = com.google.android.gms.cast.internal.C143596v.m233278k(r1, r3)
            if (r1 == 0) goto L_0x00c9
            int r1 = r4.f388607i
            int r3 = r5.f388607i
            if (r1 != r3) goto L_0x00c9
            int r1 = r4.f388608j
            int r3 = r5.f388608j
            if (r1 != r3) goto L_0x00c9
            java.lang.String r1 = r4.f388609k
            java.lang.String r3 = r5.f388609k
            boolean r1 = com.google.android.gms.cast.internal.C143596v.m233278k(r1, r3)
            if (r1 == 0) goto L_0x00c9
            int r1 = r4.f388611m
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r3 = r5.f388611m
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r1 = com.google.android.gms.cast.internal.C143596v.m233278k(r1, r3)
            if (r1 == 0) goto L_0x00c9
            java.lang.String r1 = r4.f388612n
            java.lang.String r3 = r5.f388612n
            boolean r1 = com.google.android.gms.cast.internal.C143596v.m233278k(r1, r3)
            if (r1 == 0) goto L_0x00c9
            java.lang.String r1 = r4.f388610l
            java.lang.String r3 = r5.f388610l
            boolean r1 = com.google.android.gms.cast.internal.C143596v.m233278k(r1, r3)
            if (r1 == 0) goto L_0x00c9
            java.lang.String r1 = r4.f388604f
            java.lang.String r3 = r5.f388604f
            boolean r1 = com.google.android.gms.cast.internal.C143596v.m233278k(r1, r3)
            if (r1 == 0) goto L_0x00c9
            int r1 = r4.f388605g
            int r3 = r5.f388605g
            if (r1 != r3) goto L_0x00c9
            byte[] r1 = r4.f388613o
            if (r1 != 0) goto L_0x00a2
            byte[] r3 = r5.f388613o
            if (r3 == 0) goto L_0x00aa
        L_0x00a2:
            byte[] r3 = r5.f388613o
            boolean r1 = java.util.Arrays.equals(r1, r3)
            if (r1 == 0) goto L_0x00c9
        L_0x00aa:
            java.lang.String r1 = r4.f388614p
            java.lang.String r3 = r5.f388614p
            boolean r1 = com.google.android.gms.cast.internal.C143596v.m233278k(r1, r3)
            if (r1 == 0) goto L_0x00c9
            boolean r1 = r4.f388615q
            boolean r3 = r5.f388615q
            if (r1 != r3) goto L_0x00c9
            com.google.android.gms.cast.internal.CastEurekaInfo r1 = r4.mo118382b()
            com.google.android.gms.cast.internal.CastEurekaInfo r5 = r5.mo118382b()
            boolean r5 = com.google.android.gms.cast.internal.C143596v.m233278k(r1, r5)
            if (r5 == 0) goto L_0x00c9
            return r0
        L_0x00c9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.CastDevice.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return this.f388599a.hashCode();
    }

    public final String toString() {
        return String.format("\"%s\" (%s)", new Object[]{this.f388602d, this.f388599a});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 2, this.f388599a);
        C143947c.m234106y(parcel, 3, this.f388600b);
        C143947c.m234106y(parcel, 4, this.f388602d);
        C143947c.m234106y(parcel, 5, this.f388603e);
        C143947c.m234106y(parcel, 6, this.f388604f);
        C143947c.m234089h(parcel, 7, this.f388605g);
        C143947c.m234080C(parcel, 8, Collections.unmodifiableList(this.f388606h));
        C143947c.m234089h(parcel, 9, this.f388607i);
        C143947c.m234089h(parcel, 10, this.f388608j);
        C143947c.m234106y(parcel, 11, this.f388609k);
        C143947c.m234106y(parcel, 12, this.f388610l);
        C143947c.m234089h(parcel, 13, this.f388611m);
        C143947c.m234106y(parcel, 14, this.f388612n);
        C143947c.m234094m(parcel, 15, this.f388613o);
        C143947c.m234106y(parcel, 16, this.f388614p);
        C143947c.m234084c(parcel, 17, this.f388615q);
        C143947c.m234105x(parcel, 18, mo118382b(), i);
        C143947c.m234083b(parcel, a);
    }
}
