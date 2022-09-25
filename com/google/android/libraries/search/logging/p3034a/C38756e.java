package com.google.android.libraries.search.logging.p3034a;

import android.content.Context;
import com.google.apps.tiktok.account.data.p3613b.C46180e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.logging.a.e */
/* compiled from: PG */
final class C38756e implements C38728a {

    /* renamed from: a */
    public final Context f102314a;

    /* renamed from: b */
    private final Optional f102315b;

    /* renamed from: c */
    private final Executor f102316c;

    /* renamed from: d */
    private final C58881cr f102317d;

    /* renamed from: e */
    private final C58881cr f102318e;

    /* renamed from: f */
    private final C58881cr f102319f;

    public C38756e(Executor executor, Context context, String str, String str2, C58881cr crVar, Optional optional) {
        this.f102315b = optional;
        this.f102316c = executor;
        this.f102314a = context;
        this.f102317d = crVar;
        this.f102318e = C58886cw.m90973a(new C38751b(this, str));
        this.f102319f = C58886cw.m90973a(new C38754c(this, str2));
    }

    /* renamed from: a */
    public final C60870cx mo41585a(boolean z) {
        if (z) {
            return (C60870cx) this.f102319f.mo6453a();
        }
        return (C60870cx) this.f102318e.mo6453a();
    }

    /* renamed from: b */
    public final C60870cx mo41609b(String str, int i) {
        C60870cx cxVar;
        C60870cx cxVar2 = (C60870cx) this.f102317d.mo6453a();
        if (this.f102315b.isPresent()) {
            cxVar = ((C46180e) this.f102315b.get()).mo50251a();
        } else {
            cxVar = C60856cj.m92900i(false);
        }
        C60870cx cxVar3 = cxVar;
        return C47638k.m84753d(cxVar2, cxVar3).mo51520a(new C38755d(this, cxVar3, str, i, cxVar2), this.f102316c);
    }
}
