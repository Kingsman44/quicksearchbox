package com.google.android.libraries.surveys.internal.view;

import android.view.View;
import com.google.common.base.C58837ba;
import com.google.p4281bu.p4282a.C56504ao;
import com.google.p4281bu.p4282a.C56507ar;
import com.google.p4281bu.p4282a.C56508as;
import com.google.p4281bu.p4282a.C56517ba;
import com.google.p4281bu.p4282a.C56546cc;

/* renamed from: com.google.android.libraries.surveys.internal.view.ae */
/* compiled from: PG */
public final /* synthetic */ class C43076ae implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C43091at f112656a;

    /* renamed from: b */
    public final /* synthetic */ C56546cc f112657b;

    public /* synthetic */ C43076ae(C43091at atVar, C56546cc ccVar) {
        this.f112656a = atVar;
        this.f112657b = ccVar;
    }

    public final void onClick(View view) {
        C43091at atVar = this.f112656a;
        C56546cc ccVar = this.f112657b;
        String str = atVar.f112697n;
        C56504ao aoVar = (C56504ao) C56517ba.f150934d.createBuilder();
        if (atVar.f112691h.mo46091c()) {
            String g = C58837ba.m90858g(str);
            C56507ar arVar = (C56507ar) C56508as.f150916b.createBuilder();
            arVar.copyOnWrite();
            ((C56508as) arVar.instance).f150918a = g;
            C56508as asVar = (C56508as) arVar.build();
            int i = ccVar.f150995c;
            aoVar.copyOnWrite();
            ((C56517ba) aoVar.instance).f150938c = i;
            aoVar.copyOnWrite();
            C56517ba baVar = (C56517ba) aoVar.instance;
            asVar.getClass();
            baVar.f150937b = asVar;
            baVar.f150936a = 5;
        }
        C56517ba baVar2 = (C56517ba) aoVar.build();
        if (baVar2 != null) {
            atVar.f112686c.f112629a = baVar2;
        }
        atVar.mo46146a(ccVar);
        atVar.mo46147b();
    }
}
