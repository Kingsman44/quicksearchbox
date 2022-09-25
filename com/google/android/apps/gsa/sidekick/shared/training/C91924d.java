package com.google.android.apps.gsa.sidekick.shared.training;

import android.content.Intent;
import com.google.android.apps.gsa.shared.util.C90734ar;
import com.google.android.apps.gsa.sidekick.shared.util.C91978bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7708h;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7915or;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.training.d */
/* compiled from: PG */
public final class C91924d {

    /* renamed from: a */
    public static final C59071e f256347a = C59071e.m91332i("com.google.android.apps.gsa.sidekick.shared.training.d");

    /* renamed from: a */
    public static boolean m150801a(C7915or orVar) {
        int ordinal = orVar.ordinal();
        return ordinal == 2 || ordinal == 3 || ordinal == 5 || ordinal == 6 || ordinal == 7 || ordinal == 8;
    }

    /* renamed from: b */
    public static void m150802b(C7681g gVar, C7718hj hjVar) {
        C7708h c = C91978bb.m150937c(hjVar, gVar, new C7681g[0]);
        C7708h c2 = gVar == C7681g.RENAME_PLACE ? C91978bb.m150937c(hjVar, C7681g.DELETE_PLACE, new C7681g[0]) : null;
        if (c != null) {
            Intent intent = new Intent();
            intent.putExtra("action_type", gVar.f26835cv);
            C90734ar.m148200c(intent, "entry", hjVar);
            C90734ar.m148200c(intent, "action", c);
            if (c2 != null) {
                C90734ar.m148200c(intent, "delete_action", c2);
            }
            throw new UnsupportedOperationException();
        }
        ((C59052c) ((C59052c) f256347a.mo56225c()).mo56372aa(11932)).mo56389s("Missing action type: %s", gVar);
    }
}
