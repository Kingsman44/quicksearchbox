package com.google.android.apps.gsa.sidekick.main.trigger;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.util.p7171i.C91042a;
import com.google.common.p4522b.C58485gu;
import com.google.p375ai.p378b.C7805kp;
import com.google.p375ai.p378b.C8174yg;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
public final class TriggerConditionEvaluator {

    /* renamed from: a */
    public final C91626c f255551a;

    /* renamed from: b */
    public final Location f255552b;

    /* renamed from: c */
    public final long f255553c;

    /* renamed from: d */
    public final APriori f255554d;

    /* compiled from: PG */
    public class APriori implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C91624a();

        /* renamed from: a */
        public final C58485gu f255555a;

        public APriori() {
            this((List) C58485gu.m89845m());
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeStringList(this.f255555a);
        }

        public APriori(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.f255555a = C58485gu.m89842j(arrayList);
        }

        public APriori(List list) {
            this.f255555a = C58485gu.m89842j(list);
        }
    }

    public TriggerConditionEvaluator(Location location, long j, APriori aPriori) {
        this.f255551a = new C91626c(location);
        this.f255552b = location;
        this.f255553c = j;
        this.f255554d = aPriori;
    }

    /* renamed from: b */
    public final void mo86004b(long j) {
        if (j > 0) {
            C91626c cVar = this.f255551a;
            Long l = cVar.f255562b;
            if (l != null) {
                j = Math.min(l.longValue(), j);
            }
            cVar.f255562b = Long.valueOf(j);
        }
    }

    /* renamed from: c */
    public final boolean mo86005c(C8174yg ygVar, C7805kp kpVar, boolean z) {
        Location location = new Location(BuildConfig.FLAVOR);
        location.setLatitude(kpVar.f27287b);
        location.setLongitude(kpVar.f27288c);
        Location location2 = this.f255552b;
        location2.getClass();
        float distanceTo = location2.distanceTo(location) - ((float) kpVar.f27291f);
        boolean z2 = false;
        boolean z3 = distanceTo <= 0.0f;
        if (z || z3) {
            z2 = true;
        }
        if (!z3) {
            C91626c cVar = this.f255551a;
            Float f = cVar.f255563c;
            if (f == null) {
                cVar.f255563c = Float.valueOf(distanceTo);
            } else {
                cVar.f255563c = Float.valueOf(Math.min(f.floatValue(), distanceTo));
            }
            if (ygVar != null) {
                this.f255551a.f255565e.add(new C91625b(ygVar, kpVar, distanceTo));
            }
        }
        return z2;
    }

    /* renamed from: a */
    public static String m149891a(C7805kp kpVar) {
        String str;
        int i = kpVar.f27286a;
        if ((i & 4) != 0) {
            str = kpVar.f27289d;
        } else if ((i & 128) != 0) {
            str = Long.toString(kpVar.f27292g);
        } else {
            str = String.format(Locale.US, "%.4f,%.4f", new Object[]{Double.valueOf(kpVar.f27287b), Double.valueOf(kpVar.f27288c)});
        }
        long b = C91042a.m148718b(str);
        if (str.length() > 16) {
            str = str.substring(0, 16);
        }
        String l = Long.toString(b);
        return l + ":" + str;
    }
}
