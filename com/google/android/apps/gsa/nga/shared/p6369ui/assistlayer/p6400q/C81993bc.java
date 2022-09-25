package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q;

import android.view.View;
import androidx.core.p098j.C2043bi;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6377e.C81572o;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.q.bc */
/* compiled from: PG */
public final class C81993bc {

    /* renamed from: a */
    public final C81572o f224155a;

    /* renamed from: b */
    private final List f224156b = new CopyOnWriteArrayList();

    public C81993bc(C81572o oVar) {
        this.f224155a = oVar;
    }

    /* renamed from: a */
    public final void mo75430a(View view) {
        Optional ofNullable = Optional.ofNullable(C28285c.m52882i(view, 5, (Integer) null));
        C81572o oVar = this.f224155a;
        Objects.requireNonNull(oVar);
        ofNullable.ifPresent(new C81989az(oVar));
    }

    /* renamed from: b */
    public final void mo75431b(View view) {
        if (view != null) {
            for (C81992bb bbVar : this.f224156b) {
                int i = C81992bb.f224148d;
                mo75432c(bbVar.f224149a, view);
            }
        }
    }

    /* renamed from: c */
    public final void mo75432c(View view, View view2) {
        C28292j a = C28295m.m52915a(view);
        if (a != null && (a.mo33788b().f162916a & 2048) == 0 && (a.mo33788b().f162916a & 1) == 0) {
            Optional ofNullable = Optional.ofNullable(C28285c.m52881h(4, C28295m.m52916b(view), view2));
            C81572o oVar = this.f224155a;
            Objects.requireNonNull(oVar);
            ofNullable.ifPresent(new C81989az(oVar));
        }
    }

    /* renamed from: d */
    public final void mo75433d(View view, int i) {
        Optional ofNullable = Optional.ofNullable(C28285c.m52874a(view, i));
        C81572o oVar = this.f224155a;
        Objects.requireNonNull(oVar);
        ofNullable.ifPresent(new C81989az(oVar));
    }

    /* renamed from: e */
    public final void mo75434e(View view) {
        C81992bb bbVar;
        Iterator it = this.f224156b.iterator();
        while (true) {
            if (!it.hasNext()) {
                bbVar = null;
                break;
            }
            bbVar = (C81992bb) it.next();
            int i = C81992bb.f224148d;
            if (bbVar.f224149a == view) {
                break;
            }
        }
        if (bbVar != null) {
            C28295m.m52918d(bbVar.f224149a);
            bbVar.f224149a.removeOnAttachStateChangeListener(bbVar);
            bbVar.onViewDetachedFromWindow(bbVar.f224149a);
            this.f224156b.remove(bbVar);
        }
    }

    /* renamed from: f */
    public final void mo75435f(View view, int i, boolean z) {
        if (!Collection.EL.stream(this.f224156b).anyMatch(new C81991ba(i, view))) {
            C81992bb bbVar = new C81992bb(i, view, this, z);
            if (bbVar.f224150b) {
                bbVar.f224149a.addOnAttachStateChangeListener(bbVar);
                if (C2043bi.m5569aw(bbVar.f224149a)) {
                    bbVar.onViewAttachedToWindow(bbVar.f224149a);
                }
            }
            this.f224156b.add(bbVar);
        }
    }
}
