package com.google.android.libraries.assistant.p1363c.p1380c.p1381a;

import com.google.android.libraries.assistant.p1363c.p1380c.C17180b;
import com.google.android.libraries.assistant.p1363c.p1380c.C17181c;
import com.google.apps.tiktok.tracing.C47810es;
import java.io.Closeable;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.assistant.c.c.a.h */
/* compiled from: PG */
public final /* synthetic */ class C17172h implements Closeable {

    /* renamed from: a */
    public final /* synthetic */ C17178n f49883a;

    public /* synthetic */ C17172h(C17178n nVar) {
        this.f49883a = nVar;
    }

    public final void close() {
        C17178n nVar = this.f49883a;
        C17176l lVar = nVar.f49903d;
        Duration a = lVar.mo23218a(nVar.f49902c.f49890c);
        int i = lVar.f49894d;
        lVar.f49894d = 4;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 != 0) {
                if (i2 == 1) {
                    lVar.f49895e.mo104685b(a);
                } else if (i2 == 2) {
                    lVar.f49895e.mo104685b(lVar.f49892b);
                } else if (i2 != 3) {
                    throw new AssertionError("Impossible state: ".concat(C17175k.m34322a(i)));
                }
            }
            lVar.f49895e.mo104684a(a);
            C17181c cVar = lVar.f49895e.f334492b;
            cVar.f49908a.f49923a.execute(C47810es.m84977q(new C17180b(cVar, a)));
            return;
        }
        throw null;
    }
}
