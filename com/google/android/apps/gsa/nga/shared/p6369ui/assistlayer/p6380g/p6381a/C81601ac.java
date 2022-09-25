package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6380g.p6381a;

import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80750dy;
import com.google.android.apps.gsa.nga.shared.p6417x.C83343ad;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.g.a.ac */
/* compiled from: PG */
public final /* synthetic */ class C81601ac implements C83343ad {

    /* renamed from: a */
    public static final /* synthetic */ C81601ac f223218a = new C81601ac();

    private /* synthetic */ C81601ac() {
    }

    /* renamed from: a */
    public final Object mo73138a(Object obj, Object obj2, Object obj3) {
        int i;
        Boolean bool = (Boolean) obj;
        C80750dy dyVar = (C80750dy) obj3;
        if (!((Boolean) obj2).booleanValue()) {
            return Optional.m71637of(-1);
        }
        if (!bool.booleanValue() || (i = dyVar.f221651d) == 0) {
            return Optional.empty();
        }
        return Optional.m71637of(Integer.valueOf(i));
    }
}
