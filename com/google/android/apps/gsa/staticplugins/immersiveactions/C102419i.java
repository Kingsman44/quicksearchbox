package com.google.android.apps.gsa.staticplugins.immersiveactions;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularAction;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument;
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
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.staticplugins.actionsui.LocalResultsView;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.AudioArgumentView;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93523aa;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93524ab;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93540ar;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93544av;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93545aw;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93549b;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93563bn;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93566bq;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93569bt;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93602cz;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93609df;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93627dx;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93637eg;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93646ep;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93666w;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93668y;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.EntitySelectItem;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.GroupArgumentView;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.ListArgumentView;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.MediaControlArgumentView;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.StringArgumentView;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4152bb.p4153a.C55177is;
import com.google.p4152bb.p4153a.C55179iu;
import com.google.p4152bb.p4153a.C55188jc;
import com.google.p4152bb.p4153a.C55194ji;

/* renamed from: com.google.android.apps.gsa.staticplugins.immersiveactions.i */
/* compiled from: PG */
public final class C102419i extends C93524ab {

    /* renamed from: g */
    private static final C59071e f285843g = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.immersiveactions.i");

    /* renamed from: h */
    private final boolean f285844h;

    public C102419i(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup, C88511e eVar, C93602cz czVar, C93545aw awVar) {
        super(context, layoutInflater, viewGroup, eVar, czVar, awVar);
        this.f285844h = czVar.f261320g.mo85405j(C90014bt.f247760nI);
    }

    /* renamed from: q */
    private final void m169824q(C93566bq bqVar) {
        if (this.f285844h) {
            bqVar.mo87982A(false);
            bqVar.f261253h = true;
            bqVar.findViewById(R.id.action_editor_message_separator).setBackground(this.f261160f.getResources().getDrawable(R.drawable.valyrian_immersive_actions_message_separator, (Resources.Theme) null));
            m169825r(bqVar);
        }
    }

