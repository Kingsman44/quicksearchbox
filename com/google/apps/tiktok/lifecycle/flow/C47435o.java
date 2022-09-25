package com.google.apps.tiktok.lifecycle.flow;

import android.os.Looper;
import androidx.lifecycle.C2384o;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.lifecycle.C47439h;
import java.util.Map;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71571du;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.lifecycle.flow.o */
/* compiled from: PG */
public final class C47435o implements C47429i {

    /* renamed from: a */
    public final C2384o f123199a;

    /* renamed from: b */
    public final C71422aw f123200b;

    /* renamed from: c */
    public final C47436p f123201c;

    public C47435o(C2384o oVar, C71422aw awVar, C47439h hVar) {
        C69664n.m101061g(oVar, "instanceLifecycle");
        C69664n.m101061g(hVar, "lifecycleMemoizer");
        this.f123199a = oVar;
        this.f123200b = awVar;
        Object b = hVar.mo51269b(R.id.lifecycle_channel_mixin, C47430j.f123187a);
        C69664n.m101060f(b, "lifecycleMemoizer.getOrC…n) { StreamMixinState() }");
        this.f123201c = (C47436p) b;
        oVar.mo5790b(new StreamMixinImpl$1(this));
    }

    /* renamed from: a */
    public final C47422b mo51262a(C71571du duVar) {
        C69664n.m101061g(duVar, "responseFlow");
        if (C69664n.m101066l(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            Map map = this.f123201c.f123202a;
            Object obj = map.get(duVar);
            if (obj == null) {
                if (this.f123201c.f123203b) {
                    obj = new C47437q((byte[]) null);
                    map.put(duVar, obj);
                } else {
                    throw new IllegalStateException("This StateFlow object was not streamed from in the first lifecycle of this LifecycleOwner. A LifecycleOwner must streamFrom() every StateFlow it wishes to stream from in its first lifecycle, and must always stream from exactly the same set of StateFlow objects after each configuration change. This prevents state loss.");
                }
            }
            return new C47421a(new C47434n((C47437q) obj, this, duVar));
        }
        throw new IllegalStateException("streamFrom() must be called from the main thread.");
    }
}
