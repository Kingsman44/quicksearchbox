package com.google.android.apps.gsa.staticplugins.searchboxroot;

import android.os.Bundle;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88168rr;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.g */
/* compiled from: PG */
public final class C117025g {

    /* renamed from: a */
    public final Object f324904a = new Object();

    /* renamed from: b */
    public ClientConfig f324905b;

    /* renamed from: c */
    public String f324906c;

    /* renamed from: d */
    public C88168rr f324907d;

    /* renamed from: e */
    public Bundle f324908e;

    /* renamed from: a */
    public final Bundle mo103105a() {
        Bundle bundle;
        synchronized (this.f324904a) {
            bundle = this.f324908e;
        }
        return bundle;
    }

    /* renamed from: b */
    public final C88168rr mo103106b() {
        C88168rr rrVar;
        synchronized (this.f324904a) {
            rrVar = this.f324907d;
        }
        return rrVar;
    }

    /* renamed from: c */
    public final String mo103107c() {
        String str;
        synchronized (this.f324904a) {
            str = this.f324906c;
            if (str == null) {
                str = BuildConfig.FLAVOR;
            }
        }
        return str;
    }
}
