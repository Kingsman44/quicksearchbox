package com.google.android.apps.gsa.staticplugins.nowcards.p8116f;

import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.libraries.p2460r.p2469c.p2470a.C32062e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.p375ai.p378b.C7746ik;
import com.google.p4140ba.p4141a.p4142a.C54777a;
import com.google.p4140ba.p4141a.p4142a.C54780b;
import com.google.p4140ba.p4141a.p4142a.p4143a.C54778a;
import com.google.p4140ba.p4141a.p4142a.p4143a.C54779b;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57404cb;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protos.p4816ai.p4818b.C63196b;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.f.q */
/* compiled from: PG */
public final class C104891q implements C32062e {

    /* renamed from: a */
    public C7746ik f292295a = C7746ik.UNKNOWN;

    /* renamed from: a */
    public final void mo37848a(List list) {
        if (!list.isEmpty()) {
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 1327;
            C54778a aVar = (C54778a) C54779b.f143715b.createBuilder();
            aVar.copyOnWrite();
            C54779b bVar = (C54779b) aVar.instance;
            C62961ch chVar = bVar.f143717a;
            if (!chVar.mo58948c()) {
                bVar.f143717a = C62942bv.mutableCopy(chVar);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                bVar.f143717a.mo58916g(((C57404cb) it.next()).f153363B);
            }
            tzVar.copyOnWrite();
            C60555uf ufVar2 = (C60555uf) tzVar.instance;
            C54779b bVar2 = (C54779b) aVar.build();
            bVar2.getClass();
            ufVar2.f164233ck = bVar2;
            ufVar2.f164255j |= 1;
            C54777a aVar2 = (C54777a) C54780b.f143718c.createBuilder();
            C7746ik ikVar = this.f292295a;
            aVar2.copyOnWrite();
            C54780b bVar3 = (C54780b) aVar2.instance;
            bVar3.f143721b = ikVar.f27108J;
            bVar3.f143720a |= 1;
            tzVar.copyOnWrite();
            C60555uf ufVar3 = (C60555uf) tzVar.instance;
            C54780b bVar4 = (C54780b) aVar2.build();
            bVar4.getClass();
            ufVar3.f164234cl = bVar4;
            ufVar3.f164255j |= 2;
            C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        }
    }
}
