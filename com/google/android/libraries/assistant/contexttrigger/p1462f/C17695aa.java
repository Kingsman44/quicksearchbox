package com.google.android.libraries.assistant.contexttrigger.p1462f;

import android.content.Intent;
import com.google.android.libraries.assistant.contexttrigger.C17742i;
import com.google.android.libraries.assistant.contexttrigger.p1464h.C17741a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.assistant.proactive.p2776h.C36314g;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.f.aa */
/* compiled from: PG */
public final class C17695aa implements C17742i {

    /* renamed from: a */
    public static final C59071e f50875a = C59071e.m91332i("com.google.android.libraries.assistant.contexttrigger.f.aa");

    /* renamed from: b */
    public final Map f50876b;

    /* renamed from: c */
    public final Executor f50877c;

    /* renamed from: d */
    public final C17730t f50878d;

    /* renamed from: e */
    public final C17741a f50879e;

    /* renamed from: f */
    public final C36314g f50880f;

    /* renamed from: g */
    public final C21370a f50881g;

    /* renamed from: h */
    private final C17703ai f50882h;

    public C17695aa(C17703ai aiVar, Map map, Executor executor, C17730t tVar, C17741a aVar, C36314g gVar, C21370a aVar2) {
        this.f50882h = aiVar;
        this.f50876b = map;
        this.f50877c = executor;
        this.f50878d = tVar;
        this.f50879e = aVar;
        this.f50880f = gVar;
        this.f50881g = aVar2;
    }

    /* renamed from: a */
    public final C60870cx mo23439a(Intent intent) {
        return C60866ct.f164955a;
    }

    /* renamed from: b */
    public final C60870cx mo23440b(List list) {
        return C47633f.m84733g(C47633f.m84733g(this.f50882h.f50900a.mo46042d()).mo51515h(new C17734x(this, list), this.f50877c)).mo51516i(new C17735y(this), this.f50877c).mo51515h(C17736z.f50958a, C60826bg.f164896a);
    }

    /* renamed from: c */
    public final C60870cx mo23441c(List list) {
        C58976aa aaVar = C58975e.f156826a;
        C58480gp e = C58485gu.m89837e();
        return C47633f.m84733g(this.f50882h.mo23444a(new C17732v(this, list, e))).mo51515h(new C17733w(this, e), this.f50877c);
    }
}
