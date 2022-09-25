package com.google.android.apps.gsa.staticplugins.opa.tapas.p8571p;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g.C112557l;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.assistant.p3781ad.p3789d.C48570ad;
import com.google.assistant.p3781ad.p3789d.C48580an;
import com.google.assistant.p3781ad.p3789d.p3791b.C48720ca;
import com.google.assistant.p3781ad.p3789d.p3791b.C48721cb;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.p.bb */
/* compiled from: PG */
public final /* synthetic */ class C113054bb implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C113071bs f313258a;

    /* renamed from: b */
    public final /* synthetic */ C113415ez f313259b;

    /* renamed from: c */
    public final /* synthetic */ boolean f313260c;

    public /* synthetic */ C113054bb(C113071bs bsVar, C113415ez ezVar, boolean z) {
        this.f313258a = bsVar;
        this.f313259b = ezVar;
        this.f313260c = z;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C113071bs bsVar = this.f313258a;
        C113415ez ezVar = this.f313259b;
        boolean z = this.f313260c;
        C48720ca caVar = (C48720ca) C48721cb.f126055m.createBuilder();
        int d = ezVar.mo100204d();
        caVar.copyOnWrite();
        C48721cb cbVar = (C48721cb) caVar.instance;
        cbVar.f126057a |= 1;
        cbVar.f126058b = d;
        C48580an j = ezVar.mo100210j();
        caVar.copyOnWrite();
        C48721cb cbVar2 = (C48721cb) caVar.instance;
        cbVar2.f126061e = j.getNumber();
        cbVar2.f126057a |= 8;
        String L = ezVar.mo100199L();
        caVar.copyOnWrite();
        C48721cb cbVar3 = (C48721cb) caVar.instance;
        L.getClass();
        cbVar3.f126057a |= 16;
        cbVar3.f126062f = L;
        int i = ezVar.mo100211k().f125915O;
        caVar.copyOnWrite();
        C48721cb cbVar4 = (C48721cb) caVar.instance;
        cbVar4.f126057a |= 32;
        cbVar4.f126063g = i;
        caVar.copyOnWrite();
        C48721cb cbVar5 = (C48721cb) caVar.instance;
        cbVar5.f126057a |= 64;
        cbVar5.f126064h = z;
        Optional O = ezVar.mo100056O();
        Objects.requireNonNull(caVar);
        O.ifPresent(new C113070br(caVar));
        Optional d2 = C112557l.m186378d(ezVar);
        Objects.requireNonNull(caVar);
        d2.ifPresent(new C113053ba(caVar));
        Optional b = C112557l.m186376b(ezVar);
        if (b.isPresent()) {
            Optional e = bsVar.f313296k.mo99348a((C48570ad) b.get()).mo99343e();
            if (e.isPresent()) {
                String str = (String) e.get();
                caVar.copyOnWrite();
                C48721cb cbVar6 = (C48721cb) caVar.instance;
                str.getClass();
                cbVar6.f126057a |= 256;
                cbVar6.f126066j = str;
            }
        }
        return (C48721cb) caVar.build();
    }
}
