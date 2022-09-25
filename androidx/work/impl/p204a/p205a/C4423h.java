package androidx.work.impl.p204a.p205a;

import android.os.Build;
import androidx.work.C4381ae;
import androidx.work.impl.p204a.C4425b;
import androidx.work.impl.p204a.p206b.C4434i;
import androidx.work.impl.p207b.C4470ae;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.work.impl.a.a.h */
/* compiled from: PG */
public final class C4423h extends C4419d {
    public C4423h(C4434i iVar) {
        super(iVar);
    }

    /* renamed from: b */
    public final boolean mo9369b(C4470ae aeVar) {
        C69664n.m101061g(aeVar, "workSpec");
        C4381ae aeVar2 = aeVar.f14226k.f14081b;
        if (aeVar2 != C4381ae.UNMETERED) {
            return Build.VERSION.SDK_INT >= 30 && aeVar2 == C4381ae.TEMPORARILY_UNMETERED;
        }
        return true;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ boolean mo9370c(Object obj) {
        C4425b bVar = (C4425b) obj;
        return !bVar.f14104a || bVar.f14106c;
    }
}
