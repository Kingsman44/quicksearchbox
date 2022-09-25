package com.google.android.apps.gsa.staticplugins.actionsui;

import android.content.Context;
import android.content.ContextWrapper;
import com.google.android.apps.gsa.search.shared.actions.C87420h;
import com.google.android.apps.gsa.search.shared.actions.C87501w;
import com.google.android.apps.gsa.search.shared.actions.PermissionPuntAction;
import com.google.android.apps.gsa.search.shared.actions.PuntAction;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.search.shared.actions.SoundSearchResult;
import com.google.android.apps.gsa.search.shared.actions.VisitableAbstractVoiceAction;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.actions.VoiceInteractionAction;
import com.google.android.apps.gsa.search.shared.actions.core.ButtonAction;
import com.google.android.apps.gsa.search.shared.actions.core.C87407f;
import com.google.android.apps.gsa.search.shared.actions.core.HelpAction;
import com.google.android.apps.gsa.search.shared.actions.core.ModularAnswer;
import com.google.android.apps.gsa.search.shared.actions.core.NarrativeNewsAction;
import com.google.android.apps.gsa.search.shared.actions.core.NewVisitableAbstractVoiceAction;
import com.google.android.apps.gsa.search.shared.actions.core.ReadNotificationAction;
import com.google.android.apps.gsa.search.shared.actions.core.ShowContactInformationAction;
import com.google.android.apps.gsa.search.shared.actions.core.VoiceDelightAction;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularAction;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88507a;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88508b;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88513g;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93583cg;
import com.google.android.apps.gsa.staticplugins.actionsui.modularanswer.C93671b;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.g */
/* compiled from: PG */
public class C93501g implements C88513g, C87501w, C87407f {

    /* renamed from: a */
    protected final Context f260970a;

    /* renamed from: b */
    private final C68214a f260971b;

    public C93501g(Context context, C68214a aVar) {
        this.f260970a = context;
        this.f260971b = aVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo81494a(PermissionPuntAction permissionPuntAction) {
        C87420h hVar;
        Context context = this.f260970a;
        Context context2 = context;
        while (true) {
            if (!(context2 instanceof ContextWrapper)) {
                hVar = context2 instanceof C87420h ? (C87420h) context2 : null;
            } else if (context2 instanceof C87420h) {
                hVar = (C87420h) context2;
                break;
            } else {
                context2 = ((ContextWrapper) context2).getBaseContext();
            }
        }
        return new C93458ay(context, hVar);
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ Object mo81495b(PuntAction puntAction) {
        return mo87819o();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo81496c(SearchError searchError) {
        throw new UnsupportedOperationException("Contact alexfrol@ if this exception is thrown");
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo81497d(SoundSearchResult soundSearchResult) {
        return new C93494bv(this.f260970a);
    }

    /* renamed from: e */
    public final /* synthetic */ Object mo81498e(VoiceInteractionAction voiceInteractionAction) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: f */
    public /* bridge */ /* synthetic */ Object mo81499f(ModularAction modularAction) {
        return mo87821q();
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ Object mo81162g(ButtonAction buttonAction) {
        if (buttonAction.f236041g.equals("Discoverability")) {
            return new C93475bc(this.f260970a);
        }
        return new C93442ai(this.f260970a);
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ Object mo81163h(HelpAction helpAction) {
        return new C93445al(this.f260970a);
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ Object mo81164i(ModularAnswer modularAnswer) {
        return new C93671b(this.f260970a);
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ Object mo81165j(NarrativeNewsAction narrativeNewsAction) {
        return new C93456aw(this.f260970a);
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ Object mo81166k(ReadNotificationAction readNotificationAction) {
        return new C93457ax(this.f260970a);
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ Object mo81167l(ShowContactInformationAction showContactInformationAction) {
        return new C93487bo(this.f260970a);
    }

    /* renamed from: m */
    public /* bridge */ /* synthetic */ Object mo81168m(VoiceDelightAction voiceDelightAction) {
        return mo87820p();
    }

    /* renamed from: n */
    public final C88508b mo82119n(C88507a aVar) {
        C88508b bVar;
        VoiceAction voiceAction = aVar.f239226b;
        if (voiceAction instanceof VisitableAbstractVoiceAction) {
            bVar = (C88508b) ((VisitableAbstractVoiceAction) voiceAction).mo81132L(this);
        } else if (!(voiceAction instanceof NewVisitableAbstractVoiceAction)) {
            return null;
        } else {
            bVar = (C88508b) ((NewVisitableAbstractVoiceAction) voiceAction).mo81146L(this);
        }
        bVar.mo82067g(aVar);
        return bVar;
    }

    /* renamed from: o */
    public C93507m mo87819o() {
        return new C93477be(this.f260970a, "PuntCard");
    }

    /* renamed from: p */
    public C88508b mo87820p() {
        return new C93457ax(this.f260970a);
    }

    /* renamed from: q */
    public C88508b mo87821q() {
        return new C93583cg(this.f260970a, this.f260971b);
    }
}
