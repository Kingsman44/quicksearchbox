package com.google.android.libraries.search.location;

import android.content.Context;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.libraries.p3339v.C43205e;
import com.google.android.libraries.search.location.p3029a.p3032c.C38636a;
import com.google.android.libraries.search.location.p3029a.p3032c.p3033a.C38647k;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.location.u */
/* compiled from: PG */
public final class C38715u implements C38713s {

    /* renamed from: a */
    public final Context f102233a;

    /* renamed from: b */
    public final C38636a f102234b;

    /* renamed from: c */
    private final Optional f102235c;

    /* renamed from: d */
    private final C38683aa f102236d;

    public C38715u(C38636a aVar, Optional optional, C38683aa aaVar, Context context) {
        this.f102234b = aVar;
        this.f102235c = optional;
        this.f102236d = aaVar;
        this.f102233a = context;
    }

    /* renamed from: a */
    public final C60870cx mo41567a(GeofencingRequest geofencingRequest, C38716v vVar, C39226b bVar) {
        if (!this.f102235c.isPresent() || ((C38647k) this.f102235c.get()).mo41540a(vVar)) {
            return C47633f.m84733g(this.f102236d.mo41547a()).mo51516i(new C38714t(this, bVar, geofencingRequest, vVar), C60826bg.f164896a);
        }
        return C60856cj.m92899h(new IllegalArgumentException("unknown PendingIntentProvider"));
    }

    /* renamed from: b */
    public final C60870cx mo41568b(List list, C39226b bVar) {
        return C43205e.m76192b(this.f102234b.mo41529c(bVar).mo120369c(list));
    }
}
