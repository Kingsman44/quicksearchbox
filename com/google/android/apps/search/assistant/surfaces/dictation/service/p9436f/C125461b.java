package com.google.android.apps.search.assistant.surfaces.dictation.service.p9436f;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126290c;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52236kg;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.frameworks.client.p4624a.p4625a.C61301b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.f.b */
/* compiled from: PG */
public final /* synthetic */ class C125461b implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C51809dy f345983a;

    public /* synthetic */ C125461b(C51809dy dyVar) {
        this.f345983a = dyVar;
    }

    public final Object apply(Object obj) {
        C51809dy dyVar = this.f345983a;
        C52070ec ecVar = (C52070ec) obj;
        C52236kg kgVar = ecVar.f136654b;
        if (kgVar == null) {
            kgVar = C52236kg.f137089d;
        }
        C52235kf a = C52235kf.m86549a(kgVar.f137092b);
        if (a == null) {
            a = C52235kf.OK;
        }
        if (a.equals(C52235kf.OK)) {
            return true;
        }
        C59052c cVar = (C59052c) C125462c.f345984a.mo56225c();
        cVar.mo56378ag(C38505d.f101863a, Integer.valueOf(C89885b.ASSISTANT_DICTATION_EXECUTION_FAILED_VALUE));
        C59052c cVar2 = (C59052c) cVar.mo56372aa(36555);
        C61301b b = C126290c.m206497b(dyVar.f135936b);
        C52236kg kgVar2 = ecVar.f136654b;
        if (kgVar2 == null) {
            kgVar2 = C52236kg.f137089d;
        }
        C52235kf a2 = C52235kf.m86549a(kgVar2.f137092b);
        if (a2 == null) {
            a2 = C52235kf.OK;
        }
        C69664n.m101061g(a2, "<this>");
        C61301b a3 = C126290c.m206496a(Integer.valueOf(a2.f137088t));
        C52236kg kgVar3 = ecVar.f136654b;
        if (kgVar3 == null) {
            kgVar3 = C52236kg.f137089d;
        }
        cVar2.mo56359L("Failed while executing %s with %s: %s [SD]", b, a3, C126290c.m206496a(kgVar3.f137093c));
        return false;
    }
}
