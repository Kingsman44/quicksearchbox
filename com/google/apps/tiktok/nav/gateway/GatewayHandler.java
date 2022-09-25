package com.google.apps.tiktok.nav.gateway;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.p4522b.C58485gu;
import java.util.List;

/* compiled from: PG */
public interface GatewayHandler {

    /* compiled from: PG */
    public final class GatewayDestination implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C47504j();

        /* renamed from: a */
        public final int f123315a;

        /* renamed from: b */
        public final List f123316b;

        /* renamed from: c */
        private final String f123317c;

        public GatewayDestination(int i, List list, String str) {
            this.f123315a = i;
            this.f123316b = list;
            this.f123317c = str;
        }

        /* renamed from: a */
        public static GatewayDestination m84513a(String str) {
            return new GatewayDestination(4, C58485gu.m89845m(), str);
        }

        /* renamed from: b */
        public static GatewayDestination m84514b(Intent intent) {
            return new GatewayDestination(1, C58485gu.m89846n(intent), (String) null);
        }

        /* renamed from: c */
        public static GatewayDestination m84515c(List list) {
            return new GatewayDestination(1, list, (String) null);
        }

        /* renamed from: d */
        public static GatewayDestination m84516d(Intent intent) {
            return new GatewayDestination(2, C58485gu.m89846n(intent), (String) null);
        }

        /* renamed from: e */
        public static GatewayDestination m84517e() {
            return new GatewayDestination(3, (List) null, (String) null);
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f123315a);
            parcel.writeTypedList(this.f123316b);
            parcel.writeString(this.f123317c);
        }
    }

    /* renamed from: a */
    C47506l mo20007a(C47507m mVar);
}
