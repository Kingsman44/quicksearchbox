package com.google.android.libraries.search.p3055n.p3087j;

import com.google.android.libraries.search.p2904c.C37402bg;
import com.google.android.libraries.search.p2904c.C37419bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.n.j.f */
/* compiled from: PG */
public final class C39806f {

    /* renamed from: a */
    public static final C59071e f104681a = C59071e.m91332i("com.google.android.libraries.search.n.j.f");

    /* renamed from: b */
    public final C37419bx f104682b;

    /* renamed from: c */
    public final Executor f104683c;

    /* renamed from: d */
    public C58833ax f104684d = C58836b.f156633a;

    public C39806f(C37419bx bxVar, Executor executor) {
        this.f104682b = bxVar;
        this.f104683c = executor;
    }

    /* renamed from: a */
    public final C60870cx mo42019a() {
        if (!this.f104684d.mo56113h()) {
            ((C59052c) ((C59052c) f104681a.mo56226d()).mo56372aa(53861)).mo56386p("#closeMic already closed");
            return C60866ct.f164955a;
        }
        ((C59052c) ((C59052c) f104681a.mo56224b()).mo56372aa(53860)).mo56386p("#closeMic closing microphone");
        C60870cx a = ((C37402bg) this.f104684d.mo56107c()).mo20354a().mo20353a();
        C39805e eVar = new C39805e(this);
        return C60922j.m93044g(a, C47810es.m84963c(eVar), this.f104683c);
    }
}
