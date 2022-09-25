package com.google.android.libraries.p10923ac.p10925b.p10944k;

import android.accounts.Account;
import android.os.SystemClock;
import com.google.android.apps.gsa.staticplugins.p7611bv.p7612a.C97263s;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.libraries.p10923ac.p10925b.p10927b.C146770a;
import com.google.android.libraries.p10923ac.p10925b.p10927b.C146772b;
import com.google.android.libraries.p10923ac.p10925b.p10927b.C146792e;
import com.google.android.libraries.p10923ac.p10925b.p10933d.C146822a;
import com.google.android.libraries.p10923ac.p10925b.p10942i.C147075at;
import com.google.android.libraries.p10923ac.p10925b.p10943j.C147112i;
import com.google.android.libraries.p10923ac.p10925b.p10943j.C147113j;
import com.google.android.libraries.p10923ac.p10925b.p10945l.C147176j;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147256m;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10963e.C147266a;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10967h.C147306a;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58662ni;
import com.google.common.p4552o.p4566l.C60161bz;
import com.google.common.p4552o.p4566l.C60173ck;
import com.google.common.p4552o.p4566l.C60178cp;
import com.google.common.p4552o.p4566l.C60192dc;
import com.google.common.p4552o.p4566l.C60194de;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protos.p4895aw.p4902b.C64097o;
import com.google.protos.p4895aw.p4902b.C64098p;
import java.io.Closeable;
import java.io.IOException;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.ac.b.k.s */
/* compiled from: PG */
public final class C147159s implements Closeable {

    /* renamed from: a */
    public final C147133ah f397297a;

    /* renamed from: b */
    public final C147141ap f397298b;

    /* renamed from: c */
    public final C64098p f397299c;

    /* renamed from: d */
    public final Account f397300d;

    /* renamed from: e */
    public C147131af f397301e;

    /* renamed from: f */
    public C147131af f397302f;

    /* renamed from: g */
    public boolean f397303g;

    /* renamed from: h */
    public boolean f397304h;

    /* renamed from: i */
    public boolean f397305i;

    /* renamed from: j */
    public final /* synthetic */ C147160t f397306j;

    /* renamed from: k */
    public int f397307k;

    /* renamed from: l */
    private final String f397308l;

    /* renamed from: m */
    private long f397309m;

    public C147159s(C147160t tVar, C147133ah ahVar, C147141ap apVar, C64098p pVar, Account account, long j) {
        this.f397306j = tVar;
        this.f397297a = ahVar;
        this.f397298b = apVar;
        this.f397299c = pVar;
        this.f397308l = ((C146792e) tVar.f397312c.get(C64097o.m96355a(pVar.f173294a))).mo123637a(pVar);
        this.f397300d = account;
        Long c = ahVar.mo123959c();
        if (c == null || c.longValue() != j) {
            long elapsedRealtime = (SystemClock.elapsedRealtime() - Math.max(tVar.f397324o.mo124071b() * 1000, tVar.f397324o.mo124073d() * 1000)) - 1;
            this.f397309m = elapsedRealtime;
            ahVar.mo123964h(j, elapsedRealtime);
        } else {
            this.f397309m = ahVar.mo123961e().longValue();
        }
        this.f397301e = ahVar.mo123957a();
        this.f397302f = ahVar.mo123958b();
        this.f397307k = 1;
    }

    /* renamed from: i */
    public static final C60194de m239962i(C147134ai aiVar) {
        int i = aiVar.f397249a;
        if (i == 2) {
            return C60194de.UNKNOWN_HOST;
        }
        if (i == 1) {
            return C60194de.UNSUPPORTED_PROTOCOL;
        }
        if (i == 3) {
            return C60194de.PENDING_LOCAL_CHANGES;
        }
        if (i == 4) {
            return C60194de.CONNECT_EXCEPTION;
        }
        if (i == 5) {
            return C60194de.UNAUTHENTICATED;
        }
        if (i == 6) {
            return C60194de.UNAVAILABLE;
        }
        if (i == 7) {
            return C60194de.DEADLINE_EXCEEDED;
        }
        return C60194de.UNDEFINED;
    }

