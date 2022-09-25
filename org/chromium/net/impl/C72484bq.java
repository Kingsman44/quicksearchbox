package org.chromium.net.impl;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

/* renamed from: org.chromium.net.impl.bq */
/* compiled from: PG */
final class C72484bq implements C72500cf {

    /* renamed from: a */
    final /* synthetic */ C72499ce f192857a;

    public C72484bq(C72499ce ceVar) {
        this.f192857a = ceVar;
    }

    /* renamed from: a */
    public final void mo64214a() {
        if (this.f192857a.f192898g.get() != 8) {
            URL url = new URL(this.f192857a.f192904m);
            HttpURLConnection httpURLConnection = this.f192857a.f192908q;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
                this.f192857a.f192908q = null;
            }
            this.f192857a.f192908q = (HttpURLConnection) url.openConnection();
            boolean z = false;
            this.f192857a.f192908q.setInstanceFollowRedirects(false);
            if (!this.f192857a.f192896e.containsKey("User-Agent")) {
                C72499ce ceVar = this.f192857a;
                ceVar.f192896e.put("User-Agent", ceVar.f192895d);
            }
            for (Map.Entry entry : this.f192857a.f192896e.entrySet()) {
                this.f192857a.f192908q.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            C72499ce ceVar2 = this.f192857a;
            if (ceVar2.f192900i == null) {
                ceVar2.f192900i = "GET";
            }
            ceVar2.f192908q.setRequestMethod(ceVar2.f192900i);
            C72499ce ceVar3 = this.f192857a;
            C72520cz czVar = ceVar3.f192901j;
            if (czVar != null) {
                ceVar3.f192909r = new C72496cb(ceVar3, ceVar3.f192902k, ceVar3.f192894c, ceVar3.f192908q, czVar);
                C72499ce ceVar4 = this.f192857a;
                C72496cb cbVar = ceVar4.f192909r;
                if (ceVar4.f192897f.size() == 1) {
                    z = true;
                }
                cbVar.mo64218d(new C72469bb(cbVar, z));
                return;
            }
            ceVar3.f192903l = 10;
            this.f192857a.f192908q.connect();
            this.f192857a.mo64250k();
        }
    }
}
