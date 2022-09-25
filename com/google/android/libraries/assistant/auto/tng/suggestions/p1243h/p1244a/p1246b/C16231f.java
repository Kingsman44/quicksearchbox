package com.google.android.libraries.assistant.auto.tng.suggestions.p1243h.p1244a.p1246b;

import com.evernote.android.state.BuildConfig;
import com.google.assistant.p3897e.p3917i.p3918a.C51334dw;
import com.google.assistant.p3897e.p3917i.p3918a.C51450id;
import com.google.assistant.p3897e.p3921j.C51715bm;
import com.google.assistant.p3897e.p3921j.C52405qn;
import com.google.assistant.p3994s.p3995a.C53268hp;
import com.google.assistant.p3994s.p3995a.C53270hr;
import com.google.assistant.p3994s.p3995a.C53271hs;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4017at.p4060h.p4068b.p4069a.C54185b;
import com.google.p4017at.p4060h.p4068b.p4069a.C54188e;
import com.google.p4449cd.C57940c;
import dagger.p5295b.C68282c;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.h.a.b.f */
/* compiled from: PG */
public final class C16231f extends C68247h {

    /* renamed from: a */
    private final C68283d f47816a;

    /* renamed from: c */
    private final C68283d f47817c;

    /* renamed from: d */
    private final C68283d f47818d;

    /* renamed from: e */
    private final C68283d f47819e;

    /* renamed from: f */
    private final C68283d f47820f;

    /* renamed from: g */
    private final C68283d f47821g;

    /* renamed from: h */
    private final C68283d f47822h;

    public C16231f(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5, C68283d dVar6, C68283d dVar7) {
        super(aVar2, new C68277d(C16231f.class), aVar);
        this.f47816a = C68236af.m98549d(dVar);
        this.f47817c = C68236af.m98549d(dVar2);
        this.f47818d = C68236af.m98549d(dVar3);
        this.f47819e = C68236af.m98549d(dVar4);
        this.f47820f = C68236af.m98549d(dVar5);
        this.f47821g = C68236af.m98549d(dVar6);
        this.f47822h = C68236af.m98549d(dVar7);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C51334dw dwVar = (C51334dw) list.get(0);
        C51715bm bmVar = (C51715bm) list.get(1);
        C51450id idVar = (C51450id) list.get(2);
        C53306j jVar = (C53306j) list.get(3);
        C68282c cVar = (C68282c) list.get(4);
        C53270hr hrVar = (C53270hr) list.get(5);
        String str = (String) list.get(6);
        C53268hp hpVar = (C53268hp) C53271hs.f139650u.createBuilder();
        C52405qn qnVar = dwVar.f133694h;
        if (qnVar == null) {
            qnVar = C52405qn.f137519c;
        }
        String str2 = qnVar.f137522b;
        hpVar.copyOnWrite();
        C53271hs hsVar = (C53271hs) hpVar.instance;
        str2.getClass();
        hsVar.f139652a = 1 | hsVar.f139652a;
        hsVar.f139653b = str2;
        C54185b bVar = (C54185b) C54188e.f142203f.createBuilder();
        bVar.mo54074c("User-Agent", str);
        bVar.mo54074c("X-Geo", (String) C57940c.m88578e(cVar, BuildConfig.FLAVOR));
        C54188e eVar = (C54188e) bVar.build();
        hpVar.copyOnWrite();
        C53271hs hsVar2 = (C53271hs) hpVar.instance;
        eVar.getClass();
        hsVar2.f139654c = eVar;
        hsVar2.f139652a |= 2;
        hpVar.copyOnWrite();
        C53271hs hsVar3 = (C53271hs) hpVar.instance;
        hsVar3.f139663l = jVar.f139793X;
        hsVar3.f139652a |= 512;
        hpVar.copyOnWrite();
        C53271hs hsVar4 = (C53271hs) hpVar.instance;
        dwVar.getClass();
        hsVar4.f139655d = dwVar;
        hsVar4.f139652a |= 4;
        hpVar.copyOnWrite();
        C53271hs hsVar5 = (C53271hs) hpVar.instance;
        bmVar.getClass();
        hsVar5.f139656e = bmVar;
        hsVar5.f139652a |= 8;
        hpVar.copyOnWrite();
        C53271hs hsVar6 = (C53271hs) hpVar.instance;
        idVar.getClass();
        hsVar6.f139657f = idVar;
        hsVar6.f139652a |= 16;
        hpVar.copyOnWrite();
        C53271hs hsVar7 = (C53271hs) hpVar.instance;
        hsVar7.f139665n = hrVar.f139649g;
        hsVar7.f139652a |= 2048;
        return C60856cj.m92900i((C53271hs) hpVar.build());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f47816a.mo60297gq(), this.f47817c.mo60297gq(), this.f47818d.mo60297gq(), this.f47819e.mo60297gq(), C68236af.m98546a(this.f47820f.mo60297gq()), this.f47821g.mo60297gq(), this.f47822h.mo60297gq());
    }
}
