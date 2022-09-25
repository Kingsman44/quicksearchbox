package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.text.TextUtils;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.C87440d;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.DateArgument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.DeviceSettingsArgument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.GroupArgument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.LocationArgument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.MediaControlArgument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.PersonArgument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.ProviderArgument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.RecurrenceArgument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.TimeDurationArgument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.TimeOfDayArgument;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.by */
/* compiled from: PG */
public final class C93574by implements C87440d {

    /* renamed from: a */
    public final C93602cz f261268a;

    /* renamed from: b */
    public final C93545aw f261269b;

    /* renamed from: c */
    private final String f261270c;

    public C93574by(C93602cz czVar, C93545aw awVar) {
        this.f261270c = czVar.mo88019N();
        this.f261268a = czVar;
        this.f261269b = awVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo81354a(DateArgument dateArgument) {
        return C93537ao.f261176a;
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo81355b(DeviceSettingsArgument deviceSettingsArgument) {
        return C93537ao.f261176a;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo81356c(EntityArgument entityArgument) {
        if (TextUtils.isEmpty(this.f261270c) || entityArgument.f236166k == null) {
            return C93537ao.f261176a;
        }
        return new C93537ao(this.f261270c, R.drawable.ic_reload_action_card_material, 8348, new C93571bv(this, entityArgument), true);
    }

    /* renamed from: d */
    public final /* synthetic */ Object mo81357d(GroupArgument groupArgument) {
        return C93537ao.f261176a;
    }

    /* renamed from: e */
    public final /* synthetic */ Object mo81358e(LocationArgument locationArgument) {
        return C93537ao.f261176a;
    }

    /* renamed from: f */
    public final /* synthetic */ Object mo81359f(MediaControlArgument mediaControlArgument) {
        return C93537ao.f261176a;
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ Object mo81360g(PersonArgument personArgument) {
        return new C93537ao(this.f261270c, true != this.f261268a.mo82061x() ? R.drawable.ic_forward_lighthouse_action_card : R.drawable.quantum_ic_people_grey600_24, 6735, new C93572bw(this), true);
    }

    /* renamed from: h */
    public final /* synthetic */ Object mo81361h(ProviderArgument providerArgument) {
        return C93537ao.f261176a;
    }

    /* renamed from: i */
    public final /* synthetic */ Object mo81362i(RecurrenceArgument recurrenceArgument) {
        return C93537ao.f261176a;
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ Object mo81363j(TimeDurationArgument timeDurationArgument) {
        return new C93537ao(this.f261270c, R.drawable.ic_forward_lighthouse_action_card, 8611, new C93573bx(this, timeDurationArgument), true);
    }

    /* renamed from: k */
    public final /* synthetic */ Object mo81364k(TimeOfDayArgument timeOfDayArgument) {
        return C93537ao.f261176a;
    }

    /* renamed from: l */
    public final /* synthetic */ Object mo81365l() {
        return C93537ao.f261176a;
    }

    /* renamed from: m */
    public final /* synthetic */ Object mo81366m() {
        return C93537ao.f261176a;
    }

    /* renamed from: n */
    public final /* synthetic */ Object mo81367n() {
        return C93537ao.f261176a;
    }
}
