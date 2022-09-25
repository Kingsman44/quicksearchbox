package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16330ad;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16333ag;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16335ai;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16354ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.an */
/* compiled from: PG */
public final class C16088an {

    /* renamed from: a */
    private static final C59071e f47554a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.an");

    /* renamed from: a */
    public static C16330ad m32964a(byte[] bArr) {
        try {
            return (C16330ad) C62942bv.parseFrom((C62942bv) C16330ad.f48065f, bArr, C62921ba.m95368a());
        } catch (C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) f47554a.mo56225c()).mo56382g(e)).mo56372aa(46552)).mo56386p("Converting from byte array to ActionFulfillmentData failed");
            return C16330ad.f48065f;
        }
    }

    /* renamed from: b */
    public static C16333ag m32965b(byte[] bArr) {
        try {
            return (C16333ag) C62942bv.parseFrom((C62942bv) C16333ag.f48074n, bArr, C62921ba.m95368a());
        } catch (C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) f47554a.mo56225c()).mo56382g(e)).mo56372aa(46553)).mo56386p("Converting from byte array to SuggestionMetadata failed");
            return C16333ag.f48074n;
        }
    }

    /* renamed from: c */
    public static C16335ai m32966c(byte[] bArr) {
        try {
            return (C16335ai) C62942bv.parseFrom((C62942bv) C16335ai.f48090k, bArr, C62921ba.m95368a());
        } catch (C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) f47554a.mo56225c()).mo56382g(e)).mo56372aa(46554)).mo56386p("Converting from byte array to SuggestionToDisplayMetadata failed");
            return C16335ai.f48090k;
        }
    }

    /* renamed from: d */
    public static C16354ba m32967d(byte[] bArr) {
        try {
            return (C16354ba) C62942bv.parseFrom((C62942bv) C16354ba.f48140c, bArr, C62921ba.m95368a());
        } catch (C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) f47554a.mo56225c()).mo56382g(e)).mo56372aa(46555)).mo56386p("Converting from byte array to DisplayMetadata failed");
            return C16354ba.f48140c;
        }
    }

    /* renamed from: e */
    public static int m32968e(int i) {
        int i2 = i - 1;
        if (i != 0) {
            return i2;
        }
        throw null;
    }
}
