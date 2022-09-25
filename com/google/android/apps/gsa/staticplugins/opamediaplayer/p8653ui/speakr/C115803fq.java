package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.speakr;

import android.os.Bundle;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.support.p033v7.widget.RecyclerView;
import android.support.p033v7.widget.p041a.C0500j;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a.C115449s;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a.C115450t;
import com.google.assistant.p3897e.p3921j.C52170hv;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.fq */
/* compiled from: PG */
public final class C115803fq extends C0500j {

    /* renamed from: a */
    final RecyclerView f321149a;

    public C115803fq(RecyclerView recyclerView) {
        super(0, 8);
        this.f321149a = recyclerView;
    }

    /* renamed from: g */
    public final boolean mo2444g(RecyclerView recyclerView, C0673gh ghVar, C0673gh ghVar2) {
        return false;
    }

    /* renamed from: k */
    public final void mo2448k(C0673gh ghVar) {
        C0640fb fbVar;
        RecyclerView recyclerView = this.f321149a;
        if (recyclerView != null && (fbVar = recyclerView.mAdapter) != null) {
            int bindingAdapterPosition = ghVar.getBindingAdapterPosition();
            C115714ci ciVar = (C115714ci) fbVar;
            C52170hv hvVar = (C52170hv) C52176ia.f136911k.createBuilder(ciVar.f320828b);
            hvVar.mo53809e(bindingAdapterPosition);
            ciVar.f320828b = (C52176ia) hvVar.build();
            ciVar.notifyItemRemoved(bindingAdapterPosition);
            C115725ct ctVar = ciVar.f320962a;
            C58976aa aaVar = C58975e.f156826a;
            C115449s sVar = ctVar.f320973e;
            Bundle bundle = new Bundle();
            bundle.putInt("itemPosition", Integer.valueOf(bindingAdapterPosition).intValue());
            ((C115450t) sVar).f320288a.mo28345s("onItemArchived_int", "SpeakrPlaylistEventsDispatcher", bundle);
        }
    }
}
