package com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6062a.p6063a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122381a;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122408b;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.C122472a;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.d.a.a.d */
/* compiled from: PG */
public final /* synthetic */ class C76620d implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C76623g f211867a;

    /* renamed from: b */
    public final /* synthetic */ C122381a f211868b;

    public /* synthetic */ C76620d(C76623g gVar, C122381a aVar) {
        this.f211867a = gVar;
        this.f211868b = aVar;
    }

    public final C60870cx apply(Object obj) {
        C76623g gVar = this.f211867a;
        C122381a aVar = this.f211868b;
        C122472a aVar2 = (C122472a) obj;
        C47538ax c = gVar.f211872a.mo51613c("NGA");
        try {
            C60870cx b = aVar2.mo105630b((C122408b) aVar.build());
            if (c != null) {
                c.close();
            }
            return b;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
