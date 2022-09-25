package org.chromium.weblayer;

import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.apps.tiktok.tracing.contrib.p3714j.C47724a;
import com.google.apps.tiktok.tracing.contrib.p3714j.C47725b;
import org.chromium.p5643b.p5644a.C72343bl;
import org.chromium.p5643b.p5644a.C72350i;
import org.chromium.p5643b.p5644a.C72359r;

/* renamed from: org.chromium.weblayer.bd */
/* compiled from: PG */
public final class C72595bd extends C72359r {

    /* renamed from: a */
    private final C72633v f193136a;

    public C72595bd(C72633v vVar) {
        this.f193136a = vVar;
    }

    /* renamed from: a */
    public final String mo63820a(C72350i iVar) {
        C72632u uVar;
        C72343bl.m106991a();
        C72633v vVar = this.f193136a;
        C72575ak akVar = (C72575ak) iVar;
        if (C47831fm.m85027v()) {
            uVar = ((C47725b) vVar).f123693a.mo47196a(akVar);
        } else {
            C47538ax c = ((C47725b) vVar).f123694b.f123695a.mo51613c("getErrorPage");
            try {
                uVar = ((C47725b) vVar).f123693a.mo47196a(akVar);
                if (c != null) {
                    c.close();
                }
            } catch (Throwable th) {
                C47724a.m84876a(th, th);
            }
        }
        if (uVar == null) {
            return null;
        }
        return uVar.f193206a;
        throw th;
    }

    /* renamed from: b */
    public final boolean mo63821b() {
        C72343bl.m106991a();
        C72633v vVar = this.f193136a;
        if (C47831fm.m85027v()) {
            return ((C47725b) vVar).f123693a.mo47197b();
        }
        C47538ax c = ((C47725b) vVar).f123694b.f123695a.mo51613c("onBackToSafety");
        try {
            boolean b = ((C47725b) vVar).f123693a.mo47197b();
            if (c == null) {
                return b;
            }
            c.close();
            return b;
        } catch (Throwable th) {
            C47724a.m84876a(th, th);
        }
        throw th;
    }
}
