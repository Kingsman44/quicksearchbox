package com.google.android.apps.gsa.shared.search.doodle;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.libraries.gsa.util.C23338c;
import com.google.android.libraries.p1623at.p1632e.C19553a;
import com.google.common.p4526f.C59071e;
import java.util.Arrays;

/* compiled from: PG */
public class DoodleData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C90495a();

    /* renamed from: a */
    public static final C59071e f252919a = C59071e.m91332i("com.google.android.apps.gsa.shared.search.doodle.DoodleData");

    /* renamed from: A */
    public byte[] f252920A;

    /* renamed from: B */
    public final String f252921B;

    /* renamed from: C */
    public final int f252922C;

    /* renamed from: D */
    public final String f252923D;

    /* renamed from: E */
    public final int f252924E;

    /* renamed from: F */
    public final int f252925F;

    /* renamed from: G */
    public final int f252926G;

    /* renamed from: H */
    public final String f252927H;

    /* renamed from: I */
    public final int f252928I;

    /* renamed from: J */
    public final int f252929J;

    /* renamed from: K */
    public final int f252930K;

    /* renamed from: L */
    public final int f252931L;

    /* renamed from: M */
    public final int f252932M;

    /* renamed from: N */
    public final int f252933N;

    /* renamed from: O */
    public final int f252934O;

    /* renamed from: P */
    public final int f252935P;

    /* renamed from: b */
    public final int f252936b;

    /* renamed from: c */
    public final Query f252937c;

    /* renamed from: d */
    public final int f252938d;

    /* renamed from: e */
    public final String f252939e;

    /* renamed from: f */
    public final String f252940f;

    /* renamed from: g */
    public final String f252941g;

    /* renamed from: h */
    public final String f252942h;

    /* renamed from: i */
    public final String f252943i;

    /* renamed from: j */
    public final String f252944j;

    /* renamed from: k */
    public final int f252945k;

    /* renamed from: l */
    public final int f252946l;

    /* renamed from: m */
    public final int f252947m;

    /* renamed from: n */
    public final int f252948n;

    /* renamed from: o */
    public final int f252949o;

    /* renamed from: p */
    public final Uri f252950p;

    /* renamed from: q */
    public final long f252951q;

    /* renamed from: r */
    public final int f252952r;

    /* renamed from: s */
    public final String f252953s;

    /* renamed from: t */
    public final Bundle f252954t;

    /* renamed from: u */
    public final boolean f252955u;

    /* renamed from: v */
    public final boolean f252956v;

    /* renamed from: w */
    public byte[] f252957w;

    /* renamed from: x */
    public boolean f252958x;

    /* renamed from: y */
    public final String f252959y;

    /* renamed from: z */
    public final int f252960z;

    public DoodleData(int i, Query query, int i2, int i3, String str, String str2, String str3, String str4, int i4, String str5, int i5, String str6, int i6, int i7, int i8, int i9, Uri uri, long j, int i10, String str7, Bundle bundle, boolean z, boolean z2, String str8, int i11, int i12, String str9, int i13, String str10, int i14, int i15, int i16, int i17, String str11, int i18, int i19, int i20, int i21) {
        this.f252936b = i;
        this.f252937c = query;
        this.f252938d = i2;
        this.f252931L = i3;
        this.f252939e = str;
        this.f252940f = str2;
        this.f252941g = str3;
        this.f252942h = str4;
        this.f252947m = i4;
        this.f252943i = str5;
        this.f252948n = i5;
        this.f252944j = str6;
        this.f252949o = i6;
        this.f252945k = i7;
        this.f252946l = i8;
        this.f252933N = i9;
        this.f252950p = uri;
        this.f252951q = j;
        this.f252952r = i10;
        this.f252953s = str7;
        this.f252954t = bundle;
        this.f252955u = z;
        this.f252956v = z2;
        this.f252959y = str8;
        this.f252960z = i11;
        this.f252932M = i12;
        this.f252921B = str9;
        this.f252922C = i13;
        this.f252923D = str10;
        this.f252924E = i14;
        this.f252925F = i15;
        this.f252926G = i16;
        this.f252934O = i17;
        this.f252927H = str11;
        this.f252928I = i18;
        this.f252929J = i19;
        this.f252930K = i20;
        this.f252935P = i21;
    }

    /* renamed from: a */
    public final boolean mo84530a(Context context, boolean z, boolean z2) {
        String str;
        byte[] bArr;
        if (z2) {
            str = this.f252923D;
        } else {
            str = this.f252943i;
        }
        boolean z3 = !TextUtils.isEmpty(str) && !C90772bp.m148283J(context);
        if (!z) {
            return z3;
        }
        if (!z3 || (bArr = this.f252957w) == null || bArr.length <= 0) {
            return false;
        }
        return true;
    }

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        r3 = r5.f252937c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.apps.gsa.shared.search.doodle.DoodleData
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            com.google.android.apps.gsa.shared.search.doodle.DoodleData r5 = (com.google.android.apps.gsa.shared.search.doodle.DoodleData) r5
            com.google.android.apps.gsa.shared.search.Query r1 = r4.f252937c
            if (r1 != 0) goto L_0x0014
            com.google.android.apps.gsa.shared.search.Query r3 = r5.f252937c
            if (r3 == 0) goto L_0x0032
        L_0x0014:
            if (r1 == 0) goto L_0x0137
            com.google.android.apps.gsa.shared.search.Query r3 = r5.f252937c
            if (r3 == 0) goto L_0x0137
            java.lang.CharSequence r1 = r1.f252768g
            java.lang.CharSequence r3 = r3.f252768g
            boolean r1 = android.text.TextUtils.equals(r1, r3)
            if (r1 == 0) goto L_0x0137
            com.google.android.apps.gsa.shared.search.Query r1 = r4.f252937c
            java.lang.String r1 = r1.f252772k
            com.google.android.apps.gsa.shared.search.Query r3 = r5.f252937c
            java.lang.String r3 = r3.f252772k
            boolean r1 = android.text.TextUtils.equals(r1, r3)
            if (r1 == 0) goto L_0x0137
        L_0x0032:
            int r1 = r4.f252936b
            int r3 = r5.f252936b
            if (r1 != r3) goto L_0x0137
            int r1 = r4.f252938d
            int r3 = r5.f252938d
            if (r1 != r3) goto L_0x0137
            int r1 = r4.f252931L
            int r3 = r5.f252931L
            if (r1 != r3) goto L_0x0137
            java.lang.String r1 = r4.f252939e
            java.lang.String r3 = r5.f252939e
            boolean r1 = android.text.TextUtils.equals(r1, r3)
            if (r1 == 0) goto L_0x0137
            java.lang.String r1 = r4.f252940f
            java.lang.String r3 = r5.f252940f
            boolean r1 = android.text.TextUtils.equals(r1, r3)
            if (r1 == 0) goto L_0x0137
            java.lang.String r1 = r4.f252941g
            java.lang.String r3 = r5.f252941g
            boolean r1 = android.text.TextUtils.equals(r1, r3)
            if (r1 == 0) goto L_0x0137
            java.lang.String r1 = r4.f252942h
            java.lang.String r3 = r5.f252942h
            boolean r1 = android.text.TextUtils.equals(r1, r3)
            if (r1 == 0) goto L_0x0137
            int r1 = r4.f252947m
            int r3 = r5.f252947m
            if (r1 != r3) goto L_0x0137
            java.lang.String r1 = r4.f252943i
            java.lang.String r3 = r5.f252943i
            boolean r1 = android.text.TextUtils.equals(r1, r3)
            if (r1 == 0) goto L_0x0137
            int r1 = r4.f252948n
            int r3 = r5.f252948n
            if (r1 != r3) goto L_0x0137
            java.lang.String r1 = r4.f252944j
            java.lang.String r3 = r5.f252944j
            boolean r1 = android.text.TextUtils.equals(r1, r3)
            if (r1 == 0) goto L_0x0137
            int r1 = r4.f252949o
            int r3 = r5.f252949o
            if (r1 != r3) goto L_0x0137
            int r1 = r4.f252945k
            int r3 = r5.f252945k
            if (r1 != r3) goto L_0x0137
            int r1 = r4.f252946l
            int r3 = r5.f252946l
            if (r1 != r3) goto L_0x0137
            android.net.Uri r1 = r4.f252950p
            android.net.Uri r3 = r5.f252950p
            boolean r1 = com.google.common.base.C58832aw.m90831a(r1, r3)
            if (r1 == 0) goto L_0x0137
            int r1 = r4.f252952r
            int r3 = r5.f252952r
            if (r1 != r3) goto L_0x0137
            java.lang.String r1 = r4.f252953s
            java.lang.String r3 = r5.f252953s
            boolean r1 = android.text.TextUtils.equals(r1, r3)
            if (r1 == 0) goto L_0x0137
            android.os.Bundle r1 = r4.f252954t
            android.os.Bundle r3 = r5.f252954t
            boolean r1 = com.google.android.libraries.p1623at.p1632e.C19553a.m37294b(r1, r3)
            if (r1 == 0) goto L_0x0137
            boolean r1 = r4.f252955u
            boolean r3 = r5.f252955u
            if (r1 != r3) goto L_0x0137
            boolean r1 = r4.f252956v
            boolean r3 = r5.f252956v
            if (r1 != r3) goto L_0x0137
            java.lang.String r1 = r4.f252959y
            java.lang.String r3 = r5.f252959y
            boolean r1 = android.text.TextUtils.equals(r1, r3)
            if (r1 == 0) goto L_0x0137
            int r1 = r4.f252960z
            int r3 = r5.f252960z
            if (r1 != r3) goto L_0x0137
            int r1 = r4.f252932M
            int r3 = r5.f252932M
            if (r1 != r3) goto L_0x0137
            int r1 = r4.f252933N
            int r3 = r5.f252933N
            if (r1 != r3) goto L_0x0137
            java.lang.String r1 = r4.f252921B
            java.lang.String r3 = r5.f252921B
            boolean r1 = android.text.TextUtils.equals(r1, r3)
            if (r1 == 0) goto L_0x0137
            int r1 = r4.f252922C
            int r3 = r5.f252922C
            if (r1 != r3) goto L_0x0137
            int r1 = r4.f252925F
            int r3 = r5.f252925F
            if (r1 != r3) goto L_0x0137
            int r1 = r4.f252926G
            int r3 = r5.f252926G
            if (r1 != r3) goto L_0x0137
            java.lang.String r1 = r4.f252927H
            java.lang.String r3 = r5.f252927H
            boolean r1 = android.text.TextUtils.equals(r1, r3)
            if (r1 == 0) goto L_0x0137
            int r1 = r4.f252928I
            int r3 = r5.f252928I
            if (r1 != r3) goto L_0x0137
            int r1 = r4.f252929J
            int r3 = r5.f252929J
            if (r1 != r3) goto L_0x0137
            int r1 = r4.f252930K
            int r3 = r5.f252930K
            if (r1 != r3) goto L_0x0137
            byte[] r1 = r4.f252957w
            byte[] r3 = r5.f252957w
            boolean r1 = java.util.Arrays.equals(r1, r3)
            if (r1 == 0) goto L_0x0137
            byte[] r1 = r4.f252920A
            byte[] r5 = r5.f252920A
            boolean r5 = java.util.Arrays.equals(r1, r5)
            if (r5 == 0) goto L_0x0137
            return r0
        L_0x0137:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.search.doodle.DoodleData.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Object[] objArr = new Object[40];
        objArr[0] = Integer.valueOf(this.f252936b);
        Query query = this.f252937c;
        String str = null;
        objArr[1] = query != null ? query.f252768g : null;
        if (query != null) {
            str = query.f252772k;
        }
        objArr[2] = str;
        objArr[3] = Integer.valueOf(this.f252938d);
        objArr[4] = Integer.valueOf(this.f252931L);
        objArr[5] = this.f252939e;
        objArr[6] = this.f252940f;
        objArr[7] = this.f252941g;
        objArr[8] = this.f252942h;
        objArr[9] = Integer.valueOf(this.f252947m);
        objArr[10] = this.f252943i;
        objArr[11] = Integer.valueOf(this.f252948n);
        objArr[12] = this.f252944j;
        objArr[13] = Integer.valueOf(this.f252949o);
        objArr[14] = Integer.valueOf(this.f252945k);
        objArr[15] = Integer.valueOf(this.f252946l);
        objArr[16] = this.f252950p;
        objArr[17] = Integer.valueOf(this.f252952r);
        objArr[18] = this.f252953s;
        objArr[19] = Integer.valueOf(C19553a.m37293a(this.f252954t));
        objArr[20] = Boolean.valueOf(this.f252955u);
        objArr[21] = Boolean.valueOf(this.f252956v);
        objArr[22] = this.f252959y;
        objArr[23] = Integer.valueOf(this.f252960z);
        objArr[24] = Integer.valueOf(this.f252932M);
        objArr[25] = Integer.valueOf(this.f252933N);
        objArr[26] = this.f252921B;
        objArr[27] = Integer.valueOf(this.f252922C);
        objArr[28] = this.f252923D;
        objArr[29] = Integer.valueOf(this.f252924E);
        objArr[30] = Integer.valueOf(this.f252925F);
        objArr[31] = Integer.valueOf(this.f252926G);
        objArr[32] = Integer.valueOf(this.f252934O);
        objArr[33] = this.f252927H;
        objArr[34] = Integer.valueOf(this.f252928I);
        objArr[35] = Integer.valueOf(this.f252929J);
        objArr[36] = Integer.valueOf(this.f252930K);
        objArr[37] = Integer.valueOf(this.f252935P);
        objArr[38] = Integer.valueOf(Arrays.hashCode(this.f252957w));
        objArr[39] = Integer.valueOf(Arrays.hashCode(this.f252920A));
        return Arrays.hashCode(objArr);
    }

    public final String toString() {
        Object[] objArr = new Object[40];
        objArr[0] = Integer.valueOf(this.f252936b);
        objArr[1] = this.f252937c;
        objArr[2] = Integer.valueOf(this.f252938d);
        int i = this.f252931L;
        String str = "null";
        objArr[3] = i != 0 ? Integer.toString(i) : str;
        objArr[4] = this.f252939e;
        objArr[5] = this.f252940f;
        objArr[6] = this.f252941g;
        objArr[7] = this.f252942h;
        objArr[8] = Integer.valueOf(this.f252947m);
        objArr[9] = this.f252943i;
        objArr[10] = Integer.valueOf(this.f252948n);
        objArr[11] = this.f252944j;
        objArr[12] = Integer.valueOf(this.f252949o);
        objArr[13] = Integer.valueOf(this.f252945k);
        objArr[14] = Integer.valueOf(this.f252946l);
        objArr[15] = this.f252950p;
        objArr[16] = Long.valueOf(this.f252951q);
        objArr[17] = Integer.valueOf(this.f252952r);
        objArr[18] = this.f252953s;
        objArr[19] = this.f252954t;
        objArr[20] = Boolean.valueOf(this.f252955u);
        objArr[21] = Boolean.valueOf(this.f252956v);
        objArr[22] = this.f252959y;
        objArr[23] = Integer.valueOf(this.f252960z);
        int i2 = this.f252932M;
        objArr[24] = i2 != 0 ? Integer.toString(i2 - 1) : str;
        int i3 = this.f252933N;
        objArr[25] = i3 != 0 ? Integer.toString(i3 - 1) : str;
        objArr[26] = Arrays.toString(this.f252957w);
        objArr[27] = Arrays.toString(this.f252920A);
        objArr[28] = this.f252921B;
        objArr[29] = Integer.valueOf(this.f252922C);
        objArr[30] = this.f252923D;
        objArr[31] = Integer.valueOf(this.f252924E);
        objArr[32] = Integer.valueOf(this.f252925F);
        objArr[33] = Integer.valueOf(this.f252926G);
        int i4 = this.f252934O;
        objArr[34] = i4 != 0 ? Integer.toString(i4 - 1) : str;
        objArr[35] = this.f252927H;
        objArr[36] = Integer.valueOf(this.f252928I);
        objArr[37] = Integer.valueOf(this.f252929J);
        objArr[38] = Integer.valueOf(this.f252930K);
        int i5 = this.f252935P;
        if (i5 != 0) {
            str = Integer.toString(i5 - 1);
        }
        objArr[39] = str;
        return String.format("DoodleData<id=%d, query=%s, doodleType=%d, intent=%s, altText=%s, shareText=%s, targetUrl=%s, imageUrl=%s, imageSlot=%d, gifUrl=%s, gifSlot=%d, mediumImageUrl=%s, mediumImageSlot=%d, mediumImageBackgroundColor=%d, mediumImageBurgerColor=%d, fullpageInteractiveUrl=%s, timeToLiveMs=%d, screenOrientation=%d, pluginName=%s, extraData=%s, useNowHeaderSearchAffordance=%b, useNowHeaderShareButton=%b, superGImageUrl=%s, superGImageSlot=%s, largeImageBrightness=%s, mediumImageBrightness=%s, gifBytes=%s, superGAnimationBytes=%s, darkImageUrl=%s, darkImageSlot=%d, darkGifUrl=%s, darkGifSlot=%d, darkImageBackgroundColor=%d, darkImageBurgerColor=%d, darkImageBrightness=%s, darkMediumImageUrl=%s, darkMediumImageSlot=%d, darkMediumImageBackgroundColor=%d, darkMediumImageBurgerColor=%d, darkMediumImageBrightness=%s>", objArr).replaceAll("[\n\r]+ *", " ");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f252936b);
        parcel.writeParcelable(this.f252937c, i);
        parcel.writeInt(this.f252938d);
        int i2 = this.f252931L;
        if (i2 == 0) {
            i2 = 0;
        }
        parcel.writeInt(i2);
        parcel.writeString(this.f252939e);
        parcel.writeString(this.f252940f);
        parcel.writeString(this.f252941g);
        parcel.writeString(this.f252942h);
        parcel.writeInt(this.f252947m);
        parcel.writeString(this.f252943i);
        parcel.writeInt(this.f252948n);
        parcel.writeString(this.f252944j);
        parcel.writeInt(this.f252949o);
        parcel.writeInt(this.f252945k);
        parcel.writeInt(this.f252946l);
        parcel.writeParcelable(this.f252950p, i);
        parcel.writeLong(this.f252951q);
        parcel.writeInt(this.f252952r);
        parcel.writeString(this.f252953s);
        parcel.writeParcelable(this.f252954t, i);
        parcel.writeByte(this.f252955u ? (byte) 1 : 0);
        parcel.writeByte(this.f252956v ? (byte) 1 : 0);
        parcel.writeString(this.f252959y);
        parcel.writeInt(this.f252960z);
        int i3 = this.f252932M;
        int i4 = i3 - 1;
        if (i3 != 0) {
            parcel.writeInt(i4);
            int i5 = this.f252933N;
            int i6 = i5 - 1;
            if (i5 != 0) {
                parcel.writeInt(i6);
                parcel.writeString(this.f252921B);
                parcel.writeInt(this.f252922C);
                parcel.writeString(this.f252923D);
                parcel.writeInt(this.f252924E);
                parcel.writeInt(this.f252925F);
                parcel.writeInt(this.f252926G);
                int i7 = this.f252934O;
                int i8 = i7 - 1;
                if (i7 != 0) {
                    parcel.writeInt(i8);
                    parcel.writeString(this.f252927H);
                    parcel.writeInt(this.f252928I);
                    parcel.writeInt(this.f252929J);
                    parcel.writeInt(this.f252930K);
                    int i9 = this.f252935P;
                    int i10 = i9 - 1;
                    if (i9 != 0) {
                        parcel.writeInt(i10);
                        parcel.writeByte(this.f252958x ? (byte) 1 : 0);
                        C23338c.m43770b(parcel, this.f252957w);
                        C23338c.m43770b(parcel, this.f252920A);
                        return;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }
}
