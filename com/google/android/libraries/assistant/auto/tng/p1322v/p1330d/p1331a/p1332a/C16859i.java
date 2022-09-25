package com.google.android.libraries.assistant.auto.tng.p1322v.p1330d.p1331a.p1332a;

import com.google.android.libraries.assistant.auto.tng.p1322v.p1330d.p1334b.p1336b.C16865a;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1343f.C16892a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1177c.p1178a.C15829o;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1185e.p1195e.p1196a.C15881b;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16358be;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16359bf;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.assistant.auto.tng.v.d.a.a.i */
/* compiled from: PG */
final class C16859i implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ String f49328a;

    /* renamed from: b */
    final /* synthetic */ C16860j f49329b;

    public C16859i(C16860j jVar, String str) {
        this.f49329b = jVar;
        this.f49328a = str;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        C58976aa aaVar = C58975e.f156826a;
        C15881b bVar = this.f49329b.f49340j;
        String str = this.f49328a;
        if (bVar.f47160c.isPresent()) {
            C58833ax a = ((C15829o) bVar.f47160c.get()).mo22578a();
            if (a.mo56113h()) {
                C16359bf bfVar = (C16359bf) a.mo56107c();
                if (!bfVar.f48156c.equals(str)) {
                    C16358be beVar = (C16358be) bfVar.toBuilder();
                    beVar.copyOnWrite();
                    C16359bf bfVar2 = (C16359bf) beVar.instance;
                    str.getClass();
                    bfVar2.f48154a |= 2;
                    bfVar2.f48156c = str;
                    ((C15829o) bVar.f47160c.get()).mo22579b((C16359bf) beVar.build());
                }
            }
        }
        for (C16865a aVar : this.f49329b.f49339i.f49347a) {
        }
        if (this.f49329b.f49337g.isPresent()) {
            ((C16892a) this.f49329b.f49337g.get()).mo23073a();
        }
    }
}
