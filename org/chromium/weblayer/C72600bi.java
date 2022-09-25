package org.chromium.weblayer;

import com.google.android.libraries.web.p3408h.p3414b.C43788b;
import com.google.android.libraries.web.p3408h.p3414b.C43795i;
import com.google.android.libraries.web.p3408h.p3414b.C43804r;
import com.google.android.libraries.web.postmessage.internal.C43976w;
import com.google.android.libraries.web.weblayer.p3462e.p3463a.C44223b;
import com.google.android.libraries.web.weblayer.p3462e.p3463a.C44224c;
import com.google.android.libraries.web.weblayer.p3462e.p3463a.C44225d;
import com.google.android.libraries.web.weblayer.p3462e.p3463a.C44226e;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.common.p4526f.C59052c;
import java.util.HashMap;
import java.util.Map;
import org.chromium.p5643b.p5644a.C72338bg;
import org.chromium.p5643b.p5644a.C72340bi;
import org.chromium.p5643b.p5644a.C72343bl;
import org.chromium.p5643b.p5644a.C72353l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: org.chromium.weblayer.bi */
/* compiled from: PG */
public final class C72600bi extends C72338bg {

    /* renamed from: a */
    private final C72612bu f193141a;

    /* renamed from: b */
    private final Map f193142b = new HashMap();

    public C72600bi(C72612bu buVar) {
        this.f193141a = buVar;
    }

    /* renamed from: a */
    public final void mo63805a(int i, String str) {
        C72343bl.m106991a();
        C72612bu buVar = this.f193141a;
        C72613bv bvVar = (C72613bv) this.f193142b.get(Integer.valueOf(i));
        C47538ax c = ((C44225d) buVar).f115019c.f115023d.mo51613c("WebMessageCallback#onMessage");
        try {
            C43976w a = ((C44225d) buVar).f115019c.f115021b.mo46963a(((C44225d) buVar).f115017a.mo42598a());
            if (((C44225d) buVar).f115019c.f115025f) {
                C43804r rVar = (C43804r) ((C44225d) buVar).f115018b.mo46411d(C43804r.class);
                C72604bm.m107399a();
                if (C72611bt.m107413a() >= 99) {
                    C72582ar arVar = bvVar.f193175a;
                    C69664n.m101061g(arVar, "key");
                    Object obj = rVar.f114214a.get(arVar);
                    if (obj != null) {
                        C43788b b = ((C43795i) obj).mo46814b();
                        if (b != null) {
                            b.f114172a.mo46798a(((C44225d) buVar).f115017a.mo42598a()).mo46797c(str, new C44223b((C44225d) buVar, bvVar));
                        } else {
                            throw new IllegalArgumentException("The page with key " + arVar + " does not have a main document yet.");
                        }
                    } else {
                        throw new IllegalArgumentException("No page exists for " + arVar + ".");
                    }
                } else {
                    throw new UnsupportedOperationException();
                }
            }
            if (a.mo46969e()) {
                ((C59052c) ((C59052c) C44226e.f115020a.mo56226d()).mo56372aa(54189)).mo56386p("Discarded a WebMessage as channel is not available.");
                if (c != null) {
                    c.close();
                    return;
                }
                return;
            }
            if (a.mo46970f()) {
                a.mo46966b(C44224c.f115016a, ((C44225d) buVar).f115019c.mo47160b(bvVar));
            }
            a.mo46967c(str, ((C44225d) buVar).f115017a);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }

    /* renamed from: b */
    public final void mo63806b(int i) {
        C72343bl.m106991a();
        C72613bv bvVar = (C72613bv) this.f193142b.get(Integer.valueOf(i));
    }

    /* renamed from: c */
    public final void mo63807c(int i) {
        C72343bl.m106991a();
        Map map = this.f193142b;
        Integer valueOf = Integer.valueOf(i);
        C72613bv bvVar = (C72613bv) map.get(valueOf);
        this.f193142b.remove(valueOf);
    }

    /* renamed from: d */
    public final void mo63808d(int i, C72353l lVar) {
        C72343bl.m106991a();
        ((C72613bv) this.f193142b.get(Integer.valueOf(i))).f193175a = (C72582ar) lVar;
    }

    /* renamed from: e */
    public final void mo63809e(C72340bi biVar, int i) {
        C72343bl.m106991a();
        this.f193142b.put(Integer.valueOf(i), new C72613bv(biVar));
    }
}
