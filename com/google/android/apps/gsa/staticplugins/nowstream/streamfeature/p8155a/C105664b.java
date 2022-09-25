package com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8155a;

import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.sidekick.main.p7205h.C91401a;
import com.google.android.apps.gsa.sidekick.main.p7205h.C91419e;
import com.google.android.apps.gsa.sidekick.main.p7205h.C91429k;
import com.google.android.apps.gsa.sidekick.shared.util.C91994m;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a.C104576bq;
import com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.models.C105759b;
import com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.models.datastores.EntryTreeNodeParcelableStore;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p375ai.p378b.C7725hq;
import com.google.p375ai.p378b.C7726hr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.b */
/* compiled from: PG */
public final class C105664b implements C91401a, C91419e {

    /* renamed from: e */
    private static final C59071e f294782e = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.b");

    /* renamed from: a */
    public final C105759b f294783a;

    /* renamed from: b */
    public EntryTreeNodeParcelableStore f294784b;

    /* renamed from: c */
    public C58485gu f294785c;

    /* renamed from: d */
    public C91429k f294786d;

    /* renamed from: f */
    private int f294787f = -1;

    /* renamed from: g */
    private long f294788g = 0;

    /* renamed from: h */
    private C7726hr f294789h;

    public C105664b(C105759b bVar, C23052c cVar) {
        this.f294783a = bVar;
        this.f294784b = new EntryTreeNodeParcelableStore();
        cVar.mo28427o(new C105661a(this));
    }

