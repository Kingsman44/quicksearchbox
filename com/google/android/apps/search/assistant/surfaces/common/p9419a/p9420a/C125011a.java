package com.google.android.apps.search.assistant.surfaces.common.p9419a.p9420a;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119898q;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119899r;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119900s;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119902u;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119903v;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119904w;

/* renamed from: com.google.android.apps.search.assistant.surfaces.common.a.a.a */
/* compiled from: PG */
public final class C125011a {
    /* renamed from: a */
    public static String m204943a(C119904w wVar) {
        C119903v vVar;
        C119899r rVar;
        int i = wVar.f333911a;
        int b = C119900s.m198775b(i);
        int i2 = b - 1;
        if (b == 0) {
            throw null;
        } else if (i2 == 0) {
            return "idle";
        } else {
            if (i2 != 1) {
                return i2 != 2 ? "UNKNOWN" : "(empty)";
            }
            if (i == 2) {
                vVar = (C119903v) wVar.f333912b;
            } else {
                vVar = C119903v.f333904d;
            }
            int i3 = vVar.f333906a;
            int a = C119902u.m198776a(i3);
            int i4 = a - 1;
            if (a == 0) {
                throw null;
            } else if (i4 == 0) {
                if (i3 == 1) {
                    rVar = (C119899r) vVar.f333907b;
                } else {
                    rVar = C119899r.f333900c;
                }
                int a2 = C119898q.m198773a(rVar.f333902a);
                int i5 = a2 - 1;
                if (a2 == 0) {
                    throw null;
                } else if (i5 == 0) {
                    return "opening_microphone";
                } else {
                    if (i5 == 1) {
                        return "waiting_for_speech";
                    }
                    if (i5 == 2) {
                        return "user_speaking";
                    }
                    if (i5 != 3) {
                        return "UNKNOWN";
                    }
                    return "listening";
                }
            } else if (i4 == 1) {
                return "thinking";
            } else {
                if (i4 != 2) {
                    return i4 != 3 ? "UNKNOWN" : "working";
                }
                return "executing";
            }
        }
    }
}
