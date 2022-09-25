package com.google.android.apps.gsa.nga.shared.p6407v;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6289k.p6291b.C80478c;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6289k.p6291b.C80484i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82889ee;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.r */
/* compiled from: PG */
public final /* synthetic */ class C83329r implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C83329r f227146a = new C83329r();

    private /* synthetic */ C83329r() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C80484i iVar;
        C80484i iVar2;
        C82889ee eeVar = (C82889ee) obj;
        C82885ea eaVar = eeVar.f226099d;
        if (eaVar == null) {
            eaVar = C82885ea.f225977c;
        }
        if (eaVar.f225979a == 1) {
            iVar = (C80484i) eaVar.f225980b;
        } else {
            iVar = C80484i.f220937h;
        }
        C80478c a = C80478c.m128173a(iVar.f220944f);
        if (a == null) {
            a = C80478c.UNRECOGNIZED;
        }
        int number = a.getNumber();
        C82885ea eaVar2 = eeVar.f226099d;
        if (eaVar2 == null) {
            eaVar2 = C82885ea.f225977c;
        }
        if (eaVar2.f225979a == 1) {
            iVar2 = (C80484i) eaVar2.f225980b;
        } else {
            iVar2 = C80484i.f220937h;
        }
        String str = iVar2.f220939a;
        return number + ": " + str;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
