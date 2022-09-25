package com.google.android.apps.gsa.staticplugins.microdetection.p8039a;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.speech.p7269b.C92216a;
import com.google.android.apps.gsa.speech.p7298l.C92473f;
import com.google.android.apps.gsa.staticplugins.microdetection.p8042d.C102832a;
import com.google.android.apps.gsa.staticplugins.microdetection.p8042d.C102843l;
import com.google.android.apps.gsa.staticplugins.microdetection.p8042d.C102845n;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.speech.micro.GoogleHotwordData;

/* renamed from: com.google.android.apps.gsa.staticplugins.microdetection.a.a */
/* compiled from: PG */
public final /* synthetic */ class C102786a implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C102789d f286997a;

    /* renamed from: b */
    public final /* synthetic */ C92216a f286998b;

    /* renamed from: c */
    public final /* synthetic */ C92473f f286999c;

    /* renamed from: d */
    public final /* synthetic */ C58833ax f287000d;

    /* renamed from: e */
    public final /* synthetic */ int f287001e;

    /* renamed from: f */
    public final /* synthetic */ int f287002f;

    public /* synthetic */ C102786a(C102789d dVar, C92216a aVar, C92473f fVar, C58833ax axVar, int i, int i2) {
        this.f286997a = dVar;
        this.f286998b = aVar;
        this.f286999c = fVar;
        this.f287000d = axVar;
        this.f287001e = i;
        this.f287002f = i2;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C102789d dVar = this.f286997a;
        C92216a aVar = this.f286998b;
        C92473f fVar = this.f286999c;
        C58833ax axVar = this.f287000d;
        int i = this.f287001e;
        int i2 = this.f287002f;
        GoogleHotwordData googleHotwordData = (GoogleHotwordData) obj;
        if (googleHotwordData != null) {
            dVar.mo91277a(true);
            String str = fVar.f258017e;
            try {
                String ab = dVar.f287009d.mo83882ab();
                synchronized (dVar) {
                    C102843l c = C102845n.m170604c(aVar, i, i2, googleHotwordData, str, fVar.f258023k, fVar.f258014b);
                    ((C102832a) c).f287154j = fVar.f258024l;
                    ((C102832a) c).f287152h = ab;
                    c.mo93480e(fVar.f258015c.mo87200k().mo86785a());
                    c.mo93477b(false);
                    ((C102832a) c).f287153i = fVar.f258015c.mo87200k().mo86791f();
                    c.mo93478c(fVar.f258015c.mo87200k().mo86787c());
                    if (axVar != null) {
                        ((C102832a) c).f287155k = axVar;
                        c.mo93481f(fVar.f258015c.mo87183A());
                        dVar.f287007b = dVar.f287010e.mo93511a(c.mo93476a());
                        dVar.f287007b.mo93509e();
                    } else {
                        throw new NullPointerException("Null audioListeningSessionAdapterOptional");
                    }
                }
            } catch (IllegalArgumentException e) {
                ((C59052c) ((C59052c) ((C59052c) C102789d.f287006a.mo56225c()).mo56382g(e)).mo56372aa(21163)).mo56386p("Error creating MicroRecognitionRunner");
            }
        }
    }
}
