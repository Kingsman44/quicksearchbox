package com.google.android.libraries.onegoogle.accountmenu.cards;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.apps.search.googleapp.accounts.p10126ui.features.C133301h;
import com.google.android.libraries.onegoogle.account.p2345a.C30158c;
import com.google.android.libraries.onegoogle.accountmenu.cards.p2355db.C30422a;
import com.google.android.libraries.onegoogle.accountmenu.cards.p2355db.C30426e;
import com.google.android.libraries.onegoogle.accountmenu.cards.p2355db.CardsDatabase;
import com.google.android.libraries.onegoogle.common.C30931r;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.common.base.C58836b;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p3186j$.util.DesugarCollections;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.cards.ac */
/* compiled from: PG */
public final class C30348ac extends C30360ao {

    /* renamed from: b */
    public static final long f82073b = TimeUnit.SECONDS.toMillis(4);

    /* renamed from: c */
    public final CardsDatabase f82074c;

    /* renamed from: d */
    public final Map f82075d = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: g */
    private C30453u f82076g;

    /* renamed from: h */
    private C30347ab f82077h;

    /* renamed from: i */
    private final C133301h f82078i;

    public C30348ac(C133301h hVar, Context context, C30158c cVar, Executor executor) {
        super(cVar, executor);
        this.f82078i = hVar;
        this.f82074c = CardsDatabase.m56643A(context, executor);
        executor.execute(new C30454v(this));
    }

    /* renamed from: c */
    public static boolean m56513c(int i) {
        return (i == 6 || i == 9) ? false : true;
    }

    /* renamed from: a */
    public final void mo35627a() {
        C30347ab abVar = this.f82077h;
        if (abVar != null && abVar.f82067c != 0) {
            C30426e eVar = (C30426e) abVar.f82066b.f82075d.get(abVar.f82065a);
            int i = 1;
            if (eVar != null) {
                int d = eVar.mo35998d();
                int i2 = abVar.f82067c;
                if (d == 0) {
                    throw null;
                } else if (d == i2) {
                    i = 1 + eVar.mo35995a();
                }
            }
            C30422a aVar = new C30422a();
            aVar.mo35991b(abVar.f82065a);
            aVar.mo35992c(abVar.f82067c);
            aVar.mo35993d(SystemClock.elapsedRealtime());
            aVar.mo35994e(i);
            C30426e a = aVar.mo35990a();
            abVar.f82066b.f82075d.put(abVar.f82065a, a);
            if (!m56513c(abVar.f82067c)) {
                C30348ac acVar = abVar.f82066b;
                C30931r.m57728a(acVar.f81607a, C58836b.f156633a);
            }
            abVar.f82066b.f82083f.execute(new C30457y(abVar, a));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo35628b(Object obj) {
        C30347ab abVar;
        if (this.f82076g == null || this.f82077h == null) {
            C46108a aVar = (C46108a) obj;
            C30453u uVar = (C30453u) this.f82078i.f363240a;
            this.f82076g = uVar;
            C30347ab abVar2 = this.f82077h;
            if (abVar2 != null) {
                abVar2.mo35911b();
            }
            if (uVar == null) {
                abVar = null;
            } else {
                abVar = new C30347ab(this, uVar.mo36043a(), this.f82082e.mo35552c(obj));
            }
            this.f82077h = abVar;
            if (this.f82076g == null || abVar == null) {
                C30931r.m57728a(this.f81607a, C58836b.f156633a);
                return;
            }
            throw null;
        }
        throw null;
    }
}
