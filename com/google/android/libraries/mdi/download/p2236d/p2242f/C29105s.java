package com.google.android.libraries.mdi.download.p2236d.p2242f;

import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.C29385ei;
import com.google.android.libraries.mdi.download.C29388el;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29037d;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.storage.protostore.C42937ce;
import com.google.android.libraries.storage.protostore.C42938cf;
import com.google.common.p4522b.C58800sl;
import com.google.protobuf.C62974ct;
import com.google.protobuf.MessageLite;
import java.util.Map;

/* renamed from: com.google.android.libraries.mdi.download.d.f.s */
/* compiled from: PG */
public final /* synthetic */ class C29105s implements C42937ce {

    /* renamed from: a */
    public final /* synthetic */ C29037d f78958a;

    public /* synthetic */ C29105s(C29037d dVar) {
        this.f78958a = dVar;
    }

    /* renamed from: a */
    public final MessageLite mo34548a(C42938cf cfVar, MessageLite messageLite) {
        C29037d dVar = this.f78958a;
        C29388el elVar = (C29388el) messageLite;
        C29385ei eiVar = (C29385ei) C29388el.f79664d.createBuilder();
        C58800sl lA = cfVar.mo46010a().entrySet().iterator();
        while (lA.hasNext()) {
            Map.Entry entry = (Map.Entry) lA.next();
            try {
                String str = (String) entry.getValue();
                str.getClass();
                try {
                    eiVar.mo34699a((String) entry.getKey(), (C29334dr) C29111y.m54039b(str, C29334dr.f79497w.getParserForType()));
                } catch (C62974ct e) {
                    C29045l.m53935g("SharedPreferences file groups metadata had unexpected format: %s", e);
                    dVar.mo34543h(1084);
                }
            } catch (ClassCastException | NullPointerException e2) {
                C29045l.m53935g("SharedPreferences file groups metadata key wasn't a string: %s", e2);
                dVar.mo34543h(1083);
            }
        }
        return (C29388el) eiVar.build();
    }
}
