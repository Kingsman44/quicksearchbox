package com.google.android.libraries.p11016ak.p11019c;

import com.google.android.libraries.p11016ak.C147620aa;
import com.google.android.libraries.p11016ak.C147631b;
import com.google.android.libraries.p11016ak.C147743y;
import com.google.android.libraries.p11016ak.p11018b.C147634c;
import com.google.android.libraries.p11016ak.p11019c.p11020a.C147638b;
import com.google.android.libraries.p11016ak.p11019c.p11020a.C147644h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.ScheduledExecutorService;
import p5285d.p5290b.p5291a.p5292a.C68193f;
import p5285d.p5290b.p5291a.p5292a.C68209v;

/* renamed from: com.google.android.libraries.ak.c.y */
/* compiled from: PG */
public final class C147701y implements C147638b {

    /* renamed from: a */
    public final C147644h f398607a;

    /* renamed from: b */
    public final C147634c f398608b;

    /* renamed from: c */
    public final C147636a f398609c;

    /* renamed from: d */
    public final C68193f f398610d;

    /* renamed from: e */
    private final C147620aa f398611e;

    /* renamed from: f */
    private final ScheduledExecutorService f398612f;

    public C147701y(C147620aa aaVar, ScheduledExecutorService scheduledExecutorService, C147644h hVar, C147634c cVar, C147743y yVar, String str, C68209v vVar, C68193f fVar) {
        this.f398611e = aaVar;
        this.f398612f = scheduledExecutorService;
        this.f398607a = hVar;
        this.f398608b = cVar;
        C147636a aVar = new C147636a(yVar, aaVar, str, vVar);
        this.f398609c = aVar;
        aVar.f398475a = C58833ax.m90834k(fVar);
        this.f398610d = fVar;
    }

    /* renamed from: a */
    public final C147631b mo124386a() {
        return this.f398607a.mo124390a(this.f398610d.f184520f);
    }

    /* renamed from: b */
    public final C60870cx mo124387b(int i, int i2) {
        C60870cx c = mo124388c(i);
        C147700x xVar = new C147700x(i2);
        return C60922j.m93044g(c, C47810es.m84963c(xVar), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final C60870cx mo124388c(int i) {
        return C147693q.m240768a(this.f398611e.f398437b, new C147698v(this, i), this.f398612f);
    }
}
