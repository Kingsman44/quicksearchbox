package com.google.android.libraries.assistant.contexttrigger.p1466j;

import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.assistant.contexttrigger.C17619b;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.j.m */
/* compiled from: PG */
public final class C17797m implements C17619b {

    /* renamed from: a */
    public static final C59071e f51077a = C59071e.m91332i("com.google.android.libraries.assistant.contexttrigger.j.m");

    /* renamed from: b */
    public final C21370a f51078b;

    /* renamed from: c */
    public final Context f51079c;

    /* renamed from: d */
    public final C17801q f51080d;

    /* renamed from: e */
    private final C42876ab f51081e;

    /* renamed from: f */
    private final Executor f51082f;

    /* renamed from: g */
    private final C46175b f51083g;

    public C17797m(C42876ab abVar, C21370a aVar, Executor executor, Context context, C46175b bVar, C17801q qVar) {
        this.f51081e = abVar;
        this.f51078b = aVar;
        this.f51082f = executor;
        this.f51079c = context;
        this.f51083g = bVar;
        this.f51080d = qVar;
    }

    /* renamed from: a */
    public final C60870cx mo23414a(Intent intent) {
        throw null;
    }

    /* renamed from: b */
    public final C60870cx mo23464b() {
        C58976aa aaVar = C58975e.f156826a;
        C58480gp e = C58485gu.m89837e();
        C58480gp e2 = C58485gu.m89837e();
        C58480gp e3 = C58485gu.m89837e();
        C60870cx a = this.f51081e.mo46039a(new C17794j(this, e, e2, e3), this.f51082f);
        C60870cx d = this.f51083g.mo50247d();
        return C47633f.m84733g(C47638k.m84753d(a, d).mo51521b(new C17795k(this, d, e, e2, e3), this.f51082f)).mo51515h(C17796l.f51076a, this.f51082f);
    }
}
