package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p727a.p729b;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p727a.p731d.C12019i;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p727a.p731d.C12021k;
import com.google.android.libraries.search.p2904c.C37512ds;
import com.google.android.libraries.search.p2904c.C37516dw;
import com.google.android.libraries.search.p2904c.C37565ef;
import com.google.android.libraries.search.p2904c.p2942m.p2943a.C37846as;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.a.a.b.d */
/* compiled from: PG */
final class C11993d implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C11994e f38503a;

    public C11993d(C11994e eVar) {
        this.f38503a = eVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        this.f38503a.f38506b.mo5437b(C37846as.m66799e(C37846as.m66801g(C37512ds.FAILED_CLOSING_ERROR_IN_GETTING_AUDIO_SOURCE_CLOSING_STATUS), C37565ef.CLIENT_REQUESTED));
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        int a = C12019i.m27911a(((C12021k) obj).f38550b);
        if (a != 0 && a == 3) {
            this.f38503a.f38506b.mo5437b(C37846as.m66799e(C37846as.m66801g(C37512ds.FAILED_CLOSING_NO_AUDIO_STREAM_IN_STORE), C37565ef.CLIENT_REQUESTED));
        } else {
            this.f38503a.f38506b.mo5437b(C37846as.m66799e(C37846as.m66802h(C37516dw.CLOSED), C37565ef.CLIENT_REQUESTED));
        }
    }
}
