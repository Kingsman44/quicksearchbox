package com.google.android.libraries.p1975k.p1977b;

import com.google.android.libraries.p1975k.C23995c;
import com.google.protos.p4972d.p4983c.C64633b;
import com.google.protos.p4972d.p4983c.C64635d;
import com.google.protos.p4972d.p4983c.C64637f;
import com.google.protos.p4972d.p4983c.C64639h;

/* renamed from: com.google.android.libraries.k.b.o */
/* compiled from: PG */
public final class C23994o implements C23985f {

    /* renamed from: a */
    private final C23986g f65595a;

    /* renamed from: b */
    private final C64639h f65596b;

    /* renamed from: c */
    private final C23995c f65597c;

    public C23994o(C23986g gVar, C64639h hVar, C23995c cVar) {
        this.f65595a = gVar;
        this.f65596b = hVar;
        this.f65597c = cVar;
    }

    /* renamed from: b */
    private final boolean m44579b(C64635d dVar) {
        int i = 0;
        while (true) {
            int i2 = 1;
            if (i < dVar.f175217a.size()) {
                int b = C64633b.m96411b(dVar.f175217a.mo58914d(i));
                if (b != 0) {
                    i2 = b;
                }
                if (!this.f65595a.mo29401a(i2, this.f65597c).mo29397a()) {
                    return false;
                }
                i++;
            } else {
                for (C64637f c : dVar.f175218b) {
                    if (!m44580c(c)) {
                        return false;
                    }
                }
                return true;
            }
        }
    }

    /* renamed from: c */
    private final boolean m44580c(C64637f fVar) {
        for (int i = 0; i < fVar.f175221a.size(); i++) {
            int b = C64633b.m96411b(fVar.f175221a.mo58914d(i));
            if (b == 0) {
                b = 1;
            }
            if (this.f65595a.mo29401a(b, this.f65597c).mo29397a()) {
                return true;
            }
        }
        for (C64635d b2 : fVar.f175222b) {
            if (m44579b(b2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo29397a() {
        Boolean bool;
        int b;
        C64639h hVar = this.f65596b;
        int i = hVar.f175225a;
        if (i == 2) {
            bool = Boolean.valueOf(m44579b((C64635d) hVar.f175226b));
        } else if (i == 3) {
            bool = Boolean.valueOf(m44580c((C64637f) hVar.f175226b));
        } else {
            C23986g gVar = this.f65595a;
            int i2 = 1;
            if (i == 1 && (b = C64633b.m96411b(((Integer) hVar.f175226b).intValue())) != 0) {
                i2 = b;
            }
            bool = Boolean.valueOf(gVar.mo29401a(i2, this.f65597c).mo29397a());
        }
        return bool.booleanValue();
    }
}
