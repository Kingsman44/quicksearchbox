package org.p5633c.p5634a;

import org.p5633c.p5634a.p5639e.C72234a;

/* renamed from: org.c.a.s */
/* compiled from: PG */
public final class C72295s extends IllegalArgumentException {
    private static final long serialVersionUID = 2858712538216L;

    public C72295s(long j, String str) {
        super("Illegal instant due to time zone offset transition (daylight savings time 'gap'): " + C72234a.m106517a("yyyy-MM-dd'T'HH:mm:ss.SSS").mo63596b(new C72296t(j)) + (" (" + str + ")"));
    }

    public C72295s(String str) {
        super(str);
    }
}
