package com.google.android.apps.gsa.shared.p7195y;

import android.graphics.drawable.Drawable;
import android.util.Size;
import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.shared.y.o */
/* compiled from: PG */
final class C91223o extends C91196ba {

    /* renamed from: a */
    private final String f254628a;

    /* renamed from: b */
    private final byte[] f254629b = null;

    /* renamed from: c */
    private final Size f254630c;

    /* renamed from: d */
    private final Integer f254631d;

    /* renamed from: e */
    private final Drawable f254632e;

    /* renamed from: f */
    private final Integer f254633f;

    /* renamed from: g */
    private final C91210bo f254634g;

    public C91223o(String str, Size size, Integer num, Drawable drawable, Integer num2, C91210bo boVar) {
        this.f254628a = str;
        this.f254630c = size;
        this.f254631d = num;
        this.f254632e = drawable;
        this.f254633f = num2;
        this.f254634g = boVar;
    }

    /* renamed from: a */
    public final Drawable mo85456a() {
        return null;
    }

    /* renamed from: b */
    public final Drawable mo85457b() {
        return this.f254632e;
    }

    /* renamed from: c */
    public final Size mo85458c() {
        return this.f254630c;
    }

    /* renamed from: d */
    public final C91230v mo85459d() {
        return null;
    }

