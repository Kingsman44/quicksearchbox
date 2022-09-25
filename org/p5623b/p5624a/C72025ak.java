package org.p5623b.p5624a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: org.b.a.ak */
/* compiled from: PG */
public final class C72025ak implements C72105r {

    /* renamed from: a */
    private final C72016ab f191782a;

    public C72025ak(C72016ab abVar) {
        this.f191782a = abVar;
    }

    /* renamed from: e */
    public final InputStream mo63238e() {
        return new C72032ar(this.f191782a);
    }

    /* renamed from: g */
    public final C72108u mo63233g() {
        try {
            return mo63230j();
        } catch (IOException e) {
            throw new C72107t("IOException converting stream to byte array: ".concat(String.valueOf(e.getMessage())), e);
        }
    }

    /* renamed from: j */
    public final C72108u mo63230j() {
        InputStream e = mo63238e();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int read = e.read(bArr, 0, 4096);
            if (read < 0) {
                return new C72024aj(byteArrayOutputStream.toByteArray());
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }
}
