package com.google.android.apps.gsa.staticplugins.avocado;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.apps.gsa.assistant.p510b.p511a.C9439b;
import com.google.android.apps.gsa.assistant.settings.features.avocado.ai;
import com.google.android.apps.gsa.assistant.shared.cb;
import com.google.android.apps.gsa.assistant.shared.p5809c.C73849a;
import com.google.android.apps.gsa.opaonboarding.C83870ad;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84026u;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.util.C90719ac;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92394r;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92395s;
import com.google.android.apps.gsa.staticplugins.avocado.p7420b.C94189f;
import com.google.android.apps.gsa.staticplugins.avocado.p7420b.C94194k;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.cl */
/* compiled from: PG */
public final class C94233cl extends C83870ad {

    /* renamed from: a */
    public static final C59071e f263297a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.avocado.cl");

    /* renamed from: b */
    public Bundle f263298b = new Bundle();

    /* renamed from: c */
    public int f263299c = 0;

    /* renamed from: d */
    public int f263300d = 0;

    /* renamed from: e */
    public int f263301e = 1;

    /* renamed from: f */
    int f263302f = 1;

    /* renamed from: g */
    private final C94324k f263303g;

    /* renamed from: h */
    private final C90021c f263304h;

    /* renamed from: i */
    private final C94321h f263305i;

    /* renamed from: j */
    private final C94181ay f263306j;

    /* renamed from: k */
    private final C94194k f263307k;

    /* renamed from: l */
    private final C94189f f263308l;

    /* renamed from: m */
    private final C94263do f263309m;

    /* renamed from: n */
    private final C94175as f263310n;

    /* renamed from: o */
    private final C68214a f263311o;

    /* renamed from: p */
    private final C83893b f263312p;

    /* renamed from: q */
    private final C94299ex f263313q;

    /* renamed from: r */
    private final C94278ec f263314r;

    /* renamed from: s */
    private final C68214a f263315s;

    /* renamed from: t */
    private final C84026u f263316t;

    /* renamed from: u */
    private final ai f263317u;

    /* renamed from: v */
    private C94323j f263318v;

    /* renamed from: w */
    private C60870cx f263319w;

    public C94233cl(C94278ec ecVar, C94299ex exVar, C94324k kVar, C94321h hVar, C94181ay ayVar, C94194k kVar2, C94189f fVar, C94263do doVar, C94175as asVar, C83893b bVar, C68214a aVar, C90021c cVar, C84026u uVar, C68214a aVar2, ai aiVar) {
        this.f263314r = ecVar;
        this.f263303g = kVar;
        this.f263304h = cVar;
        this.f263305i = hVar;
        this.f263306j = ayVar;
        this.f263307k = kVar2;
        this.f263308l = fVar;
        this.f263309m = doVar;
        this.f263310n = asVar;
        this.f263312p = bVar;
        this.f263311o = aVar;
        this.f263313q = exVar;
        this.f263315s = aVar2;
        this.f263316t = uVar;
        this.f263317u = aiVar;
    }

    /* renamed from: a */
    private final C58833ax m155514a() {
        this.f263302f = 7;
        C94323j a = this.f263303g.mo88460a(this.f263314r.mo88402a(), this.f263304h.mo79746e(C90082eg.f249909aY));
        this.f263318v = a;
        return C58833ax.m90834k(a);
    }

    /* renamed from: b */
    private final C58833ax m155515b() {
        this.f263302f = 5;
        Bundle bundle = new Bundle();
        boolean z = true;
        if (!m155517f() && !m155516e()) {
            z = false;
        }
        bundle.putBoolean("is_unicorn_account_key", z);
        bundle.putByteArray("device_id_list_key", this.f263314r.mo88402a().toByteArray());
        if (m155516e() || m155517f()) {
            return C58833ax.m90834k(C83875ai.m133541f(this.f263306j, bundle, new C94226ce(this)));
        }
        return C58833ax.m90834k(C83875ai.m133541f(this.f263305i, bundle, new C94227cf(this)));
    }

    /* renamed from: e */
    private final boolean m155516e() {
        C58838bb.m90883r(this.f263319w != null);
        C58838bb.m90883r(C90877ak.m148480n(this.f263319w));
        return this.f263317u.e();
    }

