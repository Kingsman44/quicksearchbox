package com.google.android.apps.search.googleapp.discover.p10195j.p10196a;

import com.google.android.apps.search.googleapp.discover.p10166a.C133939b;
import com.google.android.apps.search.googleapp.discover.p10214s.C134589g;
import com.google.android.apps.search.googleapp.discover.streamui.p10225a.C134695a;
import com.google.android.apps.search.googleapp.discover.streamui.p10225a.C134696b;
import com.google.android.apps.search.googleapp.discover.streamui.p10225a.C134697c;
import com.google.android.apps.search.googleapp.discover.streamui.p10225a.C134698d;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3132a.C40305b;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57085b;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57155l;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4921c.p4922a.C64205b;
import java.util.concurrent.TimeUnit;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.p5490b.C70128t;
import p5488io.p5490b.p5491a.p5492a.C69795a;
import p5488io.p5490b.p5491a.p5493b.C69797b;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5497e.p5499b.C69840i;
import p5488io.p5490b.p5497e.p5499b.C69841j;
import p5488io.p5490b.p5497e.p5502e.p5506d.C69964br;
import p5488io.p5490b.p5497e.p5502e.p5506d.C69967bu;
import p5488io.p5490b.p5497e.p5502e.p5506d.C69983m;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: com.google.android.apps.search.googleapp.discover.j.a.a */
/* compiled from: PG */
final class C134369a implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C134396b f366017a;

    /* renamed from: b */
    final /* synthetic */ C64205b f366018b;

    /* renamed from: c */
    final /* synthetic */ C134589g f366019c;

    public C134369a(C134396b bVar, C64205b bVar2, C134589g gVar) {
        this.f366017a = bVar;
        this.f366018b = bVar2;
        this.f366019c = gVar;
    }

    public final void run() {
        C133939b bVar = this.f366017a.f366103a;
        C57085b bVar2 = this.f366018b.f173604a;
        if (bVar2 == null) {
            bVar2 = C57085b.f152395c;
        }
        String str = bVar2.f152397a;
        C69664n.m101060f(str, "command.animateFeedLayoutData.keyToObserve");
        String str2 = this.f366019c.f366533c;
        C69664n.m101060f(str2, "discoverClientContext.contentId");
        C57085b bVar3 = this.f366018b.f173604a;
        if (bVar3 == null) {
            bVar3 = C57085b.f152395c;
        }
        C57155l lVar = bVar3.f152398b;
        if (lVar == null) {
            lVar = C57155l.f152582c;
        }
        C69664n.m101060f(lVar, "command.animateFeedLayoutData.animationTimings");
        C69664n.m101061g(str, "keyToObserve");
        C69664n.m101061g(str2, "contentId");
        C69664n.m101061g(lVar, "animationTimings");
        C134698d dVar = bVar.f364811t;
        C69664n.m101061g(str, "keyToObserve");
        C69664n.m101061g(str2, "contentId");
        C69664n.m101061g(lVar, "animationTimings");
        C69803b bVar4 = (C69803b) dVar.f366812d.get(str2);
        if (bVar4 != null) {
            bVar4.dispose();
        }
        C69964br brVar = new C69964br(((C40305b) dVar.f366811c.mo27525b()).mo32545d().mo26139b(str));
        C69822d dVar2 = C70101a.f186843k;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        C70128t tVar = C69797b.f186184a;
        C69795a.m101266a(tVar);
        C69841j.m101337b(timeUnit, "timeUnit is null");
        C69841j.m101337b(tVar, "scheduler is null");
        C69967bu buVar = new C69967bu(brVar, timeUnit, tVar);
        C69822d dVar3 = C70101a.f186843k;
        C70128t tVar2 = C69797b.f186184a;
        C69795a.m101266a(tVar2);
        C69983m mVar = new C69983m(buVar.mo61653m(tVar2), new C134696b(dVar, str2));
        C69822d dVar4 = C70101a.f186843k;
        dVar.f366812d.put(str2, mVar.mo61658t(new C134695a(dVar, str2, lVar), new C134697c(str2), C69840i.f186211d));
    }
}
