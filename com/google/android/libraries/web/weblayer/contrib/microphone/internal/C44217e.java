package com.google.android.libraries.web.weblayer.contrib.microphone.internal;

import android.os.RemoteException;
import com.google.android.libraries.search.p2904c.p2960p.C37937a;
import com.google.android.libraries.web.p3428m.C43904a;
import com.google.android.libraries.web.p3428m.C43948y;
import com.google.android.libraries.web.p3428m.C43949z;
import com.google.android.libraries.web.p3428m.p3429a.C43914c;
import com.google.android.libraries.web.shared.lifecycle.C44107h;
import com.google.android.libraries.web.weblayer.p3468g.p3469a.C44296x;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60887da;
import org.chromium.p5643b.p5644a.C72304a;
import org.chromium.weblayer.C72570af;
import org.chromium.weblayer.C72571ag;
import org.chromium.weblayer.C72601bj;
import org.chromium.weblayer.C72604bm;

/* renamed from: com.google.android.libraries.web.weblayer.contrib.microphone.internal.e */
/* compiled from: PG */
public final class C44217e implements C44107h, C43949z {

    /* renamed from: a */
    public static final C59071e f115002a = C59071e.m91332i("com.google.android.libraries.web.weblayer.contrib.microphone.internal.e");

    /* renamed from: b */
    public final C37937a f115003b;

    /* renamed from: c */
    public final C60887da f115004c;

    public C44217e(C37937a aVar, C60887da daVar, C43948y yVar) {
        this.f115003b = aVar;
        this.f115004c = daVar;
        yVar.mo46938e(this);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo44356a() {
    }

    /* renamed from: b */
    public final /* synthetic */ void mo46529b(C43904a aVar) {
    }

    /* renamed from: c */
    public final void mo46530c(C43904a aVar) {
        C72601bj bjVar = ((C44296x) ((C43914c) aVar).mo46411d(C44296x.class)).f115192a;
        C72604bm.m107399a();
        bjVar.mo64476g();
        C72571ag agVar = bjVar.f193146d;
        C44216d dVar = new C44216d(this, agVar);
        C72604bm.m107399a();
        try {
            agVar.f193101a.mo63742m(new C72570af(dVar));
        } catch (RemoteException e) {
            throw new C72304a(e);
        }
    }

    /* renamed from: d */
    public final /* synthetic */ void mo46531d() {
    }
}
