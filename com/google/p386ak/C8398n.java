package com.google.p386ak;

import com.google.p386ak.p388b.p389a.C8283al;
import com.google.p386ak.p388b.p389a.C8302bd;
import com.google.p386ak.p394d.C8387c;
import java.io.IOException;
import java.io.StringWriter;

/* renamed from: com.google.ak.n */
/* compiled from: PG */
public class C8398n {
    /* renamed from: b */
    public long mo17152b() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: d */
    public String mo17154d() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: e */
    public boolean mo17155e() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: f */
    public final C8396l mo17160f() {
        if (this instanceof C8396l) {
            return (C8396l) this;
        }
        throw new IllegalStateException("Not a JSON Array: ".concat(toString()));
    }

    /* renamed from: g */
    public final C8401q mo17161g() {
        if (this instanceof C8401q) {
            return (C8401q) this;
        }
        throw new IllegalStateException("Not a JSON Object: ".concat(toString()));
    }

    /* renamed from: h */
    public final C8404t mo17162h() {
        if (this instanceof C8404t) {
            return (C8404t) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: ".concat(toString()));
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C8387c cVar = new C8387c(stringWriter);
            cVar.f29235b = true;
            ((C8283al) C8302bd.f29062T).mo17030b(cVar, this);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
