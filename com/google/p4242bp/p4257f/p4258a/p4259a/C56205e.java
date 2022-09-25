package com.google.p4242bp.p4257f.p4258a.p4259a;

import p3186j$.nio.charset.StandardCharsets;

/* renamed from: com.google.bp.f.a.a.e */
/* compiled from: PG */
final class C56205e implements C56203c {
    /* renamed from: a */
    public final C56202b mo54331a(char c) {
        StringBuilder sb = new StringBuilder();
        byte[] bytes = String.valueOf(c).getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        for (int i = 0; i < length; i++) {
            sb.append(String.format("%%%02x", new Object[]{Byte.valueOf(bytes[i])}));
        }
        return new C56202b(sb.toString(), 4);
    }
}
