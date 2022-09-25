package com.google.android.apps.search.googleapp.launcher.p10341b.p10351i;

import android.os.Build;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.view.View;
import com.google.android.apps.search.googleapp.accounts.p10124b.C133156d;
import com.google.android.apps.search.googleapp.launcher.minusone.p10353a.C136562b;
import com.google.android.apps.search.googleapp.launcher.minusone.p10353a.C136563c;
import com.google.android.apps.search.googleapp.launcher.p10341b.C136447c;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10344c.C136448a;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10344c.C136449b;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10344c.C136455h;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.C136533k;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.p10352a.C136505h;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.p10352a.C136508k;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import com.google.android.libraries.search.p2476a.p2479c.C32209j;
import com.google.android.libraries.search.p3025k.C38567u;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45983au;
import com.google.apps.tiktok.account.api.controller.C45985aw;
import com.google.apps.tiktok.account.api.controller.C45986ax;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.account.api.controller.C46052t;
import com.google.apps.tiktok.account.api.controller.C46054v;
import com.google.apps.tiktok.account.data.C46167as;
import com.google.apps.tiktok.account.p3603a.C45954d;
import com.google.apps.tiktok.dataservice.C46719bc;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4552o.p4559e.C59743a;
import dagger.hilt.android.internal.managers.C68324h;
import java.util.UUID;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.launcher.b.i.e */
/* compiled from: PG */
final class C136527e implements C45987ay {

    /* renamed from: a */
    final /* synthetic */ C136531i f371697a;

    public C136527e(C136531i iVar) {
        this.f371697a = iVar;
    }

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        View findViewById = this.f371697a.f122878z.findViewById(16908290);
        C136531i iVar = this.f371697a;
        AccountId accountId = awVar.f120815a.f120816a;
        iVar.f371716m.mo113057a("onAccountIdChanged");
        iVar.f371710g.f371401d = Optional.m71637of(accountId);
        iVar.f371711h.f371484f = Optional.m71637of(accountId);
        if (iVar.f371722s.isPresent()) {
            C136447c cVar = (C136447c) iVar.f371722s.get();
            iVar.f371711h.mo113051c(cVar.mo113054b(), cVar.mo113053a(), cVar.mo113055c());
            iVar.f371722s = Optional.empty();
        }
        boolean z = true;
        if (!iVar.f371721r && iVar.f371720q.isPresent()) {
            iVar.f371710g.mo113009c((UUID) iVar.f371720q.get());
            iVar.f371721r = true;
        }
        iVar.mo113160l();
        C136508k j = iVar.mo113158j();
        if (!(j == null || j.mo113103a() == null)) {
            iVar.f371716m.mo113057a("Remove old Acetone fragment");
            Fragment a = j.mo113103a();
            if (a != null) {
                C0154a aVar = new C0154a(j.f371625b.getChildFragmentManager());
                aVar.mo516m(a);
                aVar.mo509f();
            }
        }
        if (iVar.f371719p) {
            C28306ab.m52929e(findViewById);
        }
        C28313c a2 = iVar.f371707d.mo33805a(C28427h.m53115a(97964));
        a2.mo33861i(C28439i.f77216b);
        a2.mo33859g(C28375ak.m53061c(98125));
        a2.mo33859g(C45954d.m82060a(accountId));
        if (iVar.f371714k) {
            a2.mo33859g(C28375ak.m53060b(C59743a.ACETONE_VISUAL_ELEMENTS_SAMPLED_LOG_EVENT));
        }
        iVar.f371708e.mo33801b(findViewById, a2);
        iVar.f371719p = true;
        C136508k j2 = iVar.mo113158j();
        if (j2 != null && iVar.f122878z != null) {
            iVar.f371716m.mo113057a("Add new Acetone fragment");
            C136448a aVar2 = (C136448a) C136449b.f371488d.createBuilder();
            C136455h hVar = iVar.f371717n;
            aVar2.copyOnWrite();
            C136449b bVar = (C136449b) aVar2.instance;
            hVar.getClass();
            bVar.f371491b = hVar;
            bVar.f371490a |= 1;
            boolean z2 = iVar.f371723t;
            aVar2.copyOnWrite();
            C136449b bVar2 = (C136449b) aVar2.instance;
            bVar2.f371490a |= 2;
            bVar2.f371492c = z2;
            C136524b bVar3 = new C136524b();
            C68324h.m98669f(bVar3);
            C47247a.m84047b(bVar3, accountId);
            C47243l.m84039a(bVar3, (C136449b) aVar2.build());
            if (j2.mo113103a() != null) {
                z = false;
            }
            C58838bb.m90884s(z, "Must call removeChildFragment() before adding a new one");
            C0154a aVar3 = new C0154a(j2.f371625b.getChildFragmentManager());
            aVar3.mo689v(R.id.googleapp_content_view, bVar3, (String) null);
            aVar3.mo509f();
            C136533k a3 = bVar3.mo17754z();
            C136505h hVar2 = new C136505h(j2);
            if (Build.VERSION.SDK_INT >= 31) {
                C46801dp dpVar = a3.f371733f;
                C136563c cVar2 = a3.f371734g;
                dpVar.mo50707a(new C46719bc(cVar2.f371802a, new C136562b(cVar2), "BackgroundColorDataService"), new C136533k.C136534a(hVar2));
            }
            a3.f371736i = iVar.f371726w;
            Objects.requireNonNull(j2);
            a3.f371737j = new C136526d(j2);
            a3.mo113163b();
            a3.f371732e = iVar.f122878z;
            a3.mo113170i();
            float f = iVar.f371718o;
            if (f != -1.0f) {
                a3.mo113167f(f);
            }
            iVar.mo113161m();
            a3.mo113168g(j2.f371632i);
            if (j2.mo113109h()) {
                a3.mo113166e();
            } else {
                a3.mo113165d();
            }
        }
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        this.f371697a.f371716m.mo113057a("onAccountError");
        if ((!(th instanceof C46054v) || (!(th.getCause() instanceof C32209j) && !(th.getCause() instanceof C38567u))) && !(th instanceof C46052t) && !(th.getCause() instanceof C46167as)) {
            ((C59052c) ((C59052c) ((C59052c) C136531i.f371703a.mo56224b()).mo56382g(th)).mo56372aa(40781)).mo56386p("onAccountError");
            return;
        }
        C136531i iVar = this.f371697a;
        iVar.f371705b.mo50081d(((C133156d) iVar.f371706c).f362971a.mo111000b());
    }

    /* renamed from: c */
    public final /* synthetic */ void mo19984c() {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo19985d(C45986ax axVar) {
        C45983au.m82161a(this);
    }
}
