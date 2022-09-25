package com.google.android.libraries.lens.view.session.ondevice;

import android.util.Size;
import com.google.android.libraries.lens.common.p1998a.C24093a;
import com.google.android.libraries.lens.common.text.C24130f;
import com.google.android.libraries.lens.common.text.C24131g;
import com.google.android.libraries.lens.common.text.C24132h;
import com.google.android.libraries.lens.common.text.C24133i;
import com.google.android.libraries.lens.common.text.C24142r;
import com.google.android.libraries.lens.view.session.ondevice.p2168c.C27928b;
import com.google.android.libraries.lens.view.session.ondevice.p2168c.C27943q;
import com.google.lens.p4699e.C62217bc;
import com.google.lens.p4699e.C62218bd;
import com.google.p4172bg.p4174b.C55715d;
import com.google.p4172bg.p4174b.C55721j;
import com.google.p4172bg.p4174b.C55735x;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56224ae;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56232am;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56233an;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56238as;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56241av;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.ac */
/* compiled from: PG */
public final class C27912ac {
    /* renamed from: a */
    public static C27943q m51961a(C55721j jVar, Size size) {
        C56232am amVar = (C56232am) C56233an.f149775d.createBuilder();
        C55715d dVar = jVar.f147021c;
        if (dVar == null) {
            dVar = C55715d.f146997g;
        }
        C56224ae f = C24093a.m44750f(dVar, size);
        amVar.copyOnWrite();
        C56233an anVar = (C56233an) amVar.instance;
        f.getClass();
        anVar.f149779c = f;
        anVar.f149777a |= 1;
        for (C55735x xVar : jVar.f147020b) {
            C56238as asVar = (C56238as) C56241av.f149791g.createBuilder();
            String str = xVar.f147087c;
            asVar.copyOnWrite();
            C56241av avVar = (C56241av) asVar.instance;
            str.getClass();
            avVar.f149793a |= 1;
            avVar.f149795c = str;
            C55715d dVar2 = xVar.f147086b;
            if (dVar2 == null) {
                dVar2 = C55715d.f146997g;
            }
            C56224ae f2 = C24093a.m44750f(dVar2, size);
            asVar.copyOnWrite();
            C56241av avVar2 = (C56241av) asVar.instance;
            f2.getClass();
            avVar2.f149797e = f2;
            avVar2.f149793a |= 4;
            amVar.mo54339a(asVar);
        }
        C62217bc bcVar = (C62217bc) C62218bd.f167980e.createBuilder();
        int intValue = ((Integer) C24142r.m44847c(Collection.EL.stream(jVar.f147020b).filter(C24130f.f65888a).mapToInt(C24131g.f65889a).toArray()).mo56109e(-16777216)).intValue();
        bcVar.copyOnWrite();
        C62218bd bdVar = (C62218bd) bcVar.instance;
        bdVar.f167982a |= 1;
        bdVar.f167983b = intValue;
        int intValue2 = ((Integer) C24142r.m44847c(Collection.EL.stream(jVar.f147020b).filter(C24132h.f65890a).mapToInt(C24133i.f65891a).toArray()).mo56109e(-1)).intValue();
        bcVar.copyOnWrite();
        C62218bd bdVar2 = (C62218bd) bcVar.instance;
        bdVar2.f167982a |= 2;
        bdVar2.f167984c = intValue2;
        return new C27928b((C56233an) amVar.build(), (C62218bd) bcVar.build(), jVar.f147022d);
    }
}
