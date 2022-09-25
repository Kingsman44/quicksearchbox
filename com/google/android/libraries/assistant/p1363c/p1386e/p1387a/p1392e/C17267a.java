package com.google.android.libraries.assistant.p1363c.p1386e.p1387a.p1392e;

import com.google.android.libraries.assistant.p1363c.p1386e.p1387a.C17268f;
import com.google.speech.p5208h.C66611ci;
import java.util.ArrayList;
import java.util.Iterator;
import p5462h.C69465a;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70761fa;

/* renamed from: com.google.android.libraries.assistant.c.e.a.e.a */
/* compiled from: PG */
public final class C17267a implements C17268f {

    /* renamed from: a */
    private final Iterable f50057a;

    /* renamed from: b */
    private boolean f50058b;

    public C17267a(Iterable iterable) {
        this.f50057a = iterable;
    }

    /* renamed from: a */
    public final void mo23256a() {
        C70761fa faVar;
        C70761fa faVar2;
        ArrayList arrayList = new ArrayList();
        for (C17268f fVar : this.f50057a) {
            try {
                fVar.mo23256a();
            } catch (Throwable th) {
                C69465a.m100953a(th, th);
            }
        }
        if (!arrayList.isEmpty()) {
            this.f50058b = true;
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                Throwable th2 = it.next();
                while (it.hasNext()) {
                    Throwable th3 = (Throwable) th2;
                    C69465a.m100953a(th3, (Throwable) it.next());
                    th2 = th3;
                }
                throw ((Throwable) th2);
            }
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
    }

    /* renamed from: b */
    public final void mo23257b(Throwable th) {
        C69664n.m101061g(th, "throwable");
        if (!this.f50058b) {
            ArrayList<Throwable> arrayList = new ArrayList<>();
            for (C17268f b : this.f50057a) {
                try {
                    b.mo23257b(th);
                } catch (Exception e) {
                    arrayList.add(e);
                }
            }
            for (Throwable a : arrayList) {
                C69465a.m100953a(th, a);
            }
        }
    }

    /* renamed from: c */
    public final void mo23258c(C66611ci ciVar) {
        C69664n.m101061g(ciVar, "s3Response");
        for (C17268f c : this.f50057a) {
            c.mo23258c(ciVar);
        }
    }
}
