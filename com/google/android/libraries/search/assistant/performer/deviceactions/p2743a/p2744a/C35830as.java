package com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2752c.C35934c;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2752c.C35935d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60904dr;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.a.a.as */
/* compiled from: PG */
public final class C35830as {

    /* renamed from: a */
    public static final C59071e f93893a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.deviceactions.a.a.as");

    /* renamed from: b */
    public final C35842bd f93894b;

    /* renamed from: c */
    public final C35866w f93895c;

    /* renamed from: d */
    public final ScheduledExecutorService f93896d;

    /* renamed from: e */
    public final int[] f93897e = {1};

    /* renamed from: f */
    public final C35934c f93898f;

    /* renamed from: g */
    private final Executor f93899g;

    public C35830as(C35866w wVar, C35842bd bdVar, C35935d dVar, C60887da daVar, ScheduledExecutorService scheduledExecutorService) {
        this.f93895c = wVar;
        this.f93894b = bdVar;
        this.f93898f = dVar.mo39899a("device.MODIFY_SETTING");
        this.f93899g = new C60904dr(daVar);
        this.f93896d = scheduledExecutorService;
    }

    /* renamed from: a */
    public final C60870cx mo39858a(C35841bc bcVar, int[] iArr) {
        C60870cx cxVar;
        if (iArr[0] <= 5) {
            if (TextUtils.isEmpty(bcVar.f93922c)) {
                ((C59052c) ((C59052c) C35841bc.f93920a.mo56226d()).mo56372aa(51967)).mo56386p("SettingUri is empty");
                cxVar = C60856cj.m92900i(false);
            } else {
                bcVar.f93924e = Uri.parse(bcVar.f93922c);
                if (bcVar.f93924e == null) {
                    ((C59052c) ((C59052c) C35841bc.f93920a.mo56226d()).mo56372aa(51966)).mo56386p("Cannot get sliceUri from SettingUri");
                    cxVar = C60856cj.m92900i(false);
                } else {
                    C35837az azVar = new C35837az(bcVar);
                    cxVar = C60856cj.m92904m(C47810es.m84978r(azVar), bcVar.f93923d);
                }
            }
            C35827ap apVar = new C35827ap(this, bcVar, iArr);
            return C60922j.m93045h(cxVar, C47810es.m84966f(apVar), this.f93899g);
        }
        ((C59052c) ((C59052c) f93893a.mo56226d()).mo56372aa(51951)).mo56386p("Failed to fully load the slice.");
        return C60856cj.m92900i(false);
    }
}
