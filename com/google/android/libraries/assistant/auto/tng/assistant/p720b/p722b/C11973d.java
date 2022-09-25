package com.google.android.libraries.assistant.auto.tng.assistant.p720b.p722b;

import com.google.android.libraries.assistant.auto.tng.assistant.p720b.C11964a;
import com.google.android.libraries.assistant.auto.tng.assistant.p720b.p723c.C11975a;
import com.google.android.libraries.assistant.auto.tng.assistant.p720b.p723c.C11976b;
import com.google.android.libraries.assistant.auto.tng.assistant.p720b.p723c.C11977c;
import com.google.android.libraries.assistant.auto.tng.assistant.p720b.p723c.C11978d;
import com.google.android.libraries.assistant.auto.tng.assistant.p720b.p723c.C11980f;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p760a.p761a.C12180f;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.p1028l.C13876g;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1330d.p1331a.C16850a;
import com.google.android.libraries.assistant.auto.tng.p984g.p985a.C13560a;
import com.google.android.libraries.assistant.portable.p1586b.C19088t;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3912f.C51209d;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.p5277z.p5281b.C67988i;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62961ch;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.b.b.d */
/* compiled from: PG */
public final class C11973d implements C13876g, C11964a {

    /* renamed from: a */
    public final C13560a f38446a;

    /* renamed from: b */
    public final C16850a f38447b;

    /* renamed from: c */
    public final C60888db f38448c;

    /* renamed from: d */
    private final C11974e f38449d;

    public C11973d(C11974e eVar, C13560a aVar, C16850a aVar2, C60888db dbVar) {
        C58974d.m91135i("AutoClientLogger");
        this.f38449d = eVar;
        this.f38446a = aVar;
        this.f38447b = aVar2;
        this.f38448c = dbVar;
    }

    /* renamed from: d */
    private static C11978d m27846d(C11980f fVar, int i, C51209d dVar, boolean z) {
        C11977c cVar = (C11977c) C11978d.f38470d.createBuilder();
        String str = fVar.f38486i;
        cVar.copyOnWrite();
        C11978d dVar2 = (C11978d) cVar.instance;
        str.getClass();
        dVar2.f38472a |= 1;
        dVar2.f38473b = str;
        C11975a aVar = (C11975a) C11976b.f38453o.createBuilder();
        aVar.copyOnWrite();
        C11976b bVar = (C11976b) aVar.instance;
        bVar.f38458d = 1;
        bVar.f38455a |= 4;
        boolean z2 = fVar.f38484g;
        aVar.copyOnWrite();
        C11976b bVar2 = (C11976b) aVar.instance;
        bVar2.f38455a |= 32;
        bVar2.f38462h = z2;
        String str2 = fVar.f38483f;
        aVar.copyOnWrite();
        C11976b bVar3 = (C11976b) aVar.instance;
        str2.getClass();
        bVar3.f38455a |= 16;
        bVar3.f38461g = str2;
        C61752n nVar = fVar.f38480c;
        if (nVar == null) {
            nVar = C61752n.f166808f;
        }
        aVar.copyOnWrite();
        C11976b bVar4 = (C11976b) aVar.instance;
        nVar.getClass();
        bVar4.f38457c = nVar;
        bVar4.f38455a |= 2;
        String str3 = fVar.f38479b;
        aVar.copyOnWrite();
        C11976b bVar5 = (C11976b) aVar.instance;
        str3.getClass();
        bVar5.f38455a = 1 | bVar5.f38455a;
        bVar5.f38456b = str3;
        String str4 = fVar.f38485h;
        aVar.copyOnWrite();
        C11976b bVar6 = (C11976b) aVar.instance;
        str4.getClass();
        bVar6.f38455a |= 64;
        bVar6.f38463i = str4;
        String str5 = fVar.f38481d;
        aVar.copyOnWrite();
        C11976b bVar7 = (C11976b) aVar.instance;
        str5.getClass();
        bVar7.f38455a |= 8;
        bVar7.f38459e = str5;
        int b = C67988i.m98230b(fVar.f38487j);
        if (b == 0) {
            b = 2;
        }
        aVar.copyOnWrite();
        C11976b bVar8 = (C11976b) aVar.instance;
        bVar8.f38464j = C67988i.m98229a(b);
        bVar8.f38455a |= 128;
        aVar.copyOnWrite();
        C11976b bVar9 = (C11976b) aVar.instance;
        bVar9.f38466l = i - 1;
        bVar9.f38455a |= 512;
        C19088t tVar = fVar.f38488k;
        if (tVar == null) {
            tVar = C19088t.f53533p;
        }
        aVar.copyOnWrite();
        C11976b bVar10 = (C11976b) aVar.instance;
        tVar.getClass();
        bVar10.f38465k = tVar;
        bVar10.f38455a |= 256;
        aVar.copyOnWrite();
        C11976b bVar11 = (C11976b) aVar.instance;
        bVar11.f38467m = dVar.f133323n;
        bVar11.f38455a |= 1024;
        aVar.copyOnWrite();
        C11976b bVar12 = (C11976b) aVar.instance;
        bVar12.f38455a |= 2048;
        bVar12.f38468n = z;
        C62961ch chVar = fVar.f38482e;
        aVar.copyOnWrite();
        C11976b bVar13 = (C11976b) aVar.instance;
        C62961ch chVar2 = bVar13.f38460f;
        if (!chVar2.mo58948c()) {
            bVar13.f38460f = C62942bv.mutableCopy(chVar2);
        }
        C62947c.addAll((Iterable) chVar, (List) bVar13.f38460f);
        cVar.copyOnWrite();
        C11978d dVar3 = (C11978d) cVar.instance;
        C11976b bVar14 = (C11976b) aVar.build();
        bVar14.getClass();
        dVar3.f38474c = bVar14;
        dVar3.f38472a |= 2;
        return (C11978d) cVar.build();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo20345a(Object obj, int i, C51209d dVar) {
        C12180f fVar = (C12180f) obj;
        if (fVar.mo20468a().mo56113h()) {
            this.f38449d.mo20347a(m27846d((C11980f) fVar.mo20468a().mo56107c(), i, dVar, true));
        }
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo20346b(Object obj, C51209d dVar) {
        C12180f fVar = (C12180f) obj;
        if (fVar.mo20468a().mo56113h()) {
            this.f38449d.mo20347a(m27846d((C11980f) fVar.mo20468a().mo56107c(), 6, dVar, false));
        }
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C60870cx mo20341c(C60870cx cxVar, Object obj) {
        C11972c cVar = new C11972c(this, (C12991i) obj);
        return C60922j.m93045h(cxVar, C47810es.m84966f(cVar), this.f38448c);
    }
}
