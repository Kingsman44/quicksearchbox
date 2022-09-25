package com.google.android.libraries.assistant.auto.tng.p945f.p962d.p981b.p982a;

import android.content.Context;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13533i;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p971c.p972a.C13463a;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p981b.C13547a;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p981b.C13557b;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.d.b.a.i */
/* compiled from: PG */
public final class C13556i implements C13547a {

    /* renamed from: a */
    public static final C59071e f41523a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.f.d.b.a.i");

    /* renamed from: b */
    public final C13557b f41524b;

    /* renamed from: c */
    public final C13533i f41525c;

    /* renamed from: d */
    public final Executor f41526d;

    /* renamed from: e */
    public final Context f41527e;

    /* renamed from: f */
    public final C15481g f41528f;

    /* renamed from: g */
    private final C13463a f41529g;

    /* renamed from: h */
    private final C47632e f41530h = new C47632e();

    public C13556i(C13557b bVar, C13533i iVar, C13463a aVar, Executor executor, Context context, C15481g gVar) {
        this.f41524b = bVar;
        this.f41525c = iVar;
        this.f41529g = aVar;
        this.f41526d = executor;
        this.f41527e = context;
        this.f41528f = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo21163a() {
        return this.f41530h.mo51512b(new C13555h(this), this.f41526d);
    }

    /* renamed from: b */
    public final C60870cx mo21164b() {
        return this.f41530h.mo51512b(new C13548a(this), this.f41526d);
    }

    /* renamed from: c */
    public final C60870cx mo21165c() {
        if (!this.f41529g.mo21103c()) {
            C58976aa aaVar = C58975e.f156826a;
            this.f41529g.mo21102b();
        }
        return C60866ct.f164955a;
    }

    /* renamed from: d */
    public final C60870cx mo21166d(C60870cx cxVar) {
        return this.f41530h.mo51512b(new C13553f(this, cxVar), this.f41526d);
    }
}
