package com.google.android.libraries.assistant.auto.tng.p1026k.p1027a;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p681d.C11636b;
import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.search.assistant.performer.p2728a.C35470f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52150hb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62971cq;
import java.util.concurrent.Executor;
import p3186j$.util.Collection;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.k.a.d */
/* compiled from: PG */
public final class C13713d extends C22538o {

    /* renamed from: a */
    public static final C59071e f41820a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.k.a.d");

    /* renamed from: b */
    private final C69464a f41821b;

    /* renamed from: c */
    private final C35470f f41822c;

    /* renamed from: d */
    private final Executor f41823d;

    /* renamed from: e */
    private final C11636b f41824e;

    public C13713d(C69464a aVar, C35470f fVar, Executor executor, C11636b bVar) {
        this.f41821b = aVar;
        this.f41822c = fVar;
        this.f41823d = executor;
        this.f41824e = bVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        Long l;
        if (dyVar.f135936b.equals("feedback.UPLOAD_CRASH_REPORT")) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            C52150hb hbVar = (C52150hb) m41992m(dwVar, "feedback_completion_args", C52150hb.f136843e.getParserForType());
            Intent intent = new Intent("com.google.android.voicesearch.USER_INITIATED_FEEDBACK");
            if (!hbVar.f136846b.isEmpty()) {
                intent.putExtra("com.google.android.voicesearch.USER_INITIATIED_FEEDBACK_MESSAGE", hbVar.f136846b);
            }
            C62971cq cqVar = hbVar.f136847c;
            if (!cqVar.isEmpty()) {
                Bundle bundle = new Bundle();
                Collection.EL.stream(cqVar).forEach(new C13710a(bundle));
                intent.putExtra("com.google.android.voicesearch.SHERLOG_LINKS", bundle);
            }
            intent.putExtra("com.google.android.voicesearch.IS_ASSISTANT_AUTO_TNG_FEEDBACK", true);
            if (((Boolean) this.f41821b.mo17428b()).booleanValue() && (l = this.f41824e.f37596f) != null) {
                intent.putExtra("com.google.android.voicesearch.LATEST_DIRECT_QUERY_FROM_GEARHEAD_ID", l.longValue());
                this.f41824e.f37596f = null;
            }
            C60870cx f = this.f41822c.mo20101f(intent);
            C13711b bVar = C13711b.f41818a;
            C60870cx g = C60922j.m93044g(f, C47810es.m84963c(bVar), this.f41823d);
            C13712c cVar = new C13712c(intent);
            return C60846c.m92878g(g, Exception.class, C47810es.m84963c(cVar), this.f41823d);
        }
        C59104x c = f41820a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "AapCrashRprtPerformer");
        ((C59052c) ((C59052c) c).mo56372aa(44968)).mo56386p("Wrong client op name supplied to UploadFeedbackPerformer.");
        throw new C22428d(dyVar);
    }
}
