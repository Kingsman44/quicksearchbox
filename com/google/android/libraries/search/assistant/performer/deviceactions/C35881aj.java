package com.google.android.libraries.search.assistant.performer.deviceactions;

import com.google.android.libraries.search.assistant.p2585i.C33480d;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.C35817af;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.C35818ag;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.C35823al;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.C35845bg;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2752c.C35934c;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2752c.C35935d;
import com.google.android.libraries.search.assistant.performer.p2728a.C35471g;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.android.libraries.search.assistant.performer.p2767j.C36183e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52097fc;
import com.google.assistant.p3897e.p3921j.C52098fd;
import com.google.assistant.p3897e.p3921j.C52107fm;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.aj */
/* compiled from: PG */
public final class C35881aj implements C35472h {

    /* renamed from: a */
    public static final C59071e f93999a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.deviceactions.aj");

    /* renamed from: b */
    public static final C33480d f94000b = C33480d.m62053a("get_device_settings_args", "assistant.api.client_op.GetDeviceSettingsArgs", C52097fc.f136720f);

    /* renamed from: c */
    public static final C33480d f94001c = C33480d.m62053a("get_device_settings_result", "assistant.api.client_op.GetDeviceSettingsResult", C52107fm.f136742d);

    /* renamed from: d */
    public final C35817af f94002d;

    /* renamed from: e */
    public final Map f94003e;

    /* renamed from: f */
    public final C35934c f94004f;

    /* renamed from: g */
    private final C35823al f94005g;

    /* renamed from: h */
    private final C60887da f94006h;

    public C35881aj(C35823al alVar, C35817af afVar, C35935d dVar, C60887da daVar, Map map) {
        this.f94005g = alVar;
        this.f94002d = afVar;
        this.f94004f = dVar.mo39899a("device.GET_SETTINGS");
        this.f94006h = daVar;
        this.f94003e = map;
    }

    /* renamed from: a */
    public final C60870cx mo20766a(C51809dy dyVar) {
        String str;
        C60870cx cxVar;
        ((C59052c) ((C59052c) f93999a.mo56224b()).mo56372aa(51820)).mo56386p("Enter TNG GetSettingsPerformer.");
        if (dyVar.f135936b.equals("device.GET_SETTINGS")) {
            C52097fc fcVar = (C52097fc) C36183e.m64584b(dyVar, "get_device_settings_args", C52097fc.f136720f.getParserForType());
            if (!fcVar.f136724c.isEmpty()) {
                str = C35845bg.m64244d(fcVar.f136724c);
            } else if (!Collections.unmodifiableMap(fcVar.f136725d).isEmpty()) {
                str = C35845bg.m64245e(Collections.unmodifiableMap(fcVar.f136725d));
            } else if (!Collections.unmodifiableMap(fcVar.f136726e).isEmpty()) {
                str = C35845bg.m64245e(Collections.unmodifiableMap(fcVar.f136726e));
            } else {
                str = !fcVar.f136723b.isEmpty() ? C35845bg.m64244d(fcVar.f136723b) : "SETTING_UNSPECIFIED";
            }
            this.f94004f.mo39898f(str, C62722b.OK);
            C52098fd fdVar = (C52098fd) C52107fm.f136742d.createBuilder();
            C58480gp e = C58485gu.m89837e();
            e.mo55396h(fcVar.f136724c);
            HashSet hashSet = new HashSet(fcVar.f136724c);
            for (String str2 : Collections.unmodifiableMap(fcVar.f136725d).keySet()) {
                if (hashSet.add(str2)) {
                    e.mo55395g(str2);
                }
            }
            for (String str3 : Collections.unmodifiableMap(fcVar.f136726e).keySet()) {
                if (hashSet.add(str3)) {
                    e.mo55395g(str3);
                }
            }
            C58485gu f = e.mo55394f();
            if (!f.isEmpty() || !fcVar.f136723b.isEmpty()) {
                Map unmodifiableMap = Collections.unmodifiableMap(fcVar.f136725d);
                if (unmodifiableMap.isEmpty()) {
                    ((C59052c) ((C59052c) C35823al.f93863a.mo56226d()).mo56372aa(51942)).mo56386p("SliceSettingMap is empty.");
                    ((C59052c) ((C59052c) f93999a.mo56224b()).mo56372aa(51819)).mo56386p("Settings are not supported by Slice API.");
                    cxVar = C60856cj.m92900i(f);
                } else {
                    cxVar = C35845bg.m64243c(f, new C35818ag(this.f94005g, unmodifiableMap, fdVar));
                }
                return C47633f.m84733g(cxVar).mo51516i(new C35878ag(this, fcVar, fdVar), this.f94006h).mo51515h(new C35879ah(this, fdVar), this.f94006h).mo51515h(new C35880ai(this, fdVar, str), this.f94006h);
            }
            ((C59052c) ((C59052c) f93999a.mo56226d()).mo56372aa(51813)).mo56386p("SettingId is not provided.");
            this.f94004f.mo39895c(str, C62722b.NOT_FOUND);
            return C60856cj.m92900i(C36180b.m64579c(C52235kf.NOT_FOUND, "SettingId is not provided."));
        }
        throw new C35471g(String.format("ClientOp name is incorrect. Expected %1$s but instead got %2$s", new Object[]{"device.GET_SETTINGS", dyVar.f135936b}));
    }
}
