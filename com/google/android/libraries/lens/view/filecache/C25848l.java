package com.google.android.libraries.lens.view.filecache;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.libraries.lens.view.p2078at.C25542y;
import com.google.android.libraries.lens.view.p2113h.p2120c.C26724a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.dataservice.C46877q;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.lens.view.filecache.l */
/* compiled from: PG */
public final class C25848l implements C25839c {

    /* renamed from: a */
    public final Context f70210a;

    /* renamed from: b */
    public final C21370a f70211b;

    /* renamed from: c */
    public final C26724a f70212c;

    /* renamed from: d */
    public final String f70213d;

    /* renamed from: e */
    private final C46877q f70214e;

    /* renamed from: f */
    private final C60887da f70215f;

    public C25848l(Context context, C46877q qVar, C21370a aVar, C26724a aVar2, C60887da daVar, String str) {
        this.f70210a = context;
        this.f70214e = qVar;
        this.f70211b = aVar;
        this.f70212c = aVar2;
        this.f70215f = daVar;
        this.f70213d = str;
    }

    /* renamed from: a */
    public final C60870cx mo30985a(Bitmap bitmap, C25542y yVar, int i, String str, String str2, String str3) {
        C60870cx cxVar;
        if (yVar == C25542y.JPEG || yVar == C25542y.PNG) {
            C60870cx b = this.f70215f.mo19399b(new C25841e(this, bitmap, i));
            C25842f fVar = new C25842f(this, yVar);
            cxVar = C60922j.m93045h(b, C47810es.m84966f(fVar), C60826bg.f164896a);
        } else {
            C25542y yVar2 = C25542y.PDF;
            if (yVar != yVar2) {
                return C60856cj.m92899h(new IllegalArgumentException("Unrecognized content type ".concat(String.valueOf(String.valueOf(yVar)))));
            }
            C25843g gVar = new C25843g(bitmap);
            Objects.requireNonNull(gVar);
            cxVar = mo30987b(new C25845i(gVar), yVar2);
        }
        C25844h hVar = new C25844h(this, str, str2, str3);
        return C60922j.m93044g(cxVar, C47810es.m84963c(hVar), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final C60870cx mo30987b(C25838b bVar, C25542y yVar) {
        C60870cx g = this.f70214e.mo50877g(new Uri.Builder().scheme("content").authority(this.f70213d).path("/delete_all").build());
        C25840d dVar = new C25840d(this, yVar, bVar);
        return C60922j.m93045h(g, C47810es.m84966f(dVar), this.f70215f);
    }
}
