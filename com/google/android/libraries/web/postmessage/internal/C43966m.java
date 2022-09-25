package com.google.android.libraries.web.postmessage.internal;

import com.google.android.libraries.web.p3408h.p3409a.p3410a.C43775a;
import com.google.android.libraries.web.postmessage.C43951b;
import com.google.common.base.C58893dc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.web.postmessage.internal.m */
/* compiled from: PG */
public final class C43966m {

    /* renamed from: a */
    public final C43775a f114455a;

    /* renamed from: b */
    public final C43959f f114456b;

    /* renamed from: c */
    public final C43963j f114457c;

    /* renamed from: d */
    public final Map f114458d = new HashMap();

    /* renamed from: e */
    public final List f114459e = new ArrayList();

    /* renamed from: f */
    public final Map f114460f = new HashMap();

    /* renamed from: g */
    public boolean f114461g;

    /* renamed from: h */
    public C43974u f114462h;

    public C43966m(C43775a aVar, C43959f fVar) {
        C43963j jVar = new C43963j(this);
        this.f114457c = jVar;
        this.f114455a = aVar;
        this.f114456b = fVar;
        C43958e eVar = (C43958e) fVar.f114444a.get(aVar);
        if (eVar == null) {
            eVar = new C43958e();
            fVar.f114444a.put(aVar, eVar);
        }
        eVar.f114442a.add(jVar);
        Optional optional = eVar.f114443b;
        Objects.requireNonNull(jVar);
        optional.ifPresent(new C43956c(jVar));
    }

    /* renamed from: a */
    public final void mo46958a(JSONObject jSONObject, int i) {
        C43951b bVar = (C43951b) this.f114460f.get(Integer.valueOf(i));
        C58893dc.m90996a(bVar);
        C43968o b = mo46959b();
        C58893dc.m90996a(b);
        bVar.mo42607a(jSONObject, b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C43968o mo46959b() {
        C43974u uVar = this.f114462h;
        if (uVar == null) {
            return null;
        }
        C58893dc.m90997b(uVar.f114473a == uVar.f114475c.f114479a);
        return uVar.f114474b;
    }
}
