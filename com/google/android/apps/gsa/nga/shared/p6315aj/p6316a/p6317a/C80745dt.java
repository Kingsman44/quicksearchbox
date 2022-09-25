package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

import android.os.Bundle;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80831aj;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.dt */
/* compiled from: PG */
public final class C80745dt {

    /* renamed from: a */
    public static final C59071e f221643a = C59071e.m91332i("com.google.android.apps.gsa.nga.shared.aj.a.a.dt");

    /* renamed from: a */
    public static Bundle m128610a(C80802h hVar) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "inputMessage");
        bundle.putByteArray("message", hVar.toByteArray());
        return bundle;
    }

    /* renamed from: b */
    public static C80831aj m128611b(Bundle bundle) {
        byte[] byteArray = bundle.getByteArray("uiOutputActionProtoKey");
        if (byteArray == null) {
            ((C59052c) ((C59052c) f221643a.mo56226d()).mo56372aa(6532)).mo56386p("Could not parse to AssistantUiOutputAction, byteArray is empty");
            return C80831aj.f221751c;
        }
        try {
            return (C80831aj) C62942bv.parseFrom((C62942bv) C80831aj.f221751c, byteArray, C62921ba.m95368a());
        } catch (C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) f221643a.mo56226d()).mo56382g(e)).mo56372aa(6531)).mo56386p("Could not parse to AssistantUiOutputAction");
            return C80831aj.f221751c;
        }
    }

    /* renamed from: c */
    public static void m128612c(Bundle bundle, C80831aj ajVar) {
        bundle.putByteArray("uiOutputActionProtoKey", ajVar.toByteArray());
    }
}
