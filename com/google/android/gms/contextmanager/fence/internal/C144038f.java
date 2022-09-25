package com.google.android.gms.contextmanager.fence.internal;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.awareness.fence.C142932a;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.libs.p10836d.p10839c.C144861c;
import com.google.android.p10717f.p10720c.C142627a;
import com.google.android.p10717f.p10721d.C142628a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.contextmanager.fence.internal.f */
/* compiled from: PG */
public final class C144038f extends C144047o {

    /* renamed from: a */
    public static final C142628a f390297a = new C144036d();

    /* renamed from: b */
    private final C142932a f390298b;

    /* renamed from: c */
    private final Handler f390299c;

    public C144038f(C142932a aVar, Looper looper) {
        this.f390298b = aVar;
        C143919bh.m233958a(looper);
        this.f390299c = new C144861c(looper);
    }

    /* renamed from: a */
    public final void mo119557a(FenceStateImpl fenceStateImpl) {
        this.f390299c.post(new C144037e(this.f390298b, fenceStateImpl));
    }

    @Deprecated
    /* renamed from: b */
    public final void mo119558b(FenceTriggerInfoImpl fenceTriggerInfoImpl) {
        C142627a.m231238c("ContextFenceListenerWrapper", "Unexpected call to deprecated method onFenceTriggered() with %s.", fenceTriggerInfoImpl);
        Handler handler = this.f390299c;
        C142932a aVar = this.f390298b;
        int i = 1;
        if (true == fenceTriggerInfoImpl.f390283a) {
            i = 2;
        }
        handler.post(new C144037e(aVar, new FenceStateImpl(i, 0, fenceTriggerInfoImpl.f390284b, 0, (ArrayList) null)));
    }
}
