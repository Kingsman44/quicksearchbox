package com.google.android.apps.gsa.speech.microdetection;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.apps.gsa.assistant.shared.C73842bi;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.search.core.p6513aj.C84533ar;
import com.google.android.apps.gsa.search.core.p6513aj.C84534as;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.p7009b.C89336a;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.search.C90507o;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.dumper.EventForDump;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90580b;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90581c;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90582d;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f;
import com.google.android.apps.gsa.shared.util.C90743b;
import com.google.android.apps.gsa.speech.hotword.C92343a;
import com.google.android.apps.gsa.speech.hotword.p7285c.C92371d;
import com.google.android.apps.gsa.speech.microdetection.p7303a.p7306c.C92504i;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.speech.microdetection.a */
/* compiled from: PG */
public final class C92486a {

    /* renamed from: a */
    public static final C59071e f258085a = C59071e.m91332i("com.google.android.apps.gsa.speech.microdetection.a");

    /* renamed from: k */
    private static final C58495hd f258086k = C58495hd.m89901o("ja-JP", "Ok Google/Ok Google", "nl-NL", "Oké Google/Hey Google");

    /* renamed from: l */
    private static final C58495hd f258087l = C58495hd.m89901o("ja-JP", "Ok/Ok", "nl-NL", "Oké/Hey");

    /* renamed from: b */
    public final C89994f f258088b;

    /* renamed from: c */
    public final C90021c f258089c;

    /* renamed from: d */
    public final C92504i f258090d;

    /* renamed from: e */
    public final C92343a f258091e;

    /* renamed from: f */
    public final C90743b f258092f;

    /* renamed from: g */
    public final C68214a f258093g;

    /* renamed from: h */
    public final C68214a f258094h;

    /* renamed from: i */
    public final C68214a f258095i;

    /* renamed from: j */
    public final C68214a f258096j;

    /* renamed from: m */
    private final C68214a f258097m;

    /* renamed from: n */
    private final C68214a f258098n;

    /* renamed from: o */
    private final C89336a f258099o;

    /* renamed from: p */
    private final Context f258100p;

    /* renamed from: q */
    private final bm f258101q;

    /* renamed from: r */
    private final C68214a f258102r;

    /* renamed from: s */
    private final C68214a f258103s;

    /* renamed from: t */
    private boolean f258104t;

    public C92486a(C89994f fVar, C90021c cVar, C92504i iVar, C92343a aVar, C90743b bVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6, C68214a aVar7, C68214a aVar8, C68214a aVar9, C89336a aVar10, Context context, bm bmVar) {
        this.f258088b = fVar;
        this.f258089c = cVar;
        this.f258090d = iVar;
        this.f258091e = aVar;
        this.f258092f = bVar;
        this.f258093g = aVar2;
        this.f258094h = aVar3;
        this.f258096j = aVar4;
        this.f258102r = aVar5;
        this.f258097m = aVar6;
        this.f258103s = aVar7;
        this.f258098n = aVar8;
        this.f258095i = aVar9;
        this.f258099o = aVar10;
        this.f258100p = context;
        this.f258101q = bmVar;
    }

    /* renamed from: B */
    private final C90580b m152114B() {
        return (C90580b) this.f258088b.mo83829r().get(this.f258088b.mo83863Z());
    }

