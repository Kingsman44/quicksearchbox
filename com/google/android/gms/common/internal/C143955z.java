package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* renamed from: com.google.android.gms.common.internal.z */
/* compiled from: PG */
public final class C143955z implements Parcelable.Creator {
    /* renamed from: a */
    static void m234123a(GetServiceRequest getServiceRequest, Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, getServiceRequest.f390014c);
        C143947c.m234089h(parcel, 2, getServiceRequest.f390015d);
        C143947c.m234089h(parcel, 3, getServiceRequest.f390016e);
        C143947c.m234106y(parcel, 4, getServiceRequest.f390017f);
        C143947c.m234098q(parcel, 5, getServiceRequest.f390018g);
        C143947c.m234079B(parcel, 6, getServiceRequest.f390019h, i);
        C143947c.m234093l(parcel, 7, getServiceRequest.f390020i);
        C143947c.m234105x(parcel, 8, getServiceRequest.f390021j, i);
        C143947c.m234079B(parcel, 10, getServiceRequest.f390022k, i);
        C143947c.m234079B(parcel, 11, getServiceRequest.f390023l, i);
        C143947c.m234084c(parcel, 12, getServiceRequest.f390024m);
        C143947c.m234089h(parcel, 13, getServiceRequest.f390025n);
        C143947c.m234084c(parcel, 14, getServiceRequest.f390026o);
        C143947c.m234106y(parcel, 15, getServiceRequest.f390027p);
        C143947c.m234083b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int h = C143946b.m234059h(parcel);
        Scope[] scopeArr = GetServiceRequest.f390012a;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.f390013b;
        Feature[] featureArr2 = featureArr;
        String str = null;
        IBinder iBinder = null;
        Account account = null;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = C143946b.m234057f(parcel2, readInt);
                    break;
                case 2:
                    i2 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 3:
                    i3 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 4:
                    str = C143946b.m234069r(parcel2, readInt);
                    break;
                case 5:
                    iBinder = C143946b.m234062k(parcel2, readInt);
                    break;
                case 6:
                    scopeArr = (Scope[]) C143946b.m234047D(parcel2, readInt, Scope.CREATOR);
                    break;
                case 7:
                    bundle = C143946b.m234061j(parcel2, readInt);
                    break;
                case 8:
                    account = (Account) C143946b.m234063l(parcel2, readInt, Account.CREATOR);
                    break;
                case 10:
                    featureArr = (Feature[]) C143946b.m234047D(parcel2, readInt, Feature.CREATOR);
                    break;
                case 11:
                    featureArr2 = (Feature[]) C143946b.m234047D(parcel2, readInt, Feature.CREATOR);
                    break;
                case 12:
                    z = C143946b.m234077z(parcel2, readInt);
                    break;
                case 13:
                    i4 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 14:
                    z2 = C143946b.m234077z(parcel2, readInt);
                    break;
                case 15:
                    str2 = C143946b.m234069r(parcel2, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel2, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel2, h);
        return new GetServiceRequest(i, i2, i3, str, iBinder, scopeArr, bundle, account, featureArr, featureArr2, z, i4, z2, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GetServiceRequest[i];
    }
}
