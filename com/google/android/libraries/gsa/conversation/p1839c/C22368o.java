package com.google.android.libraries.gsa.conversation.p1839c;

import com.google.common.util.concurrent.C60908dv;
import dagger.p5294a.C68220f;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.gsa.conversation.c.o */
/* compiled from: PG */
public final class C22368o implements C68220f {
    /* renamed from: b */
    public final /* synthetic */ Object mo17428b() {
        C60908dv dvVar = new C60908dv();
        dvVar.mo57410b("GsaConversationThread");
        dvVar.mo57411c(10);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(4, 4, 5, TimeUnit.SECONDS, new LinkedBlockingQueue(), C60908dv.m93015a(dvVar));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }
}
