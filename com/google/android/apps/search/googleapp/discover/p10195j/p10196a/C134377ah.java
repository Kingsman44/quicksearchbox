package com.google.android.apps.search.googleapp.discover.p10195j.p10196a;

import com.google.android.apps.search.googleapp.discover.p10166a.C133939b;
import com.google.android.apps.search.googleapp.discover.streamui.C134720e;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.android.libraries.elements.interfaces.C21313t;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3133b.C40335z;
import com.google.android.libraries.search.video.lightbox.C41540s;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57066ah;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a.C57177h;
import com.google.protobuf.C62917ay;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4921c.p4922a.C64188aj;
import com.google.protos.youtube.elements.C66059au;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.p5490b.C69794a;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5497e.p5502e.p5503a.C69874i;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: com.google.android.apps.search.googleapp.discover.j.a.ah */
/* compiled from: PG */
public final class C134377ah implements C21312s {

    /* renamed from: a */
    private static final C59071e f366030a = C59071e.m91332i("com.google.android.apps.search.googleapp.discover.j.a.ah");

    /* renamed from: b */
    private final C133939b f366031b;

    /* renamed from: c */
    private final C40335z f366032c;

    public C134377ah(C133939b bVar, C40335z zVar) {
        this.f366031b = bVar;
        this.f366032c = zVar;
    }

    /* renamed from: a */
    public final C62917ay mo25802a() {
        return C64188aj.f173549c;
    }

    /* renamed from: b */
    public final /* synthetic */ C66059au mo25803b() {
        return null;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C69794a mo25804c(Object obj, C21311r rVar) {
        C57066ah ahVar = ((C64188aj) obj).f173551a;
        if (ahVar == null) {
            ahVar = C57066ah.f152341d;
        }
        C133939b bVar = this.f366031b;
        Optional ofNullable = Optional.ofNullable(rVar.mo26732b());
        C69664n.m101061g(ahVar, "openVideoData");
        C69664n.m101061g(ofNullable, "clickedView");
        bVar.f364810s.mo111908d(C134720e.VIDEO_CARD_TAPPED);
        C41540s sVar = bVar.f364800i;
        C57177h hVar = ahVar.f152344b;
        if (hVar == null) {
            hVar = C57177h.f152644k;
        }
        if (sVar.mo44063a(hVar, ofNullable)) {
            C69794a aVar = C69874i.f186267a;
            C69822d dVar = C70101a.f186847o;
            return aVar;
        } else if ((ahVar.f152343a & 2) != 0) {
            C21313t a = this.f366032c.mo42396a();
            CommandOuterClass$Command commandOuterClass$Command = ahVar.f152345c;
            if (commandOuterClass$Command == null) {
                commandOuterClass$Command = CommandOuterClass$Command.f179510a;
            }
            return a.mo26124a(commandOuterClass$Command, rVar);
        } else {
            ((C59052c) ((C59052c) f366030a.mo56226d()).mo56372aa(40332)).mo56386p("Failed to launch OpenVideoCommand.");
            C69794a aVar2 = C69874i.f186267a;
            C69822d dVar2 = C70101a.f186847o;
            return aVar2;
        }
    }
}
