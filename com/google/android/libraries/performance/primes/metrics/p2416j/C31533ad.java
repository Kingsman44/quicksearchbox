package com.google.android.libraries.performance.primes.metrics.p2416j;

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.libraries.performance.primes.metrics.j.ad */
/* compiled from: PG */
public final class C31533ad {

    /* renamed from: a */
    public static final AtomicReference f84923a = new AtomicReference();

    /* renamed from: b */
    private static final C59071e f84924b = C59071e.m91332i("com.google.android.libraries.performance.primes.metrics.j.ad");

    /* renamed from: c */
    private static int f84925c = 10;

    /* renamed from: d */
    private static int f84926d = 0;

    /* renamed from: a */
    public static void m58790a(C31543k kVar) {
        if (!kVar.equals(C31543k.f84947a)) {
            if (kVar.f84950d < 0) {
                kVar.f84950d = SystemClock.elapsedRealtime();
            }
            AtomicReference atomicReference = f84923a;
            C31553u uVar = (C31553u) atomicReference.get();
            if (uVar != null) {
                if (kVar != ((C31543k) uVar.mo37245a().poll())) {
                    ((C59052c) ((C59052c) f84924b.mo56226d()).mo56372aa(50455)).mo56386p("Incorrect Span passed. Ignore...");
                } else if (kVar.mo37237a() < ((long) f84925c)) {
                } else {
                    if (uVar.f84961b.incrementAndGet() < f84926d) {
                        C31543k kVar2 = (C31543k) uVar.mo37245a().peek();
                        if (kVar2 != null) {
                            if (kVar2.f84952f == Collections.EMPTY_LIST) {
                                kVar2.f84952f = new ArrayList();
                            }
                            if (kVar2.f84952f != null) {
                                kVar2.f84952f.add(kVar);
                                return;
                            }
                            return;
                        }
                        ((C59052c) ((C59052c) C31553u.f84960a.mo56226d()).mo56372aa(50448)).mo56389s("null Parent for Span: %s", kVar.f84948b);
                        return;
                    }
                    ((C59052c) ((C59052c) f84924b.mo56226d()).mo56372aa(50454)).mo56387q("Dropping trace as max buffer size is hit. Size: %d", uVar.f84961b.get());
                    atomicReference.set((Object) null);
                }
            }
        }
    }

    /* renamed from: b */
    public static List m58791b(C31553u uVar) {
        C19559g.m37303b();
        if (uVar.f84961b.get() == 0) {
            return null;
        }
        C31551s sVar = C31551s.f84958a;
        synchronized (uVar.f84964e) {
            Collections.sort(uVar.f84964e, sVar);
            uVar.f84962c.mo37238b(uVar.f84964e);
        }
        ArrayList arrayList = new ArrayList(uVar.f84963d.keySet());
        Collections.sort(arrayList, sVar);
        uVar.f84962c.mo37238b(arrayList);
        C31544l lVar = new C31544l(uVar.f84962c);
        ArrayList arrayList2 = new ArrayList();
        lVar.mo37241a(lVar.f84955a, 0, arrayList2);
        if (arrayList2.size() == 1) {
            return null;
        }
        return Collections.unmodifiableList(arrayList2);
    }

    /* renamed from: d */
    public static C31553u m58793d(String str) {
        C58838bb.m90883r(!TextUtils.isEmpty(str));
        C31553u uVar = (C31553u) f84923a.getAndSet((Object) null);
        if (uVar != null) {
            uVar.f84962c.f84948b = str;
        }
        return uVar;
    }

    /* renamed from: c */
    public static boolean m58792c(String str) {
        str.getClass();
        AtomicReference atomicReference = f84923a;
        if (atomicReference.get() != null) {
            return false;
        }
        C31553u uVar = new C31553u(str);
        while (!atomicReference.compareAndSet((Object) null, uVar)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        f84925c = 5;
        f84926d = 1000;
        return true;
    }
}
