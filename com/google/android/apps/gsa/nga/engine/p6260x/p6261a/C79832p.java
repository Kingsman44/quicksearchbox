package com.google.android.apps.gsa.nga.engine.p6260x.p6261a;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80394g;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80295aq;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80363t;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80364u;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.a.p */
/* compiled from: PG */
public final /* synthetic */ class C79832p implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C79832p f218903a = new C79832p();

    private /* synthetic */ C79832p() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C80295aq aqVar;
        C80364u uVar;
        C80394g gVar = (C80394g) obj;
        if (gVar.f220647a == 2) {
            aqVar = (C80295aq) gVar.f220648b;
        } else {
            aqVar = C80295aq.f220357c;
        }
        if (aqVar.f220359a == 9) {
            uVar = (C80364u) aqVar.f220360b;
        } else {
            uVar = C80364u.f220516d;
        }
        C80363t a = C80363t.m128122a(uVar.f220520c);
        return a == null ? C80363t.UNRECOGNIZED : a;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
