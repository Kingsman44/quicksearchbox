package org.p5623b.p5624a;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Enumeration;

/* renamed from: org.b.a.cd */
/* compiled from: PG */
final class C72086cd implements Enumeration {

    /* renamed from: a */
    private final C72098k f191904a;

    /* renamed from: b */
    private Object f191905b = m105533a();

    public C72086cd(byte[] bArr) {
        this.f191904a = new C72098k(new ByteArrayInputStream(bArr), bArr.length, true);
    }

    /* renamed from: a */
    private final Object m105533a() {
        try {
            return this.f191904a.mo63286d();
        } catch (IOException e) {
            throw new C72107t("malformed DER construction: ".concat(e.toString()), e);
        }
    }

    public final boolean hasMoreElements() {
        return this.f191905b != null;
    }

    public final Object nextElement() {
        Object obj = this.f191905b;
        this.f191905b = m105533a();
        return obj;
    }
}
