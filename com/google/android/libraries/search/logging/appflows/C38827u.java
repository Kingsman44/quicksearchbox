package com.google.android.libraries.search.logging.appflows;

import com.google.android.libraries.search.logging.C38828b;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2890e.C37232a;
import com.google.android.libraries.search.p2871b.p2895i.C37254c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.android.libraries.search.logging.appflows.u */
/* compiled from: PG */
public final class C38827u implements C37215b {

    /* renamed from: a */
    private final C38780c f102449a;

    /* renamed from: b */
    private final Map f102450b;

    public C38827u(C38780c cVar, Map map) {
        this.f102449a = cVar;
        this.f102450b = map;
    }

    /* renamed from: a */
    public final C60870cx mo19974a(C37254c cVar) {
        C37215b bVar;
        C37232a b = cVar.mo40778b();
        C38828b a = C38828b.m68178a(b.f98907b.f98908a);
        if (a != null) {
            return this.f102449a.mo41619a(a).mo19974a(cVar);
        }
        if (this.f102450b.containsKey(Integer.valueOf(b.f98907b.f98908a)) && (bVar = (C37215b) this.f102450b.get(Integer.valueOf(b.f98907b.f98908a))) != null) {
            return bVar.mo19974a(cVar);
        }
        return C60856cj.m92899h(new UnsupportedOperationException(String.format(Locale.US, "Couldnt find a logger for app ID: %d ", new Object[]{Integer.valueOf(b.f98907b.f98908a)})));
    }
}
