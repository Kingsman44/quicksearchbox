package com.google.android.libraries.web.postmessage.internal;

import com.google.android.libraries.web.p3408h.p3409a.p3410a.C43775a;
import com.google.android.libraries.web.postmessage.PostMessageConfig;
import com.google.common.base.C58893dc;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import org.json.JSONException;
import org.json.JSONObject;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.web.postmessage.internal.w */
/* compiled from: PG */
public final class C43976w {

    /* renamed from: b */
    private static final C59071e f114478b = C59071e.m91332i("com.google.android.libraries.web.postmessage.internal.w");

    /* renamed from: a */
    public C43975v f114479a;

    /* renamed from: c */
    private final C43775a f114480c;

    /* renamed from: d */
    private final C43959f f114481d;

    /* renamed from: e */
    private int f114482e = 1;

    public C43976w(C43775a aVar, C43959f fVar) {
        this.f114480c = aVar;
        this.f114481d = fVar;
    }

    /* renamed from: h */
    private final C58528ij m77632h() {
        C58526ih ihVar = new C58526ih();
        C43959f fVar = this.f114481d;
        C43775a aVar = this.f114480c;
        C43958e eVar = (C43958e) fVar.f114444a.get(aVar);
        if (eVar == null) {
            eVar = new C43958e();
            fVar.f114444a.put(aVar, eVar);
        }
        ihVar.mo55489i(eVar.f114442a);
        return ihVar.mo55486f();
    }

    /* renamed from: i */
    private final void m77633i(PostMessageConfig postMessageConfig) {
        postMessageConfig.mo42600c().ifPresent(new C43972s(this));
        if (postMessageConfig.mo42602e()) {
            mo46965a();
        }
    }

    /* renamed from: a */
    public final void mo46965a() {
        this.f114482e = 3;
        C43975v vVar = this.f114479a;
        if (vVar != null) {
            vVar.f114476a.mo46953a();
            vVar.f114477b.f114465a = null;
            this.f114479a = null;
            Collection.EL.stream(m77632h()).forEach(C43973t.f114472a);
        }
    }

    /* renamed from: b */
    public final void mo46966b(C43954a aVar, C43968o oVar) {
        int i = this.f114482e;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (i != 0) {
            C58893dc.m90997b(z);
            this.f114482e = 2;
            C43975v vVar = new C43975v(aVar, oVar);
            this.f114479a = vVar;
            C58800sl lA = m77632h().iterator();
            while (lA.hasNext()) {
                ((C43955b) lA.next()).mo46956c(new C43974u(this, vVar, oVar));
            }
            return;
        }
        throw null;
    }

    /* renamed from: c */
    public final void mo46967c(String str, PostMessageConfig postMessageConfig) {
        JSONObject jSONObject;
        C58893dc.m90997b(postMessageConfig.mo42598a().equals(this.f114480c));
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException e) {
                ((C59052c) ((C59052c) ((C59052c) f114478b.mo56226d()).mo56382g(e)).mo56372aa(54158)).mo56386p("Discarded WebMessage with corrupted data.");
                m77633i(postMessageConfig);
                jSONObject = null;
            }
            if (jSONObject != null) {
                C58800sl lA = m77632h().iterator();
                boolean z = false;
                while (lA.hasNext()) {
                    z |= !(((C43955b) lA.next()).mo46955b(jSONObject) != 2);
                }
                if (!z) {
                    postMessageConfig.mo42601d(jSONObject).ifPresent(new C43971r(this));
                    if (postMessageConfig.mo42602e()) {
                        mo46965a();
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        ((C59052c) ((C59052c) f114478b.mo56226d()).mo56372aa(54157)).mo56386p("Discarded a WebMessage with empty data.");
        m77633i(postMessageConfig);
    }

    /* renamed from: d */
    public final void mo46968d() {
        mo46965a();
        this.f114482e = 1;
    }

    /* renamed from: e */
    public final boolean mo46969e() {
        int i = this.f114482e;
        boolean z = i == 3;
        if (i != 0) {
            return z;
        }
        throw null;
    }

    /* renamed from: f */
    public final boolean mo46970f() {
        int i = this.f114482e;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (i != 0) {
            return z;
        }
        throw null;
    }

    /* renamed from: g */
    public final C43968o mo46971g() {
        C43975v vVar = this.f114479a;
        if (vVar == null) {
            return null;
        }
        return vVar.f114477b;
    }
}
