package com.google.android.libraries.search.assistant.performer.communication.p2736d.p2738b;

import com.google.android.libraries.search.assistant.notification.data.BundledMessageNotification;
import com.google.android.libraries.search.assistant.notification.data.MessageNotification;
import com.google.android.libraries.search.assistant.notification.data.p2713a.C34879g;
import com.google.android.libraries.search.assistant.p2786t.p2787a.C36452c;
import com.google.android.libraries.search.assistant.p2786t.p2787a.C36453d;
import com.google.android.libraries.search.assistant.p2786t.p2787a.C36454e;
import com.google.android.libraries.search.assistant.p2786t.p2787a.C36455f;
import com.google.android.libraries.search.assistant.p2786t.p2787a.C36456g;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.C35626as;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.C35665z;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.d.b.h */
/* compiled from: PG */
public final class C35637h implements C35626as, C35665z {

    /* renamed from: a */
    private final C36456g f93495a;

    public C35637h(C36456g gVar) {
        this.f93495a = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo20792a(BundledMessageNotification bundledMessageNotification, boolean z) {
        Optional c = C34879g.m63709c(bundledMessageNotification);
        if (!c.isPresent()) {
            return C60856cj.m92899h(new IllegalArgumentException("Empty BundledMessageNotification provided"));
        }
        C36456g gVar = this.f93495a;
        C36452c cVar = (C36452c) C36453d.f95179d.createBuilder();
        String u = ((MessageNotification) c.get()).mo39565u();
        cVar.copyOnWrite();
        C36453d dVar = (C36453d) cVar.instance;
        u.getClass();
        dVar.f95181a |= 1;
        dVar.f95182b = u;
        cVar.copyOnWrite();
        C36453d dVar2 = (C36453d) cVar.instance;
        dVar2.f95181a |= 2;
        dVar2.f95183c = z;
        return gVar.mo40170b((C36453d) cVar.build());
    }

    /* renamed from: d */
    public final C60870cx mo20797d(BundledMessageNotification bundledMessageNotification, String str) {
        Optional c = C34879g.m63709c(bundledMessageNotification);
        if (!c.isPresent()) {
            return C60856cj.m92899h(new IllegalArgumentException("Empty BundledMessageNotification provided"));
        }
        C36456g gVar = this.f93495a;
        C36454e eVar = (C36454e) C36455f.f95184d.createBuilder();
        String u = ((MessageNotification) c.get()).mo39565u();
        eVar.copyOnWrite();
        C36455f fVar = (C36455f) eVar.instance;
        u.getClass();
        fVar.f95186a |= 1;
        fVar.f95187b = u;
        eVar.copyOnWrite();
        C36455f fVar2 = (C36455f) eVar.instance;
        str.getClass();
        fVar2.f95186a |= 2;
        fVar2.f95188c = str;
        return gVar.mo40171c((C36455f) eVar.build());
    }
}
