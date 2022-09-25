package com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9707i;

import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52236kg;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.net.p4726a.p4727a.C62722b;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.m.i.a */
/* compiled from: PG */
final class C128322a {

    /* renamed from: a */
    private static final C58495hd f352924a;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C52235kf.ABORTED, C62722b.ABORTED);
        gzVar.mo55429h(C52235kf.CANCELLED, C62722b.CANCELLED);
        gzVar.mo55429h(C52235kf.DEADLINE_EXCEEDED, C62722b.DEADLINE_EXCEEDED);
        gzVar.mo55429h(C52235kf.FAILED_PRECONDITION, C62722b.FAILED_PRECONDITION);
        gzVar.mo55429h(C52235kf.IGNORE, C62722b.OK);
        gzVar.mo55429h(C52235kf.INTERNAL, C62722b.INTERNAL);
        gzVar.mo55429h(C52235kf.INVALID_ARGUMENT, C62722b.INVALID_ARGUMENT);
        gzVar.mo55429h(C52235kf.OK, C62722b.OK);
        gzVar.mo55429h(C52235kf.PERMISSION_DENIED, C62722b.PERMISSION_DENIED);
        gzVar.mo55429h(C52235kf.UNAUTHENTICATED, C62722b.UNAUTHENTICATED);
        gzVar.mo55429h(C52235kf.UNKNOWN, C62722b.UNKNOWN);
        f352924a = gzVar.mo55427f(false);
    }

    /* renamed from: a */
    public static C62722b m209417a(C52070ec ecVar) {
        C52236kg kgVar = ecVar.f136654b;
        if (kgVar == null) {
            kgVar = C52236kg.f137089d;
        }
        C52235kf a = C52235kf.m86549a(kgVar.f137092b);
        if (a == null) {
            a = C52235kf.OK;
        }
        C58495hd hdVar = f352924a;
        if (!hdVar.containsKey(a)) {
            return C62722b.UNKNOWN;
        }
        return (C62722b) hdVar.get(a);
    }
}
