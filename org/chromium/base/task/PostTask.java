package org.chromium.base.task;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: PG */
public class PostTask {

    /* renamed from: a */
    public static final Object f192542a = new Object();

    /* renamed from: b */
    public static List f192543b = new ArrayList();

    /* renamed from: c */
    public static volatile boolean f192544c;

    /* renamed from: d */
    public static final Executor f192545d = new C72400f();

    /* renamed from: e */
    public static volatile Executor f192546e;

    /* renamed from: f */
    public static AtomicReferenceArray f192547f;

    static {
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(5);
        atomicReferenceArray.set(0, new C72402h());
        f192547f = atomicReferenceArray;
    }

    private static void onNativeSchedulerReady() {
        List<C72406l> list;
        f192544c = true;
        synchronized (f192542a) {
            list = f192543b;
            f192543b = null;
        }
        for (C72406l b : list) {
            b.mo63866b();
        }
    }

    private static void onNativeSchedulerShutdownForTesting() {
        synchronized (f192542a) {
            f192543b = new ArrayList();
        }
        f192544c = false;
        f192547f.set(0, new C72402h());
        for (int i = 1; i < f192547f.length(); i++) {
            f192547f.set(i, (Object) null);
        }
    }
}
