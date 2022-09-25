package com.google.android.gms.feedback;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.io.File;
import java.util.List;

/* compiled from: PG */
public class ErrorReport extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C144197b();

    /* renamed from: A */
    public String f390497A;

    /* renamed from: B */
    public String f390498B;

    /* renamed from: C */
    public String f390499C;

    /* renamed from: D */
    public Bundle f390500D;

    /* renamed from: E */
    public boolean f390501E;

    /* renamed from: F */
    public int f390502F;

    /* renamed from: G */
    public int f390503G;

    /* renamed from: H */
    public boolean f390504H;

    /* renamed from: I */
    public String f390505I;

    /* renamed from: J */
    public String f390506J;

    /* renamed from: K */
    public int f390507K;

    /* renamed from: L */
    public String f390508L;

    /* renamed from: M */
    public String f390509M;

    /* renamed from: N */
    public String f390510N;

    /* renamed from: O */
    public String f390511O;

    /* renamed from: P */
    public String f390512P;
    @Deprecated

    /* renamed from: Q */
    public String f390513Q;

    /* renamed from: R */
    public String f390514R;

    /* renamed from: S */
    public BitmapTeleporter f390515S;

    /* renamed from: T */
    public String f390516T;

    /* renamed from: U */
    public FileTeleporter[] f390517U;

    /* renamed from: V */
    public String[] f390518V;

    /* renamed from: W */
    public boolean f390519W;

    /* renamed from: X */
    public String f390520X;

    /* renamed from: Y */
    public ThemeSettings f390521Y;

    /* renamed from: Z */
    public LogOptions f390522Z;

    /* renamed from: a */
    public ApplicationErrorReport f390523a;
    @Deprecated

    /* renamed from: aa */
    public String f390524aa;

    /* renamed from: ab */
    public boolean f390525ab;

    /* renamed from: ac */
    public Bundle f390526ac;

    /* renamed from: ad */
    public List f390527ad;

    /* renamed from: ae */
    public boolean f390528ae;

    /* renamed from: af */
    public Bitmap f390529af;

    /* renamed from: ag */
    public String f390530ag;

    /* renamed from: ah */
    public List f390531ah;

    /* renamed from: ai */
    public int f390532ai;

    /* renamed from: aj */
    public int f390533aj;

    /* renamed from: ak */
    public String[] f390534ak;

    /* renamed from: al */
    public String[] f390535al;

    /* renamed from: am */
    public String[] f390536am;

    /* renamed from: an */
    public boolean f390537an;

    /* renamed from: ao */
    public boolean f390538ao;

    /* renamed from: b */
    public String f390539b;

    /* renamed from: c */
    public int f390540c;

    /* renamed from: d */
    public String f390541d;

    /* renamed from: e */
    public String f390542e;

    /* renamed from: f */
    public String f390543f;

    /* renamed from: g */
    public String f390544g;

    /* renamed from: h */
    public String f390545h;

    /* renamed from: i */
    public String f390546i;

    /* renamed from: j */
    public String f390547j;

    /* renamed from: k */
    public int f390548k;

    /* renamed from: l */
    public String f390549l;

    /* renamed from: m */
    public String f390550m;

    /* renamed from: n */
    public String f390551n;

    /* renamed from: o */
    public String f390552o;

    /* renamed from: p */
    public String f390553p;

    /* renamed from: q */
    public String[] f390554q;

    /* renamed from: r */
    public String[] f390555r;

    /* renamed from: s */
    public String[] f390556s;

    /* renamed from: t */
    public String f390557t;

    /* renamed from: u */
    public String f390558u;

    /* renamed from: v */
    public byte[] f390559v;

    /* renamed from: w */
    public int f390560w;

    /* renamed from: x */
    public int f390561x;

    /* renamed from: y */
    public int f390562y;

    /* renamed from: z */
    public int f390563z;

    public ErrorReport() {
        this.f390523a = new ApplicationErrorReport();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 2, this.f390523a, i);
        C143947c.m234106y(parcel, 3, this.f390539b);
        C143947c.m234089h(parcel, 4, this.f390540c);
        C143947c.m234106y(parcel, 5, this.f390541d);
        C143947c.m234106y(parcel, 6, this.f390542e);
        C143947c.m234106y(parcel, 7, this.f390543f);
        C143947c.m234106y(parcel, 8, this.f390544g);
        C143947c.m234106y(parcel, 9, this.f390545h);
        C143947c.m234106y(parcel, 10, this.f390546i);
        C143947c.m234106y(parcel, 11, this.f390547j);
        C143947c.m234089h(parcel, 12, this.f390548k);
        C143947c.m234106y(parcel, 13, this.f390549l);
        C143947c.m234106y(parcel, 14, this.f390550m);
        C143947c.m234106y(parcel, 15, this.f390551n);
        C143947c.m234106y(parcel, 16, this.f390552o);
        C143947c.m234106y(parcel, 17, this.f390553p);
        C143947c.m234107z(parcel, 18, this.f390554q);
        C143947c.m234107z(parcel, 19, this.f390555r);
        C143947c.m234107z(parcel, 20, this.f390556s);
        C143947c.m234106y(parcel, 21, this.f390557t);
        C143947c.m234106y(parcel, 22, this.f390558u);
        C143947c.m234094m(parcel, 23, this.f390559v);
        C143947c.m234089h(parcel, 24, this.f390560w);
        C143947c.m234089h(parcel, 25, this.f390561x);
        C143947c.m234089h(parcel, 26, this.f390562y);
        C143947c.m234089h(parcel, 27, this.f390563z);
        C143947c.m234106y(parcel, 28, this.f390497A);
        C143947c.m234106y(parcel, 29, this.f390498B);
        C143947c.m234106y(parcel, 30, this.f390499C);
        C143947c.m234093l(parcel, 31, this.f390500D);
        C143947c.m234084c(parcel, 32, this.f390501E);
        C143947c.m234089h(parcel, 33, this.f390502F);
        C143947c.m234089h(parcel, 34, this.f390503G);
        C143947c.m234084c(parcel, 35, this.f390504H);
        C143947c.m234106y(parcel, 36, this.f390505I);
        C143947c.m234106y(parcel, 37, this.f390506J);
        C143947c.m234089h(parcel, 38, this.f390507K);
        C143947c.m234106y(parcel, 39, this.f390508L);
        C143947c.m234106y(parcel, 40, this.f390509M);
        C143947c.m234106y(parcel, 41, this.f390510N);
        C143947c.m234106y(parcel, 42, this.f390511O);
        C143947c.m234106y(parcel, 43, this.f390512P);
        C143947c.m234106y(parcel, 44, this.f390513Q);
        C143947c.m234106y(parcel, 45, this.f390514R);
        C143947c.m234105x(parcel, 46, this.f390515S, i);
        C143947c.m234106y(parcel, 47, this.f390516T);
        C143947c.m234079B(parcel, 48, this.f390517U, i);
        C143947c.m234107z(parcel, 49, this.f390518V);
        C143947c.m234084c(parcel, 50, this.f390519W);
        C143947c.m234106y(parcel, 51, this.f390520X);
        C143947c.m234105x(parcel, 52, this.f390521Y, i);
        C143947c.m234105x(parcel, 53, this.f390522Z, i);
        C143947c.m234106y(parcel, 54, this.f390524aa);
        C143947c.m234084c(parcel, 55, this.f390525ab);
        C143947c.m234093l(parcel, 56, this.f390526ac);
        C143947c.m234080C(parcel, 57, this.f390527ad);
        C143947c.m234084c(parcel, 58, this.f390528ae);
        C143947c.m234105x(parcel, 59, this.f390529af, i);
        C143947c.m234106y(parcel, 60, this.f390530ag);
        C143947c.m234078A(parcel, 61, this.f390531ah);
        C143947c.m234089h(parcel, 62, this.f390532ai);
        C143947c.m234089h(parcel, 63, this.f390533aj);
        C143947c.m234107z(parcel, 64, this.f390534ak);
        C143947c.m234107z(parcel, 65, this.f390535al);
        C143947c.m234107z(parcel, 66, this.f390536am);
        C143947c.m234084c(parcel, 67, this.f390537an);
        C143947c.m234084c(parcel, 68, this.f390538ao);
        C143947c.m234083b(parcel, a);
    }

    public ErrorReport(ApplicationErrorReport applicationErrorReport, String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, String str9, String str10, String str11, String str12, String str13, String[] strArr, String[] strArr2, String[] strArr3, String str14, String str15, byte[] bArr, int i3, int i4, int i5, int i6, String str16, String str17, String str18, Bundle bundle, boolean z, int i7, int i8, boolean z2, String str19, String str20, int i9, String str21, String str22, String str23, String str24, String str25, String str26, String str27, BitmapTeleporter bitmapTeleporter, String str28, FileTeleporter[] fileTeleporterArr, String[] strArr4, boolean z3, String str29, ThemeSettings themeSettings, LogOptions logOptions, String str30, boolean z4, Bundle bundle2, List list, boolean z5, Bitmap bitmap, String str31, List list2, int i10, int i11, String[] strArr5, String[] strArr6, String[] strArr7, boolean z6, boolean z7) {
        new ApplicationErrorReport();
        this.f390523a = applicationErrorReport;
        this.f390539b = str;
        this.f390540c = i;
        this.f390541d = str2;
        this.f390542e = str3;
        this.f390543f = str4;
        this.f390544g = str5;
        this.f390545h = str6;
        this.f390546i = str7;
        this.f390547j = str8;
        this.f390548k = i2;
        this.f390549l = str9;
        this.f390550m = str10;
        this.f390551n = str11;
        this.f390552o = str12;
        this.f390553p = str13;
        this.f390554q = strArr;
        this.f390555r = strArr2;
        this.f390556s = strArr3;
        this.f390557t = str14;
        this.f390558u = str15;
        this.f390559v = bArr;
        this.f390560w = i3;
        this.f390561x = i4;
        this.f390562y = i5;
        this.f390563z = i6;
        this.f390497A = str16;
        this.f390498B = str17;
        this.f390499C = str18;
        this.f390500D = bundle;
        this.f390501E = z;
        this.f390502F = i7;
        this.f390503G = i8;
        this.f390504H = z2;
        this.f390505I = str19;
        this.f390506J = str20;
        this.f390507K = i9;
        this.f390508L = str21;
        this.f390509M = str22;
        this.f390510N = str23;
        this.f390511O = str24;
        this.f390512P = str25;
        this.f390513Q = str26;
        this.f390514R = str27;
        this.f390515S = bitmapTeleporter;
        this.f390516T = str28;
        this.f390517U = fileTeleporterArr;
        this.f390518V = strArr4;
        this.f390519W = z3;
        this.f390520X = str29;
        this.f390521Y = themeSettings;
        this.f390522Z = logOptions;
        this.f390524aa = str30;
        this.f390525ab = z4;
        this.f390526ac = bundle2;
        this.f390527ad = list;
        this.f390528ae = z5;
        this.f390529af = bitmap;
        this.f390530ag = str31;
        this.f390531ah = list2;
        this.f390532ai = i10;
        this.f390533aj = i11;
        this.f390534ak = strArr5;
        this.f390535al = strArr6;
        this.f390536am = strArr7;
        this.f390537an = z6;
        this.f390538ao = z7;
    }

    public ErrorReport(FeedbackOptions feedbackOptions, File file) {
        this.f390523a = new ApplicationErrorReport();
        if (feedbackOptions != null) {
            Bundle bundle = feedbackOptions.f390565b;
            if (bundle != null && !bundle.isEmpty()) {
                this.f390500D = feedbackOptions.f390565b;
            }
            if (!TextUtils.isEmpty(feedbackOptions.f390564a)) {
                this.f390498B = feedbackOptions.f390564a;
            }
            if (!TextUtils.isEmpty(feedbackOptions.f390566c)) {
                this.f390539b = feedbackOptions.f390566c;
            }
            ApplicationErrorReport.CrashInfo crashInfo = feedbackOptions.f390567d.crashInfo;
            if (crashInfo != null) {
                this.f390509M = crashInfo.throwMethodName;
                this.f390507K = crashInfo.throwLineNumber;
                this.f390508L = crashInfo.throwClassName;
                this.f390510N = crashInfo.stackTrace;
                this.f390505I = crashInfo.exceptionClassName;
                this.f390511O = crashInfo.exceptionMessage;
                this.f390506J = crashInfo.throwFileName;
            }
            ThemeSettings themeSettings = feedbackOptions.f390573j;
            if (themeSettings != null) {
                this.f390521Y = themeSettings;
            }
            if (!TextUtils.isEmpty(feedbackOptions.f390568e)) {
                this.f390512P = feedbackOptions.f390568e;
            }
            String str = feedbackOptions.f390570g;
            if (!TextUtils.isEmpty(str)) {
                this.f390523a.packageName = str;
            }
            if (!TextUtils.isEmpty(feedbackOptions.f390577n)) {
                this.f390530ag = feedbackOptions.f390577n;
            }
            Bitmap bitmap = feedbackOptions.f390576m;
            if (bitmap != null) {
                this.f390529af = bitmap;
            }
            if (file != null) {
                this.f390515S = feedbackOptions.f390569f;
                List<FileTeleporter> list = feedbackOptions.f390571h;
                if (list != null && !list.isEmpty()) {
                    for (FileTeleporter fileTeleporter : list) {
                        fileTeleporter.f390586e = file;
                    }
                    this.f390517U = (FileTeleporter[]) list.toArray(new FileTeleporter[0]);
                }
            }
            LogOptions logOptions = feedbackOptions.f390574k;
            if (logOptions != null) {
                this.f390522Z = logOptions;
            }
            this.f390519W = feedbackOptions.f390572i;
            this.f390528ae = feedbackOptions.f390575l;
            this.f390501E = feedbackOptions.f390578o;
            this.f390537an = feedbackOptions.f390580q;
        }
    }
}
