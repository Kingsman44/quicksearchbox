package com.google.android.apps.gsa.staticplugins.opa.zerostate.sections;

import android.content.Context;
import android.support.p033v7.widget.C0654fp;
import android.support.p033v7.widget.C0673gh;
import android.view.ViewGroup;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108226ax;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.df */
/* compiled from: PG */
public final class C115056df extends C114999bc {
    public C115056df(Context context, List list, C108226ax axVar) {
        super(context, list, axVar);
    }

    public final /* synthetic */ C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        C58976aa aaVar = C58975e.f156826a;
        C114998bb bbVar = new C114998bb(this.f319175b.inflate(R.layout.conversation_starters_suggestion_vertical_view, viewGroup, false));
        if ((i & 1) == 0) {
            mo101810c(bbVar);
            bbVar.f319171a.setMaxWidth(this.f319181h);
        }
        if ((i & 8) != 0) {
            C0654fp fpVar = (C0654fp) bbVar.itemView.getLayoutParams();
            fpVar.setMargins(84, 0, 84, 0);
            bbVar.itemView.setLayoutParams(fpVar);
        }
        return bbVar;
    }
}
