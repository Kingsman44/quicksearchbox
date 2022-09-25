package com.google.android.libraries.assistant.soda.s3client;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.impl.C72461au;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.soda.s3client.c */
/* compiled from: PG */
public final class C19354c implements C19353b {

    /* renamed from: a */
    private static final C59071e f54162a = C59071e.m91332i("com.google.android.libraries.assistant.soda.s3client.c");

    /* renamed from: b */
    private final C69464a f54163b;

    public C19354c(C69464a aVar) {
        this.f54163b = aVar;
    }

    /* renamed from: a */
    public final ExperimentalCronetEngine mo24492a() {
        try {
            ExperimentalCronetEngine experimentalCronetEngine = (ExperimentalCronetEngine) this.f54163b.mo17428b();
            if (experimentalCronetEngine instanceof C72461au) {
                C59104x d = f54162a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "SodaCPD");
                ((C59052c) ((C59052c) d).mo56372aa(47730)).mo56386p("JavaCronetEngine loaded which does not support bidi streams.");
                return null;
            }
            C59104x b = f54162a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "SodaCPD");
            ((C59052c) ((C59052c) b).mo56372aa(47728)).mo56386p("Loaded CronetEngine.");
            return experimentalCronetEngine;
        } catch (Throwable th) {
            C59104x c = f54162a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "SodaCPD");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(47729)).mo56386p("Unable to instantiate CronetEngine.");
            return null;
        }
    }
}
