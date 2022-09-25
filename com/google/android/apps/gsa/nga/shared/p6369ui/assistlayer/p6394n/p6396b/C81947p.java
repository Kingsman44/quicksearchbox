package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6394n.p6396b;

import android.view.View;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6377e.C81572o;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C81989az;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C81993bc;
import com.google.android.libraries.logging.C28285c;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.n.b.p */
/* compiled from: PG */
public final /* synthetic */ class C81947p implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C81948q f224048a;

    /* renamed from: b */
    public final /* synthetic */ View f224049b;

    public /* synthetic */ C81947p(C81948q qVar, View view) {
        this.f224048a = qVar;
        this.f224049b = view;
    }

    public final void onClick(View view) {
        C81948q qVar = this.f224048a;
        View view2 = this.f224049b;
        C81993bc bcVar = qVar.f224053b;
        Optional ofNullable = Optional.ofNullable(C28285c.m52882i(view2, 5, (Integer) null));
        C81572o oVar = bcVar.f224155a;
        Objects.requireNonNull(oVar);
        ofNullable.ifPresent(new C81989az(oVar));
        qVar.f224052a.mo75401a();
    }
}
