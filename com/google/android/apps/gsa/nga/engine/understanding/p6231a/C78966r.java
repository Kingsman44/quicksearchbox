package com.google.android.apps.gsa.nga.engine.understanding.p6231a;

import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.common.p4522b.C58485gu;
import java.util.List;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.a.r */
/* compiled from: PG */
public final /* synthetic */ class C78966r implements Function {

    /* renamed from: a */
    public final /* synthetic */ C78968t f217206a;

    /* renamed from: b */
    public final /* synthetic */ C83320io f217207b;

    /* renamed from: c */
    public final /* synthetic */ String f217208c;

    /* renamed from: d */
    public final /* synthetic */ List f217209d;

    /* renamed from: e */
    public final /* synthetic */ Optional f217210e;

    /* renamed from: f */
    public final /* synthetic */ Optional f217211f;

    public /* synthetic */ C78966r(C78968t tVar, C83320io ioVar, String str, List list, Optional optional, Optional optional2) {
        this.f217206a = tVar;
        this.f217207b = ioVar;
        this.f217208c = str;
        this.f217209d = list;
        this.f217210e = optional;
        this.f217211f = optional2;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C89849ae aeVar;
        C78968t tVar = this.f217206a;
        C83320io ioVar = this.f217207b;
        String str = this.f217208c;
        List list = this.f217209d;
        Optional optional = this.f217210e;
        Optional optional2 = this.f217211f;
        C78954f fVar = (C78954f) obj;
        Optional c = fVar.mo73697c();
        c.map(C78956h.f217191a).ifPresent(new C78959k(tVar, ioVar));
        Optional b = fVar.mo73696b(str, C58485gu.m89842j(list), (String) optional.get(), optional2);
        if (c.isPresent()) {
            if (b.isPresent()) {
                aeVar = ((C78955g) c.get()).mo73711b();
            } else {
                aeVar = ((C78955g) c.get()).mo73710a();
            }
            tVar.f217218f.mo74237c(aeVar, ioVar);
        }
        fVar.mo73698d();
        return b.isPresent() ? Stream.CC.m71935of(b.get()) : Stream.CC.m71936of((T[]) new Object[0]);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
