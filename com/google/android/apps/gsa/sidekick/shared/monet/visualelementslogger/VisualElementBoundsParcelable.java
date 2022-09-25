package com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.p375ai.p378b.C7669fo;
import com.google.p375ai.p378b.C7973qv;
import com.google.p375ai.p378b.C8178yk;
import com.google.p4283bv.p4354e.p4356b.C57057b;

/* compiled from: PG */
public abstract class VisualElementBoundsParcelable implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C91875q();

    /* renamed from: a */
    public abstract Rect mo86361a();

    /* renamed from: b */
    public abstract C7669fo mo86362b();

    /* renamed from: c */
    public abstract C7973qv mo86363c();

    /* renamed from: d */
    public abstract C8178yk mo86364d();

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public abstract C57057b mo86365e();

    public final void writeToParcel(Parcel parcel, int i) {
        ProtoLiteParcelable.m147140k(mo86364d(), parcel);
        parcel.writeParcelable(mo86361a(), i);
        ProtoLiteParcelable.m147140k(mo86365e(), parcel);
        ProtoLiteParcelable.m147140k(mo86362b(), parcel);
        ProtoLiteParcelable.m147140k(mo86363c(), parcel);
    }

    /* renamed from: f */
    public static VisualElementBoundsParcelable m150498f(C8178yk ykVar, Rect rect, C57057b bVar, C7669fo foVar, C7973qv qvVar) {
        if (ykVar == null) {
            throw new NullPointerException("Null visualElementInfo");
        } else if (rect != null) {
            return new AutoValue_VisualElementBoundsParcelable(ykVar, rect, bVar, foVar, qvVar);
        } else {
            throw new NullPointerException("Null bounds");
        }
    }
}
