package com.google.android.apps.gsa.staticplugins.bisto.util;

import android.accounts.Account;
import com.google.android.apps.gsa.shared.bisto.p7029b.C89643n;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.util.bi */
/* compiled from: PG */
public final /* synthetic */ class C96478bi implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C96482bm f269923a;

    /* renamed from: b */
    public final /* synthetic */ String f269924b;

    public /* synthetic */ C96478bi(C96482bm bmVar, String str) {
        this.f269923a = bmVar;
        this.f269924b = str;
    }

    public final Object apply(Object obj) {
        int i;
        C96482bm bmVar = this.f269923a;
        String str = this.f269924b;
        C124548d dVar = (C124548d) obj;
        Account a = bmVar.f269935d.mo79668a();
        if (!C89643n.m145916a(dVar)) {
            C59104x b = C96482bm.f269932a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "VoiceMatchHelperSP");
            ((C59052c) ((C59052c) b).mo56372aa(17242)).mo56386p("Hotword: Unavailable device unsupported");
            i = 1;
        } else {
            if (!C89643n.m145920e(dVar)) {
                if (!bmVar.mo90177e(str, dVar)) {
                    C59104x b2 = C96482bm.f269932a.mo56224b();
                    b2.mo56378ag(C58975e.f156826a, "VoiceMatchHelperSP");
                    ((C59052c) ((C59052c) b2).mo56372aa(17241)).mo56386p("Hotword: Unavailable unsupported first stage model on non-voicematch device.");
                    i = 2;
                } else if (C89643n.m145918c(dVar, a) || C89643n.m145919d(dVar)) {
                    C59104x b3 = C96482bm.f269932a.mo56224b();
                    b3.mo56378ag(C58975e.f156826a, "VoiceMatchHelperSP");
                    ((C59052c) ((C59052c) b3).mo56372aa(17239)).mo56386p("Hotword: Available for non-voicematch device.");
                    i = 0;
                } else {
                    C59104x b4 = C96482bm.f269932a.mo56224b();
                    b4.mo56378ag(C58975e.f156826a, "VoiceMatchHelperSP");
                    ((C59052c) ((C59052c) b4).mo56372aa(17240)).mo56386p("Hotword: Unavailable no user consent");
                }
            } else if (!bmVar.mo90177e(str, dVar)) {
                C59104x b5 = C96482bm.f269932a.mo56224b();
                b5.mo56378ag(C58975e.f156826a, "VoiceMatchHelperSP");
                ((C59052c) ((C59052c) b5).mo56372aa(17238)).mo56386p("Hotword: Unavailable unsupported first stage model");
                i = 2;
            } else {
                C59104x b6 = C96482bm.f269932a.mo56224b();
                b6.mo56378ag(C58975e.f156826a, "VoiceMatchHelperSP");
                ((C59052c) ((C59052c) b6).mo56372aa(17250)).mo56389s("Locale: %s ", str);
                if (str == null) {
                    C59104x c = C96482bm.f269932a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "VoiceMatchHelperSP");
                    ((C59052c) ((C59052c) c).mo56372aa(17252)).mo56386p("preferred assistant language not found!");
                } else {
                    boolean v = bmVar.f269933b.mo87248v();
                    C59104x b7 = C96482bm.f269932a.mo56224b();
                    b7.mo56378ag(C58975e.f156826a, "VoiceMatchHelperSP");
                    ((C59052c) ((C59052c) b7).mo56372aa(17251)).mo56389s("isSpeakerIdSupported: %b", Boolean.valueOf(v));
                    if (v) {
                        if (!bmVar.f269933b.mo87247u() && !dVar.mo106526x().f386153f) {
                            C59104x b8 = C96482bm.f269932a.mo56224b();
                            b8.mo56378ag(C58975e.f156826a, "VoiceMatchHelperSP");
                            ((C59052c) ((C59052c) b8).mo56372aa(17236)).mo56386p("Hotword: Unavailable requires speaker id enrollment");
                            i = 5;
                        } else if (!C89643n.m145918c(dVar, a)) {
                            C59104x b9 = C96482bm.f269932a.mo56224b();
                            b9.mo56378ag(C58975e.f156826a, "VoiceMatchHelperSP");
                            ((C59052c) ((C59052c) b9).mo56372aa(17235)).mo56386p("Hotword: Unavailable no user consent");
                        } else {
                            C59104x b10 = C96482bm.f269932a.mo56224b();
                            b10.mo56378ag(C58975e.f156826a, "VoiceMatchHelperSP");
                            ((C59052c) ((C59052c) b10).mo56372aa(17234)).mo56386p("Hotword: Hotwording Available");
                            i = 0;
                        }
                    }
                }
                C59104x b11 = C96482bm.f269932a.mo56224b();
                b11.mo56378ag(C58975e.f156826a, "VoiceMatchHelperSP");
                ((C59052c) ((C59052c) b11).mo56372aa(17237)).mo56386p("Hotword: Unavailable locale unsupported");
                i = 6;
            }
            i = 4;
        }
        return Integer.valueOf(i);
    }
}
