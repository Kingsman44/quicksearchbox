package com.google.android.libraries.lens.ondevice.p2034k;

import android.graphics.Bitmap;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.lens.p4701g.C62320cp;
import com.google.lens.p4701g.C62324ct;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.lens.ondevice.k.fo */
/* compiled from: PG */
public final class C24685fo extends C68247h {

    /* renamed from: a */
    private final C68283d f67518a;

    /* renamed from: c */
    private final C68283d f67519c;

    /* renamed from: d */
    private final C68283d f67520d;

    public C24685fo(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C24685fo.class), aVar);
        this.f67518a = C68236af.m98549d(dVar);
        this.f67519c = C68236af.m98549d(dVar2);
        this.f67520d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        C62324ct ctVar;
        List list = (List) obj;
        Bitmap bitmap = (Bitmap) list.get(0);
        C24682fl flVar = (C24682fl) list.get(1);
        C62320cp cpVar = (C62320cp) list.get(2);
        if (cpVar.f168235a.isEmpty()) {
            ctVar = flVar.mo29981a(bitmap, C62320cp.f168233b);
        } else {
            ctVar = flVar.mo29981a(bitmap, cpVar);
        }
        return C60856cj.m92900i(ctVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f67518a.mo60297gq(), this.f67519c.mo60297gq(), this.f67520d.mo60297gq());
    }
}
