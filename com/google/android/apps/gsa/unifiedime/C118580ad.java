package com.google.android.apps.gsa.unifiedime;

import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.search.shared.service.C87677ae;
import com.google.android.apps.gsa.shared.logger.C89834a;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.C89954v;
import com.google.android.apps.gsa.shared.logger.C89957y;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.search.C90498f;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.android.apps.gsa.shared.speech.p7142d.C90536a;
import com.google.android.apps.gsa.shared.util.C90743b;
import com.google.android.apps.gsa.shared.util.p7159c.C90892az;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.shared.util.p7159c.C90932cb;
import com.google.android.apps.gsa.speech.p7311n.C92541i;
import com.google.android.apps.gsa.speech.utils.C92654a;
import com.google.android.apps.gsa.voiceime.C118692d;
import com.google.android.apps.gsa.voiceime.C118693e;
import com.google.android.apps.gsa.voiceime.C118695g;
import com.google.android.apps.gsa.voiceime.C118696h;
import com.google.android.gms.common.C143701ac;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.C60658ya;
import com.google.common.p4552o.C60660yc;
import com.google.common.p4552o.amo;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;
import com.google.protos.p4816ai.p4818b.C63196b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.unifiedime.ad */
/* compiled from: PG */
final class C118580ad extends C118593k {

    /* renamed from: a */
    final /* synthetic */ UnifiedImeService f330841a;

    public C118580ad(UnifiedImeService unifiedImeService) {
        this.f330841a = unifiedImeService;
    }

