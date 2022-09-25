package com.google.android.apps.gsa.staticplugins.languagesettings;

import android.content.Context;
import android.support.p033v7.widget.RecyclerView;
import android.telephony.TelephonyManager;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.common.base.C58869cf;
import com.google.common.base.C58903m;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.p395al.p408c.p414c.p416b.C8506p;
import com.google.p395al.p408c.p414c.p416b.C8509s;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.util.LinkedHashMap;
import java.util.Map;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.languagesettings.l */
/* compiled from: PG */
public final class C102667l {

    /* renamed from: a */
    public static final C59071e f286573a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.languagesettings.l");

    /* renamed from: b */
    public static final C58495hd f286574b;

    /* renamed from: c */
    public final Context f286575c;

    /* renamed from: d */
    public final View f286576d;

    /* renamed from: e */
    public final Map f286577e = new LinkedHashMap();

    /* renamed from: f */
    public final TelephonyManager f286578f;

    /* renamed from: g */
    public final C22871g f286579g;

    /* renamed from: h */
    public final C102677u f286580h;

    /* renamed from: i */
    public String f286581i;

    /* renamed from: j */
    public C60870cx f286582j;

    /* renamed from: k */
    public C60870cx f286583k;

    /* renamed from: l */
    private final Map f286584l = new LinkedHashMap();

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("IN", C58485gu.m89832B("hi-IN", "en-IN", "bn", "te", "mr", "ta", "ml", "kn", "gu", "pa"));
        gzVar.mo55429h("US", C58485gu.m89847o("en-US", "es-ES"));
        gzVar.mo55429h("BR", C58485gu.m89847o("pt-BR", "en-US"));
        gzVar.mo55429h("JP", C58485gu.m89846n("ja-JP"));
        gzVar.mo55429h("ID", C58485gu.m89847o("id-ID", "jw"));
        gzVar.mo55429h("RU", C58485gu.m89846n("ru-RU"));
        gzVar.mo55429h("MX", C58485gu.m89847o("es-MX", "en-US"));
        gzVar.mo55429h("TH", C58485gu.m89847o("th-TH", "en-US"));
        gzVar.mo55429h("NG", C58485gu.m89850r("en-US", "pcm", "ha", "ig", "yo"));
        gzVar.mo55429h("DE", C58485gu.m89849q("de-DE", "en-US", "fr-FR", "nl-NL"));
        gzVar.mo55429h("GB", C58485gu.m89846n("en-GB"));
        gzVar.mo55429h("BD", C58485gu.m89847o("bn", "en-US"));
        gzVar.mo55429h("PK", C58485gu.m89849q("ur", "pa", "en-US", "ps"));
        f286574b = gzVar.mo55427f(false);
    }

    public C102667l(Context context, View view, TelephonyManager telephonyManager, C22871g gVar, C102677u uVar) {
        this.f286575c = context;
        this.f286576d = view;
        this.f286578f = telephonyManager;
        this.f286579g = gVar;
        this.f286580h = uVar;
    }

    /* renamed from: g */
    private final C8509s m170242g() {
        try {
            return (C8509s) C62942bv.parseFrom((C62942bv) C8509s.f29522b, C90772bp.m148288O(this.f286575c.getResources(), R.raw.default_search_languages), C62921ba.m95368a());
        } catch (C62974ct e) {
            throw new RuntimeException("Cannot read default languages from resources.", e);
        }
    }

    /* renamed from: h */
    private final synchronized Map m170243h() {
        if (this.f286577e.isEmpty()) {
            for (C8506p pVar : m170242g().f29524a) {
                this.f286577e.put(pVar.f29514b, pVar);
            }
        }
        return this.f286577e;
    }

    /* renamed from: a */
    public final synchronized Map mo93370a() {
        if (this.f286584l.isEmpty()) {
            for (C8506p pVar : m170242g().f29524a) {
                this.f286584l.put(pVar.f29513a, pVar.f29514b);
            }
        }
        return this.f286584l;
    }

    /* renamed from: b */
    public final void mo93371b() {
        C60870cx cxVar = this.f286583k;
        if (cxVar != null) {
            cxVar.cancel(true);
            this.f286583k = null;
        }
    }

    /* renamed from: c */
    public final void mo93372c() {
        C60870cx cxVar = this.f286582j;
        if (cxVar != null) {
            cxVar.cancel(true);
            this.f286582j = null;
        }
    }

    /* renamed from: d */
    public final void mo93373d(String str) {
        LinearLayout linearLayout = (LinearLayout) this.f286576d.findViewById(R.id.discover_feed_language_selected_layout);
        if (str.isEmpty()) {
            linearLayout.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        ((TextView) this.f286576d.findViewById(R.id.discover_feed_language_selected_language)).setText(str);
    }

    /* renamed from: e */
    public final void mo93374e(String str) {
        Map h = m170243h();
        if (!str.isEmpty() && !h.containsKey(str)) {
            str = (String) C58557jl.m90128i(C58869cf.m90936b(new C58903m('-')).mo56153g(str), 0);
            if (!h.containsKey(str)) {
                str = BuildConfig.FLAVOR;
            }
        }
        this.f286581i = str;
        if (str.isEmpty()) {
            mo93373d(BuildConfig.FLAVOR);
        } else {
            mo93373d(((C8506p) Objects.requireNonNull((C8506p) h.get(this.f286581i))).f29513a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo93375f(int i) {
        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) this.f286576d.findViewById(R.id.discover_feed_language_progress);
        RecyclerView recyclerView = (RecyclerView) this.f286576d.findViewById(R.id.discover_feed_language_preferences_layout);
        int i2 = i - 1;
        if (i2 == 0) {
            linearProgressIndicator.setVisibility(0);
            mo93373d(this.f286575c.getString(R.string.discover_feed_language_preference_loading_message));
            recyclerView.setVisibility(8);
        } else if (i2 != 1) {
            linearProgressIndicator.setVisibility(0);
            mo93373d(this.f286575c.getString(R.string.discover_feed_language_preference_sync_message));
            recyclerView.setVisibility(0);
        } else {
            linearProgressIndicator.setVisibility(8);
            recyclerView.setVisibility(0);
        }
    }
}
