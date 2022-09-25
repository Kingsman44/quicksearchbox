package com.google.android.apps.gsa.staticplugins.languagesettings;

import android.content.Context;
import android.content.SharedPreferences;
import android.telephony.TelephonyManager;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.search.core.p6513aj.C84559s;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.speech.microdetection.C92486a;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.p395al.p408c.p414c.p416b.C8506p;
import com.google.p395al.p408c.p414c.p416b.C8509s;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.languagesettings.aa */
/* compiled from: PG */
public final class C102655aa {

    /* renamed from: a */
    public static final C58495hd f286542a;

    /* renamed from: b */
    public final Context f286543b;

    /* renamed from: c */
    public final SharedPreferences f286544c;

    /* renamed from: d */
    public final C89994f f286545d;

    /* renamed from: e */
    public final View f286546e;

    /* renamed from: f */
    public final C92486a f286547f;

    /* renamed from: g */
    public final TelephonyManager f286548g;

    /* renamed from: h */
    public final C84559s f286549h;

    /* renamed from: i */
    private final Map f286550i = new LinkedHashMap();

    /* renamed from: j */
    private final Map f286551j = new LinkedHashMap();

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("IN", Arrays.asList(new String[]{"hi-IN", "en-IN", "bn", "te", "mr", "ta"}));
        gzVar.mo55429h("US", Arrays.asList(new String[]{"en-US", "es-ES"}));
        gzVar.mo55429h("BR", Arrays.asList(new String[]{"pt-BR", "en-US"}));
        gzVar.mo55429h("JP", Arrays.asList(new String[]{"ja-JP"}));
        gzVar.mo55429h("ID", Arrays.asList(new String[]{"id-ID", "jw"}));
        gzVar.mo55429h("RU", Arrays.asList(new String[]{"ru-RU"}));
        gzVar.mo55429h("MX", Arrays.asList(new String[]{"es-MX", "en-US"}));
        gzVar.mo55429h("TH", Arrays.asList(new String[]{"th-TH", "en-US"}));
        gzVar.mo55429h("NG", Arrays.asList(new String[]{"en-US", "pcm", "ha", "ig", "yo"}));
        gzVar.mo55429h("DE", Arrays.asList(new String[]{"de-DE", "en-US", "fr-FR", "nl-NL"}));
        gzVar.mo55429h("GB", Arrays.asList(new String[]{"en-GB"}));
        gzVar.mo55429h("BD", Arrays.asList(new String[]{"bn", "en-US"}));
        gzVar.mo55429h("PK", Arrays.asList(new String[]{"ur", "pa", "en-US", "ps"}));
        f286542a = gzVar.mo55427f(false);
    }

    public C102655aa(SharedPreferences sharedPreferences, C89994f fVar, Context context, View view, C92486a aVar, TelephonyManager telephonyManager, C84559s sVar) {
        this.f286544c = sharedPreferences;
        this.f286545d = fVar;
        this.f286543b = context;
        this.f286546e = view;
        this.f286547f = aVar;
        this.f286548g = telephonyManager;
        this.f286549h = sVar;
    }

    /* renamed from: d */
    private final C8509s m170234d() {
        try {
            return (C8509s) C62942bv.parseFrom((C62942bv) C8509s.f29522b, C90772bp.m148288O(this.f286543b.getResources(), R.raw.default_search_languages), C62921ba.m95368a());
        } catch (C62974ct e) {
            throw new RuntimeException("Cannot read default languages from resources.", e);
        }
    }

    /* renamed from: a */
    public final synchronized Map mo93365a() {
        if (this.f286550i.isEmpty()) {
            for (C8506p pVar : m170234d().f29524a) {
                this.f286550i.put(pVar.f29514b, pVar);
            }
        }
        return this.f286550i;
    }

    /* renamed from: b */
    public final synchronized Map mo93366b() {
        if (this.f286551j.isEmpty()) {
            for (C8506p pVar : m170234d().f29524a) {
                this.f286551j.put(pVar.f29513a, pVar.f29514b);
            }
        }
        return this.f286551j;
    }

    /* renamed from: c */
    public final void mo93367c(String str) {
        LinearLayout linearLayout = (LinearLayout) this.f286546e.findViewById(R.id.search_language_selected_layout);
        TextView textView = (TextView) this.f286546e.findViewById(R.id.search_language_selected_language);
        linearLayout.removeView(textView);
        textView.setText(str);
        linearLayout.addView(textView);
    }
}
