package com.google.android.apps.gsa.staticplugins.nga.p8065h;

import com.google.common.p4522b.C58431eu;
import com.google.common.p4522b.C58485gu;
import java.util.Iterator;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.h.bj */
/* compiled from: PG */
public abstract class C103244bj implements Iterable {
    /* renamed from: e */
    public static C103244bj m171134e(C58485gu guVar) {
        return new C103277f(guVar, Collection.EL.stream(guVar).anyMatch(C103240bf.f288015a), Collection.EL.stream(guVar).mapToInt(C103241bg.f288016a).sum(), Collection.EL.stream(guVar).filter(C103240bf.f288015a).map(C103242bh.f288017a).filter(C103243bi.f288018a).findFirst());
    }

    /* renamed from: a */
    public abstract int mo93721a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C58485gu mo93722b();

    /* renamed from: c */
    public abstract Optional mo93723c();

    /* renamed from: d */
    public abstract boolean mo93724d();

    public final Iterator iterator() {
        return C58431eu.m89652b(mo93722b()).iterator();
    }
}
