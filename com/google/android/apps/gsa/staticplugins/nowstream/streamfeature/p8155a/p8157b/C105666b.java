package com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8155a.p8157b;

import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.sidekick.main.p7205h.C91401a;
import com.google.android.apps.gsa.sidekick.main.p7205h.C91429k;
import com.google.android.apps.gsa.sidekick.main.p7205h.C91431m;
import com.google.android.apps.gsa.sidekick.shared.monet.util.C91856d;
import com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.models.C105758a;
import com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.models.datastores.C105764c;
import com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.models.datastores.C105765d;
import com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.models.datastores.CardIndexingParcelableStore;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.b.b */
/* compiled from: PG */
public final class C105666b implements C91401a {

    /* renamed from: a */
    public static final C59071e f294791a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.b.b");

    /* renamed from: b */
    public final C105758a f294792b;

    /* renamed from: c */
    public CardIndexingParcelableStore f294793c;

    /* renamed from: d */
    private Long f294794d;

    /* renamed from: e */
    private C105765d f294795e;

    /* renamed from: f */
    private int f294796f = -1;

    public C105666b(C105758a aVar, C23052c cVar) {
        this.f294792b = aVar;
        cVar.mo28427o(new C105665a(this));
    }

    /* renamed from: a */
    public final void mo85737a() {
        mo94955f();
    }

    /* renamed from: b */
    public final void mo85738b(C91429k kVar, long j) {
        mo94953d();
        mo94954e((C23056g) kVar);
    }

    /* renamed from: c */
    public final int mo94952c(long j) {
        C105765d b = this.f294793c.mo95033b(j);
        return b != null ? b.f295130c : this.f294793c.f295122d;
    }

    /* renamed from: d */
    public final void mo94953d() {
        this.f294795e = null;
        this.f294794d = null;
        this.f294796f = -1;
    }

    /* renamed from: e */
    public final void mo94954e(C23056g gVar) {
        long b = gVar instanceof C91856d ? ((C91856d) gVar).mo86358b() : 0;
        if (gVar instanceof C91431m) {
            int e = ((C91431m) gVar).mo85784e();
            Long valueOf = Long.valueOf(b);
            this.f294794d = valueOf;
            if (e == 0) {
                this.f294795e = (C105765d) this.f294793c.f295120b.remove(valueOf);
                CardIndexingParcelableStore cardIndexingParcelableStore = this.f294793c;
                int indexOf = cardIndexingParcelableStore.f295121c.indexOf(valueOf);
                cardIndexingParcelableStore.f295121c.remove(valueOf);
                this.f294796f = indexOf;
                return;
            }
            C105765d b2 = this.f294793c.mo95033b(b);
            this.f294795e = b2;
            if (b2 != null) {
                C105764c cVar = (C105764c) C105765d.f295126d.createBuilder();
                cVar.copyOnWrite();
                C105765d dVar = (C105765d) cVar.instance;
                dVar.f295128a |= 1;
                dVar.f295129b = e;
                int i = b2.f295130c;
                cVar.copyOnWrite();
                C105765d dVar2 = (C105765d) cVar.instance;
                dVar2.f295128a |= 2;
                dVar2.f295130c = i;
                this.f294793c.mo95034c(b, (C105765d) cVar.build());
            }
        }
    }

    /* renamed from: f */
    public final void mo94955f() {
        C105765d dVar;
        Long l = this.f294794d;
        if (!(l == null || (dVar = this.f294795e) == null)) {
            if (this.f294796f >= 0) {
                CardIndexingParcelableStore cardIndexingParcelableStore = this.f294793c;
                long longValue = l.longValue();
                int i = this.f294796f;
                Map map = cardIndexingParcelableStore.f295120b;
                Long valueOf = Long.valueOf(longValue);
                map.put(valueOf, dVar);
                if (i == -1 || cardIndexingParcelableStore.f295121c.contains(valueOf)) {
                    C59104x d = CardIndexingParcelableStore.f295119a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "CardIndexingParcelable");
                    ((C59052c) ((C59052c) d).mo56372aa(22432)).mo56359L("nodeIndex[%d] already present at index %d and being re-added at position %d.", valueOf, Integer.valueOf(cardIndexingParcelableStore.f295121c.indexOf(valueOf)), Integer.valueOf(i));
                    int i2 = C90755l.f253831a;
                } else {
                    cardIndexingParcelableStore.f295121c.add(i, valueOf);
                }
            } else if (this.f294793c.mo95033b(l.longValue()) != null) {
                this.f294793c.mo95034c(l.longValue(), dVar);
            }
        }
        mo94953d();
    }
}
