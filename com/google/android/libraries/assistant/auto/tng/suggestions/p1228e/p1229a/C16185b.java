package com.google.android.libraries.assistant.auto.tng.suggestions.p1228e.p1229a;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16143co;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.e.a.b */
/* compiled from: PG */
public final /* synthetic */ class C16185b implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C16187d f47741a;

    /* renamed from: b */
    public final /* synthetic */ boolean f47742b;

    /* renamed from: c */
    public final /* synthetic */ String f47743c;

    public /* synthetic */ C16185b(C16187d dVar, boolean z, String str) {
        this.f47741a = dVar;
        this.f47742b = z;
        this.f47743c = str;
    }

    public final C60870cx apply(Object obj) {
        C16187d dVar = this.f47741a;
        boolean z = this.f47742b;
        String str = this.f47743c;
        C58833ax c = dVar.mo22847c((C16143co) ((C58833ax) obj).mo56111f(), z);
        if (c.mo56113h()) {
            return C60856cj.m92900i(c);
        }
        C60870cx i = dVar.f47747a.mo22652i(str);
        C16184a aVar = new C16184a(dVar, z);
        return C60922j.m93044g(i, C47810es.m84963c(aVar), dVar.f47748b);
    }
}
