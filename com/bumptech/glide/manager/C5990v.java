package com.bumptech.glide.manager;

import com.bumptech.glide.p291h.C5632s;
import java.util.ArrayList;

/* renamed from: com.bumptech.glide.manager.v */
/* compiled from: PG */
final class C5990v implements C5971c {

    /* renamed from: a */
    final /* synthetic */ C5994z f17662a;

    public C5990v(C5994z zVar) {
        this.f17662a = zVar;
    }

    /* renamed from: a */
    public final void mo11862a(boolean z) {
        ArrayList arrayList;
        C5632s.m14617j();
        synchronized (this.f17662a) {
            arrayList = new ArrayList(this.f17662a.f17671a);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C5971c) arrayList.get(i)).mo11862a(z);
        }
    }
}
