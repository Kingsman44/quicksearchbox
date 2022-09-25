package com.google.android.gms.semanticlocation;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public class SemanticLocationState extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C145952ac();

    /* renamed from: a */
    public final List f394627a;

    /* renamed from: b */
    public final long f394628b;

    /* renamed from: c */
    public final DebugData f394629c;

    static {
        new ArrayList(0);
    }

    public SemanticLocationState(List list, long j, DebugData debugData) {
        this.f394627a = list;
        this.f394628b = j;
        this.f394629c = debugData;
    }

    /* renamed from: a */
    public static SemanticLocationState m237751a(Intent intent) {
        if (intent != null && intent.hasExtra("com.google.android.gms.semanticlocation.EXTRA_SEMANTIC_LOCATION_STATE")) {
            return (SemanticLocationState) intent.getParcelableExtra("com.google.android.gms.semanticlocation.EXTRA_SEMANTIC_LOCATION_STATE");
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234080C(parcel, 1, this.f394627a);
        C143947c.m234090i(parcel, 2, this.f394628b);
        C143947c.m234105x(parcel, 3, this.f394629c, i);
        C143947c.m234083b(parcel, a);
    }
}
