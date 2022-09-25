package com.google.p4242bp.p4257f.p4258a.p4259a;

import java.nio.charset.Charset;
import p3186j$.nio.charset.StandardCharsets;

/* renamed from: com.google.bp.f.a.a.o */
/* compiled from: PG */
final class C56215o implements C56203c {

    /* renamed from: a */
    final Charset f149739a;

    /* renamed from: b */
    final Boolean f149740b;

    public C56215o(Charset charset, Boolean bool) {
        this.f149739a = charset;
        this.f149740b = bool;
    }

    /* renamed from: a */
    public final C56202b mo54331a(char c) {
        StringBuilder sb = new StringBuilder();
        byte[] bytes = String.valueOf(c).getBytes(this.f149739a);
        if (bytes.length == 1 && bytes[0] == 63) {
            bytes = ("&#" + c + ";").getBytes(StandardCharsets.UTF_8);
        }
        for (byte b : bytes) {
            if (this.f149740b.booleanValue()) {
                sb.append(String.format("%%%02x", new Object[]{Byte.valueOf(b)}));
            } else {
                sb.append(String.format("%%%02X", new Object[]{Byte.valueOf(b)}));
            }
        }
        return new C56202b(sb.toString(), 4);
    }
}
