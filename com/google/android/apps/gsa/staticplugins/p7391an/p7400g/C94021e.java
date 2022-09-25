package com.google.android.apps.gsa.staticplugins.p7391an.p7400g;

import android.util.Base64;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.p6988al.C89193a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p337aa.C6598a;
import com.google.p337aa.C6615b;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.apps.gsa.staticplugins.an.g.e */
/* compiled from: PG */
public final class C94021e implements C89193a {

    /* renamed from: a */
    private static final C59071e f262640a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.an.g.e");

    /* renamed from: b */
    private final C86338r f262641b;

    public C94021e(C86338r rVar) {
        this.f262641b = rVar;
    }

    /* renamed from: a */
    public final String mo19980a(String str, String str2) {
        C58976aa aaVar = C58975e.f156826a;
        byte[] e = this.f262641b.mo80079e("qsb_super_g_animation", (byte[]) null);
        boolean z = this.f262641b.getBoolean("doodle_in_qsb_enabled", true);
        if (e != null && z) {
            C6598a aVar = (C6598a) C6615b.f19645c.createBuilder();
            try {
                aVar.mergeFrom(e, C62921ba.m95368a());
                return Base64.encodeToString(((C6615b) aVar.build()).toByteArray(), 3);
            } catch (C62974ct e2) {
                C59104x c = f262640a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "QsbAnimationPublicValue");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e2)).mo56372aa(19425)).mo56386p("Error parsing CrushinatedAnimation.");
            }
        }
        return null;
    }
}
