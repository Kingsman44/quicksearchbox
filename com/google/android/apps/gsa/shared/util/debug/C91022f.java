package com.google.android.apps.gsa.shared.util.debug;

import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.google.android.apps.gsa.shared.util.debug.f */
/* compiled from: PG */
public final class C91022f implements C90991b {

    /* renamed from: a */
    private final C68214a f254260a;

    /* renamed from: b */
    private final Set f254261b = Collections.newSetFromMap(new WeakHashMap());

    public C91022f(C68214a aVar) {
        this.f254260a = aVar;
    }

    /* renamed from: a */
    public final void mo85301a(C90991b bVar) {
        synchronized (this.f254261b) {
            this.f254261b.add(bVar);
        }
    }

    /* renamed from: b */
    public final void mo85302b(C90991b bVar) {
        synchronized (this.f254261b) {
            this.f254261b.remove(bVar);
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        ArrayList arrayList;
        for (C90991b m : (Set) this.f254260a.mo27525b()) {
            fVar.mo85286m(m);
        }
        if (!fVar.mo85297w()) {
            synchronized (this.f254261b) {
                arrayList = new ArrayList(this.f254261b);
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                fVar.mo85286m((C90991b) arrayList.get(i));
            }
        }
    }
}
