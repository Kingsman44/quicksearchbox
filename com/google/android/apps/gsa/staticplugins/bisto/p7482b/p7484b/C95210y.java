package com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.LocaleList;
import android.speech.tts.TextToSpeech;
import android.speech.tts.UtteranceProgressListener;
import android.speech.tts.Voice;
import androidx.core.p094f.C1894g;
import androidx.core.p094f.C1897j;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7483a.C95173c;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95294af;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95295ag;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.apps.gsa.staticplugins.bisto.p7518t.p7519a.C95873a;
import com.google.common.base.C58837ba;
import com.google.common.base.C58890d;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60872cz;
import com.google.common.util.concurrent.C60888db;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.b.b.y */
/* compiled from: PG */
public final class C95210y extends C95173c implements AutoCloseable {

    /* renamed from: j */
    public static final C59071e f266359j = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.b.b.y");

    /* renamed from: k */
    static final long f266360k = TimeUnit.SECONDS.toMillis(2);

    /* renamed from: A */
    private final C89656k f266361A;

    /* renamed from: l */
    public final Object f266362l = new Object();

    /* renamed from: m */
    public final C95207v f266363m;

    /* renamed from: n */
    public boolean f266364n;

    /* renamed from: o */
    public final List f266365o = new ArrayList();

    /* renamed from: p */
    public boolean f266366p;

    /* renamed from: q */
    public boolean f266367q;

    /* renamed from: r */
    public Runnable f266368r;

    /* renamed from: s */
    public C60872cz f266369s;

    /* renamed from: t */
    public C95294af f266370t;

    /* renamed from: u */
    public C95294af f266371u;

    /* renamed from: v */
    public final UtteranceProgressListener f266372v = new C95202q(this);

    /* renamed from: w */
    public C95174a f266373w;

    /* renamed from: x */
    private final C60888db f266374x;

    /* renamed from: y */
    private final C95295ag f266375y;

    /* renamed from: z */
    private final Context f266376z;

    public C95210y(C60888db dbVar, C95295ag agVar, C89656k kVar, Context context, C95850a aVar, String str) {
        super("TtsPlayer:".concat(String.valueOf(str)), dbVar, kVar);
        this.f266374x = dbVar;
        this.f266363m = new C95207v(dbVar);
        this.f266375y = agVar;
        C58976aa aaVar = C58975e.f156826a;
        aVar.f268408a.add(this);
        mo89083d(context);
        this.f266376z = context;
        this.f266361A = kVar;
    }

    /* renamed from: f */
    public static String m157364f(C89656k kVar) {
        String d = kVar.mo83549d("language_settings_primary_assistant_language:".concat(String.valueOf(kVar.mo83549d("GSAPrefs.google_account"))));
        C58976aa aaVar = C58975e.f156826a;
        return d;
    }

