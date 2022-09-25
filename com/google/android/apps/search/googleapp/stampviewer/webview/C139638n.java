package com.google.android.apps.search.googleapp.stampviewer.webview;

import android.net.Uri;
import android.support.p031v4.app.C0154a;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139336r;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139343y;
import com.google.android.apps.search.googleapp.stampviewer.p10493e.C139382a;
import com.google.android.apps.search.googleapp.stampviewer.p10494f.C139392b;
import com.google.android.apps.search.googleapp.stampviewer.preview.C139483z;
import com.google.android.apps.search.googleapp.stampviewer.webview.p10500a.C139507b;
import com.google.android.apps.search.googleapp.stampviewer.webview.p10501b.C139521b;
import com.google.android.apps.search.googleapp.stampviewer.webview.p10503d.C139541b;
import com.google.android.apps.search.googleapp.stampviewer.webview.p10504e.C139554e;
import com.google.android.apps.search.googleapp.stampviewer.webview.p10504e.C139556g;
import com.google.android.apps.search.googleapp.stampviewer.webview.p10504e.C139563n;
import com.google.android.apps.search.googleapp.stampviewer.webview.p10505f.C139580c;
import com.google.android.apps.search.googleapp.stampviewer.webview.p10505f.C139603r;
import com.google.android.apps.search.googleapp.stampviewer.webview.p10510g.C139610b;
import com.google.android.apps.search.googleapp.stampviewer.webview.p10511h.C139620b;
import com.google.android.apps.search.googleapp.stampviewer.webview.p10512i.C139630c;
import com.google.android.apps.search.googleapp.stampviewer.webview.postmessage.AmpPostMessageConfig;
import com.google.android.apps.search.googleapp.stampviewer.webview.postmessage.C139654d;
import com.google.android.apps.search.googleapp.stampviewer.webview.postmessage.C139655e;
import com.google.android.apps.search.googleapp.urlhandler.C139795f;
import com.google.android.apps.search.googleapp.urlhandler.C139798i;
import com.google.android.apps.search.googleapp.urlhandler.C139823j;
import com.google.android.apps.search.googleapp.urlhandler.C139851q;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37259h;
import com.google.android.libraries.web.base.C43255f;
import com.google.android.libraries.web.base.C43257h;
import com.google.android.libraries.web.base.C43262m;
import com.google.android.libraries.web.contrib.errorpage.C43515c;
import com.google.android.libraries.web.contrib.requestblock.RequestBlockMixin;
import com.google.android.libraries.web.p3353c.C43376u;
import com.google.android.libraries.web.p3353c.C43377v;
import com.google.android.libraries.web.p3420k.C43861g;
import com.google.android.libraries.web.postmessage.C43952c;
import com.google.android.libraries.web.postmessage.internal.C43960g;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.common.android.p4521a.C58274c;
import com.google.common.base.C58872ci;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56610b;
import com.google.protobuf.C62921ba;
import dagger.hilt.android.internal.managers.C68324h;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
import p3186j$.time.Duration;
import p3186j$.util.Optional;
import p5488io.p5490b.p5494b.C69803b;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.webview.n */
/* compiled from: PG */
public final class C139638n {

    /* renamed from: a */
    public static final C59071e f379570a = C59071e.m91332i("com.google.android.apps.search.googleapp.stampviewer.webview.n");

    /* renamed from: A */
    private final C43377v f379571A;

    /* renamed from: B */
    private final C139795f f379572B;

    /* renamed from: C */
    private final AtomicReference f379573C;

    /* renamed from: D */
    private final C37215b f379574D;

    /* renamed from: E */
    private final boolean f379575E;

    /* renamed from: F */
    private final C139603r f379576F;

    /* renamed from: G */
    private final boolean f379577G;

    /* renamed from: b */
    public final AccountId f379578b;

    /* renamed from: c */
    public final C139392b f379579c;

    /* renamed from: d */
    public final C139618h f379580d;

    /* renamed from: e */
    public final C43952c f379581e;

    /* renamed from: f */
    public final C139654d f379582f;

    /* renamed from: g */
    public final ArrayDeque f379583g;

    /* renamed from: h */
    public final C139554e f379584h;

    /* renamed from: i */
    public final C28306ab f379585i;

    /* renamed from: j */
    public final RequestBlockMixin f379586j;

    /* renamed from: k */
    public final C62921ba f379587k;

    /* renamed from: l */
    public final C139516ac f379588l;

    /* renamed from: m */
    public final AccessibilityManager f379589m;

    /* renamed from: n */
    public final C58872ci f379590n = new C58872ci(C58274c.f155808a);

