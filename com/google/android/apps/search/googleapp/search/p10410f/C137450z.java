package com.google.android.apps.search.googleapp.search.p10410f;

import com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138787x;
import com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138788y;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.googleapp.search.f.z */
/* compiled from: PG */
final class C137450z extends C69665o implements C69626l {

    /* renamed from: a */
    public static final C137450z f373850a = new C137450z();

    public C137450z() {
        super(1);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        C138788y yVar = (C138788y) obj;
        C69664n.m101061g(yVar, "it");
        int b = C138787x.m225440b(yVar.f377534b);
        if (b != 0) {
            switch (b) {
                case 2:
                    return "DEFAULT";
                case 3:
                    return "LISTENING";
                case 4:
                    return "USER_SPEAKING";
                case 5:
                    return "THINKING";
                case 6:
                    return "OPENING_SEARCH";
                case 7:
                    return "OPENING_ASSISTANT";
                case 8:
                    return "NUDGE";
                case 9:
                    return "ERROR_MESSAGE_NOT_RECOGNIZED";
                case 10:
                    return "ERROR_MESSAGE_NOT_CONNECTED";
                case 11:
                    return "ERROR_DISMISS_VOICE_PLATE";
                case 12:
                    return "COMPLETED_OPENING_SRP";
            }
        }
        return "UNRECOGNIZED";
    }
}
