package com.google.android.libraries.assistant.p1363c.p1364a.p1368b.p1369a;

import android.graphics.Bitmap;
import androidx.media3.common.C2646bh;
import androidx.media3.p174ui.C3647k;
import com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16980d;
import com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16982f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.assistant.c.a.b.a.y */
/* compiled from: PG */
final class C16975y implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C16980d f49589a;

    /* renamed from: b */
    final /* synthetic */ C2646bh f49590b;

    /* renamed from: c */
    final /* synthetic */ C3647k f49591c;

    /* renamed from: d */
    final /* synthetic */ C16976z f49592d;

    public C16975y(C16976z zVar, C16980d dVar, C2646bh bhVar, C3647k kVar) {
        this.f49592d = zVar;
        this.f49589a = dVar;
        this.f49590b = bhVar;
        this.f49591c = kVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59052c cVar = (C59052c) ((C59052c) ((C59052c) C16976z.f49593a.mo56226d()).mo56382g(th)).mo56372aa(42599);
        C16982f fVar = this.f49589a.f49604b;
        if (fVar == null) {
            fVar = C16982f.f49608e;
        }
        C51012dc dcVar = fVar.f49613d;
        if (dcVar == null) {
            dcVar = C51012dc.f132813k;
        }
        cVar.mo56389s("failed to load the image: %s", dcVar.f132817c);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        this.f49592d.f49594b.execute(C47810es.m84977q(new C16974x(this.f49589a, this.f49590b, this.f49591c, (Bitmap) obj)));
    }
}
