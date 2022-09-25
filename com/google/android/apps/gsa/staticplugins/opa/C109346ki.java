package com.google.android.apps.gsa.staticplugins.opa;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.C0826b;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.shared.C73841bf;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.g.d.j;
import com.google.android.apps.gsa.g.d.m;
import com.google.android.apps.gsa.p8889z.p8890a.C118843f;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.actions.util.TtsRequest;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7148ui.p7155g.C90685b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91005e;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108230ba;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108262cf;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68226l;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ki */
/* compiled from: PG */
public final class C109346ki implements C87682aj, C90991b {

    /* renamed from: a */
    public static final C59071e f304572a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.ki");

    /* renamed from: b */
    public final C109360kw f304573b;

    /* renamed from: c */
    public final boolean f304574c;

    /* renamed from: d */
    public final LinkedList f304575d = new LinkedList();

    /* renamed from: e */
    public boolean f304576e;

    /* renamed from: f */
    public boolean f304577f;

    /* renamed from: g */
    int f304578g;

    /* renamed from: h */
    private final C108230ba f304579h;

    /* renamed from: i */
    private final C109740nn f304580i;

    /* renamed from: j */
    private final C109345kh f304581j;

    /* renamed from: k */
    private final C68214a f304582k;

    /* renamed from: l */
    private final C21370a f304583l;

    /* renamed from: m */
    private final C86124t f304584m;

    /* renamed from: n */
    private final SharedPreferences f304585n;

    /* renamed from: o */
    private final C90929bz f304586o;

    /* renamed from: p */
    private final Context f304587p;

    /* renamed from: q */
    private final C68214a f304588q;

    /* renamed from: r */
    private final long f304589r;

    /* renamed from: s */
    private final C68214a f304590s;

    /* renamed from: t */
    private final C68214a f304591t;

    /* renamed from: u */
    private final C68214a f304592u;

    /* renamed from: v */
    private final C109430lc f304593v;

    /* renamed from: w */
    private C109355kr f304594w;

    /* renamed from: x */
    private boolean f304595x;

    /* renamed from: y */
    private C60870cx f304596y;

    /* renamed from: z */
    private C60870cx f304597z;

    public C109346ki(C108230ba baVar, C109740nn nnVar, C109345kh khVar, C86124t tVar, C68214a aVar, C21370a aVar2, C90929bz bzVar, SharedPreferences sharedPreferences, Context context, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6, C68214a aVar7, C68214a aVar8, boolean z) {
        this.f304579h = baVar;
        this.f304580i = nnVar;
        this.f304581j = khVar;
        this.f304582k = aVar;
        this.f304583l = aVar2;
        this.f304584m = tVar;
        this.f304586o = bzVar;
        this.f304585n = sharedPreferences;
        this.f304587p = context;
        this.f304578g = 1;
        this.f304588q = aVar3;
        this.f304589r = (long) ((int) tVar.mo79743a(C90014bt.f247455hV));
        this.f304590s = aVar4;
        this.f304591t = aVar5;
        this.f304592u = aVar6;
        baVar.getClass();
        C68214a a = C68219e.m98518a(((C68226l) ((C109431ld) aVar7.mo27525b()).f304760a).f184585a);
        a.getClass();
        C109430lc lcVar = new C109430lc(baVar, a);
        this.f304593v = lcVar;
        C109361kx kxVar = (C109361kx) aVar8.mo27525b();
        C68214a a2 = C68219e.m98518a(((C68226l) kxVar.f304640a).f184585a);
        a2.getClass();
        C68214a a3 = C68219e.m98518a(((C68226l) kxVar.f304641b).f184585a);
        a3.getClass();
        C68214a a4 = C68219e.m98518a(((C68226l) kxVar.f304642c).f184585a);
        a4.getClass();
        C68214a a5 = C68219e.m98518a(((C68226l) kxVar.f304643d).f184585a);
        a5.getClass();
        this.f304573b = new C109360kw(lcVar, a2, a3, a4, a5);
        this.f304574c = z;
    }

