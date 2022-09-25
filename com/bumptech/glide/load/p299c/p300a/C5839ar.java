package com.bumptech.glide.load.p299c.p300a;

import com.bumptech.glide.load.C5960s;
import com.bumptech.glide.load.C5962u;
import com.bumptech.glide.load.p293a.C5679av;
import com.bumptech.glide.load.p293a.p294a.C5640b;
import com.bumptech.glide.p291h.C5619f;
import com.bumptech.glide.p291h.C5628o;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.c.a.ar */
/* compiled from: PG */
public final class C5839ar implements C5962u {

    /* renamed from: a */
    private final C5876y f17438a;

    /* renamed from: b */
    private final C5640b f17439b;

    public C5839ar(C5876y yVar, C5640b bVar) {
        this.f17438a = yVar;
        this.f17439b = bVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C5679av mo12293a(Object obj, int i, int i2, C5960s sVar) {
        C5835an anVar;
        boolean z;
        C5619f fVar;
        InputStream inputStream = (InputStream) obj;
        if (inputStream instanceof C5835an) {
            anVar = (C5835an) inputStream;
            z = false;
        } else {
            anVar = new C5835an(inputStream, this.f17439b);
            z = true;
        }
        synchronized (C5619f.f16956a) {
            fVar = (C5619f) C5619f.f16956a.poll();
        }
        if (fVar == null) {
            fVar = new C5619f();
        }
        fVar.f16957b = anVar;
        C5628o oVar = new C5628o(fVar);
        C5838aq aqVar = new C5838aq(anVar, fVar);
        try {
            C5876y yVar = this.f17438a;
            C5679av a = yVar.mo12334a(new C5828ag(oVar, yVar.f17484g, yVar.f17483f), i, i2, sVar, aqVar);
            fVar.mo12062a();
            if (z) {
                anVar.mo12304b();
            }
            return a;
        } catch (Throwable th) {
            fVar.mo12062a();
            if (z) {
                anVar.mo12304b();
            }
            throw th;
        }
    }

    /* renamed from: b */
    public final /* synthetic */ boolean mo12294b(Object obj, C5960s sVar) {
        InputStream inputStream = (InputStream) obj;
        return true;
    }
}
