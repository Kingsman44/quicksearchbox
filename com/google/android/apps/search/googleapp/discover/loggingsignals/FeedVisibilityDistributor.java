package com.google.android.apps.search.googleapp.discover.loggingsignals;

import android.support.p031v4.app.Fragment;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2391v;
import java.util.Set;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class FeedVisibilityDistributor implements C134463a, C2376g {

    /* renamed from: a */
    private final Set f366208a;

    /* renamed from: b */
    private final Fragment f366209b;

    /* renamed from: c */
    private boolean f366210c;

    /* renamed from: d */
    private boolean f366211d;

    /* renamed from: e */
    private boolean f366212e;

    public FeedVisibilityDistributor(Set set, Fragment fragment) {
        C69664n.m101061g(set, "visibilityListeners");
        C69664n.m101061g(fragment, "fragment");
        this.f366208a = set;
        this.f366209b = fragment;
        fragment.getLifecycle().mo5790b(this);
    }

    /* renamed from: i */
    private final void m218179i() {
        boolean z = false;
        if (this.f366211d && this.f366210c) {
            z = true;
        }
        if (this.f366212e != z) {
            this.f366212e = z;
            for (C134463a aVar : this.f366208a) {
                if (z) {
                    aVar.mo111497h();
                } else {
                    aVar.mo111496g();
                }
            }
        }
    }

    /* renamed from: g */
    public final void mo111496g() {
        this.f366210c = false;
        m218179i();
    }

    /* renamed from: gV */
    public final /* synthetic */ void mo3520gV(C2391v vVar) {
    }

    /* renamed from: gW */
    public final void mo3521gW(C2391v vVar) {
        this.f366209b.getLifecycle().mo5791c(this);
    }

    /* renamed from: gX */
    public final void mo3522gX(C2391v vVar) {
        this.f366211d = false;
        m218179i();
    }

    /* renamed from: gY */
    public final void mo3523gY(C2391v vVar) {
        this.f366211d = true;
        m218179i();
    }

    /* renamed from: gZ */
    public final /* synthetic */ void mo3524gZ(C2391v vVar) {
    }

    /* renamed from: h */
    public final void mo111497h() {
        this.f366210c = true;
        m218179i();
    }

    /* renamed from: ha */
    public final /* synthetic */ void mo3525ha(C2391v vVar) {
    }
}
