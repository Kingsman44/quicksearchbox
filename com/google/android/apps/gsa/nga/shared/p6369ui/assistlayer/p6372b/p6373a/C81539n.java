package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6372b.p6373a;

import android.view.View;
import com.google.android.apps.gsa.nga.shared.p6417x.C83369s;
import com.google.android.googlequicksearchbox.R;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.b.a.n */
/* compiled from: PG */
public final /* synthetic */ class C81539n implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C81525ae f222985a;

    public /* synthetic */ C81539n(C81525ae aeVar) {
        this.f222985a = aeVar;
    }

    public final void accept(Object obj) {
        C81525ae aeVar = this.f222985a;
        View view = (View) obj;
        aeVar.f222950g.mo76663c(aeVar.f222957n, new C83369s(aeVar.f222948e, "onChipUpdated", new C81522ab(aeVar, view.findViewById(R.id.nga_assist_blue_bar), view)));
        aeVar.f222948e.mo28212l("[NGA] attachView heroChip", new C81523ac(aeVar, view));
        aeVar.f222950g.mo76663c(aeVar.f222958o, new C81524ad(aeVar));
        aeVar.f222950g.mo76663c(aeVar.f222959p, new C81527b(aeVar));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
