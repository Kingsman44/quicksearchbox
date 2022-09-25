package com.google.android.apps.gsa.search.core.google;

import android.content.Context;
import android.media.AudioManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.search.core.C85664bo;
import com.google.android.apps.gsa.search.core.corpora.C85753b;
import com.google.android.apps.gsa.search.core.corpora.WebCorpus;
import com.google.android.apps.gsa.search.core.google.p6796f.C85981c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.android.apps.gsa.shared.search.corpus.Corpus;
import com.google.android.apps.gsa.shared.util.C90734ar;
import com.google.android.apps.gsa.shared.util.C90743b;
import com.google.android.apps.gsa.speech.p7312o.C92542a;
import com.google.common.base.C58831av;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.amo;
import com.google.knowledge.p4671b.C61820m;
import dagger.C68214a;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.search.core.google.ao */
/* compiled from: PG */
public final class C85857ao {

    /* renamed from: a */
    private static final C59071e f232145a = C59071e.m91332i("com.google.android.apps.gsa.search.core.google.ao");

    /* renamed from: b */
    private final C86124t f232146b;

    /* renamed from: c */
    private final C89994f f232147c;

    /* renamed from: d */
    private final C86338r f232148d;

    /* renamed from: e */
    private final C90743b f232149e;

    /* renamed from: f */
    private final C85753b f232150f;

    /* renamed from: g */
    private final C85664bo f232151g;

    /* renamed from: h */
    private final Context f232152h;

    /* renamed from: i */
    private final C68214a f232153i;

    public C85857ao(C86124t tVar, C89994f fVar, C86338r rVar, C90743b bVar, C85753b bVar2, C85664bo boVar, Context context, C68214a aVar) {
        this.f232146b = tVar;
        this.f232147c = fVar;
        this.f232148d = rVar;
        this.f232149e = bVar;
        this.f232150f = bVar2;
        this.f232151g = boVar;
        this.f232152h = context;
        this.f232153i = aVar;
    }

    /* renamed from: a */
    static WebCorpus m137949a(C85753b bVar, Query query) {
        C58838bb.m90868c(bVar.f231875b.mo79409d());
        Corpus b = bVar.f231875b.mo79408b(query.mo84346be());
        if (b instanceof WebCorpus) {
            return (WebCorpus) b;
        }
        return bVar.f231875b.mo79407a();
    }

