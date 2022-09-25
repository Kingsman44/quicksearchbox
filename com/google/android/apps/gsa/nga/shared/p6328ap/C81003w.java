package com.google.android.apps.gsa.nga.shared.p6328ap;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.apps.gsa.nga.api.C74707bg;
import com.google.android.apps.gsa.nga.api.C74726cf;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.apps.gsa.nga.shared.ap.w */
/* compiled from: PG */
public final class C81003w implements C74726cf {

    /* renamed from: a */
    private static final C58974d f222027a = C58974d.m91136j();

    /* renamed from: b */
    private final C74707bg f222028b;

    public C81003w(C74707bg bgVar) {
        this.f222028b = bgVar;
    }

    /* renamed from: a */
    public final int mo71101a() {
        try {
            return this.f222028b.mo71060e();
        } catch (RemoteException e) {
            ((C58970a) ((C58970a) ((C58970a) f222027a.mo56225c()).mo56382g(e)).mo56372aa(6556)).mo56384n();
            return -2;
        }
    }

    /* renamed from: b */
    public final void mo71102b() {
        try {
            this.f222028b.mo71061f();
        } catch (RemoteException e) {
            ((C58970a) ((C58970a) ((C58970a) f222027a.mo56225c()).mo56382g(e)).mo56372aa(6557)).mo56384n();
        }
    }

    /* renamed from: c */
    public final void mo71103c() {
        try {
            this.f222028b.mo71062g();
        } catch (RemoteException e) {
            ((C58970a) ((C58970a) ((C58970a) f222027a.mo56225c()).mo56382g(e)).mo56372aa(6558)).mo56384n();
        }
    }

    /* renamed from: d */
    public final void mo71104d() {
        try {
            this.f222028b.mo71063h();
        } catch (RemoteException e) {
            ((C58970a) ((C58970a) ((C58970a) f222027a.mo56225c()).mo56382g(e)).mo56372aa(6559)).mo56384n();
        }
    }

    /* renamed from: e */
    public final void mo71105e(int i) {
        try {
            this.f222028b.mo71064i(i);
        } catch (RemoteException e) {
            ((C58970a) ((C58970a) ((C58970a) f222027a.mo56225c()).mo56382g(e)).mo56372aa(6560)).mo56384n();
        }
    }

    /* renamed from: f */
    public final void mo71106f(Intent intent) {
        try {
            this.f222028b.mo71065j(intent);
        } catch (RemoteException e) {
            ((C58970a) ((C58970a) ((C58970a) f222027a.mo56225c()).mo56382g(e)).mo56372aa(6561)).mo56384n();
        }
    }

    /* renamed from: g */
    public final void mo71107g(Intent intent) {
        try {
            this.f222028b.mo71066k(intent);
        } catch (RemoteException e) {
            ((C58970a) ((C58970a) ((C58970a) f222027a.mo56225c()).mo56382g(e)).mo56372aa(6562)).mo56384n();
        }
    }
}
