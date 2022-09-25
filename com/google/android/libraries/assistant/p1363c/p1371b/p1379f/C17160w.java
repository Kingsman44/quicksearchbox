package com.google.android.libraries.assistant.p1363c.p1371b.p1379f;

import com.google.android.libraries.mdi.C29690f;
import com.google.protobuf.C62971cq;
import java.util.Locale;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.assistant.c.b.f.w */
/* compiled from: PG */
public final class C17160w {
    /* renamed from: a */
    public static boolean m34310a(C29690f fVar, Locale locale) {
        if (!m34311b(fVar)) {
            return true;
        }
        C62971cq cqVar = fVar.f80419j;
        if (cqVar.isEmpty()) {
            return true;
        }
        return Collection.EL.stream(cqVar).anyMatch(new C17159v(locale));
    }

    /* renamed from: b */
    public static boolean m34311b(C29690f fVar) {
        return fVar.f80417h != 0 && !fVar.f80418i.isEmpty();
    }
}
