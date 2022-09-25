package com.google.android.apps.search.assistant.platform.ondevice.datadownload;

import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import java.util.Locale;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.aa */
/* compiled from: PG */
public final /* synthetic */ class C122153aa implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Locale f338820a;

    public /* synthetic */ C122153aa(Locale locale) {
        this.f338820a = locale;
    }

    public final Object apply(Object obj) {
        Locale locale = this.f338820a;
        C58485gu guVar = (C58485gu) obj;
        C58485gu guVar2 = (C58485gu) Collection.EL.stream(guVar).filter(C122326m.f339195a).collect(C58370cn.f155946a);
        if (((C58485gu) Collection.EL.stream(guVar).filter(C122328o.f339197a).collect(C58370cn.f155946a)).isEmpty()) {
            return Collection.EL.stream(guVar2).filter(new C122329p(locale)).findFirst().map(C122330q.f339199a);
        }
        ((C58970a) ((C58970a) C122165am.f338836a.mo56224b()).mo56372aa(34716)).mo56386p("Found pending non GDD groups: multi variant locale support disabled.");
        return Optional.empty();
    }
}
