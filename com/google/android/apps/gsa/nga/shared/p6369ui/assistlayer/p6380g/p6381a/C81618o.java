package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6380g.p6381a;

import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80760eh;
import com.google.android.apps.gsa.nga.shared.p6417x.C83343ad;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.g.a.o */
/* compiled from: PG */
public final /* synthetic */ class C81618o implements C83343ad {

    /* renamed from: a */
    public static final /* synthetic */ C81618o f223270a = new C81618o();

    private /* synthetic */ C81618o() {
    }

    /* renamed from: a */
    public final Object mo73138a(Object obj, Object obj2, Object obj3) {
        int i;
        Boolean bool = (Boolean) obj;
        C80760eh ehVar = (C80760eh) obj3;
        if (!((Boolean) obj2).booleanValue()) {
            return Optional.m71637of(-1);
        }
        if (!bool.booleanValue() || (i = ehVar.f221673d) == 0) {
            return Optional.empty();
        }
        return Optional.m71637of(Integer.valueOf(i));
    }
}
