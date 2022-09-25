package org.chromium.net.impl;

import com.evernote.android.state.BuildConfig;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: org.chromium.net.impl.bm */
/* compiled from: PG */
final class C72480bm implements C72500cf {

    /* renamed from: a */
    final /* synthetic */ C72499ce f192852a;

    public C72480bm(C72499ce ceVar) {
        this.f192852a = ceVar;
    }

    /* renamed from: a */
    public final void mo64214a() {
        ReadableByteChannel readableByteChannel;
        List list;
        if (this.f192852a.f192908q != null) {
            ArrayList arrayList = new ArrayList();
            String str = "http/1.1";
            int i = 0;
            while (true) {
                String headerFieldKey = this.f192852a.f192908q.getHeaderFieldKey(i);
                if (headerFieldKey == null) {
                    break;
                }
                if ("X-Android-Selected-Transport".equalsIgnoreCase(headerFieldKey)) {
                    str = this.f192852a.f192908q.getHeaderField(i);
                }
                if (!headerFieldKey.startsWith("X-Android")) {
                    arrayList.add(new AbstractMap.SimpleEntry(headerFieldKey, this.f192852a.f192908q.getHeaderField(i)));
                }
                i++;
            }
            int responseCode = this.f192852a.f192908q.getResponseCode();
            C72499ce ceVar = this.f192852a;
            ceVar.f192906o = new C72513cs(new ArrayList(ceVar.f192897f), responseCode, this.f192852a.f192908q.getResponseMessage(), Collections.unmodifiableList(arrayList), false, str, BuildConfig.FLAVOR, 0);
            if (responseCode < 300 || responseCode >= 400 || (list = (List) this.f192852a.f192906o.f192955e.getAsMap().get("location")) == null) {
                this.f192852a.mo64248i();
                if (responseCode >= 400) {
                    InputStream errorStream = this.f192852a.f192908q.getErrorStream();
                    C72499ce ceVar2 = this.f192852a;
                    if (errorStream == null) {
                        readableByteChannel = null;
                    } else {
                        readableByteChannel = C72457aq.m107162a(errorStream);
                    }
                    ceVar2.f192905n = readableByteChannel;
                    this.f192852a.f192893b.mo64241c();
                    return;
                }
                C72499ce ceVar3 = this.f192852a;
                ceVar3.f192905n = C72457aq.m107162a(ceVar3.f192908q.getInputStream());
                this.f192852a.f192893b.mo64241c();
                return;
            }
            C72499ce ceVar4 = this.f192852a;
            ceVar4.mo64252m(1, 2, new C72483bp(ceVar4, (String) list.get(0)));
        }
    }
}
