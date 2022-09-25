package com.google.android.apps.search.webglide.webcontent;

import com.google.android.apps.search.webglide.p10699b.C142185p;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import dagger.hilt.android.internal.managers.C68324h;
import p3186j$.util.function.Function;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.webglide.webcontent.o */
/* compiled from: PG */
public final class C142256o implements Function {

    /* renamed from: a */
    public static final C142256o f385935a = new C142256o();

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C142257p pVar = (C142257p) obj;
        C69664n.m101061g(pVar, "payload");
        AccountId accountId = pVar.f385936a;
        C142185p pVar2 = pVar.f385937b;
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(pVar2, "params");
        C142249h hVar = new C142249h();
        C68324h.m98669f(hVar);
        C47247a.m84047b(hVar, accountId);
        C47243l.m84039a(hVar, pVar2);
        return hVar;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
