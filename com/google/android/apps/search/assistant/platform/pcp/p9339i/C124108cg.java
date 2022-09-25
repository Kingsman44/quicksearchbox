package com.google.android.apps.search.assistant.platform.pcp.p9339i;

import com.google.common.p4522b.C58485gu;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.stream.Collectors;
import p3186j$.util.stream.Stream;
import p5304e.p5305a.p5306a.p5431u.p5434b.C69254t;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.i.cg */
/* compiled from: PG */
public final class C124108cg {

    /* renamed from: a */
    public final C69254t f342771a;

    /* renamed from: b */
    public final long f342772b;

    public C124108cg(C69254t tVar, long j) {
        this.f342771a = tVar;
        this.f342772b = j;
    }

    /* renamed from: a */
    public final C58485gu mo106288a(List list, boolean z) {
        Stream stream = Collection.EL.stream((List) Collection.EL.stream(this.f342771a.f185373a).filter(new C124102ca(z)).map(C124103cb.f342766a).collect(Collectors.toCollection(C124104cc.f342767a)));
        Objects.requireNonNull(list);
        return C58485gu.m89842j((List) stream.filter(new C124105cd(list)).collect(Collectors.toCollection(C124104cc.f342767a)));
    }
}
