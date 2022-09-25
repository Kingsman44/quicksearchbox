package com.google.android.apps.search.assistant.platform.ondevice.datadownload;

import com.google.android.libraries.mdi.download.C28805ct;
import com.google.common.base.C58817ah;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.u */
/* compiled from: PG */
public final /* synthetic */ class C122375u implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C122165am f339284a;

    /* renamed from: b */
    public final /* synthetic */ Locale f339285b;

    /* renamed from: c */
    public final /* synthetic */ C28805ct f339286c;

    public /* synthetic */ C122375u(C122165am amVar, Locale locale, C28805ct ctVar) {
        this.f339284a = amVar;
        this.f339285b = locale;
        this.f339286c = ctVar;
    }

    public final Object apply(Object obj) {
        C122165am amVar = this.f339284a;
        Locale locale = this.f339285b;
        C28805ct ctVar = this.f339286c;
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            amVar.f338841f.mo105547b(locale, ctVar.mo34454c());
        }
        return optional;
    }
}
