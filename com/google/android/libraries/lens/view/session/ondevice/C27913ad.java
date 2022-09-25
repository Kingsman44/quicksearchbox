package com.google.android.libraries.lens.view.session.ondevice;

import com.google.android.libraries.lens.view.p2069am.C25323bd;
import com.google.android.libraries.lens.view.p2069am.C25324be;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.ad */
/* compiled from: PG */
public final /* synthetic */ class C27913ad implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C27913ad f76034a = new C27913ad();

    private /* synthetic */ C27913ad() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C25324be beVar = (C25324be) obj;
        C58974d dVar = C27920ak.f76042a;
        int i = beVar.f68900c;
        int a = C25323bd.m46662a(i);
        if (a != 0 && a == 4) {
            return beVar.f68901d;
        }
        int a2 = C25323bd.m46662a(i);
        if (a2 != 0) {
            return a2 != 2 ? a2 != 3 ? a2 != 4 ? a2 != 5 ? a2 != 6 ? "UNRECOGNIZED" : "SAME_LANGUAGE" : "UNSUPPORTED_LANGUAGE_PAIR" : "ERROR" : "SUCCESS" : "UNKNOWN";
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