    /* renamed from: a */
    public final C147112i mo123977a(String str) {
        try {
            return this.f397306j.f397311b.mo123933a(str, this.f397300d, this.f397299c);
        } catch (C147113j e) {
            throw new C147075at("Write callback failure", e);
        }
    }

    /* renamed from: b */
    public final void mo123978b() {
        if (this.f397307k != 4) {
            C147131af afVar = this.f397301e;
            C147130ae c = afVar.mo123953c();
            c.mo123948c(afVar.mo123951a() + 1);
            C147131af a = c.mo123946a();
            this.f397301e = a;
            try {
                this.f397297a.mo123965i(a);
            } catch (C147075at e) {
                ((C147256m) this.f397306j.f397310a.mo27525b()).mo124063f("Storing channel state failed", e, new Object[0]);
            }
        }
    }

    /* renamed from: c */
    public final void mo123979c(C60192dc dcVar) {
        if (this.f397307k != 4) {
            C147131af afVar = this.f397301e;
            C147130ae c = afVar.mo123953c();
            long e = afVar.mo123955e(dcVar);
            EnumMap enumMap = new EnumMap(c.mo123947b());
            enumMap.put(dcVar, Long.valueOf(e + 1));
            c.mo123949d(C58662ni.m90343b(enumMap));
            C147131af a = c.mo123946a();
            this.f397301e = a;
            try {
                this.f397297a.mo123965i(a);
            } catch (C147075at e2) {
                ((C147256m) this.f397306j.f397310a.mo27525b()).mo124063f("Storing channel state failed", e2, new Object[0]);
            }
        }
    }

    public final void close() {
        this.f397297a.close();
    }

