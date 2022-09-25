package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p827h.p828a.p829a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p727a.C11989b;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p743f.p744a.p745a.C12112a;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p743f.p744a.p745a.C12113b;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p827h.C12692e;
import com.google.android.libraries.search.p2904c.C37655hb;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.h.a.a.e */
/* compiled from: PG */
public final class C12657e extends C68247h {

    /* renamed from: a */
    private final C68283d f39682a;

    /* renamed from: c */
    private final C68283d f39683c;

    /* renamed from: d */
    private final C68283d f39684d;

    public C12657e(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C12657e.class), aVar);
        this.f39682a = C68236af.m98549d(dVar);
        this.f39683c = C68236af.m98549d(dVar2);
        this.f39684d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        C11989b bVar;
        C37655hb hbVar;
        List list = (List) obj;
        C12692e eVar = (C12692e) list.get(0);
        int intValue = ((Integer) list.get(1)).intValue();
        boolean booleanValue = ((Boolean) list.get(2)).booleanValue();
        C12112a aVar = (C12112a) C12113b.f38724h.createBuilder();
        aVar.copyOnWrite();
        C12113b bVar2 = (C12113b) aVar.instance;
        bVar2.f38726a |= 128;
        bVar2.f38731f = 2;
        aVar.copyOnWrite();
        C12113b bVar3 = (C12113b) aVar.instance;
        bVar3.f38726a |= 32;
        bVar3.f38729d = 16000;
        int i = intValue == 2 ? 12 : 16;
        aVar.copyOnWrite();
        C12113b bVar4 = (C12113b) aVar.instance;
        bVar4.f38726a |= 64;
        bVar4.f38730e = i;
        if (eVar.mo20722c().mo56113h() && !((String) eVar.mo20722c().mo56107c()).isEmpty()) {
            String str = (String) eVar.mo20722c().mo56107c();
            aVar.copyOnWrite();
            C12113b bVar5 = (C12113b) aVar.instance;
            str.getClass();
            bVar5.f38727b = 7;
            bVar5.f38728c = str;
        }
        if (booleanValue) {
            aVar.copyOnWrite();
            C12113b bVar6 = (C12113b) aVar.instance;
            bVar6.f38726a |= 256;
            bVar6.f38732g = true;
        }
        if (eVar.mo20723d().mo56113h()) {
            if ((((C12113b) eVar.mo20723d().mo56107c()).f38726a & 32) != 0) {
                int i2 = ((C12113b) eVar.mo20723d().mo56107c()).f38729d;
                aVar.copyOnWrite();
                C12113b bVar7 = (C12113b) aVar.instance;
                bVar7.f38726a |= 32;
                bVar7.f38729d = i2;
            }
            if (((C12113b) eVar.mo20723d().mo56107c()).f38727b == 5) {
                C12113b bVar8 = (C12113b) eVar.mo20723d().mo56107c();
                String str2 = bVar8.f38727b == 5 ? (String) bVar8.f38728c : BuildConfig.FLAVOR;
                aVar.copyOnWrite();
                C12113b bVar9 = (C12113b) aVar.instance;
                str2.getClass();
                bVar9.f38727b = 5;
                bVar9.f38728c = str2;
            } else if (((C12113b) eVar.mo20723d().mo56107c()).f38727b == 6) {
                C12113b bVar10 = (C12113b) eVar.mo20723d().mo56107c();
                if (bVar10.f38727b == 6) {
                    hbVar = (C37655hb) bVar10.f38728c;
                } else {
                    hbVar = C37655hb.f100025d;
                }
                aVar.copyOnWrite();
                C12113b bVar11 = (C12113b) aVar.instance;
                hbVar.getClass();
                bVar11.f38728c = hbVar;
                bVar11.f38727b = 6;
            } else if (((C12113b) eVar.mo20723d().mo56107c()).f38727b == 8) {
                C12113b bVar12 = (C12113b) eVar.mo20723d().mo56107c();
                if (bVar12.f38727b == 8) {
                    bVar = (C11989b) bVar12.f38728c;
                } else {
                    bVar = C11989b.f38498a;
                }
                aVar.copyOnWrite();
                C12113b bVar13 = (C12113b) aVar.instance;
                bVar.getClass();
                bVar13.f38728c = bVar;
                bVar13.f38727b = 8;
            }
        }
        return C60856cj.m92900i((C12113b) aVar.build());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f39682a.mo60297gq(), this.f39683c.mo60297gq(), this.f39684d.mo60297gq());
    }
}
