package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6402r.p6403a;

import android.os.Build;
import androidx.annotation.C0826b;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6375d.C81553a;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6386j.C81810c;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6386j.C81819l;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6402r.C82037d;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6402r.C82038e;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6402r.C82039f;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6402r.C82040g;
import com.google.android.apps.gsa.nga.shared.p6417x.C83349aj;
import com.google.android.apps.gsa.nga.shared.p6417x.C83357g;
import com.google.android.apps.gsa.nga.shared.p6417x.C83358h;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.apps.gsa.nga.shared.p6417x.C83363m;
import com.google.android.apps.gsa.shared.p7066m.C90040cs;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.gsa.p1876k.C22871g;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.r.a.c */
/* compiled from: PG */
public final class C82022c implements C82039f, C81810c {

    /* renamed from: a */
    private final C83358h f224225a;

    /* renamed from: b */
    private final C82040g f224226b;

    /* renamed from: c */
    private final C22871g f224227c;

    /* renamed from: d */
    private final C83363m f224228d = new C83363m();

    /* renamed from: e */
    private final C83357g f224229e = new C83361k(C82037d.f224263a, C0826b.class);

    public C82022c(C82040g gVar, C81819l lVar, C81553a aVar, C22871g gVar2, C91142g gVar3) {
        this.f224226b = gVar;
        this.f224227c = gVar2;
        this.f224225a = C83349aj.m132654i(aVar.mo75136a(), lVar.mo75163p(), lVar.mo75151d(), gVar.mo75466a(), C82021b.f224224a);
        C82038e eVar = C82038e.MANDATORY;
        if (Build.VERSION.SDK_INT >= 31 && gVar3.mo85405j(C90040cs.f248638E)) {
            eVar = C82038e.BASED_ON_VIS_VIEW_SIZE;
        }
        new C83361k(eVar, C0826b.class);
    }

    /* renamed from: a */
    public final C83358h mo75463a() {
        return this.f224229e;
    }

    /* renamed from: b */
    public final void mo75464b(C82037d dVar) {
        C83349aj.m132647b(this.f224227c, this.f224229e, dVar, "systemUiVisibility");
    }

    /* renamed from: d */
    public final void mo75129d() {
        this.f224226b.mo75467b();
        this.f224228d.mo76663c(this.f224225a, new C82020a(this));
    }

    /* renamed from: e */
    public final void mo75130e() {
        this.f224226b.mo75468c();
        this.f224228d.mo76661a();
        mo75464b(C82037d.f224263a);
    }
}
