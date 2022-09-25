package androidx.media;

import android.os.Bundle;

/* renamed from: androidx.media.v */
/* compiled from: PG */
final class C2445v extends C2449z {

    /* renamed from: a */
    final /* synthetic */ C2403aa f6737a;

    /* renamed from: b */
    final /* synthetic */ Bundle f6738b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2445v(Object obj, C2403aa aaVar, Bundle bundle) {
        super(obj);
        this.f6737a = aaVar;
        this.f6738b = bundle;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void mo5853a(java.lang.Object r5) {
        /*
            r4 = this;
            if (r5 != 0) goto L_0x0009
            androidx.media.aa r5 = r4.f6737a
            r0 = 0
            r5.mo5816a(r0)
            return
        L_0x0009:
            int r0 = r4.f6745h
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0015
            android.os.Bundle r0 = r4.f6738b
            java.util.List r5 = androidx.media.C2416an.m6440d(r5, r0)
        L_0x0015:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r5.size()
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L_0x0022:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x003a
            java.lang.Object r1 = r5.next()
            android.support.v4.media.MediaBrowserCompat$MediaItem r1 = (android.support.p031v4.media.MediaBrowserCompat.MediaItem) r1
            android.os.Parcel r2 = android.os.Parcel.obtain()
            r3 = 0
            r1.writeToParcel(r2, r3)
            r0.add(r2)
            goto L_0x0022
        L_0x003a:
            androidx.media.aa r5 = r4.f6737a
            r5.mo5816a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media.C2445v.mo5853a(java.lang.Object):void");
    }

    /* renamed from: b */
    public final void mo5857b() {
        this.f6737a.f6644a.detach();
    }
}
