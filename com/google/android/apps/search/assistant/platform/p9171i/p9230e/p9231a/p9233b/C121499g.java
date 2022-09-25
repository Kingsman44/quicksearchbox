package com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b;

import android.os.Build;
import com.google.common.p4522b.C58485gu;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.concurrent.atomic.DesugarAtomicReference;

/* renamed from: com.google.android.apps.search.assistant.platform.i.e.a.b.g */
/* compiled from: PG */
public final class C121499g {

    /* renamed from: a */
    public static final List f337177a = new CopyOnWriteArrayList();

    /* renamed from: b */
    public static final AtomicReference f337178b = new AtomicReference(C121495c.OFF);

    /* renamed from: c */
    private static final String f337179c;

    static {
        String str = Build.MODEL;
        if (!str.startsWith("Pixel") && !str.equals("robolectric")) {
            str = "other";
        }
        f337179c = str;
    }

    /* renamed from: a */
    public static C121502j m200775a(C121501i iVar, List list) {
        if (iVar != null) {
            String str = f337179c;
            if (str != null) {
                C58485gu j = C58485gu.m89842j(list);
                if (j != null) {
                    return new C121494b(iVar, str, j);
                }
                throw new IllegalStateException("Missing required properties:".concat(" context"));
            }
            throw new NullPointerException("Null deviceModel");
        }
        throw new NullPointerException("Null label");
    }

    /* renamed from: b */
    public static void m200776b(C121496d dVar) {
        List list = f337177a;
        synchronized (list) {
            dVar.getClass();
            list.add(dVar);
            DesugarAtomicReference.accumulateAndGet(f337178b, dVar.mo105181a(), C121498f.f337176a);
        }
    }

    /* renamed from: c */
    public static void m200777c(C121501i iVar, Instant instant, Duration duration, String str) {
        C121502j a = m200775a(iVar, C58485gu.m89845m());
        for (C121496d dVar : f337177a) {
            if (dVar.mo105186g(C121500h.ASYNC_SPAN, iVar)) {
                dVar.mo105182c(a, instant, duration, str);
            }
        }
    }

    /* renamed from: d */
    public static void m200778d(C121496d dVar) {
        List list = f337177a;
        synchronized (list) {
            list.remove(dVar);
            f337178b.set((C121495c) Collection.EL.stream(list).map(C121497e.f337175a).max(Comparator.CC.naturalOrder()).orElse(C121495c.OFF));
        }
    }

    /* renamed from: e */
    public static boolean m200779e(C121500h hVar, C121501i iVar) {
        for (C121496d g : f337177a) {
            if (g.mo105186g(hVar, iVar)) {
                return true;
            }
        }
        return false;
    }
}
