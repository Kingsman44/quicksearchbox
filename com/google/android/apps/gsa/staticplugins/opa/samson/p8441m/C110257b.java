package com.google.android.apps.gsa.staticplugins.opa.samson.p8441m;

import android.media.MediaRecorder;
import androidx.lifecycle.C2331af;
import androidx.lifecycle.C2333ah;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8444p.C110311c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4535g.C59203do;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.m.b */
/* compiled from: PG */
public final class C110257b extends C2331af {

    /* renamed from: i */
    public static final C59071e f307273i = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.samson.m.b");

    /* renamed from: j */
    public final double f307274j;

    /* renamed from: k */
    public final C110259d f307275k;

    /* renamed from: l */
    private final C2333ah f307276l;

    public C110257b(long j, double d, C110259d dVar, C110311c cVar) {
        C110256a aVar = new C110256a(this);
        this.f307276l = aVar;
        this.f307274j = d;
        this.f307275k = dVar;
        mo5727n(cVar.mo98561a(j), aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo5677g() {
        super.mo5677g();
        try {
            C110259d dVar = this.f307275k;
            if (dVar.f307279a == null) {
                dVar.f307279a = new MediaRecorder();
                dVar.f307279a.setAudioSource(1);
                dVar.f307279a.setOutputFormat(1);
                dVar.f307279a.setAudioEncoder(1);
                dVar.f307279a.setOutputFile("/dev/null");
                dVar.f307279a.prepare();
                dVar.f307279a.start();
                dVar.f307280b = C59203do.f157270a;
            }
        } catch (IOException e) {
            C59104x c = f307273i.mo56225c();
            c.mo56378ag(C58975e.f156826a, "SLiveData");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(25927)).mo56386p("onActive, error: ");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo5678h() {
        C110259d dVar = this.f307275k;
        MediaRecorder mediaRecorder = dVar.f307279a;
        if (mediaRecorder != null) {
            mediaRecorder.stop();
            dVar.f307279a.release();
            dVar.f307279a = null;
        }
        super.mo5678h();
    }
}
