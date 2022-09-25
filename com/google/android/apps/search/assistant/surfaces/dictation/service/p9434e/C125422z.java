package com.google.android.apps.search.assistant.surfaces.dictation.service.p9434e;

import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119297s;
import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119299u;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4763a.p4767b.p4768a.p4769a.p4770a.p4771a.C63122a;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.e.z */
/* compiled from: PG */
public final class C125422z {

    /* renamed from: a */
    public final /* synthetic */ C125374ab f345896a;

    public C125422z(C125374ab abVar) {
        this.f345896a = abVar;
    }

    /* renamed from: a */
    public final C60870cx mo106967a(C119297s sVar) {
        C63122a aVar = C63122a.SUCCESS_STOPPED_UNKNOWN;
        C119297s sVar2 = C119297s.REQUESTER_UNKNOWN;
        switch (sVar.ordinal()) {
            case 0:
            case 10:
                aVar = C63122a.SUCCESS_STOPPED_UNKNOWN;
                break;
            case 1:
            case 2:
                aVar = C63122a.SUCCESS_KEYBOARD_STOP_REQUEST;
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
                aVar = C63122a.SUCCESS_ASSISTANT_STOP_REQUEST;
                break;
            case 7:
                aVar = C63122a.SUCCESS_VOICE_STOP_REQUEST;
                break;
            case 8:
                aVar = C63122a.SUCCESS_STOPPED_SHUTDOWN;
                break;
        }
        this.f345896a.f345791j.mo107426y(sVar);
        return this.f345896a.mo106939b(aVar);
    }

    /* renamed from: b */
    public final C60870cx mo106968b(C63122a aVar) {
        if (C63122a.SUCCESS_SEND.equals(aVar)) {
            this.f345896a.f345785d.mo107147b();
        }
        if (C63122a.SUCCESS_SEARCH.equals(aVar)) {
            this.f345896a.f345785d.mo107148c();
        }
        if (!this.f345896a.f345793l.mo107510c().equals(C119299u.STICKY)) {
            return this.f345896a.mo106939b(aVar);
        }
        return C60866ct.f164955a;
    }
}
