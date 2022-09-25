package com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8588i;

import com.google.common.p4580v.C60950i;
import com.google.common.p4580v.C60951j;
import dagger.C68214a;
import p3186j$.time.ZoneId;
import p3186j$.time.format.DateTimeFormatter;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.i.a */
/* compiled from: PG */
public final class C113497a {

    /* renamed from: a */
    private final ZoneId f314249a;

    /* renamed from: b */
    private final DateTimeFormatter f314250b;

    /* renamed from: c */
    private final C68214a f314251c;

    public C113497a(C68214a aVar) {
        ZoneId zoneId = C60951j.f165070a;
        this.f314249a = zoneId;
        this.f314250b = DateTimeFormatter.ofPattern("HH:mm:ss.SSS").withZone(zoneId);
        this.f314251c = aVar;
    }

    /* renamed from: a */
    public final String mo100249a() {
        return ((C60950i) this.f314251c.mo27525b()).mo57444a().atZone(this.f314249a).format(this.f314250b);
    }
}
