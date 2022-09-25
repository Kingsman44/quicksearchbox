package com.google.android.apps.search.assistant.platform.ondevice.p9264c.p9265a.p9268c;

import com.google.android.apps.gsa.binaries.satin.app.aog;
import com.google.android.apps.gsa.binaries.satin.app.aoh;
import com.google.android.libraries.search.assistant.p2700k.C34786x;
import com.google.android.libraries.search.assistant.p2700k.p2701a.C34760c;
import com.google.android.libraries.search.assistant.p2700k.p2702b.C34763b;
import com.google.common.p4522b.C58759qy;
import com.google.frameworks.client.data.android.p4638e.C61409d;
import p5488io.grpc.C70290cs;
import p5488io.grpc.C70297cz;
import p5488io.grpc.C70334de;
import p5488io.grpc.p5533i.C70866e;
import p5488io.grpc.p5533i.C70879r;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.c.a.c.a */
/* compiled from: PG */
public final class C122146a {

    /* renamed from: a */
    private static final C70297cz f338815a = new C70290cs("X-Goog-Api-Key", C70334de.f187481c);

    /* renamed from: b */
    private static final C70297cz f338816b = new C70290cs("X-Android-Package", C70334de.f187481c);

    /* renamed from: c */
    private static final C70297cz f338817c = new C70290cs("X-Android-Cert", C70334de.f187481c);

    /* renamed from: a */
    public static C70866e m201689a(C70866e eVar, aog aog) {
        C70334de deVar = new C70334de();
        deVar.mo62033h(f338815a, "AIzaSyDbHU30I-v5OpOJm1-uff09-NJbd6I8InU");
        deVar.mo62033h(f338816b, "com.google.android.googlequicksearchbox");
        deVar.mo62033h(f338817c, "38918A453D07199354F8B19AF05EC6562CED5788");
        C34786x xVar = new C34786x(new C58759qy("https://www.googleapis.com/auth/assistant"), new C34763b());
        return eVar.mo62576o(new C70879r(deVar)).mo62577p(C61409d.f166071a, new C34760c(xVar, (aoh) aog.f199107a.b.f198027a.f199322co.mo17428b()));
    }
}
