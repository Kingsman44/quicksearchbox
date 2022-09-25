package com.google.apps.tiktok.account.data.manager;

import android.util.Pair;
import com.google.apps.tiktok.account.data.C46215j;
import com.google.apps.tiktok.account.data.manager.p3615a.C46221b;
import com.google.apps.tiktok.account.data.manager.p3615a.C46222c;
import com.google.apps.tiktok.account.data.manager.p3615a.C46227h;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.apps.tiktok.account.data.manager.t */
/* compiled from: PG */
public final /* synthetic */ class C46312t implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C58528ij f121301a;

    /* renamed from: b */
    public final /* synthetic */ Collection f121302b;

    public /* synthetic */ C46312t(C58528ij ijVar, Collection collection) {
        this.f121301a = ijVar;
        this.f121302b = collection;
    }

    public final Object apply(Object obj) {
        C58528ij ijVar = this.f121301a;
        Collection collection = this.f121302b;
        C46222c cVar = (C46222c) obj;
        C58490gz gzVar = new C58490gz(4);
        C46221b bVar = (C46221b) cVar.toBuilder();
        bVar.copyOnWrite();
        ((C46222c) bVar.instance).mo50271a().clear();
        for (Map.Entry entry : Collections.unmodifiableMap(cVar.f121177c).entrySet()) {
            C46215j jVar = ((C46227h) entry.getValue()).f121187c;
            if (jVar == null) {
                jVar = C46215j.f121154k;
            }
            if (ijVar.contains(jVar.f121165j)) {
                bVar.mo50269a(((Integer) entry.getKey()).intValue(), (C46227h) entry.getValue());
            } else {
                gzVar.mo55430i(entry);
            }
        }
        C58495hd k = C46232ae.m82475k(collection, bVar);
        C58495hd f = gzVar.mo55427f(true);
        bVar.copyOnWrite();
        ((C46222c) bVar.instance).mo50271a().putAll(f);
        return Pair.create(k, (C46222c) bVar.build());
    }
}
