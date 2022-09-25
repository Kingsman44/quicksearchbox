package com.google.android.apps.gsa.shared.util.p7168f;

import android.text.TextUtils;
import com.google.common.p4537i.C59277b;
import com.google.common.p4537i.C59290o;
import com.google.common.p4537i.C59294s;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.apps.gsa.shared.util.f.a */
/* compiled from: PG */
public final class C91036a {
    /* renamed from: a */
    public static String m148712a(String str, MessageLite messageLite) {
        C59290o c = C59294s.m92133c();
        byte[] byteArray = messageLite.toByteArray();
        return TextUtils.join("_", new String[]{str, messageLite.getClass().toString(), ((C59277b) c).mo56761d(byteArray, byteArray.length).toString()});
    }
}
