package com.google.android.apps.search.googleapp.p10539y.p10540a;

import android.support.p031v4.app.Fragment;
import androidx.activity.result.C0816c;
import androidx.activity.result.p046a.C0809b;
import androidx.lifecycle.C2368bp;
import androidx.p104d.p105a.C2169h;
import com.google.android.apps.search.googleapp.collections.C133513k;
import com.google.android.apps.search.googleapp.collections.C133514l;
import com.google.android.apps.search.googleapp.p10527u.C139760a;
import com.google.android.apps.search.googleapp.p10527u.C139765f;
import com.google.android.apps.search.googleapp.p10527u.C139767h;
import com.google.android.apps.search.googleapp.p10527u.C139769j;
import com.google.android.apps.search.googleapp.p10527u.C139770k;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.android.apps.search.googleapp.saves.p10387a.C137188d;
import com.google.android.libraries.silk.p3205a.p3219h.C41722a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4303h.C56696b;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4303h.C56698d;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4303h.C56700f;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4303h.C56704j;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4303h.C56708n;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57566aj;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57578av;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.googleapp.y.a.e */
/* compiled from: PG */
public final class C139887e implements C41722a {

    /* renamed from: a */
    public final AccountId f380289a;

    /* renamed from: b */
    private final Fragment f380290b;

    /* renamed from: c */
    private final C137188d f380291c;

    /* renamed from: d */
    private final C139892j f380292d;

    /* renamed from: e */
    private final C0809b f380293e;

    /* renamed from: f */
    private final C0816c f380294f;

    public C139887e(Fragment fragment, AccountId accountId, C137188d dVar) {
        C139886d dVar2 = new C139886d(this);
        this.f380293e = dVar2;
        this.f380290b = fragment;
        this.f380289a = accountId;
        this.f380291c = dVar;
        C139892j jVar = (C139892j) new C2368bp(fragment).mo5770a(C139892j.class);
        this.f380292d = jVar;
        Objects.requireNonNull(jVar);
        this.f380294f = fragment.registerForActivityResult(dVar2, new C139885c(jVar));
    }

    /* renamed from: a */
    public final C60870cx mo44321a(C56696b bVar) {
        C139765f fVar = (C139765f) C139767h.f379869k.createBuilder();
        C139779t tVar = C139779t.COLLECTIONS;
        fVar.copyOnWrite();
        C139767h hVar = (C139767h) fVar.instance;
        hVar.f379872b = tVar.f379907i;
        hVar.f379871a |= 1;
        fVar.copyOnWrite();
        C139767h hVar2 = (C139767h) fVar.instance;
        hVar2.f379871a |= 2;
        hVar2.f379873c = true;
        C139769j jVar = (C139769j) C139770k.f379882c.createBuilder();
        C133513k kVar = (C133513k) C133514l.f363786c.createBuilder();
        C57566aj ajVar = bVar.f151334a;
        if (ajVar == null) {
            ajVar = C57566aj.f153791e;
        }
        String b = C139883a.m227490b(ajVar);
        kVar.copyOnWrite();
        C133514l lVar = (C133514l) kVar.instance;
        lVar.f363788a = 1 | lVar.f363788a;
        lVar.f363789b = b;
        C133514l lVar2 = (C133514l) kVar.build();
        jVar.copyOnWrite();
        C139770k kVar2 = (C139770k) jVar.instance;
        lVar2.getClass();
        kVar2.f379885b = lVar2;
        kVar2.f379884a = 3;
        fVar.copyOnWrite();
        C139767h hVar3 = (C139767h) fVar.instance;
        C139770k kVar3 = (C139770k) jVar.build();
        kVar3.getClass();
        hVar3.f379877g = kVar3;
        hVar3.f379871a |= 16;
        C47393f.m84236g(new C139760a((C139767h) fVar.build()), this.f380290b);
        return C60856cj.m92900i(C56698d.f151338a);
    }

    /* renamed from: b */
    public final C60870cx mo44322b(C56700f fVar) {
        return C2169h.m6027a(new C139890h(this.f380292d, this.f380294f, fVar));
    }

    /* renamed from: c */
    public final C60870cx mo44323c(C56704j jVar) {
        C137188d dVar = this.f380291c;
        C57578av avVar = jVar.f151355a;
        if (avVar == null) {
            avVar = C57578av.f153822h;
        }
        return C47633f.m84733g(dVar.mo113591b(avVar)).mo51515h(C139884b.f380286a, C60826bg.f164896a);
    }

    /* renamed from: d */
    public final C60870cx mo44324d(C56708n nVar) {
        return C2169h.m6027a(new C139889g(this.f380292d, this.f380294f, nVar));
    }
}
