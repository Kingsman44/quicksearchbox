package com.google.android.libraries.elements.p1714d;

import android.os.Looper;
import android.util.Pair;
import com.facebook.litho.C6278fu;
import com.facebook.litho.C6407q;
import com.facebook.litho.C6411u;
import p5488io.p5490b.p5497e.p5513j.C70085f;
import p5488io.p5490b.p5515g.C70096b;

/* renamed from: com.google.android.libraries.elements.d.cs */
/* compiled from: PG */
final class C20868cs extends C70096b {

    /* renamed from: a */
    public final C20798ak f58523a;

    /* renamed from: b */
    public final Object f58524b = new Object();

    /* renamed from: c */
    public volatile C6407q f58525c;

    /* renamed from: d */
    public volatile boolean f58526d;

    public C20868cs(C20798ak akVar) {
        this.f58523a = akVar;
    }

    /* renamed from: a */
    public final void mo25986a() {
    }

    /* renamed from: b */
    public final void mo25987b(Throwable th) {
        throw C70085f.m101984a(th);
    }

    /* renamed from: lL */
    public final /* bridge */ /* synthetic */ void mo25988lL(Object obj) {
        Pair pair = (Pair) obj;
        if (!mo25859e()) {
            synchronized (this.f58524b) {
                this.f58525c = (C6407q) pair.first;
                if (this.f58526d && !mo25859e()) {
                    C6411u uVar = (C6411u) pair.second;
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        int i = C21128r.f59241F;
                        if (uVar.f19012e != null) {
                            uVar.mo13350h(new C6278fu(0, new Object[0]), "updateState:ComponentType.triggerStateUpdate");
                        }
                    } else {
                        int i2 = C21128r.f59241F;
                        if (uVar.f19012e != null) {
                            uVar.mo13349g(new C6278fu(0, new Object[0]), "updateState:ComponentType.triggerStateUpdate");
                        }
                    }
                }
            }
        }
    }
}
