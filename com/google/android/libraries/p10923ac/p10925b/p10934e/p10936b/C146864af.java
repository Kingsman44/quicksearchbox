package com.google.android.libraries.p10923ac.p10925b.p10934e.p10936b;

import com.google.android.libraries.p10923ac.p10925b.p10934e.C146853aw;
import com.google.android.libraries.p10923ac.p10925b.p10942i.C147077av;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.ac.b.e.b.af */
/* compiled from: PG */
public final class C146864af extends C68247h {

    /* renamed from: a */
    private final C68283d f396439a;

    public C146864af(C69464a aVar, C69464a aVar2, C68283d dVar) {
        super(aVar2, new C68277d(C146864af.class), aVar);
        this.f396439a = C68236af.m98549d(dVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        C58485gu guVar;
        C146853aw awVar = (C146853aw) obj;
        C147077av a = awVar.mo123767a().mo123903a();
        try {
            if (awVar.mo123773g()) {
                guVar = C58485gu.m89842j(awVar.mo123772f());
            } else {
                guVar = C58485gu.m89845m();
            }
            a.close();
            return C60856cj.m92900i(guVar);
        } catch (Throwable th) {
            C146895x.m239405a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return this.f396439a.mo60297gq();
    }
}
