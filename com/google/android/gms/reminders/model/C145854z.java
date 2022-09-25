package com.google.android.gms.reminders.model;

import com.google.android.gms.common.data.C143861a;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.internal.ref.TaskRef;

/* renamed from: com.google.android.gms.reminders.model.z */
/* compiled from: PG */
public final class C145854z extends C143861a {
    public C145854z(DataHolder dataHolder) {
        super(dataHolder);
    }

    /* renamed from: a */
    public final Task mo119329d(int i) {
        return new TaskRef(this.f389971a, i);
    }
}
