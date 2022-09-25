package com.google.android.apps.gsa.staticplugins.nga.education.pie.p8060ui;

import android.view.View;
import com.google.android.apps.gsa.assistant.shared.e.q;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.education.pie.ui.bo */
/* compiled from: PG */
public final class C103152bo implements q {

    /* renamed from: a */
    final /* synthetic */ C103153bp f287860a;

    public C103152bo(C103153bp bpVar) {
        this.f287860a = bpVar;
    }

    /* renamed from: a */
    public final void mo93668a(String str) {
        Optional ofNullable = Optional.ofNullable(str);
        ofNullable.ifPresent(C103151bn.f287859a);
        if (this.f287860a.f287868g.isPresent() && !this.f287860a.f287868g.equals(ofNullable)) {
            C103153bp bpVar = this.f287860a;
            if (bpVar.f287867f.isPresent() && ((View) bpVar.f287867f.get()).getWindowToken() != null) {
                bpVar.f287864c.removeView((View) bpVar.f287867f.get());
                bpVar.f287869h.run();
            }
            bpVar.f287863b.mo65340c(this);
        }
    }
}
