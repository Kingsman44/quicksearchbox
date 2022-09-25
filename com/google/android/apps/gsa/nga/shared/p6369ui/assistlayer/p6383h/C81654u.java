package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6383h;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80754eb;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6377e.C81572o;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C81989az;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C81993bc;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28295m;
import com.google.common.p4526f.C59052c;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.h.u */
/* compiled from: PG */
public final /* synthetic */ class C81654u implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C81656w f223315a;

    public /* synthetic */ C81654u(C81656w wVar) {
        this.f223315a = wVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C81656w wVar = this.f223315a;
        Boolean bool = (Boolean) obj;
        ((C59052c) ((C59052c) C81656w.f223319a.mo56224b()).mo56372aa(6181)).mo56389s("Assist Layer enabled: %s", bool);
        if (bool.booleanValue()) {
            wVar.f223326h.mo75435f(wVar.f223320b, ((C80754eb) wVar.f223327i.mo75161n().mo76657c()).f221658a, false);
            wVar.f223326h.mo75433d(wVar.f223320b, 93018);
        } else {
            C81993bc bcVar = wVar.f223326h;
            ViewGroup viewGroup = wVar.f223320b;
            if (!(viewGroup == null || C28295m.m52915a(viewGroup) == null)) {
                Optional ofNullable = Optional.ofNullable(C28285c.m52881h(3, C28295m.m52916b(viewGroup), (View) null));
                C81572o oVar = bcVar.f224155a;
                Objects.requireNonNull(oVar);
                ofNullable.ifPresent(new C81989az(oVar));
            }
            wVar.f223326h.mo75434e(wVar.f223320b);
        }
        wVar.f223331m.mo76660b(bool);
        wVar.f223328j.mo75171x(bool.booleanValue());
    }
}
