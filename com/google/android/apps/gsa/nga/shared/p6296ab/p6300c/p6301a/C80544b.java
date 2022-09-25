package com.google.android.apps.gsa.nga.shared.p6296ab.p6300c.p6301a;

import android.os.Parcel;
import com.google.android.apps.gsa.shared.proto.p7126io.LargeProtoParcelable;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.apps.gsa.nga.shared.ab.c.a.b */
/* compiled from: PG */
public abstract class C80544b extends C8849b implements C80545c {
    public C80544b() {
        super("com.google.android.apps.gsa.nga.shared.recognition.recording.aidl.IRemoteAudioRecordingCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        enforceNoDataAvail(parcel);
        mo74347e((LargeProtoParcelable) C8850c.m23492a(parcel, LargeProtoParcelable.CREATOR));
        return true;
    }
}
