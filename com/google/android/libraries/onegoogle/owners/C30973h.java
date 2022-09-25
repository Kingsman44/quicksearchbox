package com.google.android.libraries.onegoogle.owners;

import android.content.Context;
import com.google.android.p10905k.C146602a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60895di;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.libraries.onegoogle.owners.h */
/* compiled from: PG */
public final class C30973h implements C30969d {

    /* renamed from: a */
    public static final String[] f83455a = {C146602a.m238836a("googleone")};

    /* renamed from: b */
    public final Context f83456b;

    /* renamed from: c */
    public final C60887da f83457c;

    public C30973h(Context context, ExecutorService executorService) {
        this.f83456b = context;
        this.f83457c = C60895di.m92995a(executorService);
    }

    /* renamed from: a */
    public final C60870cx mo36668a() {
        C30971f fVar = new C30971f(this);
        return C60856cj.m92904m(C47810es.m84978r(fVar), this.f83457c);
    }
}
