package com.google.android.apps.gsa.staticplugins.s3request.p8693d;

import android.util.Pair;
import com.google.android.apps.gsa.p6487s3.producers.C84313l;
import com.google.android.apps.gsa.p6487s3.producers.C84316o;
import com.google.android.apps.gsa.p6487s3.producers.C84320s;
import com.google.android.apps.gsa.p6487s3.producers.C84326y;
import com.google.android.apps.gsa.search.core.google.C85929cw;
import com.google.android.apps.gsa.search.core.google.C86080v;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.knowledge.p4671b.C61818k;
import com.google.protobuf.C63088z;
import com.google.speech.p5208h.C66561ar;
import com.google.speech.p5208h.C66563at;
import com.google.speech.p5208h.C66566aw;
import com.google.speech.p5208h.C66567ax;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.s3request.d.f */
/* compiled from: PG */
public final class C116340f extends C84320s {

    /* renamed from: a */
    private final C84313l f322550a;

    public C116340f(C90931ca caVar, C84313l lVar, C22871g gVar) {
        super(caVar, gVar);
        this.f322550a = lVar;
    }

    /* renamed from: g */
    private static C66561ar m192955g(String str) {
        C66561ar arVar = (C66561ar) C66563at.f181054f.createBuilder();
        arVar.copyOnWrite();
        C66563at atVar = (C66563at) arVar.instance;
        str.getClass();
        atVar.f181056a |= 1;
        atVar.f181057b = str;
        int C = C85929cw.m138085C(str);
        arVar.copyOnWrite();
        C66563at atVar2 = (C66563at) arVar.instance;
        atVar2.f181060e = C - 1;
        atVar2.f181056a |= 8;
        return arVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo77838a(C61818k kVar) {
        Pair b = C86080v.m138416b(kVar);
        C66566aw awVar = (C66566aw) C66567ax.f181069f.createBuilder();
        C66561ar g = m192955g((String) b.first);
        C63088z A = C63088z.m96139A((byte[]) b.second);
        g.copyOnWrite();
        C66563at atVar = (C66563at) g.instance;
        C66563at atVar2 = C66563at.f181054f;
        atVar.f181056a |= 4;
        atVar.f181059d = A;
        awVar.mo59678c((C66563at) g.build());
        return (C66567ax) awVar.build();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo77839b(String str, String str2) {
        C66566aw awVar = (C66566aw) C66567ax.f181069f.createBuilder();
        C66561ar g = m192955g(str);
        g.copyOnWrite();
        C66563at atVar = (C66563at) g.instance;
        C66563at atVar2 = C66563at.f181054f;
        str2.getClass();
        atVar.f181056a |= 2;
        atVar.f181058c = str2;
        awVar.mo59678c((C66563at) g.build());
        return (C66567ax) awVar.build();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo77840c(C84326y yVar, List list, Query query) {
        list.addAll(this.f322550a.mo77856a(new C84316o(this, yVar), query));
    }
}
