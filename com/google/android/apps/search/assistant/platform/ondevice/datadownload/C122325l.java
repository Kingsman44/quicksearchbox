package com.google.android.apps.search.assistant.platform.ondevice.datadownload;

import com.google.android.libraries.mdi.download.C28807cv;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import java.util.List;
import java.util.Locale;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.l */
/* compiled from: PG */
public final /* synthetic */ class C122325l implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C122165am f339192a;

    /* renamed from: b */
    public final /* synthetic */ C28807cv f339193b;

    /* renamed from: c */
    public final /* synthetic */ Locale f339194c;

    public /* synthetic */ C122325l(C122165am amVar, C28807cv cvVar, Locale locale) {
        this.f339192a = amVar;
        this.f339193b = cvVar;
        this.f339194c = locale;
    }

    public final Object apply(Object obj) {
        C122165am amVar = this.f339192a;
        C28807cv cvVar = this.f339193b;
        Locale locale = this.f339194c;
        C58485gu guVar = (C58485gu) Collection.EL.stream((List) obj).filter(C122379y.f339291a).map(C122154ab.f338821a).collect(C58370cn.f155946a);
        if (!cvVar.mo34467e() && cvVar.mo34464b().mo56113h() && guVar.isEmpty()) {
            amVar.f338841f.mo105547b(locale, (String) cvVar.mo34464b().mo56107c());
        }
        return guVar;
    }
}
