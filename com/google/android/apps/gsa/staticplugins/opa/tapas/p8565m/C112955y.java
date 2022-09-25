package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.y */
/* compiled from: PG */
public final /* synthetic */ class C112955y implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C112721aa f313016a;

    /* renamed from: b */
    public final /* synthetic */ C112923hn f313017b;

    /* renamed from: c */
    public final /* synthetic */ C112919hj f313018c;

    /* renamed from: d */
    public final /* synthetic */ String f313019d;

    public /* synthetic */ C112955y(C112721aa aaVar, C112923hn hnVar, C112919hj hjVar, String str) {
        this.f313016a = aaVar;
        this.f313017b = hnVar;
        this.f313018c = hjVar;
        this.f313019d = str;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C112721aa aaVar = this.f313016a;
        C112923hn hnVar = this.f313017b;
        C112919hj hjVar = this.f313018c;
        String str = this.f313019d;
        Optional optional = (Optional) obj;
        if (optional.isPresent()) {
            ((C112725ae) hnVar).f312485c = Optional.m71637of(((CharSequence) optional.get()).toString());
            hjVar.f312954b.setText(aaVar.f312469b.mo99782a(hnVar.mo99701a()));
            C59104x b = C112721aa.f312467a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "AppShortcutsRenderer");
            ((C59052c) ((C59052c) b).mo56372aa(27781)).mo56354G("setText for shortcut label %s, app label %s", str, optional.get());
        } else if (!aaVar.f312470c.mo79746e(C90063do.f249525fF)) {
            hjVar.itemView.setVisibility(8);
        }
    }
}
