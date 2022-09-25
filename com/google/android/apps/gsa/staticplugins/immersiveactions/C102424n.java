package com.google.android.apps.gsa.staticplugins.immersiveactions;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.p6941ui.C88531k;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88507a;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88508b;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88511e;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88513g;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88514h;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88515i;
import com.google.android.apps.gsa.search.shared.service.C87681ai;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.staticplugins.actionsui.C93699x;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93584ch;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93602cz;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.immersiveactions.n */
/* compiled from: PG */
public final class C102424n implements C88514h, C88515i {

    /* renamed from: a */
    public final C102403aj f285852a;

    /* renamed from: b */
    public final C102420j f285853b;

    /* renamed from: c */
    public OpaModularActionCardUi f285854c;

    /* renamed from: d */
    public C88531k f285855d;

    /* renamed from: e */
    private final Context f285856e;

    /* renamed from: f */
    private final C86124t f285857f;

    public C102424n(C86124t tVar, Context context, C87681ai aiVar, C102403aj ajVar, C102420j jVar) {
        this.f285857f = tVar;
        this.f285856e = context;
        this.f285852a = ajVar;
        this.f285853b = jVar;
        C102402ai aiVar2 = new C102402ai(ajVar);
        ajVar.f285815b.mo81940l(aiVar2, C88244um.NOTIFY_STARTED_CONVERSATION, C88244um.NOTIFY_COMPLETED_CONVERSATION, C88244um.UPDATE_CONVERSATION_STATE, C88244um.SHOW_PROMPT, C88244um.UNDO_ACTION_USER_INTERACTION, C88244um.UPDATE_ACTION_DATA, C88244um.UPDATE_MEDIA_EXECUTION, C88244um.UPDATE_SPEECH_EVENT);
        jVar.f285845a = aiVar;
    }

    /* renamed from: a */
    public final void mo82120a() {
        C88507a aVar = this.f285852a.f285819f;
        if (aVar != null) {
            aVar.mo82046i();
        }
    }

    /* renamed from: b */
    public final View mo82122b() {
        OpaModularActionCardUi opaModularActionCardUi = this.f285854c;
        if (opaModularActionCardUi != null) {
            return opaModularActionCardUi;
        }
        C88507a aVar = this.f285852a.f285819f;
        if (!(aVar instanceof C93602cz)) {
            return null;
        }
        C93602cz czVar = (C93602cz) aVar;
        C102423m mVar = new C102423m(this, czVar);
        boolean e = this.f285857f.mo79746e(C90014bt.f247760nI);
        OpaModularActionCardUi opaModularActionCardUi2 = (OpaModularActionCardUi) LayoutInflater.from(this.f285853b).inflate(e ? R.layout.valyrian_opa_modular_action_card : R.layout.opa_modular_action_card, (ViewGroup) null);
        opaModularActionCardUi2.f285768e = e;
        czVar.getClass();
        opaModularActionCardUi2.f285766c = czVar;
        for (C93584ch d : opaModularActionCardUi2.f285765b) {
            d.mo87841d(czVar);
        }
        opaModularActionCardUi2.f285767d = new C88511e(new C102411ar(opaModularActionCardUi2));
        opaModularActionCardUi2.f285764a.f285760f = opaModularActionCardUi2.f285768e;
        int D = opaModularActionCardUi2.f285766c.mo88009D();
        for (C93584ch e2 : opaModularActionCardUi2.f285765b) {
            e2.mo87842e(D, opaModularActionCardUi2.f285767d);
        }
        opaModularActionCardUi2.setBackgroundResource(R.drawable.immersive_actions_small_card_background_v2);
        OpaActionConfirmationCard opaActionConfirmationCard = opaModularActionCardUi2.f285764a;
        if (opaActionConfirmationCard.isClickable()) {
            opaActionConfirmationCard.f285755a.setBackgroundResource(R.drawable.card_action_button_background_v2);
        }
        this.f285854c = opaModularActionCardUi2;
        opaModularActionCardUi2.f285764a.setOnClickListener(mVar);
        return opaModularActionCardUi2;
    }

    /* renamed from: c */
    public final View mo82123c(VoiceAction voiceAction) {
        C88507a a = ((C93699x) this.f285852a.f285817d.mo27525b()).mo88150a(voiceAction, this.f285852a.mo93218t());
        View hu = voiceAction.mo81068hu(this.f285856e);
        if (hu != null) {
            hu.setOnClickListener(new C102422l(this, voiceAction));
            hu.setBackgroundResource(R.drawable.immersive_actions_small_card_background_v2);
            return hu;
        } else if (a == null) {
            return null;
        } else {
            a.mo82054q(voiceAction);
            C88508b n = ((C88513g) this.f285852a.f285818e.mo27525b()).mo82119n(a);
            if (n != null) {
                a.mo82056s();
                n.setBackgroundResource(R.drawable.immersive_actions_small_card_background_v2);
            }
            return n;
        }
    }

    /* renamed from: e */
    public final boolean mo82124e() {
        return this.f285852a.mo93218t().mo82078E();
    }

    /* renamed from: f */
    public final boolean mo82125f() {
        VoiceAction voiceAction = this.f285852a.f285820g;
        return voiceAction != null && voiceAction.mo81077p();
    }

    /* renamed from: g */
    public final boolean mo82126g() {
        C88507a aVar = this.f285852a.f285819f;
        return aVar != null && aVar.mo82036A();
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
    }
}
