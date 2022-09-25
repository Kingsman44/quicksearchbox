package com.google.android.apps.gsa.sidekick.shared.util;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7726hr;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.util.l */
/* compiled from: PG */
public final class C91993l extends C91997p {

    /* renamed from: a */
    private final C58485gu f256486a;

    public C91993l(C58485gu guVar) {
        this.f256486a = guVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo86071a(C7718hj hjVar, C7718hj hjVar2) {
        C58485gu guVar = this.f256486a;
        int i = ((C58724pq) guVar).f156474d;
        int i2 = 0;
        while (i2 < i) {
            int i3 = i2 + 1;
            if (!((C91997p) guVar.get(i2)).mo86071a(hjVar, hjVar2)) {
                return false;
            }
            i2 = i3;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo86205b(C7726hr hrVar) {
        C58485gu guVar = this.f256486a;
        int i = ((C58724pq) guVar).f156474d;
        int i2 = 0;
        while (i2 < i) {
            int i3 = i2 + 1;
            if (!((C91997p) guVar.get(i2)).mo86205b(hrVar)) {
                return false;
            }
            i2 = i3;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo86159c(C7726hr hrVar) {
        C58485gu guVar = this.f256486a;
        int i = ((C58724pq) guVar).f156474d;
        for (int i2 = 0; i2 < i; i2++) {
            ((C91997p) guVar.get(i2)).mo86159c(hrVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo86160d(C7726hr hrVar) {
        C58485gu guVar = this.f256486a;
        int i = ((C58724pq) guVar).f156474d;
        for (int i2 = 0; i2 < i; i2++) {
            ((C91997p) guVar.get(i2)).mo86160d(hrVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo86669e(C7726hr hrVar) {
        C58485gu guVar = this.f256486a;
        int i = ((C58724pq) guVar).f156474d;
        int i2 = 0;
        while (i2 < i) {
            int i3 = i2 + 1;
            if (!((C91997p) guVar.get(i2)).mo86669e(hrVar)) {
                return false;
            }
            i2 = i3;
        }
        return true;
    }
}
