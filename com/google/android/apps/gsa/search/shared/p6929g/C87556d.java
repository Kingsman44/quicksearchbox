package com.google.android.apps.gsa.search.shared.p6929g;

import android.util.Base64;
import com.google.protobuf.C63010eb;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.apps.gsa.search.shared.g.d */
/* compiled from: PG */
public final class C87556d {
    /* renamed from: a */
    public static MessageLite m142212a(String str, C63010eb ebVar) {
        return (MessageLite) ebVar.mo59010i(Base64.decode(str, 8));
    }

    /* renamed from: b */
    public static String m142213b(MessageLite messageLite) {
        return Base64.encodeToString(messageLite.toByteArray(), 8);
    }
}
