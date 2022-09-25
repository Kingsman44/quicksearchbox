package com.google.android.apps.gsa.staticplugins.actions.p7358d;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
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
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4152bb.p4153a.C55027dd;
import com.google.p4152bb.p4153a.C55029df;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.d.i */
/* compiled from: PG */
public final class C93322i implements C87440d {

    /* renamed from: a */
    private static final C59071e f260275a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.actions.d.i");

    /* renamed from: b */
    private final C58881cr f260276b;

    /* renamed from: c */
    private final C86124t f260277c;

    public C93322i(C58881cr crVar, C86124t tVar) {
        this.f260276b = crVar;
        this.f260277c = tVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo81354a(DateArgument dateArgument) {
        return null;
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo81355b(DeviceSettingsArgument deviceSettingsArgument) {
        return null;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo81356c(EntityArgument entityArgument) {
        C55029df dfVar = entityArgument.f236166k;
        if (dfVar == null) {
            return null;
        }
        C62940bt r2 = C62942bv.checkIsLite(C55027dd.f144768c);
        dfVar.mo58887l(r2);
        if (dfVar.f169962ag.mo58857o(r2.f169971d)) {
            return new C93323j(this.f260276b, this.f260277c, entityArgument);
        }
        C59104x c = f260275a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "CastDeviceQueryProcesso");
        ((C59052c) ((C59052c) c).mo56372aa(13632)).mo56386p("Can't handle this type of ClientQuery.");
        return null;
    }

    /* renamed from: d */
    public final /* synthetic */ Object mo81357d(GroupArgument groupArgument) {
        return null;
    }

    /* renamed from: e */
    public final /* synthetic */ Object mo81358e(LocationArgument locationArgument) {
        return null;
    }

    /* renamed from: f */
    public final /* synthetic */ Object mo81359f(MediaControlArgument mediaControlArgument) {
        return null;
    }

    /* renamed from: g */
    public final /* synthetic */ Object mo81360g(PersonArgument personArgument) {
        return null;
    }

    /* renamed from: h */
    public final /* synthetic */ Object mo81361h(ProviderArgument providerArgument) {
        return null;
    }

    /* renamed from: i */
    public final /* synthetic */ Object mo81362i(RecurrenceArgument recurrenceArgument) {
        return null;
    }

    /* renamed from: j */
    public final /* synthetic */ Object mo81363j(TimeDurationArgument timeDurationArgument) {
        return null;
    }

    /* renamed from: k */
    public final /* synthetic */ Object mo81364k(TimeOfDayArgument timeOfDayArgument) {
        return null;
    }

    /* renamed from: l */
    public final /* synthetic */ Object mo81365l() {
        return null;
    }

    /* renamed from: m */
    public final /* synthetic */ Object mo81366m() {
        return null;
    }

    /* renamed from: n */
    public final /* synthetic */ Object mo81367n() {
        return null;
    }
}
