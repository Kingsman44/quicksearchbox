package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6372b.p6373a;

import android.view.View;
import androidx.p197u.C4195af;
import androidx.p197u.C4199aj;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80696by;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.animation.C147774g;
import com.google.android.libraries.animation.C147785k;
import com.google.android.libraries.animation.impl.C147779b;
import com.google.android.libraries.animation.impl.C147783f;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.b.a.ab */
/* compiled from: PG */
public final /* synthetic */ class C81522ab implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C81525ae f222938a;

    /* renamed from: b */
    public final /* synthetic */ View f222939b;

    /* renamed from: c */
    public final /* synthetic */ View f222940c;

    public /* synthetic */ C81522ab(C81525ae aeVar, View view, View view2) {
        this.f222938a = aeVar;
        this.f222939b = view;
        this.f222940c = view2;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C81525ae aeVar = this.f222938a;
        View view = this.f222939b;
        View view2 = this.f222940c;
        C80696by byVar = (C80696by) obj;
        if (aeVar.f222953j == null) {
            C147783f fVar = aeVar.f222960q;
            Objects.requireNonNull(view2);
            aeVar.f222953j = new C147779b(fVar, C147774g.m240858a(new C81551z(view2), new C81521aa(view2))).mo124453a();
        }
        C147785k kVar = aeVar.f222953j;
        byVar.mo74630e();
        C4199aj.m12054b(aeVar.f222947d, (C4195af) null);
        if (byVar.mo74630e()) {
            kVar.mo124460b(1.0f, C81525ae.f222945b);
            view.setEnabled(true);
        } else {
            kVar.mo124460b(0.0f, C81525ae.f222946c);
            view.setEnabled(false);
        }
        aeVar.mo75133h(byVar.mo74429c());
        if (byVar.mo74427a() != null) {
            view.setOnClickListener(new C81548w(aeVar, view, byVar));
        } else {
            view.setOnClickListener((View.OnClickListener) null);
        }
    }
}
