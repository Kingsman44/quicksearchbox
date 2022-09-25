package com.google.android.libraries.lens.view.p2113h.p2120c;

import android.graphics.Bitmap;
import com.google.android.libraries.lens.ondevice.C24823o;
import com.google.android.libraries.lens.ondevice.p2018b.p2020b.C24275a;
import com.google.android.libraries.lens.view.flags.C26244b;
import com.google.android.libraries.lens.view.session.ondevice.p2164a.C27898o;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.lens.p4701g.C62331d;
import dagger.C68214a;

/* renamed from: com.google.android.libraries.lens.view.h.c.f */
/* compiled from: PG */
public final class C26729f implements C26725b {

    /* renamed from: a */
    public final C68214a f72854a;

    /* renamed from: b */
    private final C26244b f72855b;

    /* renamed from: c */
    private C58833ax f72856c = C58836b.f156633a;

    public C26729f(C68214a aVar, C26244b bVar) {
        this.f72855b = bVar;
        this.f72854a = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo32035a(Bitmap bitmap) {
        if (!this.f72856c.mo56113h()) {
            return C60856cj.m92899h(new IllegalStateException("Start should be called before processing an image."));
        }
        C24275a aVar = new C24275a();
        aVar.f66317a = C58833ax.m90833j(bitmap);
        return C47633f.m84733g((C60870cx) this.f72856c.mo56107c()).mo51516i(new C26727d(this, aVar.mo29823b()), C60826bg.f164896a).mo51516i(C26728e.f72853a, C60826bg.f164896a);
    }

    /* renamed from: b */
    public final C60870cx mo32036b() {
        C58833ax k = C58833ax.m90834k(((C24823o) this.f72854a.mo27525b()).mo30021c(C62331d.EMBEDDING_CASCADE, C27898o.m51954a(this.f72855b)));
        this.f72856c = k;
        return C47633f.m84733g((C60870cx) k.mo56107c()).mo51515h(C26726c.f72850a, C60826bg.f164896a);
    }

    /* renamed from: c */
    public final void mo32037c() {
        ((C24823o) this.f72854a.mo27525b()).mo30023e();
    }
}
