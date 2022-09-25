package com.google.android.apps.search.assistant.platform.ondevice.datadownload;

import com.google.android.libraries.mdi.download.C28805ct;
import com.google.common.base.C58817ah;
import java.util.List;
import java.util.Locale;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.s */
/* compiled from: PG */
public final /* synthetic */ class C122332s implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C122165am f339202a;

    /* renamed from: b */
    public final /* synthetic */ Locale f339203b;

    /* renamed from: c */
    public final /* synthetic */ C28805ct f339204c;

    public /* synthetic */ C122332s(C122165am amVar, Locale locale, C28805ct ctVar) {
        this.f339202a = amVar;
        this.f339203b = locale;
        this.f339204c = ctVar;
    }

    public final Object apply(Object obj) {
        C122165am amVar = this.f339202a;
        Locale locale = this.f339203b;
        C28805ct ctVar = this.f339204c;
        Optional findFirst = Collection.EL.stream((List) obj).filter(C122379y.f339291a).map(C122158af.f338827a).findFirst();
        if (findFirst.isEmpty()) {
            amVar.f338841f.mo105547b(locale, ctVar.mo34454c());
        }
        return findFirst;
    }
}
