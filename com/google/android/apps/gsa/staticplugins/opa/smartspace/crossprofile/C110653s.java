package com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile;

import com.google.android.apps.gsa.opa.smartspace.C83741am;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.s */
/* compiled from: PG */
public final /* synthetic */ class C110653s implements Function {

    /* renamed from: a */
    public final /* synthetic */ C110656v f308336a;

    public /* synthetic */ C110653s(C110656v vVar) {
        this.f308336a = vVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C110656v vVar = this.f308336a;
        C83741am amVar = (C83741am) obj;
        try {
            return (C83741am) C62942bv.parseFrom((C62942bv) C83741am.f228248e, amVar.toByteArray(), C62921ba.m95368a());
        } catch (C62974ct e) {
            ((C58970a) ((C58970a) ((C58970a) vVar.f308345d.mo56226d()).mo56382g(e.getCause())).mo56372aa(26596)).mo56386p("Failed to reparse SmartspaceUpdateInfo");
            return amVar;
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
