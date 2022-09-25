package com.google.android.libraries.mdi.download.p2236d.p2242f;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.google.common.base.C58833ax;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63010eb;
import com.google.protobuf.MessageLite;
import java.io.IOException;

/* renamed from: com.google.android.libraries.mdi.download.d.f.y */
/* compiled from: PG */
public final class C29111y {
    /* renamed from: a */
    public static SharedPreferences m54038a(Context context, String str, C58833ax axVar) {
        return context.getSharedPreferences(m54041d(str, axVar), 0);
    }

    /* renamed from: b */
    public static MessageLite m54039b(String str, C63010eb ebVar) {
        try {
            return (MessageLite) ebVar.mo59015n(Base64.decode(str, 3), C62921ba.f169869a);
        } catch (IllegalArgumentException e) {
            throw new C62974ct(new IOException(e), (byte[]) null);
        }
    }

    /* renamed from: c */
    public static MessageLite m54040c(SharedPreferences sharedPreferences, String str, C63010eb ebVar) {
        String string = sharedPreferences.getString(str, (String) null);
        if (string == null) {
            return null;
        }
        try {
            return m54039b(string, ebVar);
        } catch (C62974ct unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static String m54041d(String str, C58833ax axVar) {
        return (axVar == null || !axVar.mo56113h()) ? str : str.concat(String.valueOf((String) axVar.mo56107c()));
    }

    /* renamed from: e */
    public static String m54042e(MessageLite messageLite) {
        return Base64.encodeToString(messageLite.toByteArray(), 3);
    }

    /* renamed from: f */
    public static void m54043f(SharedPreferences.Editor editor, String str, MessageLite messageLite) {
        editor.putString(str, m54042e(messageLite));
    }

    /* renamed from: g */
    public static boolean m54044g(SharedPreferences sharedPreferences, String str) {
        return sharedPreferences.edit().remove(str).commit();
    }

    /* renamed from: h */
    public static boolean m54045h(SharedPreferences sharedPreferences, String str, MessageLite messageLite) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        m54043f(edit, str, messageLite);
        return edit.commit();
    }
}
