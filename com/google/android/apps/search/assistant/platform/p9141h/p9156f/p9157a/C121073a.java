package com.google.android.apps.search.assistant.platform.p9141h.p9156f.p9157a;

import com.google.android.apps.search.assistant.platform.p9141h.p9156f.p9158b.C121091a;
import com.google.android.apps.search.assistant.platform.p9141h.p9156f.p9158b.C121092b;
import com.google.common.base.C58817ah;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.search.assistant.platform.h.f.a.a */
/* compiled from: PG */
public final /* synthetic */ class C121073a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ AtomicBoolean f336480a;

    /* renamed from: b */
    public final /* synthetic */ Locale f336481b;

    public /* synthetic */ C121073a(AtomicBoolean atomicBoolean, Locale locale) {
        this.f336480a = atomicBoolean;
        this.f336481b = locale;
    }

    public final Object apply(Object obj) {
        AtomicBoolean atomicBoolean = this.f336480a;
        Locale locale = this.f336481b;
        C121092b bVar = (C121092b) obj;
        atomicBoolean.set(!bVar.f336507b.equals(locale.toLanguageTag()));
        C121091a aVar = (C121091a) bVar.toBuilder();
        String languageTag = locale.toLanguageTag();
        aVar.copyOnWrite();
        C121092b bVar2 = (C121092b) aVar.instance;
        languageTag.getClass();
        bVar2.f336506a |= 1;
        bVar2.f336507b = languageTag;
        return (C121092b) aVar.build();
    }
}
