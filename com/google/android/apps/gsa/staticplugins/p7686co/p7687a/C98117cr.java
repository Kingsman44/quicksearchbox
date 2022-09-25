package com.google.android.apps.gsa.staticplugins.p7686co.p7687a;

import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.sidekick.main.entry.C91336bn;
import com.google.android.apps.gsa.sidekick.main.p7203f.C91374d;
import com.google.android.apps.gsa.sidekick.shared.util.C91953ad;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58425eo;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4526f.C59071e;
import com.google.p375ai.p378b.C7573c;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7708h;
import com.google.p375ai.p378b.C7718hj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.a.cr */
/* compiled from: PG */
public final class C98117cr implements C90991b, C91336bn {

    /* renamed from: a */
    public static final C59071e f273972a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.co.a.cr");

    /* renamed from: b */
    static final C7708h f273973b;

    /* renamed from: c */
    public final C21370a f273974c;

    /* renamed from: d */
    public final Queue f273975d = new C58425eo(100);

    /* renamed from: e */
    private final C91374d f273976e;

    /* renamed from: f */
    private final Queue f273977f = new C58425eo(100);

    /* renamed from: g */
    private final C98115cp f273978g;

    static {
        C7573c cVar = (C7573c) C7708h.f26894n.createBuilder();
        C7681g gVar = C7681g.DISMISS;
        cVar.copyOnWrite();
        C7708h hVar = (C7708h) cVar.instance;
        hVar.f26897b = gVar.f26835cv;
        hVar.f26896a |= 1;
        f273973b = (C7708h) cVar.build();
    }

    public C98117cr(C21370a aVar, C91374d dVar) {
        this.f273974c = aVar;
        this.f273976e = dVar;
        this.f273978g = new C98115cp(dVar);
    }

    /* renamed from: a */
    public final C91953ad mo85658a() {
        return new C98109cj(this, new C98116cq(this.f273974c, this.f273976e, this.f273977f));
    }

    /* renamed from: b */
    public final List mo85659b(List list) {
        ArrayList d = C58597ky.m90213d(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C7718hj hjVar = (C7718hj) it.next();
            if (!this.f273978g.mo90968a(hjVar)) {
                d.add(hjVar);
            }
        }
        return d;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("LocalActionEntryRemover");
        C91006f e = fVar.mo85281e((Object) null);
        e.mo85291r("Unhandled Entries");
        if (this.f273977f.size() == 0) {
            e.mo85292s(C90752i.m148229c("none"));
        } else {
            for (C98110ck m : this.f273977f) {
                e.mo85286m(m);
            }
        }
        C91006f e2 = fVar.mo85281e((Object) null);
        e2.mo85291r("Removed entries");
        if (this.f273975d.size() == 0) {
            e2.mo85292s(C90752i.m148229c("none"));
            return;
        }
        for (C98110ck m2 : this.f273975d) {
            e2.mo85286m(m2);
        }
    }
}
