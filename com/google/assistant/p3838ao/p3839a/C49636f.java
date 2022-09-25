package com.google.assistant.p3838ao.p3839a;

import com.google.assistant.p3838ao.p3839a.p3842c.C49482f;
import com.google.assistant.p3838ao.p3839a.p3842c.C49485i;
import com.google.assistant.p3838ao.p3839a.p3842c.C49488l;
import com.google.assistant.p3838ao.p3839a.p3842c.C49491o;
import com.google.assistant.p3838ao.p3839a.p3845e.C49522af;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.assistant.ao.a.f */
/* compiled from: PG */
public final class C49636f {

    /* renamed from: a */
    private static final C58974d f128121a = C58974d.m91136j();

    /* renamed from: b */
    private static final C49485i f128122b = new C49488l(C49515e.f127750a);

    /* renamed from: c */
    private final C49485i[] f128123c;

    public C49636f(C49491o oVar, C49482f fVar) {
        int max = Math.max(40, 40);
        C49485i[] iVarArr = new C49485i[max];
        iVarArr[0] = f128122b;
        for (int i = 1; i < max; i++) {
            int c = C49522af.m85575c(i);
            C49485i a = oVar.mo53274a(c);
            if (a == null && (a = fVar.mo53271a(c)) == null) {
                a = f128122b;
                C58970a aVar = (C58970a) ((C58970a) f128121a.mo56226d()).mo56372aa(54804);
                String a2 = C49522af.m85573a(c);
                if (c != 0) {
                    aVar.mo56389s("Missing generator mapping for generator %s", a2);
                } else {
                    throw null;
                }
            }
            iVarArr[i] = a;
        }
        this.f128123c = iVarArr;
    }

    /* renamed from: a */
    public final C49485i mo53279a(int i) {
        try {
            return this.f128123c[C49522af.m85574b(i)];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return f128122b;
        }
    }
}
