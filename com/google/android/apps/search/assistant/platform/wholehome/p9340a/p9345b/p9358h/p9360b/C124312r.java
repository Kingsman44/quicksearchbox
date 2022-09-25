package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9358h.p9360b;

import androidx.p104d.p105a.C2164c;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c.C124206v;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.b.h.b.r */
/* compiled from: PG */
public final /* synthetic */ class C124312r implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C124314t f343159a;

    /* renamed from: b */
    public final /* synthetic */ C124206v f343160b;

    public /* synthetic */ C124312r(C124314t tVar, C124206v vVar) {
        this.f343159a = tVar;
        this.f343160b = vVar;
    }

    public final void run() {
        C124314t tVar = this.f343159a;
        C124206v vVar = this.f343160b;
        String str = vVar.f342966a;
        if (tVar.f343163a.f343170g.containsKey(str)) {
            ((C2164c) tVar.f343163a.f343170g.get(str)).mo5437b(vVar);
            tVar.f343163a.f343170g.remove(str);
            return;
        }
        throw new IllegalStateException(String.format(Locale.ENGLISH, "Failed to find RemoteExecutionCompleter for id: %s.", new Object[]{str}));
    }
}
