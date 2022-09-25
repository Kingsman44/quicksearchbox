package com.google.android.apps.search.sceneviewer.modelviewer;

import android.net.Uri;
import androidx.core.p097i.C1970e;
import com.google.common.p4526f.C59052c;
import com.google.p3723ar.core.viewer.jniprotolite.Types;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.search.sceneviewer.modelviewer.ad */
/* compiled from: PG */
public final /* synthetic */ class C141575ad implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C141584am f384257a;

    public /* synthetic */ C141575ad(C141584am amVar) {
        this.f384257a = amVar;
    }

    public final void run() {
        C141584am amVar = this.f384257a;
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C1970e("session_id", amVar.f384338g.toString()));
            arrayList.add(new C1970e("ar_available", Boolean.toString(amVar.f384353v.supportsArMode())));
            arrayList.add(new C1970e("session_used_ar", Boolean.toString(amVar.f384316ah)));
            if (Types.SceneViewerParams.StreamingMode.STREAMING_PREFERRED.equals(amVar.f384356y.getMode())) {
                arrayList.add(new C1970e("streaming_mode", "1"));
            }
            Uri uri = amVar.f384297Y;
            if (uri != null) {
                arrayList.add(new C1970e("launch_url", uri.toString()));
            }
            amVar.f384341j.mo116554a(amVar.f384337f.getActivity(), arrayList);
        } catch (Exception e) {
            ((C59052c) ((C59052c) ((C59052c) C141584am.f384271b.mo56225c()).mo56382g(e)).mo56372aa(41754)).mo56386p("Exception triggering survey");
        }
        amVar.f384317ai = true;
    }
}