    /* renamed from: r */
    private static final void m169825r(View view) {
        if (view != null) {
            if (view.findViewById(R.id.argument_label) != null) {
                ((TextView) view.findViewById(R.id.argument_label)).setTextAppearance(R.style.action_card_h3_valyrian_immersive_actions);
            }
            if (view.findViewById(R.id.argument_prompt) != null) {
                ((TextView) view.findViewById(R.id.argument_prompt)).setTextAppearance(R.style.action_card_unfilled_valyrian_immersive_actions);
            }
            if (view.findViewById(R.id.argument_value) != null) {
                ((TextView) view.findViewById(R.id.argument_value)).setTextAppearance(R.style.action_card_filled_valyrian_immersive_actions);
            }
            if (view.findViewById(R.id.string_argument_value) != null) {
                ((TextView) view.findViewById(R.id.string_argument_value)).setTextAppearance(R.style.action_card_filled_valyrian_immersive_actions);
            }
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo81354a(DateArgument dateArgument) {
        C93540ar arVar = new C93540ar(this.f261156b.getContext(), true);
        m169824q(arVar);
        return arVar;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo81356c(EntityArgument entityArgument) {
        EntityArgument.Entity entity;
        int a;
        C55177is isVar = entityArgument.f236164i;
        boolean z = false;
        if (isVar != null && (isVar.f145257a & 2) != 0 && (a = C55179iu.m87617a(isVar.f145258b)) != 0 && a == 5) {
            return (AudioArgumentView) this.f261155a.inflate(R.layout.immersive_audio_argument_editor, this.f261156b, false);
        }
        Disambiguation disambiguation = (Disambiguation) entityArgument.f236203n;
        entityArgument.mo81258b(new C102417g(this));
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
            C59104x c = f285843g.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ImmersiveViewFactory");
            ((C59052c) ((C59052c) c).mo56372aa(20771)).mo56386p("ArgumentView is requested for incomplete EntityArgument.");
        }
        EntitySelectItem b = EntitySelectItem.m154086b(entity2, this.f261155a, this.f261156b, this.f261158d.mo82040ap(), this.f261157c, entityArgument.f236164i, true, 2);
        if (disambiguation == null || disambiguation.f236363b.size() <= 1) {
            return b;
        }
        b.setOnClickListener(new C93668y(this));
        return b;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo81357d(GroupArgument groupArgument) {
        if (groupArgument.mo81308b()) {
            return new C93563bn(this.f261156b.getContext());
        }
        GroupArgumentView groupArgumentView = (GroupArgumentView) this.f261155a.inflate(R.layout.immersive_actions_group_argument_editor, this.f261156b, false);
        groupArgumentView.f261046a = ((ModularAction) this.f261158d.f239226b).mo81210Q();
        if (!this.f285844h) {
            return groupArgumentView;
        }
        m169825r(groupArgumentView);
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
                LocalResultsView localResultsView = (LocalResultsView) this.f261155a.inflate(R.layout.immersive_actions_local_results_view, this.f261156b, false);
                if (this.f285844h) {
                    m169825r(localResultsView);
                    localResultsView.f260762i = true;
                }
                localResultsView.mo87729c(new C93523aa(this, localResultsView), this.f261158d.mo82040ap(), this.f261155a);
                localResultsView.setVisibility(0);
                return localResultsView;
            }
        }
        return new C93569bt(this.f261156b.getContext(), true);
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ Object mo81359f(MediaControlArgument mediaControlArgument) {
        MediaControlArgumentView mediaControlArgumentView = (MediaControlArgumentView) this.f261155a.inflate(R.layout.media_control_argument_editor, this.f261156b, false);
        mediaControlArgumentView.mo87889a(mediaControlArgument.mo81300g());
        return mediaControlArgumentView;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0075  */
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
            r0 = 2131625669(0x7f0e06c5, float:1.8878552E38)
            if (r5 == 0) goto L_0x005c
            int r5 = r5.f145249a
            int r5 = com.google.p4152bb.p4153a.C55194ji.m87620a(r5)
            if (r5 != 0) goto L_0x0053
            r5 = 1
        L_0x0053:
            boolean r5 = m154253p(r5)
            if (r5 == 0) goto L_0x005c
            r0 = 2131625660(0x7f0e06bc, float:1.8878534E38)
        L_0x005c:
            android.view.LayoutInflater r5 = r4.f261155a
            android.view.ViewGroup r3 = r4.f261156b
            android.view.View r5 = r5.inflate(r0, r3, r2)
            com.google.android.apps.gsa.staticplugins.actionsui.PersonSelectItem r5 = (com.google.android.apps.gsa.staticplugins.actionsui.PersonSelectItem) r5
            com.google.android.apps.gsa.staticplugins.actionsui.modular.z r0 = new com.google.android.apps.gsa.staticplugins.actionsui.modular.z
            r0.<init>(r4)
            r5.setOnClickListener(r0)
            r4.m169824q(r5)
            boolean r0 = r4.f285844h
            if (r0 == 0) goto L_0x0095
            r5.f261254i = r1
            r0 = 2131427911(0x7f0b0247, float:1.8477452E38)
            android.view.View r0 = r5.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L_0x0087
            r1 = 8
            r0.setVisibility(r1)
        L_0x0087:
            r0 = 2131427915(0x7f0b024b, float:1.847746E38)
            android.view.View r0 = r5.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            if (r0 == 0) goto L_0x0095
            r0.setPadding(r2, r2, r2, r2)
        L_0x0095:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.immersiveactions.C102419i.mo81360g(com.google.android.apps.gsa.search.shared.actions.modular.arguments.PersonArgument):java.lang.Object");
    }

    /* renamed from: h */
    public final /* synthetic */ Object mo81361h(ProviderArgument providerArgument) {
        return null;
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ Object mo81362i(RecurrenceArgument recurrenceArgument) {
        C93609df dfVar = new C93609df(this.f261156b.getContext());
        if (this.f285844h) {
            m169825r(dfVar);
        }
        return dfVar;
    }

    /* renamed from: j */
    public final /* synthetic */ Object mo81363j(TimeDurationArgument timeDurationArgument) {
        if (this.f285844h) {
            if (timeDurationArgument.mo81337N()) {
                return new C93637eg(this.f261156b.getContext());
            }
            return new C93646ep(this.f261156b.getContext());
        } else if (timeDurationArgument.mo81337N()) {
            return new C93549b(this.f261156b.getContext(), true);
        } else {
            return new C93627dx(this.f261156b.getContext());
        }
    }

    /* renamed from: k */
    public final /* synthetic */ Object mo81364k(TimeOfDayArgument timeOfDayArgument) {
        if (this.f285844h && !timeOfDayArgument.mo81340N()) {
            return new C93637eg(this.f261156b.getContext());
        }
        C93549b bVar = new C93549b(this.f261156b.getContext(), true);
        m169824q(bVar);
        return bVar;
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ Object mo81365l() {
        return (AudioArgumentView) this.f261155a.inflate(R.layout.immersive_audio_argument_editor, this.f261156b, false);
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ Object mo81366m() {
        ListArgumentView listArgumentView = (ListArgumentView) this.f261155a.inflate(R.layout.immersive_actions_list_argument_editor, this.f261156b, false);
        listArgumentView.f261052a = this.f261158d;
        return listArgumentView;
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ Object mo81367n() {
        StringArgumentView stringArgumentView = (StringArgumentView) this.f261155a.inflate(R.layout.immersive_actions_string_argument_editor, this.f261156b, false);
        m169824q(stringArgumentView);
        stringArgumentView.f261104b = new C102418h(this);
        return stringArgumentView;
    }

    /* renamed from: o */
    public final C93666w mo87938o(Argument argument) {
        C93666w o = super.mo87938o(argument);
        o.mo87882q(true);
        return o;
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
                if (this.f285844h) {
                    return (C93544av) this.f261155a.inflate(R.layout.valyrian_toggle_settings_argument_editor, this.f261156b, false);
                }
                return (C93544av) this.f261155a.inflate(R.layout.toggle_settings_argument_editor, this.f261156b, false);
            case 5:
            case 6:
                if (this.f285844h) {
                    return (C93544av) this.f261155a.inflate(R.layout.valyrian_immersive_actions_slider_settings_argument_editor, this.f261156b, false);
                }
                return (C93544av) this.f261155a.inflate(R.layout.immersive_actions_slider_settings_argument_editor, this.f261156b, false);
            default:
                throw new UnsupportedOperationException("Unknown device setting" + i);
        }
    }
}
