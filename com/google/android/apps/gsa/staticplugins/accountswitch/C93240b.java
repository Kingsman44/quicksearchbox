package com.google.android.apps.gsa.staticplugins.accountswitch;

import com.google.android.libraries.search.p2871b.C37298n;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.net.p4726a.p4727a.C62722b;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.accountswitch.b */
/* compiled from: PG */
public final /* synthetic */ class C93240b implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C93241c f260008a;

    public /* synthetic */ C93240b(C93241c cVar) {
        this.f260008a = cVar;
    }

    public final void accept(Object obj) {
        C93241c cVar = this.f260008a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        ((C37298n) cVar.f260011c).mo40849c(C37182a.f98145hF.mo40805c(booleanValue ? C62722b.OK : C62722b.INTERNAL));
        cVar.f260009a.setResult(true != booleanValue ? 0 : -1);
        cVar.f260009a.finish();
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
