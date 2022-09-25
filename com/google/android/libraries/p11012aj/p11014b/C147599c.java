package com.google.android.libraries.p11012aj.p11014b;

import android.os.Looper;
import com.google.android.libraries.p11012aj.C147607f;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60848cb;
import com.google.common.util.concurrent.C60853cg;
import com.google.common.util.concurrent.C60854ch;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60917ed;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.aj.b.c */
/* compiled from: PG */
public final class C147599c implements C147607f {

    /* renamed from: a */
    private static final C59071e f398405a = C59071e.m91332i("com.google.android.libraries.aj.b.c");

    /* renamed from: b */
    private final C69464a f398406b;

    /* renamed from: c */
    private final C21370a f398407c;

    public C147599c(C69464a aVar, C21370a aVar2) {
        this.f398406b = aVar;
        this.f398407c = aVar2;
    }

    /* renamed from: a */
    public final void mo41448a() {
        Thread.setDefaultUncaughtExceptionHandler(new C147598b(this, Thread.getDefaultUncaughtExceptionHandler()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo124373b(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread thread, Throwable th) {
        ArrayList<Throwable> arrayList;
        long c = this.f398407c.mo26871c();
        try {
            arrayList = new ArrayList<>();
            ((C59052c) ((C59052c) ((C59052c) f398405a.mo56225c()).mo56382g(th)).mo56372aa(50516)).mo56386p("Encountered uncaught exception.");
        } catch (Throwable th2) {
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
            throw th2;
        }
        if (thread == Looper.getMainLooper().getThread()) {
            Set<C147597a> set = (Set) this.f398406b.mo17428b();
            ArrayList arrayList2 = new ArrayList(set.size());
            for (C147597a a : set) {
                try {
                    arrayList2.add(a.mo51390a());
                } catch (Throwable th3) {
                    arrayList.add(th3);
                }
            }
            C60870cx[] cxVarArr = (C60870cx[]) arrayList2.toArray(new C60870cx[0]);
            C60854ch chVar = new C60854ch(cxVarArr);
            C58480gp f = C58485gu.m89838f(cxVarArr.length);
            for (int i = 0; i < cxVarArr.length; i++) {
                f.mo55395g(new C60853cg(chVar));
            }
            C58485gu f2 = f.mo55394f();
            for (int i2 = 0; i2 < cxVarArr.length; i2++) {
                cxVarArr[i2].mo4106b(new C60848cb(chVar, f2, i2), C60826bg.f164896a);
            }
            C58801sm G = f2.listIterator(0);
            while (G.hasNext()) {
                try {
                    C60917ed.m93035b((C60870cx) G.next(), 4000 - (this.f398407c.mo26871c() - c), TimeUnit.MILLISECONDS);
                } catch (TimeoutException e) {
                    arrayList.add(e);
                } catch (Throwable th4) {
                    arrayList.add(th4);
                }
            }
        }
        for (Throwable printStackTrace : arrayList) {
            printStackTrace.printStackTrace();
        }
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
