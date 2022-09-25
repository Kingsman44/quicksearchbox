package com.google.android.apps.search.assistant.surfaces.dictation.service.p9434e;

import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126290c;
import com.google.android.libraries.search.p2904c.C37338ac;
import com.google.android.libraries.search.p2904c.C37341af;
import com.google.android.libraries.search.p2904c.C37402bg;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.frameworks.client.p4624a.p4625a.C61301b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.e.g */
/* compiled from: PG */
public final /* synthetic */ class C125403g implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C125411o f345851a;

    public /* synthetic */ C125403g(C125411o oVar) {
        this.f345851a = oVar;
    }

    public final C60870cx apply(Object obj) {
        C125411o oVar = this.f345851a;
        C37338ac acVar = (C37338ac) obj;
        C37341af a = C37341af.m66350a(acVar.f99179b);
        if (a == null) {
            a = C37341af.UNKNOWN_ACQUIRING_STATUS;
        }
        if (a.equals(C37341af.ACQUIRED)) {
            ((C59052c) ((C59052c) C125411o.f345861a.mo56224b()).mo56372aa(36494)).mo56389s("Acquired Audio focus for: %s [SD]", oVar.f345877q);
        } else {
            C59052c cVar = (C59052c) ((C59052c) C125411o.f345861a.mo56226d()).mo56372aa(36493);
            C61301b bVar = oVar.f345877q;
            C37341af a2 = C37341af.m66350a(acVar.f99179b);
            if (a2 == null) {
                a2 = C37341af.UNKNOWN_ACQUIRING_STATUS;
            }
            C69664n.m101061g(a2, "<this>");
            cVar.mo56354G("%s: Failed to acquire audio focus: %s [SD]", bVar, C126290c.m206496a(Integer.valueOf(a2.f99187f)));
        }
        C37402bg bgVar = oVar.f345878r;
        bgVar.getClass();
        return bgVar.mo20357d();
    }
}
