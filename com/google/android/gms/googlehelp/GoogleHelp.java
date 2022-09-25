package com.google.android.gms.googlehelp;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.android.gms.feedback.C144189a;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import java.io.File;
import java.util.List;

/* compiled from: PG */
public class GoogleHelp extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C144288d();

    /* renamed from: A */
    public boolean f390738A;

    /* renamed from: B */
    public boolean f390739B;

    /* renamed from: C */
    public int f390740C;

    /* renamed from: D */
    public String f390741D;

    /* renamed from: E */
    boolean f390742E;

    /* renamed from: F */
    String f390743F;

    /* renamed from: G */
    boolean f390744G;

    /* renamed from: H */
    ND4CSettings f390745H;

    /* renamed from: I */
    boolean f390746I;

    /* renamed from: J */
    List f390747J;

    /* renamed from: K */
    String f390748K;

    /* renamed from: L */
    public C144280a f390749L;

    /* renamed from: M */
    public C144189a f390750M;

    /* renamed from: a */
    final int f390751a;

    /* renamed from: b */
    String f390752b;

    /* renamed from: c */
    public Account f390753c;

    /* renamed from: d */
    public Bundle f390754d;

    /* renamed from: e */
    String f390755e;

    /* renamed from: f */
    String f390756f;

    /* renamed from: g */
    Bitmap f390757g;

    /* renamed from: h */
    boolean f390758h;

    /* renamed from: i */
    boolean f390759i;

    /* renamed from: j */
    List f390760j;
    @Deprecated

    /* renamed from: k */
    Bundle f390761k;
    @Deprecated

    /* renamed from: l */
    Bitmap f390762l;
    @Deprecated

    /* renamed from: m */
    byte[] f390763m;
    @Deprecated

    /* renamed from: n */
    int f390764n;
    @Deprecated

    /* renamed from: o */
    int f390765o;

    /* renamed from: p */
    String f390766p;

    /* renamed from: q */
    public Uri f390767q;

    /* renamed from: r */
    public List f390768r;

    /* renamed from: s */
    public ThemeSettings f390769s;

    /* renamed from: t */
    public List f390770t;

    /* renamed from: u */
    boolean f390771u;

    /* renamed from: v */
    ErrorReport f390772v;

    /* renamed from: w */
    public TogglingData f390773w;

    /* renamed from: x */
    int f390774x;

    /* renamed from: y */
    PendingIntent f390775y;

    /* renamed from: z */
    public int f390776z;

    public GoogleHelp(int i, String str, Account account, Bundle bundle, String str2, String str3, Bitmap bitmap, boolean z, boolean z2, List list, Bundle bundle2, Bitmap bitmap2, byte[] bArr, int i2, int i3, String str4, Uri uri, List list2, int i4, ThemeSettings themeSettings, List list3, boolean z3, ErrorReport errorReport, TogglingData togglingData, int i5, PendingIntent pendingIntent, int i6, boolean z4, boolean z5, int i7, String str5, boolean z6, String str6, boolean z7, ND4CSettings nD4CSettings, boolean z8, List list4, String str7) {
        int i8 = i;
        ErrorReport errorReport2 = errorReport;
        this.f390772v = new ErrorReport();
        if (!TextUtils.isEmpty(str)) {
            this.f390751a = i8;
            this.f390776z = i6;
            this.f390738A = z4;
            this.f390739B = z5;
            this.f390740C = i7;
            this.f390741D = str5;
            this.f390752b = str;
            this.f390753c = account;
            this.f390754d = bundle;
            this.f390755e = str2;
            this.f390756f = str3;
            this.f390757g = bitmap;
            this.f390758h = z;
            this.f390759i = z2;
            this.f390742E = z6;
            this.f390760j = list;
            this.f390775y = pendingIntent;
            this.f390761k = bundle2;
            this.f390762l = bitmap2;
            this.f390763m = bArr;
            this.f390764n = i2;
            this.f390765o = i3;
            this.f390766p = str4;
            this.f390767q = uri;
            this.f390768r = list2;
            if (i8 < 4) {
                ThemeSettings themeSettings2 = new ThemeSettings();
                themeSettings2.f390592a = i4;
                this.f390769s = themeSettings2;
            } else {
                this.f390769s = themeSettings == null ? new ThemeSettings() : themeSettings;
            }
            this.f390770t = list3;
            this.f390771u = z3;
            this.f390772v = errorReport2;
            if (errorReport2 != null) {
                errorReport2.f390520X = "GoogleHelp";
            }
            this.f390773w = togglingData;
            this.f390774x = i5;
            this.f390743F = str6;
            this.f390744G = z7;
            this.f390745H = nD4CSettings;
            this.f390746I = z8;
            this.f390747J = list4;
            this.f390748K = str7;
            return;
        }
        throw new IllegalStateException("Help requires a non-empty appContext");
    }

    /* renamed from: a */
    public final Intent mo119806a() {
        return new Intent("com.google.android.gms.googlehelp.HELP").setPackage("com.google.android.gms").putExtra("EXTRA_GOOGLE_HELP", this);
    }

    /* renamed from: b */
    public final void mo119807b(FeedbackOptions feedbackOptions, File file) {
        if (feedbackOptions != null) {
            this.f390750M = feedbackOptions.f390581r;
        }
        ErrorReport errorReport = new ErrorReport(feedbackOptions, file);
        this.f390772v = errorReport;
        errorReport.f390520X = "GoogleHelp";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f390751a);
        C143947c.m234106y(parcel, 2, this.f390752b);
        C143947c.m234105x(parcel, 3, this.f390753c, i);
        C143947c.m234093l(parcel, 4, this.f390754d);
        C143947c.m234084c(parcel, 5, this.f390758h);
        C143947c.m234084c(parcel, 6, this.f390759i);
        C143947c.m234078A(parcel, 7, this.f390760j);
        C143947c.m234093l(parcel, 10, this.f390761k);
        C143947c.m234105x(parcel, 11, this.f390762l, i);
        C143947c.m234106y(parcel, 14, this.f390766p);
        C143947c.m234105x(parcel, 15, this.f390767q, i);
        C143947c.m234080C(parcel, 16, this.f390768r);
        C143947c.m234089h(parcel, 17, 0);
        C143947c.m234080C(parcel, 18, this.f390770t);
        C143947c.m234094m(parcel, 19, this.f390763m);
        C143947c.m234089h(parcel, 20, this.f390764n);
        C143947c.m234089h(parcel, 21, this.f390765o);
        C143947c.m234084c(parcel, 22, this.f390771u);
        C143947c.m234105x(parcel, 23, this.f390772v, i);
        C143947c.m234105x(parcel, 25, this.f390769s, i);
        C143947c.m234106y(parcel, 28, this.f390755e);
        C143947c.m234105x(parcel, 31, this.f390773w, i);
        C143947c.m234089h(parcel, 32, this.f390774x);
        C143947c.m234105x(parcel, 33, this.f390775y, i);
        C143947c.m234106y(parcel, 34, this.f390756f);
        C143947c.m234105x(parcel, 35, this.f390757g, i);
        C143947c.m234089h(parcel, 36, this.f390776z);
        C143947c.m234084c(parcel, 37, this.f390738A);
        C143947c.m234084c(parcel, 38, this.f390739B);
        C143947c.m234089h(parcel, 39, this.f390740C);
        C143947c.m234106y(parcel, 40, this.f390741D);
        C143947c.m234084c(parcel, 41, this.f390742E);
        C143947c.m234106y(parcel, 42, this.f390743F);
        C143947c.m234084c(parcel, 43, this.f390744G);
        C143947c.m234105x(parcel, 44, this.f390745H, i);
        C143947c.m234084c(parcel, 45, this.f390746I);
        C143947c.m234080C(parcel, 46, this.f390747J);
        C143947c.m234106y(parcel, 47, this.f390748K);
        C143947c.m234083b(parcel, a);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GoogleHelp(java.lang.String r40) {
        /*
            r39 = this;
            r0 = r39
            r2 = r40
            java.util.ArrayList r1 = new java.util.ArrayList
            r10 = r1
            r1.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r18 = r1
            r1.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r21 = r1
            r1.<init>()
            com.google.android.gms.feedback.ErrorReport r1 = new com.google.android.gms.feedback.ErrorReport
            r23 = r1
            r1.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r37 = r1
            r1.<init>()
            r1 = 19
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 1
            r9 = 1
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r19 = 3
            r20 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = -1
            r28 = 0
            r29 = 0
            r30 = 200(0xc8, float:2.8E-43)
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r38 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.googlehelp.GoogleHelp.<init>(java.lang.String):void");
    }
}
