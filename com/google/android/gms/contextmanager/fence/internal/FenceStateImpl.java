package com.google.android.gms.contextmanager.fence.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.awareness.fence.FenceState;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.android.gms.common.internal.safeparcel.C143948d;
import com.google.android.gms.contextmanager.ContextData;
import java.util.ArrayList;

/* compiled from: PG */
public class FenceStateImpl extends FenceState {
    public static final Parcelable.Creator CREATOR = new C144042j();

    /* renamed from: a */
    public final int f390277a;

    /* renamed from: b */
    public final long f390278b;

    /* renamed from: c */
    public final String f390279c;

    /* renamed from: d */
    public final int f390280d;

    /* renamed from: e */
    public final ArrayList f390281e;

    public FenceStateImpl(int i, long j, String str, int i2, ArrayList arrayList) {
        this.f390277a = i;
        this.f390278b = j;
        this.f390279c = str;
        this.f390280d = i2;
        this.f390281e = arrayList;
    }

    /* renamed from: a */
    public static FenceState m234223a(Intent intent) {
        ArrayList arrayList;
        int intExtra = intent.getIntExtra("context_fence_current_state", 0);
        long longExtra = intent.getLongExtra("context_fence_last_updated_time", 0);
        String stringExtra = intent.getStringExtra("context_fence_key");
        int intExtra2 = intent.getIntExtra("context_fence_previous_state", 0);
        Parcelable.Creator creator = ContextData.CREATOR;
        ArrayList arrayList2 = (ArrayList) intent.getSerializableExtra("context_data_list");
        if (arrayList2 == null) {
            arrayList = null;
        } else {
            ArrayList arrayList3 = new ArrayList(arrayList2.size());
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                arrayList3.add(C143948d.m234108a((byte[]) arrayList2.get(i), creator));
            }
            arrayList = arrayList3;
        }
        return new FenceStateImpl(intExtra, longExtra, stringExtra, intExtra2, arrayList);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 2, this.f390277a);
        C143947c.m234090i(parcel, 3, this.f390278b);
        C143947c.m234106y(parcel, 4, this.f390279c);
        C143947c.m234089h(parcel, 5, this.f390280d);
        C143947c.m234080C(parcel, 6, this.f390281e);
        C143947c.m234083b(parcel, a);
    }
}
