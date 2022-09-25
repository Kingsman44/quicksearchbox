package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import com.google.android.apps.gsa.nga.shared.p6309ag.C80617l;
import com.google.android.apps.gsa.nga.shared.p6309ag.C80627v;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.mdi.C29690f;
import java.util.HashSet;
import java.util.Set;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.stream.Collectors;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.el */
/* compiled from: PG */
public final /* synthetic */ class C104020el implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C104026er f289432a;

    /* renamed from: b */
    public final /* synthetic */ Set f289433b;

    public /* synthetic */ C104020el(C104026er erVar, Set set) {
        this.f289432a = erVar;
        this.f289433b = set;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C104026er erVar = this.f289432a;
        Set set = this.f289433b;
        Set<C29690f> set2 = (Set) obj;
        Stream stream = Collection.EL.stream(set);
        C80617l lVar = erVar.f289452f;
        Objects.requireNonNull(lVar);
        HashSet hashSet = new HashSet((java.util.Collection) stream.map(new C103968cn(lVar)).collect(Collectors.toSet()));
        if (set.contains(C80627v.WEBREF)) {
            hashSet.add(erVar.f289452f.mo74370e());
        }
        long j = 0;
        for (C29690f fVar : set2) {
            if (hashSet.remove(fVar.f80411b)) {
                j += (long) Collection.EL.stream(fVar.f80416g).mapToInt(C103969co.f289359a).sum();
            }
        }
        return Long.valueOf(j);
    }
}
