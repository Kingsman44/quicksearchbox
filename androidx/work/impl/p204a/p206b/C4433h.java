package androidx.work.impl.p204a.p206b;

import androidx.work.impl.p204a.C4415a;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.work.impl.a.b.h */
/* compiled from: PG */
public final /* synthetic */ class C4433h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ List f14113a;

    /* renamed from: b */
    public final /* synthetic */ C4434i f14114b;

    public /* synthetic */ C4433h(List list, C4434i iVar) {
        this.f14113a = list;
        this.f14114b = iVar;
    }

    public final void run() {
        List<C4415a> list = this.f14113a;
        C4434i iVar = this.f14114b;
        C69664n.m101061g(list, "$listenersList");
        for (C4415a a : list) {
            a.mo9368a(iVar.f14118d);
        }
    }
}
