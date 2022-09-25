package com.google.android.apps.gsa.searchbox.p6960ui.suggestions;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.text.style.ScaleXSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TextAppearanceSpan;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a.C88727aj;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
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

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.al */
/* compiled from: PG */
public final class C88767al {

    /* renamed from: a */
    private static final C58495hd f240180a;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("3", 1);
        f240180a = gzVar.mo55427f(false);
    }

    /* renamed from: a */
    public static int m143939a(JSONObject jSONObject) {
        return jSONObject.optInt("ip");
    }

    /* renamed from: b */
    public static int m143940b(JSONObject jSONObject) {
        if (jSONObject.has("i")) {
            return jSONObject.getJSONObject("i").optInt(C42181t.f110467a);
        }
        return 0;
    }

    /* renamed from: c */
    public static int m143941c(List list) {
        Iterator it = list.iterator();
        int i = -1;
        while (it.hasNext()) {
            int i2 = ((C88765aj) it.next()).f240178d;
            if (i2 > 0 && (i < 0 || i2 < i)) {
                i = i2;
            }
        }
        return i;
    }

    /* renamed from: d */
    public static long m143942d(Suggestion suggestion) {
        if (!suggestion.mo44265s()) {
            return 0;
        }
        C54228aq aqVar = suggestion.f108906A;
        C54240d dVar = aqVar.f142340l;
        if (dVar == null) {
            dVar = C54240d.f142409e;
        }
        if ((dVar.f142411a & 4) == 0) {
            return 0;
        }
        C54240d dVar2 = aqVar.f142340l;
        if (dVar2 == null) {
            dVar2 = C54240d.f142409e;
        }
        return dVar2.f142414d;
    }

    /* renamed from: e */
    public static SpannableStringBuilder m143943e(List list, Context context, Resources resources, boolean z) {
        int i;
        Object obj;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C88765aj ajVar = (C88765aj) it.next();
            String str = ajVar.f240175a;
            String str2 = ajVar.f240176b;
            boolean z2 = ajVar.f240177c;
            Integer num = (Integer) f240180a.get(str2);
            if (num == null) {
                i = 0;
            } else {
                i = num.intValue();
            }
            if (z2) {
                spannableStringBuilder.append(" ");
                spannableStringBuilder.setSpan(new ScaleXSpan(resources.getDimension(R.dimen.universal_suggestion_additional_text_margin) / new TextPaint().measureText(" ")), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            }
            int length = spannableStringBuilder.length();
            int length2 = str.length() + length;
            spannableStringBuilder.append(str);
            if (str2.equals("22")) {
                spannableStringBuilder.setSpan(new C88766ak(context, C88727aj.m143701f(str)), length, length2, 33);
                spannableStringBuilder.append(" ");
                length2++;
            } else {
                spannableStringBuilder.setSpan(new TextAppearanceSpan(context, C88764ai.m143938a(str2).f240173l), length, length2, 33);
            }
            if (z && str2.equals("8")) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(context.getResources().getColor(R.color.agsa_color_custom_suggestion_on_surface_visited)), length, length2, 33);
            }
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
    public static String m143944f(JSONObject jSONObject) {
        if (jSONObject.has("al")) {
            return jSONObject.getString("al");
        }
        return null;
    }

    /* renamed from: g */
    public static String m143945g(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("i");
        if (optJSONObject != null) {
            return optJSONObject.getString("d");
        }
        return null;
    }

    /* renamed from: h */
    public static String m143946h(JSONObject jSONObject) {
        if (jSONObject.has("i")) {
            return jSONObject.getJSONObject("i").optString("d");
        }
        return null;
    }

    /* renamed from: i */
    public static String m143947i(Suggestion suggestion) {
        if (!suggestion.mo44265s()) {
            return null;
        }
        C54228aq aqVar = suggestion.f108906A;
        C54240d dVar = aqVar.f142340l;
        if (dVar == null) {
            dVar = C54240d.f142409e;
        }
        if ((dVar.f142411a & 1) == 0) {
            return null;
        }
        C54240d dVar2 = aqVar.f142340l;
        if (dVar2 == null) {
            dVar2 = C54240d.f142409e;
        }
        return dVar2.f142412b;
    }

    /* renamed from: j */
    public static List m143948j(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray(C42181t.f110467a);
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                m143953o(arrayList, optJSONArray.getJSONObject(i), false);
            }
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("at");
        if (optJSONObject != null) {
            m143953o(arrayList, optJSONObject, true);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("st");
        if (optJSONObject2 != null) {
            m143953o(arrayList, optJSONObject2, false);
        }
        return arrayList;
    }

    /* renamed from: k */
    public static JSONArray m143949k(JSONObject jSONObject) {
        return jSONObject.getJSONArray("l");
    }

    /* renamed from: l */
    public static JSONObject m143950l(JSONArray jSONArray, int i) {
        return jSONArray.getJSONObject(i).getJSONObject("il");
    }

    /* renamed from: m */
    public static boolean m143951m(String str) {
        return str.startsWith("http://") || str.startsWith("https://");
    }

    /* renamed from: n */
    public static boolean m143952n(Suggestion suggestion) {
        if (suggestion.mo44265s()) {
            C54240d dVar = suggestion.f108906A.f142340l;
            if (dVar == null) {
                dVar = C54240d.f142409e;
            }
            if ((dVar.f142411a & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o */
    private static void m143953o(List list, JSONObject jSONObject, boolean z) {
        String string = jSONObject.getString("tt");
        if (string != null) {
            String string2 = jSONObject.getString(C42181t.f110467a);
            String replaceAll = string2.replaceAll("^\\s+", BuildConfig.FLAVOR);
            String concat = String.valueOf(string2.substring(0, string2.length() - replaceAll.length())).concat(String.valueOf(Html.fromHtml(Html.fromHtml(replaceAll).toString()).toString()));
            if (concat.length() > 0) {
                list.add(new C88765aj(concat, string, z, jSONObject.has("ln") ? jSONObject.getInt("ln") : -1));
            }
        }
    }
}
