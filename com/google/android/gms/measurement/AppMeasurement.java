package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.measurement.internal.C145361ff;
import com.google.android.gms.measurement.internal.C145384gb;
import com.google.android.gms.measurement.internal.C145417hh;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Deprecated
/* compiled from: PG */
public class AppMeasurement {

    /* renamed from: a */
    private static volatile AppMeasurement f392199a;

    /* renamed from: b */
    private final C145219c f392200b;

    /* compiled from: PG */
    public class ConditionalUserProperty {
        public boolean mActive;
        public String mAppId;
        public long mCreationTimestamp;
        public String mExpiredEventName;
        public Bundle mExpiredEventParams;
        public String mName;
        public String mOrigin;
        public long mTimeToLive;
        public String mTimedOutEventName;
        public Bundle mTimedOutEventParams;
        public String mTriggerEventName;
        public long mTriggerTimeout;
        public String mTriggeredEventName;
        public Bundle mTriggeredEventParams;
        public long mTriggeredTimestamp;
        public Object mValue;

        public ConditionalUserProperty() {
        }

        public ConditionalUserProperty(Bundle bundle) {
            C143919bh.m233958a(bundle);
            this.mAppId = (String) C145384gb.m236288a(bundle, "app_id", String.class, (Object) null);
            this.mOrigin = (String) C145384gb.m236288a(bundle, "origin", String.class, (Object) null);
            this.mName = (String) C145384gb.m236288a(bundle, "name", String.class, (Object) null);
            this.mValue = C145384gb.m236288a(bundle, "value", Object.class, (Object) null);
            this.mTriggerEventName = (String) C145384gb.m236288a(bundle, "trigger_event_name", String.class, (Object) null);
            this.mTriggerTimeout = ((Long) C145384gb.m236288a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) C145384gb.m236288a(bundle, "timed_out_event_name", String.class, (Object) null);
            this.mTimedOutEventParams = (Bundle) C145384gb.m236288a(bundle, "timed_out_event_params", Bundle.class, (Object) null);
            this.mTriggeredEventName = (String) C145384gb.m236288a(bundle, "triggered_event_name", String.class, (Object) null);
            this.mTriggeredEventParams = (Bundle) C145384gb.m236288a(bundle, "triggered_event_params", Bundle.class, (Object) null);
            this.mTimeToLive = ((Long) C145384gb.m236288a(bundle, "time_to_live", Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) C145384gb.m236288a(bundle, "expired_event_name", String.class, (Object) null);
            this.mExpiredEventParams = (Bundle) C145384gb.m236288a(bundle, "expired_event_params", Bundle.class, (Object) null);
            this.mActive = ((Boolean) C145384gb.m236288a(bundle, "active", Boolean.class, false)).booleanValue();
            this.mCreationTimestamp = ((Long) C145384gb.m236288a(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) C145384gb.m236288a(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        }
    }

    public AppMeasurement(C145361ff ffVar) {
        this.f392200b = new C145121a(ffVar);
    }

    public AppMeasurement(C145417hh hhVar) {
        this.f392200b = new C145218b(hhVar);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.measurement.AppMeasurement getInstance(android.content.Context r14) {
        /*
            com.google.android.gms.measurement.AppMeasurement r0 = f392199a
            if (r0 != 0) goto L_0x005e
            java.lang.Class<com.google.android.gms.measurement.AppMeasurement> r0 = com.google.android.gms.measurement.AppMeasurement.class
            monitor-enter(r0)
            com.google.android.gms.measurement.AppMeasurement r1 = f392199a     // Catch:{ all -> 0x005b }
            if (r1 != 0) goto L_0x0059
            r1 = 0
            java.lang.String r2 = "com.google.firebase.analytics.FirebaseAnalytics"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException -> 0x0032 }
            r3 = 2
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{  }
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r6 = 0
            r4[r6] = r5     // Catch:{  }
            java.lang.Class<android.os.Bundle> r5 = android.os.Bundle.class
            r7 = 1
            r4[r7] = r5     // Catch:{  }
            java.lang.String r5 = "getScionFrontendApiImplementation"
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r5, r4)     // Catch:{  }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{  }
            r3[r6] = r14     // Catch:{  }
            r3[r7] = r1     // Catch:{  }
            java.lang.Object r2 = r2.invoke(r1, r3)     // Catch:{  }
            com.google.android.gms.measurement.internal.hh r2 = (com.google.android.gms.measurement.internal.C145417hh) r2     // Catch:{  }
            goto L_0x0034
        L_0x0032:
            r2 = r1
        L_0x0034:
            if (r2 == 0) goto L_0x003e
            com.google.android.gms.measurement.AppMeasurement r14 = new com.google.android.gms.measurement.AppMeasurement     // Catch:{ all -> 0x005b }
            r14.<init>((com.google.android.gms.measurement.internal.C145417hh) r2)     // Catch:{ all -> 0x005b }
            f392199a = r14     // Catch:{ all -> 0x005b }
            goto L_0x0059
        L_0x003e:
            com.google.android.gms.measurement.api.internal.InitializationParams r13 = new com.google.android.gms.measurement.api.internal.InitializationParams     // Catch:{ all -> 0x005b }
            r3 = 0
            r5 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r2 = r13
            r2.<init>(r3, r5, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x005b }
            com.google.android.gms.measurement.internal.ff r14 = com.google.android.gms.measurement.internal.C145361ff.m236186i(r14, r13, r1)     // Catch:{ all -> 0x005b }
            com.google.android.gms.measurement.AppMeasurement r1 = new com.google.android.gms.measurement.AppMeasurement     // Catch:{ all -> 0x005b }
            r1.<init>((com.google.android.gms.measurement.internal.C145361ff) r14)     // Catch:{ all -> 0x005b }
            f392199a = r1     // Catch:{ all -> 0x005b }
        L_0x0059:
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            goto L_0x005e
        L_0x005b:
            r14 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            throw r14
        L_0x005e:
            com.google.android.gms.measurement.AppMeasurement r14 = f392199a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.AppMeasurement.getInstance(android.content.Context):com.google.android.gms.measurement.AppMeasurement");
    }

    public void beginAdUnitExposure(String str) {
        this.f392200b.mo57680i(str);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f392200b.mo57681j(str, str2, bundle);
    }

    public void endAdUnitExposure(String str) {
        this.f392200b.mo57682k(str);
    }

    public long generateEventId() {
        return this.f392200b.mo57673b();
    }

    public String getAppInstanceId() {
        return this.f392200b.mo57674c();
    }

    public List getConditionalUserProperties(String str, String str2) {
        int i;
        List<Bundle> g = this.f392200b.mo57678g(str, str2);
        if (g == null) {
            i = 0;
        } else {
            i = g.size();
        }
        ArrayList arrayList = new ArrayList(i);
        for (Bundle conditionalUserProperty : g) {
            arrayList.add(new ConditionalUserProperty(conditionalUserProperty));
        }
        return arrayList;
    }

    public String getCurrentScreenClass() {
        return this.f392200b.mo57675d();
    }

    public String getCurrentScreenName() {
        return this.f392200b.mo57676e();
    }

    public String getGmpAppId() {
        return this.f392200b.mo57677f();
    }

    public int getMaxUserProperties(String str) {
        return this.f392200b.mo57672a(str);
    }

    /* access modifiers changed from: protected */
    public Map getUserProperties(String str, String str2, boolean z) {
        return this.f392200b.mo57679h(str, str2, z);
    }

    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f392200b.mo57683l(str, str2, bundle);
    }

    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        C143919bh.m233958a(conditionalUserProperty);
        C145219c cVar = this.f392200b;
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            C145384gb.m236289b(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        cVar.mo57684m(bundle);
    }
}
