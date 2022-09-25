package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a;

import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2553c.C33140a;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2553c.C33142c;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2553c.C33143d;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2553c.C33144e;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.n */
/* compiled from: PG */
public final /* synthetic */ class C33040n implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C33046t f88478a;

    /* renamed from: b */
    public final /* synthetic */ C33140a f88479b;

    public /* synthetic */ C33040n(C33046t tVar, C33140a aVar) {
        this.f88478a = tVar;
        this.f88479b = aVar;
    }

    public final Object apply(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        C33046t tVar = this.f88478a;
        C33140a aVar = this.f88479b;
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            C33144e eVar = tVar.f88490b;
            eVar.getClass();
            eVar.mo38548a(12);
            return Optional.empty();
        }
        String str5 = (String) optional.get();
        if (str5 != null) {
            C33142c cVar = (C33142c) aVar;
            cVar.f88678e = str5;
            C58976aa aaVar = C58975e.f156826a;
            String str6 = cVar.f88674a;
            if (str6 != null && (str = cVar.f88675b) != null && (str2 = cVar.f88676c) != null && (str3 = cVar.f88677d) != null && (str4 = cVar.f88678e) != null) {
                return Optional.m71637of(new C33143d(str6, str, str2, str3, str4));
            }
            StringBuilder sb = new StringBuilder();
            if (cVar.f88674a == null) {
                sb.append(" sessionId");
            }
            if (cVar.f88675b == null) {
                sb.append(" resolvedContactName");
            }
            if (cVar.f88676c == null) {
                sb.append(" resolvedProvider");
            }
            if (cVar.f88677d == null) {
                sb.append(" resolvedInstanceLabel");
            }
            if (cVar.f88678e == null) {
                sb.append(" resolvedInstance");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        throw new NullPointerException("Null resolvedInstance");
    }
}
