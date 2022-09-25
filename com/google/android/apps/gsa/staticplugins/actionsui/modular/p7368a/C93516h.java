package com.google.android.apps.gsa.staticplugins.actionsui.modular.p7368a;

import android.content.Context;
import android.content.res.Resources;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.shared.actions.util.C87484f;
import com.google.android.apps.gsa.staticplugins.actions.p7361g.C93387a;
import com.google.android.apps.gsa.staticplugins.actions.p7361g.C93394h;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93543au;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.a.h */
/* compiled from: PG */
public final class C93516h implements C93514f {

    /* renamed from: a */
    final C87484f f261134a;

    /* renamed from: b */
    private boolean f261135b;

    public C93516h(Context context) {
        C87484f f = C93387a.m153629f(context);
        this.f261134a = f;
        C58976aa aaVar = C58975e.f156826a;
        C93387a aVar = (C93387a) f;
        boolean z = aVar.f260466a;
        this.f261135b = aVar.f260466a;
    }

    /* renamed from: a */
    public final int mo87923a() {
        return this.f261135b ? R.drawable.ic_flashlight_on_action_card_material : R.drawable.ic_flashlight_off_action_card_material;
    }

    /* renamed from: b */
    public final int mo87924b() {
        return ((C93387a) this.f261134a).f260468c ? this.f261135b ? R.string.magic_flashlight_on : R.string.magic_flashlight_off : this.f261135b ? R.string.flashlight_on : R.string.flashlight_off;
    }

    /* renamed from: c */
    public final int mo87925c() {
        return -1;
    }

    /* renamed from: e */
    public final CharSequence mo87927e(Resources resources) {
        return BuildConfig.FLAVOR;
    }

    /* renamed from: f */
    public final void mo87928f() {
        C87484f fVar = this.f261134a;
        C58976aa aaVar = C58975e.f156826a;
        C93387a aVar = (C93387a) fVar;
        boolean z = aVar.f260466a;
        this.f261135b = aVar.f260466a;
    }

    /* renamed from: g */
    public final boolean mo87929g() {
        return this.f261135b;
    }

    /* renamed from: h */
    public final void mo87932h(C93543au auVar, Context context) {
        this.f261134a.mo81471b(new C93515g(auVar));
    }

    /* renamed from: j */
    public final void mo87933j(Context context) {
        C87484f fVar = this.f261134a;
        ((C93387a) fVar).f260467b = null;
        C93394h hVar = (C93394h) fVar;
        hVar.f260479d.unregisterTorchCallback(hVar.f260480e);
    }
}
