package com.google.android.apps.gsa.staticplugins.opa.samson.p8441m;

import android.media.MediaRecorder;
import androidx.lifecycle.C2333ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4535g.C59203do;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.m.a */
/* compiled from: PG */
final class C110256a implements C2333ah {

    /* renamed from: a */
    final /* synthetic */ C110257b f307272a;

    public C110256a(C110257b bVar) {
        this.f307272a = bVar;
    }

    /* renamed from: hX */
    public final /* bridge */ /* synthetic */ void mo774hX(Object obj) {
        double d;
        Long l = (Long) obj;
        C110259d dVar = this.f307272a.f307275k;
        MediaRecorder mediaRecorder = dVar.f307279a;
        if (mediaRecorder != null) {
            double maxAmplitude = (double) mediaRecorder.getMaxAmplitude();
            Double.isNaN(maxAmplitude);
            d = maxAmplitude / 2700.0d;
        } else {
            d = C59203do.f157270a;
        }
        double d2 = (d * 0.6d) + (dVar.f307280b * 0.4d);
        dVar.f307280b = d2;
        C59104x b = C110257b.f307273i.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SLiveData");
        ((C59052c) ((C59052c) b).mo56372aa(25926)).mo56389s("amp: %g", Double.valueOf(d2));
        C110257b bVar = this.f307272a;
        bVar.mo5708l(Boolean.valueOf(d2 < bVar.f307274j));
    }
}
