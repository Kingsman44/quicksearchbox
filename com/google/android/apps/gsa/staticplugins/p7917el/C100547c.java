package com.google.android.apps.gsa.staticplugins.p7917el;

import android.accounts.Account;
import com.google.android.gms.languageprofile.C144445e;
import com.google.android.gms.languageprofile.C144453m;
import com.google.android.libraries.p3339v.C43205e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.staticplugins.el.c */
/* compiled from: PG */
public final class C100547c {

    /* renamed from: a */
    public static final C59071e f281132a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.el.c");

    /* renamed from: b */
    private final Executor f281133b;

    /* renamed from: c */
    private final C58833ax f281134c;

    public C100547c(Executor executor, C58833ax axVar) {
        this.f281133b = executor;
        this.f281134c = axVar;
    }

    /* renamed from: a */
    public final C60870cx mo91963a(int i, Account account, List list) {
        if (!this.f281134c.mo56113h()) {
            return C60856cj.m92900i(C58729pv.f156485a);
        }
        Class<Exception> cls = Exception.class;
        return C60922j.m93044g(C60846c.m92878g(C43205e.m76192b(((C144453m) this.f281134c.mo56107c()).mo119924a(account != null ? account.name : null, C144445e.m234703a(i))), cls, C47810es.m84963c(C100545a.f281130a), this.f281133b), C47810es.m84963c(new C100546b(list)), this.f281133b);
    }
}
