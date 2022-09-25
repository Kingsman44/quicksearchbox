package com.google.android.apps.gsa.nga.engine.education;

import com.google.assistant.p3775ac.p3779d.C48461a;
import com.google.assistant.p3775ac.p3779d.C48462b;
import com.google.assistant.p3775ac.p3779d.C48468h;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.r */
/* compiled from: PG */
public final /* synthetic */ class C75972r implements Function {

    /* renamed from: a */
    public final /* synthetic */ C48468h f210776a;

    public /* synthetic */ C75972r(C48468h hVar) {
        this.f210776a = hVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C48468h hVar = this.f210776a;
        C58974d dVar = C75688am.f210098a;
        C48461a aVar = (C48461a) ((C48462b) obj).toBuilder();
        aVar.copyOnWrite();
        C48462b bVar = (C48462b) aVar.instance;
        bVar.f125199i = hVar.f125214h;
        bVar.f125191a |= 64;
        return (C48462b) aVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
