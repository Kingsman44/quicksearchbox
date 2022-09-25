package com.google.android.apps.gsa.search.shared.contact;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;

/* compiled from: PG */
public class PersonShortcut extends PersonShortcutKey implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C87536x();

    /* renamed from: a */
    public long f236398a;

    /* renamed from: b */
    public final long f236399b;

    /* renamed from: c */
    public final String f236400c;

    /* renamed from: d */
    public final String f236401d;

    public PersonShortcut(C87515c cVar, String str, String str2, long j, long j2, String str3, String str4) {
        super(cVar, str, str2);
        this.f236398a = j;
        this.f236399b = j2;
        this.f236400c = str3;
        this.f236401d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        PersonShortcut personShortcut = (PersonShortcut) obj;
        return this.f236399b == personShortcut.f236399b && this.f236398a == personShortcut.f236398a && TextUtils.equals(this.f236400c, personShortcut.f236400c) && TextUtils.equals(this.f236401d, personShortcut.f236401d);
    }

    public final int hashCode() {
        int hashCode = super.hashCode();
        long j = this.f236398a;
        long j2 = this.f236399b;
        int i = ((((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31;
        String str = this.f236400c;
        int i2 = 0;
        int hashCode2 = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f236401d;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        String str;
        String str2;
        String valueOf = String.valueOf(this.f236402e);
        String str3 = this.f236403f;
        String str4 = this.f236404g;
        String str5 = BuildConfig.FLAVOR;
        if (str4 == null) {
            str = str5;
        } else {
            str = " : ".concat(str4);
        }
        long j = this.f236399b;
        String str6 = this.f236400c;
        if (str6 == null) {
            str2 = str5;
        } else {
            str2 = " : ".concat(str6);
        }
        String str7 = this.f236401d;
        if (str7 != null) {
            str5 = " : ".concat(str7);
        }
        return "PersonShortcut : " + valueOf + " : " + str3 + str + " => " + j + str2 + str5;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeLong(this.f236398a);
        parcel.writeLong(this.f236399b);
        parcel.writeString(this.f236400c);
        parcel.writeString(this.f236401d);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PersonShortcut(com.google.android.apps.gsa.search.shared.contact.PersonShortcutKey r11, long r12, long r14, java.lang.String r16, java.lang.String r17) {
        /*
            r10 = this;
            r0 = r11
            com.google.android.apps.gsa.search.shared.contact.c r1 = r0.f236402e
            java.lang.String r2 = r0.f236403f
            java.lang.String r3 = r0.f236404g
            r0 = r10
            r4 = r12
            r6 = r14
            r8 = r16
            r9 = r17
            r0.<init>(r1, r2, r3, r4, r6, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.shared.contact.PersonShortcut.<init>(com.google.android.apps.gsa.search.shared.contact.PersonShortcutKey, long, long, java.lang.String, java.lang.String):void");
    }
}