    /* renamed from: d */
    public final void mo123981d(long j, boolean z, C147131af afVar, Long l, boolean z2, boolean z3, C60173ck ckVar) {
        C147131af afVar2 = afVar;
        C60173ck ckVar2 = ckVar;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (C147266a.m240139j()) {
            C60161bz a = C147176j.m240000a(this.f397299c);
            ckVar.copyOnWrite();
            C60178cp cpVar = (C60178cp) ckVar2.instance;
            C60178cp cpVar2 = C60178cp.f162787o;
            a.getClass();
            cpVar.f162790b = a;
            cpVar.f162789a |= 1;
        } else {
            String str = this.f397308l;
            ckVar.copyOnWrite();
            C60178cp cpVar3 = (C60178cp) ckVar2.instance;
            C60178cp cpVar4 = C60178cp.f162787o;
            str.getClass();
            cpVar3.f162789a |= 16384;
            cpVar3.f162802n = str;
        }
        ckVar.copyOnWrite();
        C60178cp cpVar5 = (C60178cp) ckVar2.instance;
        cpVar5.f162789a |= 8;
        cpVar5.f162793e = (int) (elapsedRealtime - j);
        if (C147266a.m240139j()) {
            ckVar.copyOnWrite();
            C60178cp cpVar6 = (C60178cp) ckVar2.instance;
            cpVar6.f162789a |= 4096;
            cpVar6.f162800l = z;
            Long valueOf = l != null ? Long.valueOf(j - l.longValue()) : null;
            C147131af afVar3 = this.f397302f;
            C58526ih ihVar = new C58526ih();
            Iterator it = EnumSet.complementOf(EnumSet.of(C60192dc.UNRECOGNIZED)).iterator();
            while (it.hasNext()) {
                C60192dc dcVar = (C60192dc) it.next();
                if (afVar2.mo123955e(dcVar) != afVar3.mo123955e(dcVar)) {
                    ihVar.mo55373c(dcVar);
                }
            }
            C58528ij<C60192dc> f = ihVar.mo55486f();
            if (valueOf != null) {
                long longValue = valueOf.longValue();
                ckVar.copyOnWrite();
                C60178cp cpVar7 = (C60178cp) ckVar2.instance;
                cpVar7.f162789a |= 256;
                cpVar7.f162798j = longValue;
            }
            ckVar.copyOnWrite();
            C60178cp cpVar8 = (C60178cp) ckVar2.instance;
            C62961ch chVar = cpVar8.f162799k;
            if (!chVar.mo58948c()) {
                cpVar8.f162799k = C62942bv.mutableCopy(chVar);
            }
            for (C60192dc number : f) {
                cpVar8.f162799k.mo58916g(number.getNumber());
            }
        }
        if (C147266a.m240138i()) {
            ckVar.copyOnWrite();
            C60178cp cpVar9 = (C60178cp) ckVar2.instance;
            cpVar9.f162789a |= 8192;
            cpVar9.f162801m = z2;
        }
        C60194de a2 = C60194de.m92539a(((C60178cp) ckVar2.instance).f162791c);
        if (a2 == null) {
            a2 = C60194de.UNDEFINED;
        }
        if (a2 == C60194de.SUCCESS) {
            this.f397302f = afVar2;
            this.f397309m = elapsedRealtime;
            if (this.f397307k != 4) {
                try {
                    this.f397297a.mo123966j(elapsedRealtime, afVar2);
                } catch (C147075at e) {
                    ((C147256m) this.f397306j.f397310a.mo27525b()).mo124063f("Storing synced channel state failed", e, new Object[0]);
                }
            }
            if (z3) {
                this.f397306j.f397315f.mo124013d(this.f397300d, this.f397299c);
            }
        }
        boolean g = C147131af.m239910g(this.f397301e, this.f397302f);
        ckVar.copyOnWrite();
        C60178cp cpVar10 = (C60178cp) ckVar2.instance;
        cpVar10.f162789a |= 16;
        cpVar10.f162794f = g;
        boolean z4 = this.f397307k == 3;
        ckVar.copyOnWrite();
        C60178cp cpVar11 = (C60178cp) ckVar2.instance;
        cpVar11.f162789a |= 32;
        cpVar11.f162795g = z4;
        int i = this.f397307k;
        if (i == 3 || i == 4) {
            mo123982e();
        } else {
            mo123985h(1);
        }
        ((C146822a) this.f397306j.f397314e.mo27525b()).mo123717c((C60178cp) ckVar.build());
        C147256m mVar = (C147256m) this.f397306j.f397310a.mo27525b();
        if (mVar.f397497a) {
            mVar.mo124066i("Sync complete; result=%s, account=%s, channelId=%s", a2, this.f397300d, this.f397299c);
        } else {
            mVar.mo124065h("Sync complete; result=%s", a2);
        }
    }

    /* renamed from: e */
    public final void mo123982e() {
        mo123983f(new C146772b(this.f397300d, this.f397299c));
    }

    /* renamed from: f */
    public final void mo123983f(C146770a aVar) {
        this.f397306j.f397319j.remove(aVar);
        try {
            close();
        } catch (IOException e) {
            ((C147256m) this.f397306j.f397310a.mo27525b()).mo124063f("Channel close failed", e, new Object[0]);
        }
    }

    /* renamed from: g */
    public final boolean mo123984g(long j, long j2) {
        return this.f397307k != 1 || j - this.f397309m <= j2;
    }

