package com.google.android.libraries.lens.view.session.ondevice.p2164a.p2165a;

import com.google.android.libraries.lens.view.p2069am.C25347w;
import com.google.common.p4522b.C58431eu;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.a.a.af */
/* compiled from: PG */
public final class C27818af {

    /* renamed from: a */
    public static final C58495hd f75885a;

    /* renamed from: b */
    private static final C58495hd f75886b;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55432k((Iterable) Collection.EL.stream(C58485gu.m89852t(new C27819b(), new C27820c(), new C27824g(), new C27825h(), new C27821d(), new C27822e(), new C27823f())).map(C27816ad.f75883a).collect(Collectors.toUnmodifiableList()));
        C58495hd f = gzVar.mo55427f(false);
        f75886b = f;
        C58490gz gzVar2 = new C58490gz(4);
        gzVar2.mo55432k((Iterable) Stream.CC.m71935of(new C27798a()).map(C27817ae.f75884a).collect(Collectors.toUnmodifiableList()));
        C58495hd f2 = gzVar2.mo55427f(false);
        f75885a = f2;
        C58485gu.m89841i(C58431eu.m89653c(f.values(), f2.values()).mo55248h());
    }

    /* renamed from: a */
    public static final C27814ab m51835a(C25347w wVar) {
        C58495hd hdVar = f75886b;
        if (hdVar.containsKey(wVar)) {
            return (C27814ab) hdVar.get(wVar);
        }
        int number = wVar.getNumber();
        throw new IllegalArgumentException("Unknown cascade version: " + number);
    }
}
