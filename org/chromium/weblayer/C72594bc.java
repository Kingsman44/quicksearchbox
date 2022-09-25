package org.chromium.weblayer;

import android.graphics.Bitmap;
import android.util.Pair;
import android.webkit.ValueCallback;
import com.google.android.libraries.web.p3343a.C43226b;
import com.google.android.libraries.web.weblayer.p3446a.C44120d;
import java.util.Map;

/* renamed from: org.chromium.weblayer.bc */
/* compiled from: PG */
public final /* synthetic */ class C72594bc implements ValueCallback {

    /* renamed from: a */
    public final /* synthetic */ C44120d f193135a;

    public /* synthetic */ C72594bc(C44120d dVar) {
        this.f193135a = dVar;
    }

    public final void onReceiveValue(Object obj) {
        C44120d dVar = this.f193135a;
        Pair pair = (Pair) obj;
        Map map = C72601bj.f193143a;
        Bitmap bitmap = (Bitmap) pair.first;
        int intValue = ((Integer) pair.second).intValue();
        if (intValue == 0) {
            if (bitmap == null) {
                intValue = 0;
            } else {
                dVar.f114839a.mo5437b(bitmap);
                return;
            }
        }
        dVar.f114839a.mo5439d(new C43226b(String.format("Screenshot can't be captured. Error code: %s.", new Object[]{Integer.valueOf(intValue)})));
    }
}
