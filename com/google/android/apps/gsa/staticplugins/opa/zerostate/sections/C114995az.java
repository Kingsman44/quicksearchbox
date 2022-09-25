package com.google.android.apps.gsa.staticplugins.opa.zerostate.sections;

import android.view.View;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108226ax;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108430ik;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.az */
/* compiled from: PG */
final class C114995az implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C108430ik f319166a;

    /* renamed from: b */
    final /* synthetic */ C114998bb f319167b;

    /* renamed from: c */
    final /* synthetic */ C114999bc f319168c;

    public C114995az(C114999bc bcVar, C108430ik ikVar, C114998bb bbVar) {
        this.f319168c = bcVar;
        this.f319166a = ikVar;
        this.f319167b = bbVar;
    }

    public final void onClick(View view) {
        if (!this.f319166a.mo96708f().equals("Play a video")) {
            this.f319166a.f301613t = true;
        }
        C108226ax axVar = this.f319168c.f319177d;
        C108430ik ikVar = this.f319166a;
        View view2 = this.f319167b.itemView;
        axVar.mo96411x(ikVar);
    }
}