    /* renamed from: o */
    public final C139382a f379591o;

    /* renamed from: p */
    public final C139336r f379592p;

    /* renamed from: q */
    public boolean f379593q;

    /* renamed from: r */
    public boolean f379594r = false;

    /* renamed from: s */
    public boolean f379595s = false;

    /* renamed from: t */
    public C139343y f379596t = C139343y.VIEWER_MODE_UNSPECIFIED;

    /* renamed from: u */
    public C139483z f379597u;

    /* renamed from: v */
    public C69803b f379598v = null;

    /* renamed from: w */
    public C69803b f379599w = null;

    /* renamed from: x */
    public boolean f379600x = false;

    /* renamed from: y */
    public C69803b f379601y;

    /* renamed from: z */
    private final C43262m f379602z;

    public C139638n(AccountId accountId, C139392b bVar, C43262m mVar, C43377v vVar, C139554e eVar, C139618h hVar, C43960g gVar, C139654d dVar, C28306ab abVar, RequestBlockMixin requestBlockMixin, C139795f fVar, C62921ba baVar, C139516ac acVar, boolean z, AccessibilityManager accessibilityManager, AtomicReference atomicReference, C37215b bVar2, Optional optional, C139382a aVar, C139603r rVar, C139336r rVar2) {
        C139392b bVar3 = bVar;
        this.f379578b = accountId;
        this.f379579c = bVar3;
        this.f379580d = hVar;
        this.f379602z = mVar;
        this.f379571A = vVar;
        this.f379584h = eVar;
        this.f379585i = abVar;
        C43960g gVar2 = gVar;
        this.f379581e = gVar.mo46957a(AmpPostMessageConfig.f379611b);
        this.f379582f = dVar;
        this.f379583g = new ArrayDeque();
        this.f379593q = true;
        this.f379586j = requestBlockMixin;
        this.f379572B = fVar;
        this.f379587k = baVar;
        this.f379588l = acVar;
        this.f379589m = accessibilityManager;
        this.f379573C = atomicReference;
        if (bVar3.f379033c) {
            this.f379594r = true;
        }
        this.f379574D = bVar2;
        this.f379592p = rVar2;
        this.f379577G = z;
        this.f379575E = !((Boolean) optional.orElse(false)).booleanValue();
        this.f379591o = aVar;
        this.f379576F = rVar;
        C139343y a = C139343y.m226483a(bVar3.f379037g);
        a = a == null ? C139343y.VIEWER_MODE_UNSPECIFIED : a;
        this.f379596t = a;
        if (a == C139343y.VIEWER_MODE_UNSPECIFIED) {
            this.f379596t = C139343y.VIEWER_MODE_FULLSCREEN;
        }
    }

