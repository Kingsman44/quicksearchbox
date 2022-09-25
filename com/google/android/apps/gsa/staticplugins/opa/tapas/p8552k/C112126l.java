package com.google.android.apps.gsa.staticplugins.opa.tapas.p8552k;

import android.net.Uri;
import com.google.android.libraries.assistant.p1594s.p1599c.C19202d;
import com.google.android.libraries.assistant.p1594s.p1599c.C19204f;
import com.google.android.libraries.assistant.p1594s.p1599c.C19206h;
import com.google.common.base.C58817ah;
import java.util.HashMap;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.k.l */
/* compiled from: PG */
public final /* synthetic */ class C112126l implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C112127m f311353a;

    /* renamed from: b */
    public final /* synthetic */ String f311354b = "assistant_appintegration_appactions_config";

    public /* synthetic */ C112126l(C112127m mVar) {
        this.f311353a = mVar;
    }

    public final Object apply(Object obj) {
        C112127m mVar = this.f311353a;
        String str = this.f311354b;
        C19202d dVar = (C19202d) obj;
        if (dVar == null) {
            mVar.mo99407h(2, "#readFileGroup: can't process AppIntegrationEngines", new Object[0]);
        }
        HashMap hashMap = new HashMap();
        for (C19206h hVar : dVar.f53766c) {
            for (C19204f fVar : hVar.f53780d) {
                if (fVar.f53771b.equals(str) && !hashMap.containsKey(fVar.f53772c)) {
                    try {
                        String path = Uri.parse(fVar.f53773d).getPath();
                        if (path != null && path.length() > 0) {
                            hashMap.put(fVar.f53772c, mVar.mo99405f(path));
                        }
                    } catch (RuntimeException unused) {
                        hashMap.put(fVar.f53772c, mVar.mo99405f(fVar.f53773d));
                    }
                }
            }
        }
        return hashMap;
    }
}
