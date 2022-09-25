package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7597c.p7598a;

import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7600d.C97091f;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7600d.C97092g;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7600d.C97093h;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7600d.C97094i;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7600d.p7601a.C97080b;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7600d.p7601a.C97081c;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7600d.p7601a.C97082d;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7600d.p7601a.C97083e;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7600d.p7601a.C97084f;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7600d.p7601a.C97085g;
import com.google.android.apps.gsa.staticplugins.bubble.p7582f.C97016d;
import com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7587c.C97014s;
import com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7587c.C97015t;
import com.google.android.apps.gsa.staticplugins.bubble.p7591i.C97043f;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57438di;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.c.a.h */
/* compiled from: PG */
public final class C97073h {

    /* renamed from: a */
    public final C97093h f271248a;

    /* renamed from: b */
    private final C97084f f271249b;

    public C97073h(C97093h hVar, C97084f fVar) {
        this.f271248a = hVar;
        this.f271249b = fVar;
    }

    /* renamed from: a */
    public final void mo90436a(C97015t tVar) {
        this.f271248a.mo90458a(2);
        C97093h hVar = this.f271248a;
        C97016d dVar = tVar.f271127k;
        if (dVar == null) {
            dVar = C97016d.f271129d;
        }
        if (!hVar.f271292d.equals(dVar)) {
            hVar.f271292d = dVar;
        }
        C97084f fVar = this.f271249b;
        C57438di diVar = tVar.f271118b;
        if (diVar == null) {
            diVar = C57438di.f153417i;
        }
        fVar.f271276b = diVar;
        C97043f fVar2 = fVar.f271275a;
        C97085g gVar = fVar.f271278d;
        Objects.requireNonNull(gVar);
        fVar2.mo90405a("onCollapsedViewFrameChangeCallback", new C97083e(gVar));
        C97084f fVar3 = this.f271249b;
        C57438di diVar2 = tVar.f271119c;
        if (diVar2 == null) {
            diVar2 = C57438di.f153417i;
        }
        fVar3.f271277c = diVar2;
        C97043f fVar4 = fVar3.f271275a;
        C97085g gVar2 = fVar3.f271278d;
        Objects.requireNonNull(gVar2);
        fVar4.mo90405a("onExtendedViewFrameChangeCallback", new C97081c(gVar2));
        C97084f fVar5 = this.f271249b;
        boolean z = tVar.f271123g;
        if ((!fVar5.f271279e) == z) {
            fVar5.f271279e = z;
            C97043f fVar6 = fVar5.f271275a;
            C97085g gVar3 = fVar5.f271278d;
            Objects.requireNonNull(gVar3);
            fVar6.mo90405a("onShouldWrapBubbleInCardViewChangeCallback", new C97082d(gVar3));
        }
        C97084f fVar7 = this.f271249b;
        C97014s sVar = tVar.f271124h;
        if (sVar == null) {
            sVar = C97014s.f271107e;
        }
        if (!fVar7.f271280f.equals(sVar)) {
            fVar7.f271280f = sVar;
            C97043f fVar8 = fVar7.f271275a;
            C97085g gVar4 = fVar7.f271278d;
            Objects.requireNonNull(gVar4);
            fVar8.mo90405a("onNotificationChangeCallback", new C97080b(gVar4));
        }
        C97093h hVar2 = this.f271248a;
        String str = tVar.f271125i;
        if (!hVar2.f271290b.equals(str)) {
            hVar2.f271290b = str;
            C97043f fVar9 = hVar2.f271289a;
            C97094i iVar = hVar2.f271293e;
            Objects.requireNonNull(iVar);
            fVar9.mo90405a("onRemoveButtonTextCallback", new C97092g(iVar));
        }
        C97093h hVar3 = this.f271248a;
        String str2 = tVar.f271126j;
        if (!hVar3.f271291c.equals(str2)) {
            hVar3.f271291c = str2;
            C97043f fVar10 = hVar3.f271289a;
            C97094i iVar2 = hVar3.f271293e;
            Objects.requireNonNull(iVar2);
            fVar10.mo90405a("onFeedbackButtonTextCallback", new C97091f(iVar2));
        }
    }
}
