package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9358h.p9360b;

import androidx.p104d.p105a.C2164c;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c.C124206v;
import com.google.assistant.p3741aa.C48173h;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.b.h.b.q */
/* compiled from: PG */
public final /* synthetic */ class C124311q implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C124314t f343157a;

    /* renamed from: b */
    public final /* synthetic */ C124206v f343158b;

    public /* synthetic */ C124311q(C124314t tVar, C124206v vVar) {
        this.f343157a = tVar;
        this.f343158b = vVar;
    }

    public final void run() {
        C124314t tVar = this.f343157a;
        C124206v vVar = this.f343158b;
        String str = vVar.f342966a;
        if (tVar.f343163a.f343171h.containsKey(str)) {
            C2164c cVar = (C2164c) tVar.f343163a.f343171h.get(str);
            C48173h hVar = vVar.f342967b;
            if (hVar == null) {
                hVar = C48173h.f124650e;
            }
            cVar.mo5437b(hVar);
            tVar.f343163a.f343171h.remove(str);
            return;
        }
        throw new IllegalStateException(String.format(Locale.ENGLISH, "Failed to find RemoteExecutionCompleter for id: %s.", new Object[]{str}));
    }
}
