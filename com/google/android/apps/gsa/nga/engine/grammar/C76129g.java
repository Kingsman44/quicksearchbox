package com.google.android.apps.gsa.nga.engine.grammar;

import com.google.nlp.p4735b.p4736a.p4738b.C62820b;
import com.google.nlp.p4735b.p4736a.p4738b.C62822d;
import com.google.nlp.p4735b.p4736a.p4738b.C62824f;
import com.google.nlp.p4735b.p4736a.p4738b.C62825g;
import com.google.nlp.p4735b.p4736a.p4738b.C62827i;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.nga.engine.grammar.g */
/* compiled from: PG */
public abstract class C76129g {
    /* renamed from: a */
    public abstract String mo72075a(C76143u uVar);

    /* renamed from: b */
    public static C76129g m122710b(C62825g gVar) {
        C62820b bVar;
        C62822d dVar;
        C62820b bVar2;
        C62825g gVar2;
        C62820b bVar3;
        C62827i iVar;
        String str;
        int i = gVar.f169656a;
        int a = C62824f.m94948a(i);
        int i2 = a - 1;
        if (a == 0) {
            throw null;
        } else if (i2 == 0) {
            if (i == 1) {
                bVar = (C62820b) gVar.f169657b;
            } else {
                bVar = C62820b.f169645c;
            }
            C62825g gVar3 = bVar.f169647a;
            if (gVar3 == null) {
                gVar3 = C62825g.f169654c;
            }
            C76129g b = m122710b(gVar3);
            C62825g gVar4 = bVar.f169648b;
            if (gVar4 == null) {
                gVar4 = C62825g.f169654c;
            }
            return new C76124b(b, m122710b(gVar4));
        } else if (i2 == 1) {
            if (i == 2) {
                dVar = (C62822d) gVar.f169657b;
            } else {
                dVar = C62822d.f169650b;
            }
            return new C76125c(dVar.f169652a);
        } else if (i2 == 2) {
            if (i == 3) {
                bVar2 = (C62820b) gVar.f169657b;
            } else {
                bVar2 = C62820b.f169645c;
            }
            C62825g gVar5 = bVar2.f169647a;
            if (gVar5 == null) {
                gVar5 = C62825g.f169654c;
            }
            C76129g b2 = m122710b(gVar5);
            C62825g gVar6 = bVar2.f169648b;
            if (gVar6 == null) {
                gVar6 = C62825g.f169654c;
            }
            return new C76126d(b2, m122710b(gVar6));
        } else if (i2 == 3) {
            if (i == 4) {
                gVar2 = (C62825g) gVar.f169657b;
            } else {
                gVar2 = C62825g.f169654c;
            }
            return new C76127e(m122710b(gVar2));
        } else if (i2 == 4) {
            if (i == 5) {
                bVar3 = (C62820b) gVar.f169657b;
            } else {
                bVar3 = C62820b.f169645c;
            }
            C62825g gVar7 = bVar3.f169647a;
            if (gVar7 == null) {
                gVar7 = C62825g.f169654c;
            }
            C76129g b3 = m122710b(gVar7);
            C62825g gVar8 = bVar3.f169648b;
            if (gVar8 == null) {
                gVar8 = C62825g.f169654c;
            }
            return new C76128f(b3, m122710b(gVar8));
        } else if (i2 != 5) {
            switch (C62824f.m94948a(i)) {
                case 1:
                    str = "AND_TERM";
                    break;
                case 2:
                    str = "CONST_TERM";
                    break;
                case 3:
                    str = "EQUALS_TERM";
                    break;
                case 4:
                    str = "NOT_TERM";
                    break;
                case 5:
                    str = "OR_TERM";
                    break;
                case 6:
                    str = "VAR_TERM";
                    break;
                case 7:
                    str = "TYPE_NOT_SET";
                    break;
                default:
                    str = "null";
                    break;
            }
            throw new IOException("Unknown type: ".concat(str));
        } else {
            if (i == 6) {
                iVar = (C62827i) gVar.f169657b;
            } else {
                iVar = C62827i.f169658b;
            }
            return new C76130h(iVar.f169660a);
        }
    }
}
