package com.google.android.libraries.lens.ondevice.p2034k;

import android.graphics.Bitmap;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.lens.p4701g.C62328cx;
import com.google.lens.p4701g.C62333db;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.lens.ondevice.k.gg */
/* compiled from: PG */
public final class C24704gg extends C68247h {

    /* renamed from: a */
    private final C68283d f67557a;

    /* renamed from: c */
    private final C68283d f67558c;

    /* renamed from: d */
    private final C68283d f67559d;

    public C24704gg(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C24704gg.class), aVar);
        this.f67557a = C68236af.m98549d(dVar);
        this.f67558c = C68236af.m98549d(dVar2);
        this.f67559d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        C62333db dbVar;
        List list = (List) obj;
        Bitmap bitmap = (Bitmap) list.get(0);
        C24701gd gdVar = (C24701gd) list.get(1);
        C62328cx cxVar = (C62328cx) list.get(2);
        if (cxVar.f168249a.isEmpty()) {
            dbVar = gdVar.mo29985a(bitmap, C62328cx.f168247b);
        } else {
            dbVar = gdVar.mo29985a(bitmap, cxVar);
        }
        return C60856cj.m92900i(dbVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f67557a.mo60297gq(), this.f67558c.mo60297gq(), this.f67559d.mo60297gq());
    }
}
