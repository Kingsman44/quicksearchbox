package com.google.android.libraries.lens.ondevice.p2024d;

import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.lens.p4701g.C62323cs;
import com.google.lens.p4701g.C62324ct;
import com.google.lens.p4701g.C62333db;
import com.google.lens.p4705i.p4706a.C62377h;
import com.google.lens.p4705i.p4706a.C62383n;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.lens.ondevice.d.dd */
/* compiled from: PG */
public final class C24378dd extends C68247h {

    /* renamed from: a */
    private final C68283d f66768a;

    /* renamed from: c */
    private final C68283d f66769c;

    /* renamed from: d */
    private final C68283d f66770d;

    /* renamed from: e */
    private final C68283d f66771e;

    public C24378dd(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C24378dd.class), aVar);
        this.f66768a = C68236af.m98549d(dVar);
        this.f66769c = C68236af.m98549d(dVar2);
        this.f66770d = C68236af.m98549d(dVar3);
        this.f66771e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        int a;
        List list = (List) obj;
        C62333db dbVar = (C62333db) list.get(1);
        C62324ct ctVar = (C62324ct) list.get(2);
        C68283d dVar = this.f66771e;
        ((C58970a) ((C58970a) C24373cz.f66760a.mo56224b()).mo56372aa(48766)).mo56386p("Executing: maybeRunRaidClassifier");
        if (((C62383n) list.get(0)).f168408d) {
            ((C58970a) ((C58970a) C24373cz.f66760a.mo56224b()).mo56372aa(48769)).mo56386p("maybeRunRaidClassifier: url shopping domain");
            return dVar.mo60297gq();
        }
        if (C24375da.m45433b(dbVar)) {
            ((C58970a) ((C58970a) C24373cz.f66760a.mo56224b()).mo56372aa(48767)).mo56386p("maybeRunRaidClassifier: not url shopping domain and 'shoppable image or bypassed'");
            if (!ctVar.f168240b || ((a = C62323cs.m94766a(ctVar.f168241c)) != 0 && a == 2)) {
                ((C58970a) ((C58970a) C24373cz.f66760a.mo56224b()).mo56372aa(48768)).mo56386p("maybeRunRaidClassifier: not url shopping domain and 'not sensitive image or bypassed'");
                return dVar.mo60297gq();
            }
        }
        return C60856cj.m92900i(C62377h.f168391c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f66768a.mo60297gq(), this.f66769c.mo60297gq(), this.f66770d.mo60297gq());
    }
}
