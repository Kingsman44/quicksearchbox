package com.google.apps.tiktok.lifecycle;

import android.os.Looper;
import androidx.lifecycle.C2358bf;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2383n;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2391v;
import androidx.p060c.C0977g;
import androidx.p060c.C0979i;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58751qq;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
public final class LifecycleMemoizingObserver extends C2358bf implements C2376g {

    /* renamed from: a */
    public C2384o f123148a;

    /* renamed from: b */
    private final Set f123149b = new C0979i(0);

    /* renamed from: c */
    private final Map f123150c = new C0977g();

    /* renamed from: d */
    private boolean f123151d = false;

    /* renamed from: h */
    private final void m84258h() {
        C58838bb.m90883r(Looper.getMainLooper().getThread() == Thread.currentThread());
        this.f123151d = true;
        Set keySet = this.f123150c.keySet();
        Set set = this.f123149b;
        C58838bb.m90866a(keySet, "set1");
        C58751qq qqVar = new C58751qq(keySet, set);
        C58838bb.m90887v(qqVar.isEmpty(), "This lifecycle didn't call `memoize()` for the following IDs: %s Each memoized value must be retrieved exactly once each lifecycle, before the Lifecycle reaches STARTED. Is the calling code conditionally memoizing a value?", qqVar);
    }

    /* renamed from: d */
    public final void mo639d() {
        for (C47417c cVar : this.f123150c.values()) {
            cVar.f123168b.mo50868a(cVar.f123167a);
        }
    }

    /* renamed from: g */
    public final Object mo51257g(int i, C47416b bVar, C47414a aVar) {
        boolean z = true;
        C58838bb.m90883r(Looper.getMainLooper().getThread() == Thread.currentThread());
        C2383n a = this.f123148a.mo5789a();
        C58838bb.m90887v(a == C2383n.INITIALIZED, "Values may only be memoized during the INITIALIZED part of the LifecycleOwner's lifecycle. Each lifecycle must call memoize() for each and only each value that the first LifecycleOwner instance called memoize() for, exactly once. The current lifecycle state is %s", a);
        if (this.f123151d) {
            Set set = this.f123149b;
            Integer valueOf = Integer.valueOf(i);
            C58838bb.m90885t(set.add(valueOf), "A value was previously memoized for idRes %s. Each lifecycle must call memoize() for each value that the first lifecycle instance called memoize() for, exactly once.", i);
            C58838bb.m90885t(this.f123150c.containsKey(valueOf), "The first lifecycle didn't memoize a value for idRes %s. Is the LifecycleOwner memoizing a value inside a conditional?", i);
            return ((C47417c) this.f123150c.get(valueOf)).f123167a;
        }
        Object a2 = bVar.mo50867a();
        Map map = this.f123150c;
        Integer valueOf2 = Integer.valueOf(i);
        if (map.put(valueOf2, new C47417c(a2, aVar)) != null) {
            z = false;
        }
        C58838bb.m90885t(z, "Input id %s was previously used. Each ID must be used exactly once each lifecycle.", i);
        C58838bb.m90885t(this.f123149b.add(valueOf2), "A value was previously memoized for idRes %s. Each lifecycle must call memoize() for each value that the first lifecycle instance called memoize() for, exactly once.", i);
        return a2;
    }

    /* renamed from: gV */
    public final /* synthetic */ void mo3520gV(C2391v vVar) {
    }

    /* renamed from: gW */
    public final void mo3521gW(C2391v vVar) {
        m84258h();
        this.f123149b.clear();
        this.f123148a.mo5791c(this);
        this.f123148a = null;
    }

    /* renamed from: gX */
    public final /* synthetic */ void mo3522gX(C2391v vVar) {
    }

    /* renamed from: gY */
    public final /* synthetic */ void mo3523gY(C2391v vVar) {
    }

    /* renamed from: gZ */
    public final void mo3524gZ(C2391v vVar) {
        m84258h();
    }

    /* renamed from: ha */
    public final /* synthetic */ void mo3525ha(C2391v vVar) {
    }
}
