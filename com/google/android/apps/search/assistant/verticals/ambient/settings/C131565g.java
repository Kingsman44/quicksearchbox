package com.google.android.apps.search.assistant.verticals.ambient.settings;

import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import com.google.android.apps.gsa.assistant.settings.features.d.ak;
import com.google.assistant.p3886c.C50794cr;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4552o.ali;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.knowledge.p4671b.C61820m;
import com.google.knowledge.p4671b.C61826s;
import java.util.concurrent.Callable;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.settings.g */
/* compiled from: PG */
public final /* synthetic */ class C131565g implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C131567i f359456a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f359457b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f359458c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f359459d;

    /* renamed from: e */
    public final /* synthetic */ C60870cx f359460e;

    /* renamed from: f */
    public final /* synthetic */ C60870cx f359461f;

    public /* synthetic */ C131565g(C131567i iVar, C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3, C60870cx cxVar4, C60870cx cxVar5) {
        this.f359456a = iVar;
        this.f359457b = cxVar;
        this.f359458c = cxVar2;
        this.f359459d = cxVar3;
        this.f359460e = cxVar4;
        this.f359461f = cxVar5;
    }

    public final Object call() {
        C131567i iVar = this.f359456a;
        C60870cx cxVar = this.f359457b;
        C60870cx cxVar2 = this.f359458c;
        C60870cx cxVar3 = this.f359459d;
        C60870cx cxVar4 = this.f359460e;
        C60870cx cxVar5 = this.f359461f;
        ak akVar = (ak) C60856cj.m92909r(cxVar);
        boolean booleanValue = ((Boolean) C60856cj.m92909r(cxVar2)).booleanValue();
        boolean booleanValue2 = ((Boolean) C60856cj.m92909r(cxVar4)).booleanValue();
        boolean booleanValue3 = ((Boolean) C60856cj.m92909r(cxVar5)).booleanValue();
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(ali.UPCOMING_BUNDLE, C50794cr.CALENDAR);
        gzVar.mo55429h(ali.UPCOMING_FLIGHTS, C50794cr.FLIGHT);
        gzVar.mo55429h(ali.TRAFFIC_INFORMATION, C50794cr.COMMUTE_TIME);
        gzVar.mo55429h(ali.WEATHER_ALERT, C50794cr.WEATHER_ALERT);
        gzVar.mo55429h(ali.WEATHER, C50794cr.WEATHER);
        boolean z = false;
        C58480gp e = C58485gu.m89837e();
        e.mo55396h((C58485gu) Collection.EL.stream(gzVar.mo55427f(false).entrySet()).map(new C131559a(iVar, akVar)).collect(C58370cn.f155946a));
        e.mo55395g(C131567i.m213966a(ali.WORK_PROFILE, akVar.g));
        C61826s a = C61826s.m94481a(((C61820m) C60856cj.m92909r(cxVar3)).f167053w);
        if (a == null) {
            a = C61826s.OPA_OPT_IN_STATUS_UNKNOWN;
        }
        if (a == C61826s.OPA_OPT_IN_STATUS_ENABLED) {
            z = true;
        }
        e.mo55395g(C131567i.m213966a(ali.PROACTIVE_PERSONAL_RESULTS, z));
        e.mo55395g(C131567i.m213966a(ali.WEB_AND_APP_ACTIVITY, booleanValue2));
        e.mo55395g(C131567i.m213966a(ali.GOOGLE_LOCATION_HISTORY, booleanValue3));
        e.mo55395g(C131567i.m213966a(ali.ASSISTANT_PERSONAL_RESULTS, booleanValue));
        ali ali = ali.NOTIFICATION_READ;
        Context context = iVar.f359466c;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        notificationManager.getClass();
        e.mo55395g(C131567i.m213966a(ali, notificationManager.isNotificationListenerAccessGranted(new ComponentName(context, "com.google.android.apps.gsa.notificationlistener.GsaNotificationListenerService"))));
        return e.mo55394f();
    }
}
