package com.google.android.libraries.storage.protostore;

import android.content.Context;
import com.google.common.base.C58838bb;
import com.google.common.base.C58881cr;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.storage.protostore.cd */
/* compiled from: PG */
public final class C42936cd {

    /* renamed from: a */
    public final Context f112319a;

    /* renamed from: b */
    public final Executor f112320b;

    /* renamed from: c */
    public String f112321c;

    /* renamed from: d */
    public Set f112322d;

    /* renamed from: e */
    public boolean f112323e = false;

    /* renamed from: f */
    public boolean f112324f = false;

    /* renamed from: g */
    public C58881cr f112325g = C42934cb.f112317a;

    /* renamed from: h */
    public C42935cc f112326h;

    public C42936cd(Context context, Executor executor) {
        this.f112319a = context;
        this.f112320b = executor;
    }

    /* renamed from: a */
    public final C42939cg mo46007a() {
        boolean z = true;
        if (!this.f112323e && this.f112322d == null) {
            z = false;
        }
        C58838bb.m90869d(z, "Must specify either forKeys(...) or forAllKeys() before calling build().");
        return new C42939cg(this);
    }

    /* renamed from: b */
    public final void mo46008b() {
        this.f112322d = null;
        this.f112323e = true;
    }

    /* renamed from: c */
    public final void mo46009c(C42937ce ceVar) {
        this.f112326h = new C42935cc(ceVar);
    }
}