    /* renamed from: g */
    public static String m157365g(Context context, C89656k kVar) {
        String languageTags = C1897j.m5167d(C1894g.m5157a(context.getResources().getConfiguration())).f5774b.f5775a.toLanguageTags();
        String languageTags2 = C1897j.m5167d(C1894g.m5157a(Resources.getSystem().getConfiguration())).f5774b.f5775a.toLanguageTags();
        if (!languageTags.equals(languageTags2)) {
            C59104x d = f266359j.mo56226d();
            d.mo56378ag(C58975e.f156826a, "TtsPlayer");
            ((C59052c) ((C59052c) d).mo56372aa(14607)).mo56354G("Language mismatch: %s vs %s", languageTags, languageTags2);
        }
        if (languageTags.isEmpty()) {
            C59104x d2 = f266359j.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "TtsPlayer");
            ((C59052c) ((C59052c) d2).mo56372aa(14609)).mo56386p("No phone locale");
        }
        String f = m157364f(kVar);
        if (C58837ba.m90859h(f)) {
            return languageTags;
        }
        String languageTag = Locale.forLanguageTag(f).toLanguageTag();
        if (languageTag.isEmpty() || C58890d.m90990e(languageTag, "und")) {
            C59104x d3 = f266359j.mo56226d();
            d3.mo56378ag(C58975e.f156826a, "TtsPlayer");
            ((C59052c) ((C59052c) d3).mo56372aa(14608)).mo56386p("No Assistant language");
            return languageTags;
        } else if (languageTags.contains(languageTag)) {
            return languageTags;
        } else {
            return languageTags + "," + languageTag;
        }
    }

    /* renamed from: n */
    public static Optional m157366n() {
        LocaleList locales = Resources.getSystem().getConfiguration().getLocales();
        if (!locales.isEmpty()) {
            return Optional.ofNullable(locales.get(0));
        }
        C59104x d = f266359j.mo56226d();
        d.mo56378ag(C58975e.f156826a, "TtsPlayer");
        ((C59052c) ((C59052c) d).mo56372aa(14604)).mo56386p("Phone locales are empty");
        return Optional.empty();
    }

    /* renamed from: o */
    private final int m157367o(C95205t tVar, C95174a aVar) {
        if (mo89119k()) {
            return 0;
        }
        synchronized (this.f266362l) {
            if (this.f266368r != null) {
                return 2;
            }
            this.f266368r = new C95200o(this, tVar, aVar);
            this.f266369s = this.f266374x.mo29164d(new C95201p(this, aVar), f266360k, TimeUnit.MILLISECONDS);
            return 1;
        }
    }

    /* renamed from: p */
    private final boolean m157368p(C95174a aVar) {
        synchronized (this.f266362l) {
            if (!mo89119k()) {
                C58976aa aaVar = C58975e.f156826a;
                return false;
            }
            mo89118j();
            this.f266373w = aVar;
            return true;
        }
    }

    public final void close() {
        mo89117i(this.f266376z);
    }

    /* renamed from: e */
    public final void mo89084e(Context context) {
        C58976aa aaVar = C58975e.f156826a;
        this.f266374x.execute(new C95198m(this, context));
    }

    /* renamed from: h */
    public final void mo89116h() {
        synchronized (this.f266362l) {
            this.f266368r = null;
            C60872cz czVar = this.f266369s;
            if (czVar != null) {
                czVar.cancel(false);
                this.f266369s = null;
            }
            this.f266367q = false;
            this.f266373w = null;
            this.f266370t = null;
        }
    }

    /* renamed from: i */
    public final void mo89117i(Context context) {
        synchronized (this.f266362l) {
            if (this.f266364n) {
                this.f266364n = false;
                try {
                    context.unregisterReceiver(this.f266363m);
                } catch (IllegalArgumentException e) {
                    C59104x d = f266359j.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "TtsPlayer");
                    ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(14613)).mo56386p("TtsPlayer receiver not registered.");
                }
            }
        }
        TextToSpeech textToSpeech = null;
        this.f266363m.f266356a = null;
        C58976aa aaVar = C58975e.f156826a;
        synchronized (this.f266279d) {
            TextToSpeech textToSpeech2 = this.f266282g;
            if (textToSpeech2 != null) {
                this.f266282g = null;
                textToSpeech = textToSpeech2;
            }
            this.f266283h = false;
            this.f266284i = 3;
        }
        if (textToSpeech != null) {
            textToSpeech.shutdown();
        }
    }

    /* renamed from: j */
    public final void mo89118j() {
        C58976aa aaVar = C58975e.f156826a;
        mo89116h();
        synchronized (this.f266279d) {
            TextToSpeech textToSpeech = this.f266282g;
            if (textToSpeech != null && textToSpeech.isSpeaking()) {
                textToSpeech.stop();
            }
        }
    }

    /* renamed from: k */
    public final boolean mo89119k() {
        boolean z;
        boolean z2;
        synchronized (this.f266279d) {
            z = this.f266283h;
        }
        if (!z) {
            return false;
        }
        synchronized (this.f266362l) {
            z2 = this.f266366p;
        }
        return z2;
    }

    /* renamed from: l */
    public final boolean mo89120l(C95209x xVar, C95174a aVar) {
        TextToSpeech a;
        int speak;
        C58976aa aaVar = C58975e.f156826a;
        int o = m157367o(new C95203r(this, xVar, aVar), aVar);
        if (o == 1) {
            return true;
        }
        if (o == 2 || (a = mo89080a()) == null || !m157368p(aVar)) {
            return false;
        }
        Optional n = m157366n();
        if (n.isEmpty() || C58837ba.m90859h(((Locale) n.get()).toLanguageTag())) {
            C59104x d = f266359j.mo56226d();
            d.mo56378ag(C58975e.f156826a, "TtsPlayer");
            ((C59052c) ((C59052c) d).mo56372aa(14610)).mo56386p("Locale is unknown");
        } else {
            int language = a.setLanguage((Locale) n.get());
            if (language < 0) {
                C59104x d2 = f266359j.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "TtsPlayer");
                ((C59052c) ((C59052c) d2).mo56372aa(14612)).mo56352E("tts.setLanguage(%s) returned error, %d", n, language);
            }
            Optional n2 = m157366n();
            String f = m157364f(this.f266361A);
            if (!n2.isEmpty() && !C58837ba.m90859h(f) && C58890d.m90990e(f, ((Locale) n2.get()).toLanguageTag())) {
                String d3 = this.f266361A.mo83549d("assistant_settings_preferred_voice:".concat(String.valueOf(this.f266361A.mo83549d("GSAPrefs.google_account"))));
                if (!C58837ba.m90859h(d3) && !C58890d.m90990e(d3, "DEFAULT_NO_PREFERENCE")) {
                    String replace = d3.replace("VOICE_", BuildConfig.FLAVOR);
                    Set<Voice> voices = a.getVoices();
                    Optional ofNullable = Optional.ofNullable(a.getDefaultVoice());
                    if (voices == null || voices.isEmpty()) {
                        C59104x b = f266359j.mo56224b();
                        b.mo56378ag(C58975e.f156826a, "TtsPlayer");
                        ((C59052c) ((C59052c) b).mo56372aa(14603)).mo56386p("tts.getVoices() is null or empty");
                    } else {
                        Optional findFirst = Collection.EL.stream(voices).filter(new C95199n(replace)).findFirst();
                        if (findFirst.isPresent()) {
                            ofNullable = findFirst;
                        }
                    }
                    if (ofNullable.isPresent()) {
                        C59104x b2 = f266359j.mo56224b();
                        b2.mo56378ag(C58975e.f156826a, "TtsPlayer");
                        ((C59052c) ((C59052c) b2).mo56372aa(14611)).mo56389s("chosenVoice is : %s", ((Voice) ofNullable.get()).getName());
                        a.setVoice((Voice) ofNullable.get());
                    }
                }
            }
        }
        String c = mo89082c();
        synchronized (this.f266362l) {
            this.f266367q = true;
            Bundle bundle = new Bundle();
            if (Locale.getDefault().equals(Locale.US)) {
                bundle.putString("com.google.android.tts:UseGoogleOnlyVoice", "hol");
                bundle.putString("com.google.android.tts:Mode", "NetworkFirst");
            }
            bundle.putString("com.google.android.tts:NetworkTimeout", Long.toString(500));
            this.f266370t = this.f266375y.mo89222a();
            this.f266371u = null;
            speak = a.speak(xVar.f266358a, 0, bundle, c);
        }
        if (speak != 0) {
            mo89116h();
            return false;
        }
        int i = C95873a.f268446a;
        try {
            if (a.getVoice() != null) {
                a.getVoice().toString();
            }
        } catch (NullPointerException e) {
            C59104x d4 = f266359j.mo56226d();
            d4.mo56378ag(C58975e.f156826a, "TtsPlayer");
            ((C59052c) ((C59052c) ((C59052c) d4).mo56382g(e)).mo56372aa(14622)).mo56386p("Failed to get voice");
        }
        return true;
    }

    /* renamed from: m */
    public final boolean mo89121m(long j, C95174a aVar) {
        C58976aa aaVar = C58975e.f156826a;
        int o = m157367o(new C95204s(this, j, aVar), aVar);
        if (o == 1) {
            return true;
        }
        if (o == 2) {
            return false;
        }
        TextToSpeech a = mo89080a();
        synchronized (this.f266362l) {
            if (a != null) {
                if (m157368p(aVar)) {
                    this.f266367q = true;
                    if (a.playSilentUtterance(j, 0, mo89082c()) != 0) {
                        mo89116h();
                        return false;
                    }
                    int i = C95873a.f268446a;
                    return true;
                }
            }
            return false;
        }
    }
}
