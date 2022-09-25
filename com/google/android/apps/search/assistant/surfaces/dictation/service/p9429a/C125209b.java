package com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125072b;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.a.b */
/* compiled from: PG */
public final /* synthetic */ class C125209b implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C125209b f345371a = new C125209b();

    private /* synthetic */ C125209b() {
    }

    public final Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        if (th instanceof TimeoutException) {
            ((C59052c) ((C59052c) C125255k.f345530a.mo56226d()).mo56372aa(36425)).mo56386p("Wrapped AiAi availability check timed out. [SD]");
            return C125072b.AIAI_UNAVAILABLE_TIMEOUT;
        }
        ((C59052c) ((C59052c) ((C59052c) C125255k.f345530a.mo56226d()).mo56382g(th)).mo56372aa(36424)).mo56386p("Wrapped AiAi availability check failed. [SD]");
        return C125072b.AIAI_UNAVAILABLE_REASON_UNKNOWN;
    }
}
