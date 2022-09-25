package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.C145824ad;
import com.google.android.gms.reminders.model.TaskId;
import com.google.android.gms.reminders.model.TaskIdEntity;

/* compiled from: PG */
public class TaskIdRef extends C145815a implements TaskId {
    public TaskIdRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i, str);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo119345a() {
        return new TaskIdEntity(this);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TaskId)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return TaskIdEntity.m237527c(this, (TaskId) obj);
    }

    /* renamed from: h */
    public final String mo122058h() {
        return mo119337kv(mo122100u("client_assigned_id"));
    }

    public final int hashCode() {
        return TaskIdEntity.m237526b(this);
    }

    /* renamed from: i */
    public final String mo122059i() {
        return mo119337kv(mo122100u("client_assigned_thread_id"));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C145824ad.m237567a(new TaskIdEntity(this), parcel);
    }
}
