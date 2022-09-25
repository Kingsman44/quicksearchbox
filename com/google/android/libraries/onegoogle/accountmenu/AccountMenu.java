package com.google.android.libraries.onegoogle.accountmenu;

import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.support.p033v7.app.C0359at;
import android.support.p033v7.app.C0395p;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2391v;
import com.google.android.libraries.onegoogle.accountmanagement.C30281j;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30305n;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30306o;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30313v;
import com.google.android.libraries.onegoogle.accountmenu.internal.C30733bd;
import com.google.android.libraries.onegoogle.accountmenu.internal.C30759cc;
import com.google.android.libraries.onegoogle.p2380c.C30860b;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.protos.p4868ao.p4869a.p4870a.C63643a;
import com.google.protos.p4868ao.p4869a.p4870a.C63644b;

@Deprecated
/* compiled from: PG */
public final class AccountMenu implements C2376g {

    /* renamed from: a */
    public static final String f81888a;

    /* renamed from: b */
    static final String f81889b;

    /* renamed from: c */
    public final FragmentManager f81890c;

    /* renamed from: d */
    private final C30305n f81891d;

    static {
        Class<AccountMenu> cls = AccountMenu.class;
        f81888a = String.valueOf(cls.getName()).concat(".standaloneAccountMenuDialogFragment");
        f81889b = String.valueOf(cls.getName()).concat(".incognitoOffAccountMenuDialogFragment");
    }

    private AccountMenu(FragmentManager fragmentManager, C2384o oVar, C30305n nVar) {
        this.f81890c = fragmentManager;
        this.f81891d = nVar;
        oVar.mo5790b(this);
    }

    /* renamed from: g */
    public static AccountMenu m56331g(Fragment fragment, C30305n nVar) {
        return new AccountMenu(fragment.getChildFragmentManager(), fragment.getLifecycle(), nVar);
    }

    /* renamed from: h */
    public static AccountMenu m56332h(C0395p pVar, C30305n nVar) {
        return new AccountMenu(pVar.mo545jw(), pVar.getLifecycle(), nVar);
    }

    /* renamed from: i */
    public static C30733bd m56333i(FragmentManager fragmentManager) {
        return (C30733bd) fragmentManager.f634a.mo671c(f81889b);
    }

    /* renamed from: j */
    public static C30759cc m56334j(FragmentManager fragmentManager) {
        return (C30759cc) fragmentManager.f634a.mo671c(f81888a);
    }

    /* renamed from: l */
    private final boolean m56335l(C0359at atVar) {
        return !atVar.isAdded() && !this.f81890c.mo461ab();
    }

    /* renamed from: gV */
    public final void mo3520gV(C2391v vVar) {
        vVar.getLifecycle().mo5791c(this);
        C30759cc j = m56334j(this.f81890c);
        if (j != null && !j.mo36411e()) {
            j.mo36409c(this.f81891d);
        }
        C30733bd i = m56333i(this.f81890c);
        if (i != null && !i.mo36411e()) {
            i.mo36434a(this.f81891d);
        }
    }

    /* renamed from: gW */
    public final /* synthetic */ void mo3521gW(C2391v vVar) {
    }

    /* renamed from: gX */
    public final /* synthetic */ void mo3522gX(C2391v vVar) {
    }

    /* renamed from: gY */
    public final /* synthetic */ void mo3523gY(C2391v vVar) {
    }

    /* renamed from: gZ */
    public final /* synthetic */ void mo3524gZ(C2391v vVar) {
    }

    /* renamed from: ha */
    public final /* synthetic */ void mo3525ha(C2391v vVar) {
    }

    /* renamed from: k */
    public final void mo35798k(int i) {
        C19559g.m37304c();
        C58833ax q = this.f81891d.mo35866q();
        boolean z = false;
        if (!q.mo56113h() || !((C30313v) q.mo56107c()).f81976b) {
            C30306o i2 = this.f81891d.mo35858i();
            C58838bb.m90884s(i2.f81934a.f81882c, "Cannot open account menu before model is loaded.");
            C58838bb.m90884s(!i2.f81934a.mo35794b().isEmpty(), "Cannot open account menu when the account list is empty");
            C30759cc j = m56334j(this.f81890c);
            if (j == null) {
                j = new C30759cc();
                Bundle bundle = new Bundle();
                if (i != -1) {
                    bundle.putInt("$OneGoogle$AnchorId", i);
                }
                j.setArguments(bundle);
                j.mo36409c(this.f81891d);
            } else {
                if (j.f83020e == i) {
                    z = true;
                }
                C58838bb.m90869d(z, "Anchor cannot be changed while account menu is visible.");
            }
            if (m56335l(j)) {
                j.showNow(this.f81890c, f81888a);
                C30860b m = this.f81891d.mo35862m();
                Object c = C30281j.m56319c(i2.f81934a.f81883d);
                C63643a aVar = (C63643a) C63644b.f172119g.createBuilder();
                aVar.copyOnWrite();
                C63644b bVar = (C63644b) aVar.instance;
                bVar.f172123c = 1;
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
                m.mo35875a(c, (C63644b) aVar.build());
                return;
            }
            return;
        }
        C58833ax q2 = this.f81891d.mo35866q();
        C58838bb.m90884s(q2.mo56113h(), "Incognito support is not enabled.");
        C58838bb.m90884s(((C30313v) q2.mo56107c()).f81976b, "Incognito mode is off.");
        C30733bd i3 = m56333i(this.f81890c);
        if (i3 == null) {
            i3 = new C30733bd();
            Bundle bundle2 = new Bundle();
            if (i != -1) {
                bundle2.putInt("$OneGoogle$AnchorId", i);
            }
            i3.setArguments(bundle2);
            i3.mo36434a(this.f81891d);
        } else {
            if (i3.f82958b == i) {
                z = true;
            }
            C58838bb.m90869d(z, "Anchor cannot be changed while account menu is visible.");
        }
        if (m56335l(i3)) {
            i3.showNow(this.f81890c, f81889b);
        }
    }
}
