package com.google.android.apps.gsa.staticplugins.p7686co.p7688b;

import com.google.android.apps.gsa.staticplugins.p7686co.p7694h.C98324af;
import com.google.android.apps.gsa.store.C118327r;
import com.google.android.apps.gsa.store.C118328s;
import com.google.android.apps.gsa.store.C118334w;
import com.google.android.apps.gsa.store.C118335x;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import com.google.p375ai.p378b.C7681g;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.b.az */
/* compiled from: PG */
public final /* synthetic */ class C98198az implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C98211bl f274187a;

    /* renamed from: b */
    public final /* synthetic */ int f274188b;

    public /* synthetic */ C98198az(C98211bl blVar, int i) {
        this.f274187a = blVar;
        this.f274188b = i;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C98211bl blVar = this.f274187a;
        int i = this.f274188b;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(blVar.f274217g.mo26870b());
        int i2 = i + -1 != 0 ? 102400 : 204800;
        C118335x g = blVar.f274218h.mo91761g();
        g.f328476c.mo55395g(C118328s.m196511c(C98324af.f274457a, 1));
        g.f328476c.mo55395g(C118328s.m196511c(C98324af.f274462f, 0));
        g.f328476c.mo55395g(C118328s.m196511c(C98324af.f274463g, 1));
        g.f328475b.mo55395g(C98324af.f274461e);
        g.f328474a.mo55395g(C98324af.f274464h);
        int length = C98211bl.f254945d.length;
        C118327r[] rVarArr = new C118327r[7];
        int i3 = 0;
        while (true) {
            C7681g[] gVarArr = C98211bl.f254945d;
            int length2 = gVarArr.length;
            if (i3 < 7) {
                rVarArr[i3] = C118328s.m196511c(C98324af.f274458b, (long) gVarArr[i3].f26835cv);
                i3++;
            } else {
                g.f328476c.mo55395g(C118328s.m196516h(3, rVarArr));
                C118334w a = g.mo103674a();
                C98172a aVar = new C98172a();
                aVar.mo91009e(0);
                aVar.mo91008d(false);
                return C60922j.m93045h(C60922j.m93045h(C60922j.m93045h(C60922j.m93045h(blVar.mo91029v(a, i2, aVar.mo91005a()), new C98175ac(blVar, seconds, i2), C60826bg.f164896a), new C98176ad(blVar, i2), C60826bg.f164896a), new C98177ae(blVar, seconds, i2), C60826bg.f164896a), new C98178af(blVar, seconds), C60826bg.f164896a);
            }
        }
    }
}