    /* renamed from: d */
    private static void m137950d(C85981c cVar, String str, boolean z) {
        if (z) {
            cVar.mo79638d("efcl", "1");
        }
        cVar.mo79638d("ttsm", str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo79489b(C85981c cVar, Query query, boolean z) {
        String str;
        String str2;
        Map map;
        C58976aa aaVar = C58975e.f156826a;
        if (query.mo84420dA() && this.f232146b.mo79746e(C90110fh.f250640al) && ((bm) this.f232153i.mo27525b()).u()) {
            cVar.mo79637c(cVar.f232497e, "X-Assistant-Handoff", this.f232146b.mo79758x(C90110fh.f250711q));
        }
        if (z) {
            if ((query.f252765d & 1125899906842624L) == 0) {
                cVar.mo79638d("tch", "6");
            }
            WebCorpus a = m137949a(this.f232150f, query);
            if (!(a == null || (map = a.f252917h) == null)) {
                for (Map.Entry entry : map.entrySet()) {
                    if (!TextUtils.isEmpty((CharSequence) entry.getValue())) {
                        cVar.mo79638d((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
            String bf = query.mo84347bf("android.search.extra.PARENT_EVENT_ID");
            if (bf != null) {
                cVar.mo79638d("ei", bf);
            }
            if (query.mo84452df()) {
                cVar.mo79638d("rcid", Integer.toString(8095));
                if (bf == null) {
                    cVar.mo79638d("ei", BuildConfig.FLAVOR);
                }
            }
        }
        if (query.mo84420dA() || query.mo84379cL() || query.mo84403cj() || query.mo84329bN()) {
            String a2 = C92542a.m152361a(query, this.f232147c);
            if (!TextUtils.isEmpty(a2)) {
                cVar.mo79638d("spknlang", a2);
            }
        }
        cVar.mo79638d("ar", true != query.mo84323bH() ? "0" : "1");
        int i = query.f252777p;
        if (i > 0) {
            cVar.mo79638d("start", Integer.toString(i));
        }
        String bo = query.mo84356bo();
        if (bo != null) {
            cVar.mo79638d("stick", bo);
        }
        String bh = query.mo84349bh();
        if (bh != null) {
            cVar.mo79638d("ludocid", bh);
        }
        String str3 = query.f252769h;
        if (str3 != null) {
            cVar.mo79638d("kgmid", str3);
        }
        String str4 = query.f252757O;
        if (str4 != null) {
            cVar.mo79638d("tbs", str4);
        }
        String bg = query.mo84348bg();
        if (bg != null) {
            cVar.mo79638d("ibp", bg);
        }
        String bl = query.mo84353bl();
        if (bl != null) {
            cVar.mo79638d("rciv", bl);
        }
        String bi = query.mo84350bi();
        if (bi != null) {
            cVar.mo79638d("mlp", bi);
        }
        boolean bV = query.mo84337bV();
        boolean z2 = query.mo84420dA() || query.mo84329bN();
        if (query.mo84413ct()) {
            amo amo = query.f252760R;
            if (amo.ANDROID_AUTO_PROJECTED.equals(amo)) {
                m137950d(cVar, "gearheadds_projected", true);
            } else if (amo.ANDROID_AUTO_PHONE.equals(amo)) {
                m137950d(cVar, "gearheadds_phone", true);
            } else if (amo.ANDROID_AUTO_EMBEDDED.equals(amo)) {
                m137950d(cVar, "android_auto_embedded", true);
            } else {
                C59104x d = f232145a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "QueryMiscHelper");
                ((C59052c) ((C59052c) d).mo56372aa(7860)).mo56386p("AA car has no entry point!");
                m137950d(cVar, "gearheadds", true);
            }
        } else if (query.mo84412cs()) {
            m137950d(cVar, "gearhead", true);
        } else if (bV && z2) {
            m137950d(cVar, "eyesfree", true);
        } else if (this.f232149e.mo85090c()) {
            m137950d(cVar, "a11y", false);
        } else if (z2) {
            m137950d(cVar, "default", false);
        }
        C58495hd hdVar = query.f252779r;
        if (hdVar != null) {
            cVar.f232499g = C85981c.m138234a(hdVar);
        }
        if (query.f252767f == QueryTriggerType.DOODLE) {
            cVar.mo79638d("oi", "ddle");
        }
        if (query.mo84394ca()) {
            cVar.mo79638d("noa", "1");
        }
        String bp = query.mo84357bp();
        if (bp != null) {
            cVar.mo79638d("ved", bp);
        }
        if (!TextUtils.isEmpty(query.mo84352bk()) || !query.mo84392cY() || query.mo84364bx("android.opa.extra.CONVERSATION_DELTA")) {
            mo79490c(cVar);
        }
        boolean bw = query.mo84363bw("android.opa.extra.NGA_NON_VOICE");
        boolean z3 = (query.mo84420dA() || query.mo84379cL()) && !bw;
        String str5 = null;
        if (query.mo84329bN()) {
            str = true != z3 ? "dt-touch" : "dt-vs";
        } else if (query.mo84321bF()) {
            str = z3 ? query.mo84456dj() ? "vs-hw-asst" : "vs-asst" : "asst";
        } else if (z3) {
            str = query.mo84456dj() ? "vs-hw" : query.mo84450de() ? "vs-bt" : query.mo84463dq() ? "vs-hs" : (query.mo84459dm() || query.mo84404ck() || query.mo84363bw("android.opa.extra.MINI_PLATE_ENABLED")) ? "vs-proxy" : (!query.mo84420dA() || !query.mo84434dO() || query.mo84449dd()) ? query.mo84455di() ? "vs-gh-screen-mic" : query.mo84453dg() ? "vs-gh-controller" : query.mo84454dh() ? "vs-gh-hardware" : query.mo84399cf() ? "vs-opa-wear" : "vs" : "vs-opa";
        } else {
            if (query.mo84393cZ() || bw) {
                QueryTriggerType queryTriggerType = query.f252767f;
                if (queryTriggerType == QueryTriggerType.OPA_SUGGESTION_CHIP || queryTriggerType == QueryTriggerType.OPA_CORRECTION_CHIP) {
                    str = "vs-opa-suggestion-chip";
                } else if (queryTriggerType == QueryTriggerType.OPA_TEXT_EDITOR) {
                    str = "opa-text-typing";
                } else if (query.mo84431dL() && !query.mo84449dd()) {
                    str = "vs-opa-text-with-tts";
                }
            } else if (query.mo84399cf() && query.mo84392cY()) {
                str = "vs-opa-wear-text";
            }
            str = null;
        }
        if (str != null) {
            cVar.mo79638d("inm", str);
        }
        String str6 = ((Bundle) C58831av.m90830c(query.f252786y, Bundle.EMPTY)).getInt("android.opa.extra.CLIENT_MODALITY", 0) == 1 ? "typing" : "voice";
        if (query.mo84434dO()) {
            cVar.mo79638d("cm", str6);
        }
        if (query.mo84401ch() && !query.mo84412cs()) {
            str5 = "gmm";
        }
        if (str5 != null) {
            cVar.mo79638d("appent", str5);
        }
        if (query.mo84420dA() && !query.mo84412cs() && query.mo84337bV()) {
            AudioManager audioManager = (AudioManager) this.f232152h.getSystemService("audio");
            if (audioManager.isBluetoothA2dpOn()) {
                str2 = "BT";
            } else if (audioManager.isBluetoothScoOn()) {
                str2 = "BTSCO";
            } else {
                str2 = audioManager.isWiredHeadsetOn() ? "WH" : "PH";
            }
            cVar.mo79637c(cVar.f232497e, "ARO", str2);
        }
        if (query != null && query.mo84397cd()) {
            cVar.mo79638d("rf", "1");
        }
        int i2 = this.f232148d.getInt("amp_custom_tabs_private_api_version", 0);
        if (this.f232148d.getBoolean("use_custom_tabs", true) && i2 >= 7) {
            cVar.mo79638d("ampcct", Integer.toString(i2));
        }
    }

    /* renamed from: c */
    public final void mo79490c(C85981c cVar) {
        C61820m c = this.f232151g.mo79191c();
        C58976aa aaVar = C58975e.f156826a;
        cVar.mo79637c(cVar.f232498f, "X-Client-Opt-In-Context", C90734ar.m148201d(c.toByteArray()));
    }
}
