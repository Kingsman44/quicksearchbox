package com.android.p270g;

import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* renamed from: com.android.g.c */
/* compiled from: PG */
final class C5145c implements C5144b {

    /* renamed from: a */
    private final FileChannel f16348a;

    /* renamed from: b */
    private final long f16349b;

    /* renamed from: c */
    private final long f16350c;

    public C5145c(FileChannel fileChannel, long j, long j2) {
        this.f16348a = fileChannel;
        this.f16349b = j;
        this.f16350c = j2;
    }

    /* renamed from: a */
    public final long mo10195a() {
        return this.f16350c;
    }

    /* renamed from: b */
    public final void mo10196b(MessageDigest[] messageDigestArr, long j, int i) {
        MappedByteBuffer map = this.f16348a.map(FileChannel.MapMode.READ_ONLY, this.f16349b + j, (long) i);
        map.load();
        for (MessageDigest update : messageDigestArr) {
            map.position(0);
            update.update(map);
        }
    }
}
