package com.google.android.gms.feedback;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.feedback.m */
/* compiled from: PG */
public final class C144208m implements Parcelable.Creator {
    /* renamed from: a */
    public static void m234457a(FeedbackOptions feedbackOptions, Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 2, feedbackOptions.f390564a);
        C143947c.m234093l(parcel, 3, feedbackOptions.f390565b);
        C143947c.m234106y(parcel, 5, feedbackOptions.f390566c);
        C143947c.m234105x(parcel, 6, feedbackOptions.f390567d, i);
        C143947c.m234106y(parcel, 7, feedbackOptions.f390568e);
        C143947c.m234105x(parcel, 8, feedbackOptions.f390569f, i);
        C143947c.m234106y(parcel, 9, feedbackOptions.f390570g);
        C143947c.m234080C(parcel, 10, feedbackOptions.f390571h);
        C143947c.m234084c(parcel, 11, feedbackOptions.f390572i);
        C143947c.m234105x(parcel, 12, feedbackOptions.f390573j, i);
        C143947c.m234105x(parcel, 13, feedbackOptions.f390574k, i);
        C143947c.m234084c(parcel, 14, feedbackOptions.f390575l);
        C143947c.m234105x(parcel, 15, feedbackOptions.f390576m, i);
        C143947c.m234106y(parcel, 16, feedbackOptions.f390577n);
        C143947c.m234084c(parcel, 17, feedbackOptions.f390578o);
        C143947c.m234090i(parcel, 18, feedbackOptions.f390579p);
        C143947c.m234084c(parcel, 19, feedbackOptions.f390580q);
        C143947c.m234083b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int h = C143946b.m234059h(parcel);
        String str = null;
        Bundle bundle = null;
        String str2 = null;
        ApplicationErrorReport applicationErrorReport = null;
        String str3 = null;
        BitmapTeleporter bitmapTeleporter = null;
        String str4 = null;
        ArrayList arrayList = null;
        ThemeSettings themeSettings = null;
        LogOptions logOptions = null;
        Bitmap bitmap = null;
        String str5 = null;
        long j = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = C143946b.m234069r(parcel2, readInt);
                    break;
                case 3:
                    bundle = C143946b.m234061j(parcel2, readInt);
                    break;
                case 5:
                    str2 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 6:
                    applicationErrorReport = (ApplicationErrorReport) C143946b.m234063l(parcel2, readInt, ApplicationErrorReport.CREATOR);
                    break;
                case 7:
                    str3 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 8:
                    bitmapTeleporter = (BitmapTeleporter) C143946b.m234063l(parcel2, readInt, BitmapTeleporter.CREATOR);
                    break;
                case 9:
                    str4 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 10:
                    arrayList = C143946b.m234073v(parcel2, readInt, FileTeleporter.CREATOR);
                    break;
                case 11:
                    z = C143946b.m234077z(parcel2, readInt);
                    break;
                case 12:
                    themeSettings = (ThemeSettings) C143946b.m234063l(parcel2, readInt, ThemeSettings.CREATOR);
                    break;
                case 13:
                    logOptions = (LogOptions) C143946b.m234063l(parcel2, readInt, LogOptions.CREATOR);
                    break;
                case 14:
                    z2 = C143946b.m234077z(parcel2, readInt);
                    break;
                case 15:
                    bitmap = (Bitmap) C143946b.m234063l(parcel2, readInt, Bitmap.CREATOR);
                    break;
                case 16:
                    str5 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 17:
                    z3 = C143946b.m234077z(parcel2, readInt);
                    break;
                case 18:
                    j = C143946b.m234060i(parcel2, readInt);
                    break;
                case 19:
                    z4 = C143946b.m234077z(parcel2, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel2, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel2, h);
        return new FeedbackOptions(str, bundle, str2, applicationErrorReport, str3, bitmapTeleporter, str4, arrayList, z, themeSettings, logOptions, z2, bitmap, str5, z3, j, z4);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new FeedbackOptions[i];
    }
}
