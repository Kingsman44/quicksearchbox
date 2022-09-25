package com.google.android.libraries.p1635au;

import com.google.common.base.C58838bb;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.au.k */
/* compiled from: PG */
public abstract class C19574k {

    /* renamed from: a */
    public final Object f54485a;

    /* renamed from: b */
    public final String f54486b;

    /* renamed from: c */
    public final C19571h[] f54487c;

    /* renamed from: d */
    public boolean f54488d = true;

    /* renamed from: e */
    HashMap f54489e;

    /* renamed from: f */
    public int f54490f;

    /* renamed from: g */
    private final C69464a f54491g;

    public C19574k(String str, C69464a aVar, C19571h... hVarArr) {
        int i = 1;
        int length = hVarArr.length;
        i = length > 0 ? 10 : i;
        this.f54486b = str;
        this.f54487c = hVarArr;
        HashMap hashMap = new HashMap(i);
        this.f54489e = hashMap;
        if (length == 0) {
            hashMap.put(C19564a.f54470b, mo24825f());
        }
        this.f54490f = 0;
        this.f54491g = aVar;
        this.f54485a = new Object();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo24830c(Object obj, C19564a aVar) {
        synchronized (this.f54485a) {
            C19565b bVar = (C19565b) this.f54489e.get(aVar);
            if (bVar == null) {
                bVar = mo24825f();
                this.f54489e.put(aVar, bVar);
            }
            bVar.mo24821b(obj);
            this.f54490f++;
        }
        C19575l lVar = ((C19576m) this.f54491g).f54496c;
        if (lVar != null) {
            C19579p pVar = (C19579p) lVar;
            if (pVar.f54501b > 0 && pVar.f54503d.incrementAndGet() >= pVar.f54501b) {
                synchronized (pVar.f54505f) {
                    if (((C19579p) lVar).f54503d.get() >= ((C19579p) lVar).f54501b) {
                        synchronized (((C19579p) lVar).f54505f) {
                            ScheduledFuture scheduledFuture = ((C19579p) lVar).f54504e;
                            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                                if (!((C19579p) lVar).f54504e.isCancelled()) {
                                    if (((C19579p) lVar).f54504e.getDelay(TimeUnit.MILLISECONDS) > 100) {
                                        ((C19579p) lVar).mo24836a();
                                        ((C19579p) lVar).f54504e = ((C19579p) lVar).f54500a.schedule(new C19578o((C19579p) lVar), 1, TimeUnit.MILLISECONDS);
                                    }
                                }
                            }
                            ((C19579p) lVar).f54504e = ((C19579p) lVar).f54500a.schedule(new C19578o((C19579p) lVar), 1, TimeUnit.MILLISECONDS);
                        }
                        return;
                    }
                }
            }
            synchronized (pVar.f54505f) {
                ScheduledFuture scheduledFuture2 = ((C19579p) lVar).f54504e;
                if (scheduledFuture2 == null || scheduledFuture2.isDone() || ((C19579p) lVar).f54504e.isCancelled()) {
                    ((C19579p) lVar).f54504e = ((C19579p) lVar).f54500a.schedule(new C19578o((C19579p) lVar), ((C19579p) lVar).f54502c, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo24831d(Object... objArr) {
        int i = 0;
        C58838bb.m90868c(this.f54487c.length == objArr.length);
        if (this.f54488d) {
            while (i < objArr.length) {
                Object obj = objArr[i];
                if (obj == null) {
                    String str = this.f54486b;
                    String arrays = Arrays.toString(objArr);
                    throw new NullPointerException("Streamz " + str + " has null parameter: " + arrays);
                } else if (this.f54487c[i].f54480b.isInstance(obj)) {
                    i++;
                } else {
                    String str2 = this.f54486b;
                    String obj2 = obj.toString();
                    String valueOf = String.valueOf(obj.getClass());
                    C19571h hVar = this.f54487c[i];
                    String str3 = hVar.f54479a;
                    String obj3 = hVar.f54480b.toString();
                    throw new IllegalArgumentException("Streamz " + str2 + " has parameter {index: " + i + ", value: " + obj2 + ", type: " + valueOf + "}, but expected: {name: " + str3 + ", type: " + obj3 + "}");
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo24832e(C19571h... hVarArr) {
        if (!Arrays.equals(this.f54487c, hVarArr)) {
            String str = this.f54486b;
            String arrays = Arrays.toString(this.f54487c);
            String arrays2 = Arrays.toString(hVarArr);
            throw new C19577n("Streamz " + str + " with field diffs: " + arrays + " and " + arrays2);
        }
    }

    /* renamed from: f */
    public abstract C19565b mo24825f();
}
