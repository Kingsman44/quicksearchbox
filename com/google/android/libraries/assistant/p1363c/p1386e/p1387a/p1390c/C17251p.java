package com.google.android.libraries.assistant.p1363c.p1386e.p1387a.p1390c;

import com.google.speech.p5208h.C66607ce;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.p5573a.C71348ab;
import kotlinx.coroutines.p5573a.C71350ad;
import kotlinx.coroutines.p5573a.C71354ah;
import kotlinx.coroutines.p5573a.C71361ao;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.c.e.a.c.p */
/* compiled from: PG */
public final class C17251p implements Consumer {

    /* renamed from: a */
    final /* synthetic */ C71361ao f50020a;

    public C17251p(C71361ao aoVar) {
        this.f50020a = aoVar;
    }

    /* renamed from: a */
    public final void accept(C66607ce ceVar) {
        C69664n.m101061g(ceVar, "s3Request");
        try {
            C71348ab.m103986d(C71350ad.m103990a(this.f50020a, ceVar));
        } catch (CancellationException e) {
            CancellationException cancellationException = new CancellationException("This streamTo operation has been cancelled");
            cancellationException.initCause(e);
            throw cancellationException;
        } catch (C71354ah e2) {
            C71354ah ahVar = new C71354ah("This streamTo operation is already completed");
            ahVar.initCause(e2);
            throw ahVar;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
