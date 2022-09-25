package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c;

import com.google.android.apps.gsa.nga.shared.p6275aa.C80275dd;
import com.google.android.apps.gsa.shared.p6976ag.p6980d.p6981a.C89123d;
import com.google.android.apps.gsa.shared.p6976ag.p6980d.p6981a.C89125f;
import com.google.android.libraries.gsa.p1876k.C22864c;
import java.util.Set;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.c.q */
/* compiled from: PG */
public final /* synthetic */ class C103735q implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C103736r f288892a;

    public /* synthetic */ C103735q(C103736r rVar) {
        this.f288892a = rVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C103736r rVar = this.f288892a;
        Optional findFirst = Collection.EL.stream((Set) obj).findFirst();
        if (findFirst.isPresent()) {
            rVar.f288893a.mo83111a(((C89123d) findFirst.get()).mo83106a());
        } else {
            rVar.f288893a.mo83111a(C89125f.OOBE);
        }
        return C80275dd.f220288c;
    }
}
