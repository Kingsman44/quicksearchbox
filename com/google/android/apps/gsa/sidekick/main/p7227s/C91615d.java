package com.google.android.apps.gsa.sidekick.main.p7227s;

import android.text.TextUtils;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.shared.util.p7159c.C90945k;
import com.google.android.apps.gsa.sidekick.main.p7203f.C91376f;
import com.google.android.apps.gsa.sidekick.shared.p7244m.C91763c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p375ai.p378b.C7642eo;
import com.google.p375ai.p378b.C7950pz;
import com.google.p375ai.p378b.C7952qa;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.sidekick.main.s.d */
/* compiled from: PG */
final class C91615d extends C90945k {

    /* renamed from: a */
    final /* synthetic */ C91618g f255534a;

    /* renamed from: b */
    private final String f255535b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91615d(C91618g gVar, String str, C90929bz bzVar) {
        super("FetchPlaceSuggestions", bzVar, 1, 4);
        this.f255534a = gVar;
        this.f255535b = str;
    }

    /* renamed from: f */
    private final void m149882f() {
        synchronized (this.f255534a.f255537b) {
            C91618g gVar = this.f255534a;
            gVar.f255541f = null;
            if (!TextUtils.equals(gVar.f255542g, this.f255535b)) {
                C91618g gVar2 = this.f255534a;
                gVar2.mo86001a(gVar2.f255542g);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo77936a(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        if (TextUtils.isEmpty(this.f255535b)) {
            C59104x c = C91618g.f255536a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "PlacesApiFetcher");
            ((C59052c) ((C59052c) c).mo56372aa(11785)).mo56386p("Place String Empty or Null");
            return null;
        }
        C7950pz pzVar = (C7950pz) C91763c.m150327a(C7642eo.SUGGEST_PLACES).toBuilder();
        pzVar.copyOnWrite();
        C7952qa qaVar = (C7952qa) pzVar.instance;
        qaVar.f27920a |= 1;
        qaVar.f27921b = true;
        this.f255534a.f255539d.mo85696a((C7952qa) pzVar.build(), C91376f.f254951b);
        C59104x c2 = C91618g.f255536a.mo56225c();
        c2.mo56378ag(C58975e.f156826a, "PlacesApiFetcher");
        ((C59052c) ((C59052c) c2).mo56372aa(11784)).mo56386p("Error fetching place suggestions");
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo77937b(Object obj) {
        List list = (List) obj;
        C91618g gVar = this.f255534a;
        gVar.f255540e = list == null;
        gVar.f255538c.setNotifyOnChange(false);
        gVar.f255538c.clear();
        if (!gVar.f255540e) {
            gVar.f255538c.addAll(list);
        }
        gVar.f255538c.notifyDataSetChanged();
        m149882f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* synthetic */ void mo85240c(Object obj) {
        List list = (List) obj;
        m149882f();
    }
}
