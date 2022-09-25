package com.google.android.libraries.search.logging.appflows;

import android.content.Context;
import com.google.android.gms.clearcut.C143658k;
import com.google.android.libraries.search.logging.C38828b;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.C37305o;
import com.google.android.libraries.search.p2871b.C37318s;
import com.google.android.libraries.search.p2871b.C37319t;
import com.google.android.libraries.search.p2871b.p2891f.C37237b;
import com.google.common.p4522b.C58800sl;

/* renamed from: com.google.android.libraries.search.logging.appflows.k */
/* compiled from: PG */
public final class C38788k implements C38780c {

    /* renamed from: a */
    public final String f102367a;

    /* renamed from: b */
    private final C37305o f102368b;

    /* renamed from: c */
    private final Context f102369c;

    public C38788k(Context context, String str, C37305o oVar) {
        this.f102369c = context;
        this.f102367a = str;
        this.f102368b = oVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C37215b mo41619a(C38828b bVar) {
        return C38779b.m68086a(this, bVar);
    }

    /* renamed from: b */
    public final synchronized C37215b mo41620b(C38828b bVar, C38792o oVar) {
        C143658k a;
        C37318s g;
        a = C143658k.m233374c(this.f102369c, "ANDROID_GSA").mo118952a();
        g = C37319t.m66313g();
        g.mo40746d(false);
        g.mo40747e(true);
        C58800sl lA = oVar.mo41623a().iterator();
        while (lA.hasNext()) {
            g.mo40744b().mo55373c((C37237b) lA.next());
        }
        return this.f102368b.mo40851a(new C38786i(this, bVar, a), g.mo40743a());
    }

    /* renamed from: c */
    public final synchronized C37215b mo41621c(C38790m mVar) {
        return C38779b.m68086a(this, mVar.f102373c);
    }
}
