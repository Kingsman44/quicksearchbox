package com.google.android.apps.gsa.speech.p7311n;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.databinding.C0118a;
import android.os.UserManager;
import android.util.Base64;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assist.p501a.C9325m;
import com.google.android.apps.gsa.assistant.settings.features.hotwordenrollment.voicematch.phone.ap;
import com.google.android.apps.gsa.assistant.settings.features.p538ad.C9855w;
import com.google.android.apps.gsa.assistant.settings.features.p538ad.p539a.C9799ae;
import com.google.android.apps.gsa.assistant.settings.shared.ae;
import com.google.android.apps.gsa.assistant.settings.shared.as;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.nga.api.C74713bn;
import com.google.android.apps.gsa.nga.api.C74720bx;
import com.google.android.apps.gsa.projection.C84196h;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6805i.C86127w;
import com.google.android.apps.gsa.search.core.p6805i.C86130z;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.search.core.preferences.C86341u;
import com.google.android.apps.gsa.search.core.preferences.C86346z;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6940d.C88483e;
import com.google.android.apps.gsa.shared.bisto.C89651f;
import com.google.android.apps.gsa.shared.p7066m.C89986ay;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.search.C90507o;
import com.google.android.apps.gsa.shared.speech.dumper.C90548ak;
import com.google.android.apps.gsa.shared.speech.dumper.C90552e;
import com.google.android.apps.gsa.shared.speech.dumper.EventForDump;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90580b;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f;
import com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel;
import com.google.android.apps.gsa.shared.util.C90721ae;
import com.google.android.apps.gsa.shared.util.C90725ai;
import com.google.android.apps.gsa.shared.util.C90743b;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.shared.util.UserHandleCompat;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.speech.hotword.p7283b.C92353b;
import com.google.android.apps.gsa.speech.p7272e.p7275c.C92286w;
import com.google.android.apps.gsa.speech.utils.C92654a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.C39424ba;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3072i.C39618j;
import com.google.common.base.C58833ax;
import com.google.common.base.C58837ba;
import com.google.common.p4520a.C58206am;
import com.google.common.p4520a.C58254i;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p395al.p408c.p414c.p416b.C8460ac;
import com.google.p395al.p408c.p414c.p416b.C8513w;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.speech.n.d */
/* compiled from: PG */
public final class C92536d implements C89994f {

    /* renamed from: a */
    public static final C59071e f258235a = C59071e.m91332i("com.google.android.apps.gsa.speech.n.d");

    /* renamed from: A */
    private final C58833ax f258236A;

    /* renamed from: B */
    private final ConcurrentMap f258237B;

    /* renamed from: C */
    private final ConcurrentMap f258238C;

    /* renamed from: D */
    private final ConcurrentMap f258239D;

    /* renamed from: E */
    private final ConcurrentMap f258240E;

    /* renamed from: F */
    private final C68214a f258241F;

    /* renamed from: b */
    public final C86127w f258242b;

    /* renamed from: c */
    public final C92541i f258243c;

    /* renamed from: d */
    private final C9325m f258244d;

    /* renamed from: e */
    private final Context f258245e;

    /* renamed from: f */
    private final C68214a f258246f;

    /* renamed from: g */
    private final C68214a f258247g;

    /* renamed from: h */
    private final C86124t f258248h;

    /* renamed from: i */
    private final C68214a f258249i;

    /* renamed from: j */
    private final C68214a f258250j;

    /* renamed from: k */
    private final C68214a f258251k;

    /* renamed from: l */
    private final C68214a f258252l;

    /* renamed from: m */
    private final C68214a f258253m;

    /* renamed from: n */
    private final C68214a f258254n;

    /* renamed from: o */
    private final C68214a f258255o;

    /* renamed from: p */
    private final C58833ax f258256p;

    /* renamed from: q */
    private final C68214a f258257q;

    /* renamed from: r */
    private final C68214a f258258r;

    /* renamed from: s */
    private final C68214a f258259s;

    /* renamed from: t */
    private final C84196h f258260t;

    /* renamed from: u */
    private final C68214a f258261u;

    /* renamed from: v */
    private final C68214a f258262v;

    /* renamed from: w */
    private final C68214a f258263w;

    /* renamed from: x */
    private final C92353b f258264x;

    /* renamed from: y */
    private final C58833ax f258265y;

    /* renamed from: z */
    private final C58833ax f258266z;

    public C92536d(Context context, C86127w wVar, C68214a aVar, C68214a aVar2, C86124t tVar, C92541i iVar, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6, C68214a aVar7, C68214a aVar8, C68214a aVar9, C58833ax axVar, C68214a aVar10, C68214a aVar11, C68214a aVar12, C84196h hVar, C9325m mVar, C68214a aVar13, C68214a aVar14, C68214a aVar15, C92353b bVar, C58833ax axVar2, C58833ax axVar3, C58833ax axVar4, C68214a aVar16) {
        C92541i iVar2 = iVar;
        C58254i iVar3 = new C58254i();
        iVar3.mo54823g(1);
        iVar3.mo54822f(10, TimeUnit.MINUTES);
        this.f258237B = ((C58206am) iVar3.mo54817a()).f155647a;
        C58254i iVar4 = new C58254i();
        iVar4.mo54823g(1);
        iVar4.mo54822f(10, TimeUnit.MINUTES);
        this.f258238C = ((C58206am) iVar4.mo54817a()).f155647a;
        C58254i iVar5 = new C58254i();
        iVar5.mo54823g(2);
        iVar5.mo54822f(10, TimeUnit.MINUTES);
        this.f258239D = ((C58206am) iVar5.mo54817a()).f155647a;
        C58254i iVar6 = new C58254i();
        iVar6.mo54823g(1);
        iVar6.mo54822f(10, TimeUnit.MINUTES);
        this.f258240E = ((C58206am) iVar6.mo54817a()).f155647a;
        this.f258242b = wVar;
        this.f258245e = context;
        this.f258246f = aVar;
        this.f258247g = aVar2;
        this.f258248h = tVar;
        this.f258258r = aVar11;
        this.f258243c = iVar2;
        this.f258244d = mVar;
        iVar2.registerObserver(new C92534b(this));
        mo87313aT();
        this.f258249i = aVar3;
        this.f258250j = aVar4;
        this.f258251k = aVar5;
        this.f258252l = aVar6;
        this.f258253m = aVar7;
        this.f258254n = aVar8;
        this.f258255o = aVar9;
        this.f258256p = axVar;
        this.f258257q = aVar10;
        this.f258259s = aVar12;
        this.f258260t = hVar;
        this.f258261u = aVar13;
        this.f258262v = aVar14;
        this.f258263w = aVar15;
        this.f258264x = bVar;
        this.f258265y = axVar2;
        this.f258266z = axVar3;
        this.f258236A = axVar4;
        this.f258241F = aVar16;
    }

    /* renamed from: aW */
    static final String m152243aW(C90584f fVar, String str) {
        C90584f fVar2 = C90584f.UNKNOWN;
        if (fVar.ordinal() != 2) {
            return null;
        }
        return "xgoogle_dsp_supported_".concat(String.valueOf(str));
    }

    /* renamed from: aX */
    private final String m152244aX() {
        return this.f258242b.f232790a.mo79722a().getString("debugRecognitionEngineRestrict", (String) null);
    }

    /* renamed from: aY */
    private final String m152245aY(C8513w wVar) {
        String d = C92654a.m152607d(Locale.getDefault().toString(), wVar);
        C86341u uVar = new C86341u((C86346z) this.f258242b.f232790a.mo79722a());
        uVar.mo80073h("spoken-language-bcp-47", d);
        uVar.mo80085k("spoken-language-default", true);
        uVar.mo80086l(false);
        return d;
    }

    /* renamed from: A */
    public final synchronized boolean mo83835A() {
        return this.f258242b.f232790a.mo79722a().getBoolean("lockscreen_personal_response", false);
    }

