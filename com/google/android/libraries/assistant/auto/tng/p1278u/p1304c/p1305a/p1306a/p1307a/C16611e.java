package com.google.android.libraries.assistant.auto.tng.p1278u.p1304c.p1305a.p1306a.p1307a;

import com.google.android.libraries.assistant.auto.tng.p1278u.p1281b.p1282a.C16462a;
import com.google.android.libraries.assistant.auto.tng.p1278u.p1281b.p1303b.C16603a;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.C57954d;
import com.google.speech.p5208h.C66606cd;
import com.google.speech.p5208h.C66607ce;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.Set;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.u.c.a.a.a.e */
/* compiled from: PG */
public final class C16611e extends C68247h {

    /* renamed from: a */
    private final C68283d f48689a;

    /* renamed from: c */
    private final C68283d f48690c;

    /* renamed from: d */
    private final C68283d f48691d;

    public C16611e(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C16611e.class), aVar);
        this.f48689a = C68236af.m98549d(dVar);
        this.f48690c = C68236af.m98549d(dVar2);
        this.f48691d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        Set<C57954d> set = (Set) list.get(1);
        String str = (String) list.get(2);
        C66606cd a = C16603a.m33662a();
        a.copyOnWrite();
        C66607ce ceVar = (C66607ce) a.instance;
        C66607ce ceVar2 = C66607ce.f181191f;
        str.getClass();
        ceVar.f181193a = 1 | ceVar.f181193a;
        ceVar.f181194b = str;
        for (C16462a a2 : (Set) list.get(0)) {
            a2.mo22927a(a);
        }
        for (C57954d dVar : set) {
            try {
                ((C16462a) C60856cj.m92909r(dVar.f154993a)).mo22927a(a);
            } catch (Exception e) {
                ((C59052c) ((C59052c) ((C59052c) C16609c.f48687a.mo56226d()).mo56382g(e)).mo56372aa(46415)).mo56386p("Non Fatal S3Extension creation failed");
            }
        }
        return C60856cj.m92900i((C66607ce) a.build());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f48689a.mo60297gq(), this.f48690c.mo60297gq(), this.f48691d.mo60297gq());
    }
}
