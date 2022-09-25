package com.google.android.libraries.lens.view.livingsurfaces;

import android.content.Context;
import android.net.Uri;
import android.view.TextureView;
import android.widget.FrameLayout;
import androidx.media3.common.C2590aq;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.exoplayer.C2758ac;
import androidx.media3.exoplayer.C2759ad;
import androidx.media3.exoplayer.dash.C2950s;
import androidx.media3.exoplayer.dash.DashMediaSource;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import androidx.media3.exoplayer.p145h.C3038au;
import androidx.media3.exoplayer.p145h.C3086bx;
import androidx.media3.exoplayer.p151k.C3244j;
import androidx.media3.p132b.C2495an;
import androidx.media3.p132b.C2513q;
import com.google.android.libraries.lens.view.p2073ao.C25459e;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.p4527a.C58974d;
import dagger.C68214a;

/* renamed from: com.google.android.libraries.lens.view.livingsurfaces.h */
/* compiled from: PG */
public final class C27249h implements C27260s {

    /* renamed from: a */
    public static final C58974d f74543a = C58974d.m91136j();

    /* renamed from: b */
    private final C68214a f74544b;

    /* renamed from: c */
    private final C37215b f74545c;

    /* renamed from: d */
    private final C25459e f74546d;

    /* renamed from: e */
    private final C28310af f74547e;

    /* renamed from: f */
    private final C28443m f74548f;

    /* renamed from: g */
    private final C28306ab f74549g;

    public C27249h(C68214a aVar, C37215b bVar, C25459e eVar, C28310af afVar, C28443m mVar, C28306ab abVar) {
        this.f74544b = aVar;
        this.f74545c = bVar;
        this.f74546d = eVar;
        this.f74547e = afVar;
        this.f74548f = mVar;
        this.f74549g = abVar;
    }

    /* renamed from: a */
    public final C27259r mo32753a(C27268v vVar) {
        C3038au auVar;
        C27233a aVar = (C27233a) vVar;
        Context context = aVar.f74494a;
        FrameLayout.LayoutParams b = C27245d.m50630b(aVar.f74498e);
        TextureView textureView = new TextureView(context);
        C2759ad a = new C2758ac(context).mo6454a();
        String str = aVar.f74496c;
        C3244j jVar = new C3244j();
        a.mo5979G(textureView);
        a.mo5977E(2);
        C2513q qVar = new C2513q(context, C2612ak.m6937T(context, "Lens"), (C2495an) jVar);
        Uri parse = Uri.parse(str);
        String lastPathSegment = parse.getLastPathSegment();
        int q = !C58837ba.m90859h(lastPathSegment) ? C2612ak.m6992q(lastPathSegment) : 4;
        C2590aq a2 = C2590aq.m6794a(parse);
        if (q == 0) {
            auVar = new DashMediaSource.Factory(new C2950s(qVar), qVar).mo6760b(a2);
        } else if (q != 2) {
            auVar = new C3086bx(qVar).mo6760b(a2);
        } else {
            auVar = new HlsMediaSource.Factory(qVar).mo6760b(a2);
        }
        a.mo6463N(auVar);
        a.mo6016w(new C27246e(textureView));
        C27247f fVar = new C27247f(textureView, b, (C27251j) this.f74544b.mo27525b(), this.f74545c, this.f74546d, vVar, this.f74547e, this.f74548f, this.f74549g, a);
        a.mo6462M(new C27248g(fVar));
        return fVar;
    }
}
