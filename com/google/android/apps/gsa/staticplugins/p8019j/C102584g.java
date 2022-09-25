package com.google.android.apps.gsa.staticplugins.p8019j;

import com.google.android.apps.gsa.assist.C9417g;
import com.google.android.apps.gsa.assist.C9418h;
import com.google.assistant.p3897e.p3910e.p3911a.C51188c;
import com.google.assistant.p3897e.p3910e.p3911a.C51189d;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.knowledge.p4671b.C61817j;
import com.google.knowledge.p4671b.C61818k;
import com.google.p4017at.p4060h.p4068b.p4069a.C54185b;
import com.google.p4017at.p4060h.p4068b.p4069a.C54188e;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.Set;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.j.g */
/* compiled from: PG */
public final class C102584g extends C68247h {

    /* renamed from: a */
    private final C68283d f286291a;

    /* renamed from: c */
    private final C68283d f286292c;

    public C102584g(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C102584g.class), aVar);
        this.f286291a = C68236af.m98549d(dVar);
        this.f286292c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        boolean z = false;
        Set<C58833ax> set = (Set) list.get(0);
        C51189d dVar = (C51189d) list.get(1);
        for (C58833ax h : set) {
            z |= h.mo56113h();
        }
        if (z) {
            C54188e eVar = dVar.f133251c;
            if (eVar == null) {
                eVar = C54188e.f142203f;
            }
            C61818k kVar = eVar.f142207c;
            if (kVar == null) {
                kVar = C61818k.f166999r;
            }
            C61817j jVar = (C61817j) kVar.toBuilder();
            for (C58833ax axVar : set) {
                if (axVar.mo56113h()) {
                    C9418h hVar = (C9418h) axVar.mo56107c();
                    C61818k kVar2 = (C61818k) jVar.instance;
                    if ((kVar2.f167001a & 2048) != 0) {
                        C9418h hVar2 = kVar2.f167012l;
                        if (hVar2 == null) {
                            hVar2 = C9418h.f32714k;
                        }
                        C9417g gVar = (C9417g) hVar2.toBuilder();
                        gVar.mergeFrom(hVar);
                        jVar.copyOnWrite();
                        C61818k kVar3 = (C61818k) jVar.instance;
                        C9418h hVar3 = (C9418h) gVar.build();
                        hVar3.getClass();
                        kVar3.f167012l = hVar3;
                        kVar3.f167001a |= 2048;
                    } else {
                        jVar.copyOnWrite();
                        C61818k kVar4 = (C61818k) jVar.instance;
                        hVar.getClass();
                        kVar4.f167012l = hVar;
                        kVar4.f167001a |= 2048;
                    }
                }
            }
            C51188c cVar = (C51188c) dVar.toBuilder();
            C54188e eVar2 = dVar.f133251c;
            if (eVar2 == null) {
                eVar2 = C54188e.f142203f;
            }
            C54185b bVar = (C54185b) eVar2.toBuilder();
            bVar.copyOnWrite();
            C54188e eVar3 = (C54188e) bVar.instance;
            C61818k kVar5 = (C61818k) jVar.build();
            kVar5.getClass();
            eVar3.f142207c = kVar5;
            eVar3.f142205a |= 2;
            cVar.copyOnWrite();
            C51189d dVar2 = (C51189d) cVar.instance;
            C54188e eVar4 = (C54188e) bVar.build();
            eVar4.getClass();
            dVar2.f133251c = eVar4;
            dVar2.f133249a |= 2;
            dVar = (C51189d) cVar.build();
        }
        return C60856cj.m92900i(dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f286291a.mo60297gq(), this.f286292c.mo60297gq());
    }
}