    /* renamed from: b */
    public static String m152115b(C90584f fVar, String str) {
        if (fVar == C90584f.OK_HEY_GOOGLE) {
            return (String) f258086k.getOrDefault(str, "Ok Google/Hey Google");
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        r4 = r1.split("/");
        r5 = r4.length;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo87227A(com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f r4, java.lang.String r5, int r6, int r7) {
        /*
            r3 = this;
            com.google.android.apps.gsa.shared.speech.hotword.a.f r0 = com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f.OK_HEY_GOOGLE
            r1 = 0
            if (r4 != r0) goto L_0x001c
            r2 = 1
            if (r7 != r2) goto L_0x000d
            java.lang.String r1 = m152115b(r4, r5)
            goto L_0x001c
        L_0x000d:
            if (r4 != r0) goto L_0x001c
            com.google.common.b.hd r4 = f258087l
            java.lang.Object r4 = r4.get(r5)
            r1 = r4
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x001c
            java.lang.String r1 = "Ok/Hey"
        L_0x001c:
            if (r1 == 0) goto L_0x002d
            java.lang.String r4 = "/"
            java.lang.String[] r4 = r1.split(r4)
            int r5 = r4.length
            if (r5 <= 0) goto L_0x002d
            int r6 = r6 + -1
            int r6 = r6 % r5
            r4 = r4[r6]
            return r4
        L_0x002d:
            java.lang.String r4 = ""
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.speech.microdetection.C92486a.mo87227A(com.google.android.apps.gsa.shared.speech.hotword.a.f, java.lang.String, int, int):java.lang.String");
    }

    /* renamed from: a */
    public final C90582d mo87228a(boolean z) {
        C90581c cVar = (C90581c) C90582d.f253245d.createBuilder();
        if (z) {
            String b = ((C92371d) this.f258098n.mo27525b()).mo87021b();
            cVar.copyOnWrite();
            C90582d dVar = (C90582d) cVar.instance;
            b.getClass();
            dVar.f253247a |= 2;
            dVar.f253249c = b;
            C90584f q = this.f258088b.mo83828q();
            cVar.copyOnWrite();
            C90582d dVar2 = (C90582d) cVar.instance;
            dVar2.f253248b = q.f253255d;
            dVar2.f253247a |= 1;
        } else {
            String Z = this.f258088b.mo83863Z();
            cVar.copyOnWrite();
            C90582d dVar3 = (C90582d) cVar.instance;
            Z.getClass();
            dVar3.f253247a |= 2;
            dVar3.f253249c = Z;
            C90584f p = this.f258088b.mo83827p();
            cVar.copyOnWrite();
            C90582d dVar4 = (C90582d) cVar.instance;
            dVar4.f253248b = p.f253255d;
            dVar4.f253247a |= 1;
        }
        return (C90582d) cVar.build();
    }

    /* renamed from: c */
    public final String mo87229c() {
        C90580b B = m152114B();
        if (B != null) {
            return B.f253241c;
        }
        return null;
    }

    /* renamed from: d */
    public final String mo87230d() {
        C90580b B = m152114B();
        String str = B != null ? B.f253242d : null;
        return str == null ? "Ok Google" : str;
    }

    /* renamed from: e */
    public final String mo87231e(String str) {
        return mo87227A(C90584f.OK_HEY_GOOGLE, str, 2, 1);
    }

    /* renamed from: f */
    public final void mo87232f() {
        if (((SharedPreferences) this.f258096j.mo27525b()).getInt("trusted_voice_paused_notification_state", 1) == 2) {
            ((C59052c) ((C59052c) f258085a.mo56224b()).mo56372aa(12622)).mo56386p("Auto dismissed trusted voice paused notification.");
            ((SharedPreferences) this.f258096j.mo27525b()).edit().putInt("trusted_voice_paused_notification_state", 3).apply();
        }
    }

    /* renamed from: g */
    public final void mo87233g(boolean z) {
        ((SharedPreferences) this.f258096j.mo27525b()).edit().putBoolean("hotwordDetector", z).apply();
    }

    /* renamed from: h */
    public final void mo87234h() {
        ((SharedPreferences) this.f258096j.mo27525b()).edit().putInt("opa_hotword_training_seen_count", ((SharedPreferences) this.f258096j.mo27525b()).getInt("opa_hotword_training_seen_count", 0) + 1).apply();
    }

    /* renamed from: i */
    public final void mo87235i() {
        ((SharedPreferences) this.f258096j.mo27525b()).edit().putInt("hands_free_hotword_retraining_notification_state", 2).apply();
    }

    /* renamed from: j */
    public final synchronized void mo87236j(boolean z) {
        this.f258104t = z;
    }

    /* renamed from: k */
    public final void mo87237k(boolean z, EventForDump eventForDump) {
        ((C59052c) ((C59052c) f258085a.mo56224b()).mo56372aa(12627)).mo56389s("setOpaHotwordEnabled %b", Boolean.valueOf(z));
        SharedPreferences.Editor edit = ((SharedPreferences) this.f258096j.mo27525b()).edit();
        if (z) {
            this.f258088b.mo83903aw(1, eventForDump);
        } else {
            this.f258088b.mo83903aw(2, eventForDump);
        }
        mo87238l(z);
        edit.putBoolean("opa_hotword_enabled", z).apply();
        if (((C58833ax) this.f258103s.mo27525b()).mo56113h()) {
            ((C73842bi) ((C58833ax) this.f258103s.mo27525b()).mo56107c()).mo65324a();
        }
    }

    /* renamed from: l */
    public final void mo87238l(boolean z) {
        if (this.f258089c.mo79746e(C90110fh.f250606aD) && !this.f258101q.s()) {
            z = false;
        }
        mo87233g(z);
        C84533ar a = ((C84534as) this.f258097m.mo27525b()).mo78241a();
        a.mo78237c("GSAPrefs.hotword_enabled", z);
        a.mo78235a();
    }

    /* renamed from: m */
    public final void mo87239m(boolean z, EventForDump eventForDump) {
        C59071e eVar = f258085a;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(12629)).mo56389s("isOpaHotwordEnabled: %b", Boolean.valueOf(z));
        if (!z) {
            ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(12632)).mo56386p("Disabling the hotword detector.");
            ((SharedPreferences) this.f258096j.mo27525b()).edit().putBoolean("opa_hotword_enabled", false).apply();
            mo87238l(false);
        } else if (mo87249w()) {
            ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(12631)).mo56386p("Setting VoiceMatch enabled again.");
            mo87237k(true, eventForDump);
        } else if (this.f258088b.mo83855R() == 4) {
            ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(12630)).mo56386p("Re-enabling the hotword detector");
            mo87238l(true);
        } else {
            return;
        }
        Intent intent = new Intent("com.google.android.googlequicksearchbox.FROM_ANY_SCREEN_PREFERENCE_CHANGED");
        intent.setPackage("com.google.android.googlequicksearchbox");
        this.f258100p.sendBroadcast(intent, "android.permission.MANAGE_VOICE_KEYPHRASES");
    }

    /* renamed from: n */
    public final boolean mo87240n(C90021c cVar, C89994f fVar) {
        return cVar.mo79746e(C90120fr.f250857x) && fVar.mo83819h();
    }

    /* renamed from: o */
    public final synchronized boolean mo87241o() {
        return this.f258104t;
    }

    /* renamed from: p */
    public final boolean mo87242p() {
        boolean z = false;
        if (this.f258089c.mo79746e(C90120fr.f250857x) && this.f258091e == C92343a.AVAILABLE && mo87248v()) {
            z = true;
        }
        ((C59052c) ((C59052c) f258085a.mo56224b()).mo56372aa(12634)).mo56389s("hasHotwordEverywhere-%b", Boolean.valueOf(z));
        return z;
    }

    /* renamed from: q */
    public final boolean mo87243q(String str) {
        return this.f258088b.mo83863Z().equals(str);
    }

    /* renamed from: r */
    public final boolean mo87244r() {
        return this.f258088b.mo83816e();
    }

    /* renamed from: s */
    public final boolean mo87245s() {
        return this.f258088b.mo83819h() && mo87246t();
    }

    /* renamed from: t */
    public final boolean mo87246t() {
        return !this.f258090d.mo87261a(this.f258088b.mo83863Z(), this.f258088b.mo83827p()).mo87253a();
    }

    /* renamed from: u */
    public final boolean mo87247u() {
        return this.f258088b.mo83847J(((C86338r) this.f258102r.mo27525b()).getString(C90507o.f253011a, (String) null));
    }

    /* renamed from: v */
    public final boolean mo87248v() {
        C90580b B = m152114B();
        return B != null && B.f253243e;
    }

    /* renamed from: w */
    public final boolean mo87249w() {
        return this.f258088b.mo83817f() || this.f258088b.mo83824m(this.f258099o.mo79659F());
    }

    /* renamed from: x */
    public final boolean mo87250x() {
        if (!this.f258089c.mo79746e(C90120fr.f250857x) || !this.f258088b.mo83819h() || !this.f258088b.mo83817f() || ((SharedPreferences) this.f258096j.mo27525b()).getBoolean("always_on_hotword_suppressed", false)) {
            return false;
        }
        return true;
    }

    /* renamed from: y */
    public final boolean mo87251y() {
        return mo87240n(this.f258089c, this.f258088b) && this.f258088b.mo83824m(((C86338r) this.f258102r.mo27525b()).getString(C90507o.f253011a, (String) null));
    }

    /* renamed from: z */
    public final boolean mo87252z(Query query) {
        boolean bW = query.mo84338bW();
        if ((query.mo84412cs() && !bW) || this.f258092f.mo85090c()) {
            return false;
        }
        boolean z = query.mo84420dA() && query.mo84460dn();
        boolean z2 = query.mo84420dA() && query.mo84456dj();
        if (!bW && z2 == z) {
            return false;
        }
        if (((z2 || z) && this.f258089c.mo79746e(C90120fr.f250834az)) || bW) {
            return true;
        }
        return false;
    }
}
