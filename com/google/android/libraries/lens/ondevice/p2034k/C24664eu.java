package com.google.android.libraries.lens.ondevice.p2034k;

import android.graphics.Bitmap;
import android.util.Size;
import com.google.android.libraries.lens.view.session.ondevice.p2168c.C27940n;
import com.google.android.libraries.p1657ba.p1664c.p1668c.p1671c.C19663b;
import com.google.android.libraries.p1657ba.p1664c.p1668c.p1671c.C19665d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56220aa;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56328z;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.lens.ondevice.k.eu */
/* compiled from: PG */
public final class C24664eu extends C68247h {

    /* renamed from: a */
    private final C68283d f67474a;

    /* renamed from: c */
    private final C68283d f67475c;

    public C24664eu(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C24664eu.class), aVar);
        this.f67474a = C68236af.m98549d(dVar);
        this.f67475c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        Bitmap bitmap = (Bitmap) list.get(1);
        C56328z zVar = (C56328z) C56220aa.f149748b.createBuilder();
        Size size = new Size(bitmap.getWidth(), bitmap.getHeight());
        for (C19663b f : ((C19665d) list.get(0)).f54692a) {
            zVar.mo54357b(C27940n.m52005f(f, size));
        }
        return C60856cj.m92900i((C56220aa) zVar.build());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f67474a.mo60297gq(), this.f67475c.mo60297gq());
    }
}
