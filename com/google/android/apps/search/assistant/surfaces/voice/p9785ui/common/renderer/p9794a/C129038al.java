package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9794a;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.C129163d;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.C129228e;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.assistant.p3897e.p3921j.p3926e.C51965fr;
import com.google.common.p4526f.C59052c;
import com.google.p4017at.p4060h.p4068b.p4069a.C54201r;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import dagger.hilt.android.internal.managers.C68324h;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.a.al */
/* compiled from: PG */
public final /* synthetic */ class C129038al implements Function {

    /* renamed from: a */
    public final /* synthetic */ C129039am f354508a;

    public /* synthetic */ C129038al(C129039am amVar) {
        this.f354508a = amVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C129039am amVar = this.f354508a;
        try {
            C54201r rVar = (C54201r) C62942bv.parseFrom((C62942bv) C54201r.f142243f, ((C51965fr) obj).f136372b, C62921ba.m95368a());
            AccountId accountId = amVar.f354510b;
            C129026a aVar = (C129026a) C129043b.f354521c.createBuilder();
            aVar.copyOnWrite();
            C129043b bVar = (C129043b) aVar.instance;
            rVar.getClass();
            bVar.f354524b = rVar;
            bVar.f354523a |= 1;
            C129057p pVar = new C129057p();
            C68324h.m98669f(pVar);
            C47247a.m84047b(pVar, accountId);
            C47243l.m84039a(pVar, (C129043b) aVar.build());
            C129228e eVar = C129228e.f354973a;
            return C129163d.m210837a(pVar, (String) null);
        } catch (C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) C129039am.f354509a.mo56226d()).mo56382g(e)).mo56372aa(38124)).mo56386p("ui.SHOW_RENDERED_CARD");
            return C129228e.f354973a;
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
