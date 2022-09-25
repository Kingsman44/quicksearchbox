package com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import java.util.Locale;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.au */
/* compiled from: PG */
public final class C125668au implements C125687t {

    /* renamed from: a */
    private static final C59071e f346344a = C59071e.m91331h();

    /* renamed from: b */
    private final Locale f346345b;

    public C125668au(Locale locale) {
        C69664n.m101061g(locale, "locale");
        this.f346345b = locale;
    }

    /* renamed from: a */
    public final Object mo107043a(String str, C69577g gVar) {
        C59052c cVar = (C59052c) f346344a.mo56226d();
        Locale locale = this.f346345b;
        cVar.mo56379ah(new C59094n(36639));
        cVar.mo56389s("Can't fulfill for unsupported locale: %s [SD]", locale);
        return null;
    }
}
