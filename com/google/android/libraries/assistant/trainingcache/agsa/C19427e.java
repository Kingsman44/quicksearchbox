package com.google.android.libraries.assistant.trainingcache.agsa;

import com.google.android.libraries.assistant.trainingcache.bindings.C19439b;
import com.google.android.libraries.assistant.trainingcache.bindings.EkhoWriter;
import com.google.android.libraries.assistant.trainingcache.p1617b.C19435g;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.speech.p5228m.C67270aa;
import com.google.speech.p5228m.C67272ac;
import com.google.speech.p5228m.C67341e;
import com.google.speech.p5228m.C67355s;
import dagger.C68214a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.libraries.assistant.trainingcache.agsa.e */
/* compiled from: PG */
public final class C19427e implements C19428f {

    /* renamed from: a */
    public static final C59071e f54328a = C59071e.m91332i("com.google.android.libraries.assistant.trainingcache.agsa.e");

    /* renamed from: b */
    public final AtomicBoolean f54329b = new AtomicBoolean(false);

    /* renamed from: c */
    public final AtomicReference f54330c = new AtomicReference();

    /* renamed from: d */
    public final C68214a f54331d;

    /* renamed from: e */
    public final C68214a f54332e;

    /* renamed from: f */
    public final AtomicReference f54333f = new AtomicReference();

    public C19427e(C68214a aVar, C68214a aVar2) {
        this.f54331d = aVar;
        this.f54332e = aVar2;
    }

    /* renamed from: a */
    public final void mo24615a() {
        if (this.f54329b.get()) {
            EkhoWriter.nativeFlushAndWait(((EkhoWriter) this.f54333f.get()).f54364a.get());
        }
    }

    /* renamed from: b */
    public final void mo24616b(int i) {
        mo24618d(i, new byte[0], 1);
    }

    /* renamed from: c */
    public final void mo24617c(int i, byte[] bArr) {
        mo24618d(i, bArr, 1);
    }

    /* renamed from: d */
    public final void mo24618d(int i, byte[] bArr, int i2) {
        Object obj;
        if (this.f54329b.get()) {
            if (!(i == 1004 || i == 1011 || i == 1013 || i == 1014 || i == 1017 || i == 1016)) {
                if (i == 1015) {
                    i = 1015;
                }
                C19439b bVar = new C19439b((EkhoWriter) this.f54333f.get(), i);
                bVar.f54369d = i2;
                bVar.f54367b = bArr;
                bVar.f54366a.mo24643a(bVar);
                ((C19435g) this.f54331d.mo27525b()).mo24621c("FedAss.EkhoWriter.NumClientEvents", i - 1);
            }
            C67272ac acVar = ((C67270aa) this.f54330c.get()).f182862e;
            if (acVar == null) {
                acVar = C67272ac.f182865c;
            }
            C67355s sVar = acVar.f182868b;
            if (sVar == null) {
                sVar = C67355s.f183081a;
            }
            C62940bt r1 = C62942bv.checkIsLite(C67341e.f183035j);
            sVar.mo58887l(r1);
            Object l = sVar.f169962ag.mo58854l(r1.f169971d);
            if (l == null) {
                obj = r1.f169969b;
            } else {
                obj = r1.mo58889c(l);
            }
            if (!((C67341e) obj).f183038b) {
                return;
            }
            C19439b bVar2 = new C19439b((EkhoWriter) this.f54333f.get(), i);
            bVar2.f54369d = i2;
            bVar2.f54367b = bArr;
            bVar2.f54366a.mo24643a(bVar2);
            ((C19435g) this.f54331d.mo27525b()).mo24621c("FedAss.EkhoWriter.NumClientEvents", i - 1);
        }
    }
}