    /* renamed from: f */
    private final boolean m155517f() {
        C58838bb.m90883r(this.f263319w != null);
        C58838bb.m90883r(C90877ak.m148480n(this.f263319w));
        return this.f263304h.mo79746e(C90082eg.f249985bv) && this.f263312p.mo77278a().mo56113h() && ((Boolean) C90877ak.m148474h(this.f263319w)).booleanValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C58833ax mo77210d() {
        C60870cx cxVar;
        int a;
        C59071e eVar = f263297a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "AvocadoUnicorn");
        C59052c cVar = (C59052c) ((C59052c) b).mo56372aa(14275);
        int i = this.f263302f;
        int i2 = i - 1;
        if (i != 0) {
            cVar.mo56387q("#getNextDelegate currentState %d", i2);
            if (!C73849a.m108439a(this.f263304h)) {
                return C58836b.f156633a;
            }
            C94299ex exVar = this.f263313q;
            if (exVar.f263511d && !exVar.mo88439b()) {
                return C58836b.f156633a;
            }
            int i3 = this.f263302f;
            int i4 = i3 - 1;
            if (i3 != 0) {
                switch (i4) {
                    case 0:
                        ((C89859i) this.f263315s.mo27525b()).mo83702b(C89849ae.VOICE_MATCH_FACE_MATCH_ENROLLMENT_FM_START);
                        ((C89859i) this.f263315s.mo27525b()).mo83702b(C89849ae.FACE_MATCH_ENROLLMENT_START);
                        this.f263302f = 2;
                        if (this.f263304h.mo79746e(C90082eg.f249941bD)) {
                            cxVar = ((cb) this.f263311o.mo27525b()).c((Account) this.f263312p.mo77278a().mo56107c(), new int[]{0, 1, 2});
                        } else {
                            cxVar = ((cb) this.f263311o.mo27525b()).c((Account) this.f263312p.mo77278a().mo56107c(), new int[]{0, 1});
                        }
                        this.f263319w = cxVar;
                        return C58833ax.m90834k(this.f263316t.mo77487a(cxVar, C94228cg.f263292a));
                    case 1:
                        C58838bb.m90883r(this.f263319w != null);
                        if (!C90877ak.m148480n(this.f263319w)) {
                            ((C89859i) this.f263315s.mo27525b()).mo83702b(C89849ae.VOICE_MATCH_FACE_MATCH_ENROLLMENT_FM_FAILED);
                            return C58836b.f156633a;
                        } else if (!m155517f()) {
                            return m155515b();
                        } else {
                            this.f263313q.f263510c = true;
                            ai aiVar = this.f263317u;
                            if (aiVar.b.mo79746e(C90082eg.f250003cM) && ((aiVar.a.mo56113h() && (a = C92394r.m151716a(((C92395s) aiVar.a.mo56107c()).f257657d)) != 0 && a == 2) || aiVar.e())) {
                                return m155515b();
                            }
                            this.f263302f = 3;
                            Bundle bundle = new Bundle();
                            bundle.putInt("enrollment_entry_id", C9439b.FACE_MATCH_ENROLLMENT_ASSISTANT_SETTINGS.f32835aq);
                            bundle.putLong("enrollment_request_id", C90719ac.f253778a.f253779b.nextLong());
                            return C58833ax.m90834k(C83875ai.m133541f(this.f263307k, bundle, new C94232ck(this)));
                        }
                    case 2:
                        if (this.f263301e == 1) {
                            ((C89859i) this.f263315s.mo27525b()).mo83702b(C89849ae.VOICE_MATCH_FACE_MATCH_ENROLLMENT_FM_FAILED);
                            return C58836b.f156633a;
                        }
                        this.f263302f = 4;
                        return C58833ax.m90834k(C83875ai.m133541f(this.f263308l, this.f263298b, new C94229ch(this)));
                    case 3:
                        if (this.f263301e != 1) {
                            return m155515b();
                        }
                        ((C89859i) this.f263315s.mo27525b()).mo83702b(C89849ae.VOICE_MATCH_FACE_MATCH_ENROLLMENT_FM_FAILED);
                        return C58836b.f156633a;
                    case 4:
                        if (this.f263299c == 0) {
                            this.f263313q.f263508a = 3;
                            ((C89859i) this.f263315s.mo27525b()).mo83702b(C89849ae.VOICE_MATCH_FACE_MATCH_ENROLLMENT_FM_EXIT);
                            return C58836b.f156633a;
                        } else if (!m155517f() && !m155516e()) {
                            return m155514a();
                        } else {
                            this.f263302f = 6;
                            return C58833ax.m90834k(C83875ai.m133541f(this.f263309m, new Bundle(), new C94230ci(this)));
                        }
                    case 5:
                        if (this.f263300d != 0) {
                            return m155514a();
                        }
                        this.f263313q.f263508a = 3;
                        ((C89859i) this.f263315s.mo27525b()).mo83702b(C89849ae.VOICE_MATCH_FACE_MATCH_ENROLLMENT_FM_EXIT);
                        return C58836b.f156633a;
                    case 6:
                        this.f263313q.f263508a = this.f263318v.f263584a;
                        C59104x b2 = eVar.mo56224b();
                        b2.mo56378ag(C58975e.f156826a, "AvocadoUnicorn");
                        ((C59052c) ((C59052c) b2).mo56372aa(14279)).mo56387q("enrollResult is %d", this.f263318v.f263584a);
                        int i5 = this.f263318v.f263584a;
                        if (i5 == 2) {
                            ((C89859i) this.f263315s.mo27525b()).mo83702b(C89849ae.VOICE_MATCH_FACE_MATCH_ENROLLMENT_FM_COMPLETE);
                        } else if (i5 == 3) {
                            ((C89859i) this.f263315s.mo27525b()).mo83702b(C89849ae.VOICE_MATCH_FACE_MATCH_ENROLLMENT_FM_EXIT);
                        } else {
                            ((C89859i) this.f263315s.mo27525b()).mo83702b(C89849ae.VOICE_MATCH_FACE_MATCH_ENROLLMENT_FM_FAILED);
                        }
                        if (!m155517f() && !m155516e()) {
                            return C58836b.f156633a;
                        }
                        this.f263302f = 8;
                        return C58833ax.m90834k(C83875ai.m133541f(this.f263310n, new Bundle(), C94231cj.f263295a));
                    case 7:
                        return C58836b.f156633a;
                    default:
                        throw new IllegalArgumentException("Unknown State.");
                }
            } else {
                throw null;
            }
        } else {
            throw null;
        }
    }
}
