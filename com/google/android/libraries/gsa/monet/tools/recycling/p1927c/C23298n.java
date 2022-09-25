package com.google.android.libraries.gsa.monet.tools.recycling.p1927c;

import java.util.List;

/* renamed from: com.google.android.libraries.gsa.monet.tools.recycling.c.n */
/* compiled from: PG */
final class C23298n implements C23286b {

    /* renamed from: a */
    final /* synthetic */ C23300p f63790a;

    public C23298n(C23300p pVar) {
        this.f63790a = pVar;
    }

    /* renamed from: a */
    public final void mo28761a(String str, int i, C23293i iVar) {
        C23292h hVar = this.f63790a.f63793J;
        hVar.f63774a.add(i, iVar);
        hVar.notifyItemInserted(i);
    }

    /* renamed from: b */
    public final void mo28762b(String str, int i, int i2) {
        this.f63790a.f63793J.mo28784d(i, i2);
    }

    /* renamed from: c */
    public final void mo28763c(String str, int i) {
        C23292h hVar = this.f63790a.f63793J;
        hVar.mo28786f(i);
        hVar.notifyItemRemoved(i);
    }

    /* renamed from: d */
    public final void mo28764d(String str, int i, List list) {
        C23292h hVar = this.f63790a.f63793J;
        hVar.f63774a.addAll(i, list);
        hVar.mObservable.mo2882d(i, list.size());
    }

    /* renamed from: e */
    public final void mo28765e(String str, int i, int i2, int i3) {
        C23292h hVar = this.f63790a.f63793J;
        for (int i4 = 0; i4 < i3; i4++) {
            hVar.mo28784d(i + i4, i2 + i4);
        }
    }

    /* renamed from: f */
    public final void mo28766f(String str, int i, int i2) {
        C23292h hVar = this.f63790a.f63793J;
        int i3 = i + i2;
        while (true) {
            i3--;
            if (i3 >= i) {
                hVar.mo28786f(i3);
            } else {
                hVar.mObservable.mo2883e(i, i2);
                return;
            }
        }
    }
}
