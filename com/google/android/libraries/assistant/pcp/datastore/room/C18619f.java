package com.google.android.libraries.assistant.pcp.datastore.room;

import com.google.android.libraries.assistant.pcp.p1578m.C18995y;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.libraries.assistant.pcp.datastore.room.f */
/* compiled from: PG */
public final class C18619f {

    /* renamed from: a */
    private static final C59071e f52643a = C59071e.m91332i("com.google.android.libraries.assistant.pcp.datastore.room.f");

    /* renamed from: a */
    public static C18995y m36083a(byte[] bArr) {
        try {
            return (C18995y) C62942bv.parseFrom((C62942bv) C18995y.f53366e, bArr, C62921ba.m95368a());
        } catch (C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) f52643a.mo56226d()).mo56382g(e)).mo56372aa(47361)).mo56386p("Converting from byte array to StoredElement failed");
            return C18995y.f53366e;
        }
    }
}
