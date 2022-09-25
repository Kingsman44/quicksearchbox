package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.appdatasearch.af */
/* compiled from: PG */
public final class C142790af implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int h = C143946b.m234059h(parcel);
        String str = "0";
        String str2 = null;
        Uri uri = null;
        RegisterSectionInfo[] registerSectionInfoArr = null;
        GlobalSearchCorpusConfig globalSearchCorpusConfig = null;
        Account account = null;
        RegisterCorpusIMEInfo registerCorpusIMEInfo = null;
        String str3 = null;
        boolean z = true;
        boolean z2 = false;
        int i = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str2 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 2:
                    str = C143946b.m234069r(parcel2, readInt);
                    break;
                case 3:
                    uri = (Uri) C143946b.m234063l(parcel2, readInt, Uri.CREATOR);
                    break;
                case 4:
                    registerSectionInfoArr = (RegisterSectionInfo[]) C143946b.m234047D(parcel2, readInt, RegisterSectionInfo.CREATOR);
                    break;
                case 7:
                    globalSearchCorpusConfig = (GlobalSearchCorpusConfig) C143946b.m234063l(parcel2, readInt, GlobalSearchCorpusConfig.CREATOR);
                    break;
                case 8:
                    z = C143946b.m234077z(parcel2, readInt);
                    break;
                case 9:
                    account = (Account) C143946b.m234063l(parcel2, readInt, Account.CREATOR);
                    break;
                case 10:
                    registerCorpusIMEInfo = (RegisterCorpusIMEInfo) C143946b.m234063l(parcel2, readInt, RegisterCorpusIMEInfo.CREATOR);
                    break;
                case 11:
                    str3 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 12:
                    z2 = C143946b.m234077z(parcel2, readInt);
                    break;
                case 13:
                    i = C143946b.m234057f(parcel2, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel2, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel2, h);
        return new RegisterCorpusInfo(str2, str, uri, registerSectionInfoArr, globalSearchCorpusConfig, z, account, registerCorpusIMEInfo, str3, z2, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new RegisterCorpusInfo[i];
    }
}
