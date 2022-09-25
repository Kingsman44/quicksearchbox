package com.facebook.litho.p324c;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.facebook.litho.C6386hk;
import com.facebook.litho.C6387hl;
import com.facebook.p313c.p317d.C6039b;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.litho.c.f */
/* compiled from: PG */
public final class C6152f implements C6150d {

    /* renamed from: c */
    private static C6150d f18180c = new C6152f();

    /* renamed from: a */
    public final Handler f18181a;

    /* renamed from: b */
    public Choreographer f18182b;

    public C6152f() {
        if (C6039b.m15533b()) {
            this.f18182b = Choreographer.getInstance();
            this.f18181a = null;
            return;
        }
        Handler handler = new Handler(Looper.getMainLooper());
        this.f18181a = handler;
        handler.post(new C6151e(this));
    }

    /* renamed from: b */
    public static C6150d m16219b() {
        if (f18180c == null) {
            f18180c = new C6152f();
        }
        return f18180c;
    }

    /* renamed from: a */
    public final void mo13135a(C6149c cVar) {
        AtomicReference atomicReference = cVar.f18176a;
        C6386hk hkVar = C6387hl.f18905a;
        atomicReference.set((Object) null);
        if (this.f18182b != null) {
            this.f18182b.postFrameCallback(cVar.mo13131a());
            return;
        }
        this.f18181a.postDelayed(cVar.mo13132b(), 0);
    }
}
