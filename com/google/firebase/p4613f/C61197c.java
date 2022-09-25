package com.google.firebase.p4613f;

import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.firebase.f.c */
/* compiled from: PG */
public final class C61197c implements C61203i {

    /* renamed from: a */
    private final String f165547a;

    /* renamed from: b */
    private final C61198d f165548b;

    public C61197c(Set set, C61198d dVar) {
        this.f165547a = m93567b(set);
        this.f165548b = dVar;
    }

    /* renamed from: b */
    private static String m93567b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C61199e eVar = (C61199e) it.next();
            sb.append(eVar.mo57759a());
            sb.append('/');
            sb.append(eVar.mo57760b());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final String mo57764a() {
        if (this.f165548b.mo57765a().isEmpty()) {
            return this.f165547a;
        }
        String str = this.f165547a;
        String b = m93567b(this.f165548b.mo57765a());
        return str + " " + b;
    }
}
