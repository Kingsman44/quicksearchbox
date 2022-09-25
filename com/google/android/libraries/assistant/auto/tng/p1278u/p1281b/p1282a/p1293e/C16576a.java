package com.google.android.libraries.assistant.auto.tng.p1278u.p1281b.p1282a.p1293e;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p787c.p797c.p798a.C12393a;
import com.google.android.libraries.assistant.auto.tng.p1035m.p1038b.C13901e;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5208h.C66626cx;
import com.google.speech.p5208h.C66628cz;
import com.google.speech.p5208h.C66634da;
import com.google.speech.p5218j.C67030il;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.u.b.a.e.a */
/* compiled from: PG */
public final class C16576a extends C68247h {

    /* renamed from: a */
    private final C68283d f48616a;

    public C16576a(C69464a aVar, C69464a aVar2, C68283d dVar) {
        super(aVar2, new C68277d(C16576a.class), aVar);
        this.f48616a = C68236af.m98549d(dVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        Object obj2;
        C12393a aVar = (C12393a) obj;
        if (!aVar.mo20571a().mo56113h()) {
            obj2 = C58836b.f156633a;
        } else {
            C67030il ilVar = ((C13901e) aVar.mo20571a().mo56107c()).f42340i;
            if (ilVar == null) {
                ilVar = C67030il.f182195e;
            }
            C66628cz czVar = (C66628cz) C66634da.f181292g.createBuilder();
            float f = ilVar.f182199c;
            czVar.copyOnWrite();
            C66634da daVar = (C66634da) czVar.instance;
            daVar.f181295a |= 2;
            daVar.f181297c = f;
            float f2 = ilVar.f182198b;
            czVar.copyOnWrite();
            C66634da daVar2 = (C66634da) czVar.instance;
            daVar2.f181295a |= 1;
            daVar2.f181296b = f2;
            C66626cx cxVar = C66626cx.AUTO;
            czVar.copyOnWrite();
            C66634da daVar3 = (C66634da) czVar.instance;
            daVar3.f181299e = cxVar.f181272r;
            daVar3.f181295a |= 8;
            obj2 = C58833ax.m90834k((C66634da) czVar.build());
        }
        return C60856cj.m92900i(obj2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return this.f48616a.mo60297gq();
    }
}
