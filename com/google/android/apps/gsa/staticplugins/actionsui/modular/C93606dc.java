package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.content.Context;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularAction;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.DateArgument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.DeviceSettingsArgument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.GroupArgument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.LocationArgument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.MediaControlArgument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.ProviderArgument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.RecurrenceArgument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.TimeDurationArgument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.TimeOfDayArgument;
import com.google.android.apps.gsa.search.shared.contact.Disambiguation;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88511e;
import com.google.android.apps.gsa.staticplugins.actionsui.LocalResultsView;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4152bb.p4153a.C55188jc;
import com.google.p4152bb.p4153a.C55194ji;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.dc */
/* compiled from: PG */
public final class C93606dc extends C93524ab {

    /* renamed from: g */
    private static final C59071e f261334g = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.actionsui.modular.dc");

    public C93606dc(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup, C88511e eVar, C93602cz czVar, C93545aw awVar) {
        super(context, layoutInflater, viewGroup, eVar, czVar, awVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo81354a(DateArgument dateArgument) {
        return new C93540ar(this.f261156b.getContext(), false);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo81356c(EntityArgument entityArgument) {
        EntityArgument.Entity entity;
        Disambiguation disambiguation = (Disambiguation) entityArgument.f236203n;
        entityArgument.mo81258b(new C93604da(this));
        boolean z = false;
        if (disambiguation != null && disambiguation.mo81543l()) {
            z = true;
        }
        if (z) {
            Parcelable parcelable = disambiguation.f236364c;
            parcelable.getClass();
            entity = (EntityArgument.Entity) parcelable;
        } else {
            entity = null;
        }
        EntityArgument.Entity entity2 = entity;
        if (!z) {
            C59104x c = f261334g.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ModularViewFactory");
            ((C59052c) ((C59052c) c).mo56372aa(13757)).mo56386p("ArgumentView is requested for incomplete EntityArgument.");
        }
        EntitySelectItem b = EntitySelectItem.m154086b(entity2, this.f261155a, this.f261156b, this.f261158d.mo82040ap(), this.f261157c, entityArgument.f236164i, true, 1);
        if (disambiguation != null && disambiguation.f236363b.size() > 1) {
            b.setOnClickListener(new C93668y(this));
        }
        return b;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo81357d(GroupArgument groupArgument) {
        if (groupArgument.mo81308b()) {
            return new C93563bn(this.f261156b.getContext());
        }
        GroupArgumentView groupArgumentView = (GroupArgumentView) this.f261155a.inflate(R.layout.group_argument_editor, this.f261156b, false);
        groupArgumentView.f261046a = ((ModularAction) this.f261158d.f239226b).mo81210Q();
        return groupArgumentView;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ Object mo81358e(LocationArgument locationArgument) {
        C55188jc jcVar = locationArgument.f236190j;
        if (jcVar != null) {
            int a = C55194ji.m87620a(jcVar.f145271a);
            if (a == 0) {
                a = 1;
            }
            if (m154253p(a)) {
                LocalResultsView localResultsView = (LocalResultsView) this.f261155a.inflate(R.layout.local_results_view, this.f261156b, false);
                localResultsView.mo87729c(new C93523aa(this, localResultsView), this.f261158d.mo82040ap(), this.f261155a);
                localResultsView.setVisibility(0);
                return localResultsView;
            }
        }
        return new C93569bt(this.f261156b.getContext(), false);
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ Object mo81359f(MediaControlArgument mediaControlArgument) {
        MediaControlArgumentView mediaControlArgumentView = (MediaControlArgumentView) this.f261155a.inflate(R.layout.media_control_argument_editor, this.f261156b, false);
        mediaControlArgumentView.mo87889a(mediaControlArgument.mo81300g());
        return mediaControlArgumentView;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x004a  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object mo81360g(com.google.android.apps.gsa.search.shared.actions.modular.arguments.PersonArgument r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r5.f236203n
            com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation r0 = (com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation) r0
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001d
            boolean r3 = r0.mo81543l()
            if (r3 == 0) goto L_0x001d
            android.os.Parcelable r0 = r0.f236364c
            r0.getClass()
            com.google.android.apps.gsa.search.shared.contact.Person r0 = (com.google.android.apps.gsa.search.shared.contact.Person) r0
            boolean r0 = r0.mo81527j()
            if (r0 == 0) goto L_0x001d
            r0 = 1
            goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            boolean r3 = r5.mo81263C()
            if (r3 == 0) goto L_0x0043
            if (r0 != 0) goto L_0x0043
            boolean r0 = r5.mo81291z()
            if (r0 != 0) goto L_0x0043
            boolean r0 = r5.mo81318i()
            if (r0 != 0) goto L_0x0043
            boolean r0 = r5.mo81317h()
            if (r0 != 0) goto L_0x0043
            boolean r0 = r5.f236147h
            if (r0 == 0) goto L_0x003d
            goto L_0x0043
        L_0x003d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>()
            throw r5
        L_0x0043:
            com.google.bb.a.io r5 = r5.f236198i
            r0 = 2131626389(0x7f0e0995, float:1.8880013E38)
            if (r5 == 0) goto L_0x005d
            int r5 = r5.f145249a
            int r5 = com.google.p4152bb.p4153a.C55194ji.m87620a(r5)
            if (r5 != 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r1 = r5
        L_0x0054:
            boolean r5 = m154253p(r1)
            if (r5 == 0) goto L_0x005d
            r0 = 2131626390(0x7f0e0996, float:1.8880015E38)
        L_0x005d:
            android.view.LayoutInflater r5 = r4.f261155a
            android.view.ViewGroup r1 = r4.f261156b
            android.view.View r5 = r5.inflate(r0, r1, r2)
            com.google.android.apps.gsa.staticplugins.actionsui.PersonSelectItem r5 = (com.google.android.apps.gsa.staticplugins.actionsui.PersonSelectItem) r5
            com.google.android.apps.gsa.staticplugins.actionsui.modular.z r0 = new com.google.android.apps.gsa.staticplugins.actionsui.modular.z
            r0.<init>(r4)
            r5.setOnClickListener(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.actionsui.modular.C93606dc.mo81360g(com.google.android.apps.gsa.search.shared.actions.modular.arguments.PersonArgument):java.lang.Object");
    }

    /* renamed from: h */
    public final /* synthetic */ Object mo81361h(ProviderArgument providerArgument) {
        return null;
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ Object mo81362i(RecurrenceArgument recurrenceArgument) {
        return new C93609df(this.f261156b.getContext(), (byte[]) null);
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ Object mo81363j(TimeDurationArgument timeDurationArgument) {
        if (timeDurationArgument.mo81337N()) {
            return new C93549b(this.f261156b.getContext(), false);
        }
        return new C93627dx(this.f261156b.getContext(), (byte[]) null);
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ Object mo81364k(TimeOfDayArgument timeOfDayArgument) {
        return new C93549b(this.f261156b.getContext(), false);
    }

    /* renamed from: l */
    public final /* synthetic */ Object mo81365l() {
        return null;
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ Object mo81366m() {
        ListArgumentView listArgumentView = (ListArgumentView) this.f261155a.inflate(R.layout.list_argument_editor, this.f261156b, false);
        listArgumentView.f261052a = this.f261158d;
        return listArgumentView;
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ Object mo81367n() {
        StringArgumentView stringArgumentView = (StringArgumentView) this.f261155a.inflate(R.layout.string_argument_editor, this.f261156b, false);
        stringArgumentView.f261104b = new C93605db(this);
        return stringArgumentView;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo81355b(DeviceSettingsArgument deviceSettingsArgument) {
        int i = deviceSettingsArgument.f236161o - 1;
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 7:
            case 8:
                return (C93544av) this.f261155a.inflate(R.layout.toggle_settings_argument_editor, this.f261156b, false);
            case 5:
            case 6:
                return (C93544av) this.f261155a.inflate(R.layout.slider_setting_argument_editor, this.f261156b, false);
            default:
                throw new UnsupportedOperationException("Unknown device setting " + i);
        }
    }
}
