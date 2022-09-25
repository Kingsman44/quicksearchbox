package com.google.lens.sdk;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import android.location.Location;
import android.net.Uri;
import com.google.lens.p4707j.C62471cu;
import java.util.Arrays;

/* renamed from: com.google.lens.sdk.b */
/* compiled from: PG */
final class C62636b extends C62647m {

    /* renamed from: a */
    public final Uri f169123a;

    /* renamed from: b */
    public final Bitmap f169124b;

    /* renamed from: c */
    public final String f169125c;

    /* renamed from: d */
    public final Location f169126d;

    /* renamed from: e */
    public final String f169127e;

    /* renamed from: f */
    public final byte[] f169128f = null;

    /* renamed from: g */
    public final Long f169129g;

    /* renamed from: h */
    public final C62471cu f169130h;

    /* renamed from: i */
    public final Integer f169131i;

    /* renamed from: j */
    public final String f169132j;

    /* renamed from: k */
    public final Boolean f169133k;

    public C62636b(Uri uri, Bitmap bitmap, String str, Location location, String str2, Long l, C62471cu cuVar, Integer num, String str3, Boolean bool) {
        this.f169123a = uri;
        this.f169124b = bitmap;
        this.f169125c = str;
        this.f169126d = location;
        this.f169127e = str2;
        this.f169129g = l;
        this.f169130h = cuVar;
        this.f169131i = num;
        this.f169132j = str3;
        this.f169133k = bool;
    }

    /* renamed from: a */
    public final Bitmap mo58538a() {
        return this.f169124b;
    }

    /* renamed from: b */
    public final PointF mo58539b() {
        return null;
    }

    /* renamed from: c */
    public final Rect mo58540c() {
        return null;
    }

    /* renamed from: d */
    public final Location mo58541d() {
        return this.f169126d;
    }

