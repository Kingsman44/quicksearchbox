package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import androidx.lifecycle.C2333ah;
import com.google.android.apps.gsa.nga.api.a.bf;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.cc */
/* compiled from: PG */
final class C113993cc implements C2333ah {

    /* renamed from: a */
    final /* synthetic */ C114071eg f315633a;

    public C113993cc(C114071eg egVar) {
        this.f315633a = egVar;
    }

    /* renamed from: hX */
    public final /* synthetic */ void mo774hX(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f315633a.mo101004bP();
        if (bool.booleanValue()) {
            this.f315633a.mo100896cs(false);
        }
        NgaInteractionContainer ngaInteractionContainer = this.f315633a.f315975k;
        ngaInteractionContainer.getClass();
        ngaInteractionContainer.f315465e = bool.booleanValue();
        if (ngaInteractionContainer.mo100778i()) {
            ngaInteractionContainer.mo100776g((bf) ((C83361k) ngaInteractionContainer.f315466f.f296619a).f227199b.get());
        } else if (ngaInteractionContainer.f315463c) {
            ngaInteractionContainer.mo100777h();
        }
    }
}
