package com.google.android.apps.search.assistant.platform.ondevice.datadownload;

import com.google.android.libraries.mdi.download.C28740br;
import com.google.android.libraries.mdi.download.C28806cu;
import com.google.android.libraries.mdi.download.C28807cv;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.mdi.download.C29668l;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.e */
/* compiled from: PG */
public final /* synthetic */ class C122300e implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C122165am f339140a;

    /* renamed from: b */
    public final /* synthetic */ C28740br f339141b;

    /* renamed from: c */
    public final /* synthetic */ Locale f339142c;

    public /* synthetic */ C122300e(C122165am amVar, C28740br brVar, Locale locale) {
        this.f339140a = amVar;
        this.f339141b = brVar;
        this.f339142c = locale;
    }

    public final C60870cx apply(Object obj) {
        C122165am amVar = this.f339140a;
        C28740br brVar = this.f339141b;
        Locale locale = this.f339142c;
        Void voidR = (Void) obj;
        if (!amVar.f338843h) {
            return C60856cj.m92900i(Optional.empty());
        }
        C28806cu h = C28807cv.m53759h();
        ((C29668l) h).f80325a = C58833ax.m90834k(brVar.mo34350i());
        h.mo34458b(brVar.mo34344c());
        C60870cx g = ((C29409fd) amVar.f338838c.mo27525b()).mo34718g(h.mo34462f());
        C122153aa aaVar = new C122153aa(locale);
        return C60922j.m93044g(g, C47810es.m84963c(aaVar), amVar.f338839d);
    }
}
