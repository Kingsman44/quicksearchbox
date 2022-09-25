package com.google.android.libraries.onegoogle.accountmenu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.C0678gm;
import android.util.Log;
import android.widget.ImageView;
import androidx.core.p098j.C2043bi;
import androidx.lifecycle.C2390u;
import androidx.lifecycle.C2391v;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.accounts.p10126ui.features.C133301h;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.account.disc.C30190ar;
import com.google.android.libraries.onegoogle.account.disc.C30208h;
import com.google.android.libraries.onegoogle.account.disc.C30213m;
import com.google.android.libraries.onegoogle.account.p2345a.C30158c;
import com.google.android.libraries.onegoogle.account.p2347c.C30167a;
import com.google.android.libraries.onegoogle.account.particle.C30238l;
import com.google.android.libraries.onegoogle.accountmanagement.C30281j;
import com.google.android.libraries.onegoogle.accountmanagement.C30282k;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30305n;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30306o;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30312u;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30313v;
import com.google.android.libraries.onegoogle.accountmenu.cards.C30348ac;
import com.google.android.libraries.onegoogle.accountmenu.cards.C30352ag;
import com.google.android.libraries.onegoogle.accountmenu.cards.C30392bt;
import com.google.android.libraries.onegoogle.accountmenu.features.AccountMessagesFeature;
import com.google.android.libraries.onegoogle.accountmenu.features.C30629l;
import com.google.android.libraries.onegoogle.accountmenu.features.C30636s;
import com.google.android.libraries.onegoogle.accountmenu.features.criticalalert.C30524x8bdc8f55;
import com.google.android.libraries.onegoogle.accountmenu.features.criticalalert.C30528d;
import com.google.android.libraries.onegoogle.accountmenu.features.p2364e.C30545a;
import com.google.android.libraries.onegoogle.accountmenu.p2376g.C30643a;
import com.google.android.libraries.onegoogle.common.C30905ae;
import com.google.android.libraries.onegoogle.common.C30914an;
import com.google.android.libraries.onegoogle.common.CirclePulseDrawable;
import com.google.android.libraries.onegoogle.p2380c.C30860b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.protos.p4868ao.p4869a.p4870a.C63643a;
import com.google.protos.p4868ao.p4869a.p4870a.C63644b;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.z */
/* compiled from: PG */
public final class C30799z {

    /* renamed from: f */
    private static final String f83104f = "z";

    /* renamed from: a */
    public final C30305n f83105a;

    /* renamed from: b */
    public final SelectedAccountDisc f83106b;

    /* renamed from: c */
    public final C30282k f83107c = new C30798y(this);

    /* renamed from: d */
    public final C30312u f83108d = new C30792s(this);

    /* renamed from: e */
    public final C30208h f83109e = new C30793t(this);

    public C30799z(SelectedAccountDisc selectedAccountDisc, C30305n nVar) {
        this.f83105a = nVar;
        this.f83106b = selectedAccountDisc;
        C30317ag agVar = new C30317ag(nVar, selectedAccountDisc);
        C58480gp gpVar = new C58480gp(4);
        gpVar.mo55395g(agVar);
        if (nVar.mo35860k().mo36181n().mo56113h()) {
            C30545a aVar = (C30545a) nVar.mo35860k().mo36181n().mo56107c();
        }
        selectedAccountDisc.f81905f = new C30701i(gpVar.mo55394f());
    }

