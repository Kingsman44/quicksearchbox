package com.google.android.libraries.web.contrib.googlesignin.internal;

import androidx.lifecycle.C2391v;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.contrib.googlesignin.GoogleSignInFeatureContract;
import com.google.android.libraries.web.p3353c.p3354a.C43317a;
import com.google.android.libraries.web.p3353c.p3355b.C43357z;
import com.google.android.libraries.web.p3407g.C43773b;
import p5460g.p5461a.C69464a;

/* compiled from: PG */
public final class GoogleSignInWebFragmentObserver implements C43773b {

    /* renamed from: a */
    private final C69464a f113778a;

    /* renamed from: b */
    private final C43269t f113779b;

    /* renamed from: c */
    private final C43357z f113780c;

    public GoogleSignInWebFragmentObserver(C43357z zVar, C69464a aVar, C43269t tVar) {
        this.f113780c = zVar;
        this.f113778a = aVar;
        this.f113779b = tVar;
    }

    /* renamed from: gV */
    public final void mo3520gV(C2391v vVar) {
        int d = ((GoogleSignInFeatureContract) this.f113779b.mo46384b().mo46298a(GoogleSignInFeatureContract.class)).mo46631d();
        if (d == 0) {
            throw null;
        } else if (d == 2) {
            this.f113780c.mo46475b(R.id.webx_sign_in_event_listener, (C43317a) this.f113778a.mo17428b());
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
}
