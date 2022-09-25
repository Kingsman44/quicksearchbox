package com.google.android.libraries.search.silk.p3162a.p3170h;

import android.content.Context;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.location.C38683aa;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.libraries.search.silk.p3183b.C40652f;
import com.google.android.libraries.silk.p3238b.C41742a;
import com.google.android.libraries.silk.p3238b.C41749b;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.silk.a.h.f */
/* compiled from: PG */
public final class C40580f {

    /* renamed from: a */
    public final Executor f106503a;

    /* renamed from: b */
    public final C21370a f106504b;

    /* renamed from: c */
    public final Context f106505c;

    /* renamed from: d */
    public final C40652f f106506d;

    /* renamed from: e */
    private final C38683aa f106507e;

    public C40580f(Executor executor, C21370a aVar, C38683aa aaVar, Context context, C40652f fVar) {
        this.f106503a = executor;
        this.f106504b = aVar;
        this.f106507e = aaVar;
        this.f106505c = context;
        this.f106506d = fVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C60870cx mo42531a(C39226b bVar, boolean z) {
        if (!z) {
            return C60856cj.m92899h(new C41742a(C41749b.m73222a("permission_denied", "No permission to access device location.")));
        }
        C60870cx d = this.f106507e.mo41550d(bVar, 2);
        C46459k.m82829b(d, "failed to get the GMSCore location", new Object[0]);
        return C60922j.m93044g(d, C47810es.m84963c(new C40577c(this)), this.f106503a);
    }
}
