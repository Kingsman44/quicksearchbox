package com.google.android.libraries.assistant.contexttrigger.p1460d;

import com.google.android.libraries.assistant.contexttrigger.p1462f.C17703ai;
import com.google.android.libraries.assistant.contexttrigger.p1462f.C17718j;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.d.e */
/* compiled from: PG */
public final /* synthetic */ class C17664e implements Function {

    /* renamed from: a */
    public final /* synthetic */ C17666g f50804a;

    public /* synthetic */ C17664e(C17666g gVar) {
        this.f50804a = gVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C17666g gVar = this.f50804a;
        C17703ai b = C17718j.m35001b(gVar.f50808c, (AccountId) obj);
        if (gVar.f50810e.f50788a) {
            return C47633f.m84733g(b.f50900a.mo46042d()).mo51515h(C17665f.f50805a, gVar.f50807b);
        }
        ((C59052c) ((C59052c) C17666g.f50806a.mo56224b()).mo56372aa(46946)).mo56386p("Always register the headphone signals before we enable the :interactor signals check on CTF.");
        return C60856cj.m92900i(true);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
