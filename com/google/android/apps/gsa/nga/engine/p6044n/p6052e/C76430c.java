package com.google.android.apps.gsa.nga.engine.p6044n.p6052e;

import android.content.Context;
import com.google.android.apps.gsa.nga.engine.p6044n.p6052e.p6053a.C76428z;
import com.google.android.apps.gsa.nga.engine.understanding.C79330v;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4526f.p4527a.C58970a;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.e.c */
/* compiled from: PG */
public final /* synthetic */ class C76430c implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C76431d f211574a;

    public /* synthetic */ C76430c(C76431d dVar) {
        this.f211574a = dVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C58495hd f;
        C76431d dVar = this.f211574a;
        AtomicReference atomicReference = dVar.f211579e;
        Context context = dVar.f211576b;
        C76428z zVar = dVar.f211578d;
        C76450w b = C76431d.m123049b(context);
        C58490gz gzVar = new C58490gz(4);
        Iterator it = b.f211623a.iterator();
        loop0:
        while (true) {
            if (!it.hasNext()) {
                f = gzVar.mo55427f(false);
                break;
            }
            C76452y yVar = (C76452y) it.next();
            Iterator it2 = yVar.f211626a.iterator();
            while (true) {
                if (it2.hasNext()) {
                    String str = (String) it2.next();
                    C58485gu j = C58485gu.m89842j(yVar.f211627b);
                    gzVar.mo55429h(C79330v.m127277b(str), j);
                    int size = j.size();
                    int i = 0;
                    while (true) {
                        if (i < size) {
                            int i2 = i + 1;
                            if (!zVar.mo72189b((C76438k) j.get(i))) {
                                ((C58970a) ((C58970a) C76431d.f211575a.mo56225c()).mo56372aa(3554)).mo56389s("Failed to validate condition for intent %s.", str);
                                f = C58729pv.f156485a;
                                break loop0;
                            }
                            i = i2;
                        }
                    }
                }
            }
        }
        atomicReference.set(f);
        return C118826c.f331422a;
    }
}
