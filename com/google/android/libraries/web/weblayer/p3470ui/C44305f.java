package com.google.android.libraries.web.weblayer.p3470ui;

import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import com.google.android.p445a.C8850c;
import org.chromium.p5643b.p5644a.C72304a;
import org.chromium.p5643b.p5644a.C72331b;
import org.chromium.p5643b.p5644a.C72341bj;
import org.chromium.weblayer.C72604bm;
import org.chromium.weblayer.C72615d;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69663m;

/* renamed from: com.google.android.libraries.web.weblayer.ui.f */
/* compiled from: PG */
final /* synthetic */ class C44305f extends C69663m implements C69626l {
    public C44305f(Object obj) {
        super(1, obj, C72615d.class, "setTopView", "setTopView(Landroid/view/View;)V", 0);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        View view = (View) obj;
        C72615d dVar = (C72615d) this.f186034c;
        C72604bm.m107399a();
        dVar.mo64487f();
        try {
            C72331b bVar = dVar.f193182e;
            C72341bj bjVar = new C72341bj(view);
            Parcel gA = bVar.mo17260gA();
            C8850c.m23499h(gA, bjVar);
            bVar.mo17262he(2, gA);
            return C69788q.f186170a;
        } catch (RemoteException e) {
            throw new C72304a(e);
        }
    }
}
