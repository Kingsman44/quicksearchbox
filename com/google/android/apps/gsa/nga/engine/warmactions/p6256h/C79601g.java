package com.google.android.apps.gsa.nga.engine.warmactions.p6256h;

import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79570b;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79583o;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91005e;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.h.g */
/* compiled from: PG */
public final /* synthetic */ class C79601g implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ C91006f f218389a;

    public /* synthetic */ C79601g(C91006f fVar) {
        this.f218389a = fVar;
    }

    public final void accept(Object obj, Object obj2) {
        C91006f fVar = this.f218389a;
        C79583o oVar = (C79583o) obj2;
        int i = C79605k.f218396c;
        C91005e b = fVar.mo85278b(((C79570b) obj).name());
        int size = oVar.f218361b.size();
        int i2 = oVar.f218360a;
        int i3 = i2 & 1;
        boolean z = false;
        boolean z2 = (i2 & 2) != 0;
        StringBuilder sb = new StringBuilder("#hotqueries=");
        sb.append(size);
        sb.append(", uiConfig=");
        if (1 == i3) {
            z = true;
        }
        sb.append(z);
        sb.append(", biasing=");
        sb.append(z2);
        b.mo85276a(C90752i.m148229c(sb.toString()));
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
