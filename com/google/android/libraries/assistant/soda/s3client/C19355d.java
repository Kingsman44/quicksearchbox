package com.google.android.libraries.assistant.soda.s3client;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import java.util.Iterator;
import java.util.List;
import org.chromium.net.CronetProvider;
import org.chromium.net.ExperimentalCronetEngine;

/* renamed from: com.google.android.libraries.assistant.soda.s3client.d */
/* compiled from: PG */
public final /* synthetic */ class C19355d implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C19356e f54164a;

    public /* synthetic */ C19355d(C19356e eVar) {
        this.f54164a = eVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        List list;
        ExperimentalCronetEngine experimentalCronetEngine;
        try {
            list = CronetProvider.getAllProviders(this.f54164a.f54166b);
        } catch (RuntimeException e) {
            C59104x c = C19356e.f54165a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "SodaCPE");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(47731)).mo56386p("Unable to load native CronetEngine.");
            list = C58485gu.m89845m();
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                experimentalCronetEngine = null;
                break;
            }
            CronetProvider cronetProvider = (CronetProvider) it.next();
            if (cronetProvider.getName().equals(CronetProvider.PROVIDER_NAME_APP_PACKAGED) && cronetProvider.isEnabled()) {
                C59104x b = C19356e.f54165a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "SodaCPE");
                ((C59052c) ((C59052c) b).mo56372aa(47732)).mo56386p("Loaded CronetEngine from App APK.");
                experimentalCronetEngine = (ExperimentalCronetEngine) cronetProvider.createBuilder().build();
                break;
            }
        }
        experimentalCronetEngine.getClass();
        return C60856cj.m92900i(experimentalCronetEngine);
    }
}
