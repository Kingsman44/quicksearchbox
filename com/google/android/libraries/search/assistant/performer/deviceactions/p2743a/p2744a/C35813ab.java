package com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a;

import com.google.assistant.p3897e.p3921j.C52099fe;
import com.google.assistant.p3897e.p3921j.C52103fi;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.a.a.ab */
/* compiled from: PG */
public final /* synthetic */ class C35813ab implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f93826a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f93827b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f93828c;

    /* renamed from: d */
    public final /* synthetic */ C35862s f93829d;

    /* renamed from: e */
    public final /* synthetic */ C52099fe f93830e;

    /* renamed from: f */
    public final /* synthetic */ String f93831f;

    public /* synthetic */ C35813ab(C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3, C35862s sVar, C52099fe feVar, String str) {
        this.f93826a = cxVar;
        this.f93827b = cxVar2;
        this.f93828c = cxVar3;
        this.f93829d = sVar;
        this.f93830e = feVar;
        this.f93831f = str;
    }

    public final Object call() {
        C60870cx cxVar = this.f93826a;
        C60870cx cxVar2 = this.f93827b;
        C60870cx cxVar3 = this.f93828c;
        C35862s sVar = this.f93829d;
        C52099fe feVar = this.f93830e;
        String str = this.f93831f;
        try {
            Optional optional = (Optional) C60856cj.m92909r(cxVar);
            String str2 = (String) C60856cj.m92909r(cxVar2);
            Optional optional2 = (Optional) C60856cj.m92909r(cxVar3);
            if (!sVar.f93959g || !optional.isPresent()) {
                C59104x d = C35817af.f93839a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "GetSettingPhoneBuddy");
                ((C59052c) ((C59052c) d).mo56372aa(51928)).mo56389s("Setting shows not available in PhoneBuddy api, setting uri: %s", str);
                feVar.copyOnWrite();
                C52103fi fiVar = (C52103fi) feVar.instance;
                C52103fi fiVar2 = C52103fi.f136729i;
                fiVar.f136734d = 1;
                fiVar.f136731a |= 4;
                boolean z = sVar.f93959g;
                feVar.copyOnWrite();
                C52103fi fiVar3 = (C52103fi) feVar.instance;
                fiVar3.f136731a |= 2;
                fiVar3.f136733c = z;
            } else {
                String str3 = (String) optional.get();
                feVar.copyOnWrite();
                C52103fi fiVar4 = (C52103fi) feVar.instance;
                C52103fi fiVar5 = C52103fi.f136729i;
                str3.getClass();
                fiVar4.f136731a |= 1;
                fiVar4.f136732b = str3;
                feVar.copyOnWrite();
                C52103fi fiVar6 = (C52103fi) feVar.instance;
                fiVar6.f136734d = 3;
                fiVar6.f136731a |= 4;
                feVar.copyOnWrite();
                C52103fi fiVar7 = (C52103fi) feVar.instance;
                fiVar7.f136731a |= 2;
                fiVar7.f136733c = true;
            }
            if (str2.isEmpty()) {
                return optional2;
            }
            feVar.copyOnWrite();
            C52103fi fiVar8 = (C52103fi) feVar.instance;
            str2.getClass();
            fiVar8.f136731a |= 16;
            fiVar8.f136736f = str2;
            feVar.copyOnWrite();
            C52103fi fiVar9 = (C52103fi) feVar.instance;
            fiVar9.f136735e = 1;
            fiVar9.f136731a |= 8;
            return optional2;
        } catch (Exception e) {
            C59104x d2 = C35817af.f93839a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "GetSettingPhoneBuddy");
            ((C59052c) ((C59052c) d2).mo56372aa(51929)).mo56354G("Phone buddy API get setting %s failed with %s", str, e.getMessage());
            return Optional.empty();
        }
    }
}
