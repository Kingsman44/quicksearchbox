package androidx.media3.exoplayer.p143f;

import androidx.media3.common.C2680x;

/* renamed from: androidx.media3.exoplayer.f.a */
/* compiled from: PG */
final class C2998a implements C2999b {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.media3.extractor.metadata.C3584a mo6928a(androidx.media3.common.C2680x r6) {
        /*
            r5 = this;
            java.lang.String r6 = r6.f7496n
            if (r6 == 0) goto L_0x006c
            int r0 = r6.hashCode()
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r0) {
                case -1354451219: goto L_0x0038;
                case -1348231605: goto L_0x002e;
                case -1248341703: goto L_0x0024;
                case 1154383568: goto L_0x001a;
                case 1652648887: goto L_0x0010;
                default: goto L_0x000f;
            }
        L_0x000f:
            goto L_0x0042
        L_0x0010:
            java.lang.String r0 = "application/x-scte35"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0042
            r0 = 2
            goto L_0x0043
        L_0x001a:
            java.lang.String r0 = "application/x-emsg"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0042
            r0 = 1
            goto L_0x0043
        L_0x0024:
            java.lang.String r0 = "application/id3"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0042
            r0 = 0
            goto L_0x0043
        L_0x002e:
            java.lang.String r0 = "application/x-icy"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0042
            r0 = 3
            goto L_0x0043
        L_0x0038:
            java.lang.String r0 = "application/vnd.dvb.ait"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0042
            r0 = 4
            goto L_0x0043
        L_0x0042:
            r0 = -1
        L_0x0043:
            if (r0 == 0) goto L_0x0065
            if (r0 == r4) goto L_0x005f
            if (r0 == r3) goto L_0x0059
            if (r0 == r2) goto L_0x0053
            if (r0 != r1) goto L_0x006c
            androidx.media3.extractor.metadata.dvbsi.b r6 = new androidx.media3.extractor.metadata.dvbsi.b
            r6.<init>()
            return r6
        L_0x0053:
            androidx.media3.extractor.metadata.icy.a r6 = new androidx.media3.extractor.metadata.icy.a
            r6.<init>()
            return r6
        L_0x0059:
            androidx.media3.extractor.metadata.scte35.b r6 = new androidx.media3.extractor.metadata.scte35.b
            r6.<init>()
            return r6
        L_0x005f:
            androidx.media3.extractor.metadata.emsg.b r6 = new androidx.media3.extractor.metadata.emsg.b
            r6.<init>()
            return r6
        L_0x0065:
            androidx.media3.extractor.metadata.id3.i r6 = new androidx.media3.extractor.metadata.id3.i
            r0 = 0
            r6.<init>(r0)
            return r6
        L_0x006c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Attempted to create decoder for unsupported MIME type: "
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r6 = r1.concat(r6)
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.p143f.C2998a.mo6928a(androidx.media3.common.x):androidx.media3.extractor.metadata.a");
    }

    /* renamed from: b */
    public final boolean mo6929b(C2680x xVar) {
        String str = xVar.f7496n;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }
}
