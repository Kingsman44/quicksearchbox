package com.google.android.apps.search.googleapp.search.suggest.p10464ui.viewbinders;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ScaleXSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TextAppearanceSpan;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;
import com.google.p4017at.p4060h.p4073d.p4074a.C54240d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.viewbinders.as */
/* compiled from: PG */
public final class C138640as {

    /* renamed from: a */
    private static final C58495hd f377070a;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("3", 1);
        f377070a = gzVar.mo55427f(false);
    }

    /* renamed from: a */
    public static int m225170a(JSONObject jSONObject) {
        return jSONObject.optInt("ip");
    }

    /* renamed from: b */
    public static int m225171b(JSONObject jSONObject) {
        if (jSONObject.has("i")) {
            return jSONObject.getJSONObject("i").optInt(C42181t.f110467a);
        }
        return 0;
    }

    /* renamed from: c */
    public static int m225172c(List list) {
        Iterator it = list.iterator();
        int i = -1;
        while (it.hasNext()) {
            int i2 = ((C138639ar) it.next()).f377069d;
            if (i2 > 0 && (i < 0 || i2 < i)) {
                i = i2;
            }
        }
        return i;
    }

    /* renamed from: d */
    public static long m225173d(C138030av avVar) {
        C54228aq aqVar = avVar.f375543g;
        if (aqVar == null) {
            aqVar = C54228aq.f142328w;
        }
        C54240d dVar = aqVar.f142340l;
        if (dVar == null) {
            dVar = C54240d.f142409e;
        }
        return dVar.f142414d;
    }

    /* renamed from: e */
    public static SpannableStringBuilder m225174e(List list, Context context, Resources resources, boolean z) {
        int i;
        Object obj;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C138639ar arVar = (C138639ar) it.next();
            String str = arVar.f377066a;
            String str2 = arVar.f377067b;
            boolean z2 = arVar.f377068c;
            Integer num = (Integer) f377070a.get(str2);
            if (num == null) {
                i = 0;
            } else {
                i = num.intValue();
            }
            if (z2) {
                spannableStringBuilder.append(" ");
                spannableStringBuilder.setSpan(new ScaleXSpan(resources.getDimension(R.dimen.googleapp_universal_suggestion_additional_text_margin) / new TextPaint().measureText(" ")), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            }
            int length = spannableStringBuilder.length();
            int length2 = str.length() + length;
            spannableStringBuilder.append(str);
            spannableStringBuilder.setSpan(new TextAppearanceSpan(context, C138638aq.m225169a(str2, z).f377063s), length, length2, 33);
            if (i == 1) {
                obj = new SuperscriptSpan();
            } else if (i != 2) {
                obj = null;
            } else {
                obj = new SubscriptSpan();
            }
            if (obj != null) {
                spannableStringBuilder.setSpan(obj, length, length2, 33);
            }
        }
        return spannableStringBuilder;
    }

    /* renamed from: f */
    public static String m225175f(JSONObject jSONObject) {
        if (jSONObject.has("al")) {
            return jSONObject.getString("al");
        }
        return null;
    }

    /* renamed from: g */
    public static String m225176g(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("i");
        if (optJSONObject != null) {
            return optJSONObject.getString("d");
        }
        return null;
    }

    /* renamed from: h */
    public static String m225177h(JSONObject jSONObject) {
        if (jSONObject.has("i")) {
            return jSONObject.getJSONObject("i").optString("d");
        }
        return null;
    }

    /* renamed from: i */
    public static List m225178i(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray(C42181t.f110467a);
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                m225181l(arrayList, optJSONArray.getJSONObject(i), false);
            }
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("at");
        if (optJSONObject != null) {
            m225181l(arrayList, optJSONObject, true);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("st");
        if (optJSONObject2 != null) {
            m225181l(arrayList, optJSONObject2, false);
        }
        return arrayList;
    }

    /* renamed from: j */
    public static JSONArray m225179j(JSONObject jSONObject) {
        return jSONObject.getJSONArray("l");
    }

    /* renamed from: k */
    public static JSONObject m225180k(JSONArray jSONArray, int i) {
        return jSONArray.getJSONObject(i).getJSONObject("il");
    }

    /* renamed from: l */
    private static void m225181l(List list, JSONObject jSONObject, boolean z) {
        String string = jSONObject.getString("tt");
        if (string != null) {
            String string2 = jSONObject.getString(C42181t.f110467a);
            String replaceAll = string2.replaceAll("^\\s+", BuildConfig.FLAVOR);
            String concat = String.valueOf(string2.substring(0, string2.length() - replaceAll.length())).concat(String.valueOf(Html.fromHtml(Html.fromHtml(replaceAll).toString()).toString()));
            if (concat.length() > 0) {
                list.add(new C138639ar(concat, string, z, jSONObject.has("ln") ? jSONObject.getInt("ln") : -1));
            }
        }
    }
}
