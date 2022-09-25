package com.google.android.apps.search.weather.p10685d;

import android.content.Intent;
import android.util.Base64;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p5269w.p5270a.C67962d;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.apps.search.weather.d.c */
/* compiled from: PG */
public final class C142074c {

    /* renamed from: a */
    private static final C59071e f385462a = C59071e.m91332i("com.google.android.apps.search.weather.d.c");

    /* renamed from: a */
    public static int m230649a(Intent intent) {
        if (intent == null) {
            return 0;
        }
        return intent.getIntExtra("default_tab_index", 0);
    }

    /* renamed from: b */
    public static C67962d m230650b(Intent intent) {
        byte[] bArr;
        if (intent == null) {
            return null;
        }
        String stringExtra = intent.getStringExtra("location_64");
        if (stringExtra != null) {
            try {
                bArr = Base64.decode(stringExtra, 2);
            } catch (IllegalArgumentException e) {
                ((C59052c) ((C59052c) ((C59052c) f385462a.mo56225c()).mo56382g(e)).mo56372aa(42032)).mo56389s("Got bad base 64 encoded string param: %s", intent);
                bArr = null;
            }
        } else {
            bArr = intent.getByteArrayExtra("location");
        }
        if (bArr == null) {
            return null;
        }
        try {
            return (C67962d) C62942bv.parseFrom((C62942bv) C67962d.f184173g, bArr, C62921ba.m95368a());
        } catch (C62974ct e2) {
            ((C59052c) ((C59052c) ((C59052c) f385462a.mo56225c()).mo56382g(e2)).mo56372aa(42031)).mo56389s("Got bad intent: %s", intent);
            return null;
        }
    }
}
