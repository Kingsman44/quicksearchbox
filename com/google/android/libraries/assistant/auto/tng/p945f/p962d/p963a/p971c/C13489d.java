package com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p971c;

import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13543s;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p971c.p976c.C13488g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.TextClassifierLib;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.d.a.c.d */
/* compiled from: PG */
public final /* synthetic */ class C13489d implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C13496k f41381a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f41382b;

    /* renamed from: c */
    public final /* synthetic */ C13543s f41383c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f41384d;

    public /* synthetic */ C13489d(C13496k kVar, C60870cx cxVar, C13543s sVar, C60870cx cxVar2) {
        this.f41381a = kVar;
        this.f41382b = cxVar;
        this.f41383c = sVar;
        this.f41384d = cxVar2;
    }

    public final Object call() {
        C13496k kVar = this.f41381a;
        C60870cx cxVar = this.f41382b;
        C13543s sVar = this.f41383c;
        C60870cx cxVar2 = this.f41384d;
        try {
            TextClassifierLib textClassifierLib = (TextClassifierLib) C60856cj.m92909r(cxVar);
            String e = C13488g.m29748e(textClassifierLib.mo58303d(C13488g.m29747d(sVar)));
            if (!((Locale) C60856cj.m92909r(cxVar2)).getLanguage().equals(new Locale(e).getLanguage())) {
                C59104x c = C13496k.f41395a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "TcLibSmartActionGen");
                C59052c cVar = (C59052c) ((C59052c) c).mo56372aa(44820);
                if (true == e.isEmpty()) {
                    e = "UNDETECTABLE";
                }
                cVar.mo56389s("Aborted smart action generation on unsupported language: %s.", e);
                return C13496k.m29755b(kVar.f41397c, 4);
            }
            C13494i e2 = C13495j.m29750e();
            C13462a aVar = (C13462a) e2;
            aVar.f41314a = C58836b.f156633a;
            aVar.f41315b = C58833ax.m90834k(textClassifierLib);
            aVar.f41317d = 3;
            aVar.f41316c = C58836b.f156633a;
            return e2.mo21100a();
        } catch (ExecutionException e3) {
            C59104x c2 = C13496k.f41395a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "TcLibSmartActionGen");
            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e3)).mo56372aa(44821)).mo56386p("Failed to initialize TextClassifierLib");
            return C13496k.m29755b(kVar.f41397c, 8);
        }
    }
}
