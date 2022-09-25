package com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s;

import com.google.android.apps.search.assistant.surfaces.dictation.service.p9484v.C126370c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protos.p5124m.p5125a.C65603f;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.s.av */
/* compiled from: PG */
public final class C126313av {

    /* renamed from: b */
    private static final C59071e f347971b = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.dictation.service.s.av");

    /* renamed from: a */
    public final long f347972a;

    /* renamed from: c */
    private final boolean f347973c;

    /* renamed from: d */
    private final C126370c f347974d;

    /* renamed from: e */
    private final C65603f f347975e;

    public C126313av(C65603f fVar, long j, boolean z, C126370c cVar) {
        this.f347972a = j;
        this.f347973c = z;
        this.f347974d = cVar;
        this.f347975e = fVar;
    }

    /* renamed from: a */
    public final boolean mo107524a(Locale locale) {
        if (this.f347972a == 1) {
            ((C59052c) ((C59052c) f347971b.mo56224b()).mo56372aa(37011)).mo56386p("NlufService is disabled [SD]");
            return false;
        } else if (!this.f347975e.f178307a.contains(locale.toLanguageTag())) {
            ((C59052c) ((C59052c) f347971b.mo56224b()).mo56372aa(37010)).mo56354G("NlufService unsupported locale: %s, we support only %s [SD]", locale.toLanguageTag(), this.f347975e.f178307a);
            return false;
        } else if (this.f347973c || !this.f347974d.f348068c.get()) {
            ((C59052c) ((C59052c) f347971b.mo56224b()).mo56372aa(37008)).mo56388r("NlufService is enabled, nluf_usage_mode=%s [SD]", this.f347972a);
            return true;
        } else {
            ((C59052c) ((C59052c) f347971b.mo56224b()).mo56372aa(37009)).mo56386p("NlufService is disabled for Work Profile [SD]");
            return false;
        }
    }
}
