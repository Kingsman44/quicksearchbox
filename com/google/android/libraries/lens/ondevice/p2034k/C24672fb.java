package com.google.android.libraries.lens.ondevice.p2034k;

import android.graphics.Bitmap;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.lens.p4701g.C62312ch;
import com.google.lens.p4705i.p4706a.C62377h;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.lens.ondevice.k.fb */
/* compiled from: PG */
public final class C24672fb extends C68247h {

    /* renamed from: a */
    private final C68283d f67492a;

    /* renamed from: c */
    private final C68283d f67493c;

    /* renamed from: d */
    private final C68283d f67494d;

    public C24672fb(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C24672fb.class), aVar);
        this.f67492a = C68236af.m98549d(dVar);
        this.f67493c = C68236af.m98549d(dVar2);
        this.f67494d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        C62377h hVar;
        List list = (List) obj;
        Bitmap bitmap = (Bitmap) list.get(0);
        C24668ey eyVar = (C24668ey) list.get(1);
        C62312ch chVar = (C62312ch) list.get(2);
        if (chVar.f168216a.isEmpty()) {
            hVar = eyVar.mo29979a(bitmap, C62312ch.f168214b);
        } else {
            hVar = eyVar.mo29979a(bitmap, chVar);
        }
        return C60856cj.m92900i(hVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f67492a.mo60297gq(), this.f67493c.mo60297gq(), this.f67494d.mo60297gq());
    }
}