    /* renamed from: B */
    public final void mo83836B(boolean z) {
        C86341u uVar = new C86341u((C86346z) this.f258242b.f232790a.mo79722a());
        uVar.mo80085k("headphone_lockscreen_personal_response", Boolean.valueOf(z));
        uVar.mo80086l(false);
        C89651f.m145940a((C88483e) this.f258259s.mo27525b(), new C88489j(C87739bu.BISTO_PR_OR_HPR_PREF_CHANGED).mo82013a());
    }

    /* renamed from: C */
    public final synchronized void mo83837C(boolean z) {
        C86341u uVar = new C86341u((C86346z) this.f258242b.f232790a.mo79722a());
        uVar.mo80085k("lockscreen_personal_response", Boolean.valueOf(z));
        uVar.mo80086l(false);
        if (this.f258248h.mo79746e(C90014bt.f247797nt)) {
            C86341u uVar2 = new C86341u((C86346z) this.f258242b.f232790a.mo79722a());
            uVar2.mo80085k("lockscreen_personal_response_enable_status", Integer.valueOf(z ? 1 : 0));
            uVar2.mo80086l(false);
        }
    }

    /* renamed from: D */
    public final synchronized SpeakerIdModel mo83841D(String str) {
        if (!mo83823l()) {
            return null;
        }
        String string = this.f258242b.f232790a.mo79722a().getString(mo83842E(str), (String) null);
        if (string == null) {
            return null;
        }
        return new SpeakerIdModel(str, Base64.decode(string, 0));
    }

    /* renamed from: E */
    public final String mo83842E(String str) {
        String af = mo83886af();
        if (!mo83848K()) {
            return "speaker_model_".concat(String.valueOf(af));
        }
        String languageTag = ((ae) this.f258253m.mo27525b()).d(C58837ba.m90858g(str)).toLanguageTag();
        return "speaker_model_" + af + ":" + languageTag;
    }

    /* renamed from: F */
    public final synchronized void mo83843F(String str, EventForDump eventForDump) {
        mo83845H(new SpeakerIdModel(str), true, eventForDump);
    }

    /* renamed from: G */
    public final void mo83844G() {
        C60856cj.m92911t(((C92286w) this.f258263w.mo27525b()).mo86966b(mo83863Z()), new C92535c(), C60826bg.f164896a);
    }

    /* renamed from: H */
    public final synchronized void mo83845H(SpeakerIdModel speakerIdModel, boolean z, EventForDump eventForDump) {
        String str = speakerIdModel.f253283a;
        byte[] bArr = (byte[]) speakerIdModel.f253284b.mo56111f();
        if (bArr == null) {
            mo87312aS(str, (String) null, eventForDump);
        } else if (!mo83823l()) {
            ((C90548ak) this.f258252l.mo27525b()).mo84667a(C90552e.SPEAKER_MODEL, eventForDump, "isSpeakerIdSupported false");
            return;
        } else {
            mo87312aS(str, Base64.encodeToString(bArr, 0), eventForDump);
        }
        if (!z) {
            ((C59052c) ((C59052c) f258235a.mo56224b()).mo56372aa(12851)).mo56386p("Inform interactor is false.");
        } else if (this.f258244d.mo17534a()) {
            Intent intent = new Intent("com.google.android.voiceinteraction.NEW_SPEAKER_ID_MODEL_AVAILABLE");
            intent.putExtra("speaker_id_model", speakerIdModel);
            intent.setPackage("com.google.android.googlequicksearchbox");
            this.f258245e.sendBroadcast(intent, "android.permission.MANAGE_VOICE_KEYPHRASES");
            if (this.f258236A.mo56113h()) {
                ((C59052c) ((C59052c) f258235a.mo56224b()).mo56372aa(12854)).mo56386p("Notify HDM of speaker-id model change.");
                C58976aa aaVar = C58975e.f156826a;
                ((C39424ba) this.f258236A.mo56107c()).f103800a.mo41951b(C39618j.f104289c);
                return;
            }
            ((C59052c) ((C59052c) f258235a.mo56224b()).mo56372aa(12853)).mo56386p("Not notifying HDM of new Speaker-Id model because updater is not present.");
        } else {
            ((C59052c) ((C59052c) f258235a.mo56224b()).mo56372aa(12852)).mo56386p("Google is not the active assistant.");
        }
    }

    /* renamed from: I */
    public final boolean mo83846I() {
        return this.f258248h.mo79746e(C90082eg.f250056dm) && mo87314aU(mo83863Z());
    }

    /* renamed from: J */
    public final boolean mo83847J(String str) {
        return mo83823l() && this.f258242b.f232790a.mo79722a().contains(mo83842E(str));
    }

    /* renamed from: K */
    public final boolean mo83848K() {
        if (!this.f258248h.mo79746e(C90014bt.f247326ez) || !this.f258242b.f232790a.mo79722a().getBoolean("user_profile_lang_speaker_id_model_transition_task", false)) {
            return false;
        }
        return true;
    }

    /* renamed from: L */
    public final void mo83849L(boolean z) {
        C86341u uVar = new C86341u((C86346z) this.f258242b.f232790a.mo79722a());
        uVar.mo80085k("tisid_consent_status", Boolean.valueOf(z));
        uVar.mo80086l(false);
    }

    /* renamed from: M */
    public final boolean mo83850M() {
        C58833ax axVar = (C58833ax) this.f258254n.mo27525b();
        return (axVar.mo56113h() && ((C74713bn) axVar.mo56107c()).mo71078c()) && this.f258248h.mo79745c(C90082eg.f250015cY).contains(mo83863Z());
    }

    /* renamed from: N */
    public final boolean mo83851N() {
        if (!this.f258248h.mo79746e(C90082eg.f250016cZ) && ((C90743b) this.f258255o.mo27525b()).mo85090c()) {
            return false;
        }
        if (!this.f258248h.mo79746e(C90082eg.f250084u) || !mo87314aU(mo83863Z())) {
            return mo83850M();
        }
        return true;
    }

    /* renamed from: O */
    public final boolean mo83852O() {
        return this.f258242b.f232790a.mo79722a().getBoolean("tisid_consent_status", false);
    }

    /* renamed from: P */
    public final int mo83853P(String str) {
        return this.f258242b.f232790a.mo79722a().getInt(String.format("adaptive_tts_%s", new Object[]{str}), 0);
    }

    /* renamed from: Q */
    public final synchronized int mo83854Q(String str) {
        return this.f258242b.f232790a.mo79722a().getInt("enrollment_utterances_send_attempts_".concat(String.valueOf(str)), 0);
    }

    /* renamed from: R */
    public final int mo83855R() {
        int i = this.f258242b.f232790a.mo79722a().getInt("hotword_enrollment_state", 0);
        if (i != 1) {
            return i;
        }
        if (!mo83823l() || mo83847J(mo83882ab())) {
            return 1;
        }
        mo83903aw(4, EventForDump.m147676e(20, "#getHotwordEnrollmentState"));
        return 4;
    }

    /* renamed from: S */
    public final int mo83856S() {
        return this.f258242b.f232790a.mo79722a().getInt("languagePacksAutoUpdate", 2);
    }

    /* renamed from: T */
    public final int mo83857T() {
        return this.f258242b.f232790a.mo79722a().getInt("hotword_enrollment_skipped", 0);
    }

    /* renamed from: U */
    public final long mo83858U(String str) {
        return this.f258242b.f232790a.mo79722a().getLong(String.format("last_adaptive_tts_time_%s", new Object[]{str}), -1);
    }

    /* renamed from: V */
    public final long mo83859V() {
        return (long) ((int) this.f258248h.mo79743a(C90082eg.f249993cC));
    }

