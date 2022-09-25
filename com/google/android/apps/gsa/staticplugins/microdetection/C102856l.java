package com.google.android.apps.gsa.staticplugins.microdetection;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.gsa.search.core.state.p6864a.C86787b;
import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.microdetection.l */
/* compiled from: PG */
public final /* synthetic */ class C102856l implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ MicroDetectionWorker f287280a;

    public /* synthetic */ C102856l(MicroDetectionWorker microDetectionWorker) {
        this.f287280a = microDetectionWorker;
    }

    public final void run() {
        List<AccessibilityServiceInfo> list;
        MicroDetectionWorker microDetectionWorker = this.f287280a;
        C86787b bVar = microDetectionWorker.f286972c;
        AccessibilityManager accessibilityManager = (AccessibilityManager) microDetectionWorker.f286975h.getSystemService("accessibility");
        boolean z = false;
        if (accessibilityManager.isEnabled()) {
            try {
                list = accessibilityManager.getEnabledAccessibilityServiceList(1);
            } catch (NullPointerException e) {
                C59104x c = MicroDetectionWorker.f286928a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "MicroDetectionWorker");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(21135)).mo56386p("NPE in getEnabledAccessibilityServiceList");
                list = null;
            }
            if (list != null && !list.isEmpty()) {
                z = true;
            }
        }
        bVar.mo80436j(z);
    }
}
