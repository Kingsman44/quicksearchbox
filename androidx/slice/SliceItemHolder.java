package androidx.slice;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.versionedparcelable.C4267f;

/* compiled from: PG */
public class SliceItemHolder implements C4267f {

    /* renamed from: a */
    public C4267f f13097a = null;

    /* renamed from: b */
    Parcelable f13098b = null;

    /* renamed from: c */
    String f13099c = null;

    /* renamed from: d */
    int f13100d = 0;

    /* renamed from: e */
    long f13101e = 0;

    /* renamed from: f */
    Bundle f13102f = null;

    /* renamed from: g */
    public C4109h f13103g;

    public SliceItemHolder(C4109h hVar) {
        this.f13103g = hVar;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SliceItemHolder(java.lang.String r5, java.lang.Object r6) {
        /*
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.f13097a = r0
            r4.f13098b = r0
            r4.f13099c = r0
            r1 = 0
            r4.f13100d = r1
            r2 = 0
            r4.f13101e = r2
            r4.f13102f = r0
            int r0 = r5.hashCode()
            switch(r0) {
                case -1422950858: goto L_0x0061;
                case -1377881982: goto L_0x0057;
                case 104431: goto L_0x004d;
                case 3327612: goto L_0x0043;
                case 3556653: goto L_0x0039;
                case 100313435: goto L_0x002f;
                case 100358090: goto L_0x0025;
                case 109526418: goto L_0x001b;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x006b
        L_0x001b:
            java.lang.String r0 = "slice"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x006b
            r5 = 2
            goto L_0x006c
        L_0x0025:
            java.lang.String r0 = "input"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x006b
            r5 = 3
            goto L_0x006c
        L_0x002f:
            java.lang.String r0 = "image"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x006b
            r5 = 1
            goto L_0x006c
        L_0x0039:
            java.lang.String r0 = "text"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x006b
            r5 = 4
            goto L_0x006c
        L_0x0043:
            java.lang.String r0 = "long"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x006b
            r5 = 6
            goto L_0x006c
        L_0x004d:
            java.lang.String r0 = "int"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x006b
            r5 = 5
            goto L_0x006c
        L_0x0057:
            java.lang.String r0 = "bundle"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x006b
            r5 = 7
            goto L_0x006c
        L_0x0061:
            java.lang.String r0 = "action"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x006b
            r5 = 0
            goto L_0x006c
        L_0x006b:
            r5 = -1
        L_0x006c:
            switch(r5) {
                case 0: goto L_0x00a2;
                case 1: goto L_0x009d;
                case 2: goto L_0x009d;
                case 3: goto L_0x0098;
                case 4: goto L_0x0087;
                case 5: goto L_0x007e;
                case 6: goto L_0x0075;
                case 7: goto L_0x0070;
                default: goto L_0x006f;
            }
        L_0x006f:
            return
        L_0x0070:
            android.os.Bundle r6 = (android.os.Bundle) r6
            r4.f13102f = r6
            return
        L_0x0075:
            java.lang.Long r6 = (java.lang.Long) r6
            long r5 = r6.longValue()
            r4.f13101e = r5
            return
        L_0x007e:
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r5 = r6.intValue()
            r4.f13100d = r5
            return
        L_0x0087:
            boolean r5 = r6 instanceof android.text.Spanned
            if (r5 == 0) goto L_0x0092
            android.text.Spanned r6 = (android.text.Spanned) r6
            java.lang.String r5 = androidx.core.p096h.C1951d.m5282c(r6, r1)
            goto L_0x0095
        L_0x0092:
            r5 = r6
            java.lang.String r5 = (java.lang.String) r5
        L_0x0095:
            r4.f13099c = r5
            return
        L_0x0098:
            android.os.Parcelable r6 = (android.os.Parcelable) r6
            r4.f13098b = r6
            return
        L_0x009d:
            androidx.versionedparcelable.f r6 = (androidx.versionedparcelable.C4267f) r6
            r4.f13097a = r6
            return
        L_0x00a2:
            androidx.core.i.e r6 = (androidx.core.p097i.C1970e) r6
            java.lang.Object r5 = r6.f5888a
            boolean r0 = r5 instanceof android.app.PendingIntent
            if (r0 == 0) goto L_0x00b5
            android.os.Parcelable r5 = (android.os.Parcelable) r5
            r4.f13098b = r5
            java.lang.Object r5 = r6.f5889b
            androidx.versionedparcelable.f r5 = (androidx.versionedparcelable.C4267f) r5
            r4.f13097a = r5
            return
        L_0x00b5:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Cannot write callback to parcel"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slice.SliceItemHolder.<init>(java.lang.String, java.lang.Object):void");
    }
}