    /* renamed from: a */
    public final void mo115118a() {
        if (((C139630c) this.f379580d.getChildFragmentManager().f634a.mo671c("URL_BAR")) == null) {
            AccountId accountId = this.f379578b;
            C139392b bVar = this.f379579c;
            C139630c cVar = new C139630c();
            C68324h.m98669f(cVar);
            C47247a.m84047b(cVar, accountId);
            C47243l.m84039a(cVar, bVar);
            C0154a aVar = new C0154a(this.f379580d.getChildFragmentManager());
            aVar.mo511h(R.id.googleapp_stamp_viewer_url_bar, cVar, "URL_BAR", 1);
            aVar.mo509f();
        }
        if (((C139507b) this.f379580d.getChildFragmentManager().f634a.mo671c("BADGE_CONTAINER")) == null) {
            C139507b a = C139507b.m226733a(this.f379578b, this.f379579c);
            C0154a aVar2 = new C0154a(this.f379580d.getChildFragmentManager());
            aVar2.mo511h(R.id.googleapp_badge_container, a, "BADGE_CONTAINER", 1);
            aVar2.mo509f();
        }
        if (((C139521b) this.f379580d.getChildFragmentManager().f634a.mo671c("CLOSE_ACTIVITY_BUTTON_CONTAINER")) == null) {
            AccountId accountId2 = this.f379578b;
            C139521b bVar2 = new C139521b();
            C68324h.m98669f(bVar2);
            C47247a.m84047b(bVar2, accountId2);
            C0154a aVar3 = new C0154a(this.f379580d.getChildFragmentManager());
            aVar3.mo511h(R.id.googleapp_stamp_viewer_close_activity_button_container, bVar2, "CLOSE_ACTIVITY_BUTTON_CONTAINER", 1);
            aVar3.mo509f();
        }
        if (((C139620b) this.f379580d.getChildFragmentManager().f634a.mo671c("SHARE_ACTION_BUTTON_CONTAINER")) == null) {
            AccountId accountId3 = this.f379578b;
            C139392b bVar3 = this.f379579c;
            C139620b bVar4 = new C139620b();
            C68324h.m98669f(bVar4);
            C47247a.m84047b(bVar4, accountId3);
            C47243l.m84039a(bVar4, bVar3);
            C0154a aVar4 = new C0154a(this.f379580d.getChildFragmentManager());
            aVar4.mo511h(R.id.googleapp_share_action_button_container, bVar4, "SHARE_ACTION_BUTTON_CONTAINER", 1);
            aVar4.mo509f();
        }
        if (this.f379579c.f379036f && ((C139541b) this.f379580d.getChildFragmentManager().f634a.mo671c("HEART_BUTTON_CONTAINER")) == null) {
            AccountId accountId4 = this.f379578b;
            C139392b bVar5 = this.f379579c;
            C139541b bVar6 = new C139541b();
            C68324h.m98669f(bVar6);
            C47247a.m84047b(bVar6, accountId4);
            C47243l.m84039a(bVar6, bVar5);
            C0154a aVar5 = new C0154a(this.f379580d.getChildFragmentManager());
            aVar5.mo511h(R.id.googleapp_stamp_viewer_heart_button_container, bVar6, "HEART_BUTTON_CONTAINER", 1);
            aVar5.mo509f();
        }
        if (this.f379577G && ((C139610b) this.f379580d.getChildFragmentManager().f634a.mo671c("SAVE_ACTION_BUTTON_CONTAINER")) == null) {
            AccountId accountId5 = this.f379578b;
            C139392b bVar7 = this.f379579c;
            C139610b bVar8 = new C139610b();
            C68324h.m98669f(bVar8);
            C47247a.m84047b(bVar8, accountId5);
            C47243l.m84039a(bVar8, bVar7);
            C0154a aVar6 = new C0154a(this.f379580d.getChildFragmentManager());
            aVar6.mo511h(R.id.googleapp_stamp_viewer_save_action_button_container, bVar8, "SAVE_ACTION_BUTTON_CONTAINER", 1);
            aVar6.mo509f();
        }
        if (((C139580c) this.f379580d.getChildFragmentManager().f634a.mo671c("OVERFLOW_MENU_BUTTON_CONTAINER")) == null) {
            AccountId accountId6 = this.f379578b;
            C139392b bVar9 = this.f379579c;
            C139580c cVar2 = new C139580c();
            C68324h.m98669f(cVar2);
            C47247a.m84047b(cVar2, accountId6);
            C47243l.m84039a(cVar2, bVar9);
            C0154a aVar7 = new C0154a(this.f379580d.getChildFragmentManager());
            aVar7.mo511h(true != this.f379576F.mo115089a(this.f379579c) ? R.id.googleapp_stamp_viewer_overflow_menu_button_bottom_container : R.id.googleapp_stamp_viewer_overflow_menu_button_top_container, cVar2, "OVERFLOW_MENU_BUTTON_CONTAINER", 1);
            aVar7.mo509f();
        }
        if (this.f379575E && this.f379580d.getChildFragmentManager().f634a.mo671c("SPINNER_OVERLAY_FRAGMENT_CONTAINER") == null) {
            AccountId accountId7 = this.f379578b;
            C139563n nVar = new C139563n();
            C68324h.m98669f(nVar);
            C47247a.m84047b(nVar, accountId7);
            C0154a aVar8 = new C0154a(this.f379580d.getChildFragmentManager());
            aVar8.mo511h(R.id.googleapp_stamp_viewer_spinner_overlay_fragment_container, nVar, "SPINNER_OVERLAY_FRAGMENT_CONTAINER", 1);
            aVar8.mo509f();
        }
        C43861g gVar = (C43861g) this.f379580d.getChildFragmentManager().f634a.mo671c("WEB_FRAGMENT_CONTAINER");
        if (gVar != null) {
            AccountId accountId8 = this.f379578b;
            C139556g gVar2 = new C139556g();
            C68324h.m98669f(gVar2);
            C47247a.m84047b(gVar2, accountId8);
            C43515c.m76782a(gVar, gVar2);
        }
    }

    /* renamed from: b */
    public final void mo115119b(boolean z) {
        mo115127j(C37182a.f97928dA.mo40806d());
        C56610b bVar = this.f379579c.f379032b;
        if (bVar == null) {
            bVar = C56610b.f151140k;
        }
        if (!bVar.f151151j || z) {
            C56610b bVar2 = this.f379579c.f379032b;
            if (bVar2 == null) {
                bVar2 = C56610b.f151140k;
            }
            mo115120c(Uri.parse(bVar2.f151143b));
            this.f379580d.getActivity().finish();
        }
    }

