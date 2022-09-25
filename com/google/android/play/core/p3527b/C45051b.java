package com.google.android.play.core.p3527b;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.play.core.p3529c.C45053a;
import com.google.android.play.core.p3542h.C45192a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.android.play.core.b.b */
/* compiled from: PG */
public abstract class C45051b {

    /* renamed from: a */
    public final C45053a f117689a;

    /* renamed from: b */
    protected final Set f117690b = new HashSet();

    /* renamed from: c */
    private final IntentFilter f117691c;

    /* renamed from: d */
    private final Context f117692d;

    /* renamed from: e */
    private C45049a f117693e = null;

    /* renamed from: f */
    private volatile boolean f117694f = false;

    protected C45051b(C45053a aVar, IntentFilter intentFilter, Context context) {
        this.f117689a = aVar;
        this.f117691c = intentFilter;
        this.f117692d = C45192a.m80471a(context);
    }

    /* renamed from: f */
    private final void m80201f() {
        C45049a aVar;
        if ((this.f117694f || !this.f117690b.isEmpty()) && this.f117693e == null) {
            this.f117693e = new C45049a(this);
            if (Build.VERSION.SDK_INT >= 33) {
                this.f117692d.registerReceiver(this.f117693e, this.f117691c, 2);
            }
            this.f117692d.registerReceiver(this.f117693e, this.f117691c);
        }
        if (!this.f117694f && this.f117690b.isEmpty() && (aVar = this.f117693e) != null) {
            this.f117692d.unregisterReceiver(aVar);
            this.f117693e = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo48865a(Context context, Intent intent);

    /* renamed from: b */
    public final synchronized void mo48879b(C45052c cVar) {
        this.f117689a.mo48886d("registerListener", new Object[0]);
        if (cVar != null) {
            this.f117690b.add(cVar);
            m80201f();
        } else {
            throw new NullPointerException("Registered Play Core listener should not be null.");
        }
    }

    /* renamed from: c */
    public final synchronized void mo48880c(C45052c cVar) {
        this.f117689a.mo48886d("unregisterListener", new Object[0]);
        this.f117690b.remove(cVar);
        m80201f();
    }

    /* renamed from: d */
    public final synchronized void mo48881d(Object obj) {
        Iterator it = new HashSet(this.f117690b).iterator();
        while (it.hasNext()) {
            ((C45052c) it.next()).mo33446a(obj);
        }
    }

    /* renamed from: e */
    public final synchronized void mo48882e() {
        this.f117694f = true;
        m80201f();
    }
}
