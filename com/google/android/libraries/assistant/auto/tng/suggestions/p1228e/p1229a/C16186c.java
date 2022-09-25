package com.google.android.libraries.assistant.auto.tng.suggestions.p1228e.p1229a;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16115bn;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.e.a.c */
/* compiled from: PG */
public final /* synthetic */ class C16186c implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C16187d f47744a;

    /* renamed from: b */
    public final /* synthetic */ String f47745b;

    /* renamed from: c */
    public final /* synthetic */ boolean f47746c;

    public /* synthetic */ C16186c(C16187d dVar, String str, boolean z) {
        this.f47744a = dVar;
        this.f47745b = str;
        this.f47746c = z;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C16187d dVar = this.f47744a;
        String str = this.f47745b;
        boolean z = this.f47746c;
        C58833ax a = dVar.mo22847c(dVar.f47749c.mo22626a(str), z).mo56105a(dVar.mo22846b((C16115bn) dVar.f47749c.f47377r.get(str), z));
        if (a.mo56113h()) {
            return C60856cj.m92900i(a);
        }
        C58976aa aaVar = C58975e.f156826a;
        C60870cx k = dVar.f47747a.mo22654k(str);
        C16185b bVar = new C16185b(dVar, z, str);
        return C60922j.m93045h(k, C47810es.m84966f(bVar), dVar.f47748b);
    }
}