    /* renamed from: c */
    public final void mo115120c(Uri uri) {
        C139798i iVar = (C139798i) C139823j.f380066m.createBuilder();
        C139851q qVar = C139851q.UNKNOWN;
        iVar.copyOnWrite();
        C139823j jVar = (C139823j) iVar.instance;
        jVar.f380069b = qVar.f380143m;
        jVar.f380068a |= 1;
        iVar.copyOnWrite();
        C139823j jVar2 = (C139823j) iVar.instance;
        jVar2.f380068a |= 512;
        jVar2.f380078k = true;
        String str = (String) this.f379573C.get();
        if (str != null) {
            iVar.copyOnWrite();
            C139823j jVar3 = (C139823j) iVar.instance;
            jVar3.f380068a |= 8;
            jVar3.f380072e = str;
        }
        this.f379572B.mo115250a(uri, (C139823j) iVar.build());
    }

    /* renamed from: d */
    public final void mo115121d() {
        C43262m mVar = this.f379602z;
        C56610b bVar = this.f379579c.f379032b;
        if (bVar == null) {
            bVar = C56610b.f151140k;
        }
        C43255f m = C43257h.m76306m(bVar.f151144c);
        m.f113051b.mo55429h("Referer", "https://www.google.com");
        mVar.mo46333b(m.mo46365k());
    }

    /* renamed from: e */
    public final void mo115122e(C139655e eVar) {
        if (this.f379593q) {
            this.f379583g.addLast(eVar);
            return;
        }
        Optional a = this.f379581e.mo46950a();
        if (a.isPresent()) {
            eVar.mo115146f((C43968o) a.get());
        } else {
            ((C59052c) ((C59052c) f379570a.mo56226d()).mo56372aa(41382)).mo56386p("Failed to send message to Amp document.");
        }
    }

    /* renamed from: f */
    public final void mo115123f() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("state", "MUTED_STATE");
            jSONObject.put("value", this.f379588l.f379333a);
            mo115122e(C139655e.m227076a("setDocumentState", jSONObject));
        } catch (JSONException e) {
            ((C59052c) ((C59052c) ((C59052c) f379570a.mo56226d()).mo56382g(e)).mo56372aa(41383)).mo56386p("Failed to construct muted state message.");
        }
    }

    /* renamed from: g */
    public final void mo115124g(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("state", str);
            mo115122e(C139655e.m227076a("visibilitychange", jSONObject));
        } catch (JSONException e) {
            ((C59052c) ((C59052c) ((C59052c) f379570a.mo56226d()).mo56382g(e)).mo56372aa(41386)).mo56386p("Failed to construct visibility message.");
        }
    }

    /* renamed from: h */
    public final void mo115125h(String str, C89885b bVar) {
        this.f379595s = true;
        C59052c cVar = (C59052c) f379570a.mo56226d();
        cVar.mo56378ag(C38505d.f101863a, Integer.valueOf(bVar.f246280a));
        ((C59052c) cVar.mo56372aa(41387)).mo56389s("Invalid AMP [%s]", str);
    }

    /* renamed from: i */
    public final void mo115126i(boolean z) {
        if (!z) {
            if (this.f379590n.f156708a) {
                C139382a aVar = this.f379591o;
                C56610b bVar = this.f379579c.f379032b;
                if (bVar == null) {
                    bVar = C56610b.f151140k;
                }
                aVar.mo114939a(bVar.f151143b, Duration.ofNanos(this.f379590n.mo56159b()));
            }
            this.f379590n.mo56160e();
        } else if (this.f379584h.mo115053a().f379399b) {
            this.f379590n.mo56160e();
            this.f379590n.mo56161f();
        }
        if (!z) {
            mo115127j(C37182a.f97929dB.mo40806d());
        }
        this.f379594r = z;
        if (!z || !this.f379595s) {
            C43376u a = this.f379571A.mo46468a();
            if (a.f113329b.isEmpty() && (a.f113328a & 64) == 0 && z) {
                mo115121d();
            }
            mo115124g(true != z ? "inactive" : "visible");
            if (z) {
                mo115123f();
                return;
            }
            return;
        }
        mo115119b(false);
    }

    /* renamed from: j */
    public final void mo115127j(C37259h hVar) {
        C139392b bVar = this.f379579c;
        if (bVar.f379035e && !this.f379600x && bVar.f379033c) {
            this.f379600x = true;
            this.f379574D.mo19974a(hVar.mo40781e(C62722b.OK));
        }
    }
}
