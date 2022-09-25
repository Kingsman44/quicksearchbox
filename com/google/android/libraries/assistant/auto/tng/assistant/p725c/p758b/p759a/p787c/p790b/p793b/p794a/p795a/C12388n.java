package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p787c.p790b.p793b.p794a.p795a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p743f.p744a.p745a.C12114c;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p743f.p744a.p745a.C12115d;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p743f.p746b.C12129m;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p743f.p754d.C12153b;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p787c.p797c.p798a.C12393a;
import com.google.android.libraries.assistant.auto.tng.p1035m.p1038b.C13901e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4456g.p4458b.C57987f;
import com.google.p4449cd.p4456g.p4459c.C58002f;
import com.google.protobuf.C63088z;
import com.google.speech.p5218j.C67073ka;
import com.google.speech.p5218j.C67171p;
import com.google.speech.recognizer.p5233a.C67451at;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.c.b.b.a.a.n */
/* compiled from: PG */
public final class C12388n extends C68247h {

    /* renamed from: a */
    private final C68283d f39231a;

    /* renamed from: c */
    private final C68283d f39232c;

    /* renamed from: d */
    private final C68283d f39233d;

    /* renamed from: e */
    private final C68283d f39234e;

    /* renamed from: f */
    private final C68283d f39235f;

    public C12388n(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5) {
        super(aVar2, new C68277d(C12388n.class), aVar);
        this.f39231a = C68236af.m98549d(dVar);
        this.f39232c = C68236af.m98549d(dVar2);
        this.f39233d = C68236af.m98549d(dVar3);
        this.f39234e = C68236af.m98549d(dVar4);
        this.f39235f = C68236af.m98549d(dVar5);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        C58002f fVar;
        List list = (List) obj;
        C12129m mVar = (C12129m) list.get(0);
        C12393a aVar = (C12393a) list.get(1);
        C67451at atVar = (C67451at) list.get(2);
        int intValue = ((Integer) list.get(3)).intValue();
        int intValue2 = ((Integer) list.get(4)).intValue();
        if (aVar.mo20571a().mo56113h()) {
            C67073ka kaVar = ((C13901e) aVar.mo20571a().mo56107c()).f42333b;
            if (kaVar == null) {
                kaVar = C67073ka.f182324f;
            }
            C67171p pVar = kaVar.f182327b;
            if (pVar == null) {
                pVar = C67171p.f182575e;
            }
            if ((pVar.f182577a & 1) != 0) {
                C67073ka kaVar2 = ((C13901e) aVar.mo20571a().mo56107c()).f42333b;
                if (kaVar2 == null) {
                    kaVar2 = C67073ka.f182324f;
                }
                C67171p pVar2 = kaVar2.f182327b;
                if (pVar2 == null) {
                    pVar2 = C67171p.f182575e;
                }
                C63088z zVar = pVar2.f182578b;
                C12114c cVar = (C12114c) C12115d.f38733c.createBuilder();
                cVar.copyOnWrite();
                C12115d dVar = (C12115d) cVar.instance;
                zVar.getClass();
                dVar.f38735a = 1 | dVar.f38735a;
                dVar.f38736b = zVar;
                C57987f fVar2 = new C57987f();
                fVar2.f155056f.mo54591h((C12115d) cVar.build());
                fVar2.f155056f.mo54589f(false);
                fVar = new C58002f(new C12153b(mVar.mo20441a(fVar2, atVar, intValue, intValue2), C12384j.m28403a(atVar)), C12382h.f39220a);
                return C60856cj.m92900i(fVar);
            }
        }
        C57987f fVar3 = new C57987f();
        fVar3.f155056f.mo54589f(false);
        fVar = fVar3;
        return C60856cj.m92900i(fVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f39231a.mo60297gq(), this.f39232c.mo60297gq(), this.f39233d.mo60297gq(), this.f39234e.mo60297gq(), this.f39235f.mo60297gq());
    }
}
