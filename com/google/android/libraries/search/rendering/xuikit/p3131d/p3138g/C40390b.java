package com.google.android.libraries.search.rendering.xuikit.p3131d.p3138g;

import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.android.libraries.elements.p1708c.p1709a.C20702ac;
import com.google.android.libraries.search.rendering.xuikit.p3097a.p3098a.p3102b.p3103a.p3105b.C39940b;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3133b.C40312c;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3133b.C40335z;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3136e.C40347a;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3143l.C40469f;
import com.google.common.base.C58833ax;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4912b.p4913a.p4915b.C64159d;
import dagger.C68214a;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import p5460g.p5461a.C69464a;
import p5488io.p5490b.C70128t;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.d.g.b */
/* compiled from: PG */
public final class C40390b {
    /* renamed from: a */
    public static C21312s m70070a(C39940b bVar, Executor executor, C40469f fVar, C40335z zVar) {
        return C40312c.m69966c("GetClickTrackingIdentifier", C64159d.f173467d, bVar, executor).mo42394a(fVar, zVar);
    }

    /* renamed from: b */
    public static C20702ac m70071b(C68214a aVar, C70128t tVar, C40347a aVar2) {
        C20702ac acVar = new C20702ac(aVar, tVar, tVar);
        if (aVar2 != null) {
            C40368a aVar3 = new C40368a(acVar);
            ReentrantLock reentrantLock = aVar2.f105961c;
            reentrantLock.lock();
            try {
                aVar2.f105959a.add(aVar3);
                if (aVar2.f105960b) {
                    aVar3.f106019a.mo25798a();
                } else {
                    aVar3.f106019a.mo25799b();
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        return acVar;
    }

    /* renamed from: c */
    public static C40347a m70072c(C58833ax axVar) {
        if (axVar.mo56113h()) {
            return (C40347a) ((C69464a) axVar.mo56107c()).mo17428b();
        }
        return null;
    }
}
