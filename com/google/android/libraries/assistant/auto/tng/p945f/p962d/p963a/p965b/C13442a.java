package com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p965b;

import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13544t;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13545u;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13546v;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d.C13519e;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d.C13528n;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.d.a.b.a */
/* compiled from: PG */
public final /* synthetic */ class C13442a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C13454h f41277a;

    public /* synthetic */ C13442a(C13454h hVar) {
        this.f41277a = hVar;
    }

    public final Object apply(Object obj) {
        C13454h hVar = this.f41277a;
        C13544t tVar = (C13544t) C13546v.f41508e.createBuilder();
        tVar.copyOnWrite();
        ((C13546v) tVar.instance).f41511b = C13545u.m29826a(3);
        Stream flatMap = Collection.EL.stream((List) obj).flatMap(C13448c.f41282a);
        Objects.requireNonNull(tVar);
        flatMap.forEach(new C13450d(tVar));
        C13546v vVar = (C13546v) tVar.build();
        C59104x b = C13454h.f41288a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "HeuristicSmartActionGen");
        ((C59052c) ((C59052c) b).mo56372aa(44808)).mo56387q("Generated %d smart action(s) with active triggers.", vVar.f41512c.size());
        C13528n.m29813d(vVar.f41512c);
        hVar.f41290c.mo22352b(C13519e.m29803a(4, vVar));
        return vVar;
    }
}