    /* renamed from: j */
    public final void mo123986j(boolean z, long j, long j2, int i) {
        long j3 = j;
        long j4 = j2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if ((z && !mo123984g(elapsedRealtime, j3) && !this.f397306j.mo123992g(elapsedRealtime, 0)) || this.f397306j.mo123991f(elapsedRealtime)) {
            this.f397306j.mo123993i(elapsedRealtime);
            ((C147256m) this.f397306j.f397310a.mo27525b()).mo124066i("Delayed execution skipped; delay=%d, account=%s, channelId=%s", Long.valueOf(j2), this.f397300d, this.f397299c);
        } else if (!this.f397306j.mo123992g(elapsedRealtime, j4)) {
            C147160t tVar = this.f397306j;
            tVar.f397320k = true;
            tVar.f397321l = elapsedRealtime + j4;
            C147306a aVar = tVar.f397323n;
            long j5 = j3 / 1000;
            long j6 = j4 / 1000;
            int i2 = true != C147266a.m240137h() ? 3 : i;
            if (((Boolean) aVar.f397594a.mo47371a()).booleanValue()) {
                C97263s sVar = aVar.f397595b;
                int i3 = i2 - 1;
                int i4 = i3 != 0 ? i3 != 2 ? 2 : 3 : 1;
                C118522by byVar = sVar.f271672a;
                if (byVar != null) {
                    sVar.f271673b.f271674a.mo103752c(byVar);
                    C118561t tVar2 = sVar.f271673b.f271674a;
                    C118522by byVar2 = sVar.f271672a;
                    C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
                    long millis = TimeUnit.SECONDS.toMillis(j5);
                    afVar.copyOnWrite();
                    C118472ag agVar = (C118472ag) afVar.instance;
                    agVar.f328821a |= 1;
                    agVar.f328822b = millis;
                    long millis2 = TimeUnit.SECONDS.toMillis(j6 - j5);
                    afVar.copyOnWrite();
                    C118472ag agVar2 = (C118472ag) afVar.instance;
                    agVar2.f328821a |= 2;
                    agVar2.f328823c = millis2;
                    afVar.copyOnWrite();
                    C118472ag agVar3 = (C118472ag) afVar.instance;
                    agVar3.f328821a |= 16;
                    agVar3.f328826f = false;
                    afVar.copyOnWrite();
                    C118472ag agVar4 = (C118472ag) afVar.instance;
                    agVar4.f328821a |= 8;
                    agVar4.f328825e = false;
                    int i5 = i4 - 1;
                    int i6 = i5 != 0 ? i5 != 2 ? 3 : 1 : 2;
                    afVar.copyOnWrite();
                    C118472ag agVar5 = (C118472ag) afVar.instance;
                    agVar5.f328824d = i6 - 1;
                    agVar5.f328821a |= 4;
                    tVar2.mo103754e(byVar2, (C118472ag) afVar.build());
                }
            }
            ((C147256m) this.f397306j.f397310a.mo27525b()).mo124066i("Scheduled for delayed execution; delay=%d, account=%s, channelId=%s", Long.valueOf(j2), this.f397300d, this.f397299c);
        } else {
            ((C147256m) this.f397306j.f397310a.mo27525b()).mo124066i("Throttling rejected; account=%s, channelId=%s", this.f397300d, this.f397299c);
        }
    }

    /* renamed from: k */
    public final void mo123987k(long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!mo123984g(elapsedRealtime, j)) {
            mo123978b();
            if (!this.f397306j.mo123992g(elapsedRealtime, 0)) {
                this.f397306j.mo123993i(elapsedRealtime);
                ((C147256m) this.f397306j.f397310a.mo27525b()).mo124066i("Scheduled for immediate execution; account=%s, channelId=%s", this.f397300d, this.f397299c);
                return;
            }
            return;
        }
        ((C147256m) this.f397306j.f397310a.mo27525b()).mo124066i("Immediate execution rejected; account=%s, channelId=%s", this.f397300d, this.f397299c);
    }

    /* renamed from: h */
    public final void mo123985h(int i) {
        int i2 = this.f397307k;
        if (i2 != i) {
            int i3 = i2 - 1;
            if (i2 != 0) {
                boolean z = false;
                if (i3 != 0) {
                    if (i3 == 1) {
                        if (i == 1 || i == 3 || i == 4) {
                            z = true;
                        }
                        C58838bb.m90868c(z);
                    } else if (i3 != 2) {
                        if (i3 == 3) {
                            C58838bb.m90883r(false);
                        }
                    }
                    this.f397307k = i;
                    return;
                }
                if (i == 2) {
                    z = true;
                }
                C58838bb.m90868c(z);
                this.f397307k = i;
                return;
            }
            throw null;
        }
    }
}
