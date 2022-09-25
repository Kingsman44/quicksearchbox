package com.google.android.apps.gsa.search.core.p6513aj;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.speech.dumper.EventForDump;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.C92417w;
import com.google.android.apps.gsa.speech.p7311n.C92541i;
import com.google.android.apps.gsa.speech.utils.C92654a;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p395al.p408c.p414c.p416b.C8460ac;
import com.google.p395al.p408c.p414c.p416b.C8506p;
import com.google.p395al.p408c.p414c.p416b.C8508r;
import com.google.p395al.p408c.p414c.p416b.C8509s;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.search.core.aj.s */
/* compiled from: PG */
public final class C84559s {

    /* renamed from: f */
    private static final C59071e f230126f = C59071e.m91332i("com.google.android.apps.gsa.search.core.aj.s");

    /* renamed from: g */
    private static final Map f230127g = new LinkedHashMap();

    /* renamed from: a */
    public final SharedPreferences f230128a;

    /* renamed from: b */
    public final C89994f f230129b;

    /* renamed from: c */
    public final C68214a f230130c;

    /* renamed from: d */
    public final C68214a f230131d;

    /* renamed from: e */
    public final C68214a f230132e;

    /* renamed from: h */
    private final C68214a f230133h;

    /* renamed from: i */
    private final C68214a f230134i;

    /* renamed from: j */
    private final Context f230135j;

    /* renamed from: k */
    private final C89859i f230136k;

    public C84559s(SharedPreferences sharedPreferences, C89994f fVar, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, Context context, C68214a aVar5, C89859i iVar) {
        this.f230128a = sharedPreferences;
        this.f230129b = fVar;
        this.f230130c = aVar;
        this.f230131d = aVar2;
        this.f230133h = aVar3;
        this.f230134i = aVar4;
        this.f230135j = context;
        this.f230132e = aVar5;
        this.f230136k = iVar;
    }

    /* renamed from: a */
    public static Intent m135275a(String str, String str2) {
        Intent putExtra = new Intent("com.google.android.googlequicksearchbox.CHANGE_VOICESEARCH_LANGUAGE").putExtra("language", str);
        putExtra.setPackage(str2);
        return putExtra;
    }

    /* renamed from: b */
    public static String m135276b(String str) {
        String[] split = str.split("-");
        if (split.length == 1) {
            return str;
        }
        return split[0];
    }

    /* renamed from: g */
    private static String m135277g(Locale locale) {
        StringBuilder sb = new StringBuilder();
        sb.append(locale.getLanguage());
        String variant = locale.getVariant();
        if (!TextUtils.isEmpty(variant)) {
            sb.append("-");
            sb.append(variant);
        }
        String country = locale.getCountry();
        if (!TextUtils.isEmpty(country)) {
            sb.append("-");
            sb.append(country);
        }
        return sb.toString();
    }

    /* renamed from: h */
    private static synchronized Map m135278h(Context context) {
        Map map;
        synchronized (C84559s.class) {
            if (f230127g.isEmpty()) {
                try {
                    for (C8506p pVar : ((C8509s) C62942bv.parseFrom((C62942bv) C8509s.f29522b, C90772bp.m148288O(context.getResources(), R.raw.default_search_languages), C62921ba.m95368a())).f29524a) {
                        f230127g.put(pVar.f29514b, pVar);
                    }
                } catch (C62974ct e) {
                    throw new RuntimeException("Cannot read default languages from resources.", e);
                }
            }
            map = f230127g;
        }
        return map;
    }