    /* renamed from: e */
    private final boolean m196875e(C118595m mVar, C118598p pVar) {
        C118598p pVar2 = pVar;
        if (!((C143701ac) this.f330841a.f330815c.mo27525b()).mo119085d(Binder.getCallingUid())) {
            ((C89911f) this.f330841a.f330816d.mo27525b()).mo83755a((Throwable) null, 142305844, 29).mo83721a();
            return false;
        }
        if (this.f330841a.f330817e == null) {
            ((C59052c) ((C59052c) UnifiedImeService.f330813a.mo56224b()).mo56372aa(34043)).mo56386p("Creating the connector!");
            UnifiedImeService unifiedImeService = this.f330841a;
            unifiedImeService.f330817e = (C118579ac) unifiedImeService.f330814b.mo17428b();
        }
        C118579ac acVar = this.f330841a.f330817e;
        acVar.f330840u = mVar;
        if (!acVar.f330836q) {
            try {
                C59104x b = C118579ac.f330820a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "UnifiedImeServiceConn");
                ((C59052c) ((C59052c) b).mo56372aa(34037)).mo56386p("Falling back.");
                C118595m mVar2 = acVar.f330840u;
                mVar2.getClass();
                mVar2.mo103781e(5);
            } catch (Exception e) {
                C59104x c = C118579ac.f330820a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "UnifiedImeServiceConn");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(34038)).mo56386p("IUnifiedImeServiceCallback fallback failed.");
            }
        } else {
            if (acVar.f330834o == null) {
                C118696h hVar = acVar.f330832m;
                amo amo = amo.UNIFIED_IME;
                C118578ab abVar = new C118578ab(acVar);
                C90932cb cbVar = (C90932cb) hVar.f331097a.mo17428b();
                cbVar.getClass();
                ((C90021c) hVar.f331098b.mo17428b()).getClass();
                C87677ae aeVar = (C87677ae) hVar.f331099c.mo17428b();
                aeVar.getClass();
                amo.getClass();
                acVar.f330834o = new C118695g(cbVar, aeVar, amo, abVar);
            }
            Context context = acVar.f330822c;
            C89994f fVar = (C89994f) acVar.f330825f.mo27525b();
            C90021c cVar = (C90021c) acVar.f330823d.mo27525b();
            C86338r rVar = (C86338r) acVar.f330830k.mo27525b();
            ArrayList f = C92654a.m152609f(((C92541i) acVar.f330831l.mo27525b()).mo87316a());
            String str = pVar2.f330879b;
            C62971cq<String> cqVar = pVar2.f330880c;
            C58495hd hdVar = C118596n.f330875a;
            C118582af afVar = new C118582af();
            String a = C118583ag.m196881a(str, C118596n.f330875a, f);
            afVar.mo103771a(a);
            for (String a2 : cqVar) {
                afVar.mo103771a(C118583ag.m196881a(a2, C118596n.f330875a, f));
            }
            int size = (afVar.f330844a == null ? 0 : 1) + afVar.f330845b.size();
            if (size == 0) {
                afVar.mo103771a(fVar.mo83885ae());
                if (C118583ag.m196886f(afVar.f330844a, rVar)) {
                    String displayName = fVar.mo83893am().getDisplayName();
                    String ae = fVar.mo83885ae();
                    if (C118583ag.m196886f(ae, rVar)) {
                        C118583ag.m196884d(context, context.getString(R.string.unified_ime_recognition_locale_toast, new Object[]{displayName}));
                        C118583ag.m196883c(ae, rVar);
                    }
                }
                size = 0;
            }
            if (!TextUtils.equals(a, afVar.f330844a)) {
                ((C59052c) ((C59052c) C118583ag.f330846a.mo56224b()).mo56372aa(34051)).mo56389s("Falling back to %s for primary locale.", afVar.f330844a);
            }
            if (cVar.mo79746e(C90082eg.f250047dd)) {
                afVar.mo103771a(fVar.mo83885ae());
                if (size < 2) {
                    for (String a3 : fVar.mo83890aj()) {
                        afVar.mo103771a(a3);
                    }
                }
            }
            String str2 = afVar.f330844a;
            if (str2 != null) {
                C118591i iVar = new C118591i(str2, afVar.f330845b);
                boolean aM = ((C89994f) acVar.f330825f.mo27525b()).mo83876aM();
                String str3 = iVar.f330870a;
                List list = iVar.f330871b;
                boolean c2 = ((C90743b) acVar.f330829j.mo27525b()).mo85090c();
                EditorInfo editorInfo = new EditorInfo();
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.speech.extra.DICTATION_MODE", true);
                bundle.putBoolean("android.speech.extra.PARTIAL_RESULTS", true);
                bundle.putBoolean("android.speech.extra.PROFANITY_FILTER", aM);
                bundle.putBoolean("android.speech.extra.SUGGESTIONS_ENABLED", true);
                bundle.putBoolean("android.speech.extra.SINGLE_LINE", false);
                bundle.putBoolean("android.speech.extra.TALKBACK_ENABLED", c2);
                bundle.putString("android.speech.extra.LANGUAGE", str3);
                bundle.putInt("android.speech.extra.MODE", C90536a.VOICE_IME.ordinal());
                bundle.putParcelable("android.speech.extra.EDITOR_INFO", editorInfo);
                bundle.putStringArrayList("android.speech.extra.ADDITIONAL_LANGUAGE", new ArrayList(list));
                bundle.putBoolean("android.speech.extra.BEEP_SUPPRESSED", false);
                C90498f i = Query.f252741b.mo84257T().mo84275aL("com.google.android.apps.gsa.search.core.service.SearchService").mo84272aI(amo.VOICE_IME).mo84290aa((Uri) null, bundle, 0).mo84480i();
                i.mo84561T(QueryTriggerType.UNIFIED_IME);
                Query a4 = i.mo84568a();
                acVar.f330837r = true;
                C118695g gVar = acVar.f330834o;
                Query u = a4.mo84493u();
                gVar.f331095c = true;
                gVar.f331093a.mo85151p(new C118693e(gVar, u));
                C58976aa aaVar = C58975e.f156826a;
                acVar.f330838s = ((C90929bz) acVar.f330824e.mo27525b()).mo85139d(acVar.f330839t);
                C89949q.m146526k(new C89957y(-7, false, (String) null, (Integer) null, (C89834a) null, (C89954v) null, true, acVar.f330833n));
                C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
                tzVar.copyOnWrite();
                C60555uf ufVar = (C60555uf) tzVar.instance;
                ufVar.f164093a |= 2;
                ufVar.f164258m = 855;
                C60658ya yaVar = (C60658ya) C60660yc.f164559c.createBuilder();
                yaVar.copyOnWrite();
                C60660yc ycVar = (C60660yc) yaVar.instance;
                ycVar.f164562b = 1;
                ycVar.f164561a |= 1;
                tzVar.copyOnWrite();
                C60555uf ufVar2 = (C60555uf) tzVar.instance;
                C60660yc ycVar2 = (C60660yc) yaVar.build();
                ycVar2.getClass();
                ufVar2.f164186bn = ycVar2;
                ufVar2.f164252g |= C89885b.HTTP_VALUE;
                C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
            } else {
                throw new NullPointerException("Null primaryRequestLocale");
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void mo103766a() {
        C118579ac acVar = this.f330841a.f330817e;
        if (acVar != null) {
            if (acVar.f330834o != null) {
                C58976aa aaVar = C58975e.f156826a;
                C118695g gVar = acVar.f330834o;
                gVar.mo103879a(new C90892az("TranscriptionClient#stopListening", new C118692d(gVar)));
            }
            C60870cx cxVar = acVar.f330838s;
            if (cxVar != null) {
                cxVar.cancel(true);
            }
        }
    }

    /* renamed from: b */
    public final void mo103767b() {
        C118579ac acVar = this.f330841a.f330817e;
        if (acVar != null) {
            acVar.mo103764b();
        }
    }

    /* renamed from: c */
    public final void mo103768c(C118595m mVar, String str) {
        C118597o oVar = (C118597o) C118598p.f330876d.createBuilder();
        oVar.copyOnWrite();
        C118598p pVar = (C118598p) oVar.instance;
        str.getClass();
        pVar.f330878a |= 1;
        pVar.f330879b = str;
        m196875e(mVar, (C118598p) oVar.build());
    }

    /* renamed from: d */
    public final boolean mo103769d(C118595m mVar, byte[] bArr) {
        try {
            return m196875e(mVar, (C118598p) C62942bv.parseFrom((C62942bv) C118598p.f330876d, bArr));
        } catch (C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) UnifiedImeService.f330813a.mo56226d()).mo56382g(e)).mo56372aa(34045)).mo56386p("Bad serviceInputContext message format.");
            return false;
        }
    }
}
