package com.google.apps.tiktok.inject.p3657c.p3658a;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import com.google.android.apps.gsa.binaries.satin.app.C74163mv;
import com.google.android.apps.gsa.binaries.satin.app.C74177nk;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3654a.C47195d;
import com.google.common.base.C58838bb;
import dagger.hilt.C68286a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.apps.tiktok.inject.c.a.f */
/* compiled from: PG */
public class C47222f implements C68288b {

    /* renamed from: a */
    private volatile Object f122885a;

    /* renamed from: b */
    private final Object f122886b = new Object();

    /* renamed from: c */
    private final Fragment f122887c;

    /* renamed from: d */
    private final boolean f122888d;

    /* renamed from: com.google.apps.tiktok.inject.c.a.f$a */
    /* compiled from: PG */
    public interface C47223a {
        /* renamed from: cV */
        C74163mv mo51135cV();
    }

    /* renamed from: com.google.apps.tiktok.inject.c.a.f$b */
    /* compiled from: PG */
    public interface C47224b {
        /* renamed from: eh */
        C74177nk mo51136eh();
    }

    /* renamed from: com.google.apps.tiktok.inject.c.a.f$c */
    /* compiled from: PG */
    public interface C47225c {
        /* renamed from: bO */
        C47195d mo51137bO();
    }

    public C47222f(Fragment fragment, boolean z) {
        this.f122887c = fragment;
        this.f122888d = z;
    }

    /* renamed from: a */
    public static final Context m84008a(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo51134b(Fragment fragment) {
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        Object obj;
        if (this.f122885a == null) {
            synchronized (this.f122886b) {
                if (this.f122885a == null) {
                    C58838bb.m90866a(this.f122887c.getHost(), "Sting Fragments must be attached before creating the component.");
                    Fragment fragment = this.f122887c;
                    C58838bb.m90887v(fragment.getHost() instanceof C68288b, "Sting Fragments must be attached to an @Sting Activity or @TikTokFragmentHost. Found: %s", fragment.getHost().getClass());
                    mo51134b(this.f122887c);
                    if (this.f122888d) {
                        C47195d bO = ((C47225c) C68286a.m98629a(this.f122887c.getHost(), C47225c.class)).mo51137bO();
                        Fragment fragment2 = this.f122887c;
                        Bundle arguments = fragment2.getArguments();
                        boolean z = false;
                        if (arguments != null && arguments.containsKey("TIKTOK_FRAGMENT_ACCOUNT_ID")) {
                            z = true;
                        }
                        C58838bb.m90887v(z, "No AccountId found in Bundle. Did you forget to add an account id?\n\tFragment: %s", fragment2.getClass());
                        C74163mv cV = ((C47223a) C68286a.m98629a(bO.mo51102b(AccountId.m82057b(arguments.getInt("TIKTOK_FRAGMENT_ACCOUNT_ID"))), C47223a.class)).mo51135cV();
                        cV.f206633a = this.f122887c;
                        obj = cV.mo69422a();
                    } else {
                        C74177nk eh = ((C47224b) ((C68288b) this.f122887c.getHost()).mo17653jN()).mo51136eh();
                        eh.f207100a = this.f122887c;
                        obj = eh.mo70017a();
                    }
                    this.f122885a = obj;
                }
            }
        }
        return this.f122885a;
    }
}
