package com.google.android.libraries.lens.view.livingsurfaces;

import android.view.View;
import android.widget.FrameLayout;
import androidx.media3.exoplayer.C2759ad;
import com.google.android.libraries.lens.view.p2073ao.C25459e;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.search.p2871b.C37215b;

/* renamed from: com.google.android.libraries.lens.view.livingsurfaces.f */
/* compiled from: PG */
final class C27247f extends C27245d {

    /* renamed from: c */
    final /* synthetic */ C2759ad f74541c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27247f(View view, FrameLayout.LayoutParams layoutParams, C27251j jVar, C37215b bVar, C25459e eVar, C27268v vVar, C28310af afVar, C28443m mVar, C28306ab abVar, C2759ad adVar) {
        super(view, layoutParams, jVar, bVar, eVar, vVar, afVar, mVar, abVar);
        this.f74541c = adVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo32764d() {
        C2759ad adVar = this.f74541c;
        adVar.mo5974B(false);
        adVar.mo6018y();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo32770j(boolean z) {
        this.f74541c.mo5980H(true != z ? 1.0f : 0.0f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo32773m() {
        this.f74541c.mo5974B(true);
    }
}
