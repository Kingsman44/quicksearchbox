package com.google.android.apps.gsa.shared.notificationlistening.common;

import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.shared.notificationlistening.common.n */
/* compiled from: PG */
public final class C90433n {

    /* renamed from: e */
    private static final C59071e f252640e = C59071e.m91332i("com.google.android.apps.gsa.shared.notificationlistening.common.n");

    /* renamed from: a */
    public final C21370a f252641a;

    /* renamed from: b */
    public final List f252642b;

    /* renamed from: c */
    public Integer f252643c;

    /* renamed from: d */
    public Long f252644d;

    public C90433n(C21370a aVar) {
        this.f252642b = new ArrayList();
        this.f252641a = aVar;
    }

    /* renamed from: h */
    public static boolean m147107h(int i) {
        return i == 0 || i == 1;
    }

    /* renamed from: k */
    public static boolean m147108k(int i) {
        return i == 5 || i == 4 || i == 9 || i == 6 || i == 7;
    }

    /* renamed from: a */
    public final Integer mo84166a() {
        if (this.f252642b.isEmpty()) {
            return null;
        }
        List list = this.f252642b;
        return Integer.valueOf(((C90432m) list.get(list.size() - 1)).f252637a);
    }

    /* renamed from: b */
    public final void mo84167b(C90432m mVar) {
        this.f252642b.add(mVar);
    }

    /* renamed from: c */
    public final void mo84168c(long j) {
        if (this.f252644d != null) {
            ((C59052c) ((C59052c) f252640e.mo56226d()).mo56372aa(10944)).mo56386p("Notification ID cannot be set again.");
            int i = C90755l.f253831a;
            return;
        }
        this.f252644d = Long.valueOf(j);
    }

    /* renamed from: d */
    public final boolean mo84169d() {
        for (C90432m mVar : this.f252642b) {
            if (m147108k(mVar.f252637a)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000c  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo84170e() {
        /*
            r3 = this;
            java.util.List r0 = r3.f252642b
            java.util.Iterator r0 = r0.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0020
            java.lang.Object r1 = r0.next()
            com.google.android.apps.gsa.shared.notificationlistening.common.m r1 = (com.google.android.apps.gsa.shared.notificationlistening.common.C90432m) r1
            int r1 = r1.f252637a
            r2 = 4
            if (r1 == r2) goto L_0x001e
            r2 = 9
            if (r1 == r2) goto L_0x001e
            r2 = 7
            if (r1 != r2) goto L_0x0006
        L_0x001e:
            r0 = 1
            return r0
        L_0x0020:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.notificationlistening.common.C90433n.mo84170e():boolean");
    }

    /* renamed from: f */
    public final boolean mo84171f(int i) {
        for (C90432m mVar : this.f252642b) {
            if (mVar.f252637a == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public final boolean mo84172g() {
        Integer a = mo84166a();
        return a != null && a.intValue() == 2;
    }

    /* renamed from: i */
    public final boolean mo84173i() {
        Integer num = this.f252643c;
        if (num == null || !m147107h(num.intValue()) || mo84172g() || mo84169d()) {
            return false;
        }
        for (C90432m mVar : this.f252642b) {
            int i = mVar.f252637a;
            if (i == 1) {
                return false;
            }
            if (i == 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: j */
    public final boolean mo84174j(int i) {
        Integer num = this.f252643c;
        if (num == null || (m147107h(i) && !m147107h(num.intValue()))) {
            this.f252643c = Integer.valueOf(i);
            return true;
        }
        ((C59052c) ((C59052c) f252640e.mo56226d()).mo56372aa(10945)).mo56386p("Playback type can only be changed from non-interruptive to interruptive.");
        int i2 = C90755l.f253831a;
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("# mPlaybackEvents=");
        sb.append(this.f252642b.size());
        sb.append(", mIntendedPlaybackType=");
        sb.append(this.f252643c);
        for (C90432m mVar : this.f252642b) {
            sb.append("  Event: mType=");
            sb.append(mVar.f252637a);
            sb.append(", mTimestamp=");
            sb.append(mVar.f252638b);
            sb.append(", mIsInterruptive=");
            sb.append(mVar.f252639c);
        }
        return sb.toString();
    }

    public C90433n(C21370a aVar, long j, int i, Collection collection) {
        ArrayList arrayList = new ArrayList();
        this.f252642b = arrayList;
        this.f252641a = aVar;
        this.f252644d = Long.valueOf(j);
        this.f252643c = Integer.valueOf(i);
        arrayList.addAll(collection);
        while (!this.f252642b.isEmpty()) {
            int i2 = ((C90432m) C58557jl.m90131l(this.f252642b)).f252637a;
            if (i2 == 2 || i2 == 12) {
                List list = this.f252642b;
                list.remove(list.size() - 1);
            } else {
                return;
            }
        }
    }
}
