package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.window;

import androidx.annotation.C0826b;
import com.google.android.apps.gsa.nga.shared.p6417x.C83349aj;
import com.google.android.apps.gsa.nga.shared.p6417x.C83357g;
import com.google.android.apps.gsa.nga.shared.p6417x.C83358h;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.window.be */
/* compiled from: PG */
public final class C82155be {

    /* renamed from: a */
    public static final Duration f224564a = Duration.ofSeconds(10);

    /* renamed from: b */
    public final C83358h f224565b;

    /* renamed from: c */
    public final String f224566c;

    /* renamed from: d */
    public final C22871g f224567d;

    /* renamed from: e */
    public final C22871g f224568e;

    /* renamed from: f */
    public final C83358h f224569f;

    /* renamed from: g */
    public final C83357g f224570g;

    /* renamed from: h */
    public C60870cx f224571h = C60856cj.m92898g();

    /* renamed from: i */
    public C60870cx f224572i = C60856cj.m92898g();

    public C82155be(C83358h hVar, String str, C22871g gVar, C22871g gVar2) {
        C83361k kVar = new C83361k(C82154bd.DISABLED, C0826b.class);
        this.f224570g = kVar;
        this.f224567d = gVar;
        this.f224568e = gVar2;
        this.f224569f = hVar;
        this.f224566c = str;
        this.f224565b = C83349aj.m132658m(kVar, C82147ax.f224553a);
    }

    /* renamed from: a */
    public final void mo75525a() {
        ((C59052c) ((C59052c) C82156bf.f224573a.mo56224b()).mo56372aa(6503)).mo56389s("%s disabled", this.f224566c);
        this.f224571h.cancel(false);
        this.f224572i.cancel(false);
        this.f224570g.mo76660b(C82154bd.DISABLED);
    }
}
