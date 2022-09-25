package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p727a.p731d.p732a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p727a.C11989b;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p727a.p728a.C11988c;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p727a.p729b.C11996g;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p727a.p731d.C12014d;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p727a.p731d.C12020j;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p727a.p731d.C12021k;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p727a.p731d.C12022l;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p727a.p731d.C12023m;
import com.google.android.libraries.search.p2904c.C37415bt;
import com.google.android.libraries.search.p2904c.C37416bu;
import com.google.android.libraries.search.p2904c.C37516dw;
import com.google.android.libraries.search.p2904c.C37519dz;
import com.google.android.libraries.search.p2904c.C37560ea;
import com.google.android.libraries.search.p2904c.C37561eb;
import com.google.android.libraries.search.p2904c.C37563ed;
import com.google.android.libraries.search.p2904c.C37675hv;
import com.google.android.libraries.search.p2904c.C37676hw;
import com.google.android.libraries.search.p2904c.p2962q.C37946a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60888db;
import com.google.p4449cd.p4456g.C57981b;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.a.a.d.a.c */
/* compiled from: PG */
public final class C12008c extends C12014d {

    /* renamed from: a */
    public static final C59071e f38534a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.c.a.a.d.a.c");

    /* renamed from: b */
    public final C11988c f38535b;

    /* renamed from: c */
    public final C11996g f38536c;

    /* renamed from: d */
    public final Optional f38537d;

    /* renamed from: e */
    private final Set f38538e;

    /* renamed from: f */
    private final C60888db f38539f;

    /* renamed from: g */
    private final C69464a f38540g;

    public C12008c(C69464a aVar, Optional optional, C11996g gVar, C11988c cVar, Set set, C60888db dbVar) {
        this.f38540g = aVar;
        this.f38537d = optional;
        this.f38536c = gVar;
        this.f38535b = cVar;
        this.f38538e = set;
        this.f38539f = dbVar;
    }

    /* renamed from: e */
    private final void m27891e() {
        for (C37946a a : this.f38538e) {
            a.mo41162a();
        }
    }

