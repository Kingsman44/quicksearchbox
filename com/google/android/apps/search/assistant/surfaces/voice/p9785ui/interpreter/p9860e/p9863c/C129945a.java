package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.p9863c;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119899r;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129901aj;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129944c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129957h;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129958i;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129966q;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129969t;
import com.google.assistant.p3897e.p3921j.p3926e.C51910dq;
import com.google.protobuf.C62934bn;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.e.c.a */
/* compiled from: PG */
public final class C129945a {
    /* renamed from: a */
    public static final C129966q m212132a(C129901aj ajVar, C119899r rVar) {
        C129966q qVar = ajVar.f356348a;
        if (qVar == null) {
            qVar = C129966q.f356466k;
        }
        int i = qVar.f356469b;
        if (i == 4 || i == 5) {
            C69664n.m101060f(qVar, "this");
            return qVar;
        } else if (rVar.f333902a == 3) {
            C69664n.m101060f(qVar, BuildConfig.FLAVOR);
            C62934bn builder = qVar.toBuilder();
            C69664n.m101060f(builder, "this.toBuilder()");
            C129969t a = C69664n.m101061g((C129944c) builder, "builder");
            C129957h hVar = (C129957h) C129958i.f356427a.createBuilder();
            C69664n.m101060f(hVar, "newBuilder()");
            a.mo109355c(C69664n.m101061g(hVar, "builder").mo109359a());
            return a.mo109353a();
        } else {
            C69664n.m101060f(qVar, BuildConfig.FLAVOR);
            C62934bn builder2 = qVar.toBuilder();
            C69664n.m101060f(builder2, "this.toBuilder()");
            C129969t a2 = C69664n.m101061g((C129944c) builder2, "builder");
            C51910dq dqVar = ajVar.f356349b;
            if (dqVar == null) {
                dqVar = C51910dq.f136159t;
            }
            C69664n.m101060f(dqVar, "clientOp");
            a2.mo109358f(C129946b.m212135c(dqVar));
            return a2.mo109353a();
        }
    }
}
