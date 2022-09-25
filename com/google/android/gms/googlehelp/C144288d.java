package com.google.android.gms.googlehelp;

import android.accounts.Account;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.internal.common.OverflowMenuItem;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.googlehelp.d */
/* compiled from: PG */
public final class C144288d implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int h = C143946b.m234059h(parcel);
        String str = null;
        Account account = null;
        Bundle bundle = null;
        String str2 = null;
        String str3 = null;
        Bitmap bitmap = null;
        ArrayList arrayList = null;
        Bundle bundle2 = null;
        Bitmap bitmap2 = null;
        byte[] bArr = null;
        String str4 = null;
        Uri uri = null;
        ArrayList arrayList2 = null;
        ThemeSettings themeSettings = null;
        ArrayList arrayList3 = null;
        ErrorReport errorReport = null;
        TogglingData togglingData = null;
        PendingIntent pendingIntent = null;
        String str5 = null;
        String str6 = null;
        ND4CSettings nD4CSettings = null;
        ArrayList arrayList4 = null;
        String str7 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z3 = false;
        int i5 = 0;
        int i6 = 0;
        boolean z4 = false;
        boolean z5 = false;
        int i7 = 0;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = C143946b.m234057f(parcel2, readInt);
                    break;
                case 2:
                    str = C143946b.m234069r(parcel2, readInt);
                    break;
                case 3:
                    account = (Account) C143946b.m234063l(parcel2, readInt, Account.CREATOR);
                    break;
                case 4:
                    bundle = C143946b.m234061j(parcel2, readInt);
                    break;
                case 5:
                    z = C143946b.m234077z(parcel2, readInt);
                    break;
                case 6:
                    z2 = C143946b.m234077z(parcel2, readInt);
                    break;
                case 7:
                    arrayList = C143946b.m234072u(parcel2, readInt);
                    break;
                case 10:
                    bundle2 = C143946b.m234061j(parcel2, readInt);
                    break;
                case 11:
                    bitmap2 = (Bitmap) C143946b.m234063l(parcel2, readInt, Bitmap.CREATOR);
                    break;
                case 14:
                    str4 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 15:
                    uri = (Uri) C143946b.m234063l(parcel2, readInt, Uri.CREATOR);
                    break;
                case 16:
                    arrayList2 = C143946b.m234073v(parcel2, readInt, OverflowMenuItem.CREATOR);
                    break;
                case 17:
                    i4 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 18:
                    arrayList3 = C143946b.m234073v(parcel2, readInt, OfflineSuggestion.CREATOR);
                    break;
                case 19:
                    bArr = C143946b.m234044A(parcel2, readInt);
                    break;
                case 20:
                    i2 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 21:
                    i3 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 22:
                    z3 = C143946b.m234077z(parcel2, readInt);
                    break;
                case 23:
                    errorReport = (ErrorReport) C143946b.m234063l(parcel2, readInt, ErrorReport.CREATOR);
                    break;
                case 25:
                    themeSettings = (ThemeSettings) C143946b.m234063l(parcel2, readInt, ThemeSettings.CREATOR);
                    break;
                case 28:
                    str2 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 31:
                    togglingData = (TogglingData) C143946b.m234063l(parcel2, readInt, TogglingData.CREATOR);
                    break;
                case ' ':
                    i5 = C143946b.m234057f(parcel2, readInt);
                    break;
                case '!':
                    pendingIntent = (PendingIntent) C143946b.m234063l(parcel2, readInt, PendingIntent.CREATOR);
                    break;
                case '\"':
                    str3 = C143946b.m234069r(parcel2, readInt);
                    break;
                case '#':
                    bitmap = (Bitmap) C143946b.m234063l(parcel2, readInt, Bitmap.CREATOR);
                    break;
                case '$':
                    i6 = C143946b.m234057f(parcel2, readInt);
                    break;
                case '%':
                    z4 = C143946b.m234077z(parcel2, readInt);
                    break;
                case '&':
                    z5 = C143946b.m234077z(parcel2, readInt);
                    break;
                case '\'':
                    i7 = C143946b.m234057f(parcel2, readInt);
                    break;
                case '(':
                    str5 = C143946b.m234069r(parcel2, readInt);
                    break;
                case ')':
                    z6 = C143946b.m234077z(parcel2, readInt);
                    break;
                case '*':
                    str6 = C143946b.m234069r(parcel2, readInt);
                    break;
                case '+':
                    z7 = C143946b.m234077z(parcel2, readInt);
                    break;
                case ',':
                    nD4CSettings = (ND4CSettings) C143946b.m234063l(parcel2, readInt, ND4CSettings.CREATOR);
                    break;
                case '-':
                    z8 = C143946b.m234077z(parcel2, readInt);
                    break;
                case '.':
                    arrayList4 = C143946b.m234073v(parcel2, readInt, FRDProductSpecificDataEntry.CREATOR);
                    break;
                case '/':
                    str7 = C143946b.m234069r(parcel2, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel2, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel2, h);
        return new GoogleHelp(i, str, account, bundle, str2, str3, bitmap, z, z2, arrayList, bundle2, bitmap2, bArr, i2, i3, str4, uri, arrayList2, i4, themeSettings, arrayList3, z3, errorReport, togglingData, i5, pendingIntent, i6, z4, z5, i7, str5, z6, str6, z7, nD4CSettings, z8, arrayList4, str7);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleHelp[i];
    }
}
