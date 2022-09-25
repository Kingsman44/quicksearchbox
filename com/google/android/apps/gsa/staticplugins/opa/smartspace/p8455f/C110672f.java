package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8455f;

import com.google.assistant.p3994s.p3995a.C53247gv;
import com.google.assistant.p3994s.p3995a.C53250gy;
import com.google.assistant.p3994s.p3995a.C53366lf;
import com.google.assistant.p3994s.p3995a.C53420nf;
import com.google.common.p4526f.C59071e;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.f.f */
/* compiled from: PG */
public final /* synthetic */ class C110672f implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C110672f f308393a = new C110672f();

    private /* synthetic */ C110672f() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C53420nf nfVar;
        C53247gv gvVar;
        C53366lf lfVar = (C53366lf) obj;
        C59071e eVar = C110679m.f308400a;
        if (lfVar.f140037b == 4) {
            nfVar = (C53420nf) lfVar.f140038c;
        } else {
            nfVar = C53420nf.f140165o;
        }
        C53250gy gyVar = nfVar.f140176j;
        if (gyVar == null) {
            gyVar = C53250gy.f139586c;
        }
        if (gyVar.f139588a == 22) {
            gvVar = (C53247gv) gyVar.f139589b;
        } else {
            gvVar = C53247gv.f139580b;
        }
        return Collection.EL.stream(gvVar.f139583a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
