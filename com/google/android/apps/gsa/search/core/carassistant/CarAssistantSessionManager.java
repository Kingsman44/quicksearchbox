package com.google.android.apps.gsa.search.core.carassistant;

import android.os.Parcelable;
import android.service.notification.StatusBarNotification;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87726bh;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.HotwordDetectedEventData;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4552o.C59687cb;
import com.google.common.p4552o.amo;
import com.google.protobuf.C63088z;

/* compiled from: PG */
public interface CarAssistantSessionManager extends C90991b {

    /* compiled from: PG */
    public abstract class CarAssistantSessionRequest implements Parcelable {
        /* renamed from: p */
        public static C85730h m137613p() {
            C85682a aVar = new C85682a();
            aVar.mo79307b(false);
            aVar.f231697g = (byte) (aVar.f231697g | 28);
            aVar.mo79309d(C58485gu.m89845m());
            aVar.mo79308c(C58485gu.m89845m());
            aVar.f231695e = BuildConfig.FLAVOR;
            C63088z zVar = C63088z.f170246b;
            if (zVar != null) {
                aVar.f231696f = zVar;
                aVar.f231697g = (byte) (aVar.f231697g | 1);
                return aVar;
            }
            throw new NullPointerException("Null clientInputData");
        }

        /* renamed from: q */
        public static C85730h m137614q(Query query) {
            C85730h p = m137613p();
            C85682a aVar = (C85682a) p;
            aVar.f231698h = 1;
            aVar.f231691a = query;
            return p;
        }

        /* renamed from: r */
        public static C85730h m137615r(C58485gu guVar, C58485gu guVar2, int i) {
            C85730h p = m137613p();
            ((C85682a) p).f231698h = i;
            p.mo79309d(guVar);
            p.mo79308c(guVar2);
            return p;
        }

        /* renamed from: a */
        public abstract long mo79254a();

        /* renamed from: b */
        public abstract Query mo79255b();

        /* renamed from: c */
        public abstract HotwordDetectedEventData mo79256c();

        /* renamed from: d */
        public abstract C58485gu mo79257d();

        /* renamed from: e */
        public abstract C58485gu mo79258e();

        /* renamed from: f */
        public abstract C63088z mo79260f();

        /* renamed from: g */
        public abstract String mo79261g();

        /* renamed from: h */
        public abstract String mo79262h();

        /* renamed from: i */
        public abstract String mo79264i();

        /* renamed from: j */
        public abstract String mo79265j();

        /* renamed from: k */
        public abstract boolean mo79266k();

        /* renamed from: l */
        public abstract boolean mo79267l();

        /* renamed from: m */
        public abstract boolean mo79268m();

        /* renamed from: n */
        public abstract boolean mo79269n();

        /* renamed from: o */
        public abstract int mo79270o();
    }

    /* compiled from: PG */
    public abstract class Config implements Parcelable {
        /* renamed from: a */
        public abstract int mo79272a();

        /* renamed from: b */
        public abstract long mo79273b();

        /* renamed from: c */
        public abstract long mo79274c();

        /* renamed from: d */
        public abstract long mo79275d();

        /* renamed from: e */
        public abstract StatusBarNotification mo79276e();

        /* renamed from: f */
        public abstract HotwordDetectedEventData mo79278f();

        /* renamed from: g */
        public abstract amo mo79279g();

        /* renamed from: h */
        public abstract String mo79280h();

        /* renamed from: i */
        public abstract String mo79282i();

        /* renamed from: j */
        public abstract String mo79283j();

        /* renamed from: k */
        public abstract String mo79284k();

        /* renamed from: l */
        public abstract String mo79285l();

        /* renamed from: m */
        public abstract String mo79286m();

        /* renamed from: n */
        public abstract String mo79287n();

        /* renamed from: o */
        public abstract String mo79288o();

        /* renamed from: p */
        public abstract String mo79289p();

        /* renamed from: q */
        public abstract boolean mo79290q();

        /* renamed from: r */
        public abstract boolean mo79291r();

        /* renamed from: s */
        public abstract boolean mo79292s();

        /* renamed from: t */
        public abstract boolean mo79293t();
    }

    /* renamed from: a */
    C87726bh mo79299a();

    /* renamed from: b */
    C59687cb mo79300b();

    /* renamed from: c */
    void mo79301c();

    /* renamed from: e */
    void mo79302e();

    /* renamed from: f */
    void mo79303f();

    /* renamed from: g */
    void mo79304g(ServiceEventData serviceEventData);

    /* renamed from: h */
    void mo79305h(C85729g gVar);
}
