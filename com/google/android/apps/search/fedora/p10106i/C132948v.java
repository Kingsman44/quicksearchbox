package com.google.android.apps.search.fedora.p10106i;

import com.google.android.apps.search.fedora.p10100f.C132838e;
import com.google.android.libraries.mdi.download.C28804cs;
import com.google.android.libraries.mdi.download.C28805ct;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.fedora.i.v */
/* compiled from: PG */
public final class C132948v implements C132940n {

    /* renamed from: a */
    public static final C59071e f362631a = C59071e.m91332i("com.google.android.apps.search.fedora.i.v");

    /* renamed from: b */
    public static final C58485gu f362632b = C58485gu.m89847o("lens_proactive_policy_config_group", "sheldon_policy_config_group");

    /* renamed from: c */
    public final C132838e f362633c;

    /* renamed from: d */
    public final Executor f362634d;

    /* renamed from: e */
    private final Optional f362635e;

    public C132948v(Optional optional, C132838e eVar, Executor executor) {
        this.f362635e = optional;
        this.f362633c = eVar;
        this.f362634d = executor;
    }

    /* renamed from: a */
    public final C60870cx mo110940a() {
        C59104x b = f362631a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "PolicyConfigSync");
        ((C59052c) ((C59052c) b).mo56372aa(39944)).mo56386p("Refresh account policy.");
        C132943q qVar = new C132943q(this);
        return C60856cj.m92905n(C47810es.m84965e(qVar), this.f362634d);
    }

    /* renamed from: b */
    public final C60870cx mo110942b(String str) {
        C59071e eVar = f362631a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "PolicyConfigSync");
        ((C59052c) ((C59052c) b).mo56372aa(39942)).mo56389s("Get policy config URI for group: %s", str);
        if (!this.f362635e.isPresent()) {
            C59104x c = eVar.mo56225c();
            c.mo56378ag(C58975e.f156826a, "PolicyConfigSync");
            ((C59052c) ((C59052c) c).mo56372aa(39943)).mo56386p("Mdd is not available. Cannot get policy file!!");
            return C60856cj.m92900i(Optional.empty());
        }
        C28804cs f = C28805ct.m53747f();
        f.mo34449c(str);
        return C47633f.m84733g(((C29409fd) this.f362635e.get()).mo34717f(f.mo34447a())).mo51516i(C132946t.f362629a, this.f362634d);
    }
}
