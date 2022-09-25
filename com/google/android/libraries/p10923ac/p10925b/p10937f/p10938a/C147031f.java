package com.google.android.libraries.p10923ac.p10925b.p10937f.p10938a;

import android.accounts.Account;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p10923ac.p10925b.p10927b.C146793f;
import com.google.android.libraries.p10923ac.p10925b.p10930c.p10931a.C146794a;
import com.google.android.libraries.p10923ac.p10925b.p10930c.p10931a.C146802i;
import com.google.android.libraries.p10923ac.p10925b.p10930c.p10931a.C146803j;
import com.google.android.libraries.p10923ac.p10925b.p10943j.C147112i;
import com.google.android.libraries.p10923ac.p10925b.p10943j.C147114k;
import com.google.android.libraries.p10923ac.p10925b.p10943j.C147116m;
import com.google.android.libraries.p10923ac.p10925b.p10944k.C147136ak;
import com.google.android.libraries.p10923ac.p10925b.p10945l.C147182p;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147256m;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10963e.C147266a;
import com.google.common.base.C58885cv;
import com.google.common.util.concurrent.C60933u;
import com.google.protos.p4895aw.p4902b.C64054dj;
import com.google.protos.p4895aw.p4902b.C64095m;
import com.google.protos.p4895aw.p4902b.C64098p;
import dagger.C68214a;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.ac.b.f.a.f */
/* compiled from: PG */
public final class C147031f implements C147030e, C146793f {

    /* renamed from: b */
    private static final C64095m f396993b = C64095m.f173283c;

    /* renamed from: c */
    private final Object f396994c = new Object();

    /* renamed from: d */
    private final C68214a f396995d;

    /* renamed from: e */
    private final C147136ak f396996e;

    /* renamed from: f */
    private final C147116m f396997f;

    /* renamed from: g */
    private final C64054dj f396998g;

    /* renamed from: h */
    private final C60933u f396999h = C60933u.m93072c();

    /* renamed from: i */
    private final C147266a f397000i;

    public C147031f(C68214a aVar, C147266a aVar2, C147116m mVar, C147136ak akVar) {
        this.f396995d = aVar;
        this.f397000i = aVar2;
        this.f396996e = akVar;
        this.f396997f = mVar;
        C146802i c = C146803j.m239219c();
        c.mo123665b(true);
        c.mo123666c((int) TimeUnit.DAYS.toSeconds(1));
        C146803j a = c.mo123664a();
        C146802i c2 = C146803j.m239219c();
        c2.mo123665b(true);
        c2.mo123666c(((Integer) new C58885cv(5).f156729a).intValue());
        C146803j a2 = c2.mo123664a();
        C146794a aVar3 = new C146794a();
        aVar3.mo123642d(2);
        aVar3.mo123640b(a);
        aVar3.mo123641c(a);
        aVar3.mo123643e(a2);
        aVar3.mo123644f(a2);
        aVar3.mo123645g();
        aVar3.mo123646h();
        this.f396998g = C147182p.m240013a(aVar3.mo123639a());
    }

    /* renamed from: a */
    public final void mo123638a(Account account, C64098p pVar) {
    }

    /* renamed from: b */
    public final long mo123834b(Account account) {
        return this.f396999h.mo57436b(account);
    }

    /* renamed from: c */
    public final void mo123835c(Account account) {
        mo123839g(account);
    }

    /* renamed from: d */
    public final void mo123836d(Account account) {
        mo123839g(account);
    }

    /* renamed from: e */
    public final void mo123837e(Account account, long j) {
        C64054dj g;
        synchronized (this.f396994c) {
            if (this.f396999h.mo57436b(account) == j) {
                Iterator it = this.f396997f.mo123934b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        ((C147256m) this.f396995d.mo27525b()).mo124066i("Dropping registration for account=%s", account);
                        this.f396997f.mo123937e(BuildConfig.FLAVOR, account, f396992a, C147114k.REGISTRATION_CLEANUP);
                        break;
                    }
                    C147112i iVar = (C147112i) it.next();
                    if (account.equals(iVar.mo123925d()) && (g = iVar.mo123929g()) != null && C147182p.m240014b(g)) {
                        break;
                    }
                }
            }
        }
    }

    /* renamed from: f */
    public final boolean mo123838f(Account account) {
        return !this.f396996e.mo123969e(f396992a, account);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo123839g(Account account) {
        if (C147266a.m240144o()) {
            ((C147256m) this.f396995d.mo27525b()).mo124066i("Issuing registration for account=%s", account);
            synchronized (this.f396994c) {
                this.f396997f.mo123940h(BuildConfig.FLAVOR, account, f396992a, this.f396998g, f396993b);
                this.f396999h.mo57435a(account, 1);
            }
            this.f396996e.mo123970h(f396992a, account);
        }
    }
}
