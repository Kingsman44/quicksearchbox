package com.google.android.libraries.search.p3055n.p3061c.p3062a;

import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.p2589a.p2590a.C33497h;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.lang.reflect.Method;
import java.util.Locale;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.n.c.a.ab */
/* compiled from: PG */
public final class C39386ab {

    /* renamed from: a */
    public static final C59071e f103701a = C59071e.m91332i("com.google.android.libraries.search.n.c.a.ab");

    /* renamed from: a */
    public static String m68780a(int i) {
        switch (i) {
            case -3:
                return "INVALID";
            case -2:
                return "HARDWARE_UNAVAILABLE";
            case -1:
                return "KEYPHRASE_UNSUPPORTED";
            case 0:
                return "NOT_READY";
            case 1:
                return "KEYPHRASE_UNENROLLED";
            case 2:
                return "KEYPHRASE_ENROLLED";
            case 3:
                return "ERROR";
            default:
                return "UNKNOWN (" + i + ")";
        }
    }

    /* renamed from: b */
    public static boolean m68781b(C33497h hVar, String str, Locale locale) {
        try {
            C69664n.m101061g(str, "keyphrase");
            C69664n.m101061g(locale, "locale");
            Class[] clsArr = {String.class, Locale.class};
            Method method = hVar.f89651a.getClass().getMethod("isKeyphraseAndLocaleSupportedForHotword", clsArr);
            C69664n.m101060f(method, "service.javaClass.getMet…ale::class.java\n        )");
            Object invoke = method.invoke(hVar.f89651a, new Object[]{str, locale});
            C69664n.m101059e(invoke, "null cannot be cast to non-null type kotlin.Boolean");
            return ((Boolean) invoke).booleanValue();
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        } catch (RuntimeException e2) {
            ((C59052c) ((C59052c) ((C59052c) f103701a.mo56226d()).mo56382g(e2)).mo56372aa(53517)).mo56386p("isKeyphraseAndLocaleSupportedForHotword exception");
            return false;
        }
    }
}
