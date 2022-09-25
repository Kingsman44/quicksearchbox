package com.google.android.apps.search.googleapp.discover.channels;

import android.content.Intent;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45963aa;
import com.google.apps.tiktok.nav.C47492c;
import com.google.p4017at.p4027c.p4028a.p4029a.C53842b;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57060ab;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57251bf;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57252bg;

/* renamed from: com.google.android.apps.search.googleapp.discover.channels.am */
/* compiled from: PG */
public final class C134124am {

    /* renamed from: a */
    private final AccountId f365362a;

    /* renamed from: b */
    private final C47492c f365363b;

    public C134124am(AccountId accountId, C47492c cVar) {
        this.f365362a = accountId;
        this.f365363b = cVar;
    }

    /* renamed from: a */
    public final Intent mo111575a(C57060ab abVar) {
        C53842b bVar;
        C134175g gVar = (C134175g) C134176h.f365490e.createBuilder();
        if (abVar.f152321b == 3) {
            bVar = (C53842b) abVar.f152322c;
        } else {
            bVar = C53842b.f141313k;
        }
        gVar.copyOnWrite();
        C134176h hVar = (C134176h) gVar.instance;
        bVar.getClass();
        hVar.f365493b = bVar;
        hVar.f365492a |= 1;
        C57251bf bfVar = (C57251bf) C57252bg.f152831d.createBuilder();
        int i = abVar.f152325f;
        bfVar.copyOnWrite();
        C57252bg bgVar = (C57252bg) bfVar.instance;
        bgVar.f152833a |= 1;
        bgVar.f152834b = i;
        bfVar.copyOnWrite();
        C57252bg bgVar2 = (C57252bg) bfVar.instance;
        bgVar2.f152833a |= 2;
        bgVar2.f152835c = -1;
        gVar.copyOnWrite();
        C134176h hVar2 = (C134176h) gVar.instance;
        C57252bg bgVar3 = (C57252bg) bfVar.build();
        bgVar3.getClass();
        hVar2.f365494c = bgVar3;
        hVar2.f365492a |= 2;
        if (!abVar.f152326g.isEmpty()) {
            String str = abVar.f152326g;
            gVar.copyOnWrite();
            C134176h hVar3 = (C134176h) gVar.instance;
            str.getClass();
            hVar3.f365492a |= 4;
            hVar3.f365495d = str;
        }
        Intent a = this.f365363b.mo51344a(gVar.build());
        C45963aa.m82131a(a, this.f365362a);
        return a;
    }
}
