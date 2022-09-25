package com.google.android.libraries.search.assistant.p2786t.p2798c.p2799a;

import android.content.Context;
import com.google.android.libraries.search.assistant.p2786t.p2798c.C36608k;
import com.google.android.libraries.search.assistant.p2786t.p2798c.C36609l;
import com.google.android.libraries.search.assistant.p2786t.p2798c.p2799a.p2800a.C36532d;
import com.google.android.libraries.search.assistant.p2786t.p2798c.p2799a.p2800a.C36546r;
import com.google.android.libraries.search.assistant.p2786t.p2798c.p2799a.p2800a.C36548t;
import com.google.android.libraries.search.assistant.p2786t.p2798c.p2799a.p2800a.C36552x;
import com.google.android.libraries.search.assistant.p2786t.p2798c.p2799a.p2800a.C36554z;
import com.google.android.libraries.search.assistant.p2786t.p2801d.p2802a.C36619a;
import com.google.android.libraries.search.assistant.p2786t.p2801d.p2802a.C36623e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60904dr;
import java.util.EnumMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import p3186j$.time.Duration;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.search.assistant.t.c.a.s */
/* compiled from: PG */
final class C36591s extends C36532d {

    /* renamed from: a */
    public static final C59071e f95415a = C59071e.m91332i("com.google.android.libraries.search.assistant.t.c.a.s");

    /* renamed from: b */
    static final long f95416b = Duration.ofSeconds(5).toMillis();

    /* renamed from: c */
    public final Context f95417c;

    /* renamed from: d */
    public final Map f95418d;

    /* renamed from: e */
    public final C36558ad f95419e;

    /* renamed from: f */
    public final C60888db f95420f;

    /* renamed from: g */
    public final Executor f95421g;

    /* renamed from: h */
    public final Map f95422h = new EnumMap(C36609l.class);

    /* renamed from: i */
    private final C36623e f95423i;

    public C36591s(Context context, Map map, C36558ad adVar, C36623e eVar, C60888db dbVar) {
        this.f95417c = context;
        this.f95418d = map;
        this.f95419e = adVar;
        this.f95423i = eVar;
        this.f95420f = dbVar;
        this.f95421g = new C60904dr(dbVar);
    }

    /* renamed from: c */
    public final void mo40214c(C36552x xVar, C70862aj ajVar) {
        if ((xVar.f95341a & 1) != 0) {
            C47633f i = this.f95423i.mo40236a().mo51516i(new C36584l(this, xVar), this.f95420f);
            C36554z zVar = C36554z.f95343a;
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            C36608k kVar = xVar.f95342b;
            if (kVar == null) {
                kVar = C36608k.f95440d;
            }
            C36609l a = C36609l.m65137a(kVar.f95443b);
            if (a == null) {
                a = C36609l.UNRECOGNIZED;
            }
            objArr[0] = Integer.valueOf(a.getNumber());
            C36590r rVar = new C36590r(String.format(locale, "Unregistering observer %d", objArr), ajVar, zVar);
            C60856cj.m92911t(i.f164926b, C47810es.m84974n(rVar), this.f95420f);
            return;
        }
        ajVar.mo20122b(new IllegalArgumentException("No observer config provided"));
    }

    /* renamed from: b */
    public final void mo40213b(C36546r rVar, C70862aj ajVar) {
        if ((rVar.f95331a & 1) == 0) {
            ajVar.mo20122b(new IllegalArgumentException("No observer config provided"));
        } else if (!C36619a.m65149e(this.f95417c)) {
            ajVar.mo20122b(new IllegalStateException("Notification access not granted."));
        } else {
            C36619a.m65147c(this.f95417c);
            C47633f i = this.f95423i.mo40236a().mo51516i(new C36583k(this, rVar), this.f95420f);
            C36548t tVar = C36548t.f95333a;
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            C36608k kVar = rVar.f95332b;
            if (kVar == null) {
                kVar = C36608k.f95440d;
            }
            C36609l a = C36609l.m65137a(kVar.f95443b);
            if (a == null) {
                a = C36609l.UNRECOGNIZED;
            }
            objArr[0] = Integer.valueOf(a.getNumber());
            C36590r rVar2 = new C36590r(String.format(locale, "Registering observer %d", objArr), ajVar, tVar);
            C60856cj.m92911t(i.f164926b, C47810es.m84974n(rVar2), this.f95420f);
        }
    }
}
