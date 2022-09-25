package com.google.android.apps.gsa.nga.engine.warmactions;

import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79569ab;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79570b;
import com.google.android.apps.gsa.nga.engine.warmactions.p6259k.C79720c;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.g */
/* compiled from: PG */
public abstract class C79566g {

    /* renamed from: b */
    public static final C58974d f218307b = C58974d.m91136j();

    /* renamed from: c */
    public static C79566g m127644c(C79569ab abVar) {
        return new C79403a(abVar, 1);
    }

    /* renamed from: a */
    public abstract C79569ab mo74017a();

    /* renamed from: b */
    public abstract int mo74018b();

    /* renamed from: d */
    public final C79570b mo74138d() {
        return (C79570b) Collection.EL.stream(C79720c.m127814b(mo74017a())).max(C79540d.f218256a).orElseThrow(C79542e.f218257a);
    }
}
