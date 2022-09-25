package androidx.media;

/* renamed from: androidx.media.o */
/* compiled from: PG */
final class C2438o extends C2449z {

    /* renamed from: a */
    final /* synthetic */ C2403aa f6728a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2438o(Object obj, C2403aa aaVar) {
        super(obj);
        this.f6728a = aaVar;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void mo5853a(java.lang.Object r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0027
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r5.size()
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L_0x000f:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0028
            java.lang.Object r1 = r5.next()
            android.support.v4.media.MediaBrowserCompat$MediaItem r1 = (android.support.p031v4.media.MediaBrowserCompat.MediaItem) r1
            android.os.Parcel r2 = android.os.Parcel.obtain()
            r3 = 0
            r1.writeToParcel(r2, r3)
            r0.add(r2)
            goto L_0x000f
        L_0x0027:
            r0 = 0
        L_0x0028:
            androidx.media.aa r5 = r4.f6728a
            r5.mo5816a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media.C2438o.mo5853a(java.lang.Object):void");
    }

    /* renamed from: b */
    public final void mo5857b() {
        this.f6728a.f6644a.detach();
    }
}
