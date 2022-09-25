package com.google.android.apps.gsa.staticplugins.actionsui.p7364b.p7366b;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.gsa.search.core.p6775c.p6776a.C85678a;
import com.google.android.apps.gsa.search.core.p6775c.p6776a.C85679b;
import com.google.android.apps.gsa.search.shared.service.C87681ai;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.logger.p7065j.C89930a;
import com.google.android.apps.gsa.shared.logger.p7065j.C89932c;
import com.google.android.apps.gsa.shared.monet.p7070b.p7071a.C90172b;
import com.google.android.apps.gsa.shared.monet.p7114f.C90323a;
import com.google.android.apps.gsa.shared.p7032c.C89696a;
import com.google.android.apps.gsa.shared.p7148ui.SuggestionGridLayout;
import com.google.android.apps.gsa.shared.util.p7184t.C91090a;
import com.google.android.apps.gsa.shared.util.permissions.C91075b;
import com.google.android.apps.gsa.staticplugins.actionsui.C93440ag;
import com.google.android.apps.gsa.staticplugins.actionsui.C93460b;
import com.google.android.apps.gsa.staticplugins.actionsui.p7364b.p7367c.C93472a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.base.C58881cr;
import com.google.common.base.C58885cv;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.b.b.e */
/* compiled from: PG */
public final class C93469e extends C22939d implements C90172b {

    /* renamed from: a */
    public final C87681ai f260849a;

    /* renamed from: b */
    public final C91075b f260850b;

    /* renamed from: c */
    public C89696a f260851c;

    /* renamed from: d */
    private final Context f260852d;

    /* renamed from: e */
    private final C68214a f260853e;

    /* renamed from: f */
    private final Activity f260854f;

    /* renamed from: g */
    private final C91090a f260855g;

    /* renamed from: h */
    private final C90323a f260856h;

    /* renamed from: i */
    private final C93472a f260857i;

    /* renamed from: j */
    private SuggestionGridLayout f260858j;

    public C93469e(C22945j jVar, C93472a aVar, Context context, C87681ai aiVar, C68214a aVar2, C58833ax axVar, C90323a aVar3, C58833ax axVar2) {
        super(jVar);
        this.f260852d = context;
        this.f260857i = aVar;
        this.f260849a = aiVar;
        this.f260853e = aVar2;
        C58838bb.m90883r(axVar.mo56113h());
        this.f260854f = (Activity) axVar.mo56107c();
        C58838bb.m90883r(axVar2.mo56113h());
        C91090a aVar4 = (C91090a) axVar2.mo56107c();
        this.f260855g = aVar4;
        this.f260850b = new C91075b(aVar4.f254379a, aVar4);
        this.f260856h = aVar3;
    }

    /* renamed from: a */
    public final void mo83918a() {
        ((C85679b) this.f260851c).f231636d.mo81937i(new C88489j(C87739bu.ACTION_DRAG_BEGIN).mo82013a());
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        SuggestionGridLayout suggestionGridLayout = (SuggestionGridLayout) LayoutInflater.from(this.f260852d).inflate(R.layout.action_card_container, (ViewGroup) null);
        this.f260858j = suggestionGridLayout;
        mo28295iC(suggestionGridLayout);
        C93468d dVar = new C93468d(this);
        C87681ai aiVar = this.f260849a;
        Activity activity = this.f260854f;
        C91090a aVar = this.f260855g;
        C58833ax k = C58833ax.m90834k(dVar);
        aiVar.getClass();
        activity.getClass();
        aVar.getClass();
        C93440ag agVar = (C93440ag) ((C93460b) this.f260853e.mo27525b()).f260837a.mo17428b();
        agVar.getClass();
        SuggestionGridLayout suggestionGridLayout2 = this.f260858j;
        C58838bb.m90866a(suggestionGridLayout2, "cardsView");
        C85679b bVar = new C85679b(new C58885cv(suggestionGridLayout2), (C58881cr) null, aiVar, C89932c.f246391b, aVar, activity, new C58885cv(activity.getLayoutInflater()), C58833ax.m90834k(agVar), k);
        this.f260851c = bVar;
        C85679b bVar2 = bVar;
        C89932c cVar = bVar.f231635c;
        C85678a aVar2 = new C85678a(bVar);
        C89930a aVar3 = cVar.f246401k;
        cVar.f246401k = aVar2;
        this.f260849a.mo81940l(new C93465a(this), C88244um.UNDO_ACTION_USER_INTERACTION, C88244um.REQUEST_LOG_UPDATE_CARD_IMPRESSION, C88244um.UPDATE_TOP_VOICE_ACTION);
        this.f260856h.mo84004a(new C93467c(this));
        ((C93471g) this.f260857i).f260865a.mo28726b(new C93466b(this));
    }
}
