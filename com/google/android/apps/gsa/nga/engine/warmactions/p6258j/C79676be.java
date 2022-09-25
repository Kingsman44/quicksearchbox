package com.google.android.apps.gsa.nga.engine.warmactions.p6258j;

import com.google.android.apps.gsa.nga.engine.recognition.C77566as;
import com.google.android.apps.gsa.nga.engine.warmactions.p6250c.C79490o;
import com.google.android.apps.gsa.nga.engine.warmactions.p6253e.C79562t;
import com.google.android.apps.gsa.nga.engine.warmactions.p6257i.C79619b;
import com.google.android.apps.gsa.nga.engine.warmactions.p6257i.C79626i;
import com.google.android.apps.gsa.nga.engine.warmactions.p6257i.C79628k;
import com.google.android.apps.gsa.nga.engine.warmactions.p6257i.C79630m;
import com.google.android.apps.gsa.nga.shared.p6363s.C81459h;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.libraries.assistant.soda.C19245ah;
import com.google.android.libraries.assistant.soda.C19258c;
import com.google.android.libraries.assistant.soda.C19347o;
import com.google.android.libraries.assistant.soda.Soda;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.speech.p5218j.C66997hf;
import com.google.speech.p5218j.C66999hh;
import com.google.speech.p5218j.C67150mx;
import com.google.speech.p5218j.C67152mz;
import java.util.concurrent.locks.Lock;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.j.be */
/* compiled from: PG */
public final /* synthetic */ class C79676be implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C79681bj f218517a;

    public /* synthetic */ C79676be(C79681bj bjVar) {
        this.f218517a = bjVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        Lock writeLock;
        C79681bj bjVar = this.f218517a;
        try {
            C79630m mVar = bjVar.f218529c;
            C66999hh a = mVar.f218434e.mo74171a();
            writeLock = mVar.f218439j.writeLock();
            writeLock.lock();
            mVar.f218438i.set(Optional.empty());
            C66997hf hfVar = a.f182132d;
            if (hfVar == null) {
                hfVar = C66997hf.f182099z;
            }
            if (C19245ah.m36706n(hfVar.f182115n, mVar.f218431b.mo85399d(C90126fx.f251748of))) {
                ((C58970a) ((C58970a) C79630m.f218430a.mo56224b()).mo56372aa(5698)).mo56386p("#MWW initializing SODA");
                C79619b bVar = mVar.f218432c;
                Soda soda = new Soda(bVar.f218420a, (C19347o) mVar.f218433d);
                mVar.f218442m = soda;
                C19258c cVar = new C19258c();
                cVar.mo24390b(a);
                Optional optional = mVar.f218436g;
                Objects.requireNonNull(cVar);
                optional.ifPresent(new C79626i(cVar));
                C67150mx g = soda.mo24331g(cVar.mo24391c());
                C81459h hVar = mVar.f218437h;
                C67152mz a2 = C67152mz.m97427a(g.f182527b);
                if (a2 == null) {
                    a2 = C67152mz.NO_ERROR;
                }
                hVar.mo75090a(a2);
                C67152mz a3 = C67152mz.m97427a(g.f182527b);
                if (a3 == null) {
                    a3 = C67152mz.NO_ERROR;
                }
                if (!a3.equals(C67152mz.NO_ERROR)) {
                    C67152mz a4 = C67152mz.m97427a(g.f182527b);
                    if (a4 == null) {
                        a4 = C67152mz.NO_ERROR;
                    }
                    int i = a4.f182542l;
                    String str = g.f182528c;
                    throw new C79628k("Failed to initialize Soda: " + i + " message: " + str);
                }
                mVar.f218438i.set(Optional.m71637of(a));
                mVar.f218441l = Optional.m71637of(mVar.f218440k.mo74094b());
                C77566as asVar = ((C79490o) mVar.f218441l.get()).f218183a;
                writeLock.unlock();
                bjVar.f218530d.mo74135a(C79562t.SODA_INITIALIZED);
                bjVar.f218531e.mo74791g(2);
                return asVar;
            }
            mVar.f218437h.mo75090a(C67152mz.UNSUPPORTED_LANGUAGE_PACK);
            int i2 = C67152mz.UNSUPPORTED_LANGUAGE_PACK.f182542l;
            throw new C79628k("Failed to initialize Soda: " + i2);
        } catch (C79628k e) {
            bjVar.f218531e.mo74791g(1);
            throw new C79628k((Throwable) e);
        } catch (Throwable th) {
            writeLock.unlock();
            throw th;
        }
    }
}
