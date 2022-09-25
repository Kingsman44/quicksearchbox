package com.google.android.libraries.search.rendering.xuikit.p3097a.p3114b;

import com.google.common.base.C58838bb;
import com.google.p4283bv.p4380j.p4385b.C57832e;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4396b.p4397a.p4398a.C57701b;
import java.util.HashSet;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5496d.C69821c;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.b.w */
/* compiled from: PG */
public final /* synthetic */ class C40015w implements C69821c {

    /* renamed from: a */
    public final /* synthetic */ C57701b f105167a;

    public /* synthetic */ C40015w(C57701b bVar) {
        this.f105167a = bVar;
    }

    /* renamed from: a */
    public final void mo25818a(Object obj) {
        C57701b bVar = this.f105167a;
        C69803b bVar2 = (C69803b) obj;
        C58838bb.m90869d((bVar.f154161a & 2) != 0, "No output path (to_datastore) specified");
        C58838bb.m90869d(1 == (bVar.f154161a & 1), "No Transform specified");
        HashSet hashSet = new HashSet();
        for (C57832e eVar : bVar.f154162b) {
            C58838bb.m90869d(1 == (eVar.f154519a & 1), "TransformSource with no name");
            int i = eVar.f154520b;
            C58838bb.m90869d(i == 2 || i == 3, "TransformSource with no source");
            C58838bb.m90873h(hashSet.add(eVar.f154522d), "Repeated TransformSource name '%s'", eVar.f154522d);
        }
    }
}
