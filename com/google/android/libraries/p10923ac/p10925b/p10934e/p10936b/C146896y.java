package com.google.android.libraries.p10923ac.p10925b.p10934e.p10936b;

import com.google.android.libraries.p10923ac.p10925b.p10930c.p10932b.C146820q;
import com.google.android.libraries.p10923ac.p10925b.p10933d.C146825d;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147244a;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147256m;
import com.google.common.base.C58817ah;
import com.google.common.base.C58838bb;
import com.google.protos.p4895aw.p4902b.C63971ah;
import com.google.protos.p4895aw.p4902b.C64044d;
import com.google.protos.p4895aw.p4902b.C64088f;
import com.google.protos.p4895aw.p4902b.C64089g;

/* renamed from: com.google.android.libraries.ac.b.e.b.y */
/* compiled from: PG */
public final /* synthetic */ class C146896y implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C146877f f396521a;

    public /* synthetic */ C146896y(C146877f fVar) {
        this.f396521a = fVar;
    }

    public final Object apply(Object obj) {
        C146820q qVar;
        C63971ah ahVar;
        C146877f fVar = this.f396521a;
        C64089g gVar = (C64089g) obj;
        int a = C64088f.m96350a(gVar.f173269d);
        if (a != 0 && a == 3 && gVar.f173267b == 4 && (qVar = (C146820q) fVar.f396475b.apply(((C63971ah) gVar.f173268c).f173007c)) != null) {
            try {
                C64044d dVar = (C64044d) C64089g.f173264e.createBuilder();
                dVar.copyOnWrite();
                C64089g gVar2 = (C64089g) dVar.instance;
                gVar2.f173269d = 2;
                gVar2.f173266a |= 1;
                if (gVar.f173267b == 4) {
                    ahVar = (C63971ah) gVar.f173268c;
                } else {
                    ahVar = C63971ah.f173003f;
                }
                C58838bb.m90869d(C146877f.m239376a(qVar.mo123714c()).equals(ahVar.f173007c), "Can't compute diff between footprints with different secondary ids!");
                qVar.mo123713b();
                ahVar.f173008d.mo59174N();
                throw new UnsupportedOperationException("UnsupportedVcDiffService doesn't support encoding!");
            } catch (C146825d e) {
                ((C147256m) fVar.f396476c.mo27525b()).mo124062e("Failed to encode footprint payload!", e, new Object[0]);
                C147244a aVar = (C147244a) fVar.f396477d.mo27525b();
            }
        }
        return gVar;
    }
}
