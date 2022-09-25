package com.google.android.apps.search.googleapp.recents.webfeature;

import android.support.p031v4.app.Fragment;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2391v;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.web.base.C43262m;
import com.google.android.libraries.web.p3353c.p3355b.C43357z;
import com.google.android.libraries.web.p3407g.C43773b;

/* compiled from: PG */
public final class RecentsFeatureSetup implements C43773b {

    /* renamed from: a */
    public final Fragment f373278a;

    /* renamed from: b */
    private final C137183c f373279b;

    /* renamed from: c */
    private final C43357z f373280c;

    /* renamed from: d */
    private final C43357z f373281d;

    public RecentsFeatureSetup(C43357z zVar, C43357z zVar2, final C137183c cVar, C43262m mVar) {
        this.f373280c = zVar;
        this.f373281d = zVar2;
        this.f373279b = cVar;
        Fragment a = mVar.mo46332a();
        this.f373278a = a;
        a.getLifecycle().mo5790b(new C2376g() {
            /* renamed from: gV */
            public final /* synthetic */ void mo3520gV(C2391v vVar) {
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
            public final void mo3524gZ(C2391v vVar) {
                cVar.f373290d = RecentsFeatureSetup.this.f373278a;
            }

            /* renamed from: ha */
            public final void mo3525ha(C2391v vVar) {
                cVar.f373290d = null;
            }
        });
    }

    /* renamed from: gV */
    public final void mo3520gV(C2391v vVar) {
        this.f373280c.mo46476c(R.id.googleapp_recents_feature, this.f373279b);
        this.f373281d.mo46475b(R.id.googleapp_recents_feature, this.f373279b);
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
