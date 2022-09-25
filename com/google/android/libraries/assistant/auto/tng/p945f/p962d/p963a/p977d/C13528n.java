package com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d;

import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13461c;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13529e;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13530f;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13539o;
import com.google.common.base.C58827ar;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58597ky;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.d.a.d.n */
/* compiled from: PG */
public final class C13528n {

    /* renamed from: a */
    private static final C58495hd f41461a = C58495hd.m89907u(C13529e.UNKNOWN_TYPE, "UNKNOWN_TYPE", C13529e.TEXT_REPLY, "TEXT_REPLY", C13529e.EMOJI_REPLY, "EMOJI_REPLY", C13529e.SHARE_LOCATION, "SHARE_LOCATION", C13529e.SHARE_ETA, "SHARE_ETA", C13529e.NAVIGATE, "NAVIGATE", C13529e.CALL_SENDER, "CALL_SENDER", C13529e.CALL_NUMBER, "CALL_NUMBER");

    /* renamed from: b */
    private static final C58495hd f41462b = C58495hd.m89902p(C13461c.UNKNOWN_SOURCE, "UNKNOWN_SOURCE", C13461c.HEURISTIC, "HEURISTIC", C13461c.TC_LIB, "TC_LIB");

    /* renamed from: a */
    public static C13539o m29810a(List list) {
        C13539o oVar = (C13539o) list.get(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C13539o oVar2 = (C13539o) it.next();
            if (oVar2.f41490b > oVar.f41490b) {
                oVar = oVar2;
            }
        }
        return oVar;
    }

    /* renamed from: b */
    public static String m29811b(C13530f fVar) {
        C58827ar arVar = new C58827ar(" | ");
        String str = fVar.f41480e;
        String valueOf = String.valueOf(fVar.f41481f);
        C58495hd hdVar = f41461a;
        C13529e a = C13529e.m29814a(fVar.f41478c);
        if (a == null) {
            a = C13529e.UNRECOGNIZED;
        }
        String str2 = (String) hdVar.getOrDefault(a, "UNMAPPED_TYPE");
        C58495hd hdVar2 = f41462b;
        C13461c a2 = C13461c.m29715a(fVar.f41479d);
        if (a2 == null) {
            a2 = C13461c.UNRECOGNIZED;
        }
        return arVar.mo56097d(C58485gu.m89849q(str, valueOf, str2, (String) hdVar2.getOrDefault(a2, "UNMAPPED_SOURCE")));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.length();
        r2 = r2.f41490b;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m29812c(java.lang.String r1, com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13539o r2) {
        /*
            int r0 = r2.f41490b
            if (r0 <= 0) goto L_0x001d
            int r0 = r1.length()
            int r2 = r2.f41490b
            if (r0 <= r2) goto L_0x001d
            int r2 = r2 + -2
            r0 = 0
            java.lang.String r1 = r1.substring(r0, r2)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = ".."
            java.lang.String r1 = r1.concat(r2)
        L_0x001d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d.C13528n.m29812c(java.lang.String, com.google.android.libraries.assistant.auto.tng.f.d.a.o):java.lang.String");
    }

    /* renamed from: d */
    public static void m29813d(List list) {
        new C58827ar("\n").mo56097d(C58597ky.m90217h(list, C13527m.f41460a));
    }
}
