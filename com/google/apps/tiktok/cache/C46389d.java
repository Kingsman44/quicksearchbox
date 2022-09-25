package com.google.apps.tiktok.cache;

import com.google.protobuf.MessageLite;

/* renamed from: com.google.apps.tiktok.cache.d */
/* compiled from: PG */
final class C46389d extends C46408w {

    /* renamed from: a */
    public int f121423a;

    /* renamed from: b */
    private MessageLite f121424b;

    /* renamed from: c */
    private int f121425c;

    /* renamed from: d */
    private int f121426d;

    /* renamed from: e */
    private long f121427e;

    /* renamed from: f */
    private byte f121428f;

    /* renamed from: a */
    public final C46409x mo50357a() {
        MessageLite messageLite;
        int i;
        if (this.f121428f == 7 && (messageLite = this.f121424b) != null && (i = this.f121423a) != 0) {
            return new C46390e(messageLite, this.f121425c, this.f121426d, this.f121427e, i);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f121424b == null) {
            sb.append(" valueDefaultInstance");
        }
        if ((this.f121428f & 1) == 0) {
            sb.append(" maxSizeBytes");
        }
        if ((this.f121428f & 2) == 0) {
            sb.append(" maxEntryCount");
        }
        if ((this.f121428f & 4) == 0) {
            sb.append(" filterAfterWriteMs");
        }
        if (this.f121423a == 0) {
            sb.append(" storage");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo50358b(long j) {
        this.f121427e = j;
        this.f121428f = (byte) (this.f121428f | 4);
    }

    /* renamed from: c */
    public final void mo50359c(int i) {
        this.f121426d = i;
        this.f121428f = (byte) (this.f121428f | 2);
    }

    /* renamed from: d */
    public final void mo50360d(int i) {
        this.f121425c = i;
        this.f121428f = (byte) (this.f121428f | 1);
    }

    /* renamed from: e */
    public final void mo50361e(MessageLite messageLite) {
        if (messageLite != null) {
            this.f121424b = messageLite;
            return;
        }
        throw new NullPointerException("Null valueDefaultInstance");
    }
}
