package org.chromium.base.task;

import android.util.Pair;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import p000J.C0000N;

/* renamed from: org.chromium.base.task.l */
/* compiled from: PG */
public final class C72406l implements C72403i {

    /* renamed from: a */
    public static final ReferenceQueue f192561a = new ReferenceQueue();

    /* renamed from: h */
    private static final Set f192562h = new HashSet();

    /* renamed from: b */
    public final C72407m f192563b;

    /* renamed from: c */
    public final String f192564c;

    /* renamed from: d */
    public volatile long f192565d;

    /* renamed from: e */
    protected final Runnable f192566e = new C72404j(this);

    /* renamed from: f */
    public final Object f192567f = new Object();

    /* renamed from: g */
    public LinkedList f192568g;

    /* renamed from: i */
    private boolean f192569i;

    /* renamed from: j */
    private List f192570j;

    public C72406l(C72407m mVar) {
        this.f192563b = mVar.mo63869c();
        this.f192564c = "TaskRunnerImpl.PreNativeTask.run";
        m107058c();
    }

    /* renamed from: c */
    private static void m107058c() {
        while (true) {
            C72405k kVar = (C72405k) f192561a.poll();
            if (kVar != null) {
                C0000N.MERCiIV8(kVar.f192560a);
                Set set = f192562h;
                synchronized (set) {
                    set.remove(kVar);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final void mo63859a(Runnable runnable) {
        if (this.f192565d != 0) {
            C0000N.MGnQU$47(this.f192565d, runnable, 0, runnable.getClass().getName());
            return;
        }
        synchronized (this.f192567f) {
            if (!this.f192569i) {
                this.f192569i = true;
                synchronized (PostTask.f192542a) {
                    List list = PostTask.f192543b;
                    if (list == null) {
                        mo63866b();
                    } else {
                        list.add(this);
                        this.f192568g = new LinkedList();
                        this.f192570j = new ArrayList();
                    }
                }
            }
            if (this.f192565d != 0) {
                C0000N.MGnQU$47(this.f192565d, runnable, 0, runnable.getClass().getName());
                return;
            }
            this.f192568g.add(runnable);
            Executor executor = PostTask.f192546e;
            PostTask.f192545d.execute(this.f192566e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo63866b() {
        C72407m mVar = this.f192563b;
        int i = mVar.f192576f;
        boolean z = mVar.f192577g;
        boolean z2 = mVar.f192578h;
        byte b = mVar.f192579i;
        byte[] bArr = mVar.f192580j;
        long M5_IQXaH = C0000N.M5_IQXaH(0, i, z, z2, (byte) 0, (byte[]) null);
        synchronized (this.f192567f) {
            LinkedList linkedList = this.f192568g;
            if (linkedList != null) {
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    Runnable runnable = (Runnable) it.next();
                    C0000N.MGnQU$47(M5_IQXaH, runnable, 0, runnable.getClass().getName());
                }
                this.f192568g = null;
            }
            List<Pair> list = this.f192570j;
            if (list != null) {
                for (Pair pair : list) {
                    C0000N.MGnQU$47(M5_IQXaH, (Runnable) pair.first, ((Long) pair.second).longValue(), pair.getClass().getName());
                }
                this.f192570j = null;
            }
            this.f192565d = M5_IQXaH;
        }
        Set set = f192562h;
        synchronized (set) {
            set.add(new C72405k(this));
        }
        m107058c();
    }
}
