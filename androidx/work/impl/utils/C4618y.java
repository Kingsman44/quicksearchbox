package androidx.work.impl.utils;

import androidx.p186q.p187a.C4047b;
import androidx.work.C4394ar;
import androidx.work.C4398av;
import androidx.work.impl.C4452ag;
import androidx.work.impl.p207b.C4470ae;
import androidx.work.impl.p207b.C4493ba;
import androidx.work.impl.p207b.C4500i;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.work.impl.utils.y */
/* compiled from: PG */
public final class C4618y extends C4619z {

    /* renamed from: a */
    final /* synthetic */ C4452ag f14516a;

    /* renamed from: b */
    final /* synthetic */ C4398av f14517b;

    public C4618y(C4452ag agVar, C4398av avVar) {
        this.f14516a = agVar;
        this.f14517b = avVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9559a() {
        String str;
        C4500i B = this.f14516a.f14143e.mo9360B();
        C4398av avVar = this.f14517b;
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder("SELECT * FROM workspec");
        String str2 = " AND";
        if (!avVar.f14039d.isEmpty()) {
            List<C4394ar> list = avVar.f14039d;
            ArrayList arrayList2 = new ArrayList(C69540x.m100804k(list, 10));
            for (C4394ar arVar : list) {
                C69664n.m101058d(arVar);
                arrayList2.add(Integer.valueOf(C4493ba.m12808d(arVar)));
            }
            sb.append(" WHERE state IN (");
            C4613t.m13006a(sb, arrayList2.size());
            sb.append(")");
            arrayList.addAll(arrayList2);
            str = str2;
        } else {
            str = " WHERE";
        }
        if (!avVar.f14036a.isEmpty()) {
            List<UUID> list2 = avVar.f14036a;
            ArrayList arrayList3 = new ArrayList(C69540x.m100804k(list2, 10));
            for (UUID uuid : list2) {
                arrayList3.add(uuid.toString());
            }
            sb.append(str.concat(" id IN ("));
            C4613t.m13006a(sb, avVar.f14036a.size());
            sb.append(")");
            arrayList.addAll(arrayList3);
            str = str2;
        }
        if (!avVar.f14038c.isEmpty()) {
            sb.append(str.concat(" id IN (SELECT work_spec_id FROM worktag WHERE tag IN ("));
            C4613t.m13006a(sb, avVar.f14038c.size());
            sb.append("))");
            arrayList.addAll(avVar.f14038c);
        } else {
            str2 = str;
        }
        if (!avVar.f14037b.isEmpty()) {
            sb.append(str2.concat(" id IN (SELECT work_spec_id FROM workname WHERE name IN ("));
            C4613t.m13006a(sb, avVar.f14037b.size());
            sb.append("))");
            arrayList.addAll(avVar.f14037b);
        }
        sb.append(";");
        String sb2 = sb.toString();
        Object[] array = arrayList.toArray(new Object[0]);
        C69664n.m101059e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return C4470ae.m12717b(B.mo9458a(new C4047b(sb2, array)));
    }
}
