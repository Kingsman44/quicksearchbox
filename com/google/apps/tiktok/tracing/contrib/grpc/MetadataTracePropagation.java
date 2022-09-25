package com.google.apps.tiktok.tracing.contrib.grpc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.apps.tiktok.tracing.C47816ey;
import p5488io.grpc.C70297cz;
import p5488io.grpc.binder.C70230j;

/* compiled from: PG */
final class MetadataTracePropagation {

    /* renamed from: a */
    public static final C70297cz f123628a = C70230j.m102380b("trace-bin", TraceReferencingDummyParcelable.CREATOR);

    /* compiled from: PG */
    final class TraceReferencingDummyParcelable implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C47676a();

        /* renamed from: a */
        public final C47816ey f123629a;

        public TraceReferencingDummyParcelable() {
            this.f123629a = null;
        }

        public TraceReferencingDummyParcelable(C47816ey eyVar) {
            this.f123629a = eyVar;
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
        }
    }
}
