package com.google.android.libraries.lens.common.text;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58466gb;
import com.google.common.p4522b.C58468gd;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.p4492ck.p4493a.p4494a.C58127b;

/* renamed from: com.google.android.libraries.lens.common.text.e */
/* compiled from: PG */
public final class C24129e {

    /* renamed from: a */
    public static final C58468gd f65885a;

    /* renamed from: b */
    public static final C58495hd f65886b;

    /* renamed from: c */
    private static final C58495hd f65887c;

    static {
        C58466gb gbVar = new C58466gb();
        gbVar.mo55364d("Arab", "arabic");
        gbVar.mo55364d("Hani", "chinese");
        gbVar.mo55364d("Cyrl", "cyrillic");
        gbVar.mo55364d("Deva", "devanagari");
        gbVar.mo55364d("Geor", "georgian");
        gbVar.mo55364d("Grek", "greek");
        gbVar.mo55364d("Gujr", "gujarati");
        gbVar.mo55364d("Hebr", "hebrew");
        gbVar.mo55364d("Jpan", "japanese");
        gbVar.mo55364d("Knda", "kannada");
        gbVar.mo55364d("Kore", "korean");
        gbVar.mo55364d("Latn", "latin");
        gbVar.mo55364d("Taml", "tamil");
        gbVar.mo55364d("Telu", "telugu");
        gbVar.mo55364d("Thai", "thai");
        f65885a = gbVar.mo55363c();
        C58490gz gzVar = new C58490gz(4);
        Object obj = "tamil";
        gzVar.mo55429h("arabic", new String[]{"ar", "fa", "ur"});
        gzVar.mo55429h("chinese", new String[]{"zh"});
        gzVar.mo55429h("cyrillic", new String[]{"ru", "be", "bg", "mk", "uk"});
        gzVar.mo55429h("devanagari", new String[]{"hi", "bn", "mr"});
        gzVar.mo55429h("georgian", new String[]{"ka"});
        gzVar.mo55429h("greek", new String[]{"el"});
        gzVar.mo55429h("gujarati", new String[]{"gu"});
        gzVar.mo55429h("hebrew", new String[]{"iw"});
        gzVar.mo55429h("japanese", new String[]{"ja"});
        gzVar.mo55429h("kannada", new String[]{"kn"});
        gzVar.mo55429h("korean", new String[]{"ko"});
        gzVar.mo55429h("latin", new String[]{"en", "af", "sq", "ca", "hr", "cs", "da", "nl", "eo", "et", "fil", "fi", "fr", "gl", "de", "ht", "hu", "is", "id", "ga", "it", "lv", "lt", "ms", "mt", "no", "pl", "pt", "ro", "sk", "sl", "es", "sw", "sv", "tl", "tr", "vi", "cy"});
        gzVar.mo55429h(obj, new String[]{"ta"});
        Object obj2 = "telugu";
        gzVar.mo55429h(obj2, new String[]{"te"});
        Object obj3 = obj2;
        Object obj4 = "thai";
        gzVar.mo55429h(obj4, new String[]{"th"});
        f65886b = gzVar.mo55427f(true);
        C58490gz gzVar2 = new C58490gz(4);
        gzVar2.mo55429h("ar", "arabic");
        gzVar2.mo55429h("fa", "arabic");
        gzVar2.mo55429h("ur", "arabic");
        gzVar2.mo55429h("zh", "chinese");
        Object obj5 = "cyrillic";
        gzVar2.mo55429h("be", obj5);
        gzVar2.mo55429h("bg", obj5);
        gzVar2.mo55429h("mk", obj5);
        gzVar2.mo55429h("ru", obj5);
        gzVar2.mo55429h("uk", obj5);
        gzVar2.mo55429h("bn", "devanagari");
        gzVar2.mo55429h("hi", "devanagari");
        gzVar2.mo55429h("mr", "devanagari");
        gzVar2.mo55429h("ka", "georgian");
        gzVar2.mo55429h("el", "greek");
        gzVar2.mo55429h("gu", "gujarati");
        gzVar2.mo55429h("iw", "hebrew");
        gzVar2.mo55429h("ja", "japanese");
        gzVar2.mo55429h("kn", "kannada");
        gzVar2.mo55429h("ko", "korean");
        gzVar2.mo55429h("af", "latin");
        gzVar2.mo55429h("sq", "latin");
        gzVar2.mo55429h("ca", "latin");
        gzVar2.mo55429h("hr", "latin");
        gzVar2.mo55429h("cs", "latin");
        gzVar2.mo55429h("da", "latin");
        gzVar2.mo55429h("nl", "latin");
        gzVar2.mo55429h("en", "latin");
        gzVar2.mo55429h("eo", "latin");
        gzVar2.mo55429h("et", "latin");
        gzVar2.mo55429h("fil", "latin");
        gzVar2.mo55429h("fi", "latin");
        gzVar2.mo55429h("fr", "latin");
        gzVar2.mo55429h("gl", "latin");
        gzVar2.mo55429h("de", "latin");
        gzVar2.mo55429h("ht", "latin");
        gzVar2.mo55429h("hu", "latin");
        gzVar2.mo55429h("is", "latin");
        gzVar2.mo55429h("id", "latin");
        gzVar2.mo55429h("ga", "latin");
        gzVar2.mo55429h("it", "latin");
        gzVar2.mo55429h("lv", "latin");
        gzVar2.mo55429h("lt", "latin");
        gzVar2.mo55429h("ms", "latin");
        gzVar2.mo55429h("mt", "latin");
        gzVar2.mo55429h("no", "latin");
        gzVar2.mo55429h("pl", "latin");
        gzVar2.mo55429h("pt", "latin");
        gzVar2.mo55429h("ro", "latin");
        gzVar2.mo55429h("sk", "latin");
        gzVar2.mo55429h("sl", "latin");
        gzVar2.mo55429h("es", "latin");
        gzVar2.mo55429h("sw", "latin");
        gzVar2.mo55429h("sv", "latin");
        gzVar2.mo55429h("tl", "latin");
        gzVar2.mo55429h("tr", "latin");
        gzVar2.mo55429h("vi", "latin");
        gzVar2.mo55429h("cy", "latin");
        gzVar2.mo55429h("ta", obj);
        gzVar2.mo55429h("te", obj3);
        gzVar2.mo55429h("th", obj4);
        f65887c = gzVar2.mo55427f(true);
    }

