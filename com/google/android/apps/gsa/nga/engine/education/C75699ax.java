package com.google.android.apps.gsa.nga.engine.education;

import android.util.Pair;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.ax */
/* compiled from: PG */
public final /* synthetic */ class C75699ax implements C22864c {

    /* renamed from: a */
    public static final /* synthetic */ C75699ax f210130a = new C75699ax();

    private /* synthetic */ C75699ax() {
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        return (Pair) Collection.EL.stream((C58485gu) obj).max(Comparator.CC.comparingInt(C75690ao.f210119a)).orElseThrow(C75694as.f210123a);
    }
}
