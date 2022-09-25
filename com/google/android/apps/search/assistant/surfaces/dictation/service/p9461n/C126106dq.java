package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import com.google.android.apps.gsa.nga.engine.dictation.C75366d;
import com.google.android.apps.gsa.nga.engine.dictation.e;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125065at;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.concurrent.atomic.DesugarAtomicReference;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.dq */
/* compiled from: PG */
public final class C126106dq {

    /* renamed from: a */
    public final AtomicReference f347530a = new AtomicReference(new C126087cy((byte[]) null));

    /* renamed from: g */
    public static final boolean m206193g(e eVar) {
        int i = eVar.a;
        int a = C75366d.m121807a(i);
        if (a != 0 && a == 3) {
            return false;
        }
        int a2 = C75366d.m121807a(i);
        return a2 == 0 || a2 != 2;
    }

    /* renamed from: a */
    public final C125065at mo107336a() {
        return ((C126087cy) this.f347530a.get()).f347496g;
    }

    /* renamed from: b */
    public final C126083cu mo107337b() {
        return ((C126087cy) this.f347530a.get()).f347498i;
    }

    /* renamed from: c */
    public final C126087cy mo107338c() {
        Object obj = this.f347530a.get();
        C69664n.m101060f(obj, "state.get()");
        return (C126087cy) obj;
    }

    /* renamed from: d */
    public final void mo107339d(boolean z, boolean z2, C126088cz czVar, C125065at atVar) {
        C69664n.m101061g(czVar, "spokenOrTappedEmoji");
        C69664n.m101061g(atVar, "utteranceFinalText");
        mo107340e(new C126101dl(z, z2, czVar, atVar));
    }

    /* renamed from: e */
    public final void mo107340e(C69626l lVar) {
        DesugarAtomicReference.updateAndGet(this.f347530a, new C126105dp(lVar));
    }

    /* renamed from: f */
    public final boolean mo107341f() {
        return ((C126087cy) this.f347530a.get()).f347493d.f347487d;
    }
}
