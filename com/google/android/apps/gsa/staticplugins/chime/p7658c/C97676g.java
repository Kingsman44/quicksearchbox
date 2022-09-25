package com.google.android.apps.gsa.staticplugins.chime.p7658c;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e;
import com.google.android.apps.gsa.sidekick.shared.p7242k.C91753a;
import com.google.android.apps.gsa.sidekick.shared.util.C91969at;
import com.google.android.apps.p489g.p494d.C9177bm;
import com.google.android.apps.p489g.p494d.C9178bn;
import com.google.android.apps.search.xblend.p10707b.C142270b;
import com.google.android.apps.search.xblend.p10708c.C142271a;
import com.google.android.apps.search.xblend.p10708c.C142272b;
import com.google.android.libraries.notifications.data.C29827r;
import com.google.apps.tiktok.account.AccountId;
import com.google.p375ai.p378b.C7566bt;
import com.google.p4283bv.p4287b.p4342b.C56941e;
import com.google.p4283bv.p4287b.p4342b.C56942f;
import com.google.p4283bv.p4287b.p4342b.C56943g;
import com.google.p4283bv.p4345d.p4350b.p4351a.C56975k;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.gsa.staticplugins.chime.c.g */
/* compiled from: PG */
public final class C97676g implements C97671b {

    /* renamed from: a */
    private final Context f272769a;

    /* renamed from: b */
    private final C84474e f272770b;

    /* renamed from: c */
    private final C86034c f272771c;

    public C97676g(Context context, C84474e eVar, C86034c cVar) {
        this.f272769a = context;
        this.f272770b = eVar;
        this.f272771c = cVar;
    }

    /* renamed from: a */
    public final Intent mo90789a(C29827r rVar, C56975k kVar) {
        C7566bt btVar;
        Intent intent;
        if (this.f272770b.mo78079X()) {
            try {
                Context context = this.f272769a;
                C142271a aVar = (C142271a) C142272b.f385977e.createBuilder();
                C56942f fVar = (C56942f) C56943g.f151982f.createBuilder();
                fVar.copyOnWrite();
                C56943g gVar = (C56943g) fVar.instance;
                gVar.f151984a |= 1;
                gVar.f151985b = "https://autopush-searchnotifications-pa.sandbox.googleapis.com/v1/getnotificationsettings";
                C56941e eVar = C56941e.PLATFORM_BOQ;
                fVar.copyOnWrite();
                C56943g gVar2 = (C56943g) fVar.instance;
                gVar2.f151987d = eVar.f151981e;
                gVar2.f151984a |= 4;
                C56943g gVar3 = (C56943g) fVar.build();
                aVar.copyOnWrite();
                C142272b bVar = (C142272b) aVar.instance;
                gVar3.getClass();
                bVar.f385980b = gVar3;
                bVar.f385979a |= 1;
                aVar.copyOnWrite();
                C142272b bVar2 = (C142272b) aVar.instance;
                bVar2.f385979a |= 4;
                bVar2.f385982d = true;
                aVar.copyOnWrite();
                C142272b bVar3 = (C142272b) aVar.instance;
                bVar3.f385979a |= 2;
                bVar3.f385981c = true;
                intent = C142270b.m230999a(context, (AccountId) this.f272771c.mo79697b().get(), (C142272b) aVar.build());
            } catch (InterruptedException | ExecutionException unused) {
                intent = null;
            }
            if (intent != null) {
                return intent;
            }
        }
        C9177bm bmVar = (C9177bm) C9178bn.f31697c.createBuilder();
        if (kVar.f152093b == 8) {
            btVar = (C7566bt) kVar.f152094c;
        } else {
            btVar = C7566bt.f26167a;
        }
        String a = C91969at.m150924a(btVar, this.f272769a);
        if (a != null) {
            bmVar.copyOnWrite();
            C9178bn bnVar = (C9178bn) bmVar.instance;
            bnVar.f31699a = 1 | bnVar.f31699a;
            bnVar.f31700b = a;
        }
        return C91753a.m150311a((C9178bn) bmVar.build(), this.f272769a);
    }
}
