package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.q.t */
/* compiled from: PG */
public final class C82012t {

    /* renamed from: a */
    public static final C59071e f224196a = C59071e.m91332i("com.google.android.apps.gsa.nga.shared.ui.assistlayer.q.t");

    /* renamed from: b */
    public final FrameLayout f224197b;

    /* renamed from: c */
    public final C22871g f224198c;

    /* renamed from: d */
    public final C82003k f224199d;

    /* renamed from: e */
    public C82011s f224200e;

    /* renamed from: f */
    public C60870cx f224201f = C60856cj.m92898g();

    /* renamed from: g */
    public boolean f224202g = false;

    public C82012t(FrameLayout frameLayout, int i, C82002j jVar, Class cls, C82004l lVar, C22871g gVar) {
        this.f224197b = frameLayout;
        this.f224198c = gVar;
        this.f224199d = lVar.mo75447a(new C82009q(cls, i, frameLayout), jVar);
    }

    /* renamed from: a */
    public final void mo75449a(C82011s sVar) {
        if (this.f224202g) {
            sVar.mo75243a((View) ((Optional) ((C83361k) this.f224199d.f224173g).f227199b.get()).get());
            this.f224200e = null;
            return;
        }
        this.f224200e = sVar;
    }
}
