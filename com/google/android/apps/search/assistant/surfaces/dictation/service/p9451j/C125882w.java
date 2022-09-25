package com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j;

import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119277am;
import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119297s;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9434e.C125422z;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.j.w */
/* compiled from: PG */
public final /* synthetic */ class C125882w implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C125884y f346945a;

    /* renamed from: b */
    public final /* synthetic */ C119277am f346946b;

    public /* synthetic */ C125882w(C125884y yVar, C119277am amVar) {
        this.f346945a = yVar;
        this.f346946b = amVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C125884y yVar = this.f346945a;
        C119277am amVar = this.f346946b;
        C125422z zVar = (C125422z) yVar.f346952e.get();
        if (zVar == null) {
            ((C59052c) ((C59052c) C125884y.f346948a.mo56226d()).mo56372aa(36688)).mo56386p("Ignoring StopDictationRequest: no dictation to stop. [SD]");
            return C60866ct.f164955a;
        }
        C119297s a = C119297s.m197993a(amVar.f332626a);
        if (a == null) {
            a = C119297s.UNRECOGNIZED;
        }
        return zVar.mo106967a(a);
    }
}