    /* renamed from: b */
    public static String m182023b(C58495hd hdVar) {
        StringBuilder sb = new StringBuilder();
        if (hdVar != null) {
            C58800sl lA = hdVar.entrySet().iterator();
            while (lA.hasNext()) {
                sb.append("\"");
                sb.append((String) ((Map.Entry) lA.next()).getKey());
                sb.append("\"\n");
            }
        }
        return sb.length() > 0 ? sb.substring(0, sb.length() - 1) : BuildConfig.FLAVOR;
    }

    /* renamed from: j */
    private final C60870cx m182024j() {
        int a = (int) this.f304584m.mo79743a(C90014bt.f247456hW);
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (m182028n()) {
            hashMap.put("Turn off airplane mode", 1000);
            hashMap2.put(25, 1000);
        }
        m mVar = (m) this.f304582k.mo27525b();
        String b = ((bm) this.f304592u.mo27525b()).b();
        Query aU = Query.f252741b.mo84245H(1, true, (QueryTriggerType) null).mo84284aU(C90685b.m148054b(this.f304587p, this.f304584m));
        boolean z = this.f304595x;
        C58833ax k = C58833ax.m90834k(Integer.valueOf(a));
        return mVar.d.mo85141f(mVar.b(mVar.c, b, mVar.d), new j(mVar, aU, z, b, hashMap, hashMap2, k));
    }

