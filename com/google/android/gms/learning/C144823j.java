package com.google.android.gms.learning;

import android.net.Uri;
import com.google.common.base.C58838bb;
import java.util.Arrays;

/* renamed from: com.google.android.gms.learning.j */
/* compiled from: PG */
public final class C144823j {

    /* renamed from: a */
    public int f391654a;

    /* renamed from: b */
    public boolean f391655b;

    /* renamed from: c */
    public InAppTrainingConstraints f391656c;

    /* renamed from: d */
    public long f391657d;

    /* renamed from: e */
    public TrainingInterval f391658e;

    /* renamed from: f */
    private String f391659f;

    /* renamed from: g */
    private String f391660g;

    /* renamed from: h */
    private int f391661h = 0;

    /* renamed from: i */
    private Uri f391662i;

    /* renamed from: j */
    private Uri f391663j;

    /* renamed from: k */
    private byte[] f391664k = new byte[0];

    /* renamed from: l */
    private Uri f391665l;

    /* renamed from: a */
    public final InAppTrainerOptions mo120233a() {
        return new InAppTrainerOptions(this.f391659f, this.f391654a, this.f391655b, this.f391660g, this.f391661h, this.f391662i, this.f391656c, this.f391657d, this.f391663j, this.f391658e, this.f391664k, this.f391665l);
    }

    /* renamed from: d */
    public final void mo120236d(Uri uri, Uri uri2, Uri uri3) {
        InAppTrainerOptions.m234715a(uri);
        InAppTrainerOptions.m234715a(uri2);
        InAppTrainerOptions.m234715a(uri3);
        this.f391661h = 3;
        this.f391662i = uri;
        this.f391665l = uri2;
        this.f391663j = uri3;
    }

    /* renamed from: b */
    public final void mo120234b(byte[] bArr) {
        bArr.getClass();
        this.f391664k = Arrays.copyOf(bArr, bArr.length);
    }

    /* renamed from: c */
    public final void mo120235c(String str) {
        str.getClass();
        C58838bb.m90868c(!str.isEmpty());
        this.f391660g = str;
    }

    /* renamed from: e */
    public final void mo120237e(String str) {
        str.getClass();
        C58838bb.m90868c(!str.isEmpty());
        this.f391659f = str;
    }
}
