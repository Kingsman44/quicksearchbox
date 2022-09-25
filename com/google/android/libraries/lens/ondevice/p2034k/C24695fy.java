package com.google.android.libraries.lens.ondevice.p2034k;

import com.google.android.libraries.lens.common.p2000c.C24105b;
import com.google.android.libraries.lens.ondevice.p2032i.C24530h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.lens.p4695b.C62155a;
import com.google.lens.p4695b.C62156b;
import com.google.lens.p4695b.C62157c;
import com.google.lens.p4695b.C62158d;
import com.google.lens.p4701g.C62337df;
import com.google.lens.p4701g.C62339dh;
import com.google.p4017at.p4056g.p4057a.p4058a.C54039ct;
import com.google.p4017at.p4056g.p4057a.p4058a.C54040cu;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.lens.ondevice.k.fy */
/* compiled from: PG */
public final class C24695fy extends C68247h {

    /* renamed from: a */
    private final C68283d f67534a;

    /* renamed from: c */
    private final C68283d f67535c;

    /* renamed from: d */
    private final C68283d f67536d;

    /* renamed from: e */
    private final C68283d f67537e;

    /* renamed from: f */
    private final C68283d f67538f;

    public C24695fy(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5) {
        super(aVar2, new C68277d(C24695fy.class), aVar);
        this.f67534a = C68236af.m98549d(dVar);
        this.f67535c = C68236af.m98549d(dVar2);
        this.f67536d = C68236af.m98549d(dVar3);
        this.f67537e = C68236af.m98549d(dVar4);
        this.f67538f = C68236af.m98549d(dVar5);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C62339dh dhVar = (C62339dh) list.get(0);
        C24530h hVar = (C24530h) list.get(1);
        C24735hk hkVar = (C24735hk) list.get(2);
        C58833ax axVar = (C58833ax) list.get(3);
        C58833ax axVar2 = (C58833ax) list.get(4);
        C24653ej.m45755b(C24692fv.class, hVar);
        if (!axVar.mo56113h()) {
            C24653ej.m45754a(C24692fv.class, hVar);
            return C60856cj.m92899h(new IllegalStateException("LensFeApplicationClient missing"));
        }
        C62156b bVar = (C62156b) C62157c.f167793d.createBuilder();
        String str = (String) hkVar.mo29986a().mo56109e("auto");
        bVar.copyOnWrite();
        C62157c cVar = (C62157c) bVar.instance;
        str.getClass();
        cVar.f167795a |= 1;
        cVar.f167796b = str;
        String str2 = (String) hkVar.mo29987b().mo56109e("en");
        bVar.copyOnWrite();
        C62157c cVar2 = (C62157c) bVar.instance;
        str2.getClass();
        cVar2.f167795a |= 2;
        cVar2.f167797c = str2;
        C62157c cVar3 = (C62157c) bVar.build();
        C54039ct ctVar = (C54039ct) C54040cu.f141789d.createBuilder();
        for (C62337df dfVar : dhVar.f168296a) {
            C62155a aVar = (C62155a) C62158d.f167798e.createBuilder();
            String str3 = dfVar.f168292b;
            aVar.copyOnWrite();
            C62158d dVar = (C62158d) aVar.instance;
            str3.getClass();
            dVar.f167800a |= 1;
            dVar.f167801b = str3;
            String str4 = dfVar.f168293c;
            aVar.copyOnWrite();
            C62158d dVar2 = (C62158d) aVar.instance;
            str4.getClass();
            dVar2.f167800a |= 2;
            dVar2.f167802c = str4;
            aVar.copyOnWrite();
            C62158d dVar3 = (C62158d) aVar.instance;
            cVar3.getClass();
            dVar3.f167803d = cVar3;
            dVar3.f167800a |= 4;
            ctVar.mo54060a((C62158d) aVar.build());
        }
        C60870cx c = ((C24105b) axVar.mo56107c()).mo29500c((C54040cu) ctVar.build());
        C60856cj.m92911t(c, C47810es.m84974n(new C24691fu(hVar)), C60826bg.f164896a);
        return c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f67534a.mo60297gq(), this.f67535c.mo60297gq(), this.f67536d.mo60297gq(), this.f67537e.mo60297gq(), this.f67538f.mo60297gq());
    }
}
