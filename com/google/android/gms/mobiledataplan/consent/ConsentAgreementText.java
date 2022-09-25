package com.google.android.gms.mobiledataplan.consent;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143910az;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
public final class ConsentAgreementText extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145520a();

    /* renamed from: a */
    public SafeHtml f393538a;

    /* renamed from: b */
    public SafeHtml[] f393539b;

    /* renamed from: c */
    public SafeHtml[] f393540c;

    /* renamed from: d */
    public String f393541d;

    /* renamed from: e */
    public String f393542e;

    /* renamed from: f */
    public String f393543f;

    /* renamed from: g */
    public int f393544g;

    /* renamed from: h */
    public String f393545h;

    private ConsentAgreementText() {
    }

    public ConsentAgreementText(SafeHtml safeHtml, SafeHtml[] safeHtmlArr, SafeHtml[] safeHtmlArr2, String str, String str2, String str3, int i, String str4) {
        this.f393538a = safeHtml;
        this.f393539b = safeHtmlArr;
        this.f393540c = safeHtmlArr2;
        this.f393541d = str;
        this.f393542e = str2;
        this.f393543f = str3;
        this.f393544g = i;
        this.f393545h = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConsentAgreementText) {
            ConsentAgreementText consentAgreementText = (ConsentAgreementText) obj;
            return C143912ba.m233950b(this.f393538a, consentAgreementText.f393538a) && Arrays.equals(this.f393539b, consentAgreementText.f393539b) && Arrays.equals(this.f393540c, consentAgreementText.f393540c) && C143912ba.m233950b(this.f393541d, consentAgreementText.f393541d) && C143912ba.m233950b(this.f393542e, consentAgreementText.f393542e) && C143912ba.m233950b(this.f393543f, consentAgreementText.f393543f) && C143912ba.m233950b(Integer.valueOf(this.f393544g), Integer.valueOf(consentAgreementText.f393544g)) && C143912ba.m233950b(this.f393545h, consentAgreementText.f393545h);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f393538a, Integer.valueOf(Arrays.hashCode(this.f393539b)), Integer.valueOf(Arrays.hashCode(this.f393540c)), this.f393541d, this.f393542e, this.f393543f, Integer.valueOf(this.f393544g)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C143910az.m233947b("Title", this.f393538a, arrayList);
        C143910az.m233947b("DescriptionParagraphs", Arrays.toString(this.f393539b), arrayList);
        C143910az.m233947b("AdditionalInfoParagraphs", Arrays.toString(this.f393540c), arrayList);
        C143910az.m233947b("PositiveButtonCaption", this.f393541d, arrayList);
        C143910az.m233947b("NegativeButtonCaption", this.f393542e, arrayList);
        C143910az.m233947b("ContinueButtonCaption", this.f393543f, arrayList);
        C143910az.m233947b("Version", Integer.valueOf(this.f393544g), arrayList);
        C143910az.m233947b("TextId", this.f393545h, arrayList);
        return C143910az.m233946a(arrayList, this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C145520a.m236590a(this, parcel, i);
    }
}
