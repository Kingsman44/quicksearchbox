package com.google.android.gms.mobiledataplan.consent;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* renamed from: com.google.android.gms.mobiledataplan.consent.a */
/* compiled from: PG */
public final class C145520a implements Parcelable.Creator {
    /* renamed from: a */
    public static void m236590a(ConsentAgreementText consentAgreementText, Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 1, consentAgreementText.f393538a, i);
        C143947c.m234079B(parcel, 2, consentAgreementText.f393539b, i);
        C143947c.m234079B(parcel, 3, consentAgreementText.f393540c, i);
        C143947c.m234106y(parcel, 4, consentAgreementText.f393541d);
        C143947c.m234106y(parcel, 5, consentAgreementText.f393542e);
        C143947c.m234106y(parcel, 6, consentAgreementText.f393543f);
        C143947c.m234089h(parcel, 7, consentAgreementText.f393544g);
        C143947c.m234106y(parcel, 8, consentAgreementText.f393545h);
        C143947c.m234083b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        SafeHtml safeHtml = null;
        SafeHtml[] safeHtmlArr = null;
        SafeHtml[] safeHtmlArr2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    safeHtml = (SafeHtml) C143946b.m234063l(parcel, readInt, SafeHtml.CREATOR);
                    break;
                case 2:
                    safeHtmlArr = (SafeHtml[]) C143946b.m234047D(parcel, readInt, SafeHtml.CREATOR);
                    break;
                case 3:
                    safeHtmlArr2 = (SafeHtml[]) C143946b.m234047D(parcel, readInt, SafeHtml.CREATOR);
                    break;
                case 4:
                    str = C143946b.m234069r(parcel, readInt);
                    break;
                case 5:
                    str2 = C143946b.m234069r(parcel, readInt);
                    break;
                case 6:
                    str3 = C143946b.m234069r(parcel, readInt);
                    break;
                case 7:
                    i = C143946b.m234057f(parcel, readInt);
                    break;
                case 8:
                    str4 = C143946b.m234069r(parcel, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel, h);
        return new ConsentAgreementText(safeHtml, safeHtmlArr, safeHtmlArr2, str, str2, str3, i, str4);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ConsentAgreementText[i];
    }
}
