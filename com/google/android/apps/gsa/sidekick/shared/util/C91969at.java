package com.google.android.apps.gsa.sidekick.shared.util;

import android.content.Context;
import androidx.core.app.C1794ak;
import androidx.core.app.C1800aq;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p375ai.p378b.C7566bt;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.util.at */
/* compiled from: PG */
public final class C91969at {

    /* renamed from: a */
    private static final C59071e f256467a = C59071e.m91332i("com.google.android.apps.gsa.sidekick.shared.util.at");

    /* renamed from: a */
    public static String m150924a(C7566bt btVar, Context context) {
        try {
            String valueOf = String.valueOf(((C91968as) C62942bv.parseFrom((C62942bv) C91968as.f256463b, btVar.toByteString(), C62921ba.m95368a())).f256465a);
            if (C1794ak.m4938a(new C1800aq(context).f5622a, valueOf) != null) {
                return valueOf;
            }
            return null;
        } catch (C62974ct e) {
            C59104x d = f256467a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "NotifChannelUtil");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(11944)).mo56386p("protobuffer parsing exception which should never happen.");
            return null;
        }
    }
}
