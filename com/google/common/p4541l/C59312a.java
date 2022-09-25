package com.google.common.p4541l;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

/* renamed from: com.google.common.l.a */
/* compiled from: PG */
final class C59312a extends Writer {

    /* renamed from: a */
    private final Appendable f157482a;

    /* renamed from: b */
    private boolean f157483b;

    public C59312a(Appendable appendable) {
        appendable.getClass();
        this.f157482a = appendable;
    }

    /* renamed from: a */
    private final void m92156a() {
        if (this.f157483b) {
            throw new IOException("Cannot write to a closed writer.");
        }
    }

    public final Writer append(char c) {
        m92156a();
        this.f157482a.append(c);
        return this;
    }

    public final void close() {
        this.f157483b = true;
        Appendable appendable = this.f157482a;
        if (appendable instanceof Closeable) {
            ((Closeable) appendable).close();
        }
    }

    public final void flush() {
        m92156a();
        Appendable appendable = this.f157482a;
        if (appendable instanceof Flushable) {
            ((Flushable) appendable).flush();
        }
    }

    public final void write(int i) {
        m92156a();
        this.f157482a.append((char) i);
    }

    public final Writer append(CharSequence charSequence) {
        m92156a();
        this.f157482a.append(charSequence);
        return this;
    }

    public final void write(String str) {
        str.getClass();
        m92156a();
        this.f157482a.append(str);
    }

    public final Writer append(CharSequence charSequence, int i, int i2) {
        m92156a();
        this.f157482a.append(charSequence, i, i2);
        return this;
    }

    public final void write(String str, int i, int i2) {
        str.getClass();
        m92156a();
        this.f157482a.append(str, i, i2 + i);
    }

    public final void write(char[] cArr, int i, int i2) {
        m92156a();
        this.f157482a.append(new String(cArr, i, i2));
    }
}
