package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p684f;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p679c.C11628d;
import com.google.android.libraries.assistant.auto.tng.p1098n.C15459a;
import com.google.android.libraries.assistant.auto.tng.p1098n.p1100b.C15465a;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.f.d */
/* compiled from: PG */
public final class C11650d implements C15465a {

    /* renamed from: a */
    private static final C59071e f37619a = C59071e.m91332i("com.google.android.libraries.assistant.auto.jumpboost.gearhead.f.d");

    /* renamed from: b */
    private final Context f37620b;

    /* renamed from: c */
    private final C11628d f37621c;

    /* renamed from: d */
    private final Executor f37622d;

    /* renamed from: e */
    private final C15481g f37623e;

    /* renamed from: f */
    private final Optional f37624f;

    public C11650d(Context context, C11628d dVar, Executor executor, C15481g gVar, Optional optional) {
        this.f37620b = context;
        this.f37621c = dVar;
        this.f37622d = executor;
        this.f37623e = gVar;
        this.f37624f = optional;
    }

    /* renamed from: a */
    public final C60870cx mo20099a(Intent intent) {
        C58976aa aaVar = C58975e.f156826a;
        C60870cx f = mo20101f(intent);
        C11647a aVar = C11647a.f37615a;
        C60870cx g = C60922j.m93044g(f, C47810es.m84963c(aVar), this.f37622d);
        C11648b bVar = C11648b.f37616a;
        return C60846c.m92878g(g, ExecutionException.class, C47810es.m84963c(bVar), this.f37622d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ C60870cx mo20100b(Intent intent, Boolean bool) {
        if (bool.booleanValue()) {
            this.f37623e.mo22352b(C37179a.f97652eL);
            C59104x b = f37619a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "AapIntentStarter");
            ((C59052c) ((C59052c) b).mo56372aa(43434)).mo56386p("Intent handled by Gearhead side");
            if (this.f37624f.isPresent()) {
                ((C15459a) this.f37624f.get()).mo22349a();
            }
            return C60866ct.f164955a;
        }
        C59104x b2 = f37619a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "AapIntentStarter");
        ((C59052c) ((C59052c) b2).mo56372aa(43433)).mo56386p("Start Intent internally");
        intent.addFlags(268468224);
        try {
            C47810es.m84979s(this.f37620b, intent);
            this.f37623e.mo22352b(C37179a.f97653eM);
            if (this.f37624f.isPresent()) {
                ((C15459a) this.f37624f.get()).mo22349a();
            }
            return C60866ct.f164955a;
        } catch (ActivityNotFoundException e) {
            return C60856cj.m92899h(e);
        }
    }

    /* renamed from: f */
    public final C60870cx mo20101f(Intent intent) {
        this.f37623e.mo22352b(C37179a.f97651eK);
        C58976aa aaVar = C58975e.f156826a;
        C60870cx e = this.f37621c.mo20067e(intent);
        C11649c cVar = new C11649c(this, intent);
        return C60922j.m93045h(e, C47810es.m84966f(cVar), this.f37622d);
    }
}
