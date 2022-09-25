package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p834a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p852k.C12788a;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.a.c */
/* compiled from: PG */
public final class C12720c extends C22538o {

    /* renamed from: a */
    public static final C59071e f39814a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.a.c");

    /* renamed from: b */
    private final C58833ax f39815b;

    /* renamed from: c */
    private final Executor f39816c;

    public C12720c(C58833ax axVar, Executor executor) {
        this.f39815b = axVar;
        this.f39816c = executor;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        C59104x b = f39814a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SdkActionsPerformer");
        ((C59052c) ((C59052c) b).mo56372aa(44413)).mo56386p("perform()");
        if (!this.f39815b.mo56113h()) {
            return C60856cj.m92900i(C12788a.f39967b);
        }
        C60870cx a = ((C12718a) this.f39815b.mo56107c()).mo20764a();
        C12719b bVar = C12719b.f39813a;
        return C60922j.m93044g(a, C47810es.m84963c(bVar), this.f39816c);
    }
}
