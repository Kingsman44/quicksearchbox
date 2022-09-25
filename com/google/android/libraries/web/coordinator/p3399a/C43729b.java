package com.google.android.libraries.web.coordinator.p3399a;

import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.web.shared.lifecycle.internal.HiltWebModelHolderViewModel;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71423ax;
import kotlinx.coroutines.C71683ds;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.coordinator.a.b */
/* compiled from: PG */
public final class C43729b {
    /* renamed from: a */
    public static final C71422aw m77224a(C69585o oVar, AtomicReference atomicReference, AtomicReference atomicReference2) {
        C69664n.m101061g(oVar, "mainImmediateContext");
        C69664n.m101061g(atomicReference, "coordinatorMarker");
        C69664n.m101061g(atomicReference2, "viewModelReference");
        if (C19559g.m37305d(Thread.currentThread())) {
            Object obj = atomicReference.get();
            C69664n.m101060f(obj, "coordinatorMarker.get()");
            if (((Boolean) obj).booleanValue()) {
                C71422aw b = C71423ax.m104197b(oVar.plus(new C71683ds()));
                HiltWebModelHolderViewModel hiltWebModelHolderViewModel = (HiltWebModelHolderViewModel) atomicReference2.get();
                C43728a aVar = new C43728a(b);
                if (hiltWebModelHolderViewModel.f114818f) {
                    aVar.mo5672a();
                } else {
                    hiltWebModelHolderViewModel.f114815c.add(aVar);
                }
                return b;
            }
            throw new IllegalStateException("Cannot access WebCoordinatorRetained coroutine scope outside of the WebCoordinatorFragment.");
        }
        throw new IllegalStateException("The WebCoordinatorRetained coroutine scope cannot be initialized/provided on any thread other than the main thread, because initializing it on a different thread isn't safe.");
    }
}
