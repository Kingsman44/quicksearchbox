package com.google.android.apps.gsa.search.core.tasks;

import android.content.Context;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.util.ProguardMustNotDelete;
import com.google.android.apps.gsa.shared.util.p7159c.C90881ao;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.shared.util.p7167e.C91034a;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60934v;
import java.util.ArrayList;
import java.util.Set;

@ProguardMustNotDelete
/* compiled from: PG */
public class TrimFromDiskTask implements C118549h {

    /* renamed from: a */
    public final Context f235576a;

    /* renamed from: b */
    private final C58528ij f235577b;

    /* renamed from: c */
    private final C90929bz f235578c;

    public TrimFromDiskTask(Set set, C90929bz bzVar, Context context) {
        this.f235577b = C58528ij.m90006F(set);
        this.f235578c = bzVar;
        this.f235576a = context;
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f235577b.size();
        ArrayList arrayList = new ArrayList(this.f235577b.size());
        C58800sl lA = this.f235577b.iterator();
        while (lA.hasNext()) {
            arrayList.add(((C91034a) lA.next()).mo85316o());
        }
        return this.f235578c.mo85141f(C60856cj.m92892a(arrayList).mo57334a(new C60934v(C118826c.f331422a), C60826bg.f164896a), new C90881ao("TrimFromDiskTask#clearCacheDir", 2, 8, new C87179c(this)));
    }
}
