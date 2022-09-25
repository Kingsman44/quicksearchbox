package com.google.android.libraries.lens.view.p2070an.p2071a;

import android.graphics.PointF;
import com.google.android.libraries.lens.view.p2069am.C25333i;
import com.google.android.libraries.lens.view.p2177w.C28185a;
import com.google.lens.p4707j.C62441br;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56224ae;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.lens.view.an.a.d */
/* compiled from: PG */
public final /* synthetic */ class C25355d implements Function {

    /* renamed from: a */
    public final /* synthetic */ C25333i f69056a;

    public /* synthetic */ C25355d(C25333i iVar) {
        this.f69056a = iVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C62441br h = C28185a.m52690h(C28185a.m52689g((C56224ae) obj, this.f69056a));
        return new PointF(h.f168611b, h.f168612c);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
