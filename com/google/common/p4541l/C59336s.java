package com.google.common.p4541l;

import java.io.Reader;
import java.io.Writer;

/* renamed from: com.google.common.l.s */
/* compiled from: PG */
public final class C59336s {
    /* renamed from: a */
    public static StringBuilder m92218a(Readable readable) {
        StringBuilder sb = new StringBuilder();
        m92220c((Reader) readable, sb);
        return sb;
    }

    /* renamed from: b */
    public static void m92219b(Readable readable, Appendable appendable) {
        Writer writer;
        if (!(appendable instanceof StringBuilder)) {
            if (appendable instanceof Writer) {
                writer = (Writer) appendable;
            } else {
                writer = new C59312a(appendable);
            }
            writer.getClass();
            char[] cArr = new char[2048];
            while (true) {
                int read = ((Reader) readable).read(cArr);
                if (read != -1) {
                    writer.write(cArr, 0, read);
                } else {
                    return;
                }
            }
        } else {
            m92220c((Reader) readable, (StringBuilder) appendable);
        }
    }

    /* renamed from: c */
    static void m92220c(Reader reader, StringBuilder sb) {
        sb.getClass();
        char[] cArr = new char[2048];
        while (true) {
            int read = reader.read(cArr);
            if (read != -1) {
                sb.append(cArr, 0, read);
            } else {
                return;
            }
        }
    }
}
