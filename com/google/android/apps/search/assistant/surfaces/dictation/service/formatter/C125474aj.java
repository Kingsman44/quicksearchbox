package com.google.android.apps.search.assistant.surfaces.dictation.service.formatter;

import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.aj */
/* compiled from: PG */
public final /* synthetic */ class C125474aj implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Locale f346018a;

    public /* synthetic */ C125474aj(Locale locale) {
        this.f346018a = locale;
    }

    public final Object apply(Object obj) {
        Locale locale = this.f346018a;
        C59052c cVar = (C59052c) ((C59052c) C125476al.f346020a.mo56225c()).mo56382g((Exception) obj);
        cVar.mo56374ac(1, TimeUnit.MINUTES);
        ((C59052c) cVar.mo56372aa(36592)).mo56389s("Loading formatter for %s failed. [SD]", locale);
        return new C125496be(locale);
    }
}
