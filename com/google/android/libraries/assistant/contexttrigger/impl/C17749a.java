package com.google.android.libraries.assistant.contexttrigger.impl;

import android.content.Intent;
import com.google.android.libraries.assistant.contexttrigger.C17693f;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.impl.a */
/* compiled from: PG */
public final class C17749a {

    /* renamed from: a */
    private static final C59071e f50977a = C59071e.m91332i("com.google.android.libraries.assistant.contexttrigger.impl.a");

    /* renamed from: a */
    static C58833ax m35013a(Intent intent) {
        try {
            byte[] byteArrayExtra = intent.getByteArrayExtra("context_trigger_request");
            if (byteArrayExtra != null) {
                return C58833ax.m90834k((C17693f) C62942bv.parseFrom((C62942bv) C17693f.f50865e, byteArrayExtra, C62921ba.m95368a()));
            }
            throw new IllegalArgumentException(String.format("Awareness Intent doesn't contain '%s'.", new Object[]{"context_trigger_request"}));
        } catch (Exception e) {
            ((C59052c) ((C59052c) ((C59052c) f50977a.mo56225c()).mo56382g(e)).mo56372aa(46990)).mo56386p("Can't parse ContextTriggerInternalRequest from Awareness Intent.");
            return C58836b.f156633a;
        }
    }
}
