package com.google.android.apps.gsa.staticplugins.nga.p8044a.p8045a;

import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.a.a.aj */
/* compiled from: PG */
public final /* synthetic */ class C102901aj implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C102909ar f287356a;

    /* renamed from: b */
    public final /* synthetic */ C91006f f287357b;

    public /* synthetic */ C102901aj(C102909ar arVar, C91006f fVar) {
        this.f287356a = arVar;
        this.f287357b = fVar;
    }

    public final void accept(Object obj) {
        C102909ar arVar = this.f287356a;
        String str = (String) obj;
        this.f287357b.mo85279c("Account").mo85277b("%s: isDasher: %s - isSaaEnabled: %s", C90752i.m148236j(str), C90752i.m148229c((CharSequence) arVar.f287369c.mo74946g(str).map(C102899ah.f287354a).orElse("UNKNOWN")), C90752i.m148229c((CharSequence) arVar.f287369c.mo74948i(Optional.m71637of(str)).map(C102900ai.f287355a).orElse("UNKNOWN")));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
