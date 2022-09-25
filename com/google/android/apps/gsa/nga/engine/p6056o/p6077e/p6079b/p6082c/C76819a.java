package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6079b.p6082c;

import com.google.android.apps.gsa.nga.engine.am.t;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80403p;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.libraries.assistant.p1484g.p1502d.C18187x;
import com.google.android.libraries.gsa.p1876k.C22864c;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.b.c.a */
/* compiled from: PG */
public final /* synthetic */ class C76819a implements C22864c {
    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        String str;
        C18187x xVar = (C18187x) obj;
        String str2 = (String) Collection.EL.stream(xVar.mo23634a()).map(C76825g.f212225a).collect(Collectors.joining("<br>"));
        if (xVar.mo23634a().isEmpty()) {
            str = "No actions supported :(";
        } else {
            str = String.format("Supported DirectActions:<br><br>%s", new Object[]{str2});
        }
        C80399l lVar = (C80399l) C80401n.f220656k.createBuilder();
        lVar.copyOnWrite();
        ((C80401n) lVar.instance).f220664g = C80403p.m128150a(3);
        C81442m.m129557s(lVar, t.r(str));
        return (C80401n) lVar.build();
    }
}
