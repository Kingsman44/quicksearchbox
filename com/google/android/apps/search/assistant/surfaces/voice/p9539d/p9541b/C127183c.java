package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9541b;

import com.google.android.libraries.search.assistant.p2828y.p2838g.p2839a.C36908b;
import com.google.android.libraries.search.assistant.p2828y.p2838g.p2839a.C36910d;
import com.google.android.libraries.search.assistant.p2828y.p2838g.p2839a.C36911e;
import com.google.common.p4522b.C58671nr;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import p3186j$.util.Optional;
import p5462h.C69613f;
import p5462h.C69747m;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.b.c */
/* compiled from: PG */
public final class C127183c {

    /* renamed from: a */
    private static final C59071e f350139a = C59071e.m91331h();

    /* renamed from: b */
    private final C36911e f350140b;

    /* renamed from: c */
    private final C69613f f350141c;

    /* renamed from: d */
    private final List f350142d = new ArrayList();

    public C127183c(Collection collection, C36911e eVar) {
        C69664n.m101061g(collection, "providers");
        this.f350140b = eVar;
        this.f350141c = new C69747m(new C127181a(collection));
    }

    /* renamed from: a */
    public final C58671nr mo107987a() {
        Object a = this.f350141c.mo5768a();
        C69664n.m101060f(a, "<get-invalidations>(...)");
        return (C58671nr) a;
    }

    /* renamed from: b */
    public final void mo107988b() {
        Set<C36910d> D = mo107987a().mo54951D();
        C69664n.m101060f(D, "invalidations.keySet()");
        D.size();
        for (C36910d dVar : D) {
            Optional a = this.f350140b.mo40464a(dVar, new C127182b(this, dVar));
            if (a.isPresent()) {
                List list = this.f350142d;
                Object obj = a.get();
                C69664n.m101060f(obj, "optionalToken.get()");
                list.add(obj);
            } else {
                C59052c cVar = (C59052c) f350139a.mo56226d();
                cVar.mo56379ah(new C59094n(37254));
                cVar.mo56389s("Could not subscribe for context key changes of %s", dVar);
            }
        }
    }

    /* renamed from: c */
    public final void mo107989c() {
        List<C36908b> list = this.f350142d;
        C36911e eVar = this.f350140b;
        for (C36908b c : list) {
            eVar.mo40466c(c);
        }
        this.f350142d.clear();
    }
}
