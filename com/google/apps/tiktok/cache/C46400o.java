package com.google.apps.tiktok.cache;

import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.protobuf.MessageLite;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.google.apps.tiktok.cache.o */
/* compiled from: PG */
final class C46400o {

    /* renamed from: a */
    public final C21370a f121449a;

    /* renamed from: b */
    public final LinkedHashMap f121450b = new LinkedHashMap(10, 0.75f, true);

    /* renamed from: c */
    public long f121451c = 0;

    /* renamed from: d */
    private final long f121452d;

    /* renamed from: e */
    private final long f121453e;

    /* renamed from: f */
    private final Deque f121454f = new ArrayDeque();

    public C46400o(long j, long j2, C21370a aVar) {
        boolean z = true;
        if (j <= 0) {
            if (j == -1) {
                j = -1;
            } else {
                z = false;
            }
        }
        C58838bb.m90868c(z);
        this.f121453e = j;
        this.f121452d = j2;
        this.f121449a = aVar;
    }

    /* renamed from: a */
    public final C46399n mo50373a(MessageLite messageLite, MessageLite messageLite2, long j) {
        C46399n nVar = new C46399n(messageLite, messageLite2, j);
        int i = nVar.f121445a;
        long j2 = this.f121452d;
        C58838bb.m90860A(((long) i) <= j2, i, j2);
        return nVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C58833ax mo50374b(MessageLite messageLite) {
        C58833ax j = C58833ax.m90833j((C46399n) this.f121450b.get(messageLite));
        if (j.mo56113h()) {
            C46399n nVar = (C46399n) j.mo56107c();
            this.f121451c -= (long) nVar.f121445a;
            C58838bb.m90866a((C46399n) this.f121450b.remove(nVar.f121447c), "Evicted non-existent entry.");
            C58838bb.m90883r(this.f121451c >= 0);
        }
        return j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C58833ax mo50375c(MessageLite messageLite) {
        long b = this.f121449a.mo26870b();
        C58838bb.m90866a(messageLite, "Cannot get a null key");
        if (this.f121453e != -1) {
            for (Map.Entry value : this.f121450b.entrySet()) {
                C46399n nVar = (C46399n) value.getValue();
                if (nVar.f121446b >= b - this.f121453e) {
                    break;
                }
                this.f121454f.push(nVar.f121447c);
            }
            while (true) {
                MessageLite messageLite2 = (MessageLite) this.f121454f.pollFirst();
                if (messageLite2 == null) {
                    break;
                }
                this.f121450b.remove(messageLite2);
            }
        }
        C46399n nVar2 = (C46399n) this.f121450b.get(messageLite);
        if (nVar2 == null) {
            return C58836b.f156633a;
        }
        return C58833ax.m90834k(nVar2.mo50372a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo50376d(MessageLite messageLite, MessageLite messageLite2) {
        mo50377e(mo50373a(messageLite, messageLite2, this.f121449a.mo26870b()));
    }

    /* renamed from: e */
    public final void mo50377e(C46399n nVar) {
        int i = nVar.f121445a;
        long j = this.f121452d;
        C58838bb.m90860A(((long) i) <= j, i, j);
        Iterator it = this.f121450b.entrySet().iterator();
        while (this.f121452d - this.f121451c < ((long) nVar.f121445a) && it.hasNext()) {
            C46399n nVar2 = (C46399n) ((Map.Entry) it.next()).getValue();
            this.f121454f.push(nVar2.f121447c);
            long j2 = this.f121451c - ((long) nVar2.f121445a);
            this.f121451c = j2;
            C58838bb.m90883r(j2 >= 0);
        }
        while (true) {
            MessageLite messageLite = (MessageLite) this.f121454f.pollFirst();
            if (messageLite != null) {
                this.f121450b.remove(messageLite);
            } else {
                mo50374b(nVar.f121447c);
                this.f121450b.put(nVar.f121447c, nVar);
                this.f121451c += (long) nVar.f121445a;
                C46399n nVar3 = (C46399n) this.f121450b.put(nVar.f121447c, nVar);
                return;
            }
        }
    }
}
