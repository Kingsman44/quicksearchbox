package com.google.android.libraries.assistant.auto.tng.p1278u.p1281b.p1282a.p1296h;

import com.google.android.libraries.assistant.auto.tng.p1278u.p1281b.p1282a.C16462a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5208h.C66677k;
import com.google.speech.p5208h.C66678l;
import com.google.speech.recognizer.p5233a.C67451at;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.u.b.a.h.a */
/* compiled from: PG */
public final class C16582a extends C68247h {

    /* renamed from: a */
    private final C68283d f48624a;

    /* renamed from: c */
    private final C68283d f48625c;

    /* renamed from: d */
    private final C68283d f48626d;

    /* renamed from: e */
    private final C68283d f48627e;

    public C16582a(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C16582a.class), aVar);
        this.f48624a = C68236af.m98549d(dVar);
        this.f48625c = C68236af.m98549d(dVar2);
        this.f48626d = C68236af.m98549d(dVar3);
        this.f48627e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        C16462a aVar;
        List list = (List) obj;
        boolean booleanValue = ((Boolean) list.get(0)).booleanValue();
        C67451at atVar = (C67451at) list.get(1);
        int intValue = ((Integer) list.get(2)).intValue();
        int intValue2 = ((Integer) list.get(3)).intValue();
        if (!booleanValue) {
            aVar = new C16462a(C58836b.f156633a, C66678l.f181386h);
        } else {
            C66677k kVar = (C66677k) C66678l.f181384f.createBuilder();
            kVar.copyOnWrite();
            C66678l lVar = (C66678l) kVar.instance;
            lVar.f181389b = atVar.f183321p;
            lVar.f181388a = 1 | lVar.f181388a;
            kVar.copyOnWrite();
            C66678l lVar2 = (C66678l) kVar.instance;
            lVar2.f181388a |= 2;
            lVar2.f181390c = (float) intValue;
            kVar.copyOnWrite();
            C66678l lVar3 = (C66678l) kVar.instance;
            lVar3.f181388a |= 4;
            lVar3.f181391d = intValue2;
            aVar = new C16462a(C58833ax.m90834k((C66678l) kVar.build()), C66678l.f181386h);
        }
        return C60856cj.m92900i(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f48624a.mo60297gq(), this.f48625c.mo60297gq(), this.f48626d.mo60297gq(), this.f48627e.mo60297gq());
    }
}
