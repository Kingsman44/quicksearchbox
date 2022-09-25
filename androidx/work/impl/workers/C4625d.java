package androidx.work.impl.workers;

import androidx.work.C4380ad;
import androidx.work.impl.p207b.C4470ae;
import androidx.work.impl.p207b.C4486au;
import androidx.work.impl.p207b.C4488aw;
import androidx.work.impl.p207b.C4502k;
import androidx.work.impl.p207b.C4503l;
import androidx.work.impl.p207b.C4511t;
import java.util.Iterator;
import java.util.List;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5474a.C69626l;

/* renamed from: androidx.work.impl.workers.d */
/* compiled from: PG */
public final class C4625d {

    /* renamed from: a */
    public static final String f14531a = C4380ad.m12561i("DiagnosticsWrkr");

    /* renamed from: a */
    public static final String m13020a(C4511t tVar, C4488aw awVar, C4503l lVar, List list) {
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4470ae aeVar = (C4470ae) it.next();
            C4502k a = lVar.mo9462a(C4486au.m12791a(aeVar));
            Integer valueOf = a != null ? Integer.valueOf(a.f14264c) : null;
            String ag = C69540x.m100851ag(tVar.mo9470a(aeVar.f14217b), ",", (CharSequence) null, (CharSequence) null, (C69626l) null, 62);
            String ag2 = C69540x.m100851ag(awVar.mo9446a(aeVar.f14217b), ",", (CharSequence) null, (CharSequence) null, (C69626l) null, 62);
            sb.append("\n" + aeVar.f14217b + "\t " + aeVar.f14219d + "\t " + valueOf + "\t " + aeVar.f14218c.name() + "\t " + ag + "\t " + ag2 + 9);
        }
        return sb.toString();
    }
}