    /* renamed from: k */
    private final void m182025k(C109355kr krVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f304579h.mo95405ap()) {
            m182027m();
            return;
        }
        this.f304579h.mo95430s(krVar.mo97796b());
        this.f304579h.mo95411av();
        C109430lc lcVar = this.f304593v;
        krVar.mo97796b().mo95829g();
        long a = C109430lc.m182113a(krVar);
        C109430lc.m182114b(a);
        lcVar.f304758a.mo95369K(false, a, C58833ax.m90833j((String) krVar.mo97797c().map(C109363kz.f304645a).orElse(null)).mo56106b(C109362ky.f304644a));
    }

    /* renamed from: l */
    private final void m182026l() {
        C109355kr krVar = (C109355kr) this.f304575d.peek();
        if (krVar != null) {
            boolean z = krVar.mo97796b() instanceof C108262cf;
            if (this.f304576e || !z || (krVar.mo97798d().isPresent() && m182029o())) {
                mo97778e();
                return;
            }
            this.f304577f = true;
            this.f304586o.mo85150o(new C109343kf(this), this.f304589r);
            return;
        }
        this.f304581j.mo97474aj();
    }

    /* renamed from: m */
    private final void m182027m() {
        C22872h.m42743c(C0826b.class);
        this.f304575d.clear();
        this.f304578g = 1;
    }

    /* renamed from: n */
    private final boolean m182028n() {
        return ((C89037bh) this.f304588q.mo27525b()).mo27384j();
    }

    /* renamed from: o */
    private final boolean m182029o() {
        return ((C118843f) this.f304590s.mo27525b()).mo71744e() != 0;
    }

    /* renamed from: a */
    public final String mo97777a(int i) {
        return ((C73841bf) this.f304591t.mo27525b()).mo65322a().getString(i);
    }

    /* renamed from: e */
    public final void mo97778e() {
        this.f304576e = false;
        if (!this.f304575d.isEmpty()) {
            this.f304594w = (C109355kr) this.f304575d.removeFirst();
            if (this.f304579h.mo95405ap()) {
                m182027m();
            } else if (!this.f304594w.mo97798d().isPresent() || !m182029o()) {
                m182025k(this.f304594w);
                m182026l();
            } else {
                C58976aa aaVar = C58975e.f156826a;
                this.f304580i.mo97488ax(new TtsRequest((String) this.f304594w.mo97798d().get(), false));
                this.f304578g = 2;
                this.f304596y = this.f304586o.mo85144i(new C109344kg(this), (long) ((int) this.f304584m.mo79743a(C90014bt.f247457hX)));
            }
        } else {
            this.f304581j.mo97474aj();
        }
    }

    /* renamed from: f */
    public final void mo97779f() {
        if (this.f304578g == 1 && !this.f304577f) {
            m182026l();
        }
    }

    /* renamed from: fM */
    public final void mo19965fM(ServiceEventData serviceEventData) {
        C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
        if (a == null) {
            a = C88244um.ATTACH_WEBVIEW;
        }
        C58976aa aaVar = C58975e.f156826a;
        int ordinal = a.ordinal();
        if (ordinal != 31) {
            if (ordinal != 32) {
                if (ordinal == 60) {
                    m182027m();
                } else if (ordinal == 62) {
                    this.f304595x = true;
                } else if (ordinal == 63) {
                    this.f304595x = false;
                }
            } else if (this.f304578g == 2) {
                C60870cx cxVar = this.f304596y;
                if (cxVar != null && !cxVar.isDone()) {
                    this.f304596y.cancel(false);
                }
                this.f304597z = this.f304586o.mo85144i(new C109340kc(this), 0);
                this.f304578g = 3;
                m182025k(this.f304594w);
            }
        } else if (this.f304578g == 3) {
            C60870cx cxVar2 = this.f304597z;
            if (cxVar2 != null && !cxVar2.isDone()) {
                this.f304597z.cancel(false);
            }
            this.f304578g = 1;
            mo97778e();
        }
    }

    /* renamed from: g */
    public final void mo97780g(String str, C109354kq kqVar) {
        LinkedList linkedList = this.f304575d;
        C113896v vVar = new C113896v();
        vVar.mo97792d(str, 123402);
        linkedList.addLast(vVar.mo97789a().mo97799g(kqVar));
        mo97779f();
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("OfflineOpaManager");
        C91005e c = fVar.mo85279c("tts_playback_state");
        int i = this.f304578g;
        int i2 = i - 1;
        C88244um umVar = C88244um.ATTACH_WEBVIEW;
        if (i != 0) {
            c.mo85276a(C90752i.m148229c(i2 != 0 ? i2 != 1 ? i2 != 2 ? "UNKNOWN" : "AWAIT_PLAYBACK_DONE" : "AWAIT_PLAYBACK_START" : "IDLE"));
            fVar.mo85279c("waiting_for_delayed_bubble").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f304577f)));
            fVar.mo85279c("has_telephony").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f304595x)));
            fVar.mo85279c("request_queue_size").mo85276a(C90752i.m148230d(Integer.valueOf(this.f304575d.size())));
            if (this.f304594w != null) {
                fVar.mo85279c("last_request_had_tts").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f304594w.mo97798d().isPresent())));
                return;
            }
            return;
        }
        throw null;
    }

    /* renamed from: h */
    public final void mo97781h(String str, String str2, C109354kq kqVar) {
        LinkedList linkedList = this.f304575d;
        C113896v vVar = new C113896v();
        vVar.f315349b = Optional.m71637of(str);
        vVar.mo97792d(str2, 123403);
        linkedList.addLast(vVar.mo97789a().mo97799g(kqVar));
        mo97779f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo97782i(int i, C109354kq kqVar) {
        String str;
        String str2;
        m182027m();
        if (m182028n()) {
            str2 = mo97777a(R.string.opa_offline_airplane_mode_indicator);
            str = str2;
        } else {
            str2 = mo97777a(R.string.opa_offline_poor_connectivity_indicator_tts);
            str = mo97777a(R.string.opa_offline_poor_connectivity_indicator);
        }
        int i2 = 1;
        this.f304576e = true;
        C88244um umVar = C88244um.ATTACH_WEBVIEW;
        if (i - 1 != 0) {
            this.f304586o.mo85147l(m182024j(), new C109342ke(this, kqVar, str2, str));
            return;
        }
        String string = this.f304585n.getString("opa_offline_voice_tips_shown_date", "null");
        int i3 = this.f304585n.getInt("opa_offline_voice_tips_shown_times", 0);
        C58976aa aaVar = C58975e.f156826a;
        long b = this.f304583l.mo26870b();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(b);
        String format = simpleDateFormat.format(instance.getTime());
        int a = (int) this.f304584m.mo79743a(C90014bt.f247458hY);
        if (format.equals(string)) {
            if (i3 >= a) {
                mo97781h(str2, str, kqVar);
                return;
            }
            i2 = 1 + i3;
        }
        this.f304585n.edit().putString("opa_offline_voice_tips_shown_date", format).putInt("opa_offline_voice_tips_shown_times", i2).apply();
        this.f304586o.mo85147l(m182024j(), new C109341kd(this, str2, str, kqVar));
    }
}