    /* renamed from: c */
    public final void mo78312c(String str, EventForDump eventForDump) {
        String ab = this.f230129b.mo83882ab();
        this.f230129b.mo83903aw(2, eventForDump);
        SharedPreferences.Editor edit = this.f230128a.edit();
        edit.putBoolean("opa_hotword_enabled", false);
        edit.putBoolean("hotwordDetector", false);
        edit.apply();
        if (this.f230129b.mo83847J(ab)) {
            if (this.f230130c.mo27525b() == null || !((bm) this.f230130c.mo27525b()).u()) {
                ((C59052c) ((C59052c) f230126f.mo56224b()).mo56372aa(9424)).mo56386p("Setting speaker id model to null : Locale changed");
                this.f230129b.mo83843F(ab, eventForDump);
            } else if (!this.f230129b.mo83848K()) {
                ((C59052c) ((C59052c) f230126f.mo56224b()).mo56372aa(9427)).mo56386p("Setting speaker id model to null : Locale changed");
                this.f230129b.mo83843F(ab, eventForDump);
            } else {
                String E = this.f230129b.mo83842E(ab);
                boolean z = true;
                for (String str2 : ((C86054o) this.f230134i.mo27525b()).mo79685s()) {
                    if (str2 != null && !str2.equals(ab) && E.equals(this.f230129b.mo83842E(str2))) {
                        z = false;
                    }
                }
                if (z) {
                    this.f230129b.mo83843F(ab, eventForDump);
                }
            }
        }
        ((C59052c) ((C59052c) f230126f.mo56224b()).mo56372aa(9429)).mo56386p("Removing enrollment utterances : Locale changed");
        ((C92417w) this.f230133h.mo27525b()).mo87056a(ab, -1);
        this.f230136k.mo83702b(C89849ae.DELETE_UTTERANCES_ON_LOCALE_CHANGED);
        Context context = this.f230135j;
        context.sendBroadcast(m135275a(str, context.getPackageName()));
    }

    /* renamed from: d */
    public final void mo78313d(String str, Locale locale) {
        String b = m135276b(str);
        String language = locale.getLanguage();
        if (str.equals(m135277g(locale))) {
            this.f230128a.edit().putInt("search_language_state", 2).apply();
        } else if (b.equals(language)) {
            this.f230128a.edit().putInt("search_language_state", 1).apply();
        } else {
            this.f230128a.edit().putInt("search_language_state", 0).apply();
        }
    }

    /* renamed from: e */
    public final void mo78314e(Locale locale) {
        boolean z;
        String language = locale.getLanguage();
        String g = m135277g(locale);
        Map h = m135278h(this.f230135j);
        Iterator it = h.entrySet().iterator();
        boolean z2 = false;
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = ((C8506p) entry.getValue()).f29514b;
            String b = m135276b(str);
            if (g.equals(str)) {
                this.f230128a.edit().putString("selected_search_language", ((C8506p) entry.getValue()).f29513a).putString("hl_parameter", str).apply();
                mo78313d(str, locale);
                z = true;
                break;
            } else if (!z2 && language.equals(b)) {
                this.f230128a.edit().putString("selected_search_language", ((C8506p) entry.getValue()).f29513a).putString("hl_parameter", str).apply();
                mo78313d(str, locale);
                z2 = true;
            }
        }
        if (z || z2) {
            C8506p pVar = (C8506p) h.get(this.f230128a.getString("hl_parameter", BuildConfig.FLAVOR));
            if (pVar == null || pVar.f29515c.size() == 0) {
                g = null;
            } else {
                String str2 = ((C8508r) pVar.f29515c.get(0)).f29520b;
                if (str2 == null || str2.equals(g) || C92654a.m152605b(((C92541i) this.f230132e.mo27525b()).mo87316a(), g) == null) {
                    g = str2;
                }
            }
            mo78315f(g);
        }
        if (!z2 && !z) {
            this.f230128a.edit().putString("selected_search_language", "English (US)").putString("hl_parameter", "en-US").putInt("search_language_state", 1).apply();
        }
    }

    /* renamed from: f */
    public final void mo78315f(String str) {
        bm bmVar = (bm) this.f230130c.mo27525b();
        if (str != null) {
            this.f230128a.edit().putBoolean("voice_language_present", true).apply();
            String ae = this.f230129b.mo83885ae();
            C8460ac b = C92654a.m152605b(((C92541i) this.f230132e.mo27525b()).mo87316a(), str);
            if (b == null) {
                return;
            }
            if (!this.f230129b.mo83878aO() || !this.f230129b.mo83885ae().equals(str)) {
                String str2 = b.f29383c;
                if (!ae.equals(str2)) {
                    this.f230129b.mo83906az(str2, new ArrayList(), true);
                    if (bmVar != null && !bmVar.u()) {
                        mo78312c(str2, EventForDump.m147676e(3, "updateVoiceLanguageList ".concat(String.valueOf(str2))));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        this.f230128a.edit().putBoolean("voice_language_present", false).apply();
    }
}
