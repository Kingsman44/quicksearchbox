package com.google.android.libraries.search.p2904c.p2952o.p2954b;

import com.google.android.libraries.search.p2904c.C37321a;
import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.android.libraries.search.p2904c.p2906aa.C37329d;
import com.google.android.libraries.search.p2904c.p2911c.C37446p;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import p5462h.C69702k;
import p5462h.C69714l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.c.o.b.a */
/* compiled from: PG */
public final class C37908a implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C58833ax f100493a;

    /* renamed from: b */
    final /* synthetic */ C37446p f100494b;

    /* renamed from: c */
    final /* synthetic */ C37360ay f100495c;

    public C37908a(C58833ax axVar, C37446p pVar, C37360ay ayVar) {
        this.f100493a = axVar;
        this.f100494b = pVar;
        this.f100495c = ayVar;
    }

    public final void run() {
        Object obj;
        Object c = this.f100493a.mo56107c();
        C69664n.m101060f(c, "audioAccessor.get()");
        C37321a aVar = (C37321a) c;
        C37446p pVar = this.f100494b;
        int c2 = C37329d.m66335c(this.f100495c);
        int i = 0;
        while (true) {
            byte[] bArr = new byte[c2];
            try {
                obj = Integer.valueOf(aVar.mo40879a(bArr, i, 0, c2));
            } catch (Throwable th) {
                obj = C69714l.m101133a(th);
            }
            Throwable a = C69702k.m101124a(obj);
            if (a == null) {
                int intValue = ((Number) obj).intValue();
                if (intValue < 0) {
                    pVar.mo40891i();
                    return;
                } else if (intValue > 0) {
                    i += intValue;
                    pVar.mo40890b(intValue, bArr);
                }
            } else {
                C59052c cVar = (C59052c) C37909b.f100496a.mo56226d();
                cVar.mo56378ag(C58975e.f156826a, "ALT.AccessorToReceiver");
                C59052c cVar2 = (C59052c) cVar.mo56382g(a);
                cVar2.mo56379ah(new C59094n(52855));
                cVar2.mo56386p("#audio# cannot read next audio data, closing the buffer");
                pVar.mo40891i();
                return;
            }
        }
    }
}