    /* renamed from: a */
    public final void mo36482a(C2391v vVar) {
        C58485gu guVar;
        SelectedAccountDisc selectedAccountDisc = this.f83106b;
        C30305n nVar = this.f83105a;
        selectedAccountDisc.f81906g = nVar;
        nVar.mo35864o().mo35821a(selectedAccountDisc, 75245);
        C58838bb.m90884s(selectedAccountDisc.f81908i != -1, "maxDiscContentSize has to be set before calling initialize");
        selectedAccountDisc.f81902c.mo35590h();
        selectedAccountDisc.f81902c.mo35593k(nVar.mo35859j().mo36092d());
        AccountParticleDisc accountParticleDisc = selectedAccountDisc.f81902c;
        C30213m c = nVar.mo35853c();
        C30158c b = nVar.mo35852b();
        nVar.mo35867r();
        accountParticleDisc.mo35600r(c, b);
        selectedAccountDisc.f81902c.mo35589g(nVar.mo35864o());
        int dimensionPixelSize = (selectedAccountDisc.getResources().getDimensionPixelSize(R.dimen.og_apd_default_disc_min_touch_target_size) - selectedAccountDisc.f81902c.mo35584a()) / 2;
        if (nVar.mo35860k().mo36181n().mo56113h()) {
            selectedAccountDisc.f81901b.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            ImageView imageView = selectedAccountDisc.f81901b;
            C30545a aVar = (C30545a) nVar.mo35860k().mo36181n().mo56107c();
            Context context = selectedAccountDisc.getContext();
            C30643a aVar2 = new C30643a(selectedAccountDisc.getContext());
            Drawable c2 = C0678gm.m2375e().mo3100c(context, R.drawable.ic_incognito_circle_without_margins_black_24dp);
            C30905ae.m57696b(c2, aVar2.f82734c);
            imageView.setImageDrawable(c2);
        }
        C58480gp gpVar = new C58480gp(4);
        Context d = nVar.mo35860k().mo36173f().mo36585d(selectedAccountDisc.getContext());
        if (nVar.mo35859j().mo36092d() && vVar != null) {
            C30636s d2 = nVar.mo35860k().mo36171d();
            C30158c b2 = nVar.mo35852b();
            ExecutorService s = nVar.mo35868s();
            if (selectedAccountDisc.f81902c.f81558l != null) {
                guVar = C58485gu.m89845m();
            } else {
                C58833ax c3 = d2.mo36146c();
                if (c3.mo56113h()) {
                    C30629l lVar = (C30629l) c3.mo56107c();
                    if (!lVar.mo36291a().mo56113h()) {
                        guVar = C58485gu.m89845m();
                    } else {
                        C30352ag agVar = (C30352ag) lVar.mo36291a().mo56107c();
                        C58480gp gpVar2 = new C58480gp(4);
                        if (agVar.mo35929a().mo56113h()) {
                            gpVar2.mo55395g(new C30348ac((C133301h) agVar.mo35929a().mo56107c(), d, b2, s));
                        }
                        if (agVar.mo35930b().mo56113h()) {
                            gpVar2.mo55395g(new C30392bt((C133301h) agVar.mo35930b().mo56107c(), d, b2, s));
                        }
                        guVar = gpVar2.mo55394f();
                    }
                } else {
                    guVar = C58485gu.m89845m();
                }
            }
            gpVar.mo55396h(guVar);
        }
        C58833ax j = nVar.mo35860k().mo36177j();
        if (j.mo56113h() && vVar != null) {
            C30528d dVar = new C30528d(d, vVar, (C30238l) j.mo56107c());
            int a = selectedAccountDisc.mo35803a();
            CirclePulseDrawable circlePulseDrawable = dVar.f82460d.f82485a;
            circlePulseDrawable.f83306b = a;
            circlePulseDrawable.mo36571a();
            dVar.f82463g = true;
            vVar.getLifecycle().mo5790b(new C30524x8bdc8f55(nVar.mo35858i(), dVar));
            gpVar.mo55395g(dVar);
        }
        C58833ax h = nVar.mo35860k().mo36175h();
        if (h.mo56113h() && vVar != null) {
            gpVar.mo55395g(((AccountMessagesFeature) h.mo56107c()).mo36127g(d));
            vVar.getLifecycle().mo5790b((C2390u) h.mo56107c());
        }
        C58485gu f = gpVar.mo55394f();
        if (!f.isEmpty()) {
            selectedAccountDisc.f81907h = new C30190ar(f, vVar);
            selectedAccountDisc.f81902c.mo35595m(selectedAccountDisc.f81907h);
        }
        C30796w wVar = new C30796w(this);
        C30797x xVar = new C30797x(this);
        this.f83106b.addOnAttachStateChangeListener(wVar);
        this.f83106b.addOnAttachStateChangeListener(xVar);
        if (C2043bi.m5569aw(this.f83106b)) {
            wVar.onViewAttachedToWindow(this.f83106b);
            xVar.onViewAttachedToWindow(this.f83106b);
        }
    }

