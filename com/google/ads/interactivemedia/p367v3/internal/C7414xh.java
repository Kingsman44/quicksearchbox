package com.google.ads.interactivemedia.p367v3.internal;

import android.os.Handler;
import android.os.Message;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.google.ads.interactivemedia.v3.internal.xh */
/* compiled from: PG */
public final class C7414xh implements Handler.Callback {

    /* renamed from: a */
    private final C7412xf f24278a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C7248rd f24279b = new C7248rd();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Handler f24280c = aeu.m18542l(this);

    /* renamed from: d */
    private final TreeMap f24281d = new TreeMap();

    /* renamed from: e */
    private C7416xj f24282e;

    /* renamed from: f */
    private long f24283f;

    /* renamed from: g */
    private long f24284g = -9223372036854775807L;

    /* renamed from: h */
    private long f24285h = -9223372036854775807L;

    /* renamed from: i */
    private boolean f24286i;

    /* renamed from: j */
    private boolean f24287j;

    /* renamed from: k */
    private final acc f24288k;

    public C7414xh(C7416xj xjVar, C7412xf xfVar, acc acc) {
        this.f24282e = xjVar;
        this.f24278a = xfVar;
        this.f24288k = acc;
    }

    /* renamed from: i */
    private final void m22395i() {
        long j = this.f24285h;
        if (j == -9223372036854775807L || j != this.f24284g) {
            this.f24286i = true;
            this.f24285h = this.f24284g;
            ((C7394wo) this.f24278a).f24194a.mo16726y();
        }
    }

    /* renamed from: a */
    public final void mo16754a(C7416xj xjVar) {
        this.f24286i = false;
        this.f24283f = -9223372036854775807L;
        this.f24282e = xjVar;
        Iterator it = this.f24281d.entrySet().iterator();
        while (it.hasNext()) {
            if (((Long) ((Map.Entry) it.next()).getKey()).longValue() < this.f24282e.f24302h) {
                it.remove();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo16755b(long j) {
        C7416xj xjVar = this.f24282e;
        boolean z = false;
        if (!xjVar.f24298d) {
            return false;
        }
        if (this.f24286i) {
            return true;
        }
        Map.Entry ceilingEntry = this.f24281d.ceilingEntry(Long.valueOf(xjVar.f24302h));
        if (ceilingEntry != null && ((Long) ceilingEntry.getValue()).longValue() < j) {
            long longValue = ((Long) ceilingEntry.getKey()).longValue();
            this.f24283f = longValue;
            ((C7394wo) this.f24278a).f24194a.mo16727z(longValue);
            z = true;
        }
        if (z) {
            m22395i();
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo16756c(C7372vt vtVar) {
        if (!this.f24282e.f24298d) {
            return false;
        }
        if (this.f24286i) {
            return true;
        }
        long j = this.f24284g;
        if (j == -9223372036854775807L || j >= vtVar.f24094i) {
            return false;
        }
        m22395i();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo16757d(C7372vt vtVar) {
        if (this.f24284g != -9223372036854775807L || vtVar.f24095j > -9223372036854775807L) {
            this.f24284g = vtVar.f24095j;
        }
    }

    /* renamed from: e */
    public final C7413xg mo16758e() {
        return new C7413xg(this, this.f24288k);
    }

    /* renamed from: f */
    public final void mo16759f() {
        this.f24287j = true;
        this.f24280c.removeCallbacksAndMessages((Object) null);
    }

    public final boolean handleMessage(Message message) {
        if (this.f24287j) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        C7411xe xeVar = (C7411xe) message.obj;
        long j = xeVar.f24272a;
        long j2 = xeVar.f24273b;
        TreeMap treeMap = this.f24281d;
        Long valueOf = Long.valueOf(j2);
        Long l = (Long) treeMap.get(valueOf);
        if (l == null) {
            this.f24281d.put(valueOf, Long.valueOf(j));
        } else if (l.longValue() > j) {
            this.f24281d.put(valueOf, Long.valueOf(j));
        }
        return true;
    }
}
