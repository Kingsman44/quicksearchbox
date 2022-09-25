package com.google.android.apps.search.assistant.platform.pcp.p9327d;

import android.content.Context;
import androidx.core.content.C1882h;
import com.google.android.apps.search.assistant.platform.pcp.p9328e.C123701a;
import com.google.android.libraries.search.location.C38683aa;
import com.google.apps.tiktok.account.data.p3613b.C46180e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.d.i */
/* compiled from: PG */
public final class C123700i implements C123695e {

    /* renamed from: a */
    public final Context f341671a;

    /* renamed from: b */
    public final C60887da f341672b;

    /* renamed from: c */
    public final Executor f341673c;

    /* renamed from: d */
    public final C123701a f341674d;

    /* renamed from: e */
    public final C38683aa f341675e;

    /* renamed from: f */
    private final C46180e f341676f;

    public C123700i(Context context, C60887da daVar, Executor executor, C123701a aVar, C46180e eVar, C38683aa aaVar) {
        this.f341671a = context;
        this.f341672b = daVar;
        this.f341673c = executor;
        this.f341674d = aVar;
        this.f341676f = eVar;
        this.f341675e = aaVar;
    }

    /* renamed from: a */
    public final C60870cx mo106104a(boolean z) {
        if (z && C1882h.m5137c(this.f341671a, "android.permission.ACCESS_BACKGROUND_LOCATION") == -1) {
            return C60856cj.m92900i(false);
        }
        C60870cx a = this.f341676f.mo50251a();
        C123698g gVar = new C123698g(this);
        return C60922j.m93045h(a, C47810es.m84966f(gVar), this.f341673c);
    }
}
