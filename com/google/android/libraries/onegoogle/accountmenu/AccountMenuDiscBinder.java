package com.google.android.libraries.onegoogle.accountmenu;

import android.util.Log;
import androidx.core.p098j.C2043bi;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2391v;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.account.disc.C30208h;
import com.google.android.libraries.onegoogle.account.disc.C30213m;
import com.google.android.libraries.onegoogle.account.p2345a.C30158c;
import com.google.android.libraries.onegoogle.account.p2347c.C30167a;
import com.google.android.libraries.onegoogle.accountmanagement.C30281j;
import com.google.android.libraries.onegoogle.accountmanagement.C30282k;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30305n;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30306o;
import com.google.android.libraries.onegoogle.common.C30914an;

/* compiled from: PG */
public final class AccountMenuDiscBinder {

    /* renamed from: f */
    private static final String f81892f = "AccountMenuDiscBinder";

    /* renamed from: a */
    public final AccountParticleDisc f81893a;

    /* renamed from: b */
    public final C30305n f81894b;

    /* renamed from: c */
    public final C30208h f81895c = new C30318b(this);

    /* renamed from: d */
    public final C30282k f81896d = new C30487f(this);

    /* renamed from: e */
    public final C2376g f81897e = new C2376g() {
        /* renamed from: gV */
        public final /* synthetic */ void mo3520gV(C2391v vVar) {
        }

        /* renamed from: gW */
        public final /* synthetic */ void mo3521gW(C2391v vVar) {
        }

        /* renamed from: gX */
        public final void mo3522gX(C2391v vVar) {
            AccountMenuDiscBinder accountMenuDiscBinder = AccountMenuDiscBinder.this;
            AccountParticleDisc accountParticleDisc = accountMenuDiscBinder.f81893a;
            accountParticleDisc.f81550d.remove(accountMenuDiscBinder.f81895c);
        }

        /* renamed from: gY */
        public final void mo3523gY(C2391v vVar) {
            AccountMenuDiscBinder accountMenuDiscBinder = AccountMenuDiscBinder.this;
            AccountParticleDisc accountParticleDisc = accountMenuDiscBinder.f81893a;
            accountParticleDisc.f81550d.add(accountMenuDiscBinder.f81895c);
            AccountMenuDiscBinder.this.mo35799a();
        }

        /* renamed from: gZ */
        public final void mo3524gZ(C2391v vVar) {
            C30306o i = AccountMenuDiscBinder.this.f81894b.mo35858i();
            i.f81934a.f81880a.add(AccountMenuDiscBinder.this.f81896d);
            AccountMenuDiscBinder.this.mo35800b();
        }

        /* renamed from: ha */
        public final void mo3525ha(C2391v vVar) {
            C30306o i = AccountMenuDiscBinder.this.f81894b.mo35858i();
            i.f81934a.f81880a.remove(AccountMenuDiscBinder.this.f81896d);
        }
    };

    private AccountMenuDiscBinder(C30305n nVar, AccountParticleDisc accountParticleDisc) {
        accountParticleDisc.getClass();
        this.f81893a = accountParticleDisc;
        nVar.getClass();
        this.f81894b = nVar;
    }

    @Deprecated
    /* renamed from: c */
    public static void m56343c(C2391v vVar, C30305n nVar, AccountParticleDisc accountParticleDisc) {
        accountParticleDisc.mo35593k(nVar.mo35859j().mo36092d());
        C30213m c = nVar.mo35853c();
        C30158c b = nVar.mo35852b();
        nVar.mo35867r();
        accountParticleDisc.mo35600r(c, b);
        C30330c cVar = new C30330c(vVar, new AccountMenuDiscBinder(nVar, accountParticleDisc));
        if (C2043bi.m5569aw(accountParticleDisc)) {
            cVar.onViewAttachedToWindow(accountParticleDisc);
        }
        accountParticleDisc.addOnAttachStateChangeListener(cVar);
    }

    /* renamed from: a */
    public final void mo35799a() {
        String str;
        String str2;
        C30306o i = this.f81894b.mo35858i();
        if (!i.f81934a.mo35794b().isEmpty()) {
            Object c = C30281j.m56319c(i.f81934a.f81883d);
            str = BuildConfig.FLAVOR;
            if (c != null) {
                Object obj = this.f81893a.f81559m;
                C30158c b = this.f81894b.mo35852b();
                if (obj == null) {
                    str2 = null;
                } else {
                    str2 = String.valueOf(this.f81893a.getContext().getString(R.string.og_signed_in_user_a11y_, new Object[]{C30167a.m56043a(obj, b)})).concat(" ");
                    String e = this.f81893a.mo35587e();
                    if (!e.isEmpty()) {
                        str2 = str2 + e + " ";
                    }
                }
                if (!c.equals(obj)) {
                    String str3 = f81892f;
                    Object[] objArr = new Object[1];
                    if (obj == null) {
                        str = " Disc account null";
                    }
                    objArr[0] = str;
                    Log.w(str3, String.format("Disc account not the same as selected account.%s", objArr));
                }
                str = str2;
            }
            if (str != null) {
                str = str.concat(String.valueOf(this.f81893a.getContext().getString(R.string.og_account_particle_disc_not_signed_in_a11y)));
            }
        } else {
            str = this.f81893a.getContext().getString(R.string.og_account_particle_disc_no_accounts_available_a11y);
        }
        C30914an.m57706a(new C30285a(this, str));
    }

    /* renamed from: b */
    public final void mo35800b() {
        C30281j jVar = this.f81894b.mo35858i().f81934a;
        if (jVar.f81882c) {
            this.f81893a.mo35592j(C30281j.m56319c(jVar.f81883d));
        }
    }
}
