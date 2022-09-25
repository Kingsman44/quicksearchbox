package com.google.android.gms.awareness.fence;

import android.app.PendingIntent;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceRegistrationStub;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceStub;
import com.google.android.gms.contextmanager.fence.internal.FenceUpdateRequestImpl;
import com.google.android.gms.contextmanager.fence.internal.UpdateFenceOperation;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.awareness.fence.d */
/* compiled from: PG */
public final class C142935d {

    /* renamed from: a */
    private final ArrayList f387836a = new ArrayList();

    /* renamed from: a */
    public final FenceUpdateRequestImpl mo117826a() {
        return new FenceUpdateRequestImpl(this.f387836a);
    }

    /* renamed from: b */
    public final void mo117827b(String str, AwarenessFence awarenessFence, PendingIntent pendingIntent) {
        C143919bh.m233969l(str);
        C143919bh.m233958a(pendingIntent);
        ArrayList arrayList = this.f387836a;
        C143919bh.m233969l(str);
        arrayList.add(new UpdateFenceOperation(2, new ContextFenceRegistrationStub(str, (ContextFenceStub) awarenessFence, 0), pendingIntent, (String) null));
    }

    /* renamed from: c */
    public final void mo117828c(PendingIntent pendingIntent) {
        C143919bh.m233958a(pendingIntent);
        this.f387836a.add(new UpdateFenceOperation(4, (ContextFenceRegistrationStub) null, pendingIntent, (String) null));
    }

    /* renamed from: d */
    public final void mo117829d(String str) {
        C143919bh.m233969l(str);
        this.f387836a.add(new UpdateFenceOperation(5, (ContextFenceRegistrationStub) null, (PendingIntent) null, str));
    }
}
