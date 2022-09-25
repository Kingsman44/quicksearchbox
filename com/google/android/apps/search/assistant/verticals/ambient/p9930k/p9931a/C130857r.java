package com.google.android.apps.search.assistant.verticals.ambient.p9930k.p9931a;

import android.accounts.Account;
import android.content.Context;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.p9930k.C130862c;
import com.google.android.apps.search.assistant.verticals.ambient.p9930k.C130863d;
import com.google.android.apps.search.assistant.verticals.ambient.p9930k.C130864e;
import com.google.android.apps.search.assistant.verticals.ambient.p9930k.C130883x;
import com.google.android.apps.search.assistant.verticals.ambient.p9933l.p9934a.C130885b;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130895ag;
import com.google.android.gms.semanticlocation.C145986x;
import com.google.android.gms.semanticlocation.C145987y;
import com.google.android.gms.semanticlocation.internal.C145969g;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.libraries.search.p3047m.p3054d.C39239a;
import com.google.assistant.p4016z.C53738w;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.k.a.r */
/* compiled from: PG */
public final class C130857r implements C130863d {

    /* renamed from: f */
    public static final /* synthetic */ int f358121f = 0;

    /* renamed from: g */
    private static final Account f358122g;

    /* renamed from: h */
    private static final C145987y f358123h;

    /* renamed from: a */
    public final C130864e f358124a;

    /* renamed from: b */
    public final Executor f358125b;

    /* renamed from: c */
    public final C130895ag f358126c;

    /* renamed from: d */
    public final C58974d f358127d;

    /* renamed from: e */
    public final C130885b f358128e;

    static {
        Account account = new Account("ACCOUNT_NAME", "com.google");
        f358122g = account;
        C145986x xVar = new C145986x();
        xVar.mo122458b(account);
        xVar.f394661a = "ambient_assistant";
        f358123h = xVar.mo122457a();
    }

    public C130857r(C130864e eVar, C130885b bVar, Executor executor, Context context, C130895ag agVar, C130603a aVar) {
        this.f358124a = eVar;
        this.f358128e = bVar;
        this.f358125b = executor;
        new C145969g(C39239a.m68666a(context, C39226b.TAG_ASSISTANT_AMBIENT), f358123h);
        this.f358126c = agVar;
        this.f358127d = aVar.mo109740b(this);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo109842a(C53738w wVar) {
        return C130862c.m213230a(this, wVar);
    }

    /* renamed from: b */
    public final C60870cx mo109843b(C53738w wVar, C130883x xVar) {
        return C60856cj.m92899h(new UnsupportedOperationException("runInference(Location, LocationInferenceOptions) is not implemented by CslLocationInference"));
    }
}
