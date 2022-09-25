package com.google.apps.tiktok.inject.p3654a.p3655a;

import android.support.p031v4.app.Fragment;
import androidx.lifecycle.C2319a;
import androidx.lifecycle.C2358bf;
import androidx.lifecycle.C2362bj;
import androidx.lifecycle.C2363bk;
import androidx.lifecycle.p127a.C2322c;
import com.google.android.apps.gsa.binaries.satin.app.awt;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.apps.tiktok.inject.a.a.b */
/* compiled from: PG */
final class C47187b implements C2363bk {

    /* renamed from: a */
    private final Set f122843a;

    /* renamed from: b */
    private final C2363bk f122844b;

    /* renamed from: c */
    private final C2319a f122845c;

    /* renamed from: com.google.apps.tiktok.inject.a.a.b$a */
    /* compiled from: PG */
    interface C47188a {
        /* renamed from: i */
        Map mo51097i();
    }

    public C47187b(Fragment fragment, C2363bk bkVar, Set set, awt awt) {
        this.f122843a = set;
        this.f122844b = bkVar;
        this.f122845c = new C47186a(fragment, fragment.getArguments(), awt);
    }

    /* renamed from: a */
    public final C2358bf mo634a(Class cls) {
        if (this.f122843a.contains(cls.getName())) {
            return this.f122845c.mo634a(cls);
        }
        return this.f122844b.mo634a(cls);
    }

    /* renamed from: b */
    public final /* synthetic */ C2358bf mo635b(Class cls, C2322c cVar) {
        return C2362bj.m6360a(this, cls);
    }
}
