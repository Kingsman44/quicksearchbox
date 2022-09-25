package com.google.apps.tiktok.p3633d.p3634a;

import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import java.util.AbstractMap;

/* renamed from: com.google.apps.tiktok.d.a.k */
/* compiled from: PG */
public final /* synthetic */ class C46673k implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f121940a;

    /* renamed from: b */
    public final /* synthetic */ C46677o f121941b;

    public /* synthetic */ C46673k(String str, C46677o oVar) {
        this.f121940a = str;
        this.f121941b = oVar;
    }

    public final Object apply(Object obj) {
        String str;
        String str2;
        String str3 = this.f121940a;
        C46677o oVar = this.f121941b;
        C46669g gVar = (C46669g) obj;
        if (gVar == C46675m.f121943k) {
            return new AbstractMap.SimpleEntry(str3, gVar);
        }
        if (!gVar.mo50689c() || oVar.mo50699c()) {
            C46667e a = gVar.mo50687a();
            C58485gu b = oVar.mo50698b();
            int size = b.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                if (((C46667e) b.get(i)) == a) {
                    C46667e eVar = C46667e.KEY_VALUE;
                    int ordinal = a.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal == 2) {
                                str2 = String.valueOf(str3);
                                str = ".html";
                            } else if (ordinal == 3) {
                                str2 = String.valueOf(str3);
                                str = ".bin";
                            } else {
                                throw new UnsupportedOperationException();
                            }
                            str3 = str2.concat(str);
                        } else {
                            str3 = String.valueOf(str3).concat(".txt");
                        }
                    }
                    return new AbstractMap.SimpleEntry(str3, gVar);
                }
                i = i2;
            }
            throw new IllegalArgumentException("Got unexpected DataType");
        }
        throw new IllegalArgumentException("DebugData may contain PII, but no PII was allowed.");
    }
}