    /* renamed from: e */
    public final C91194az mo85460e() {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
        r1 = r4.f254630c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0051, code lost:
        r1 = r4.f254631d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0066, code lost:
        r1 = r4.f254632e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007b, code lost:
        r1 = r4.f254633f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.apps.gsa.shared.p7195y.C91196ba
            r2 = 0
            if (r1 == 0) goto L_0x00ce
            com.google.android.apps.gsa.shared.y.ba r5 = (com.google.android.apps.gsa.shared.p7195y.C91196ba) r5
            java.lang.String r1 = r4.f254628a
            if (r1 != 0) goto L_0x0016
            java.lang.String r1 = r5.mo85468m()
            if (r1 != 0) goto L_0x00ce
            goto L_0x0020
        L_0x0016:
            java.lang.String r3 = r5.mo85468m()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00ce
        L_0x0020:
            boolean r1 = r5 instanceof com.google.android.apps.gsa.shared.p7195y.C91223o
            r3 = 0
            if (r1 == 0) goto L_0x002c
            r1 = r5
            com.google.android.apps.gsa.shared.y.o r1 = (com.google.android.apps.gsa.shared.p7195y.C91223o) r1
            byte[] r1 = r1.f254629b
            r1 = r3
            goto L_0x0030
        L_0x002c:
            byte[] r1 = r5.mo85470o()
        L_0x0030:
            boolean r1 = java.util.Arrays.equals(r3, r1)
            if (r1 == 0) goto L_0x00ce
            android.util.Size r1 = r4.f254630c
            if (r1 != 0) goto L_0x0041
            android.util.Size r1 = r5.mo85458c()
            if (r1 != 0) goto L_0x00ce
            goto L_0x004b
        L_0x0041:
            android.util.Size r3 = r5.mo85458c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00ce
        L_0x004b:
            java.lang.Integer r1 = r5.mo85467l()
            if (r1 != 0) goto L_0x00ce
            java.lang.Integer r1 = r4.f254631d
            if (r1 != 0) goto L_0x005c
            java.lang.Integer r1 = r5.mo85466k()
            if (r1 != 0) goto L_0x00ce
            goto L_0x0066
        L_0x005c:
            java.lang.Integer r3 = r5.mo85466k()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00ce
        L_0x0066:
            android.graphics.drawable.Drawable r1 = r4.f254632e
            if (r1 != 0) goto L_0x0071
            android.graphics.drawable.Drawable r1 = r5.mo85457b()
            if (r1 != 0) goto L_0x00ce
            goto L_0x007b
        L_0x0071:
            android.graphics.drawable.Drawable r3 = r5.mo85457b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00ce
        L_0x007b:
            java.lang.Integer r1 = r4.f254633f
            if (r1 != 0) goto L_0x0086
            java.lang.Integer r1 = r5.mo85465j()
            if (r1 != 0) goto L_0x00ce
            goto L_0x0091
        L_0x0086:
            java.lang.Integer r3 = r5.mo85465j()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0091
            goto L_0x00ce
        L_0x0091:
            android.graphics.drawable.Drawable r1 = r5.mo85456a()
            if (r1 != 0) goto L_0x00ce
            com.google.android.apps.gsa.shared.y.ba r1 = r5.mo85461f()
            if (r1 != 0) goto L_0x00ce
            boolean r1 = r5.mo85469n()
            if (r1 != 0) goto L_0x00ce
            java.lang.Boolean r1 = r5.mo85464i()
            if (r1 != 0) goto L_0x00ce
            com.google.android.apps.gsa.shared.y.bo r1 = r4.f254634g
            com.google.android.apps.gsa.shared.y.bo r3 = r5.mo85462g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00ce
            java.lang.Boolean r1 = r5.mo85463h()
            if (r1 != 0) goto L_0x00ce
            int r1 = r5.mo85471p()
            if (r1 != r0) goto L_0x00ce
            com.google.android.apps.gsa.shared.y.az r1 = r5.mo85460e()
            if (r1 != 0) goto L_0x00ce
            com.google.android.apps.gsa.shared.y.v r5 = r5.mo85459d()
            if (r5 != 0) goto L_0x00ce
            return r0
        L_0x00ce:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.p7195y.C91223o.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final C91196ba mo85461f() {
        return null;
    }

    /* renamed from: g */
    public final C91210bo mo85462g() {
        return this.f254634g;
    }

    /* renamed from: h */
    public final Boolean mo85463h() {
        return null;
    }

    /* renamed from: i */
    public final Boolean mo85464i() {
        return null;
    }

    /* renamed from: j */
    public final Integer mo85465j() {
        return this.f254633f;
    }

    /* renamed from: k */
    public final Integer mo85466k() {
        return this.f254631d;
    }

    /* renamed from: l */
    public final Integer mo85467l() {
        return null;
    }

    /* renamed from: m */
    public final String mo85468m() {
        return this.f254628a;
    }

    /* renamed from: n */
    public final boolean mo85469n() {
        return false;
    }

    /* renamed from: o */
    public final byte[] mo85470o() {
        return null;
    }

    /* renamed from: p */
    public final int mo85471p() {
        return 1;
    }

    public final String toString() {
        String str = this.f254628a;
        String arrays = Arrays.toString((byte[]) null);
        String valueOf = String.valueOf(this.f254630c);
        Integer num = this.f254631d;
        String valueOf2 = String.valueOf(this.f254632e);
        Integer num2 = this.f254633f;
        String obj = this.f254634g.toString();
        return "ImageRequest{url=" + str + ", imageContent=" + arrays + ", customSize=" + valueOf + ", quality=null, placeholderResourceId=" + num + ", placeholderDrawable=" + valueOf2 + ", errorResourceId=" + num2 + ", errorDrawable=null, thumbnailRequest=null, cacheOnly=false, diskCacheDisabled=null, transform=" + obj + ", autoFifeHandling=null, transition=NONE, drawableReceiver=null, downsampleParameters=null}";
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        String str = this.f254628a;
        int i5 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int hashCode = (((i ^ 1000003) * 1000003) ^ Arrays.hashCode((byte[]) null)) * 1000003;
        Size size = this.f254630c;
        if (size == null) {
            i2 = 0;
        } else {
            i2 = size.hashCode();
        }
        int i6 = (hashCode ^ i2) * -721379959;
        Integer num = this.f254631d;
        if (num == null) {
            i3 = 0;
        } else {
            i3 = num.hashCode();
        }
        int i7 = (i6 ^ i3) * 1000003;
        Drawable drawable = this.f254632e;
        if (drawable == null) {
            i4 = 0;
        } else {
            i4 = drawable.hashCode();
        }
        int i8 = (i7 ^ i4) * 1000003;
        Integer num2 = this.f254633f;
        if (num2 != null) {
            i5 = num2.hashCode();
        }
        return (((((((i8 ^ i5) * 583896283) ^ 1237) * -721379959) ^ this.f254634g.hashCode()) * -721379959) ^ 1) * -721379959;
    }
}
