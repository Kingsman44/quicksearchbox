package com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.p8637a;

import android.content.Context;
import android.support.p033v7.widget.GridLayoutManager;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.gsa.assistant.shared.C73841bf;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90080ee;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8632f.C114742l;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114756j;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28257a;
import com.google.android.libraries.logging.C28291i;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28295m;
import com.google.android.material.bottomsheet.C44565p;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3994s.p3995a.C53070ag;
import com.google.assistant.p3994s.p3995a.C53396mi;
import com.google.assistant.p3994s.p3995a.C53397mj;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68226l;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.a.al */
/* compiled from: PG */
public final class C114913al implements C114906ae {

    /* renamed from: a */
    private final Context f318822a;

    /* renamed from: b */
    private final C44565p f318823b;

    /* renamed from: c */
    private final C114742l f318824c;

    /* renamed from: d */
    private final C114912ak f318825d;

    /* renamed from: e */
    private final C114918aq f318826e;

    /* renamed from: f */
    private final C114903ab f318827f;

    /* renamed from: g */
    private final C68214a f318828g;

    /* renamed from: h */
    private final C86124t f318829h;

    /* renamed from: i */
    private final C114756j f318830i;

    /* renamed from: j */
    private C28293k f318831j;

    public C114913al(Context context, C114912ak akVar, C114918aq aqVar, C114903ab abVar, C114742l lVar, C68214a aVar, C44565p pVar, C86124t tVar, C114756j jVar) {
        this.f318822a = context;
        this.f318825d = akVar;
        this.f318826e = aqVar;
        this.f318827f = abVar;
        this.f318824c = lVar;
        this.f318828g = aVar;
        this.f318823b = pVar;
        this.f318830i = jVar;
        this.f318829h = tVar;
    }

