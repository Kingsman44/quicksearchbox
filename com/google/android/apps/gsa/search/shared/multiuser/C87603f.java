package com.google.android.apps.gsa.search.shared.multiuser;

import android.content.Intent;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.apps.gsa.shared.util.debug.FeedbackData;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.apps.gsa.search.shared.multiuser.f */
/* compiled from: PG */
public abstract class C87603f extends C8849b implements C87604g {
    public C87603f() {
        super("com.google.android.apps.gsa.search.shared.multiuser.IMultiUserDataSource");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        C87601d dVar = null;
        switch (i) {
            case 5:
                Intent intent = (Intent) C8850c.m23492a(parcel, Intent.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.gsa.search.shared.multiuser.IMultiUserDataCallback");
                    dVar = queryLocalInterface instanceof C87601d ? (C87601d) queryLocalInterface : new C87599b(readStrongBinder);
                }
                enforceNoDataAvail(parcel);
                mo81744j(intent, dVar);
                return true;
            case 6:
                Uri uri = (Uri) C8850c.m23492a(parcel, Uri.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.apps.gsa.search.shared.multiuser.IMultiUserDataCallback");
                    dVar = queryLocalInterface2 instanceof C87601d ? (C87601d) queryLocalInterface2 : new C87599b(readStrongBinder2);
                }
                enforceNoDataAvail(parcel);
                mo81741g(uri, dVar);
                return true;
            case 7:
                Uri uri2 = (Uri) C8850c.m23492a(parcel, Uri.CREATOR);
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.apps.gsa.search.shared.multiuser.IMultiUserDataCallback");
                    dVar = queryLocalInterface3 instanceof C87601d ? (C87601d) queryLocalInterface3 : new C87599b(readStrongBinder3);
                }
                enforceNoDataAvail(parcel);
                mo81740f(uri2, dVar);
                return true;
            case 8:
                Intent intent2 = (Intent) C8850c.m23492a(parcel, Intent.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.apps.gsa.search.shared.multiuser.IMultiUserDataCallback");
                    dVar = queryLocalInterface4 instanceof C87601d ? (C87601d) queryLocalInterface4 : new C87599b(readStrongBinder4);
                }
                enforceNoDataAvail(parcel);
                mo81742h(intent2, dVar);
                return true;
            case 9:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.apps.gsa.search.shared.multiuser.IMultiUserDataCallback");
                    dVar = queryLocalInterface5 instanceof C87601d ? (C87601d) queryLocalInterface5 : new C87599b(readStrongBinder5);
                }
                enforceNoDataAvail(parcel);
                mo81739e(dVar);
                return true;
            case 10:
                FeedbackData feedbackData = (FeedbackData) C8850c.m23492a(parcel, FeedbackData.CREATOR);
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.apps.gsa.search.shared.multiuser.IMultiUserDataCallback");
                    dVar = queryLocalInterface6 instanceof C87601d ? (C87601d) queryLocalInterface6 : new C87599b(readStrongBinder6);
                }
                enforceNoDataAvail(parcel);
                mo81743i(feedbackData, dVar);
                return true;
            default:
                return false;
        }
    }
}
