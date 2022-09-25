package com.google.android.libraries.silk.p3238b.p3239a;

import android.util.Base64;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C63010eb;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.libraries.silk.b.a.f */
/* compiled from: PG */
public final class C41748f {
    /* renamed from: a */
    public static MessageLite m73220a(String str, C63010eb ebVar, C62921ba baVar) {
        return (MessageLite) ebVar.mo59015n(Base64.decode(str, 8), baVar);
    }

    /* renamed from: b */
    public static String m73221b(MessageLite messageLite) {
        return Base64.encodeToString(messageLite.toByteArray(), 8);
    }
}
