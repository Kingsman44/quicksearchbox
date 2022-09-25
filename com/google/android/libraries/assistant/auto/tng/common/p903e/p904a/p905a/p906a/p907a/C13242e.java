package com.google.android.libraries.assistant.auto.tng.common.p903e.p904a.p905a.p906a.p907a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p872e.p873a.C12959b;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C13007y;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15480f;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15487m;
import com.google.android.libraries.assistant.auto.tng.p1278u.p1281b.p1282a.C16462a;
import com.google.android.libraries.assistant.auto.tng.p1278u.p1281b.p1303b.C16603a;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.p4449cd.C57940c;
import com.google.p4449cd.C57954d;
import com.google.speech.p5208h.C66606cd;
import com.google.speech.p5208h.C66607ce;
import dagger.p5295b.C68282c;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.Set;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.common.e.a.a.a.a.e */
/* compiled from: PG */
public final class C13242e extends C68247h {

    /* renamed from: a */
    private final C68283d f40897a;

    /* renamed from: c */
    private final C68283d f40898c;

    /* renamed from: d */
    private final C68283d f40899d;

    /* renamed from: e */
    private final C68283d f40900e;

    public C13242e(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C13242e.class), aVar);
        this.f40897a = C68236af.m98549d(dVar);
        this.f40898c = C68236af.m98549d(dVar2);
        this.f40899d = C68236af.m98549d(dVar3);
        this.f40900e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        C66607ce ceVar;
        List list = (List) obj;
        C68282c cVar = (C68282c) list.get(0);
        Set<C57954d> set = (Set) list.get(1);
        C12991i iVar = (C12991i) list.get(2);
        C15481g gVar = (C15481g) list.get(3);
        C37252a c = C37179a.f97516bi.mo40779c();
        C13007y yVar = iVar.f40383b;
        if (yVar == null) {
            yVar = C13007y.f40413d;
        }
        C15480f.m32212a(c, Optional.m71637of(Long.valueOf(yVar.f40416b)));
        gVar.mo22353c(c, Optional.empty());
        C66606cd a = C16603a.m33662a();
        a.copyOnWrite();
        C66607ce ceVar2 = (C66607ce) a.instance;
        C66607ce ceVar3 = C66607ce.f181191f;
        ceVar2.f181193a = 1 | ceVar2.f181193a;
        ceVar2.f181194b = "assistant-voiceless";
        if (C57940c.m88581h(cVar) || C57940c.m88580g(cVar)) {
            if (C57940c.m88581h(cVar)) {
                ((C59052c) ((C59052c) C13240c.f40895a.mo56226d()).mo56372aa(44707)).mo56386p("Cancellation error(s) occurred when creating S3 request");
                gVar.mo22355e(C37179a.f97517bj.mo40806d(), iVar, C62722b.CANCELLED, Optional.empty());
            } else if (C57940c.m88580g(cVar)) {
                C58833ax b = C57940c.m88575b(cVar);
                C62722b b2 = C12959b.m29197b(b);
                if (b.mo56113h()) {
                    ((C59052c) ((C59052c) ((C59052c) C13240c.f40895a.mo56226d()).mo56382g((Throwable) b.mo56107c())).mo56372aa(44706)).mo56386p("Exception when creating S3 request");
                }
                gVar.mo22355e(C37179a.f97517bj.mo40806d(), iVar, b2, Optional.m71637of(new C13239b(b)));
            }
            ceVar = (C66607ce) a.build();
        } else {
            for (C16462a a2 : (Set) C57940c.m88576c(cVar)) {
                a2.mo22927a(a);
            }
            C58480gp e = C58485gu.m89837e();
            for (C57954d dVar : set) {
                try {
                    ((C16462a) C60856cj.m92909r(dVar.f154993a)).mo22927a(a);
                } catch (Exception e2) {
                    ((C59052c) ((C59052c) ((C59052c) C13240c.f40895a.mo56226d()).mo56382g(e2)).mo56372aa(44703)).mo56386p("Non Fatal S3Extension creation failed");
                    e.mo55395g(C15487m.m32219b(e2));
                }
            }
            C58485gu f = e.mo55394f();
            ceVar = (C66607ce) a.build();
            gVar.mo22355e(C37179a.f97517bj.mo40806d(), iVar, C62722b.OK, Optional.m71637of(new C13238a(f)));
        }
        return C60856cj.m92900i(ceVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(C68236af.m98546a(this.f40897a.mo60297gq()), this.f40898c.mo60297gq(), this.f40899d.mo60297gq(), this.f40900e.mo60297gq());
    }
}
