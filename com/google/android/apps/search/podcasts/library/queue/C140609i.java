package com.google.android.apps.search.podcasts.library.queue;

import android.support.p033v7.widget.C0673gh;
import android.support.p033v7.widget.RecyclerView;
import android.support.p033v7.widget.p041a.C0500j;
import com.google.android.apps.search.podcasts.library.queue.p10583a.C140597b;
import com.google.android.apps.search.podcasts.p10550b.p10556f.C140097al;
import com.google.android.apps.search.podcasts.p10550b.p10556f.C140110m;
import com.google.android.apps.search.podcasts.p10601r.C140991m;
import java.util.List;
import p5462h.p5463a.C69496am;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.library.queue.i */
/* compiled from: PG */
public final class C140609i extends C0500j {

    /* renamed from: a */
    final /* synthetic */ C140607h f381881a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C140609i(C140607h hVar) {
        super(3, 12);
        this.f381881a = hVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002e, code lost:
        p5462h.p5472e.C69598b.m101013a(r3, r4);
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2441d(android.support.p033v7.widget.RecyclerView r3, android.support.p033v7.widget.C0673gh r4) {
        /*
            r2 = this;
            java.lang.String r0 = "recyclerView"
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r0)
            super.mo2441d(r3, r4)
            com.google.android.apps.search.podcasts.library.queue.h r3 = r2.f381881a
            com.google.apps.tiktok.tracing.dh r3 = r3.f381872h
            java.lang.String r4 = "QueueFragmentPeerReorder#clearView"
            com.google.apps.tiktok.tracing.ax r3 = r3.mo51613c(r4)
            com.google.android.apps.search.podcasts.library.queue.h r4 = r2.f381881a
            com.google.apps.tiktok.dataservice.cv r0 = r4.f381873i     // Catch:{ all -> 0x002b }
            com.google.android.apps.search.podcasts.b.f.al r4 = r4.f381875k     // Catch:{ all -> 0x002b }
            com.google.android.apps.search.podcasts.b.f.f r1 = new com.google.android.apps.search.podcasts.b.f.f     // Catch:{ all -> 0x002b }
            r1.<init>(r4)     // Catch:{ all -> 0x002b }
            com.google.common.util.concurrent.cx r4 = r4.mo115464g(r1)     // Catch:{ all -> 0x002b }
            com.google.apps.tiktok.dataservice.ah r1 = com.google.android.apps.search.podcasts.p10559c.C140192a.f380885a     // Catch:{ all -> 0x002b }
            r0.mo50787a(r4, r1)     // Catch:{ all -> 0x002b }
            r4 = 0
            p5462h.p5472e.C69598b.m101013a(r3, r4)
            return
        L_0x002b:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x002d }
        L_0x002d:
            r0 = move-exception
            p5462h.p5472e.C69598b.m101013a(r3, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.podcasts.library.queue.C140609i.mo2441d(android.support.v7.widget.RecyclerView, android.support.v7.widget.gh):void");
    }

    /* renamed from: g */
    public final boolean mo2444g(RecyclerView recyclerView, C0673gh ghVar, C0673gh ghVar2) {
        List list;
        C69664n.m101061g(recyclerView, "recyclerView");
        int bindingAdapterPosition = ghVar.getBindingAdapterPosition();
        int bindingAdapterPosition2 = ghVar2.getBindingAdapterPosition();
        C140097al alVar = this.f381881a.f381875k;
        alVar.mo115464g(new C140110m(alVar, bindingAdapterPosition, bindingAdapterPosition2));
        C140597b bVar = this.f381881a.f381876l;
        if (bVar == null || (list = bVar.f381850a.f382708a) == null) {
            list = C69496am.f185918a;
        }
        if (!C140991m.m228953a(list, bindingAdapterPosition, bindingAdapterPosition2)) {
            return false;
        }
        C140607h hVar = this.f381881a;
        hVar.mo115781b(hVar.f381876l);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0052, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0053, code lost:
        p5462h.p5472e.C69598b.m101013a(r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0057, code lost:
        throw r1;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2448k(android.support.p033v7.widget.C0673gh r7) {
        /*
            r6 = this;
            com.google.android.apps.search.podcasts.library.queue.h r0 = r6.f381881a
            com.google.apps.tiktok.tracing.dh r0 = r0.f381872h
            java.lang.String r1 = "QueueFragmentPeerReorder#onSwiped"
            com.google.apps.tiktok.tracing.ax r0 = r0.mo51613c(r1)
            com.google.android.apps.search.podcasts.library.queue.h r1 = r6.f381881a
            com.google.android.apps.search.podcasts.library.queue.a.b r2 = r1.f381876l     // Catch:{ all -> 0x0050 }
            if (r2 == 0) goto L_0x004b
            com.google.android.apps.search.podcasts.q.k r2 = r2.f381850a     // Catch:{ all -> 0x0050 }
            java.util.List r2 = r2.f382708a     // Catch:{ all -> 0x0050 }
            if (r2 == 0) goto L_0x004b
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0050 }
            r3.<init>()     // Catch:{ all -> 0x0050 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0050 }
        L_0x001f:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x0050 }
            if (r4 == 0) goto L_0x0031
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x0050 }
            boolean r5 = r4 instanceof com.google.android.apps.search.podcasts.library.p10580b.C140567b     // Catch:{ all -> 0x0050 }
            if (r5 == 0) goto L_0x001f
            r3.add(r4)     // Catch:{ all -> 0x0050 }
            goto L_0x001f
        L_0x0031:
            int r7 = r7.getBindingAdapterPosition()     // Catch:{ all -> 0x0050 }
            java.lang.Object r7 = p5462h.p5463a.C69540x.m100822D(r3, r7)     // Catch:{ all -> 0x0050 }
            com.google.android.apps.search.podcasts.library.b.b r7 = (com.google.android.apps.search.podcasts.library.p10580b.C140567b) r7     // Catch:{ all -> 0x0050 }
            if (r7 == 0) goto L_0x004b
            com.google.android.apps.search.podcasts.m.a.b r7 = r7.f381764a     // Catch:{ all -> 0x0050 }
            if (r7 == 0) goto L_0x004b
            com.google.android.apps.search.podcasts.f.aw r2 = new com.google.android.apps.search.podcasts.f.aw     // Catch:{ all -> 0x0050 }
            r2.<init>(r7)     // Catch:{ all -> 0x0050 }
            com.google.android.apps.search.podcasts.library.queue.QueueFragment r7 = r1.f381866b     // Catch:{ all -> 0x0050 }
            com.google.apps.tiktok.p3674l.p3679c.C47393f.m84236g(r2, r7)     // Catch:{ all -> 0x0050 }
        L_0x004b:
            r7 = 0
            p5462h.p5472e.C69598b.m101013a(r0, r7)
            return
        L_0x0050:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x0052 }
        L_0x0052:
            r1 = move-exception
            p5462h.p5472e.C69598b.m101013a(r0, r7)
            goto L_0x0058
        L_0x0057:
            throw r1
        L_0x0058:
            goto L_0x0057
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.podcasts.library.queue.C140609i.mo2448k(android.support.v7.widget.gh):void");
    }
}