    /* renamed from: a */
    public final void mo85737a() {
        if (this.f294787f == -1) {
            C59104x c = f294782e.mo56225c();
            c.mo56378ag(C58975e.f156826a, "StreamEntryTreeNodeMngr");
            ((C59052c) ((C59052c) c).mo56372aa(22393)).mo56386p("Dismissal undone with no cardRemovalIndex");
            return;
        }
        long j = this.f294788g;
        if (j == 0) {
            C59104x c2 = f294782e.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "StreamEntryTreeNodeMngr");
            ((C59052c) ((C59052c) c2).mo56372aa(22392)).mo56386p("Dismissal undone with no clusterContentIdHash");
        } else if (!this.f294784b.mo95043f(j)) {
            C59104x c3 = f294782e.mo56225c();
            c3.mo56378ag(C58975e.f156826a, "StreamEntryTreeNodeMngr");
            ((C59052c) ((C59052c) c3).mo56372aa(22391)).mo56386p("Dismiss undone where the removed node was no longer persisted.");
        } else {
            C7726hr hrVar = this.f294789h;
            if (hrVar == null) {
                C59104x c4 = f294782e.mo56225c();
                c4.mo56378ag(C58975e.f156826a, "StreamEntryTreeNodeMngr");
                ((C59052c) ((C59052c) c4).mo56372aa(22390)).mo56386p("Dismissal undone with no removedNode");
                return;
            }
            C7726hr b = this.f294784b.mo95038b(this.f294788g);
            b.getClass();
            C7725hq hqVar = (C7725hq) b.toBuilder();
            if (hqVar != null) {
                List unmodifiableList = Collections.unmodifiableList(((C7726hr) hqVar.instance).f27012c);
                hqVar.copyOnWrite();
                ((C7726hr) hqVar.instance).f27012c = C7726hr.emptyProtobufList();
                int i = this.f294787f;
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < unmodifiableList.size() + 1; i2++) {
                    if (i2 < i) {
                        arrayList.add((C7726hr) unmodifiableList.get(i2));
                    } else if (i2 == i) {
                        arrayList.add(hrVar);
                    } else {
                        arrayList.add((C7726hr) unmodifiableList.get(i2 - 1));
                    }
                }
                hqVar.mo16948a(arrayList);
                this.f294784b.mo95042e((C7726hr) hqVar.build(), this.f294788g);
                mo94950e();
            }
        }
    }

    /* renamed from: b */
    public final void mo85738b(C91429k kVar, long j) {
        mo94950e();
        long b = C91994m.m150995b(((C104576bq) kVar).f291030k);
        C7726hr b2 = this.f294784b.mo95038b(b);
        if (b2 == null) {
            C59104x c = f294782e.mo56225c();
            c.mo56378ag(C58975e.f156826a, "StreamEntryTreeNodeMngr");
            ((C59052c) ((C59052c) c).mo56372aa(22396)).mo56386p("Dismissed child Controller not found in store.");
            return;
        }
        C7725hq hqVar = (C7725hq) b2.toBuilder();
        if (hqVar != null) {
            for (int i = 0; i < ((C7726hr) hqVar.instance).f27012c.size(); i++) {
                C7726hr hrVar = (C7726hr) ((C7726hr) hqVar.instance).f27012c.get(i);
                if (j == C91994m.m150994a(C91994m.m150996c(hrVar))) {
                    this.f294788g = b;
                    this.f294787f = i;
                    this.f294789h = hrVar;
                    hqVar.copyOnWrite();
                    C7726hr hrVar2 = (C7726hr) hqVar.instance;
                    hrVar2.mo16950a();
                    hrVar2.f27012c.remove(i);
                    this.f294784b.mo95042e((C7726hr) hqVar.build(), b);
                    return;
                }
            }
            C59104x c2 = f294782e.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "StreamEntryTreeNodeMngr");
            ((C59052c) ((C59052c) c2).mo56372aa(22395)).mo56386p("Failed to find EntryTreeNode to remove.");
            return;
        }
        C59104x d = f294782e.mo56226d();
        d.mo56378ag(C58975e.f156826a, "StreamEntryTreeNodeMngr");
        ((C59052c) ((C59052c) d).mo56372aa(22394)).mo56386p("Failed to parse EntryTreeNode.");
        int i2 = C90755l.f253831a;
    }

    /* renamed from: c */
    public final void mo85766c(C23056g gVar) {
        if (gVar instanceof C91429k) {
            C91429k kVar = (C91429k) gVar;
            long b = kVar.mo85780b();
            if (!this.f294784b.mo95043f(b)) {
                C59104x c = f294782e.mo56225c();
                c.mo56378ag(C58975e.f156826a, "StreamEntryTreeNodeMngr");
                ((C59052c) ((C59052c) c).mo56372aa(22397)).mo56387q("DismissedController not in store, size is: %d.", this.f294784b.f295123a.size());
                return;
            }
            EntryTreeNodeParcelableStore entryTreeNodeParcelableStore = this.f294784b;
            C58480gp e = C58485gu.m89837e();
            ArrayList arrayList = entryTreeNodeParcelableStore.f295123a;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C7726hr hrVar = (C7726hr) entryTreeNodeParcelableStore.f295124b.get(((Long) arrayList.get(i)).longValue());
                hrVar.getClass();
                e.mo55395g(hrVar);
            }
            this.f294785c = e.mo55394f();
            EntryTreeNodeParcelableStore entryTreeNodeParcelableStore2 = this.f294784b;
            entryTreeNodeParcelableStore2.f295123a.remove(Long.valueOf(b));
            entryTreeNodeParcelableStore2.f295124b.remove(b);
            this.f294786d = kVar;
        }
    }

    /* renamed from: d */
    public final void mo85767d(C23056g gVar) {
        if (gVar != this.f294786d) {
            C59104x c = f294782e.mo56225c();
            c.mo56378ag(C58975e.f156826a, "StreamEntryTreeNodeMngr");
            ((C59052c) ((C59052c) c).mo56372aa(22399)).mo56386p("Controller to be reinserted differs from the dismissed controller.");
            this.f294785c = null;
            this.f294786d = null;
            return;
        }
        C58485gu guVar = this.f294785c;
        if (guVar == null) {
            C59104x c2 = f294782e.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "StreamEntryTreeNodeMngr");
            ((C59052c) ((C59052c) c2).mo56372aa(22398)).mo56386p("Previous ProtoParcelable null, restore will fail.");
            return;
        }
        EntryTreeNodeParcelableStore entryTreeNodeParcelableStore = this.f294784b;
        entryTreeNodeParcelableStore.mo95040d();
        int i = ((C58724pq) guVar).f156474d;
        for (int i2 = 0; i2 < i; i2++) {
            entryTreeNodeParcelableStore.mo95039c((C7726hr) guVar.get(i2));
        }
    }

    /* renamed from: e */
    public final void mo94950e() {
        this.f294788g = 0;
        this.f294787f = -1;
        this.f294789h = null;
    }

    /* renamed from: f */
    public final boolean mo94951f() {
        return this.f294784b.f295123a.size() == 0;
    }
}
