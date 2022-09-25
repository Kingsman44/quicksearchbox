package com.google.android.apps.gsa.staticplugins.opa;

import android.app.KeyguardManager;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.p5846e.C74504a;
import com.google.android.apps.gsa.search.core.p6513aj.C84516aa;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.p6930h.C87565h;
import com.google.android.apps.gsa.search.shared.p6930h.C87566i;
import com.google.android.apps.gsa.search.shared.p6930h.C87568k;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.speech.HotwordResultMetadata;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.libraries.p1646ay.C19599a;
import com.google.android.libraries.p1646ay.C19600b;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.md */
/* compiled from: PG */
public final class C109465md extends C19600b {

    /* renamed from: a */
    public static final C59071e f304885a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.md");

    /* renamed from: b */
    public final C89911f f304886b;

    /* renamed from: c */
    HotwordResultMetadata f304887c;

    /* renamed from: d */
    public Uri f304888d;

    /* renamed from: e */
    public boolean f304889e = false;

    /* renamed from: f */
    public boolean f304890f = false;

    /* renamed from: g */
    private final C84516aa f304891g;

    /* renamed from: h */
    private final C86124t f304892h;

    /* renamed from: i */
    private final C58833ax f304893i;

    /* renamed from: j */
    private final C90929bz f304894j;

    /* renamed from: l */
    private boolean f304895l;

    /* renamed from: m */
    private boolean f304896m;

    /* renamed from: n */
    private int f304897n;

    /* renamed from: o */
    private boolean f304898o = false;

    /* renamed from: p */
    private boolean f304899p = false;

    /* renamed from: q */
    private int f304900q;

    /* renamed from: r */
    private int f304901r;

    /* renamed from: s */
    private C109464mc f304902s;

    public C109465md(C84516aa aaVar, C86124t tVar, C58833ax axVar, C90929bz bzVar, C89911f fVar) {
        this.f304891g = aaVar;
        this.f304892h = tVar;
        this.f304893i = axVar;
        this.f304894j = bzVar;
        this.f304886b = fVar;
    }

    /* renamed from: b */
    public final void mo24895b(Bundle bundle) {
        C74504a.m120462a(f.be);
        this.f54539k.mo24861h(bundle);
        C58976aa aaVar = C58975e.f156826a;
        Intent b = this.f54539k.mo24853b();
        if (b != null) {
            this.f304888d = (Uri) b.getParcelableExtra("audio_content_uri");
            this.f304897n = b.getIntExtra("audio_frequency", 0);
            this.f304895l = C87566i.m142297au(b.getExtras());
            this.f304896m = C87566i.m142288al(b.getExtras());
            this.f304887c = HotwordResultMetadata.m147626t(b);
            this.f304901r = b.getIntExtra("num_audio_channels", 1);
            this.f304900q = b.getIntExtra("opa-destination_after_keyguard_dismiss", 0);
        }
        if (this.f304900q == 1) {
            if (!this.f304891g.f230023b.isDeviceLocked()) {
                this.f54539k.setResult(10);
                this.f54539k.mo24855e();
            } else {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.USER_PRESENT");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                this.f304902s = new C109464mc(this);
                C19599a aVar = this.f54539k;
                C109464mc mcVar = this.f304902s;
                mcVar.getClass();
                aVar.registerReceiver(mcVar, intentFilter);
            }
        }
        if (!mo97845n()) {
            ((KeyguardManager) this.f54539k.getSystemService("keyguard")).requestDismissKeyguard(this.f54539k, new C109463mb(this));
        }
    }

    /* renamed from: g */
    public final void mo24900g() {
        C109464mc mcVar;
        this.f54539k.mo24862i();
        C58976aa aaVar = C58975e.f156826a;
        if (this.f304900q == 1 && (mcVar = this.f304902s) != null) {
            this.f54539k.unregisterReceiver(mcVar);
            this.f304902s = null;
        }
    }

    /* renamed from: h */
    public final void mo97844h() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f304889e) {
            return;
        }
        if (this.f304898o || this.f304890f || !this.f304891g.f230023b.isDeviceLocked()) {
            C87565h hVar = new C87565h();
            if (!this.f304898o) {
                hVar.f236560f = 2;
            }
            Uri uri = this.f304888d;
            if (uri != null) {
                hVar.f236577w = uri;
                hVar.f236579y = this.f304897n;
                hVar.f236511O = 1;
            }
            if (this.f304895l) {
                hVar.f236523a = "and.opa.lockscreen.hotword";
                hVar.f236556b = e.bs;
            } else {
                hVar.f236523a = "and.opa.lockscreen";
                hVar.f236556b = e.bm;
            }
            HotwordResultMetadata hotwordResultMetadata = this.f304887c;
            if (hotwordResultMetadata != null) {
                hVar.f236574t = hotwordResultMetadata;
            }
            int i = this.f304901r;
            if (i > 1) {
                hVar.f236578x = i;
            }
            if (this.f304900q == 2) {
                hVar.f236499C = true;
            }
            Intent s = C87566i.m142320s(this.f54539k, hVar.mo81685a(), 268468224);
            if (this.f304896m && !mo97845n()) {
                s.setFlags(s.getFlags() & -32769);
            }
            ((C87568k) this.f304893i.mo56107c()).mo81689c(this.f54539k, s.getExtras(), s.getFlags());
            this.f304889e = true;
            this.f54539k.mo24855e();
        }
    }

    /* renamed from: j */
    public final void mo24905j() {
        this.f54539k.mo24864k();
        C58976aa aaVar = C58975e.f156826a;
        if (this.f304888d != null && !this.f304899p) {
            this.f304894j.mo85150o(new C109462ma(this), 5000);
            this.f304899p = true;
        }
        boolean n = mo97845n();
        this.f304898o = n;
        if (n) {
            mo97844h();
        }
    }

    /* renamed from: m */
    public final void mo24908m(boolean z) {
        this.f54539k.mo24889q(z);
        C58976aa aaVar = C58975e.f156826a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final boolean mo97845n() {
        int i = this.f304900q;
        if (i == 1 || i == 2 || !this.f304892h.mo79746e(C90014bt.f247431gy)) {
            return false;
        }
        return !this.f304895l || this.f304892h.mo79746e(C90014bt.f247432gz);
    }
}
