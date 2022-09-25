package com.google.android.apps.gsa.searchnow;

import com.google.android.apps.gsa.shared.monet.C90163ad;
import com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90285a;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;

/* renamed from: com.google.android.apps.gsa.searchnow.aj */
/* compiled from: PG */
public final class C88858aj extends C90163ad {

    /* renamed from: a */
    public final /* synthetic */ C88861am f240567a;

    public C88858aj(C88861am amVar) {
        this.f240567a = amVar;
    }

    /* renamed from: a */
    public final void mo76767a(C22939d dVar) {
        C90285a aVar = (C90285a) dVar;
        aVar.mo83989f(new C88856ah(this));
        aVar.mo83990g(new C88857ai(this));
        C88861am amVar = this.f240567a;
        amVar.f240585O = aVar;
        amVar.mo82645f();
    }

    /* renamed from: b */
    public final void mo76768b(C22939d dVar) {
        this.f240567a.f240585O = null;
    }

    /* renamed from: c */
    public final /* synthetic */ void mo82640c(int i) {
        C88861am amVar = this.f240567a;
        amVar.f240589S = i;
        if (i == 5 && !amVar.f240593W) {
            amVar.f240593W = true;
            amVar.mo82650k();
            this.f240567a.f240603d.f236793W = true;
        }
        C88861am amVar2 = this.f240567a;
        if (amVar2.f240577G.f240626a && amVar2.f240589S == 5) {
            amVar2.f240603d.f236794X = true;
        }
        amVar2.mo82649j();
    }
}
