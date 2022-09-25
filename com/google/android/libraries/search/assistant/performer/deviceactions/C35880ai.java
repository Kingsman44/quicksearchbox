package com.google.android.libraries.search.assistant.performer.deviceactions;

import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.assistant.p3897e.p3921j.C52098fd;
import com.google.assistant.p3897e.p3921j.C52107fm;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.Collections;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.ai */
/* compiled from: PG */
public final /* synthetic */ class C35880ai implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C35881aj f93996a;

    /* renamed from: b */
    public final /* synthetic */ C52098fd f93997b;

    /* renamed from: c */
    public final /* synthetic */ String f93998c;

    public /* synthetic */ C35880ai(C35881aj ajVar, C52098fd fdVar, String str) {
        this.f93996a = ajVar;
        this.f93997b = fdVar;
        this.f93998c = str;
    }

    public final Object apply(Object obj) {
        C35881aj ajVar = this.f93996a;
        C52098fd fdVar = this.f93997b;
        String str = this.f93998c;
        C58485gu guVar = (C58485gu) obj;
        if (!Collections.unmodifiableMap(Collections.unmodifiableMap(((C52107fm) fdVar.instance).f136746c)).isEmpty() || !Collections.unmodifiableMap(Collections.unmodifiableMap(((C52107fm) fdVar.instance).f136745b)).isEmpty()) {
            ajVar.f94004f.mo39895c(str, guVar.isEmpty() ? C62722b.OK : C62722b.UNAVAILABLE);
            return C36180b.m64577a("get_device_settings_result", "assistant.api.client_op.GetDeviceSettingsResult", fdVar.build());
        }
        ajVar.f94004f.mo39895c(str, C62722b.NOT_FOUND);
        return C36180b.m64579c(C52235kf.NOT_FOUND, "No settings found.");
    }
}
