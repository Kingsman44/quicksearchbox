package org.p5610a.p5611a.p5612a.p5617e;

import java.io.Serializable;
import java.io.Writer;

/* renamed from: org.a.a.a.e.b */
/* compiled from: PG */
public final class C71983b extends Writer implements Serializable {
    private static final long serialVersionUID = -146927496096066153L;

    /* renamed from: a */
    public final StringBuilder f191697a = new StringBuilder();

    public final Writer append(char c) {
        this.f191697a.append(c);
        return this;
    }

    public final void close() {
    }

    public final void flush() {
    }

    public final String toString() {
        return this.f191697a.toString();
    }

    public final void write(String str) {
        if (str != null) {
            this.f191697a.append(str);
        }
    }

    public final void write(char[] cArr, int i, int i2) {
        if (cArr != null) {
            this.f191697a.append(cArr, i, i2);
        }
    }

    public final Writer append(CharSequence charSequence) {
        this.f191697a.append(charSequence);
        return this;
    }

    public final Writer append(CharSequence charSequence, int i, int i2) {
        this.f191697a.append(charSequence, i, i2);
        return this;
    }
}
