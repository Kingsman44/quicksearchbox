package com.google.android.apps.search.assistant.platform.ondevice.datadownload;

import com.google.android.libraries.mdi.download.C28740br;
import com.google.android.libraries.mdi.download.C28806cu;
import com.google.android.libraries.mdi.download.C28807cv;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.mdi.download.C29668l;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.d */
/* compiled from: PG */
public final /* synthetic */ class C122213d implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C122165am f338921a;

    /* renamed from: b */
    public final /* synthetic */ C28740br f338922b;

    public /* synthetic */ C122213d(C122165am amVar, C28740br brVar) {
        this.f338921a = amVar;
        this.f338922b = brVar;
    }

    public final C60870cx apply(Object obj) {
        C122165am amVar = this.f338921a;
        C28740br brVar = this.f338922b;
        Void voidR = (Void) obj;
        C122174av avVar = amVar.f338837b;
        if (!brVar.mo34347f().mo56113h()) {
            return C60866ct.f164955a;
        }
        C28806cu h = C28807cv.m53759h();
        ((C29668l) h).f80325a = C58833ax.m90834k(brVar.mo34350i());
        h.mo34458b(brVar.mo34344c());
        C60870cx g = ((C29409fd) avVar.f338857d.mo27525b()).mo34718g(h.mo34462f());
        C122169aq aqVar = new C122169aq(avVar, brVar);
        return C60922j.m93045h(g, C47810es.m84966f(aqVar), avVar.f338858e);
    }
}
