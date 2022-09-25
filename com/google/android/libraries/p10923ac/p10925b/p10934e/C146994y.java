package com.google.android.libraries.p10923ac.p10925b.p10934e;

import com.google.android.libraries.p10923ac.p10925b.p10944k.C147134ai;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147256m;
import com.google.common.p4552o.p4566l.C60178cp;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4895aw.p4902b.C63978ao;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.ac.b.e.y */
/* compiled from: PG */
public final class C146994y extends C68247h {

    /* renamed from: a */
    private final C68283d f396893a;

    /* renamed from: c */
    private final C68283d f396894c;

    /* renamed from: d */
    private final C68283d f396895d;

    /* renamed from: e */
    private final C68283d f396896e;

    /* renamed from: f */
    private final C68283d f396897f;

    /* renamed from: g */
    private final C68283d f396898g;

    /* renamed from: h */
    private final C69464a f396899h;

    public C146994y(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5, C68283d dVar6, C69464a aVar3) {
        super(aVar2, new C68277d(C146994y.class), aVar);
        this.f396893a = C68236af.m98549d(dVar);
        this.f396894c = C68236af.m98549d(dVar2);
        this.f396895d = C68236af.m98549d(dVar3);
        this.f396896e = C68236af.m98549d(dVar4);
        this.f396897f = C68236af.m98549d(dVar5);
        this.f396898g = C68236af.m98549d(dVar6);
        this.f396899h = aVar3;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        boolean booleanValue = ((Boolean) list.get(0)).booleanValue();
        boolean booleanValue2 = ((Boolean) list.get(1)).booleanValue();
        C63978ao aoVar = (C63978ao) list.get(2);
        C68283d dVar = this.f396896e;
        C68283d dVar2 = this.f396897f;
        C68283d dVar3 = this.f396898g;
        C68214a a = C68219e.m98518a(this.f396899h);
        if (booleanValue || booleanValue2) {
            C63978ao aoVar2 = C63978ao.UNKNOWN;
            int ordinal = aoVar.ordinal();
            if (ordinal == 1) {
                return dVar2.mo60297gq();
            }
            if (ordinal == 2) {
                return dVar.mo60297gq();
            }
            if (ordinal == 3) {
                return dVar3.mo60297gq();
            }
            throw new C147134ai("Not syncing unsupported protocol ".concat(String.valueOf(String.valueOf(aoVar))), 1);
        }
        ((C147256m) a.mo27525b()).mo124060c("Sync called with both upload and download disabled.", new Object[0]);
        return C60856cj.m92900i(C60178cp.f162787o);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f396893a.mo60297gq(), this.f396894c.mo60297gq(), this.f396895d.mo60297gq());
    }
}
