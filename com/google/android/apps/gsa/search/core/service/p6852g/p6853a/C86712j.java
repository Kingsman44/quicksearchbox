package com.google.android.apps.gsa.search.core.service.p6852g.p6853a;

import com.google.android.apps.gsa.search.core.service.p6845b.C86632a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86723c;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.p6853a.p6854a.C86701a;
import com.google.android.apps.gsa.search.core.service.p6852g.p6853a.p6854a.C86702b;
import com.google.android.apps.gsa.search.core.service.p6852g.p6853a.p6854a.C86703c;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90964a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import java.util.Collection;
import java.util.Collections;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.search.core.service.g.a.j */
/* compiled from: PG */
public final class C86712j implements C90964a, C86632a {

    /* renamed from: a */
    public final AtomicBoolean f234234a = new AtomicBoolean();

    /* renamed from: b */
    public final C86703c f234235b;

    /* renamed from: c */
    private final C86723c f234236c;

    public C86712j(C86723c cVar, C86703c cVar2) {
        this.f234235b = cVar2;
        this.f234236c = cVar;
    }

    /* renamed from: a */
    public final void mo80257a() {
        throw null;
    }

    /* renamed from: b */
    public final synchronized Collection mo80318b() {
        Collection collection;
        C86724d a = this.f234236c.mo80329a();
        C86703c cVar = this.f234235b;
        if (a == C86724d.IDLE) {
            cVar.f234203c = null;
            collection = Collections.unmodifiableCollection(cVar.f234202b);
        } else {
            C86701a aVar = cVar.f234203c;
            if (aVar == null || aVar.f234197a != a) {
                C86702b bVar = cVar.f234201a;
                Queue queue = cVar.f234202b;
                a.getClass();
                C86715m mVar = (C86715m) bVar.f234200a.mo17428b();
                mVar.getClass();
                C86701a aVar2 = new C86701a(queue, a, mVar);
                cVar.f234203c = aVar2;
                aVar = aVar2;
            }
            collection = aVar.f234199c;
        }
        return Collections.unmodifiableCollection(collection);
    }

    /* renamed from: c */
    public final boolean mo80319c(C86731k kVar) {
        C86701a aVar;
        C86703c cVar = this.f234235b;
        boolean remove = cVar.f234202b.remove(kVar);
        if (!remove || (aVar = cVar.f234203c) == null) {
            return remove;
        }
        if (!aVar.f234198b.mo5941a(kVar)) {
            return true;
        }
        aVar.f234199c.remove(kVar);
        return true;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("WorkControllerQueue");
        fVar.mo85279c("newWorkInQueue").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f234234a.get())));
        fVar.mo85291r("WorkProxies");
        for (C86731k l : Collections.unmodifiableCollection(this.f234235b.f234202b)) {
            fVar.mo85285l(l);
        }
    }
}
