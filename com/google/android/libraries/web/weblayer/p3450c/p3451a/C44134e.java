package com.google.android.libraries.web.weblayer.p3450c.p3451a;

import com.google.android.libraries.web.p3353c.C43364i;
import com.google.android.libraries.web.p3353c.C43366k;
import com.google.android.libraries.web.p3353c.C43367l;
import com.google.android.libraries.web.p3353c.p3355b.C43331ag;
import com.google.android.libraries.web.p3428m.C43945v;
import com.google.android.libraries.web.p3428m.p3429a.C43914c;
import java.util.Iterator;
import java.util.List;
import org.chromium.weblayer.C72578an;
import org.chromium.weblayer.C72601bj;
import org.chromium.weblayer.C72603bl;
import org.chromium.weblayer.C72604bm;
import org.chromium.weblayer.C72615d;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.weblayer.c.a.e */
/* compiled from: PG */
final class C44134e extends C72603bl {

    /* renamed from: a */
    final /* synthetic */ C44142m f114853a;

    public C44134e(C44142m mVar) {
        this.f114853a = mVar;
    }

    /* renamed from: a */
    public final void mo47091a(C72601bj bjVar) {
        Object obj;
        C44142m mVar = this.f114853a;
        List<String> list = mVar.f114874l;
        if (list != null) {
            C72615d dVar = mVar.f114872j;
            C69664n.m101058d(dVar);
            C72601bj bjVar2 = null;
            for (String str : list) {
                C72604bm.m107399a();
                Iterator it = C72601bj.m107380b(dVar).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (C69664n.m101066l(((C72601bj) obj).mo64472a(), str)) {
                        break;
                    }
                }
                C72601bj bjVar3 = (C72601bj) obj;
                if (bjVar3 != null) {
                    mVar.mo47101f(bjVar3);
                    bjVar2 = bjVar3;
                }
            }
            if (bjVar2 != null) {
                dVar.mo64486e(bjVar2);
                C72578an d = bjVar2.mo64474d();
                C69664n.m101060f(d, "topRestoredTab.navigationController");
                int a = d.mo64447a();
                C43945v b = ((C43914c) mVar.mo47097b()).mo46411d(C43331ag.class);
                C69664n.m101060f(b, "getPlugin(T::class.java)");
                C43364i iVar = (C43364i) C43367l.f113293h.createBuilder();
                C43366k kVar = C43366k.RESTORATION;
                iVar.copyOnWrite();
                C43367l lVar = (C43367l) iVar.instance;
                lVar.f113299e = kVar.f113292i;
                lVar.f113295a |= 8;
                String uri = d.mo64449c(a).toString();
                iVar.copyOnWrite();
                C43367l lVar2 = (C43367l) iVar.instance;
                uri.getClass();
                lVar2.f113295a |= 2;
                lVar2.f113297c = uri;
                ((C43331ag) b).mo46449k((C43367l) iVar.build());
            } else if (dVar.mo64482a() != null) {
                C72601bj a2 = dVar.mo64482a();
                C69664n.m101058d(a2);
                mVar.mo47101f(a2);
            }
            mVar.f114874l = null;
            mVar.f114873k.mo5672a();
        }
    }

    /* renamed from: b */
    public final void mo47092b(C72601bj bjVar) {
        C44142m mVar = this.f114853a;
        if (mVar.f114867e && !mVar.f114870h.mo46945l()) {
            this.f114853a.mo47101f(bjVar);
        }
    }

    /* renamed from: c */
    public final void mo47093c(C72601bj bjVar) {
        C69664n.m101061g(bjVar, "tab");
        C69664n.m101058d(this.f114853a.f114872j);
        this.f114853a.mo47099d(bjVar);
    }

    /* renamed from: d */
    public final void mo47094d() {
        this.f114853a.f114868f.f113006a.ifPresent(C44133d.f114852a);
        this.f114853a.mo47098c();
    }
}
