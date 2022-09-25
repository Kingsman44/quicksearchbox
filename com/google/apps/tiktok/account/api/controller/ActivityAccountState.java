package com.google.apps.tiktok.account.api.controller;

import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.util.Log;
import androidx.lifecycle.C2344as;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2391v;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46215j;
import com.google.apps.tiktok.inject.p3654a.C47183a;
import com.google.apps.tiktok.inject.p3654a.C47194c;
import com.google.apps.tiktok.inject.p3654a.C47195d;
import com.google.apps.tiktok.inject.p3657c.C47215a;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58557jl;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62974ct;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.C68286a;
import dagger.hilt.android.internal.p5302a.C68308f;
import dagger.hilt.p5299a.C68288b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class ActivityAccountState implements C2376g {

    /* renamed from: a */
    public final C45990ba f120781a;

    /* renamed from: b */
    public final boolean f120782b;

    /* renamed from: c */
    public Object f120783c = null;

    /* renamed from: d */
    public int f120784d = -1;

    /* renamed from: e */
    public C46215j f120785e = C46215j.f121154k;

    /* renamed from: f */
    public int f120786f = 0;

    /* renamed from: g */
    private final C47215a f120787g;

    /* renamed from: h */
    private final KeepStateCallbacksHandler f120788h;

    /* renamed from: i */
    private final List f120789i = new ArrayList();

    /* renamed from: j */
    private final C62921ba f120790j;

    /* renamed from: k */
    private final C47195d f120791k;

    /* renamed from: com.google.apps.tiktok.account.api.controller.ActivityAccountState$a */
    /* compiled from: PG */
    public interface C45961a {
    }

    public ActivityAccountState(C47215a aVar, C45990ba baVar, KeepStateCallbacksHandler keepStateCallbacksHandler, C62921ba baVar2, C47195d dVar) {
        this.f120787g = aVar;
        this.f120781a = baVar;
        this.f120788h = keepStateCallbacksHandler;
        this.f120790j = baVar2;
        Boolean bool = false;
        this.f120782b = bool.booleanValue();
        this.f120791k = dVar;
        aVar.getLifecycle().mo5790b(this);
        aVar.getSavedStateRegistry().mo8585b("tiktok_activity_account_state_saved_instance_state", new C46005bp(this));
    }

    /* renamed from: m */
    private static void m82104m(FragmentManager fragmentManager) {
        fragmentManager.mo463ad((String) null, -1, 1);
        List<Fragment> i = fragmentManager.f634a.mo677i();
        if (i != null && !i.isEmpty()) {
            C0154a aVar = new C0154a(fragmentManager);
            for (Fragment fragment : i) {
                if (!(fragment instanceof C68288b) || !(((C68288b) fragment).mo17653jN() instanceof C45961a)) {
                    FragmentManager childFragmentManager = fragment.getChildFragmentManager();
                    childFragmentManager.mo467ah();
                    m82104m(childFragmentManager);
                } else {
                    aVar.mo516m(fragment);
                }
            }
            if (!aVar.f809e.isEmpty()) {
                aVar.f824t = true;
                aVar.mo509f();
            }
        }
    }

    /* renamed from: g */
    public final void mo50100g() {
        this.f120787g.mo51122q().mo467ah();
    }

    /* renamed from: gV */
    public final void mo3520gV(C2391v vVar) {
        Bundle a = this.f120787g.getSavedStateRegistry().f13079d ? this.f120787g.getSavedStateRegistry().mo8584a("tiktok_activity_account_state_saved_instance_state") : null;
        if (a == null) {
            return;
        }
        if (this.f120782b || !a.getBoolean("tiktok_accounts_disabled")) {
            this.f120784d = a.getInt("state_account_id", -1);
            try {
                this.f120785e = (C46215j) ProtoParsers.m95520c(a, "state_account_info", C46215j.f121154k, this.f120790j);
                int i = a.getInt("state_account_state", 0);
                this.f120786f = i;
                if (i == 0) {
                    return;
                }
                if (i == 1) {
                    this.f120781a.mo50132d();
                } else if (i == 2) {
                    C45990ba baVar = this.f120781a;
                    AccountId.m82057b(this.f120784d);
                    baVar.mo50130b(this.f120785e);
                } else if (i == 3) {
                    this.f120781a.mo50131c();
                } else {
                    throw new IllegalStateException("Undefined account state. Did you forget to update this switch statement?");
                }
            } catch (C62974ct e) {
                throw new RuntimeException("Failed to get AccountInfo from Bundle.", e);
            }
        } else {
            m82104m(this.f120787g.mo51122q());
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

    /* renamed from: h */
    public final boolean mo50101h() {
        C19559g.m37304c();
        return this.f120784d != -1;
    }

    /* renamed from: ha */
    public final /* synthetic */ void mo3525ha(C2391v vVar) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo50103j() {
        mo50102i(-1, C46215j.f121154k, 0);
    }

    /* renamed from: k */
    public final void mo50104k(Throwable th) {
        C58838bb.m90866a(th, "Must provide error.");
        if (Log.isLoggable("ActivityAccountState", 3)) {
            Log.d("ActivityAccountState", "Switch To Error", th);
        }
        mo50102i(-1, C46215j.f121154k, 3);
        this.f120781a.mo50131c();
        C45990ba baVar = this.f120781a;
        C47558bi a = C47831fm.m85006a("onAccountError");
        try {
            for (C45987ay b : baVar.f120818a) {
                b.mo19983b(th);
            }
            Iterator it = baVar.f120819b.iterator();
            while (it.hasNext()) {
                ((C45987ay) it.next()).mo19983b(th);
            }
            a.close();
            return;
        } catch (Throwable th2) {
            C45988az.m82167a(th, th2);
        }
        throw th;
    }

    /* renamed from: l */
    public final void mo50105l() {
        if (Log.isLoggable("ActivityAccountState", 3)) {
            Log.d("ActivityAccountState", "Switch To Loading");
        }
        if (mo50102i(-1, C46215j.f121154k, 1)) {
            this.f120781a.mo50132d();
            C45990ba baVar = this.f120781a;
            C47558bi a = C47831fm.m85006a("onAccountLoading");
            try {
                for (C45987ay c : baVar.f120818a) {
                    c.mo19984c();
                }
                Iterator it = baVar.f120819b.iterator();
                while (it.hasNext()) {
                    ((C45987ay) it.next()).mo19984c();
                }
                a.close();
                return;
            } catch (Throwable th) {
                C45988az.m82167a(th, th);
            }
        } else {
            return;
        }
        throw th;
    }

    /* renamed from: i */
    public final boolean mo50102i(int i, C46215j jVar, int i2) {
        C68308f b;
        int i3 = i;
        int i4 = i2;
        jVar.getClass();
        C19559g.m37304c();
        this.f120788h.mo50112g();
        boolean z = i3 != this.f120784d;
        boolean z2 = i4 != this.f120786f;
        if (z || z2) {
            mo50100g();
        }
        if (z || (z2 && this.f120786f != 0)) {
            m82104m(this.f120787g.mo51122q());
        }
        if (z) {
            int i5 = this.f120784d;
            this.f120784d = i3;
            C47195d dVar = this.f120791k;
            AccountId b2 = AccountId.m82057b(i);
            synchronized (dVar.f122855a) {
                Set c = dVar.mo51103c();
                if (!c.isEmpty()) {
                    AccountId accountId = (AccountId) C58557jl.m90133n(c);
                    synchronized (dVar.f122855a) {
                        C58838bb.m90883r(dVar.f122856b.containsKey(accountId));
                        dVar.f122856b.remove(accountId);
                        C47194c a = dVar.f122857c.f122861b.mo51094a(accountId);
                        synchronized (a.f122851b) {
                            for (String str : a.f122850a.mo5756c()) {
                                a.f122850a.mo5760g(str);
                                C2344as asVar = a.f122850a;
                                C69664n.m101061g(str, "key");
                                asVar.f6544b.remove(str);
                            }
                            b = a.f122852c != null ? ((C47183a.C47185b) C68286a.m98629a(a.f122852c, C47183a.C47185b.class)).mo51096b() : null;
                            a.f122852c = null;
                        }
                        if (b != null) {
                            b.mo60321a();
                        }
                    }
                }
                dVar.f122856b.put(b2, dVar.mo51101a(b2));
            }
            if (Log.isLoggable("ActivityAccountState", 3)) {
                int i6 = this.f120784d;
                Log.d("ActivityAccountState", "Account Transition: " + i5 + " > " + i6);
            }
        }
        if (this.f120786f == 0) {
            for (C46006bq a2 : this.f120789i) {
                a2.mo50142a();
            }
        }
        this.f120785e = jVar;
        this.f120786f = i4;
        if (z || z2) {
            return true;
        }
        return false;
    }
}
