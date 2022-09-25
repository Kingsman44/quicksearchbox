package com.google.android.gms.contextmanager.fence.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.awareness.fence.FenceQueryRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.List;

/* compiled from: PG */
public class FenceQueryRequestImpl extends FenceQueryRequest {
    public static final Parcelable.Creator CREATOR = new C144041i();

    /* renamed from: a */
    public final QueryFenceOperation f390274a;

    /* compiled from: PG */
    public class QueryFenceOperation extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new C144049q();

        /* renamed from: a */
        public final int f390275a;

        /* renamed from: b */
        public final List f390276b;

        public QueryFenceOperation(int i, List list) {
            this.f390275a = i;
            this.f390276b = list;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = C143947c.m234082a(parcel, 20293);
            C143947c.m234089h(parcel, 2, this.f390275a);
            C143947c.m234078A(parcel, 3, this.f390276b);
            C143947c.m234083b(parcel, a);
        }
    }

    public FenceQueryRequestImpl() {
        this.f390274a = new QueryFenceOperation(1, (List) null);
    }

    public FenceQueryRequestImpl(QueryFenceOperation queryFenceOperation) {
        this.f390274a = queryFenceOperation;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 2, this.f390274a, i);
        C143947c.m234083b(parcel, a);
    }
}
