package org.chromium.weblayer;

import com.google.android.libraries.web.weblayer.p3468g.p3469a.C44298z;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.apps.tiktok.tracing.contrib.p3714j.C47730g;
import com.google.apps.tiktok.tracing.contrib.p3714j.C47731h;
import org.chromium.p5643b.p5644a.C72343bl;
import org.chromium.p5643b.p5644a.C72364w;

/* renamed from: org.chromium.weblayer.aa */
/* compiled from: PG */
final class C72565aa extends C72364w {

    /* renamed from: a */
    private final C72637z f193098a;

    public C72565aa(C72637z zVar) {
        this.f193098a = zVar;
    }

    /* renamed from: a */
    public final void mo63823a() {
        C72343bl.m106991a();
        C72637z zVar = this.f193098a;
        if (C47831fm.m85027v()) {
            C47558bi a = C47831fm.m85006a("onFindEnded");
            try {
                ((C47731h) zVar).f123699a.mo47203a();
                a.close();
                return;
            } catch (Throwable th) {
                C47730g.m84879a(th, th);
            }
        } else {
            C47538ax c = ((C47731h) zVar).f123700b.f123701a.mo51613c("onFindEnded");
            try {
                ((C47731h) zVar).f123699a.mo47203a();
                if (c != null) {
                    c.close();
                    return;
                }
                return;
            } catch (Throwable th2) {
                C47730g.m84879a(th, th2);
            }
        }
        throw th;
        throw th;
    }

    /* renamed from: b */
    public final void mo63824b(int i, int i2) {
        C72343bl.m106991a();
        C72637z zVar = this.f193098a;
        if (C47831fm.m85027v()) {
            C47558bi a = C47831fm.m85006a("onFindResult");
            try {
                ((C44298z) ((C47731h) zVar).f123699a).f115204a.mo46540a(i, i2);
                a.close();
                return;
            } catch (Throwable th) {
                C47730g.m84879a(th, th);
            }
        } else {
            C47538ax c = ((C47731h) zVar).f123700b.f123701a.mo51613c("onFindResult");
            try {
                ((C44298z) ((C47731h) zVar).f123699a).f115204a.mo46540a(i, i2);
                if (c != null) {
                    c.close();
                    return;
                }
                return;
            } catch (Throwable th2) {
                C47730g.m84879a(th, th2);
            }
        }
        throw th;
        throw th;
    }
}
