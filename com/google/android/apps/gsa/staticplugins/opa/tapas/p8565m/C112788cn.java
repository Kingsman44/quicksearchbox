package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import android.content.Context;
import android.support.p033v7.widget.C0673gh;
import android.view.View;
import androidx.core.content.C1878d;
import com.google.android.apps.gsa.staticplugins.nga.p8092ui.p8095b.C104149a;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113367dh;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113427g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1614t.C19391a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.cn */
/* compiled from: PG */
public final class C112788cn extends C112791cq {

    /* renamed from: a */
    public final C113367dh f312608a;

    /* renamed from: b */
    private final Context f312609b;

    /* renamed from: c */
    private final C112880fy f312610c;

    /* renamed from: d */
    private final C104149a f312611d;

    public C112788cn(Context context, C112880fy fyVar, C113367dh dhVar, C104149a aVar) {
        this.f312609b = context;
        this.f312610c = fyVar;
        this.f312608a = dhVar;
        this.f312611d = aVar;
    }

    /* renamed from: b */
    public final int mo99684b(C113415ez ezVar) {
        return 99072;
    }

    /* renamed from: f */
    public final void mo99685f(C113408es esVar, C113415ez ezVar, C0673gh ghVar, C113427g gVar) {
        this.f312610c.mo99775c(ezVar.mo100199L(), esVar, ezVar, 17);
    }

    /* renamed from: g */
    public final void mo99717g(C113415ez ezVar, View view) {
        this.f312610c.mo99774b(ezVar, view);
    }

    /* renamed from: h */
    public final void mo99686h(C113408es esVar, C113415ez ezVar, C0673gh ghVar, C113427g gVar) {
        int i;
        C58976aa aaVar = C58975e.f156826a;
        C112790cp cpVar = (C112790cp) ghVar;
        String L = ezVar.mo100199L();
        String p = esVar.mo100118a().mo100033p();
        if (this.f312611d.mo93970a()) {
            i = C19391a.m36980a(this.f312609b, R.attr.colorOutline);
        } else {
            i = C1878d.m5128a(this.f312609b, R.color.tapas_personalized_query_text_matching);
        }
        cpVar.f312613b.setText(C112883ga.m186806b(i, L, p));
        cpVar.f312614c.setVisibility(8);
        ezVar.mo100192E().map(C112781cg.f312599a).filter(C112782ch.f312600a).map(C112783ci.f312601a).ifPresent(new C112784cj(this, cpVar, C1878d.m5128a(this.f312609b, R.color.translucent_white_placeholder)));
        ezVar.mo100192E().filter(C112785ck.f312605a).map(C112786cl.f312606a).ifPresent(new C112787cm(cpVar));
    }
}
