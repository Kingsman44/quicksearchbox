package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j;

import com.google.common.p4522b.C58485gu;
import p5304e.p5305a.p5306a.p5307a.p5308a.p5309a.p5310a.p5311a.p5312a.C68334g;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.j.cs */
/* compiled from: PG */
public final class C123052cs {

    /* renamed from: a */
    private C58485gu f340615a;

    /* renamed from: b */
    private final C68334g f340616b;

    public C123052cs(C68334g gVar) {
        this.f340616b = gVar;
    }

    /* renamed from: b */
    private static String m202385b(boolean z, String str) {
        return str + ":" + z;
    }

    /* renamed from: a */
    public final synchronized C58485gu mo105844a() {
        if (this.f340615a == null) {
            this.f340615a = C58485gu.m89848p(m202385b(this.f340616b.mo60336f(), "enable_long_lived_gallium"), m202385b(this.f340616b.mo60337g(), "invoke_annotators_from_pop"), m202385b(this.f340616b.mo60335e(), "enable_lifecycle_auto_prewarm"));
        }
        return this.f340615a;
    }
}