    /* renamed from: e */
    public final Uri mo58542e() {
        return this.f169123a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0090, code lost:
        r1 = r4.f169129g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00b1, code lost:
        r1 = r4.f169130h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00cc, code lost:
        r1 = r4.f169131i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00ed, code lost:
        r1 = r4.f169132j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0102, code lost:
        r1 = r4.f169133k;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.lens.sdk.C62647m
            r2 = 0
            if (r1 == 0) goto L_0x0119
            com.google.lens.sdk.m r5 = (com.google.lens.sdk.C62647m) r5
            android.net.Uri r1 = r4.f169123a
            if (r1 != 0) goto L_0x0016
            android.net.Uri r1 = r5.mo58542e()
            if (r1 != 0) goto L_0x0119
            goto L_0x0020
        L_0x0016:
            android.net.Uri r3 = r5.mo58542e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0119
        L_0x0020:
            android.graphics.Bitmap r1 = r4.f169124b
            if (r1 != 0) goto L_0x002b
            android.graphics.Bitmap r1 = r5.mo58538a()
            if (r1 != 0) goto L_0x0119
            goto L_0x0035
        L_0x002b:
            android.graphics.Bitmap r3 = r5.mo58538a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0119
        L_0x0035:
            android.graphics.Rect r1 = r5.mo58540c()
            if (r1 != 0) goto L_0x0119
            java.lang.String r1 = r4.f169125c
            if (r1 != 0) goto L_0x0046
            java.lang.String r1 = r5.mo58554o()
            if (r1 != 0) goto L_0x0119
            goto L_0x0050
        L_0x0046:
            java.lang.String r3 = r5.mo58554o()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0119
        L_0x0050:
            android.location.Location r1 = r4.f169126d
            if (r1 != 0) goto L_0x005b
            android.location.Location r1 = r5.mo58541d()
            if (r1 != 0) goto L_0x0119
            goto L_0x0065
        L_0x005b:
            android.location.Location r3 = r5.mo58541d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0119
        L_0x0065:
            java.lang.String r1 = r4.f169127e
            if (r1 != 0) goto L_0x0070
            java.lang.String r1 = r5.mo58556q()
            if (r1 != 0) goto L_0x0119
            goto L_0x007a
        L_0x0070:
            java.lang.String r3 = r5.mo58556q()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0119
        L_0x007a:
            boolean r1 = r5 instanceof com.google.lens.sdk.C62636b
            r3 = 0
            if (r1 == 0) goto L_0x0086
            r1 = r5
            com.google.lens.sdk.b r1 = (com.google.lens.sdk.C62636b) r1
            byte[] r1 = r1.f169128f
            r1 = r3
            goto L_0x008a
        L_0x0086:
            byte[] r1 = r5.mo58557r()
        L_0x008a:
            boolean r1 = java.util.Arrays.equals(r3, r1)
            if (r1 == 0) goto L_0x0119
            java.lang.Long r1 = r4.f169129g
            if (r1 != 0) goto L_0x009b
            java.lang.Long r1 = r5.mo58553n()
            if (r1 != 0) goto L_0x0119
            goto L_0x00a5
        L_0x009b:
            java.lang.Long r3 = r5.mo58553n()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0119
        L_0x00a5:
            java.lang.Boolean r1 = r5.mo58548i()
            if (r1 != 0) goto L_0x0119
            java.lang.Boolean r1 = r5.mo58546h()
            if (r1 != 0) goto L_0x0119
            com.google.lens.j.cu r1 = r4.f169130h
            if (r1 != 0) goto L_0x00bc
            com.google.lens.j.cu r1 = r5.mo58544f()
            if (r1 != 0) goto L_0x0119
            goto L_0x00c6
        L_0x00bc:
            com.google.lens.j.cu r3 = r5.mo58544f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0119
        L_0x00c6:
            java.lang.Integer r1 = r5.mo58552m()
            if (r1 != 0) goto L_0x0119
            java.lang.Integer r1 = r4.f169131i
            if (r1 != 0) goto L_0x00d7
            java.lang.Integer r1 = r5.mo58550k()
            if (r1 != 0) goto L_0x0119
            goto L_0x00e1
        L_0x00d7:
            java.lang.Integer r3 = r5.mo58550k()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0119
        L_0x00e1:
            android.graphics.PointF r1 = r5.mo58539b()
            if (r1 != 0) goto L_0x0119
            java.lang.Integer r1 = r5.mo58551l()
            if (r1 != 0) goto L_0x0119
            java.lang.String r1 = r4.f169132j
            if (r1 != 0) goto L_0x00f8
            java.lang.String r1 = r5.mo58555p()
            if (r1 != 0) goto L_0x0119
            goto L_0x0102
        L_0x00f8:
            java.lang.String r3 = r5.mo58555p()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0119
        L_0x0102:
            java.lang.Boolean r1 = r4.f169133k
            if (r1 != 0) goto L_0x010d
            java.lang.Boolean r5 = r5.mo58549j()
            if (r5 != 0) goto L_0x0119
            goto L_0x0118
        L_0x010d:
            java.lang.Boolean r5 = r5.mo58549j()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0118
            goto L_0x0119
        L_0x0118:
            return r0
        L_0x0119:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.lens.sdk.C62636b.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final C62471cu mo58544f() {
        return this.f169130h;
    }

    /* renamed from: g */
    public final C62646l mo58545g() {
        return new C62635a(this);
    }

    /* renamed from: h */
    public final Boolean mo58546h() {
        return null;
    }

    /* renamed from: i */
    public final Boolean mo58548i() {
        return null;
    }

    /* renamed from: j */
    public final Boolean mo58549j() {
        return this.f169133k;
    }

    /* renamed from: k */
    public final Integer mo58550k() {
        return this.f169131i;
    }

    /* renamed from: l */
    public final Integer mo58551l() {
        return null;
    }

    /* renamed from: m */
    public final Integer mo58552m() {
        return null;
    }

    /* renamed from: n */
    public final Long mo58553n() {
        return this.f169129g;
    }

    /* renamed from: o */
    public final String mo58554o() {
        return this.f169125c;
    }

    /* renamed from: p */
    public final String mo58555p() {
        return this.f169132j;
    }

    /* renamed from: q */
    public final String mo58556q() {
        return this.f169127e;
    }

    /* renamed from: r */
    public final byte[] mo58557r() {
        return null;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f169123a);
        String valueOf2 = String.valueOf(this.f169124b);
        String str = this.f169125c;
        String valueOf3 = String.valueOf(this.f169126d);
        String str2 = this.f169127e;
        String arrays = Arrays.toString((byte[]) null);
        Long l = this.f169129g;
        String valueOf4 = String.valueOf(this.f169130h);
        Integer num = this.f169131i;
        String str3 = this.f169132j;
        Boolean bool = this.f169133k;
        return "LensMetadata{bitmapUri=" + valueOf + ", bitmap=" + valueOf2 + ", imageLocationOnScreen=null, account=" + str + ", imageLocation=" + valueOf3 + ", imagePlaceId=" + str2 + ", imagePayload=" + arrays + ", lensActivityLaunchTimestampNanos=" + l + ", hideLensCloseButton=null, disableArtLookalike=null, lensInitParams=" + valueOf4 + ", transitionType=null, intentType=" + num + ", tapLocation=null, lensTheme=null, fifeUrl=" + str3 + ", promoAddShortcut=" + bool + "}";
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Uri uri = this.f169123a;
        int i9 = 0;
        int hashCode = ((uri == null ? 0 : uri.hashCode()) ^ 1000003) * 1000003;
        Bitmap bitmap = this.f169124b;
        if (bitmap == null) {
            i = 0;
        } else {
            i = bitmap.hashCode();
        }
        int i10 = (hashCode ^ i) * -721379959;
        String str = this.f169125c;
        if (str == null) {
            i2 = 0;
        } else {
            i2 = str.hashCode();
        }
        int i11 = (i10 ^ i2) * 1000003;
        Location location = this.f169126d;
        if (location == null) {
            i3 = 0;
        } else {
            i3 = location.hashCode();
        }
        int i12 = (i11 ^ i3) * 1000003;
        String str2 = this.f169127e;
        if (str2 == null) {
            i4 = 0;
        } else {
            i4 = str2.hashCode();
        }
        int hashCode2 = (((i12 ^ i4) * 1000003) ^ Arrays.hashCode((byte[]) null)) * 1000003;
        Long l = this.f169129g;
        if (l == null) {
            i5 = 0;
        } else {
            i5 = l.hashCode();
        }
        int i13 = (hashCode2 ^ i5) * 583896283;
        C62471cu cuVar = this.f169130h;
        if (cuVar == null) {
            i6 = 0;
        } else {
            i6 = cuVar.hashCode();
        }
        int i14 = (i13 ^ i6) * -721379959;
        Integer num = this.f169131i;
        if (num == null) {
            i7 = 0;
        } else {
            i7 = num.hashCode();
        }
        int i15 = (i14 ^ i7) * 583896283;
        String str3 = this.f169132j;
        if (str3 == null) {
            i8 = 0;
        } else {
            i8 = str3.hashCode();
        }
        int i16 = (i15 ^ i8) * 1000003;
        Boolean bool = this.f169133k;
        if (bool != null) {
            i9 = bool.hashCode();
        }
        return i16 ^ i9;
    }
}
