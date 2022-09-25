package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import android.view.View;
import com.google.android.apps.gsa.searchnow.C88855ag;
import com.google.android.apps.gsa.shared.monet.p7070b.p7101r.C90274c;
import com.google.android.apps.gsa.shared.p7148ui.C90714z;
import com.google.android.apps.gsa.sidekick.shared.monet.p7250f.C91826c;
import com.google.android.apps.gsa.sidekick.shared.overlay.C91896e;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.bf */
/* compiled from: PG */
final class C105505bf implements C91826c {

    /* renamed from: a */
    int f294326a;

    /* renamed from: b */
    final /* synthetic */ C105506bg f294327b;

    public C105505bf(C105506bg bgVar) {
        this.f294327b = bgVar;
    }

    /* renamed from: g */
    public final void mo86306g(String str, int i, int i2) {
        if (this.f294327b.f63126Q.mo28316z() && this.f294327b.f294335f.mo86291p().equals(str)) {
            this.f294327b.mo94870g(i2, false);
        }
    }

    /* renamed from: h */
    public final void mo86307h(View view, String str, int i) {
        C90274c cVar;
        C91896e eVar;
        C90714z zVar;
        if (this.f294327b.f63126Q.mo28316z() && this.f294327b.f294335f.mo86291p().equals(str)) {
            this.f294326a = i;
            if (i == 0 && (cVar = this.f294327b.f294336g) != null && (eVar = ((C88855ag) cVar).f240564a.f240591U) != null && (zVar = eVar.f256238j) != null) {
                zVar.mo84899g();
            }
        }
    }
}