    /* renamed from: h */
    public final View mo101694h() {
        C58485gu guVar;
        C58485gu guVar2;
        View inflate = View.inflate(this.f318822a, R.layout.zero_state_fab_bottom_sheet, (ViewGroup) null);
        C114903ab abVar = this.f318827f;
        C53397mj mjVar = abVar.f318789c;
        if (mjVar == null || mjVar.f140119a.size() <= 0) {
            C58976aa aaVar = C58975e.f156826a;
            C114925c cVar = new C114925c(((C73841bf) abVar.f318788b.mo27525b()).mo65322a().getString(R.string.reminder), "intent:#Intent;action=assistant.cards.USER_INTERACTION;scheme=assistant;S.interactive_element=GokBChFhc3N0X2lucHV0LklOVEVOVBJ0CgxpbnRlbnRfaW5wdXQSZAomYXNzaXN0YW50LmFwaS5jbGllbnRfaW5wdXQuSW50ZW50SW5wdXQSOgo4Cg5DcmVhdGVSZW1pbmRlchImChJhc3Npc3RhbnRaZXJvU3RhdGUSEBoOCgx6c19yZW1pbmRlcl8;B.com.google.opa.SHOULD_REQUEST_TTS_HINT=false;B.com.google.opa.SHOULD_AUTO_EXPAND_KEYBOARD=true;i.com.google.opa.ZERO_STATE_APP_FLOW_EVENT=1286;end;", "https://www.gstatic.com/images/icons/material/system_gm/2x/reminder_gm_blue_24dp.png", 81093);
            C114925c cVar2 = new C114925c(((C73841bf) abVar.f318788b.mo27525b()).mo65322a().getString(R.string.shopping_item), "intent:#Intent;S.zero_state_action_name=FabAction;S.fab_action_data=EgQKAiAB;i.com.google.opa.ZERO_STATE_APP_FLOW_EVENT=1681;end;", "https://www.gstatic.com/images/icons/material/system_gm/2x/list_gm_blue_24dp.png", 81095);
            C114925c cVar3 = new C114925c(((C73841bf) abVar.f318788b.mo27525b()).mo65322a().getString(R.string.note), "intent:#Intent;S.zero_state_action_name=FabAction;S.fab_action_data=CgA;i.com.google.opa.ZERO_STATE_APP_FLOW_EVENT=1682;end;", "https://www.gstatic.com/images/icons/material/system_gm/2x/sticky_note_gm_blue_24dp.png", 81096);
            C114925c cVar4 = new C114925c("Family Note", "intent:#Intent;S.zero_state_action_name=FabAction;S.fab_action_data=OgA;i.com.google.opa.ZERO_STATE_APP_FLOW_EVENT=0;end;", "https://www.gstatic.com/images/icons/material/system_gm/2x/sticky_note_gm_blue_24dp.png", 0);
            if (abVar.f318787a.mo79746e(C90080ee.f249827z)) {
                guVar = C58485gu.m89849q(cVar, cVar2, cVar3, cVar4);
            } else {
                guVar = C58485gu.m89848p(cVar, cVar2, cVar3);
            }
        } else {
            C58480gp e = C58485gu.m89837e();
            C53397mj mjVar2 = abVar.f318789c;
            mjVar2.getClass();
            for (C53396mi miVar : mjVar2.f140119a) {
                String str = miVar.f140109a;
                String str2 = miVar.f140112d;
                C51012dc dcVar = miVar.f140111c;
                if (dcVar == null) {
                    dcVar = C51012dc.f132813k;
                }
                e.mo55395g(new C114925c(str, str2, dcVar.f132817c, Integer.valueOf(miVar.f140114f)));
            }
            guVar = e.mo55394f();
        }
        C114912ak akVar = this.f318825d;
        C44565p pVar = this.f318823b;
        C68214a a = C68219e.m98518a(((C68226l) akVar.f318820a).f184585a);
        a.getClass();
        ((Context) akVar.f318821b.mo17428b()).getClass();
        guVar.getClass();
        C114911aj ajVar = new C114911aj(a, guVar, pVar);
        ajVar.f318819f = this.f318830i;
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.create_bottom_sheet_grid);
        recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), Math.min(4, ((C58724pq) guVar).f156474d)));
        recyclerView.setAdapter(ajVar);
        this.f318831j = ajVar.f318818e;
        RecyclerView recyclerView2 = (RecyclerView) inflate.findViewById(R.id.fab_bottom_sheet_shelf);
        if (this.f318829h.mo79746e(C90080ee.f249812k)) {
            C114903ab abVar2 = this.f318827f;
            C53397mj mjVar3 = abVar2.f318789c;
            if (mjVar3 == null || mjVar3.f140120b.size() <= 0) {
                C58976aa aaVar2 = C58975e.f156826a;
                guVar2 = C58485gu.m89848p(new C114926d(((C73841bf) abVar2.f318788b.mo27525b()).mo65322a().getString(R.string.zero_state_fab_stock_button_title), ((C73841bf) abVar2.f318788b.mo27525b()).mo65322a().getString(R.string.zero_state_fab_stock_button_subtitle), "intent:#Intent;S.zero_state_action_name=WebOverlayAction;S.weboverlay_url=https://www.google.com/finance/portfolio;B.ZeroStateStartActivityForResult=true;S.ZeroStateTapToUpdateDeeplinkUrl=googleassistant://zerostate?data=Cgl6c19zdG9ja3MoBDgbQAI;end;", "https://fonts.gstatic.com/s/i/googlematerialicons/trending_up/v6/gm_blue-24dp/2x/gm_trending_up_gm_blue_24dp.png", "https://www.gstatic.com/voice/zerostate/valyrian/expand_ggrey600_24dp_3x.png", 122284), new C114926d(((C73841bf) abVar2.f318788b.mo27525b()).mo65322a().getString(R.string.zero_state_fab_sports_button_title), ((C73841bf) abVar2.f318788b.mo27525b()).mo65322a().getString(R.string.zero_state_fab_sports_button_subtitle), "intent:#Intent;S.zero_state_action_name=WebOverlayAction;S.weboverlay_url=https://www.google.com/search?q=Sports;B.ZeroStateStartActivityForResult=true;S.ZeroStateTapToUpdateDeeplinkUrl=googleassistant://zerostate?data=KAQ4G0AC;end;", "https://fonts.gstatic.com/s/i/googlematerialicons/youtube_sports/v8/gm_blue-24dp/2x/gm_youtube_sports_gm_blue_24dp.png", "https://www.gstatic.com/voice/zerostate/valyrian/expand_ggrey600_24dp_3x.png", 122285), new C114926d(((C73841bf) abVar2.f318788b.mo27525b()).mo65322a().getString(R.string.zero_state_fab_birthdays_button_title), ((C73841bf) abVar2.f318788b.mo27525b()).mo65322a().getString(R.string.zero_state_fab_birthdays_button_subtitle), "intent:#Intent;action=com.google.android.googlequicksearchbox.action.ASSISTANT_SETTINGS;package=com.google.android.googlequicksearchbox;S.assistant_settings_feature=household_your_people;B.com.google.android.apps.gsa.shared.util.starter.IntentStarter.START_ACTIVITY_FOR_RESULT=true;B.ZeroStateStartActivityForResult=true;S.ZeroStateTapToUpdateDeeplinkUrl=googleassistant://zerostate?data=KAQ4G0AC;end;", "https://fonts.gstatic.com/s/i/googlematerialicons/cake/v6/gm_blue-24dp/2x/gm_cake_gm_blue_24dp.png", "https://www.gstatic.com/voice/zerostate/valyrian/expand_ggrey600_24dp_3x.png", 122286));
            } else {
                C58480gp e2 = C58485gu.m89837e();
                C53397mj mjVar4 = abVar2.f318789c;
                mjVar4.getClass();
                for (C53396mi miVar2 : mjVar4.f140120b) {
                    String str3 = miVar2.f140109a;
                    String str4 = miVar2.f140110b;
                    String str5 = miVar2.f140112d;
                    C51012dc dcVar2 = miVar2.f140111c;
                    if (dcVar2 == null) {
                        dcVar2 = C51012dc.f132813k;
                    }
                    String str6 = dcVar2.f132817c;
                    C51012dc dcVar3 = miVar2.f140113e;
                    if (dcVar3 == null) {
                        dcVar3 = C51012dc.f132813k;
                    }
                    e2.mo55395g(new C114926d(str3, str4, str5, str6, dcVar3.f132817c, Integer.valueOf(miVar2.f140114f)));
                }
                guVar2 = e2.mo55394f();
            }
            C114918aq aqVar = this.f318826e;
            C44565p pVar2 = this.f318823b;
            C68214a a2 = C68219e.m98518a(((C68226l) aqVar.f318854a).f184585a);
            a2.getClass();
            ((Context) aqVar.f318855b.mo17428b()).getClass();
            guVar2.getClass();
            C114917ap apVar = new C114917ap(a2, guVar2, pVar2);
            apVar.f318853f = this.f318830i;
            recyclerView2.setLayoutManager(new LinearLayoutManager(recyclerView2.getContext()));
            recyclerView2.setAdapter(apVar);
            C28293k kVar = apVar.f318852e;
            kVar.getClass();
            C28293k kVar2 = this.f318831j;
            kVar2.getClass();
            C28257a aVar = (C28257a) kVar2;
            ArrayList arrayList = new ArrayList(aVar.f76909b);
            arrayList.add(kVar);
            this.f318831j = C28293k.m52907d(aVar.f76908a, arrayList);
        } else {
            recyclerView2.setVisibility(8);
            inflate.findViewById(R.id.zero_state_fab_shelf_menu_title).setVisibility(8);
        }
        C28293k kVar3 = this.f318831j;
        kVar3.getClass();
        C28295m.m52919e(recyclerView, ((C28257a) kVar3).f76908a);
        View findViewById = inflate.findViewById(R.id.create_bottom_sheet_layout);
        int dimension = (int) this.f318822a.getResources().getDimension(R.dimen.zero_state_fab_bottom_sheet_layout_padding_bottom_without_mic);
        if (findViewById.getPaddingBottom() != dimension) {
            findViewById.setPadding(findViewById.getPaddingLeft(), findViewById.getPaddingTop(), findViewById.getPaddingRight(), dimension);
        }
        C28291i iVar = new C28291i(recyclerView, this.f318824c);
        iVar.f76970d = ajVar;
        iVar.mo33786b();
        recyclerView.getViewTreeObserver().dispatchOnGlobalLayout();
        ((TextView) inflate.findViewById(R.id.zero_state_fab_bottom_sheet_title)).setText(((C73841bf) this.f318828g.mo27525b()).mo65322a().getString(R.string.zero_state_fab_bottom_sheet_title));
        return inflate;
    }

    /* renamed from: i */
    public final /* synthetic */ View mo101695i() {
        return null;
    }

    /* renamed from: j */
    public final C28293k mo101696j() {
        return this.f318831j;
    }

    /* renamed from: l */
    public final /* synthetic */ void mo101697l() {
    }

    /* renamed from: m */
    public final /* synthetic */ void mo101698m(C53070ag agVar) {
    }
}
