package com.google.android.apps.gsa.shared.util.debug.p7163a.p7164a;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.util.p7158b.C90745b;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.p1730f.C21383f;
import com.google.android.libraries.p1730f.p1731a.C21375e;
import com.google.common.base.C58827ar;
import com.google.common.p4552o.C59694ci;
import com.google.common.p4552o.C59770f;
import com.google.common.p4552o.C59810gc;
import com.google.common.p4552o.C59811gd;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.shared.util.debug.a.a.b */
/* compiled from: PG */
public final class C90966b extends C90983s {

    /* renamed from: b */
    private final C21370a f254183b = new C21375e();

    public C90966b(C90974j jVar) {
        super(jVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo85255a(MessageLite messageLite) {
        C59811gd gdVar = (C59811gd) messageLite;
        if ((gdVar.f161638a & 1) != 0) {
            C59694ci ciVar = gdVar.f161639b;
            if (ciVar == null) {
                ciVar = C59694ci.f160157e;
            }
            Date date = new Date(C21383f.m40448a(this.f254183b, TimeUnit.NANOSECONDS.toMillis(ciVar.f160161c)));
            StringBuilder sb = new StringBuilder();
            sb.append(C90745b.m148220a(date));
            sb.append(": ");
            int i = ciVar.f160160b;
            sb.append(String.format("number: %4s", new Object[]{Integer.valueOf(i)}));
            sb.append(" ");
            sb.append(String.format("name: %s", new Object[]{C89849ae.m146281a(i).name()}));
            if (!gdVar.f161640c.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (C59810gc gcVar : gdVar.f161640c) {
                    arrayList.add(String.format("%s: %s", new Object[]{gcVar.f161634b, gcVar.f161635c}));
                }
                sb.append(" (");
                sb.append(new C58827ar("; ").mo56097d(arrayList));
                sb.append(")");
            }
            if (!gdVar.f161641d.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                for (C59770f fVar : gdVar.f161641d) {
                    arrayList2.add(String.format("type = %s, code = %s", new Object[]{Integer.valueOf(fVar.f161504b), Integer.valueOf(fVar.f161505c)}));
                }
                sb.append(" errors = (");
                sb.append(new C58827ar("; ").mo56097d(arrayList2));
                sb.append(")");
            }
            this.f254188a.mo85257a(sb.toString());
        }
    }
}
