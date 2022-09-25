package com.google.android.libraries.places.widget.internal.common;

import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.Place;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.places.widget.internal.common.d */
/* compiled from: PG */
final class C31916d extends C31920h {

    /* renamed from: a */
    private final String f85841a;

    /* renamed from: b */
    private final C58485gu f85842b;

    /* renamed from: c */
    private final Place f85843c;

    /* renamed from: d */
    private final AutocompletePrediction f85844d;

    /* renamed from: e */
    private final Status f85845e;

    /* renamed from: f */
    private final int f85846f;

    public C31916d(int i, String str, C58485gu guVar, Place place, AutocompletePrediction autocompletePrediction, Status status) {
        this.f85846f = i;
        this.f85841a = str;
        this.f85842b = guVar;
        this.f85843c = place;
        this.f85844d = autocompletePrediction;
        this.f85845e = status;
    }

    /* renamed from: a */
    public final Status mo37678a() {
        return this.f85845e;
    }

    /* renamed from: b */
    public final AutocompletePrediction mo37679b() {
        return this.f85844d;
    }

    /* renamed from: c */
    public final Place mo37680c() {
        return this.f85843c;
    }

    /* renamed from: d */
    public final C58485gu mo37681d() {
        return this.f85842b;
    }

    /* renamed from: e */
    public final String mo37682e() {
        return this.f85841a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        r1 = r4.f85842b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
        r1 = r4.f85843c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0052, code lost:
        r1 = r4.f85844d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0067, code lost:
        r1 = r4.f85845e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        r1 = r4.f85841a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.places.widget.internal.common.C31920h
            r2 = 0
            if (r1 == 0) goto L_0x007e
            com.google.android.libraries.places.widget.internal.common.h r5 = (com.google.android.libraries.places.widget.internal.common.C31920h) r5
            int r1 = r4.f85846f
            int r3 = r5.mo37684f()
            if (r1 != r3) goto L_0x007e
            java.lang.String r1 = r4.f85841a
            if (r1 != 0) goto L_0x001e
            java.lang.String r1 = r5.mo37682e()
            if (r1 != 0) goto L_0x007e
            goto L_0x0028
        L_0x001e:
            java.lang.String r3 = r5.mo37682e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x007e
        L_0x0028:
            com.google.common.b.gu r1 = r4.f85842b
            if (r1 != 0) goto L_0x0033
            com.google.common.b.gu r1 = r5.mo37681d()
            if (r1 != 0) goto L_0x007e
            goto L_0x003d
        L_0x0033:
            com.google.common.b.gu r3 = r5.mo37681d()
            boolean r1 = com.google.common.p4522b.C58597ky.m90218i(r1, r3)
            if (r1 == 0) goto L_0x007e
        L_0x003d:
            com.google.android.libraries.places.api.model.Place r1 = r4.f85843c
            if (r1 != 0) goto L_0x0048
            com.google.android.libraries.places.api.model.Place r1 = r5.mo37680c()
            if (r1 != 0) goto L_0x007e
            goto L_0x0052
        L_0x0048:
            com.google.android.libraries.places.api.model.Place r3 = r5.mo37680c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x007e
        L_0x0052:
            com.google.android.libraries.places.api.model.AutocompletePrediction r1 = r4.f85844d
            if (r1 != 0) goto L_0x005d
            com.google.android.libraries.places.api.model.AutocompletePrediction r1 = r5.mo37679b()
            if (r1 != 0) goto L_0x007e
            goto L_0x0067
        L_0x005d:
            com.google.android.libraries.places.api.model.AutocompletePrediction r3 = r5.mo37679b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x007e
        L_0x0067:
            com.google.android.gms.common.api.Status r1 = r4.f85845e
            if (r1 != 0) goto L_0x0072
            com.google.android.gms.common.api.Status r5 = r5.mo37678a()
            if (r5 != 0) goto L_0x007e
            goto L_0x007d
        L_0x0072:
            com.google.android.gms.common.api.Status r5 = r5.mo37678a()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x007d
            goto L_0x007e
        L_0x007d:
            return r0
        L_0x007e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.widget.internal.common.C31916d.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final int mo37684f() {
        return this.f85846f;
    }

    public final String toString() {
        String str;
        switch (this.f85846f) {
            case 1:
                str = "START";
                break;
            case 2:
                str = "RESET";
                break;
            case 3:
                str = "LOADING";
                break;
            case 4:
                str = "TRY_AGAIN_PROGRESS_LOADING";
                break;
            case 5:
                str = "SUCCESS_PREDICTIONS";
                break;
            case 6:
                str = "FAILURE_NO_PREDICTIONS";
                break;
            case 7:
                str = "FAILURE_PREDICTIONS";
                break;
            case 8:
                str = "SUCCESS_SELECTION";
                break;
            case 9:
                str = "FAILURE_SELECTION";
                break;
            default:
                str = "FAILURE_UNRESOLVABLE";
                break;
        }
        String str2 = this.f85841a;
        String valueOf = String.valueOf(this.f85842b);
        String valueOf2 = String.valueOf(this.f85843c);
        String valueOf3 = String.valueOf(this.f85844d);
        String valueOf4 = String.valueOf(this.f85845e);
        return "AutocompleteState{type=" + str + ", query=" + str2 + ", predictions=" + valueOf + ", place=" + valueOf2 + ", prediction=" + valueOf3 + ", status=" + valueOf4 + "}";
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = (this.f85846f ^ 1000003) * 1000003;
        String str = this.f85841a;
        int i6 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i7 = (i5 ^ i) * 1000003;
        C58485gu guVar = this.f85842b;
        if (guVar == null) {
            i2 = 0;
        } else {
            i2 = guVar.hashCode();
        }
        int i8 = (i7 ^ i2) * 1000003;
        Place place = this.f85843c;
        if (place == null) {
            i3 = 0;
        } else {
            i3 = place.hashCode();
        }
        int i9 = (i8 ^ i3) * 1000003;
        AutocompletePrediction autocompletePrediction = this.f85844d;
        if (autocompletePrediction == null) {
            i4 = 0;
        } else {
            i4 = autocompletePrediction.hashCode();
        }
        int i10 = (i9 ^ i4) * 1000003;
        Status status = this.f85845e;
        if (status != null) {
            i6 = status.hashCode();
        }
        return i10 ^ i6;
    }
}
