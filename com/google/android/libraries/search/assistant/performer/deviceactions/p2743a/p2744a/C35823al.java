package com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2752c.C35934c;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2752c.C35935d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60904dr;
import com.google.common.util.concurrent.C60922j;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p3186j$.util.Map;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.a.a.al */
/* compiled from: PG */
public final class C35823al {

    /* renamed from: a */
    public static final C59071e f93863a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.deviceactions.a.a.al");

    /* renamed from: f */
    private static final Integer f93864f = 0;

    /* renamed from: b */
    public final C35836ay f93865b;

    /* renamed from: c */
    public final ScheduledExecutorService f93866c;

    /* renamed from: d */
    public final Map f93867d = new HashMap();

    /* renamed from: e */
    public final C35934c f93868e;

    /* renamed from: g */
    private final Executor f93869g;

    public C35823al(C35836ay ayVar, C35935d dVar, C60887da daVar, ScheduledExecutorService scheduledExecutorService) {
        this.f93865b = ayVar;
        this.f93869g = new C60904dr(daVar);
        this.f93866c = scheduledExecutorService;
        this.f93868e = dVar.mo39899a("device.GET_SETTINGS");
    }

    /* renamed from: a */
    public final C60870cx mo39856a(C35835ax axVar, String str) {
        C60870cx cxVar;
        int intValue = ((Integer) Map.EL.getOrDefault(this.f93867d, str, f93864f)).intValue();
        if (intValue >= 5) {
            ((C59052c) ((C59052c) f93863a.mo56226d()).mo56372aa(51938)).mo56389s("Not loading slice for %s, reached max attempts.", str);
            return C60856cj.m92900i(false);
        }
        if (TextUtils.isEmpty(axVar.f93906c)) {
            C59104x d = C35835ax.f93904a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SettingSlicesReaderImpl");
            ((C59052c) ((C59052c) d).mo56372aa(51958)).mo56386p("SettingUri is empty");
            cxVar = C60856cj.m92900i(false);
        } else {
            axVar.f93908e = Uri.parse(axVar.f93906c);
            if (axVar.f93908e == null) {
                C59104x d2 = C35835ax.f93904a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "SettingSlicesReaderImpl");
                ((C59052c) ((C59052c) d2).mo56372aa(51957)).mo56386p("Cannot get sliceUri from SettingUri");
                cxVar = C60856cj.m92900i(false);
            } else {
                C35833av avVar = new C35833av(axVar);
                cxVar = C60856cj.m92904m(C47810es.m84978r(avVar), axVar.f93907d);
            }
        }
        C35820ai aiVar = new C35820ai(this, axVar, str, intValue);
        return C60922j.m93045h(cxVar, C47810es.m84966f(aiVar), this.f93869g);
    }
}
