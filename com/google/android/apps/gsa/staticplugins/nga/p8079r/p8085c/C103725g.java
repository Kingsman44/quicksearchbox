package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c;

import com.google.android.apps.gsa.nga.shared.p6275aa.C80137bo;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80138bp;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80143bu;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80275dd;
import com.google.protobuf.C63088z;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.c.g */
/* compiled from: PG */
public final /* synthetic */ class C103725g implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C103725g f288866a = new C103725g();

    private /* synthetic */ C103725g() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C63088z zVar = (C63088z) obj;
        C80143bu buVar = (C80143bu) C80275dd.f220288c.createBuilder();
        C80137bo boVar = (C80137bo) C80138bp.f219920c.createBuilder();
        boVar.copyOnWrite();
        C80138bp bpVar = (C80138bp) boVar.instance;
        zVar.getClass();
        bpVar.f219922a |= 1;
        bpVar.f219923b = zVar;
        C80138bp bpVar2 = (C80138bp) boVar.build();
        buVar.copyOnWrite();
        C80275dd ddVar = (C80275dd) buVar.instance;
        bpVar2.getClass();
        ddVar.f220291b = bpVar2;
        ddVar.f220290a = 14;
        return (C80275dd) buVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