    /* renamed from: a */
    public static C58833ax m44827a(C58127b bVar) {
        if (bVar.f155394a.size() <= 0 || !m44832f((String) bVar.f155394a.get(0))) {
            return (bVar.f155397d.size() <= 0 || !m44831e((String) bVar.f155397d.get(0))) ? C58836b.f156633a : C58833ax.m90834k(m44830d((String) bVar.f155397d.get(0)));
        }
        String str = (String) bVar.f155394a.get(0);
        C58495hd hdVar = f65886b;
        if (!hdVar.containsKey(str)) {
            return C58836b.f156633a;
        }
        String[] strArr = (String[]) hdVar.get(str);
        strArr.getClass();
        return C58833ax.m90834k(strArr[0]);
    }

    /* renamed from: b */
    public static C58833ax m44828b(String str) {
        String d = m44830d(str);
        C58495hd hdVar = f65887c;
        if (!hdVar.containsKey(d)) {
            return C58836b.f156633a;
        }
        return C58833ax.m90834k((String) hdVar.get(d));
    }

    /* renamed from: c */
    public static C58833ax m44829c(String str) {
        C58495hd hdVar = f65886b;
        if (!hdVar.containsKey(str)) {
            return C58836b.f156633a;
        }
        String[] strArr = (String[]) hdVar.get(str);
        strArr.getClass();
        return C58833ax.m90834k(strArr);
    }

    /* renamed from: d */
    public static String m44830d(String str) {
        if (str.equals("ru-PETR1708")) {
            return "ru";
        }
        if (str.equals("zh-CN") || str.equals("zh-TW")) {
            return "zh";
        }
        return str.equals("fil") ? "tl" : str;
    }

    /* renamed from: e */
    public static boolean m44831e(String str) {
        return f65887c.containsKey(m44830d(str));
    }

    /* renamed from: f */
    public static boolean m44832f(String str) {
        return ((String[]) m44829c(str).mo56109e(new String[0])).length == 1;
    }
}
