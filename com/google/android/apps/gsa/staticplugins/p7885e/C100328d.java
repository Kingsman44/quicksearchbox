package com.google.android.apps.gsa.staticplugins.p7885e;

import com.google.android.apps.gsa.search.shared.service.p6935b.C88151ra;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139323e;
import com.google.p4242bp.p4253e.p4254a.C56182b;
import com.google.p4242bp.p4253e.p4254a.C56192l;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56609a;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56610b;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56621m;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56622n;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.e.d */
/* compiled from: PG */
public final /* synthetic */ class C100328d implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C139323e f280566a;

    public /* synthetic */ C100328d(C139323e eVar) {
        this.f280566a = eVar;
    }

    public final void accept(Object obj) {
        C139323e eVar = this.f280566a;
        C88151ra raVar = (C88151ra) obj;
        C56609a aVar = (C56609a) C56610b.f151140k.createBuilder();
        String str = raVar.f238290c;
        aVar.copyOnWrite();
        C56610b bVar = (C56610b) aVar.instance;
        str.getClass();
        bVar.f151142a |= 2;
        bVar.f151144c = str;
        String str2 = raVar.f238289b;
        aVar.copyOnWrite();
        C56610b bVar2 = (C56610b) aVar.instance;
        str2.getClass();
        bVar2.f151142a |= 1;
        bVar2.f151143b = str2;
        String str3 = raVar.f238291d;
        aVar.copyOnWrite();
        C56610b bVar3 = (C56610b) aVar.instance;
        str3.getClass();
        bVar3.f151142a |= 4;
        bVar3.f151145d = str3;
        C56192l lVar = raVar.f238292e;
        if (lVar == null) {
            lVar = C56192l.f149716c;
        }
        aVar.copyOnWrite();
        C56610b bVar4 = (C56610b) aVar.instance;
        lVar.getClass();
        bVar4.f151149h = lVar;
        bVar4.f151142a |= 256;
        C56621m mVar = (C56621m) C56622n.f151177e.createBuilder();
        C56182b bVar5 = raVar.f238293f;
        if (bVar5 == null) {
            bVar5 = C56182b.f149689f;
        }
        mVar.copyOnWrite();
        C56622n nVar = (C56622n) mVar.instance;
        bVar5.getClass();
        nVar.f151180b = bVar5;
        nVar.f151179a |= 1;
        aVar.copyOnWrite();
        C56610b bVar6 = (C56610b) aVar.instance;
        C56622n nVar2 = (C56622n) mVar.build();
        nVar2.getClass();
        bVar6.f151150i = nVar2;
        bVar6.f151142a |= 512;
        eVar.mo114902a(aVar);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
