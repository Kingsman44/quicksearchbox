package com.google.android.apps.search.googleapp.p10336k.p10337a;

import android.os.RemoteException;
import com.google.android.libraries.web.base.C43271v;
import com.google.android.libraries.web.p3407g.C43772a;
import com.google.android.libraries.web.weblayer.contrib.p3455c.C44170a;
import com.google.android.libraries.web.weblayer.contrib.p3455c.C44171b;
import com.google.protobuf.C62961ch;
import com.google.protos.p5124m.p5125a.C65599b;
import java.util.Set;
import org.chromium.p5643b.p5644a.C72304a;
import org.chromium.weblayer.C72604bm;
import org.chromium.weblayer.C72611bt;
import p3186j$.util.Collection;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.k.a.a */
/* compiled from: PG */
public final class C136375a implements C43772a {

    /* renamed from: a */
    private final C44171b f371289a;

    /* renamed from: b */
    private final C65599b f371290b;

    public C136375a(C44171b bVar, C65599b bVar2) {
        this.f371289a = bVar;
        this.f371290b = bVar2;
    }

    /* renamed from: a */
    public final void mo46790a() {
        C44171b bVar = this.f371289a;
        C62961ch chVar = this.f371290b.f178301a;
        C69664n.m101060f(chVar, "webLayerExperimentIds.elementList");
        Set ab = C69540x.m100846ab(chVar);
        if (bVar.f114921a.mo46385c().equals(C43271v.WEB_LAYER)) {
            C72611bt h = bVar.f114922b.mo47217h();
            h.getClass();
            int[] array = Collection.EL.stream(ab).mapToInt(C44170a.f114920a).toArray();
            C72604bm.m107399a();
            try {
                h.f193174f.mo63786s(array);
            } catch (RemoteException e) {
                throw new C72304a(e);
            }
        }
    }
}