    /* renamed from: W */
    public final C58528ij mo83860W() {
        return mo83861X(BuildConfig.FLAVOR);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: X */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.p4522b.C58528ij mo83861X(java.lang.String r6) {
        /*
            r5 = this;
            com.google.common.b.ih r0 = new com.google.common.b.ih
            r0.<init>()
            com.google.android.apps.gsa.search.core.i.t r1 = r5.f258248h
            java.lang.String r1 = r1.mo79757w()
            if (r1 == 0) goto L_0x0010
            r0.mo55373c(r1)
        L_0x0010:
            com.google.android.apps.gsa.search.core.i.t r1 = r5.f258248h
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90091ep.f250541d
            boolean r1 = r1.mo79746e(r2)
            if (r1 == 0) goto L_0x0029
            dagger.a r1 = r5.f258258r
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.search.core.ag.a.e r1 = (com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e) r1
            java.util.Collection r1 = r1.mo78124m()
            r0.mo55489i(r1)
        L_0x0029:
            com.google.android.apps.gsa.projection.h r1 = r5.f258260t
            boolean r2 = com.google.android.apps.gsa.projection.C84196h.m134234b(r6)
            java.lang.String r3 = ""
            if (r2 == 0) goto L_0x003d
            com.google.android.apps.gsa.search.core.i.t r2 = r1.f229187c
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250491ed
            boolean r2 = r2.mo79746e(r4)
            if (r2 != 0) goto L_0x0053
        L_0x003d:
            com.google.android.apps.gsa.search.core.i.t r2 = r1.f229187c
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250492ee
            boolean r2 = r2.mo79746e(r4)
            if (r2 == 0) goto L_0x0068
            com.google.common.o.amo r2 = com.google.common.p4552o.amo.OPA_ANDROID
            java.lang.String r2 = r2.name()
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x0068
        L_0x0053:
            com.google.android.libraries.phenotype.client.aj r2 = r1.f229185a
            if (r2 != 0) goto L_0x005f
            java.lang.String r2 = "com.google.android.projection.gearhead"
            com.google.android.libraries.phenotype.client.aj r2 = com.google.android.apps.gsa.projection.C84196h.m134233a(r2)
            r1.f229185a = r2
        L_0x005f:
            com.google.android.libraries.phenotype.client.aj r1 = r1.f229185a
            java.lang.Object r1 = r1.mo37303b()
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x0069
        L_0x0068:
            r1 = r3
        L_0x0069:
            boolean r2 = com.google.common.base.C58837ba.m90859h(r1)
            if (r2 != 0) goto L_0x0072
            r0.mo55373c(r1)
        L_0x0072:
            com.google.android.apps.gsa.projection.h r1 = r5.f258260t
            boolean r6 = com.google.android.apps.gsa.projection.C84196h.m134234b(r6)
            if (r6 == 0) goto L_0x009a
            com.google.android.apps.gsa.search.core.i.t r6 = r1.f229187c
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250493ef
            boolean r6 = r6.mo79746e(r2)
            if (r6 != 0) goto L_0x0085
            goto L_0x009a
        L_0x0085:
            com.google.android.libraries.phenotype.client.aj r6 = r1.f229186b
            if (r6 != 0) goto L_0x0091
            java.lang.String r6 = "com.google.android.gms.car"
            com.google.android.libraries.phenotype.client.aj r6 = com.google.android.apps.gsa.projection.C84196h.m134233a(r6)
            r1.f229186b = r6
        L_0x0091:
            com.google.android.libraries.phenotype.client.aj r6 = r1.f229186b
            java.lang.Object r6 = r6.mo37303b()
            r3 = r6
            java.lang.String r3 = (java.lang.String) r3
        L_0x009a:
            boolean r6 = com.google.common.base.C58837ba.m90859h(r3)
            if (r6 != 0) goto L_0x00a3
            r0.mo55373c(r3)
        L_0x00a3:
            com.google.common.b.ij r6 = r0.mo55486f()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.speech.p7311n.C92536d.mo83861X(java.lang.String):com.google.common.b.ij");
    }

    /* renamed from: Y */
    public final synchronized Optional mo83862Y() {
        Optional optional;
        C58495hd r = this.f258248h.mo79752r(C90082eg.f250036ct);
        as asVar = (as) this.f258262v.mo27525b();
        String g = asVar.c.mo85402g("GSAPrefs.google_account", (String) null);
        if (g == null) {
            optional = Optional.empty();
        } else {
            optional = Optional.ofNullable(asVar.c.mo85402g("assistant_settings_preferred_voice:".concat(g), (String) null));
        }
        if (optional.isEmpty()) {
            return Optional.empty();
        }
        String str = (String) optional.get();
        if (!r.containsKey(str)) {
            return Optional.empty();
        }
        return Optional.m71637of((String) r.get(str));
    }

    /* renamed from: Z */
    public final synchronized String mo83863Z() {
        if (!((bm) this.f258251k.mo27525b()).s()) {
            return mo83885ae();
        } else if (mo83848K()) {
            return ((bm) this.f258251k.mo27525b()).b();
        } else {
            return Locale.getDefault().toLanguageTag();
        }
    }

    /* renamed from: a */
    public final void mo83812a(boolean z) {
        C86341u uVar = new C86341u((C86346z) this.f258242b.f232790a.mo79722a());
        uVar.mo80085k("alwaysOnHotwordEnrolled", Boolean.valueOf(z));
        uVar.mo80086l(false);
    }

    /* renamed from: aA */
    public final void mo83864aA() {
        C86341u uVar = new C86341u((C86346z) this.f258242b.f232790a.mo79722a());
        uVar.mo80085k("eyes_free_intro_tts_flow_started", true);
        uVar.mo80086l(false);
    }

    /* renamed from: aB */
    public final void mo83865aB(String str) {
        C86341u uVar = new C86341u((C86346z) this.f258242b.f232790a.mo79722a());
        uVar.mo80073h("authTokenTypeRefreshed", str);
        uVar.mo80086l(false);
    }

    /* renamed from: aC */
    public final boolean mo83866aC() {
        if (!this.f258248h.mo79746e(C90110fh.f250678bh)) {
            return this.f258242b.f232790a.mo79722a().getBoolean("lockscreen_search_bluetooth", true);
        }
        boolean u = ((bm) this.f258251k.mo27525b()).u();
        return (!u || !this.f258248h.mo79746e(C90014bt.f247142ba)) ? u : mo87315aV();
    }

    /* renamed from: aD */
    public final boolean mo83867aD() {
        if (!this.f258248h.mo79746e(C90110fh.f250678bh)) {
            return this.f258242b.f232790a.mo79722a().getBoolean("lockscreen_search_headset", false);
        }
        boolean u = ((bm) this.f258251k.mo27525b()).u();
        return (!u || !this.f258248h.mo79746e(C90014bt.f247142ba)) ? u : mo87315aV();
    }

    /* renamed from: aE */
    public final boolean mo83868aE() {
        return this.f258242b.f232790a.mo79722a().getBoolean("eyes_free_intro_tts_flow_started", false);
    }

    /* renamed from: aF */
    public final boolean mo83869aF() {
        if (this.f258248h.mo79746e(C90110fh.f250676bf)) {
            return false;
        }
        if (!this.f258248h.mo79746e(C90110fh.f250677bg) || !((C58833ax) this.f258241F.mo27525b()).mo56113h() || !((C74720bx) ((C58833ax) this.f258241F.mo27525b()).mo56107c()).mo71089f().a()) {
            return this.f258242b.f232790a.mo79722a().getBoolean("bluetoothHeadset", false);
        }
        return true;
    }

    /* renamed from: aG */
    public final boolean mo83870aG() {
        if (this.f258242b.f232790a.mo79722a().getBoolean("audioLoggingEnabled", false) || ((C86130z) this.f258247g.mo27525b()).mo79767g(R.bool.debug_audio_logging_enabled)) {
            return true;
        }
        return false;
    }

    /* renamed from: aH */
    public final boolean mo83871aH() {
        return this.f258242b.f232790a.mo79722a().getBoolean("spoken-language-default", false);
    }

    /* renamed from: aI */
    public final boolean mo83872aI() {
        return "embeddedOnly".equals(m152244aX());
    }

    /* renamed from: aJ */
    public final synchronized boolean mo83873aJ(String str) {
        return this.f258242b.f232790a.mo79722a().getStringSet("enrollment_utterances_sent", new HashSet()).contains(str);
    }

    /* renamed from: aK */
    public final boolean mo83874aK() {
        return "networkOnly".equals(m152244aX());
    }

    /* renamed from: aL */
    public final synchronized boolean mo83875aL() {
        return this.f258242b.f232790a.mo79722a().getBoolean("nonDspToDspMigration", false);
    }

    /* renamed from: aM */
    public final boolean mo83876aM() {
        if (this.f258248h.mo79746e(C90110fh.f250679bi)) {
            return this.f258248h.mo79746e(C90082eg.f250078o);
        }
        return this.f258242b.f232790a.mo79722a().getBoolean("profanityFilter", true);
    }

    /* renamed from: aN */
    public final boolean mo83877aN() {
        return this.f258242b.f232790a.mo79722a().getBoolean("debugS3Logging", false);
    }

    /* renamed from: aO */
    public final synchronized boolean mo83878aO() {
        return this.f258242b.f232790a.mo79722a().contains("spoken-language-bcp-47");
    }

    /* renamed from: aP */
    public final boolean mo83879aP() {
        return this.f258242b.f232790a.mo79722a().getBoolean("undecidedStateBeforeMigration", false);
    }

    /* renamed from: aQ */
    public final synchronized void mo83880aQ(String str) {
        C86338r a = this.f258242b.f232790a.mo79722a();
        if (!str.equals(a.getString("spoken-language-bcp-47", (String) null))) {
            C86341u uVar = new C86341u((C86346z) a);
            uVar.mo80073h("spoken-language-bcp-47", str);
            uVar.mo80085k("spoken-language-default", true);
            uVar.mo80086l(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: aR */
    public final String mo87311aR(C90584f fVar, String str) {
        C90584f fVar2 = C90584f.UNKNOWN;
        if (fVar.ordinal() == 2 && mo87314aU(str)) {
            return "hotword_upgrade_prefix_xgoogle_".concat(String.valueOf(str));
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: aS */
    public final void mo87312aS(String str, String str2, EventForDump eventForDump) {
        String str3;
        if (str2 == null) {
            if (mo83847J(str)) {
                ((ap) this.f258261u.mo27525b()).a(false);
            }
            C86341u uVar = new C86341u((C86346z) this.f258242b.f232790a.mo79722a());
            uVar.mo80075j(mo83842E(str));
            uVar.mo80086l(false);
            str3 = "Remove";
        } else {
            C86341u uVar2 = new C86341u((C86346z) this.f258242b.f232790a.mo79722a());
            uVar2.mo80073h(mo83842E(str), str2);
            uVar2.mo80086l(false);
            ((ap) this.f258261u.mo27525b()).a(true);
            str3 = "Add";
        }
        ((C90548ak) this.f258252l.mo27525b()).mo84667a(C90552e.SPEAKER_MODEL, eventForDump, str3);
    }

    /* renamed from: aT */
    public final void mo87313aT() {
        C86338r a = this.f258242b.f232790a.mo79722a();
        String string = a.getString("spoken-language-bcp-47", (String) null);
        String locale = Locale.getDefault().toString();
        C8513w a2 = this.f258243c.mo87316a();
        if (string == null || !C92654a.m152612i(a2, string)) {
            m152245aY(a2);
            return;
        }
        boolean equals = string.equals(C92654a.m152607d(locale, a2));
        if (equals != a.getBoolean("spoken-language-default", false)) {
            C86341u uVar = new C86341u((C86346z) a);
            uVar.mo80085k("spoken-language-default", Boolean.valueOf(equals));
            uVar.mo80086l(false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0068, code lost:
        if (r0 == com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f.OK_HEY_GOOGLE) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0077, code lost:
        if (r4.f258248h.mo79745c(com.google.android.apps.gsa.shared.p7066m.C90082eg.f249896aL).contains(r5) != false) goto L_0x0079;
     */
    /* renamed from: aU */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo87314aU(java.lang.String r5) {
        /*
            r4 = this;
            com.google.android.apps.gsa.search.core.i.t r0 = r4.f258248h
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C89986ay.f246744a
            boolean r0 = r0.mo79746e(r1)
            if (r0 == 0) goto L_0x0020
            java.util.concurrent.ConcurrentMap r0 = r4.f258240E
            boolean r0 = r0.containsKey(r5)
            if (r0 != 0) goto L_0x0013
            goto L_0x0020
        L_0x0013:
            java.util.concurrent.ConcurrentMap r0 = r4.f258240E
            java.lang.Object r5 = r0.get(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L_0x0020:
            com.google.android.apps.gsa.search.core.i.t r0 = r4.f258248h
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f249894aJ
            boolean r0 = r0.mo79746e(r1)
            r1 = 0
            if (r0 == 0) goto L_0x007a
            com.google.android.apps.gsa.speech.hotword.b.b r0 = r4.f258264x
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90834k(r2)
            java.util.Map r0 = r0.mo87002b(r2)
            boolean r0 = r0.containsKey(r5)
            r2 = 1
            if (r0 == 0) goto L_0x006b
            com.google.android.apps.gsa.speech.hotword.b.b r0 = r4.f258264x
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            com.google.common.base.ax r3 = com.google.common.base.C58833ax.m90834k(r3)
            java.util.Map r0 = r0.mo87002b(r3)
            java.lang.Object r0 = r0.get(r5)
            com.google.android.libraries.search.n.p r0 = (com.google.android.libraries.search.p3055n.C39812p) r0
            if (r0 != 0) goto L_0x0058
            r0 = 0
            goto L_0x0066
        L_0x0058:
            int r0 = r0.f104695b
            com.google.android.libraries.search.n.o r0 = com.google.android.libraries.search.p3055n.C39811o.m69225a(r0)
            if (r0 != 0) goto L_0x0062
            com.google.android.libraries.search.n.o r0 = com.google.android.libraries.search.p3055n.C39811o.PHRASE_UNKNOWN
        L_0x0062:
            com.google.android.apps.gsa.shared.speech.hotword.a.f r0 = com.google.android.apps.gsa.speech.hotword.p7283b.C92353b.m151652a(r0)
        L_0x0066:
            com.google.android.apps.gsa.shared.speech.hotword.a.f r3 = com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f.OK_HEY_GOOGLE
            if (r0 != r3) goto L_0x007a
            goto L_0x0079
        L_0x006b:
            com.google.android.apps.gsa.search.core.i.t r0 = r4.f258248h
            com.google.android.apps.gsa.shared.m.h r3 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f249896aL
            com.google.common.b.gu r0 = r0.mo79745c(r3)
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L_0x007a
        L_0x0079:
            r1 = 1
        L_0x007a:
            if (r1 == 0) goto L_0x0088
            boolean r0 = r4.mo83816e()
            if (r0 == 0) goto L_0x0088
            com.google.android.apps.gsa.shared.speech.hotword.a.f r0 = com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f.OK_HEY_GOOGLE
            boolean r1 = r4.mo83815d(r0, r5)
        L_0x0088:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            com.google.android.apps.gsa.search.core.i.t r2 = r4.f258248h
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C89986ay.f246744a
            boolean r2 = r2.mo79746e(r3)
            if (r2 == 0) goto L_0x009b
            java.util.concurrent.ConcurrentMap r2 = r4.f258240E
            r2.put(r5, r0)
        L_0x009b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.speech.p7311n.C92536d.mo87314aU(java.lang.String):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: aV */
    public final boolean mo87315aV() {
        C60870cx cxVar;
        if (!this.f258248h.mo79746e(C90014bt.f247391gK)) {
            cxVar = C60856cj.m92900i(C9855w.DISABLED);
        } else if (!this.f258266z.mo56113h()) {
            cxVar = C60856cj.m92900i(C9855w.DISABLED);
        } else {
            cxVar = ((C9799ae) this.f258266z.mo56107c()).mo18041a();
        }
        C91018d.m148680c();
        try {
            return !((C9855w) cxVar.get()).equals(C9855w.DISABLED);
        } catch (InterruptedException | NullPointerException | CancellationException | ExecutionException e) {
            ((C59052c) ((C59052c) ((C59052c) f258235a.mo56226d()).mo56382g(e)).mo56372aa(12888)).mo56386p("#shouldAllowHeadsetQuerying assistantOnLockscreenFuture failed");
            return false;
        }
    }

    /* renamed from: aa */
    public final String mo83881aa() {
        return this.f258242b.f232790a.mo79722a().getString("s3SandboxOverride", (String) null);
    }

    /* renamed from: ab */
    public final String mo83882ab() {
        return ((C86338r) this.f258250j.mo27525b()).getString(C90507o.f253011a, (String) null);
    }

    /* renamed from: ac */
    public final String mo83883ac() {
        return (String) this.f258246f.mo27525b();
    }

    /* renamed from: ad */
    public final String mo83884ad() {
        return this.f258242b.f232790a.mo79722a().getString("debugS3Server", BuildConfig.FLAVOR);
    }

    /* renamed from: ae */
    public final synchronized String mo83885ae() {
        String string = this.f258242b.f232790a.mo79722a().getString("spoken-language-bcp-47", (String) null);
        if (string != null) {
            return string;
        }
        return m152245aY(this.f258243c.mo87316a());
    }

    /* renamed from: af */
    public final String mo83886af() {
        long serialNumberForUser = ((UserManager) this.f258245e.getSystemService("user")).getSerialNumberForUser(UserHandleCompat.m148154a().f253767a);
        if (serialNumberForUser == -1) {
            ((C59052c) ((C59052c) f258235a.mo56226d()).mo56372aa(12847)).mo56386p("User does not exist!");
            serialNumberForUser = -1;
        }
        return String.valueOf(serialNumberForUser);
    }

    @Deprecated
    /* renamed from: ag */
    public final String mo83887ag() {
        if (this.f258256p.mo56113h()) {
            return (String) this.f258256p.mo56107c();
        }
        return this.f258248h.mo79758x(C90120fr.f250807aT);
    }

    /* renamed from: ah */
    public final String mo83888ah() {
        return this.f258242b.f232790a.mo79722a().getString("authTokenTypeRefreshed", BuildConfig.FLAVOR);
    }

    /* renamed from: ai */
    public final synchronized LinkedHashMap mo83889ai() {
        LinkedHashMap linkedHashMap;
        ArrayList f = C92654a.m152609f(this.f258243c.mo87316a());
        ArrayList g = C92654a.m152610g(this.f258243c.mo87316a());
        linkedHashMap = new LinkedHashMap();
        if (f.size() != g.size()) {
            C0118a.m96d(f258235a.mo56225c(), "Supported Locales BCP47 codes list and display names sizes don't match", 12849, C58979ad.MEDIUM);
        } else {
            for (int i = 0; i < f.size(); i++) {
                linkedHashMap.put((String) f.get(i), (String) g.get(i));
            }
        }
        return linkedHashMap;
    }

    /* renamed from: aj */
    public final synchronized List mo83890aj() {
        Set stringSet;
        C86338r a = this.f258242b.f232790a.mo79722a();
        stringSet = a.getStringSet("additional-spoken-language-bcp-47", (Set) null);
        if (stringSet == null) {
            stringSet = new HashSet();
            C86341u uVar = new C86341u((C86346z) a);
            uVar.mo80074i("additional-spoken-language-bcp-47", stringSet);
            uVar.mo80086l(false);
        }
        return new ArrayList(stringSet);
    }

    /* renamed from: ak */
    public final List mo83891ak() {
        ArrayList e = C58597ky.m90214e(1);
        e.add(this.f258243c.mo87316a().f29532b);
        for (Integer intValue : this.f258248h.mo79759y()) {
            e.add(Integer.toString(intValue.intValue()));
        }
        for (Integer intValue2 : this.f258248h.mo79737h()) {
            e.add(Integer.toString(intValue2.intValue()));
        }
        return e;
    }

    /* renamed from: al */
    public final Locale mo83892al() {
        Locale u;
        if (!((bm) this.f258251k.mo27525b()).s()) {
            return mo83893am();
        }
        if (!mo83848K() || (u = C90772bp.m148313u(((bm) this.f258251k.mo27525b()).b())) == null) {
            return Locale.getDefault();
        }
        return u;
    }

    /* renamed from: am */
    public final Locale mo83893am() {
        C8460ac a = C92654a.m152604a(this.f258243c.mo87316a(), mo83885ae());
        return (a == null || (a.f29381a & 4) == 0) ? C92654a.f258635a : C90725ai.m148180b(a.f29385e, C92654a.f258635a);
    }

    /* renamed from: an */
    public final synchronized void mo83894an() {
        C86341u uVar = new C86341u((C86346z) this.f258242b.f232790a.mo79722a());
        uVar.mo80075j("enrollment_utterances_sent");
        uVar.mo80086l(false);
    }

    /* renamed from: ao */
    public final synchronized void mo83895ao(String str) {
        mo83901au(mo83854Q(str) + 1, str);
    }

    /* renamed from: ap */
    public final synchronized void mo83896ap(String str) {
        Set stringSet = this.f258242b.f232790a.mo79722a().getStringSet("enrollment_utterances_sent", (Set) null);
        HashSet hashSet = stringSet == null ? new HashSet(1) : new HashSet(stringSet);
        hashSet.add(str);
        C86341u uVar = new C86341u((C86346z) this.f258242b.f232790a.mo79722a());
        uVar.mo80074i("enrollment_utterances_sent", hashSet);
        uVar.mo80086l(false);
    }

    /* renamed from: aq */
    public final void mo83897aq() {
        C86341u uVar = new C86341u((C86346z) this.f258242b.f232790a.mo79722a());
        uVar.mo80085k("eyes_free_intro_tts_flow_started", false);
        uVar.mo80085k("has_prompted_hands_free_headset_setting", false);
        uVar.mo80086l(false);
        C86341u uVar2 = new C86341u((C86346z) this.f258242b.f232790a.mo79722a());
        uVar2.mo80085k("lockscreen_search_bluetooth", true);
        uVar2.mo80085k("lockscreen_search_headset", false);
        this.f258245e.getPackageManager().clearPackagePreferredActivities("com.google.android.googlequicksearchbox");
        uVar2.mo80086l(false);
    }

    /* renamed from: ar */
    public final void mo83898ar(String str, long j) {
        C86341u uVar = new C86341u((C86346z) this.f258242b.f232790a.mo79722a());
        uVar.mo80085k(String.format("last_adaptive_tts_time_%s", new Object[]{str}), Long.valueOf(j));
        uVar.mo80086l(false);
    }

    /* renamed from: as */
    public final void mo83899as(String str, int i) {
        C86341u uVar = new C86341u((C86346z) this.f258242b.f232790a.mo79722a());
        uVar.mo80085k(String.format("adaptive_tts_%s", new Object[]{str}), Integer.valueOf(i));
        uVar.mo80086l(false);
    }

    /* renamed from: at */
    public final synchronized void mo83900at() {
        C86341u uVar = new C86341u((C86346z) this.f258242b.f232790a.mo79722a());
        uVar.mo80085k("nonDspToDspMigration", true);
        uVar.mo80086l(false);
    }

    /* renamed from: au */
    public final synchronized void mo83901au(int i, String str) {
        C86341u uVar = new C86341u((C86346z) this.f258242b.f232790a.mo79722a());
        uVar.mo80085k("enrollment_utterances_send_attempts_".concat(String.valueOf(str)), Integer.valueOf(i));
        uVar.mo80086l(false);
    }

    /* renamed from: av */
    public final void mo83902av() {
        C86341u uVar = new C86341u((C86346z) this.f258242b.f232790a.mo79722a());
        uVar.mo80085k("hasEverUsedVoiceSearch", true);
        uVar.mo80086l(false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0100  */
    /* renamed from: aw */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo83903aw(int r6, com.google.android.apps.gsa.shared.speech.dumper.EventForDump r7) {
        /*
            r5 = this;
            com.google.common.f.ad r0 = com.google.common.p4526f.C58979ad.FULL
            java.lang.String r1 = "stack size"
            com.google.common.p4526f.p4534f.C59081b.m91349a(r0, r1)
            com.google.android.apps.gsa.search.core.i.w r0 = r5.f258242b
            com.google.android.apps.gsa.search.core.i.aa r0 = r0.f232790a
            com.google.android.apps.gsa.search.core.preferences.r r0 = r0.mo79722a()
            java.lang.String r1 = "hotword_enrollment_state"
            r2 = 0
            int r0 = r0.getInt(r1, r2)
            if (r0 != r6) goto L_0x0039
            com.google.android.apps.gsa.search.core.i.w r3 = r5.f258242b
            com.google.android.apps.gsa.search.core.i.aa r3 = r3.f232790a
            com.google.android.apps.gsa.search.core.preferences.r r3 = r3.mo79722a()
            boolean r3 = r3.contains(r1)
            if (r3 != 0) goto L_0x0027
            goto L_0x0039
        L_0x0027:
            dagger.a r1 = r5.f258252l
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.shared.speech.dumper.ak r1 = (com.google.android.apps.gsa.shared.speech.dumper.C90548ak) r1
            com.google.android.apps.gsa.shared.speech.dumper.e r3 = com.google.android.apps.gsa.shared.speech.dumper.C90552e.HW_ENROLLMENT_STATE_NO_OP
            java.lang.String r4 = java.lang.Integer.toString(r6)
            r1.mo84667a(r3, r7, r4)
            goto L_0x0084
        L_0x0039:
            com.google.android.apps.gsa.search.core.i.w r3 = r5.f258242b
            com.google.android.apps.gsa.search.core.i.aa r3 = r3.f232790a
            com.google.android.apps.gsa.search.core.preferences.r r3 = r3.mo79722a()
            com.google.android.apps.gsa.search.core.preferences.u r4 = new com.google.android.apps.gsa.search.core.preferences.u
            com.google.android.apps.gsa.search.core.preferences.z r3 = (com.google.android.apps.gsa.search.core.preferences.C86346z) r3
            r4.<init>(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            r4.mo80085k(r1, r3)
            r4.mo80086l(r2)
            dagger.a r1 = r5.f258252l
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.shared.speech.dumper.ak r1 = (com.google.android.apps.gsa.shared.speech.dumper.C90548ak) r1
            com.google.android.apps.gsa.shared.speech.dumper.e r3 = com.google.android.apps.gsa.shared.speech.dumper.C90552e.HW_ENROLLMENT_STATE
            java.lang.String r4 = java.lang.Integer.toString(r6)
            r1.mo84667a(r3, r7, r4)
            r7 = 4
            if (r6 != r7) goto L_0x0084
            com.google.android.apps.gsa.search.core.i.w r7 = r5.f258242b
            com.google.android.apps.gsa.search.core.i.aa r7 = r7.f232790a
            com.google.android.apps.gsa.search.core.preferences.r r7 = r7.mo79722a()
            com.google.android.apps.gsa.search.core.preferences.u r1 = new com.google.android.apps.gsa.search.core.preferences.u
            com.google.android.apps.gsa.search.core.preferences.z r7 = (com.google.android.apps.gsa.search.core.preferences.C86346z) r7
            r1.<init>(r7)
            java.lang.String r7 = "voice_onboarding_completed"
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            r1.mo80085k(r7, r3)
            r1.mo80086l(r2)
            r5.mo83905ay(r2)
        L_0x0084:
            r7 = 1
            if (r0 != 0) goto L_0x008e
            if (r6 != r7) goto L_0x008c
            com.google.android.apps.gsa.u.b r7 = com.google.android.apps.gsa.p8852u.C118569b.VOICE_MATCH_ENROLLMENT_STATE_UNDECIDED_TO_ENROLLED_COUNT
            goto L_0x00ab
        L_0x008c:
            r1 = 0
            goto L_0x008f
        L_0x008e:
            r1 = r0
        L_0x008f:
            r3 = 2
            if (r1 != 0) goto L_0x0097
            if (r6 != r3) goto L_0x0098
            com.google.android.apps.gsa.u.b r7 = com.google.android.apps.gsa.p8852u.C118569b.VOICE_MATCH_ENROLLMENT_STATE_UNDECIDED_TO_DECLINED_COUNT
            goto L_0x00ab
        L_0x0097:
            r2 = r1
        L_0x0098:
            if (r2 == r3) goto L_0x009d
            r1 = 3
            if (r2 != r1) goto L_0x00a2
        L_0x009d:
            if (r6 != r7) goto L_0x00a2
            com.google.android.apps.gsa.u.b r7 = com.google.android.apps.gsa.p8852u.C118569b.VOICE_MATCH_ENROLLMENT_STATE_DECLINED_TO_ENROLLED_COUNT
            goto L_0x00ab
        L_0x00a2:
            r1 = 0
            if (r2 != r7) goto L_0x00aa
            if (r6 != r3) goto L_0x00aa
            com.google.android.apps.gsa.u.b r7 = com.google.android.apps.gsa.p8852u.C118569b.VOICE_MATCH_ENROLLMENT_STATE_ENROLLED_TO_DECLINED_COUNT
            goto L_0x00ab
        L_0x00aa:
            r7 = r1
        L_0x00ab:
            if (r7 == 0) goto L_0x00c0
            dagger.a r1 = r5.f258257q
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.y.a r1 = (com.google.android.apps.gsa.p8885y.C118827a) r1
            com.google.android.apps.gsa.u.h r2 = com.google.android.apps.gsa.p8852u.C118575h.WORKER_ASSISTANT_SETTINGS
            com.google.android.apps.gsa.y.a.d r7 = r1.mo77944g(r7, r2)
            r1 = 1
            r7.mo104025g(r1)
        L_0x00c0:
            boolean r7 = r5.mo83816e()
            if (r7 == 0) goto L_0x00e6
            com.google.common.f.e r7 = f258235a
            com.google.common.f.x r7 = r7.mo56224b()
            java.lang.String r1 = "Hotword State updated, sending intent to update GVIS Hotword info."
            r2 = 12862(0x323e, float:1.8024E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r2)).mo56386p(r1)
            android.content.Intent r7 = new android.content.Intent
            java.lang.String r1 = "com.google.android.googlequicksearchbox.FROM_ANY_SCREEN_PREFERENCE_CHANGED"
            r7.<init>(r1)
            java.lang.String r1 = "com.google.android.googlequicksearchbox"
            r7.setPackage(r1)
            android.content.Context r1 = r5.f258245e
            java.lang.String r2 = "android.permission.MANAGE_VOICE_KEYPHRASES"
            r1.sendBroadcast(r7, r2)
        L_0x00e6:
            if (r0 == r6) goto L_0x0100
            com.google.common.base.ax r6 = r5.f258265y
            boolean r6 = r6.mo56113h()
            if (r6 == 0) goto L_0x0100
            com.google.common.base.ax r6 = r5.f258265y
            java.lang.Object r6 = r6.mo56107c()
            com.google.android.libraries.search.n.c.a.az r6 = (com.google.android.libraries.search.p3055n.p3061c.p3062a.C39410az) r6
            com.google.android.libraries.search.n.c.a.i.c r6 = r6.f103758a
            com.google.android.libraries.search.n.c.a.i.j r7 = com.google.android.libraries.search.p3055n.p3061c.p3062a.p3072i.C39618j.f104289c
            r6.mo41951b(r7)
            return
        L_0x0100:
            com.google.common.base.ax r6 = r5.f258265y
            r6.mo56113h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.speech.p7311n.C92536d.mo83903aw(int, com.google.android.apps.gsa.shared.speech.dumper.EventForDump):void");
    }

    /* renamed from: ax */
    public final void mo83904ax(int i) {
        if (!(i == 0 || i == 1)) {
            i = 2;
        }
        C86341u uVar = new C86341u((C86346z) this.f258242b.f232790a.mo79722a());
        uVar.mo80085k("languagePacksAutoUpdate", Integer.valueOf(i));
        uVar.mo80086l(false);
    }

    /* renamed from: ay */
    public final void mo83905ay(int i) {
        C86341u uVar = new C86341u((C86346z) this.f258242b.f232790a.mo79722a());
        uVar.mo80085k("hotword_enrollment_skipped", Integer.valueOf(i));
        uVar.mo80086l(false);
    }

    /* renamed from: az */
    public final synchronized void mo83906az(String str, List list, boolean z) {
        C86338r a = this.f258242b.f232790a.mo79722a();
        boolean equals = str.equals(a.getString("spoken-language-bcp-47", (String) null));
        HashSet hashSet = new HashSet(list);
        boolean z2 = !a.getStringSet("additional-spoken-language-bcp-47", new HashSet()).equals(hashSet);
        if ((!equals) || z2) {
            C86341u uVar = new C86341u((C86346z) a);
            uVar.mo80073h("spoken-language-bcp-47", str);
            uVar.mo80074i("additional-spoken-language-bcp-47", hashSet);
            uVar.mo80085k("spoken-language-default", Boolean.valueOf(z));
            uVar.mo80086l(false);
        }
    }

    /* renamed from: b */
    public final void mo83813b(boolean z) {
        C86341u uVar = new C86341u((C86346z) this.f258242b.f232790a.mo79722a());
        uVar.mo80085k("supportsAlwaysOn", Boolean.valueOf(z));
        uVar.mo80086l(false);
    }

    /* renamed from: c */
    public final void mo83814c(int i, boolean z, String str) {
        C90584f fVar = C90584f.OK_GOOGLE;
        C90584f fVar2 = C90584f.OK_HEY_GOOGLE;
        if (i == fVar2.f253255d) {
            fVar = fVar2;
        }
        String aW = m152243aW(fVar, str);
        if (aW != null) {
            C86341u uVar = new C86341u((C86346z) this.f258242b.f232790a.mo79722a());
            uVar.mo80085k(aW, Boolean.valueOf(z));
            uVar.mo80086l(false);
        }
    }

    /* renamed from: d */
    public final boolean mo83815d(C90584f fVar, String str) {
        String aW = m152243aW(fVar, str);
        if (aW == null) {
            return true;
        }
        if (this.f258242b.f232790a.mo79722a().contains(aW)) {
            return this.f258242b.f232790a.mo79722a().getBoolean(aW, true);
        }
        if (!this.f258248h.mo79746e(C90082eg.f249962bY)) {
            return true;
        }
        ((C59052c) ((C59052c) f258235a.mo56224b()).mo56372aa(12872)).mo56386p("Exception device found.");
        return false;
    }

    /* renamed from: e */
    public final boolean mo83816e() {
        if (!this.f258242b.f232790a.mo79722a().getBoolean("supportsAlwaysOn", false) || !this.f258248h.mo79746e(C90120fr.f250761A)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo83817f() {
        return mo83816e() && mo83847J(mo83882ab()) && mo83855R() == 1;
    }

    /* renamed from: g */
    public final boolean mo83818g() {
        return this.f258242b.f232790a.mo79722a().getBoolean("alwaysOnHotwordEnrolled", false);
    }

    /* renamed from: h */
    public final boolean mo83819h() {
        return this.f258242b.f232790a.mo79722a().getBoolean("hotwordDetector", true);
    }

    /* renamed from: i */
    public final boolean mo83820i() {
        PackageManager packageManager = this.f258245e.getPackageManager();
        String[] strArr = C90721ae.f253793b;
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(strArr[i], 0);
                if (packageInfo == null) {
                    i++;
                } else if (packageInfo.versionCode >= ((int) this.f258248h.mo79743a(C90086ek.f250477dq))) {
                    return true;
                } else {
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return false;
    }

    /* renamed from: j */
    public final boolean mo83821j() {
        return this.f258242b.f232790a.mo79722a().getBoolean("hotword_navigation_requirement_met", false);
    }

    /* renamed from: k */
    public final boolean mo83822k() {
        return this.f258242b.f232790a.mo79722a().getBoolean("hotwordInNav", true);
    }

    /* renamed from: l */
    public final boolean mo83823l() {
        String Z = mo83863Z();
        if (this.f258248h.mo79746e(C89986ay.f246744a) && this.f258237B.containsKey(Z)) {
            return ((Boolean) this.f258237B.get(Z)).booleanValue();
        }
        C90580b bVar = (C90580b) mo83829r().get(Z);
        boolean z = false;
        if (!(bVar == null || (bVar.f253239a & 8) == 0 || !bVar.f253243e)) {
            z = true;
        }
        if (this.f258248h.mo79746e(C89986ay.f246744a)) {
            this.f258237B.put(Z, Boolean.valueOf(z));
        }
        return z;
    }

    /* renamed from: m */
    public final boolean mo83824m(String str) {
        if (mo83816e()) {
            ((C59052c) ((C59052c) f258235a.mo56226d()).mo56372aa(12882)).mo56386p("isAlwaysOnHotwordAvailable but still checking isVoiceEverywhereEnabled");
        }
        if (mo83816e() || mo83855R() != 1 || !mo83847J(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public final boolean mo83825n(String str) {
        return (mo83817f() || mo83824m(str)) && mo83847J(str);
    }

    /* renamed from: o */
    public final void mo83826o(EventForDump eventForDump) {
        C86341u uVar = new C86341u((C86346z) this.f258242b.f232790a.mo79722a());
        uVar.mo80085k("always_on_hotword_suppressed", false);
        uVar.mo80086l(false);
        ((C90548ak) this.f258252l.mo27525b()).mo84667a(C90552e.VOICE_MATCH, eventForDump, "true");
    }

    /* renamed from: p */
    public final C90584f mo83827p() {
        return mo83833v(C90584f.OK_HEY_GOOGLE, mo83863Z()) ? C90584f.OK_HEY_GOOGLE : C90584f.OK_GOOGLE;
    }

    /* renamed from: q */
    public final C90584f mo83828q() {
        return C90584f.m147800a(this.f258242b.f232790a.mo79722a().getInt("google_home_enrollment_model_type", C90584f.OK_HEY_GOOGLE.f253255d));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0055, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009d, code lost:
        return r0;
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:27:0x0077=Splitter:B:27:0x0077, B:12:0x002f=Splitter:B:12:0x002f} */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.common.p4522b.C58495hd mo83829r() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.apps.gsa.shared.speech.hotword.a.f r0 = com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f.OK_HEY_GOOGLE     // Catch:{ all -> 0x009e }
            java.lang.String r1 = r3.mo83863Z()     // Catch:{ all -> 0x009e }
            boolean r0 = r3.mo83833v(r0, r1)     // Catch:{ all -> 0x009e }
            r1 = 0
            if (r0 == 0) goto L_0x0056
            com.google.android.apps.gsa.search.core.i.t r0 = r3.f258248h     // Catch:{ all -> 0x009e }
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C89986ay.f246744a     // Catch:{ all -> 0x009e }
            boolean r0 = r0.mo79746e(r2)     // Catch:{ all -> 0x009e }
            if (r0 == 0) goto L_0x002f
            java.util.concurrent.ConcurrentMap r0 = r3.f258239D     // Catch:{ all -> 0x009e }
            com.google.android.apps.gsa.shared.speech.hotword.a.f r2 = com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f.OK_HEY_GOOGLE     // Catch:{ all -> 0x009e }
            boolean r0 = r0.containsKey(r2)     // Catch:{ all -> 0x009e }
            if (r0 != 0) goto L_0x0023
            goto L_0x002f
        L_0x0023:
            java.util.concurrent.ConcurrentMap r0 = r3.f258239D     // Catch:{ all -> 0x009e }
            com.google.android.apps.gsa.shared.speech.hotword.a.f r1 = com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f.OK_HEY_GOOGLE     // Catch:{ all -> 0x009e }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x009e }
            com.google.common.b.hd r0 = (com.google.common.p4522b.C58495hd) r0     // Catch:{ all -> 0x009e }
            monitor-exit(r3)
            return r0
        L_0x002f:
            dagger.a r0 = r3.f258249i     // Catch:{ all -> 0x009e }
            java.lang.Object r0 = r0.mo27525b()     // Catch:{ all -> 0x009e }
            com.google.android.apps.gsa.speech.hotword.b.a r0 = (com.google.android.apps.gsa.speech.hotword.p7283b.C92351a) r0     // Catch:{ all -> 0x009e }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x009e }
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r1)     // Catch:{ all -> 0x009e }
            com.google.common.b.hd r0 = r0.mo87001c(r1)     // Catch:{ all -> 0x009e }
            com.google.android.apps.gsa.search.core.i.t r1 = r3.f258248h     // Catch:{ all -> 0x009e }
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C89986ay.f246744a     // Catch:{ all -> 0x009e }
            boolean r1 = r1.mo79746e(r2)     // Catch:{ all -> 0x009e }
            if (r1 == 0) goto L_0x0054
            java.util.concurrent.ConcurrentMap r1 = r3.f258239D     // Catch:{ all -> 0x009e }
            com.google.android.apps.gsa.shared.speech.hotword.a.f r2 = com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f.OK_HEY_GOOGLE     // Catch:{ all -> 0x009e }
            r1.put(r2, r0)     // Catch:{ all -> 0x009e }
        L_0x0054:
            monitor-exit(r3)
            return r0
        L_0x0056:
            com.google.android.apps.gsa.search.core.i.t r0 = r3.f258248h     // Catch:{ all -> 0x009e }
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C89986ay.f246744a     // Catch:{ all -> 0x009e }
            boolean r0 = r0.mo79746e(r2)     // Catch:{ all -> 0x009e }
            if (r0 == 0) goto L_0x0077
            java.util.concurrent.ConcurrentMap r0 = r3.f258239D     // Catch:{ all -> 0x009e }
            com.google.android.apps.gsa.shared.speech.hotword.a.f r2 = com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f.OK_GOOGLE     // Catch:{ all -> 0x009e }
            boolean r0 = r0.containsKey(r2)     // Catch:{ all -> 0x009e }
            if (r0 != 0) goto L_0x006b
            goto L_0x0077
        L_0x006b:
            java.util.concurrent.ConcurrentMap r0 = r3.f258239D     // Catch:{ all -> 0x009e }
            com.google.android.apps.gsa.shared.speech.hotword.a.f r1 = com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f.OK_GOOGLE     // Catch:{ all -> 0x009e }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x009e }
            com.google.common.b.hd r0 = (com.google.common.p4522b.C58495hd) r0     // Catch:{ all -> 0x009e }
            monitor-exit(r3)
            return r0
        L_0x0077:
            dagger.a r0 = r3.f258249i     // Catch:{ all -> 0x009e }
            java.lang.Object r0 = r0.mo27525b()     // Catch:{ all -> 0x009e }
            com.google.android.apps.gsa.speech.hotword.b.a r0 = (com.google.android.apps.gsa.speech.hotword.p7283b.C92351a) r0     // Catch:{ all -> 0x009e }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x009e }
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r1)     // Catch:{ all -> 0x009e }
            com.google.common.b.hd r0 = r0.mo86999a(r1)     // Catch:{ all -> 0x009e }
            com.google.android.apps.gsa.search.core.i.t r1 = r3.f258248h     // Catch:{ all -> 0x009e }
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C89986ay.f246744a     // Catch:{ all -> 0x009e }
            boolean r1 = r1.mo79746e(r2)     // Catch:{ all -> 0x009e }
            if (r1 == 0) goto L_0x009c
            java.util.concurrent.ConcurrentMap r1 = r3.f258239D     // Catch:{ all -> 0x009e }
            com.google.android.apps.gsa.shared.speech.hotword.a.f r2 = com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f.OK_GOOGLE     // Catch:{ all -> 0x009e }
            r1.put(r2, r0)     // Catch:{ all -> 0x009e }
        L_0x009c:
            monitor-exit(r3)
            return r0
        L_0x009e:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.speech.p7311n.C92536d.mo83829r():com.google.common.b.hd");
    }

    /* renamed from: s */
    public final String mo83830s() {
        return true != mo83833v(C90584f.OK_HEY_GOOGLE, mo83863Z()) ? "Ok Google" : "X Google";
    }

    /* renamed from: t */
    public final void mo83831t(C90584f fVar) {
        C86341u uVar = new C86341u((C86346z) this.f258242b.f232790a.mo79722a());
        uVar.mo80085k("google_home_enrollment_model_type", Integer.valueOf(fVar.f253255d));
        uVar.mo80086l(false);
    }

    /* renamed from: u */
    public final void mo83832u(C90584f fVar, String str) {
        String aR = mo87311aR(fVar, str);
        if (aR != null) {
            C86341u uVar = new C86341u((C86346z) this.f258242b.f232790a.mo79722a());
            uVar.mo80085k(aR, true);
            uVar.mo80086l(false);
            return;
        }
        ((C59052c) ((C59052c) f258235a.mo56226d()).mo56372aa(12868)).mo56386p("HotwordUpgradedPreferenceKey is null");
    }

    /* renamed from: v */
    public final boolean mo83833v(C90584f fVar, String str) {
        String aR = mo87311aR(fVar, str);
        if (this.f258248h.mo79746e(C89986ay.f246744a) && this.f258238C.containsKey(aR)) {
            return ((Boolean) this.f258238C.get(aR)).booleanValue();
        }
        boolean z = false;
        if (aR != null && (fVar != C90584f.OK_HEY_GOOGLE || mo87314aU(str))) {
            if (!this.f258248h.mo79746e(C90082eg.f250049df)) {
                z = this.f258242b.f232790a.mo79722a().getBoolean(aR, false);
            } else if (fVar == C90584f.OK_HEY_GOOGLE && mo87314aU(str)) {
                z = true;
            }
        }
        if (this.f258248h.mo79746e(C89986ay.f246744a) && aR != null) {
            this.f258238C.put(aR, Boolean.valueOf(z));
        }
        return z;
    }

    /* renamed from: w */
    public final boolean mo83834w() {
        return mo87314aU(mo83863Z());
    }

    /* renamed from: x */
    public final synchronized int mo83838x() {
        return this.f258242b.f232790a.mo79722a().getInt("lockscreen_personal_response_enable_status", 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0040, code lost:
        return;
     */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo83839y() {
        /*
            r4 = this;
            monitor-enter(r4)
            com.google.android.apps.gsa.search.core.i.t r0 = r4.f258248h     // Catch:{ all -> 0x0041 }
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247797nt     // Catch:{ all -> 0x0041 }
            boolean r0 = r0.mo79746e(r1)     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x003f
            int r0 = r4.mo83838x()     // Catch:{ all -> 0x0041 }
            if (r0 != 0) goto L_0x003f
            boolean r0 = r4.mo83835A()     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x003f
            java.lang.String r0 = "Reset lockscreen personal response"
            r1 = 5
            com.google.android.apps.gsa.shared.speech.dumper.EventForDump.m147676e(r1, r0)     // Catch:{ all -> 0x0041 }
            r0 = 0
            r4.mo83837C(r0)     // Catch:{ all -> 0x0041 }
            com.google.android.apps.gsa.search.core.i.w r1 = r4.f258242b     // Catch:{ all -> 0x0041 }
            com.google.android.apps.gsa.search.core.i.aa r1 = r1.f232790a     // Catch:{ all -> 0x0041 }
            com.google.android.apps.gsa.search.core.preferences.r r1 = r1.mo79722a()     // Catch:{ all -> 0x0041 }
            com.google.android.apps.gsa.search.core.preferences.u r2 = new com.google.android.apps.gsa.search.core.preferences.u     // Catch:{ all -> 0x0041 }
            com.google.android.apps.gsa.search.core.preferences.z r1 = (com.google.android.apps.gsa.search.core.preferences.C86346z) r1     // Catch:{ all -> 0x0041 }
            r2.<init>(r1)     // Catch:{ all -> 0x0041 }
            java.lang.String r1 = "lockscreen_personal_response_enable_status"
            r3 = 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0041 }
            r2.mo80085k(r1, r3)     // Catch:{ all -> 0x0041 }
            r2.mo80086l(r0)     // Catch:{ all -> 0x0041 }
            monitor-exit(r4)
            return
        L_0x003f:
            monitor-exit(r4)
            return
        L_0x0041:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.speech.p7311n.C92536d.mo83839y():void");
    }

    /* renamed from: z */
    public final synchronized boolean mo83840z() {
        return this.f258242b.f232790a.mo79722a().getBoolean("headphone_lockscreen_personal_response", false);
    }
}
