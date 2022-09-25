package com.google.android.apps.search.assistant.surfaces.dictation.service.formatter;

import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.ai */
/* compiled from: PG */
public final /* synthetic */ class C125473ai implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Locale f346017a;

    public /* synthetic */ C125473ai(Locale locale) {
        this.f346017a = locale;
    }

    public final Object apply(Object obj) {
        Locale locale = this.f346017a;
        C59052c cVar = (C59052c) ((C59052c) C125476al.f346020a.mo56225c()).mo56382g((TimeoutException) obj);
        cVar.mo56374ac(1, TimeUnit.MINUTES);
        ((C59052c) cVar.mo56372aa(36591)).mo56389s("Loading formatter for %s timed out. [SD]", locale);
        return new C125496be(locale);
    }
}
