package com.google.android.libraries.places.widget.internal.common;

import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.Place;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.places.widget.internal.common.c */
/* compiled from: PG */
public final class C31915c extends C31919g {

    /* renamed from: a */
    public String f85835a;

    /* renamed from: b */
    public C58485gu f85836b;

    /* renamed from: c */
    public Place f85837c;

    /* renamed from: d */
    public AutocompletePrediction f85838d;

    /* renamed from: e */
    public Status f85839e;

    /* renamed from: f */
    public int f85840f;

    /* renamed from: a */
    public final C31920h mo37677a() {
        int i = this.f85840f;
        if (i != 0) {
            return new C31916d(i, this.f85835a, this.f85836b, this.f85837c, this.f85838d, this.f85839e);
        }
        throw new IllegalStateException("Missing required properties: type");
    }
}
