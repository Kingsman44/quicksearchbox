package com.google.android.apps.gsa.staticplugins.accl.p7334d;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.android.libraries.search.assistant.invocation.p2587a.p2588a.C33483a;
import com.google.android.libraries.search.assistant.invocation.p2587a.p2588a.C33484b;
import com.google.android.libraries.search.assistant.performer.p2728a.C35473i;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.d.i */
/* compiled from: PG */
public final class C92827i implements C35473i {

    /* renamed from: a */
    public static final C59071e f259012a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.accl.d.i");

    /* renamed from: b */
    public final Context f259013b;

    /* renamed from: c */
    private final C86034c f259014c;

    /* renamed from: d */
    private final C60887da f259015d;

    /* renamed from: com.google.android.apps.gsa.staticplugins.accl.d.i$a */
    /* compiled from: PG */
    public interface C92828a {
        /* renamed from: eY */
        C33483a mo87469eY();
    }

    public C92827i(Context context, C86034c cVar, C60887da daVar) {
        this.f259013b = context;
        this.f259014c = cVar;
        this.f259015d = daVar;
    }

    /* renamed from: a */
    public final C60870cx mo20099a(Intent intent) {
        C60870cx b = this.f259014c.mo79697b();
        C92823e eVar = new C92823e(this);
        return C47633f.m84733g(C60922j.m93044g(b, C47810es.m84963c(eVar), this.f259015d)).mo51516i(new C92824f(intent), this.f259015d).mo51515h(C92825g.f259010a, this.f259015d).mo51513e(C33484b.class, C92826h.f259011a, this.f259015d);
    }
}
