package com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.p880a;

import android.content.Intent;
import android.net.Uri;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12986d;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.a.d */
/* compiled from: PG */
public final class C12968d {

    /* renamed from: a */
    private static final C59071e f40336a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.a.d");

    /* renamed from: a */
    public static C58833ax m29209a(Intent intent) {
        byte[] byteArrayExtra = intent.getByteArrayExtra("assistant_request");
        if (byteArrayExtra == null) {
            return C58836b.f156633a;
        }
        try {
            return C58833ax.m90834k((C12986d) C62942bv.parseFrom((C62942bv) C12986d.f40365e, byteArrayExtra, C62921ba.m95368a()));
        } catch (C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) f40336a.mo56225c()).mo56382g(e)).mo56372aa(44577)).mo56386p("Intent does not contain AssistantRequest proto");
            return C58836b.f156633a;
        }
    }

    /* renamed from: b */
    public static void m29210b(Intent intent, C12986d dVar) {
        intent.putExtra("assistant_request", dVar.toByteArray());
    }

    /* renamed from: c */
    public static boolean m29211c(Uri uri) {
        String path = uri.getPath();
        return "assistant.google.com".equals(uri.getHost()) && "https".equals(uri.getScheme()) && path != null && path.startsWith("/aap/services/invoke");
    }

    /* renamed from: d */
    public static boolean m29212d(Uri uri) {
        String path = uri.getPath();
        return "plugin".equals(uri.getHost()) && "googleassistant".equals(uri.getScheme()) && path != null && path.startsWith("/services/invoke");
    }
}
