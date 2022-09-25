package androidx.media3.exoplayer.p150j;

import com.google.common.base.C58839bc;

/* renamed from: androidx.media3.exoplayer.j.e */
/* compiled from: PG */
public final /* synthetic */ class C3209e implements C58839bc {

    /* renamed from: a */
    public final /* synthetic */ C3195ab f9632a;

    public /* synthetic */ C3209e(C3195ab abVar) {
        this.f9632a = abVar;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo5941a(java.lang.Object r11) {
        /*
            r10 = this;
            androidx.media3.exoplayer.j.ab r0 = r10.f9632a
            androidx.media3.common.x r11 = (androidx.media3.common.C2680x) r11
            java.lang.Object r1 = r0.f9598c
            monitor-enter(r1)
            androidx.media3.exoplayer.j.q r2 = r0.f9600e     // Catch:{ all -> 0x00cd }
            boolean r2 = r2.f9683K     // Catch:{ all -> 0x00cd }
            r3 = 1
            if (r2 == 0) goto L_0x00cb
            boolean r2 = r0.f9599d     // Catch:{ all -> 0x00cd }
            if (r2 != 0) goto L_0x00cb
            int r2 = r11.f7477A     // Catch:{ all -> 0x00cd }
            r4 = 2
            if (r2 <= r4) goto L_0x00cb
            java.lang.String r2 = r11.f7496n     // Catch:{ all -> 0x00cd }
            r5 = -1
            r6 = 32
            r7 = 0
            if (r2 != 0) goto L_0x0020
            goto L_0x0068
        L_0x0020:
            int r8 = r2.hashCode()     // Catch:{ all -> 0x00cd }
            r9 = 3
            switch(r8) {
                case -2123537834: goto L_0x0047;
                case 187078296: goto L_0x003d;
                case 187078297: goto L_0x0033;
                case 1504578661: goto L_0x0029;
                default: goto L_0x0028;
            }
        L_0x0028:
            goto L_0x0051
        L_0x0029:
            java.lang.String r8 = "audio/eac3"
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L_0x0051
            r2 = 1
            goto L_0x0052
        L_0x0033:
            java.lang.String r8 = "audio/ac4"
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L_0x0051
            r2 = 3
            goto L_0x0052
        L_0x003d:
            java.lang.String r8 = "audio/ac3"
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L_0x0051
            r2 = 0
            goto L_0x0052
        L_0x0047:
            java.lang.String r8 = "audio/eac3-joc"
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L_0x0051
            r2 = 2
            goto L_0x0052
        L_0x0051:
            r2 = -1
        L_0x0052:
            if (r2 == 0) goto L_0x005b
            if (r2 == r3) goto L_0x005b
            if (r2 == r4) goto L_0x005b
            if (r2 == r9) goto L_0x005b
            goto L_0x0068
        L_0x005b:
            int r2 = androidx.media3.common.p136b.C2612ak.f7249a     // Catch:{ all -> 0x00cd }
            if (r2 < r6) goto L_0x00cb
            androidx.media3.exoplayer.j.u r2 = r0.f9601f     // Catch:{ all -> 0x00cd }
            if (r2 == 0) goto L_0x00cb
            boolean r2 = r2.f9692b     // Catch:{ all -> 0x00cd }
            if (r2 != 0) goto L_0x0068
            goto L_0x00cb
        L_0x0068:
            int r2 = androidx.media3.common.p136b.C2612ak.f7249a     // Catch:{ all -> 0x00cd }
            if (r2 < r6) goto L_0x00ca
            androidx.media3.exoplayer.j.u r2 = r0.f9601f     // Catch:{ all -> 0x00cd }
            if (r2 == 0) goto L_0x00ca
            boolean r6 = r2.f9692b     // Catch:{ all -> 0x00cd }
            if (r6 == 0) goto L_0x00ca
            android.media.Spatializer r2 = r2.f9691a     // Catch:{ all -> 0x00cd }
            boolean r2 = r2.isAvailable()     // Catch:{ all -> 0x00cd }
            if (r2 == 0) goto L_0x00ca
            androidx.media3.exoplayer.j.u r2 = r0.f9601f     // Catch:{ all -> 0x00cd }
            android.media.Spatializer r2 = r2.f9691a     // Catch:{ all -> 0x00cd }
            boolean r2 = r2.isEnabled()     // Catch:{ all -> 0x00cd }
            if (r2 == 0) goto L_0x00ca
            androidx.media3.exoplayer.j.u r2 = r0.f9601f     // Catch:{ all -> 0x00cd }
            androidx.media3.common.h r0 = r0.f9602g     // Catch:{ all -> 0x00cd }
            java.lang.String r6 = "audio/eac3-joc"
            java.lang.String r8 = r11.f7496n     // Catch:{ all -> 0x00cd }
            boolean r6 = r6.equals(r8)     // Catch:{ all -> 0x00cd }
            if (r6 == 0) goto L_0x009d
            int r6 = r11.f7477A     // Catch:{ all -> 0x00cd }
            r8 = 16
            if (r6 != r8) goto L_0x009d
            r6 = 12
            goto L_0x009f
        L_0x009d:
            int r6 = r11.f7477A     // Catch:{ all -> 0x00cd }
        L_0x009f:
            android.media.AudioFormat$Builder r8 = new android.media.AudioFormat$Builder     // Catch:{ all -> 0x00cd }
            r8.<init>()     // Catch:{ all -> 0x00cd }
            android.media.AudioFormat$Builder r4 = r8.setEncoding(r4)     // Catch:{ all -> 0x00cd }
            int r6 = androidx.media3.common.p136b.C2612ak.m6983h(r6)     // Catch:{ all -> 0x00cd }
            android.media.AudioFormat$Builder r4 = r4.setChannelMask(r6)     // Catch:{ all -> 0x00cd }
            int r11 = r11.f7478B     // Catch:{ all -> 0x00cd }
            if (r11 == r5) goto L_0x00b7
            r4.setSampleRate(r11)     // Catch:{ all -> 0x00cd }
        L_0x00b7:
            android.media.Spatializer r11 = r2.f9691a     // Catch:{ all -> 0x00cd }
            androidx.media3.common.f r0 = r0.mo6330a()     // Catch:{ all -> 0x00cd }
            android.media.AudioAttributes r0 = r0.f7420a     // Catch:{ all -> 0x00cd }
            android.media.AudioFormat r2 = r4.build()     // Catch:{ all -> 0x00cd }
            boolean r11 = r11.canBeSpatialized(r0, r2)     // Catch:{ all -> 0x00cd }
            if (r11 == 0) goto L_0x00ca
            goto L_0x00cb
        L_0x00ca:
            r3 = 0
        L_0x00cb:
            monitor-exit(r1)     // Catch:{ all -> 0x00cd }
            return r3
        L_0x00cd:
            r11 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00cd }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.p150j.C3209e.mo5941a(java.lang.Object):boolean");
    }
}
