package com.google.android.libraries.p10923ac.p10925b.p10934e;

import com.google.android.libraries.p10923ac.p10925b.p10944k.C147143c;
import com.google.android.libraries.p10923ac.p10925b.p10945l.C147177k;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147256m;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147264u;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4895aw.p4902b.C64006bp;
import com.google.protos.p4895aw.p4902b.C64098p;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.ac.b.e.ca */
/* compiled from: PG */
public final class C146925ca extends C68247h {

    /* renamed from: a */
    private final C69464a f396628a;

    /* renamed from: c */
    private final C68283d f396629c;

    /* renamed from: d */
    private final C68283d f396630d;

    /* renamed from: e */
    private final C68283d f396631e;

    /* renamed from: f */
    private final C68283d f396632f;

    /* renamed from: g */
    private final C68283d f396633g;

    /* renamed from: h */
    private final C68283d f396634h;

    /* renamed from: i */
    private final C68283d f396635i;

    /* renamed from: j */
    private final C68283d f396636j;

    public C146925ca(C69464a aVar, C69464a aVar2, C69464a aVar3, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5, C68283d dVar6, C68283d dVar7, C68283d dVar8) {
        super(aVar2, new C68277d(C146925ca.class), aVar);
        this.f396628a = aVar3;
        this.f396629c = C68236af.m98549d(dVar);
        this.f396630d = C68236af.m98549d(dVar2);
        this.f396631e = C68236af.m98549d(dVar3);
        this.f396632f = C68236af.m98549d(dVar4);
        this.f396633g = C68236af.m98549d(dVar5);
        this.f396634h = C68236af.m98549d(dVar6);
        this.f396635i = C68236af.m98549d(dVar7);
        this.f396636j = C68236af.m98549d(dVar8);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C68214a a = C68219e.m98518a(this.f396628a);
        C64098p pVar = (C64098p) list.get(0);
        C64006bp bpVar = (C64006bp) list.get(1);
        C146856az azVar = (C146856az) list.get(2);
        Long l = (Long) list.get(3);
        Long l2 = (Long) list.get(4);
        Integer num = (Integer) list.get(5);
        C147264u uVar = (C147264u) list.get(6);
        try {
            C146915br.m239473b(a, pVar, bpVar, azVar, l, l2, num, (C147177k) list.get(7));
            return C60866ct.f164955a;
        } catch (C147143c e) {
            ((C147256m) a.mo27525b()).mo124065h("Delta exception thrown when delta wasn't requested!", new Object[0]);
            throw new AssertionError(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f396629c.mo60297gq(), this.f396630d.mo60297gq(), this.f396631e.mo60297gq(), this.f396632f.mo60297gq(), this.f396633g.mo60297gq(), this.f396634h.mo60297gq(), this.f396635i.mo60297gq(), this.f396636j.mo60297gq());
    }
}
