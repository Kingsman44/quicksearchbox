package com.google.android.libraries.mdi.download.p2236d.p2242f;

import com.google.android.libraries.mdi.download.C29402ez;
import com.google.android.libraries.mdi.download.C29406fa;
import com.google.android.libraries.mdi.download.C29408fc;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29037d;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.storage.protostore.C42937ce;
import com.google.android.libraries.storage.protostore.C42938cf;
import com.google.common.p4522b.C58800sl;
import com.google.protobuf.C62974ct;
import com.google.protobuf.MessageLite;
import java.util.Map;

/* renamed from: com.google.android.libraries.mdi.download.d.f.r */
/* compiled from: PG */
public final /* synthetic */ class C29104r implements C42937ce {

    /* renamed from: a */
    public final /* synthetic */ C29037d f78957a;

    public /* synthetic */ C29104r(C29037d dVar) {
        this.f78957a = dVar;
    }

    /* renamed from: a */
    public final MessageLite mo34548a(C42938cf cfVar, MessageLite messageLite) {
        C29037d dVar = this.f78957a;
        C29408fc fcVar = (C29408fc) messageLite;
        C29406fa faVar = (C29406fa) C29408fc.f79727b.createBuilder();
        C58800sl lA = cfVar.mo46010a().entrySet().iterator();
        while (lA.hasNext()) {
            Map.Entry entry = (Map.Entry) lA.next();
            try {
                String str = (String) entry.getValue();
                str.getClass();
                try {
                    faVar.mo34709a((String) entry.getKey(), (C29402ez) C29111y.m54039b(str, C29402ez.f79711h.getParserForType()));
                } catch (C62974ct e) {
                    C29045l.m53935g("SharedPreferences shared files metadata had unexpected format: %s", e);
                    dVar.mo34543h(1084);
                }
            } catch (ClassCastException | NullPointerException e2) {
                C29045l.m53935g("SharedPreferences shared files metadata key wasn't a string: %s", e2);
                dVar.mo34543h(1083);
            }
        }
        return (C29408fc) faVar.build();
    }
}
