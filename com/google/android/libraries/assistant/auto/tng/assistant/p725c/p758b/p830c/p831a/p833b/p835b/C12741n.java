package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p835b;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p855d.p856a.C12875h;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1324b.C16838d;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1324b.C16840f;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1324b.C16844j;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.search.assistant.performer.deviceactions.C35881aj;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52097fc;
import com.google.assistant.p3897e.p3921j.C52098fd;
import com.google.assistant.p3897e.p3921j.C52107fm;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.b.n */
/* compiled from: PG */
public final class C12741n extends C22538o {

    /* renamed from: a */
    public static final C59071e f39860a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.b.n");

    /* renamed from: b */
    private static final C58485gu f39861b = C58485gu.m89847o("test_drive_record_consent", "test_drive_query_counter");

    /* renamed from: c */
    private final C35881aj f39862c;

    /* renamed from: d */
    private final C16844j f39863d;

    /* renamed from: e */
    private final boolean f39864e;

    /* renamed from: f */
    private final Executor f39865f;

    public C12741n(C35881aj ajVar, C16844j jVar, boolean z, Executor executor) {
        this.f39862c = ajVar;
        this.f39863d = jVar;
        this.f39864e = z;
        this.f39865f = executor;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        C51807dw dwVar = dyVar.f135938d;
        if (dwVar == null) {
            dwVar = C51807dw.f135930b;
        }
        Optional b = C12875h.m29134b(dwVar, "get_device_settings_args", C52097fc.f136720f.getParserForType());
        if (this.f39864e && "device.GET_SETTINGS".equals(dyVar.f135936b) && !b.isEmpty()) {
            Stream stream = Collection.EL.stream(((C52097fc) b.get()).f136724c);
            C58485gu guVar = f39861b;
            Objects.requireNonNull(guVar);
            if (stream.anyMatch(new C12740m(guVar))) {
                C16844j jVar = this.f39863d;
                C60870cx d = jVar.f49304a.mo46042d();
                C16840f fVar = new C16840f(jVar);
                C60870cx g = C60922j.m93044g(d, C47810es.m84963c(fVar), jVar.f49305b);
                C16844j jVar2 = this.f39863d;
                C60870cx d2 = jVar2.f49304a.mo46042d();
                C16838d dVar = C16838d.f49298a;
                C60870cx g2 = C60922j.m93044g(d2, C47810es.m84963c(dVar), jVar2.f49305b);
                return C47638k.m84753d(g, g2).mo51520a(new C12739l((C52097fc) b.get(), g, g2, (C52098fd) C52107fm.f136742d.createBuilder()), this.f39865f);
            }
        }
        return this.f39862c.mo20766a(dyVar);
    }
}
