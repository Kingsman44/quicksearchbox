package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6090d;

import android.service.notification.StatusBarNotification;
import com.google.android.apps.gsa.nga.engine.am.h.df;
import com.google.android.apps.gsa.nga.engine.am.s.f;
import com.google.android.apps.gsa.nga.shared.p6320al.C80884a;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.d.ac */
/* compiled from: PG */
public final /* synthetic */ class C77004ac implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C77140u f212549a;

    public /* synthetic */ C77004ac(C77140u uVar) {
        this.f212549a = uVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C77140u uVar = this.f212549a;
        C58495hd hdVar = (C58495hd) obj;
        if (hdVar.isEmpty()) {
            uVar.mo72409e().ifPresent(new C77007af(uVar));
            C58485gu guVar = (C58485gu) Collection.EL.stream(uVar.mo72413i()).filter(new f(C80884a.m128736a(((df) uVar.mo72410f().get()).b()))).collect(C58370cn.f155946a);
            if (guVar.size() == 1) {
                return Optional.m71637of(C77126g.m123804a((StatusBarNotification) guVar.get(0)));
            }
            return Optional.empty();
        } else if (hdVar.size() == 1) {
            return Optional.m71637of(C77126g.m123804a((StatusBarNotification) hdVar.values().mo55229u().get(0)));
        } else {
            uVar.mo72409e().ifPresent(new C77008ag(uVar));
            return Optional.m71637of(C77028b.f212611a);
        }
    }
}
