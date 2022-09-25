package com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32781ac;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32789ak;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32791am;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32831bz;
import java.util.Locale;

/* renamed from: com.google.android.libraries.search.assistant.f.a.a.g */
/* compiled from: PG */
public final class C32602g {
    /* renamed from: a */
    public static String m60428a(C32781ac acVar) {
        C32796ar arVar = acVar.f87953b;
        if (arVar == null) {
            arVar = C32796ar.f87973c;
        }
        String b = m60429b(arVar);
        boolean z = acVar.f87954c;
        boolean z2 = acVar.f87955d;
        return b + ". CanBeSentToServer: " + z + ". SupportsCacheInvalidations: " + z2;
    }

    /* renamed from: b */
    public static String m60429b(C32796ar arVar) {
        C32791am amVar;
        C32831bz bzVar;
        String str;
        int i = arVar.f87975a;
        int a = C32789ak.m60768a(i);
        int i2 = a - 1;
        if (a != 0) {
            switch (i2) {
                case 0:
                    return i == 1 ? (String) arVar.f87976b : BuildConfig.FLAVOR;
                case 1:
                    Locale locale = Locale.US;
                    Object[] objArr = new Object[1];
                    if (arVar.f87975a == 2) {
                        amVar = (C32791am) arVar.f87976b;
                    } else {
                        amVar = C32791am.f87965c;
                    }
                    objArr[0] = amVar.f87968b;
                    return String.format(locale, "header: %s", objArr);
                case 2:
                    Locale locale2 = Locale.US;
                    Object[] objArr2 = new Object[1];
                    objArr2[0] = Integer.valueOf(arVar.f87975a == 3 ? ((Integer) arVar.f87976b).intValue() : 0);
                    return String.format(locale2, "generic_context: %d", objArr2);
                case 3:
                    return "user_agent";
                case 4:
                    Locale locale3 = Locale.US;
                    Object[] objArr3 = new Object[1];
                    if (arVar.f87975a == 5) {
                        bzVar = C32831bz.m60796a(((Integer) arVar.f87976b).intValue());
                        if (bzVar == null) {
                            bzVar = C32831bz.UNKNOWN_INVOCATION_TYPE;
                        }
                    } else {
                        bzVar = C32831bz.UNKNOWN_INVOCATION_TYPE;
                    }
                    objArr3[0] = bzVar.name();
                    return String.format(locale3, "invocation_type: %s", objArr3);
                case 5:
                    return "client_id";
                case 6:
                    return "opaque_token";
                case 7:
                    return "context type not set";
                default:
                    int a2 = C32789ak.m60768a(i);
                    switch (a2) {
                        case 1:
                            str = "CONVERSATION_PARAM";
                            break;
                        case 2:
                            str = "HEADER";
                            break;
                        case 3:
                            str = "GENERIC_CONTEXT";
                            break;
                        case 4:
                            str = "USER_AGENT";
                            break;
                        case 5:
                            str = "INVOCATION_TYPE";
                            break;
                        case 6:
                            str = "CLIENT_ID";
                            break;
                        case 7:
                            str = "OPAQUE_TOKEN";
                            break;
                        case 8:
                            str = "CONTEXTTYPE_NOT_SET";
                            break;
                        default:
                            str = "null";
                            break;
                    }
                    if (a2 != 0) {
                        return str;
                    }
                    throw null;
            }
        } else {
            throw null;
        }
    }
}
