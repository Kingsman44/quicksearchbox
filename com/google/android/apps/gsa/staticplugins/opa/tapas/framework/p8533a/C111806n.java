package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8533a;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111248k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111255r;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113344co;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58425eo;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58781rt;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Queue;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.a.n */
/* compiled from: PG */
public final class C111806n implements C90991b {

    /* renamed from: a */
    public final C68214a f310735a;

    /* renamed from: b */
    public final C21370a f310736b;

    /* renamed from: c */
    public final C86124t f310737c;

    /* renamed from: d */
    public final C22871g f310738d;

    /* renamed from: e */
    public final Queue f310739e;

    public C111806n(C68214a aVar, C21370a aVar2, C86124t tVar, C22871g gVar) {
        this.f310735a = aVar;
        this.f310736b = aVar2;
        this.f310737c = tVar;
        this.f310738d = gVar;
        this.f310739e = new C58781rt(new C58425eo((int) tVar.mo79743a(C90063do.f249532fM)));
    }

    /* renamed from: c */
    private final Optional m185655c(C113415ez ezVar) {
        return ezVar.mo100195H().flatMap(C111802j.f310727a).flatMap(new C111803k(this));
    }

    /* renamed from: a */
    public final void mo99250a(long j, String str, String str2, long j2) {
        if (this.f310737c.mo79746e(C90063do.f249319bL) && ((C111248k) this.f310735a.mo27525b()).mo99077b()) {
            String format = String.format(Locale.US, "Prefix: \"%s\"\n", new Object[]{str});
            String format2 = String.format(Locale.US, "Request ID: %d\n", new Object[]{Long.valueOf(j)});
            ((C111248k) this.f310735a.mo27525b()).mo99076a(C111255r.GENERAL, format + String.format(Locale.US, "%s: %d ms\n", new Object[]{str2, Long.valueOf(j2)}) + format2);
        }
    }

    /* renamed from: b */
    public final void mo99251b(List list) {
        if (this.f310737c.mo79746e(C90063do.f249319bL) && ((C111248k) this.f310735a.mo27525b()).mo99077b() && !list.isEmpty()) {
            StringBuilder sb = new StringBuilder("== RENDERED SUGGESTIONS ==\n");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                for (C113415ez ezVar : ((C113344co) it.next()).f313868b) {
                    sb.append(String.format(Locale.US, "\"%s\" / %s (%f)", new Object[]{ezVar.mo100199L(), ezVar.mo100211k().name(), Double.valueOf(ezVar.mo100201a())}));
                    Optional c = m185655c(ezVar);
                    if (c.isPresent()) {
                        sb.append(" / ");
                        sb.append((String) c.get());
                    }
                    sb.append("\n");
                }
            }
            ((C111248k) this.f310735a.mo27525b()).mo99076a(C111255r.GENERAL, sb.toString());
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("Source Latency History");
        fVar.mo85292s(C90752i.m148229c("From most recent."));
        this.f310739e.size();
        ArrayList arrayList = new ArrayList(this.f310739e);
        Collections.reverse(arrayList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C111809q qVar = (C111809q) arrayList.get(i);
            fVar.mo85292s(C90752i.m148229c(qVar.mo99252h()));
            if (this.f310737c.mo79746e(C90063do.f249441db)) {
                C91006f e = fVar.mo85281e((Object) null);
                C58485gu b = qVar.mo99240b();
                int size2 = b.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    C113415ez ezVar = (C113415ez) b.get(i2);
                    e.mo85292s(C90752i.m148233g(ezVar.mo100200S()));
                    e.mo85292s(C90752i.m148229c(String.format(Locale.US, "NLU Intent=%s", new Object[]{m185655c(ezVar).orElse("N/A")})));
                }
            }
        }
    }
}