    /* renamed from: b */
    public final void mo20363b(C11989b bVar, C70862aj ajVar) {
        C59071e eVar = f38534a;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(43965)).mo56386p("#getConcurrentListening");
        Optional a = this.f38536c.mo20360a(bVar);
        if (a.isEmpty()) {
            ((C59052c) ((C59052c) eVar.mo56226d()).mo56372aa(43966)).mo56389s("No Source<Audio> stored for key %s.", bVar);
            C12022l lVar = (C12022l) C12023m.f38551c.createBuilder();
            C37415bt btVar = (C37415bt) C37416bu.f99347c.createBuilder();
            C37560ea eaVar = (C37560ea) C37561eb.f99800c.createBuilder();
            C37519dz dzVar = C37519dz.FAILED_OPENING_NO_AUDIO_STREAM_IN_STORE;
            eaVar.copyOnWrite();
            C37561eb ebVar = (C37561eb) eaVar.instance;
            ebVar.f99803b = Integer.valueOf(dzVar.f99687U);
            ebVar.f99802a = 2;
            btVar.copyOnWrite();
            C37416bu buVar = (C37416bu) btVar.instance;
            C37561eb ebVar2 = (C37561eb) eaVar.build();
            ebVar2.getClass();
            buVar.f99350b = ebVar2;
            buVar.f99349a |= 1;
            lVar.copyOnWrite();
            C12023m mVar = (C12023m) lVar.instance;
            C37416bu buVar2 = (C37416bu) btVar.build();
            buVar2.getClass();
            mVar.f38554b = buVar2;
            mVar.f38553a = 1;
            ajVar.mo20123c((C12023m) lVar.build());
            ajVar.mo20121a();
            return;
        }
        C12022l lVar2 = (C12022l) C12023m.f38551c.createBuilder();
        C37415bt btVar2 = (C37415bt) C37416bu.f99347c.createBuilder();
        C37560ea eaVar2 = (C37560ea) C37561eb.f99800c.createBuilder();
        C37563ed edVar = C37563ed.OPENED_SEAMLESSLY;
        eaVar2.copyOnWrite();
        C37561eb ebVar3 = (C37561eb) eaVar2.instance;
        ebVar3.f99803b = Integer.valueOf(edVar.f99809d);
        ebVar3.f99802a = 1;
        btVar2.copyOnWrite();
        C37416bu buVar3 = (C37416bu) btVar2.instance;
        C37561eb ebVar4 = (C37561eb) eaVar2.build();
        ebVar4.getClass();
        buVar3.f99350b = ebVar4;
        buVar3.f99349a |= 1;
        lVar2.copyOnWrite();
        C12023m mVar2 = (C12023m) lVar2.instance;
        C37416bu buVar4 = (C37416bu) btVar2.build();
        buVar4.getClass();
        mVar2.f38554b = buVar4;
        mVar2.f38553a = 1;
        ajVar.mo20123c((C12023m) lVar2.build());
        ((C57981b) a.get()).mo20440jJ(new C12007b(ajVar));
        C37675hv hvVar = (C37675hv) C37676hw.f100061e.createBuilder();
        hvVar.copyOnWrite();
        C37676hw hwVar = (C37676hw) hvVar.instance;
        hwVar.f100066d = 1;
        hwVar.f100063a |= 1;
        C37563ed edVar2 = C37563ed.OPENED_SEAMLESSLY;
        hvVar.copyOnWrite();
        C37676hw hwVar2 = (C37676hw) hvVar.instance;
        hwVar2.f100065c = Integer.valueOf(edVar2.f99809d);
        hwVar2.f100064b = 2;
        C37676hw hwVar3 = (C37676hw) hvVar.build();
        m27891e();
        C46459k.m82829b(C60856cj.m92902k(C47810es.m84965e(new C12006a(this, bVar)), ((Long) this.f38540g.mo17428b()).longValue(), TimeUnit.SECONDS, this.f38539f), "Failed to set timeout for audio source.", new Object[0]);
    }

    /* renamed from: c */
    public final void mo20364c(C11989b bVar, C70862aj ajVar) {
        C59071e eVar = f38534a;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(43967)).mo56386p("#notifyConcurrentListeningStopped");
        if (this.f38536c.mo20360a(bVar).isEmpty()) {
            ((C59052c) ((C59052c) eVar.mo56226d()).mo56372aa(43968)).mo56389s("No Source<Audio> stored for key %s.", bVar);
            C12020j jVar = (C12020j) C12021k.f38547c.createBuilder();
            jVar.copyOnWrite();
            C12021k kVar = (C12021k) jVar.instance;
            kVar.f38550b = 2;
            kVar.f38549a |= 1;
            ajVar.mo20123c((C12021k) jVar.build());
        } else {
            C12020j jVar2 = (C12020j) C12021k.f38547c.createBuilder();
            jVar2.copyOnWrite();
            C12021k kVar2 = (C12021k) jVar2.instance;
            kVar2.f38550b = 1;
            kVar2.f38549a |= 1;
            ajVar.mo20123c((C12021k) jVar2.build());
            mo20365d();
        }
        ajVar.mo20121a();
    }

    /* renamed from: d */
    public final void mo20365d() {
        C37675hv hvVar = (C37675hv) C37676hw.f100061e.createBuilder();
        hvVar.copyOnWrite();
        C37676hw hwVar = (C37676hw) hvVar.instance;
        hwVar.f100066d = 1;
        hwVar.f100063a = 1 | hwVar.f100063a;
        C37516dw dwVar = C37516dw.CLOSED;
        hvVar.copyOnWrite();
        C37676hw hwVar2 = (C37676hw) hvVar.instance;
        hwVar2.f100065c = Integer.valueOf(dwVar.f99638d);
        hwVar2.f100064b = 3;
        C37676hw hwVar3 = (C37676hw) hvVar.build();
        m27891e();
    }
}
