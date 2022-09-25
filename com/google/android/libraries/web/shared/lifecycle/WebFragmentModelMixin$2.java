package com.google.android.libraries.web.shared.lifecycle;

import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2391v;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58838bb;
import com.google.common.base.C58893dc;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.function.Consumer;

/* compiled from: PG */
class WebFragmentModelMixin$2 implements C2376g {

    /* renamed from: a */
    final /* synthetic */ boolean f114783a;

    /* renamed from: b */
    final /* synthetic */ Consumer f114784b;

    /* renamed from: c */
    final /* synthetic */ Consumer f114785c;

    /* renamed from: d */
    final /* synthetic */ C44106g f114786d;

    public WebFragmentModelMixin$2(C44106g gVar, boolean z, Consumer consumer, Consumer consumer2) {
        this.f114786d = gVar;
        this.f114783a = z;
        this.f114784b = consumer;
        this.f114785c = consumer2;
    }

    /* renamed from: gV */
    public final /* synthetic */ void mo3520gV(C2391v vVar) {
    }

    /* renamed from: gW */
    public final /* synthetic */ void mo3521gW(C2391v vVar) {
    }

    /* renamed from: gX */
    public final /* synthetic */ void mo3522gX(C2391v vVar) {
    }

    /* renamed from: gY */
    public final /* synthetic */ void mo3523gY(C2391v vVar) {
    }

    /* renamed from: gZ */
    public final void mo3524gZ(C2391v vVar) {
        C44106g gVar = this.f114786d;
        C44107h hVar = gVar.f114808c;
        if (hVar == null) {
            return;
        }
        if (this.f114783a) {
            this.f114784b.accept(hVar);
            return;
        }
        if (gVar.f114809d == null) {
            gVar.f114809d = new C44105f(gVar.f114806a, gVar.f114807b);
        }
        C44105f fVar = gVar.f114809d;
        fVar.f114804c = fVar.f114802a.mo19398a(C47810es.m84977q(new C44104e(fVar, new C44101b(this, this.f114784b))));
    }

    /* renamed from: ha */
    public final void mo3525ha(C2391v vVar) {
        C44106g gVar = this.f114786d;
        if (gVar.f114808c != null) {
            C44105f fVar = gVar.f114809d;
            if (fVar != null) {
                C58838bb.m90884s(!fVar.f114805d, "Calling #cancel twice is usually a race bug. Please report the bug to WebX: go/webx-bug");
                fVar.f114805d = true;
                fVar.f114803b = null;
                C60870cx cxVar = fVar.f114804c;
                if (cxVar != null) {
                    cxVar.cancel(true);
                    fVar.f114804c = null;
                }
                this.f114786d.f114809d = null;
            }
            Consumer consumer = this.f114785c;
            C44107h hVar = this.f114786d.f114808c;
            C58893dc.m90996a(hVar);
            consumer.accept(hVar);
        }
    }
}
