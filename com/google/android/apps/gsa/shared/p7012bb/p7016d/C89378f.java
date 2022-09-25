package com.google.android.apps.gsa.shared.p7012bb.p7016d;

import com.google.common.p4522b.C58485gu;
import com.google.p4449cd.p4454e.C57961a;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.apps.gsa.shared.bb.d.f */
/* compiled from: PG */
public final class C89378f extends C57961a implements C89390r {

    /* renamed from: a */
    private final C58485gu f242326a;

    public C89378f(C58485gu guVar) {
        super(guVar);
        this.f242326a = guVar;
    }

    /* renamed from: l */
    public final void mo83313l(MessageLite messageLite, long j) {
        C58485gu guVar = this.f242326a;
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            ((C89390r) guVar.get(i)).mo83313l(messageLite, j);
        }
    }

    /* renamed from: m */
    public final void mo83314m(int i, int i2, long j) {
        C58485gu guVar = this.f242326a;
        int size = guVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((C89390r) guVar.get(i3)).mo83314m(i, i2, j);
        }
    }
}
