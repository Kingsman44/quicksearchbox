package com.google.android.apps.search.assistant.platform.pcp.featuredata.p9334d;

import android.content.Context;
import com.google.android.gms.reminders.C145780i;
import com.google.android.gms.reminders.LoadRemindersOptions;
import com.google.android.libraries.p3339v.C43205e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.d.d */
/* compiled from: PG */
public final class C123886d implements C123883a {

    /* renamed from: a */
    public static final C59071e f342201a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.pcp.featuredata.d.d");

    /* renamed from: b */
    public final Context f342202b;

    /* renamed from: c */
    private final Executor f342203c;

    public C123886d(Context context, Executor executor) {
        this.f342202b = context;
        this.f342203c = executor;
    }

    /* renamed from: a */
    public final C60870cx mo106153a(Optional optional, LoadRemindersOptions loadRemindersOptions) {
        if (optional.isEmpty()) {
            return C60856cj.m92899h(new IllegalArgumentException("Reminders client not available."));
        }
        C60870cx b = C43205e.m76192b(((C145780i) optional.get()).mo121954d(loadRemindersOptions));
        C123885c cVar = new C123885c();
        return C60922j.m93045h(b, C47810es.m84966f(cVar), this.f342203c);
    }

    /* renamed from: b */
    public final Optional mo106154b(String str) {
        return Optional.ofNullable(str).map(new C123884b(this));
    }
}
