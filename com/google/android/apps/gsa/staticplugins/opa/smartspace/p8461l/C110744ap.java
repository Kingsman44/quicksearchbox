package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8461l;

import com.google.android.apps.gsa.shared.p7041h.C89770b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58528ij;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.l.ap */
/* compiled from: PG */
public final /* synthetic */ class C110744ap implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C58528ij f308560a;

    /* renamed from: b */
    public final /* synthetic */ C91006f f308561b;

    /* renamed from: c */
    public final /* synthetic */ String f308562c;

    public /* synthetic */ C110744ap(C58528ij ijVar, C91006f fVar, String str) {
        this.f308560a = ijVar;
        this.f308561b = fVar;
        this.f308562c = str;
    }

    public final Object apply(Object obj) {
        C58528ij ijVar = this.f308560a;
        C91006f fVar = this.f308561b;
        String str = this.f308562c;
        HashSet hashSet = new HashSet(ijVar);
        fVar.mo85291r("Relevant " + str + " profile calendar provider settings");
        for (C89770b bVar : (Set) obj) {
            hashSet.remove(Long.valueOf(bVar.f242971b));
            fVar.mo85279c("Calendar ID").mo85276a(C90752i.m148230d(Long.valueOf(bVar.f242971b)));
            C91006f e = fVar.mo85281e((Object) null);
            e.mo85279c("Title").mo85276a(C90752i.m148233g(bVar.f242974e));
            e.mo85279c("Visible").mo85276a(C90752i.m148230d(Integer.valueOf(bVar.f242976g)));
            e.mo85279c("Sync events").mo85276a(C90752i.m148230d(Integer.valueOf(bVar.f242975f)));
        }
        if (!hashSet.isEmpty()) {
            fVar.mo85279c("Calendars no longer in " + str + " calendar provider").mo85276a(C90752i.m148229c(Arrays.toString(Collection.EL.stream(hashSet).sorted().toArray(C110735ag.f308539a))));
        }
        return null;
    }
}
