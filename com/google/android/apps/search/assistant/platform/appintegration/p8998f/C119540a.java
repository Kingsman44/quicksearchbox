package com.google.android.apps.search.assistant.platform.appintegration.p8998f;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9007a.p9009b.C119660c;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9007a.p9009b.C119662e;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9007a.p9010c.C119669b;
import com.google.common.p4522b.C58490gz;
import dagger.p5294a.C68220f;
import java.util.Iterator;
import java.util.Set;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.appintegration.f.a */
/* compiled from: PG */
public final class C119540a implements C68220f {
    /* renamed from: a */
    public static C119662e m198406a(Set set) {
        int i = C119662e.f333457a;
        C58490gz gzVar = new C58490gz(4);
        Optional empty = Optional.empty();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C119669b bVar = (C119669b) it.next();
            C119660c.m198577b(bVar.f333467c, bVar, gzVar);
        }
        return C119660c.m198576a(gzVar, empty);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
