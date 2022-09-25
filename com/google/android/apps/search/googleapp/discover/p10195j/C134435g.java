package com.google.android.apps.search.googleapp.discover.p10195j;

import com.google.android.apps.search.googleapp.discover.loggingsignals.C134463a;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3136e.C40347a;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3138g.C40368a;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.google.android.apps.search.googleapp.discover.j.g */
/* compiled from: PG */
public final class C134435g implements C134463a {

    /* renamed from: a */
    final /* synthetic */ C40347a f366149a;

    public C134435g(C40347a aVar) {
        this.f366149a = aVar;
    }

    /* renamed from: g */
    public final void mo111496g() {
        C40347a aVar = this.f366149a;
        ReentrantLock reentrantLock = aVar.f105961c;
        reentrantLock.lock();
        try {
            if (!aVar.f105960b) {
                aVar.f105960b = true;
                for (C40368a aVar2 : aVar.f105959a) {
                    aVar2.f106019a.mo25798a();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: h */
    public final void mo111497h() {
        C40347a aVar = this.f366149a;
        ReentrantLock reentrantLock = aVar.f105961c;
        reentrantLock.lock();
        try {
            if (aVar.f105960b) {
                aVar.f105960b = false;
                for (C40368a aVar2 : aVar.f105959a) {
                    aVar2.f106019a.mo25799b();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
