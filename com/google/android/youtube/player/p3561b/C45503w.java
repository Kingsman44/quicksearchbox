package com.google.android.youtube.player.p3561b;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: com.google.android.youtube.player.b.w */
public final class C45503w {

    /* renamed from: a */
    public Bundle f118934a;

    /* renamed from: b */
    public final Queue f118935b = new ArrayDeque();

    /* renamed from: c */
    public final Queue f118936c = new ArrayDeque();

    /* renamed from: d */
    public C45502v f118937d;

    /* renamed from: e */
    public C45502v f118938e;

    /* renamed from: f */
    public C45502v f118939f;

    /* renamed from: g */
    public C45502v f118940g;

    /* renamed from: h */
    public C45502v f118941h;

    /* renamed from: i */
    public C45463av f118942i;

    /* renamed from: j */
    public C45475bg f118943j;

    /* renamed from: k */
    private final boolean f118944k;

    /* renamed from: l */
    private final C45478bj f118945l;

    /* renamed from: m */
    private final Queue f118946m = new ArrayDeque();

    /* renamed from: n */
    private C45502v f118947n;

    public C45503w(boolean z, C45478bj bjVar) {
        C45502v vVar = C45502v.f118933d;
        this.f118937d = vVar;
        this.f118947n = vVar;
        this.f118938e = vVar;
        this.f118939f = vVar;
        this.f118940g = vVar;
        this.f118941h = vVar;
        this.f118942i = C45463av.m81142a();
        this.f118944k = z;
        this.f118945l = bjVar;
    }

    /* renamed from: f */
    public static void m81248f() {
        C45457ap.m81128a("Problem communicating with YouTube service.", new Object[0]);
    }

    /* renamed from: l */
    private final void m81249l() {
        if (this.f118943j != null) {
            try {
                this.f118947n.mo49661a();
                this.f118947n = C45502v.f118933d;
            } catch (RemoteException unused) {
                m81248f();
            }
        }
    }

    /* renamed from: a */
    public final void mo49662a() {
        if (this.f118943j != null) {
            try {
                this.f118941h.mo49661a();
                this.f118941h = C45502v.f118933d;
            } catch (RemoteException unused) {
                m81248f();
            }
        }
    }

    /* renamed from: b */
    public final void mo49663b() {
        if (this.f118943j != null) {
            try {
                this.f118940g.mo49661a();
                this.f118940g = C45502v.f118933d;
            } catch (RemoteException unused) {
                m81248f();
            }
        }
    }

    /* renamed from: c */
    public final void mo49664c() {
        if (this.f118943j != null) {
            try {
                this.f118937d.mo49661a();
                this.f118937d = C45502v.f118933d;
                this.f118942i = C45463av.m81142a();
            } catch (RemoteException unused) {
                m81248f();
            }
        }
    }

    /* renamed from: d */
    public final void mo49665d() {
        for (C45463av f : this.f118946m) {
            f.mo49610f(0);
        }
        this.f118946m.clear();
    }

    /* renamed from: e */
    public final void mo49666e() {
        this.f118937d = C45502v.f118933d;
        this.f118942i.mo49609e(false);
        this.f118942i = C45463av.m81142a();
    }

    /* renamed from: g */
    public final void mo49667g(int i) {
        this.f118947n = new C45491k(this, i);
        m81249l();
    }

    /* renamed from: h */
    public final void mo49668h() {
        if (this.f118943j != null) {
            for (C45502v a : this.f118935b) {
                try {
                    a.mo49661a();
                } catch (RemoteException unused) {
                    C45457ap.m81128a("Problem communicating with YouTube service when changing sign in status.", new Object[0]);
                }
            }
            this.f118935b.clear();
        }
    }

    /* renamed from: i */
    public final void mo49669i() {
        if (this.f118943j != null) {
            try {
                this.f118939f.mo49661a();
                this.f118939f = C45502v.f118933d;
            } catch (RemoteException unused) {
                m81248f();
            }
        }
    }

    /* renamed from: j */
    public final void mo49670j() {
        if (this.f118943j != null) {
            try {
                this.f118938e.mo49661a();
                this.f118938e = C45502v.f118933d;
            } catch (RemoteException unused) {
                m81248f();
            }
        }
    }

    /* renamed from: k */
    public final void mo49671k(C45475bg bgVar) {
        this.f118943j = bgVar;
        if (bgVar != null) {
            if (this.f118944k) {
                try {
                    bgVar.mo49588lt(11, bgVar.mo49586lr());
                } catch (RemoteException unused) {
                    C45457ap.m81128a("Problem setting fullscreen.", new Object[0]);
                }
            }
            C45478bj bjVar = this.f118945l;
            if (bjVar != null) {
                try {
                    Parcel lr = bgVar.mo49586lr();
                    C45460as.m81140d(lr, bjVar);
                    bgVar.mo49588lt(12, lr);
                } catch (RemoteException unused2) {
                    C45457ap.m81128a("Problem setting client.", new Object[0]);
                }
            }
            mo49668h();
            mo49664c();
            mo49663b();
            mo49670j();
            mo49669i();
            m81249l();
            mo49662a();
            if (this.f118943j != null) {
                try {
                    for (C45463av d : this.f118946m) {
                        C45475bg bgVar2 = this.f118943j;
                        Parcel lr2 = bgVar2.mo49586lr();
                        C45460as.m81140d(lr2, d);
                        bgVar2.mo49588lt(23, lr2);
                    }
                    this.f118946m.clear();
                } catch (RemoteException unused3) {
                    m81248f();
                }
            }
        }
    }
}
