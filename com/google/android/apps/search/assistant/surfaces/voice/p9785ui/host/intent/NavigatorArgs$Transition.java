package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.intent;

import android.os.Parcel;
import android.os.Parcelable;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.host.intent.NavigatorArgs$Transition */
/* compiled from: PG */
public final class NavigatorArgs$Transition {

    /* renamed from: a */
    public final C129675m f355867a;

    /* renamed from: b */
    public final C129668f f355868b;

    /* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.host.intent.NavigatorArgs$Transition$Data */
    /* compiled from: PG */
    public interface Data extends Parcelable {

        /* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.host.intent.NavigatorArgs$Transition$Data$NoData */
        /* compiled from: PG */
        public final class NoData implements Data {
            public static final Parcelable.Creator CREATOR = new C129666d();

            /* renamed from: a */
            public static final NoData f355869a = new NoData();

            private NoData() {
            }

            public final int describeContents() {
                return 0;
            }

            public final void writeToParcel(Parcel parcel, int i) {
                C69664n.m101061g(parcel, "out");
                parcel.writeInt(1);
            }
        }

        /* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.host.intent.NavigatorArgs$Transition$Data$Seamless */
        /* compiled from: PG */
        public final class Seamless implements Data {
            public static final Parcelable.Creator CREATOR = new C129667e();

            /* renamed from: a */
            public final int f355870a;

            public Seamless(int i) {
                this.f355870a = i;
            }

            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Seamless) && this.f355870a == ((Seamless) obj).f355870a;
            }

            public final int hashCode() {
                return this.f355870a;
            }

            public final String toString() {
                int i = this.f355870a;
                return "Seamless(shelfHeight=" + i + ")";
            }

            public final void writeToParcel(Parcel parcel, int i) {
                C69664n.m101061g(parcel, "out");
                parcel.writeInt(this.f355870a);
            }
        }
    }

    public NavigatorArgs$Transition(C129675m mVar, C129668f fVar) {
        C69664n.m101061g(fVar, "type");
        this.f355867a = mVar;
        this.f355868b = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NavigatorArgs$Transition)) {
            return false;
        }
        NavigatorArgs$Transition navigatorArgs$Transition = (NavigatorArgs$Transition) obj;
        return C69664n.m101066l(this.f355867a, navigatorArgs$Transition.f355867a) && this.f355868b == navigatorArgs$Transition.f355868b;
    }

    public final int hashCode() {
        return (this.f355867a.hashCode() * 31) + this.f355868b.hashCode();
    }

    public final String toString() {
        C129675m mVar = this.f355867a;
        C129668f fVar = this.f355868b;
        return "Transition(source=" + mVar + ", type=" + fVar + ")";
    }
}
