package com.google.android.libraries.search.assistant.p2511d;

import androidx.p104d.p105a.C2169h;
import com.google.common.util.concurrent.C60870cx;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.google.android.libraries.search.assistant.d.d */
/* compiled from: PG */
public final class C32541d {

    /* renamed from: a */
    public final Set f87158a = new CopyOnWriteArraySet();

    /* renamed from: a */
    public final C60870cx mo38140a(Callable callable) {
        return C2169h.m6027a(new C32539b(this, callable));
    }

    /* renamed from: b */
    public final void mo38141b() {
        for (Runnable run : this.f87158a) {
            run.run();
        }
    }
}
