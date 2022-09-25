package com.google.android.apps.search.assistant.verticals.ambient.smartspace;

import com.google.apps.tiktok.p3633d.p3634a.C46663a;
import com.google.apps.tiktok.p3633d.p3634a.C46667e;
import com.google.common.p4552o.ali;
import com.google.common.p4552o.alk;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63088z;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.smartspace.b */
/* compiled from: PG */
final class C131597b implements Callable {

    /* renamed from: a */
    final /* synthetic */ C60870cx f359551a;

    /* renamed from: b */
    final /* synthetic */ C60870cx f359552b;

    public C131597b(C60870cx cxVar, C60870cx cxVar2) {
        this.f359551a = cxVar;
        this.f359552b = cxVar2;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C60870cx cxVar = this.f359551a;
        C60870cx cxVar2 = this.f359552b;
        StringBuilder sb = new StringBuilder("Smartspace TNG debug dump:\n\nUser Settings:\n");
        for (alk alk : (List) C60856cj.m92909r(cxVar)) {
            ali a = ali.m92430a(alk.f159063b);
            if (a == null) {
                a = ali.UNSPECIFIED;
            }
            String name = a.name();
            boolean z = alk.f159064c;
            sb.append(name + " : " + z);
            sb.append(10);
        }
        sb.append("\nLast Smartspace update\n");
        sb.append((String) C60856cj.m92909r(cxVar2));
        String sb2 = sb.toString();
        C46663a aVar = new C46663a();
        aVar.mo50684b(true);
        aVar.f121916a = C63088z.m96143E(sb2);
        aVar.mo50686d(C46667e.TEXT);
        return aVar.mo50683a();
    }
}
