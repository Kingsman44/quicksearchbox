package com.google.android.apps.search.googleapp.discover.channels;

import android.support.p031v4.app.C0154a;
import com.google.android.apps.search.googleapp.p10516t.p10519c.C139694a;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28353e;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import com.google.android.libraries.search.p2476a.p2477a.C32158h;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45985aw;
import com.google.apps.tiktok.account.api.controller.C45986ax;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.account.api.controller.C45989b;
import com.google.apps.tiktok.account.p3603a.C45954d;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.nav.C47490a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C60442qe;
import com.google.common.p4552o.C60443qf;
import com.google.p4017at.p4027c.p4028a.p4029a.C53842b;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57252bg;
import com.google.protobuf.C62940bt;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.search.googleapp.discover.channels.i */
/* compiled from: PG */
public final class C134177i implements C45987ay {

    /* renamed from: d */
    private static final C59071e f365497d = C59071e.m91332i("com.google.android.apps.search.googleapp.discover.channels.i");

    /* renamed from: a */
    public final ChannelActivity f365498a;

    /* renamed from: b */
    public final C134176h f365499b;

    /* renamed from: c */
    public final C139694a f365500c;

    /* renamed from: e */
    private final C28306ab f365501e;

    public C134177i(ChannelActivity channelActivity, C47490a aVar, C45989b bVar, C32158h hVar, C28306ab abVar, C139694a aVar2) {
        this.f365498a = channelActivity;
        this.f365499b = (C134176h) aVar.mo51343a(C134176h.f365490e);
        this.f365501e = abVar;
        this.f365500c = aVar2;
        hVar.mo37971b(channelActivity, this, bVar);
    }

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        if (this.f365499b == null) {
            ((C59052c) ((C59052c) f365497d.mo56225c()).mo56372aa(40307)).mo56386p("Attempting to open the activity without using ChannelIntents.");
            this.f365498a.finish();
            return;
        }
        C134187s sVar = (C134187s) C134188t.f365526e.createBuilder();
        C53842b bVar = this.f365499b.f365493b;
        if (bVar == null) {
            bVar = C53842b.f141313k;
        }
        sVar.copyOnWrite();
        C134188t tVar = (C134188t) sVar.instance;
        bVar.getClass();
        tVar.f365529b = bVar;
        tVar.f365528a |= 1;
        C57252bg bgVar = this.f365499b.f365494c;
        if (bgVar == null) {
            bgVar = C57252bg.f152831d;
        }
        sVar.copyOnWrite();
        C134188t tVar2 = (C134188t) sVar.instance;
        bgVar.getClass();
        tVar2.f365530c = bgVar;
        tVar2.f365528a |= 2;
        if (!this.f365499b.f365495d.isEmpty()) {
            String str = this.f365499b.f365495d;
            sVar.copyOnWrite();
            C134188t tVar3 = (C134188t) sVar.instance;
            str.getClass();
            tVar3.f365528a |= 4;
            tVar3.f365531d = str;
        }
        C0154a aVar = new C0154a(this.f365498a.f727a.f739a.f744e);
        AccountId accountId = awVar.f120815a.f120816a;
        C134186r rVar = new C134186r();
        C68324h.m98669f(rVar);
        C47247a.m84047b(rVar, accountId);
        C47243l.m84039a(rVar, (C134188t) sVar.build());
        aVar.mo689v(16908290, rVar, (String) null);
        aVar.mo509f();
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) f365497d.mo56225c()).mo56382g(th)).mo56372aa(40308)).mo56386p("Failed to open channel details page.");
        this.f365498a.finish();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo19984c() {
    }

    /* renamed from: d */
    public final void mo19985d(C45986ax axVar) {
        if (this.f365499b == null) {
            ((C59052c) ((C59052c) f365497d.mo56225c()).mo56372aa(40309)).mo56386p("Attempting to open the activity without using ChannelIntents.");
            this.f365498a.finish();
            return;
        }
        C28306ab abVar = this.f365501e;
        ChannelActivity channelActivity = this.f365498a;
        C28313c a = abVar.f76990a.mo33805a(C28427h.m53115a(125147));
        a.mo33861i(C28439i.f77216b);
        a.mo33859g(C28375ak.m53061c(125299));
        a.mo33859g(C45954d.m82060a(axVar.f120816a));
        C53842b bVar = this.f365499b.f365493b;
        if (bVar == null) {
            bVar = C53842b.f141313k;
        }
        C57252bg bgVar = this.f365499b.f365494c;
        if (bgVar == null) {
            bgVar = C57252bg.f152831d;
        }
        int i = bgVar.f152834b;
        C62940bt btVar = C134157bs.f365455a;
        C60442qe qeVar = (C60442qe) C60443qf.f163571d.createBuilder();
        String str = bVar.f141317c;
        qeVar.copyOnWrite();
        C60443qf qfVar = (C60443qf) qeVar.instance;
        str.getClass();
        qfVar.f163573a |= 1;
        qfVar.f163574b = str;
        qeVar.copyOnWrite();
        C60443qf qfVar2 = (C60443qf) qeVar.instance;
        qfVar2.f163573a |= 2;
        qfVar2.f163575c = i;
        a.mo33858f(new C28353e(btVar, (C60443qf) qeVar.build()));
        int i2 = C28485y.f77298f;
        abVar.mo33801b(channelActivity.mo1322k().mo1177e(16908290), a);
    }
}
