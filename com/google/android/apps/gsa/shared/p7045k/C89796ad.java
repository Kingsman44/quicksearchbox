package com.google.android.apps.gsa.shared.p7045k;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.shared.k.ad */
/* compiled from: PG */
public final class C89796ad {

    /* renamed from: c */
    private static C89796ad f243054c;

    /* renamed from: d */
    private static final C59071e f243055d = C59071e.m91332i("com.google.android.apps.gsa.shared.k.ad");

    /* renamed from: a */
    public boolean f243056a = false;

    /* renamed from: b */
    public int f243057b = 8008;

    /* renamed from: e */
    private final Set f243058e = new HashSet();

    private C89796ad() {
    }

    /* renamed from: a */
    public static C89796ad m146181a() {
        if (f243054c == null) {
            f243054c = new C89796ad();
        }
        return f243054c;
    }

    /* renamed from: b */
    public final void mo83644b(String str, int i) {
        try {
            Set set = this.f243058e;
            C89808d l = C89809e.m146210l();
            ((C89787a) l).f243014a = "mock_cast_device_id_01";
            l.mo83636e(InetAddress.getByName(str));
            ((C89787a) l).f243015b = "GoogleHome";
            ((C89787a) l).f243016c = "myMockHome";
            l.mo83640i(5);
            set.add(l.mo83632a());
            this.f243056a = true;
            this.f243057b = i;
        } catch (UnknownHostException unused) {
            ((C59052c) ((C59052c) f243055d.mo56224b()).mo56372aa(10541)).mo56352E("Unable to resolve mock cast device host: %s:%d", str, i);
        }
    }
}
