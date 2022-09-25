package com.google.android.voiceinteraction.p3559a;

import java.nio.ByteBuffer;
import java.util.List;
import java.util.UUID;

/* renamed from: com.google.android.voiceinteraction.a.g */
/* compiled from: PG */
public final class C45371g {

    /* renamed from: a */
    public final UUID f118738a;

    /* renamed from: b */
    public final UUID f118739b;

    /* renamed from: c */
    public final ByteBuffer f118740c;

    /* renamed from: d */
    public final List f118741d;

    /* renamed from: e */
    public final int f118742e;

    public C45371g(UUID uuid, UUID uuid2, byte[] bArr, List list, int i) {
        this.f118738a = uuid;
        this.f118739b = uuid2;
        this.f118740c = bArr == null ? ByteBuffer.wrap(new byte[0]) : ByteBuffer.wrap(bArr);
        this.f118741d = list;
        this.f118742e = i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f118738a);
        String valueOf2 = String.valueOf(this.f118739b);
        String valueOf3 = String.valueOf(this.f118741d);
        int i = this.f118742e;
        return "KeyphraseSoundModelCompat{ modelUuid=" + valueOf + ", vendorUuid=" + valueOf2 + ", keyphrases=" + valueOf3 + ", version=" + i + "}";
    }
}
