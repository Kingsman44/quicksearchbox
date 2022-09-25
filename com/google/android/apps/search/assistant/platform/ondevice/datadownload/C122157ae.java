package com.google.android.apps.search.assistant.platform.ondevice.datadownload;

import com.google.android.libraries.assistant.p1363c.p1371b.p1379f.C17136an;
import com.google.android.libraries.assistant.p1363c.p1371b.p1379f.C17160w;
import com.google.android.libraries.mdi.C29690f;
import com.google.assistant.p3793ae.p3794a.C48769a;
import com.google.assistant.p3793ae.p3794a.C48770b;
import com.google.common.base.C58817ah;
import java.util.Locale;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.ae */
/* compiled from: PG */
public final /* synthetic */ class C122157ae implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C122165am f338824a;

    /* renamed from: b */
    public final /* synthetic */ Locale f338825b;

    /* renamed from: c */
    public final /* synthetic */ C29690f f338826c;

    public /* synthetic */ C122157ae(C122165am amVar, Locale locale, C29690f fVar) {
        this.f338824a = amVar;
        this.f338825b = locale;
        this.f338826c = fVar;
    }

    public final Object apply(Object obj) {
        C122165am amVar = this.f338824a;
        Locale locale = this.f338825b;
        C29690f fVar = this.f338826c;
        Optional optional = (Optional) obj;
        if (!C17136an.m34279n(optional, locale, C17136an.m34275j(amVar.f338840e))) {
            return Optional.empty();
        }
        if (!C17160w.m34310a(fVar, locale)) {
            return Optional.empty();
        }
        C48769a aVar = (C48769a) C48770b.f126194c.createBuilder();
        C29690f c = C17136an.m34268c(fVar);
        aVar.copyOnWrite();
        c.getClass();
        ((C48770b) aVar.instance).f126196a = c;
        Objects.requireNonNull(aVar);
        optional.ifPresent(new C122155ac(aVar));
        return Optional.m71637of((C48770b) aVar.build());
    }
}
