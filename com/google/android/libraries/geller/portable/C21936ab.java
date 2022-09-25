package com.google.android.libraries.geller.portable;

import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.protos.p4985f.p5030q.p5032b.C65039ax;
import com.google.protos.p5129p.p5131b.C65753ak;

/* renamed from: com.google.android.libraries.geller.portable.ab */
/* compiled from: PG */
public final /* synthetic */ class C21936ab implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ Geller f60516a;

    /* renamed from: b */
    public final /* synthetic */ C58528ij f60517b;

    /* renamed from: c */
    public final /* synthetic */ String f60518c;

    public /* synthetic */ C21936ab(Geller geller, C58528ij ijVar, String str) {
        this.f60516a = geller;
        this.f60517b = ijVar;
        this.f60518c = str;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        Geller geller = this.f60516a;
        C58528ij ijVar = this.f60517b;
        String str = this.f60518c;
        String[] strArr = new String[ijVar.size()];
        C58800sl lA = ijVar.iterator();
        int i = 0;
        while (lA.hasNext()) {
            strArr[i] = ((C65753ak) lA.next()).name();
            i++;
        }
        return C60856cj.m92900i((C65039ax) C21946al.m41084a(geller.nativeReadSnapshot(geller.f60381c, geller.mo27174a(str), strArr, 1), C65039ax.f176126b));
    }
}
