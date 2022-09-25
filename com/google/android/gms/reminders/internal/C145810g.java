package com.google.android.gms.reminders.internal;

import com.evernote.android.state.BuildConfig;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.internal.ref.C145815a;
import com.google.android.gms.reminders.internal.ref.TaskRef;
import com.google.android.gms.reminders.model.C145851w;
import com.google.android.gms.reminders.model.Task;

/* renamed from: com.google.android.gms.reminders.internal.g */
/* compiled from: PG */
public final class C145810g extends C145815a implements C145851w {
    public C145810g(DataHolder dataHolder, int i) {
        super(dataHolder, i, BuildConfig.FLAVOR);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo119345a() {
        throw null;
    }

    /* renamed from: h */
    public final int mo121964h() {
        return mo119336ks("deleted") == 1 ? 2 : 1;
    }

    /* renamed from: i */
    public final Task mo121965i() {
        return new TaskRef(this.f389974a, this.f389975b);
    }

    /* renamed from: j */
    public final String mo121966j() {
        return mo119337kv("account_name");
    }
}
