package com.google.android.apps.gsa.staticplugins.opa.zerostate.sections;

import android.content.Context;
import android.support.p033v7.widget.C0654fp;
import android.support.p033v7.widget.C0673gh;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108226ax;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108430ik;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.cc */
/* compiled from: PG */
public final class C115026cc extends C114999bc {

    /* renamed from: j */
    private final C86124t f319282j;

    public C115026cc(Context context, List list, C108226ax axVar, C86124t tVar) {
        super(context, list, axVar);
        this.f319282j = tVar;
    }

    /* renamed from: f */
    private final void m190705f(C114998bb bbVar) {
        if (this.f319282j.mo79746e(C90014bt.f247832os)) {
            bbVar.f319171a.setTextAppearance(R.style.ConversationStartersHqSuggestionTextCoinView);
            return;
        }
        bbVar.f319171a.setTextAppearance(R.style.ConversationStartersHqSuggestionText);
        bbVar.itemView.setBackground(this.f319174a.getResources().getDrawable(R.drawable.explore_conversation_starters_suggestion_background));
    }

    /* renamed from: b */
    public final void mo101809b(C114998bb bbVar, int i) {
        super.onBindViewHolder(bbVar, i);
        if (m190658d((C108430ik) this.f319176c.get(i))) {
            m190705f(bbVar);
        }
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C0673gh ghVar, int i) {
        onBindViewHolder((C114998bb) ghVar, i);
    }

    public final /* synthetic */ C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        C114998bb bbVar;
        C58976aa aaVar = C58975e.f156826a;
        if ((i & 16) != 0) {
            return new C114998bb(new View(this.f319174a));
        }
        if (this.f319282j.mo79746e(C90014bt.f247832os)) {
            bbVar = new C114998bb(this.f319175b.inflate(R.layout.conversation_starters_suggestion_coin_view, viewGroup, false));
        } else {
            bbVar = new C114998bb(this.f319175b.inflate(R.layout.conversation_starters_suggestion_view, viewGroup, false));
        }
        C114998bb bbVar2 = bbVar;
        if ((i & 1) == 0) {
            mo101810c(bbVar2);
            bbVar2.f319171a.setMaxWidth(this.f319180g);
        }
        if ((i & 4) != 0) {
            C0654fp fpVar = (C0654fp) bbVar2.itemView.getLayoutParams();
            fpVar.setMarginStart(this.f319178e);
            bbVar2.itemView.setLayoutParams(fpVar);
        }
        if ((i & 8) != 0) {
            C0654fp fpVar2 = (C0654fp) bbVar2.itemView.getLayoutParams();
            fpVar2.setMarginEnd(this.f319178e);
            bbVar2.itemView.setLayoutParams(fpVar2);
        }
        if ((i & 2) == 0) {
            return bbVar2;
        }
        m190705f(bbVar2);
        return bbVar2;
    }
}
