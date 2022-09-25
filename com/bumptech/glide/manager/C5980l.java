package com.bumptech.glide.manager;

import android.content.Context;
import androidx.lifecycle.C2384o;
import com.bumptech.glide.C5514ad;
import com.bumptech.glide.C5543d;
import com.bumptech.glide.p291h.C5632s;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bumptech.glide.manager.l */
/* compiled from: PG */
public final class C5980l {

    /* renamed from: a */
    final Map f17642a = new HashMap();

    /* renamed from: b */
    private final C5985q f17643b;

    public C5980l(C5985q qVar) {
        this.f17643b = qVar;
    }

    /* renamed from: a */
    public final C5514ad mo12414a(Context context, C5543d dVar, C2384o oVar, boolean z) {
        C5632s.m14617j();
        C5632s.m14617j();
        C5514ad adVar = (C5514ad) this.f17642a.get(oVar);
        if (adVar != null) {
            return adVar;
        }
        LifecycleLifecycle lifecycleLifecycle = new LifecycleLifecycle(oVar);
        C5514ad a = this.f17643b.mo11839a(dVar, lifecycleLifecycle, new C5979k(), context);
        this.f17642a.put(oVar, a);
        lifecycleLifecycle.mo12404a(new C5978j(this, oVar));
        if (!z) {
            return a;
        }
        a.mo11882q();
        return a;
    }
}
