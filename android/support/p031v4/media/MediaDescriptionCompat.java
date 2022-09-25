package android.support.p031v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.MediaDescriptionCompat */
/* compiled from: PG */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0325t();

    /* renamed from: a */
    public final String f932a;

    /* renamed from: b */
    public final CharSequence f933b;

    /* renamed from: c */
    public final CharSequence f934c;

    /* renamed from: d */
    public final CharSequence f935d;

    /* renamed from: e */
    public final Bitmap f936e;

    /* renamed from: f */
    public final Uri f937f;

    /* renamed from: g */
    public final Bundle f938g;

    /* renamed from: h */
    public final Uri f939h;

    /* renamed from: i */
    private MediaDescription f940i;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f932a = str;
        this.f933b = charSequence;
        this.f934c = charSequence2;
        this.f935d = charSequence3;
        this.f936e = bitmap;
        this.f937f = uri;
        this.f938g = bundle;
        this.f939h = uri2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.p031v4.media.MediaDescriptionCompat m599a(java.lang.Object r13) {
        /*
            r0 = 0
            if (r13 == 0) goto L_0x005c
            android.media.MediaDescription r13 = (android.media.MediaDescription) r13
            java.lang.String r2 = android.support.p031v4.media.C0326u.m1006i(r13)
            java.lang.CharSequence r3 = android.support.p031v4.media.C0326u.m1005h(r13)
            java.lang.CharSequence r4 = android.support.p031v4.media.C0326u.m1004g(r13)
            java.lang.CharSequence r5 = android.support.p031v4.media.C0326u.m1003f(r13)
            android.graphics.Bitmap r6 = android.support.p031v4.media.C0326u.m998a(r13)
            android.net.Uri r7 = android.support.p031v4.media.C0326u.m1001d(r13)
            android.os.Bundle r1 = android.support.p031v4.media.C0326u.m1002e(r13)
            if (r1 == 0) goto L_0x0027
            android.os.Bundle r1 = android.support.p031v4.media.session.MediaSessionCompat.m651a(r1)
        L_0x0027:
            java.lang.String r8 = "android.support.v4.media.description.MEDIA_URI"
            if (r1 == 0) goto L_0x0032
            android.os.Parcelable r9 = r1.getParcelable(r8)
            android.net.Uri r9 = (android.net.Uri) r9
            goto L_0x0033
        L_0x0032:
            r9 = r0
        L_0x0033:
            if (r9 == 0) goto L_0x004c
            java.lang.String r10 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r11 = r1.containsKey(r10)
            if (r11 == 0) goto L_0x0046
            int r11 = r1.size()
            r12 = 2
            if (r11 != r12) goto L_0x0046
            r8 = r0
            goto L_0x004d
        L_0x0046:
            r1.remove(r8)
            r1.remove(r10)
        L_0x004c:
            r8 = r1
        L_0x004d:
            if (r9 != 0) goto L_0x0054
            android.net.Uri r0 = android.support.p031v4.media.C0327v.m1014a(r13)
            r9 = r0
        L_0x0054:
            android.support.v4.media.MediaDescriptionCompat r0 = new android.support.v4.media.MediaDescriptionCompat
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r0.f940i = r13
        L_0x005c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p031v4.media.MediaDescriptionCompat.m599a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    /* renamed from: b */
    public final Object mo812b() {
        MediaDescription mediaDescription = this.f940i;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder b = C0326u.m999b();
        C0326u.m1011n(b, this.f932a);
        C0326u.m1013p(b, this.f933b);
        C0326u.m1012o(b, this.f934c);
        C0326u.m1007j(b, this.f935d);
        C0326u.m1009l(b, this.f936e);
        C0326u.m1010m(b, this.f937f);
        C0326u.m1008k(b, this.f938g);
        C0327v.m1015b(b, this.f939h);
        MediaDescription c = C0326u.m1000c(b);
        this.f940i = c;
        return c;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.f933b + ", " + this.f934c + ", " + this.f935d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ((MediaDescription) mo812b()).writeToParcel(parcel, i);
    }
}
