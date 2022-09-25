package com.google.common.p4526f.p4531c;

import java.util.Collections;
import java.util.Comparator;

/* renamed from: com.google.common.f.c.l */
/* compiled from: PG */
public final class C59064l {

    /* renamed from: a */
    public static final Comparator f156994a = new C59057e();

    /* renamed from: b */
    public static final C59064l f156995b = new C59064l(new C59062j(Collections.emptyList()));

    /* renamed from: c */
    public final C59062j f156996c;

    public C59064l(C59062j jVar) {
        this.f156996c = jVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C59064l) && ((C59064l) obj).f156996c.equals(this.f156996c);
    }

    public final int hashCode() {
        return this.f156996c.hashCode() ^ -1;
    }

    public final String toString() {
        return this.f156996c.toString();
    }
}
