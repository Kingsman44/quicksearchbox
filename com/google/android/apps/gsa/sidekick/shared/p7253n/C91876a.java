package com.google.android.apps.gsa.sidekick.shared.p7253n;

import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.amh;
import com.google.common.p4552o.amj;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.n.a */
/* compiled from: PG */
public final class C91876a {

    /* renamed from: a */
    private static final C59071e f256198a = C59071e.m91332i("com.google.android.apps.gsa.sidekick.shared.n.a");

    /* renamed from: a */
    public static C60555uf m150547a(int i, long j) {
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = i;
        if (j != 0) {
            String b = C39191a.m68623b(j);
            tzVar.copyOnWrite();
            C60555uf ufVar2 = (C60555uf) tzVar.instance;
            b.getClass();
            ufVar2.f164093a |= 4;
            ufVar2.f164259n = b;
            amh amh = (amh) amj.f159149e.createBuilder();
            amh.copyOnWrite();
            amj amj = (amj) amh.instance;
            amj.f159151a |= 2;
            amj.f159153c = j;
            tzVar.copyOnWrite();
            C60555uf ufVar3 = (C60555uf) tzVar.instance;
            amj amj2 = (amj) amh.build();
            amj2.getClass();
            ufVar3.f164183bk = amj2;
            ufVar3.f164252g |= 32768;
        }
        return (C60555uf) tzVar.build();
    }

    /* renamed from: b */
    public static void m150548b(long j, long j2, long j3, C60555uf ufVar, C60321oe oeVar) {
        if (ufVar.f164258m != 472) {
            ((C59052c) ((C59052c) f256198a.mo56226d()).mo56372aa(11929)).mo56386p("Client event must be of type NATIVE_VISUAL_ELEMENTS_LOG_EVENT");
            int i = C90755l.f253831a;
            return;
        }
        C60548tz tzVar = (C60548tz) ufVar.toBuilder();
        if (j2 != 0) {
            String b = C39191a.m68623b(j2);
            tzVar.copyOnWrite();
            C60555uf ufVar2 = (C60555uf) tzVar.instance;
            b.getClass();
            ufVar2.f164093a |= 4;
            ufVar2.f164259n = b;
        }
        if (j != 0) {
            amh amh = (amh) amj.f159149e.createBuilder();
            amh.copyOnWrite();
            amj amj = (amj) amh.instance;
            amj.f159151a |= 2;
            amj.f159153c = j;
            tzVar.copyOnWrite();
            C60555uf ufVar3 = (C60555uf) tzVar.instance;
            amj amj2 = (amj) amh.build();
            amj2.getClass();
            ufVar3.f164183bk = amj2;
            ufVar3.f164252g |= 32768;
        }
        if (j3 != 0) {
            tzVar.copyOnWrite();
            C60555uf ufVar4 = (C60555uf) tzVar.instance;
            ufVar4.f164093a |= 16;
            ufVar4.f164261p = j3;
        }
        C89949q.m146525j((C60555uf) tzVar.build(), oeVar, (C63196b) null, (String) null);
    }
}
