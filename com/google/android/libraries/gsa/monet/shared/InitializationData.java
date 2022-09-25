package com.google.android.libraries.gsa.monet.shared;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
public final class InitializationData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C23121q();

    /* renamed from: a */
    public final C23129y f63418a;

    /* renamed from: b */
    public final ProtoParcelable f63419b;

    /* renamed from: c */
    public final Intent f63420c;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public InitializationData(android.os.Parcel r5) {
        /*
            r4 = this;
            com.google.android.libraries.gsa.monet.shared.y r0 = new com.google.android.libraries.gsa.monet.shared.y
            java.lang.String r1 = r5.readString()
            r1.getClass()
            r0.<init>(r1)
            java.lang.Class<com.google.android.libraries.gsa.monet.shared.InitializationData> r1 = com.google.android.libraries.gsa.monet.shared.InitializationData.class
            java.lang.ClassLoader r2 = r1.getClassLoader()
            android.os.Parcelable r2 = r5.readParcelable(r2)
            com.google.android.libraries.gsa.monet.shared.ProtoParcelable r2 = (com.google.android.libraries.gsa.monet.shared.ProtoParcelable) r2
            java.lang.ClassLoader r3 = r1.getClassLoader()
            android.os.Parcelable r5 = r5.readParcelable(r3)
            android.content.Intent r5 = (android.content.Intent) r5
            r4.<init>(r0, r2, r5)
            android.content.Intent r5 = r4.f63420c
            if (r5 == 0) goto L_0x0033
            java.lang.ClassLoader r0 = r1.getClassLoader()
            r0.getClass()
            r5.setExtrasClassLoader(r0)
        L_0x0033:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.gsa.monet.shared.InitializationData.<init>(android.os.Parcel):void");
    }

    public InitializationData(C23129y yVar, ProtoParcelable protoParcelable, Intent intent) {
        this.f63418a = yVar;
        this.f63419b = protoParcelable;
        this.f63420c = intent;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InitializationData)) {
            return false;
        }
        InitializationData initializationData = (InitializationData) obj;
        if (this.f63418a.equals(initializationData.f63418a) && this.f63419b.equals(initializationData.f63419b)) {
            Intent intent = this.f63420c;
            Intent intent2 = initializationData.f63420c;
            if (intent == intent2) {
                return true;
            }
            if (intent == null || !intent.equals(intent2)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f63418a, this.f63419b, this.f63420c});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f63418a.f63478c);
        parcel.writeParcelable(this.f63419b, i);
        parcel.writeParcelable(this.f63420c, i);
    }
}
