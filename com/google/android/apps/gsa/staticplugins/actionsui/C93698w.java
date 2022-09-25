package com.google.android.apps.gsa.staticplugins.actionsui;

import android.text.format.DateFormat;
import com.google.android.apps.gsa.search.shared.actions.C87501w;
import com.google.android.apps.gsa.search.shared.actions.PermissionPuntAction;
import com.google.android.apps.gsa.search.shared.actions.PuntAction;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.search.shared.actions.SoundSearchResult;
import com.google.android.apps.gsa.search.shared.actions.VoiceInteractionAction;
import com.google.android.apps.gsa.search.shared.actions.core.ButtonAction;
import com.google.android.apps.gsa.search.shared.actions.core.C87407f;
import com.google.android.apps.gsa.search.shared.actions.core.HelpAction;
import com.google.android.apps.gsa.search.shared.actions.core.ModularAnswer;
import com.google.android.apps.gsa.search.shared.actions.core.NarrativeNewsAction;
import com.google.android.apps.gsa.search.shared.actions.core.ReadNotificationAction;
import com.google.android.apps.gsa.search.shared.actions.core.ShowContactInformationAction;
import com.google.android.apps.gsa.search.shared.actions.core.VoiceDelightAction;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularAction;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.C87449m;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88507a;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88512f;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93602cz;
import com.google.android.apps.gsa.staticplugins.actionsui.modularanswer.C93674e;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.w */
/* compiled from: PG */
public class C93698w implements C87501w, C87407f {

    /* renamed from: a */
    protected final C88512f f261498a;

    /* renamed from: b */
    final /* synthetic */ C93699x f261499b;

    protected C93698w(C93699x xVar, C88512f fVar) {
        this.f261499b = xVar;
        this.f261498a = fVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo81494a(PermissionPuntAction permissionPuntAction) {
        return new C93459az(this.f261498a, this.f261499b.f261508i);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo81495b(PuntAction puntAction) {
        return new C93479bg(this.f261498a, this.f261499b.f261508i);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo81496c(SearchError searchError) {
        throw new UnsupportedOperationException("Contact alexfrol@ if this exception is thrown");
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo81497d(SoundSearchResult soundSearchResult) {
        C88512f fVar = this.f261498a;
        C93699x xVar = this.f261499b;
        return new C93496bx(fVar, xVar.f261501b, xVar.f261508i);
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ Object mo81498e(VoiceInteractionAction voiceInteractionAction) {
        ((C59052c) ((C59052c) ((C59052c) C93699x.f261500a.mo56225c()).mo56382g(new Throwable("visit(VoiceInteractionAction) is not supported"))).mo56372aa(13727)).mo56386p("#visit(VoiceInteractionAction):");
        return null;
    }

    /* renamed from: f */
    public final /* synthetic */ Object mo81499f(ModularAction modularAction) {
        C88512f fVar = this.f261498a;
        C87449m mVar = new C87449m(this.f261499b.f261501b);
        C93699x xVar = this.f261499b;
        return new C93602cz(fVar, mVar, xVar.f261506g, xVar.f261504e, xVar.f261505f, xVar.f261507h, xVar.f261508i, xVar.f261503d);
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ Object mo81162g(ButtonAction buttonAction) {
        return new C93500f(this.f261498a, this.f261499b.f261508i);
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ Object mo81163h(HelpAction helpAction) {
        return new C93446am(this.f261498a, DateFormat.is24HourFormat(this.f261499b.f261501b), this.f261499b.f261508i);
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ Object mo81164i(ModularAnswer modularAnswer) {
        C88512f fVar = this.f261498a;
        C87449m mVar = new C87449m(this.f261499b.f261501b);
        C93699x xVar = this.f261499b;
        return new C93674e(fVar, mVar, xVar.f261505f, xVar.f261508i);
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ Object mo81165j(NarrativeNewsAction narrativeNewsAction) {
        return new C93455av(this.f261498a, this.f261499b.f261508i);
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ Object mo81166k(ReadNotificationAction readNotificationAction) {
        return new C93438ae(this.f261498a, this.f261499b.f261508i);
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ Object mo81167l(ShowContactInformationAction showContactInformationAction) {
        C88512f fVar = this.f261498a;
        this.f261499b.f261502c.getString(R.string.clipboard_label);
        C93699x xVar = this.f261499b;
        return new C93489bq(fVar, xVar.f261509j, xVar.f261508i);
    }

    /* renamed from: m */
    public /* bridge */ /* synthetic */ Object mo81168m(VoiceDelightAction voiceDelightAction) {
        return mo88149n();
    }

    /* renamed from: n */
    public C88507a mo88149n() {
        return new C93438ae(this.f261498a, this.f261499b.f261508i);
    }
}
