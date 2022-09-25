package com.google.android.apps.gsa.staticplugins.p7864du.p7866b;

import android.database.Cursor;
import com.google.android.apps.gsa.p8885y.p8886a.C118831d;
import com.google.android.apps.gsa.store.C118314e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.du.b.ab */
/* compiled from: PG */
abstract class C100123ab implements Runnable, Iterator, C118314e {

    /* renamed from: a */
    protected final C118831d f279953a;

    /* renamed from: b */
    private final int f279954b;

    /* renamed from: c */
    private final Object f279955c = new Object();

    /* renamed from: d */
    private final C100122aa f279956d;

    /* renamed from: e */
    private int f279957e;

    public C100123ab(Cursor cursor, C118831d dVar) {
        this.f279956d = new C100122aa(cursor);
        this.f279954b = cursor.getCount();
        this.f279957e = -1;
        this.f279953a = dVar;
    }

    /* renamed from: a */
    public final int mo91753a() {
        return this.f279954b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Object mo91754b(Cursor cursor);

    /* renamed from: c */
    public final C100122aa mo91755c() {
        C100122aa aaVar;
        synchronized (this.f279955c) {
            aaVar = this.f279956d;
        }
        return aaVar;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean hasNext() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f279955c
            monitor-enter(r0)
            com.google.android.apps.gsa.staticplugins.du.b.aa r1 = r5.f279956d     // Catch:{ all -> 0x0020 }
            boolean r1 = r1.mo91752c()     // Catch:{ all -> 0x0020 }
            r2 = 0
            if (r1 == 0) goto L_0x000e
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return r2
        L_0x000e:
            int r1 = r5.f279957e     // Catch:{ all -> 0x0020 }
            r3 = 1
            int r1 = r1 + r3
            int r4 = r5.f279954b     // Catch:{ all -> 0x0020 }
            if (r1 >= r4) goto L_0x0017
            r2 = 1
        L_0x0017:
            if (r2 != 0) goto L_0x001e
            com.google.android.apps.gsa.staticplugins.du.b.aa r1 = r5.f279956d     // Catch:{ all -> 0x0020 }
            r1.mo91751b()     // Catch:{ all -> 0x0020 }
        L_0x001e:
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return r2
        L_0x0020:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7864du.p7866b.C100123ab.hasNext():boolean");
    }

    public final Object next() {
        Object b;
        synchronized (this.f279955c) {
            Cursor cursor = this.f279956d.f279951a;
            cursor.moveToNext();
            this.f279957e++;
            b = mo91754b(cursor);
        }
        return b;
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove() should not be called on ContentStoreIterator");
    }

    public final void run() {
        C59071e eVar = C100125ad.f279965a;
        C58976aa aaVar = C58975e.f156826a;
        mo91755c().mo91751b();
    }
}