    /* renamed from: b */
    public final void mo36483b(Object obj) {
        C30860b m = this.f83105a.mo35862m();
        C63643a aVar = (C63643a) C63644b.f172119g.createBuilder();
        aVar.copyOnWrite();
        C63644b bVar = (C63644b) aVar.instance;
        bVar.f172123c = 8;
        bVar.f172121a |= 2;
        aVar.copyOnWrite();
        C63644b bVar2 = (C63644b) aVar.instance;
        bVar2.f172125e = 8;
        bVar2.f172121a |= 32;
        aVar.copyOnWrite();
        C63644b bVar3 = (C63644b) aVar.instance;
        bVar3.f172124d = 3;
        bVar3.f172121a = 8 | bVar3.f172121a;
        aVar.copyOnWrite();
        C63644b bVar4 = (C63644b) aVar.instance;
        bVar4.f172122b = 36;
        bVar4.f172121a |= 1;
        m.mo35875a(obj, (C63644b) aVar.build());
    }

    /* renamed from: c */
    public final void mo36484c() {
        String str;
        if (this.f83105a.mo35858i().f81934a.f81882c) {
            Context context = this.f83106b.getContext();
            if (this.f83105a.mo35866q().mo56113h() && ((C30313v) this.f83105a.mo35866q().mo56107c()).f81976b && ((C30545a) this.f83105a.mo35860k().mo36181n().mo56111f()) != null) {
                str = context.getString(R.string.og_incognito_disc) + "\n" + context.getString(R.string.og_incognito_menu);
            } else if (this.f83105a.mo35858i().f81934a.mo35794b().isEmpty()) {
                str = context.getString(R.string.og_account_particle_disc_no_accounts_available_a11y);
            } else {
                Object c = C30281j.m56319c(this.f83105a.mo35858i().f81934a.f81883d);
                if (c == null) {
                    str = context.getString(R.string.og_account_and_settings) + "\n" + context.getString(R.string.og_choose_an_account_title);
                } else {
                    Object obj = this.f83106b.f81902c.f81559m;
                    boolean equals = c.equals(obj);
                    String str2 = BuildConfig.FLAVOR;
                    if (!equals) {
                        String str3 = f83104f;
                        Object[] objArr = new Object[1];
                        objArr[0] = obj == null ? " Disc account null" : str2;
                        Log.w(str3, String.format("Disc account not the same as selected account.%s", objArr));
                    }
                    AccountParticleDisc accountParticleDisc = this.f83106b.f81902c;
                    C30158c b = this.f83105a.mo35852b();
                    Object obj2 = accountParticleDisc.f81559m;
                    if (obj2 != null) {
                        str2 = C30167a.m56043a(obj2, b);
                        String e = accountParticleDisc.mo35587e();
                        if (!e.isEmpty()) {
                            str2 = str2 + "\n" + e;
                        }
                    }
                    String string = context.getString(R.string.og_account_and_settings);
                    if (str2.isEmpty()) {
                        str = string;
                    } else {
                        str = context.getString(R.string.og_signed_in_as_account, new Object[]{str2}) + "\n" + string;
                    }
                }
            }
            C30914an.m57706a(new C30795v(this, str));
            return;
        }
        C30914an.m57706a(new C30794u(this));
    }

    /* renamed from: d */
    public final void mo36485d(boolean z) {
        C30914an.m57706a(new C30791r(this, z));
    }

    /* renamed from: e */
    public final void mo36486e() {
        C30306o i = this.f83105a.mo35858i();
        if (i.f81934a.f81882c) {
            C30914an.m57706a(new C30790q(this, i));
        }
    }
}
