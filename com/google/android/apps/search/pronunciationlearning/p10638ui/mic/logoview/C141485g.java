package com.google.android.apps.search.pronunciationlearning.p10638ui.mic.logoview;

import com.google.android.apps.search.pronunciationlearning.p10638ui.mic.logoview.p10644b.C141476a;
import com.google.android.apps.search.pronunciationlearning.p10638ui.mic.logoview.p10644b.C141477b;
import java.util.Iterator;

/* renamed from: com.google.android.apps.search.pronunciationlearning.ui.mic.logoview.g */
/* compiled from: PG */
final class C141485g extends C141492n {
    public C141485g() {
        super("USER_SPEAKS");
    }

    /* renamed from: a */
    public final void mo116501a(C141477b bVar) {
        C141492n.m229653h(bVar);
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            ((C141476a) it.next()).f384014e.f384006a.mo116478c(0.0f);
        }
    }

    /* renamed from: b */
    public final void mo116502b(C141477b bVar) {
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            ((C141476a) it.next()).f384015f.mo116478c(0.0f);
        }
    }

    /* renamed from: c */
    public final boolean mo116503c(long j, long j2, C141477b bVar) {
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            C141476a aVar = (C141476a) it.next();
            float f = aVar.f384020k;
            int a = bVar.mo116485a(aVar);
            aVar.f384015f.mo116478c(f * (a != 0 ? a != 1 ? a != 2 ? 8.0f : 10.0f : 7.0f : 9.0f));
        }
        return true;
    }
}
