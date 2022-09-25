package com.google.android.apps.gsa.search.core.google.p6794d;

import android.util.Base64;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.apps.gsa.search.core.google.d.p */
/* compiled from: PG */
public abstract class C85949p {

    /* renamed from: a */
    public static final C59071e f232421a = C59071e.m91332i("com.google.android.apps.gsa.search.core.google.d.p");

    /* renamed from: b */
    public static String m138177b(boolean z) {
        return true != z ? "0" : "1";
    }

    /* renamed from: c */
    public static String m138178c(MessageLite messageLite) {
        String str = new String(Base64.encode(messageLite.toByteArray(), 10), C90772bp.f253863a);
        return "\"" + str + "\"";
    }

    /* renamed from: a */
    public abstract C85945l mo79619a();
}
