package com.google.android.libraries.p579ar.faceviewer.p580a.p586f;

import com.google.android.libraries.p579ar.faceviewer.p587b.C10646k;
import com.google.android.libraries.p579ar.faceviewer.p588c.C10650a;
import com.google.android.libraries.p579ar.faceviewer.p588c.C10651b;
import com.google.android.libraries.p579ar.faceviewer.p588c.C10652c;
import com.google.android.libraries.p579ar.faceviewer.p588c.C10653d;
import com.google.android.libraries.p579ar.faceviewer.p588c.C10659j;
import com.google.common.p4526f.C59071e;
import com.google.common.p4543n.p4546c.C59394b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import com.google.p363ad.p364a.C6676ah;
import com.google.p363ad.p364a.C6677ai;
import com.google.protos.youtube.p5162a.p5163a.C65981ak;
import com.google.protos.youtube.p5162a.p5163a.C65982al;
import com.google.protos.youtube.p5162a.p5163a.C65998o;
import com.google.protos.youtube.p5162a.p5163a.C65999p;
import com.google.protos.youtube.p5162a.p5163a.C66005v;
import java.util.Locale;
import java.util.logging.Level;

/* renamed from: com.google.android.libraries.ar.faceviewer.a.f.e */
/* compiled from: PG */
public final class C10630e implements C10652c, C10659j {

    /* renamed from: a */
    public static final C59071e f35513a = C59071e.m91332i("com.google.android.libraries.ar.faceviewer.a.f.e");

    /* renamed from: b */
    public final C10627b f35514b;

    /* renamed from: c */
    private final C10646k f35515c;

    /* renamed from: d */
    private C10653d f35516d;

    public C10630e(C10646k kVar) {
        this.f35515c = kVar;
        this.f35514b = new C10627b(kVar);
    }

    /* renamed from: a */
    public final void mo18667a() {
        C10627b bVar = this.f35514b;
        C65998o oVar = (C65998o) C65999p.f179492c.createBuilder();
        C66005v vVar = C66005v.f179500a;
        oVar.copyOnWrite();
        C65999p pVar = (C65999p) oVar.instance;
        vVar.getClass();
        pVar.f179495b = vVar;
        pVar.f179494a = 16;
        bVar.mo18664b((C65999p) oVar.build());
    }

    /* renamed from: b */
    public final void mo18627b() {
        this.f35515c.mo18671g();
    }

    /* renamed from: c */
    public final void mo18628c(C10653d dVar) {
        C6676ah ahVar;
        this.f35516d = dVar;
        C10646k kVar = this.f35515c;
        C6677ai aiVar = ((C10651b) ((C10650a) dVar).f35545a).f35551a;
        if (aiVar.f19945d == 5) {
            ahVar = (C6676ah) aiVar.f19946e;
        } else {
            ahVar = C6676ah.f19935d;
        }
        kVar.mo18672h(ahVar.f19938b);
        this.f35514b.f35507d = dVar;
        String languageTag = Locale.getDefault().toLanguageTag();
        C65981ak akVar = (C65981ak) C65982al.f179457d.createBuilder();
        akVar.copyOnWrite();
        C65982al alVar = (C65982al) akVar.instance;
        languageTag.getClass();
        alVar.f179459a |= 1;
        alVar.f179460b = languageTag;
        if (((C10651b) ((C10650a) this.f35516d).f35545a).f35552b == 2) {
            akVar.copyOnWrite();
            C65982al alVar2 = (C65982al) akVar.instance;
            alVar2.f179459a |= 2;
            alVar2.f179461c = "dark";
        }
        C10650a aVar = (C10650a) this.f35516d;
        C60870cx a = aVar.f35549e.f35544c.f35565f.mo18652a();
        SettableFuture settableFuture = aVar.f35549e.f35544c.f35563d.f35361d;
        C60870cx a2 = C60856cj.m92895d(a, settableFuture).mo57334a(new C10628c(a, settableFuture), aVar.f35547c);
        C59394b.m92296b(C60856cj.m92895d(a2, this.f35514b.f35506c).mo57336c(new C10629d(this, (C65982al) akVar.build(), a2), ((C10650a) this.f35516d).f35547c), Level.WARNING, "Failure executing sendContextAndConfig().");
    }
}
