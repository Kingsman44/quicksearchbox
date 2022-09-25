package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.p445a.C8850c;

/* compiled from: PG */
public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C143955z();

    /* renamed from: a */
    static final Scope[] f390012a = new Scope[0];

    /* renamed from: b */
    static final Feature[] f390013b = new Feature[0];

    /* renamed from: c */
    final int f390014c;

    /* renamed from: d */
    final int f390015d;

    /* renamed from: e */
    int f390016e;

    /* renamed from: f */
    String f390017f;

    /* renamed from: g */
    IBinder f390018g;

    /* renamed from: h */
    Scope[] f390019h;

    /* renamed from: i */
    Bundle f390020i;

    /* renamed from: j */
    Account f390021j;

    /* renamed from: k */
    Feature[] f390022k;

    /* renamed from: l */
    Feature[] f390023l;

    /* renamed from: m */
    boolean f390024m;

    /* renamed from: n */
    int f390025n;

    /* renamed from: o */
    boolean f390026o;

    /* renamed from: p */
    public String f390027p;

    public GetServiceRequest(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, Feature[] featureArr, Feature[] featureArr2, boolean z, int i4, boolean z2, String str2) {
        C143899ao aoVar;
        scopeArr = scopeArr == null ? f390012a : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        featureArr = featureArr == null ? f390013b : featureArr;
        featureArr2 = featureArr2 == null ? f390013b : featureArr2;
        this.f390014c = i;
        this.f390015d = i2;
        this.f390016e = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f390017f = "com.google.android.gms";
        } else {
            this.f390017f = str;
        }
        if (i < 2) {
            Account account2 = null;
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if (queryLocalInterface instanceof C143899ao) {
                    aoVar = (C143899ao) queryLocalInterface;
                } else {
                    aoVar = new C143899ao(iBinder);
                }
                if (aoVar != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        Parcel gT = aoVar.mo17261gT(2, aoVar.mo17260gA());
                        Account account3 = (Account) C8850c.m23492a(gT, Account.CREATOR);
                        gT.recycle();
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        account2 = account3;
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    } catch (Throwable th) {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        throw th;
                    }
                }
            }
            this.f390021j = account2;
        } else {
            this.f390018g = iBinder;
            this.f390021j = account;
        }
        this.f390019h = scopeArr;
        this.f390020i = bundle;
        this.f390022k = featureArr;
        this.f390023l = featureArr2;
        this.f390024m = z;
        this.f390025n = i4;
        this.f390026o = z2;
        this.f390027p = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C143955z.m234123a(this, parcel, i);
    }
}
