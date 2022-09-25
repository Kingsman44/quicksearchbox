package com.google.android.enterprise.connectedapps.internal;

import com.google.android.enterprise.connectedapps.C142555ao;
import com.google.android.enterprise.connectedapps.p10716c.C142564a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.enterprise.connectedapps.internal.f */
/* compiled from: PG */
public final class C142581f {

    /* renamed from: a */
    public final Object f386884a = new Object();

    /* renamed from: b */
    public boolean f386885b = false;

    /* renamed from: c */
    public final Map f386886c = new HashMap();

    /* renamed from: d */
    public final Set f386887d = new HashSet();

    /* renamed from: e */
    private final int f386888e;

    /* renamed from: f */
    private final C142564a f386889f;

    public C142581f(int i, C142564a aVar) {
        this.f386888e = i;
        this.f386889f = aVar;
        mo117211a();
    }

    /* renamed from: a */
    public final void mo117211a() {
        HashMap hashMap;
        synchronized (this.f386884a) {
            if (this.f386886c.size() + this.f386887d.size() >= this.f386888e) {
                this.f386885b = true;
                hashMap = new HashMap(this.f386886c);
            } else {
                hashMap = null;
            }
        }
        if (hashMap != null) {
            this.f386889f.f386853a.mo57356n(hashMap);
        }
    }

    /* renamed from: b */
    public final void mo117212b(C142555ao aoVar) {
        synchronized (this.f386884a) {
            if (!this.f386885b) {
                if (!this.f386886c.containsKey(aoVar)) {
                    if (!this.f386887d.contains(aoVar)) {
                        this.f386887d.add(aoVar);
                        mo117211a();
                    }
                }
            }
        }
    }
}
