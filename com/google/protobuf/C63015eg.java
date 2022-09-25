package com.google.protobuf;

/* renamed from: com.google.protobuf.eg */
/* compiled from: PG */
final class C63015eg implements C62998dq {

    /* renamed from: a */
    public final MessageLite f170096a;

    /* renamed from: b */
    public final String f170097b;

    /* renamed from: c */
    public final Object[] f170098c;

    /* renamed from: d */
    private final int f170099d;

    public C63015eg(MessageLite messageLite, String str, Object[] objArr) {
        this.f170096a = messageLite;
        this.f170097b = str;
        this.f170098c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f170099d = charAt;
            return;
        }
        char c = charAt & 8191;
        int i = 13;
        int i2 = 1;
        while (true) {
            int i3 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                c |= (charAt2 & 8191) << i;
                i += 13;
                i2 = i3;
            } else {
                this.f170099d = c | (charAt2 << i);
                return;
            }
        }
    }

    /* renamed from: a */
    public final MessageLite mo58989a() {
        return this.f170096a;
    }

    /* renamed from: b */
    public final C63012ed mo58990b() {
        return (this.f170099d & 1) == 1 ? C63012ed.PROTO2 : C63012ed.PROTO3;
    }

    /* renamed from: c */
    public final boolean mo58991c() {
        return (this.f170099d & 2) == 2;
    }
}
