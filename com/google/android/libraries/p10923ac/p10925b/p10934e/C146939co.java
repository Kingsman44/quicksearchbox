package com.google.android.libraries.p10923ac.p10925b.p10934e;

import com.google.android.libraries.p10923ac.p10925b.p10942i.C147077av;
import com.google.android.libraries.p10923ac.p10925b.p10942i.C147084g;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10963e.C147266a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.ac.b.e.co */
/* compiled from: PG */
public final class C146939co extends C68247h {

    /* renamed from: a */
    private final C68283d f396661a;

    /* renamed from: c */
    private final C68283d f396662c;

    public C146939co(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C146939co.class), aVar);
        this.f396661a = C68236af.m98549d(dVar);
        this.f396662c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C147266a aVar = (C147266a) list.get(0);
        C146856az azVar = (C146856az) list.get(1);
        C147077av a = azVar.mo123790m().mo123903a();
        try {
            C147084g d = azVar.mo123781d().mo123912d(a, C147266a.m240146q());
            a.close();
            return C60856cj.m92900i(d);
        } catch (Throwable th) {
            C146930cf.m239502a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f396661a.mo60297gq(), this.f396662c.mo60297gq());
    }
}
