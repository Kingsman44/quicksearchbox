package com.google.android.gms.feedback;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public class FeedbackOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C144208m();

    /* renamed from: a */
    public String f390564a;

    /* renamed from: b */
    public Bundle f390565b;

    /* renamed from: c */
    String f390566c;

    /* renamed from: d */
    public ApplicationErrorReport f390567d;

    /* renamed from: e */
    String f390568e;

    /* renamed from: f */
    public BitmapTeleporter f390569f;

    /* renamed from: g */
    public String f390570g;

    /* renamed from: h */
    public List f390571h;

    /* renamed from: i */
    boolean f390572i;

    /* renamed from: j */
    ThemeSettings f390573j;

    /* renamed from: k */
    LogOptions f390574k;

    /* renamed from: l */
    boolean f390575l;

    /* renamed from: m */
    public Bitmap f390576m;

    /* renamed from: n */
    public String f390577n;

    /* renamed from: o */
    boolean f390578o;

    /* renamed from: p */
    long f390579p;

    /* renamed from: q */
    boolean f390580q;

    /* renamed from: r */
    public C144189a f390581r;

    public FeedbackOptions(ApplicationErrorReport applicationErrorReport) {
        this((String) null, (Bundle) null, (String) null, applicationErrorReport, (String) null, (BitmapTeleporter) null, (String) null, (List) null, true, (ThemeSettings) null, (LogOptions) null, false, (Bitmap) null, (String) null, false, 0, false);
    }

    /* renamed from: a */
    public static FeedbackOptions m234419a(List list) {
        FeedbackOptions feedbackOptions = new FeedbackOptions(new ApplicationErrorReport());
        if (list != null) {
            feedbackOptions.f390571h = list;
        }
        return feedbackOptions;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C144208m.m234457a(this, parcel, i);
    }

    public FeedbackOptions(String str, Bundle bundle, String str2, ApplicationErrorReport applicationErrorReport, String str3, BitmapTeleporter bitmapTeleporter, String str4, List list, boolean z, ThemeSettings themeSettings, LogOptions logOptions, boolean z2, Bitmap bitmap, String str5, boolean z3, long j, boolean z4) {
        Bundle bundle2;
        ApplicationErrorReport applicationErrorReport2;
        this.f390564a = str;
        if (bundle != null) {
            bundle2 = bundle;
        } else {
            bundle2 = new Bundle();
        }
        this.f390565b = bundle2;
        this.f390566c = str2;
        if (applicationErrorReport != null) {
            applicationErrorReport2 = applicationErrorReport;
        } else {
            applicationErrorReport2 = new ApplicationErrorReport();
        }
        this.f390567d = applicationErrorReport2;
        this.f390568e = str3;
        this.f390569f = bitmapTeleporter;
        this.f390570g = str4;
        this.f390571h = list != null ? list : new ArrayList();
        this.f390572i = z;
        this.f390573j = themeSettings;
        this.f390574k = logOptions;
        this.f390575l = z2;
        this.f390576m = bitmap;
        this.f390577n = str5;
        this.f390578o = z3;
        this.f390579p = j;
        this.f390580q = z4;
    }
}
