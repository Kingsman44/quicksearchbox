package com.facebook.litho.p322a;

import com.facebook.litho.C6373gz;
import com.facebook.litho.p326e.C6219h;
import com.facebook.litho.p326e.C6220i;
import com.facebook.litho.p326e.C6226o;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: com.facebook.litho.a.v */
/* compiled from: PG */
public abstract class C6089v extends C6080m {

    /* renamed from: a */
    public final C6220i f17985a;

    public C6089v(C6220i iVar) {
        this.f17985a = iVar;
        C6088u uVar = new C6088u(this);
        if (iVar.f18394f == null) {
            iVar.f18394f = uVar;
            return;
        }
        throw new RuntimeException("Overriding existing listener!");
    }

    /* renamed from: e */
    public final void mo12772e() {
        C6220i iVar = this.f17985a;
        if (iVar.f18392d) {
            iVar.mo13182c();
        }
    }

    /* renamed from: f */
    public final boolean mo12773f() {
        return this.f17985a.f18392d;
    }

    /* renamed from: g */
    public final void mo12774g(C6373gz gzVar) {
        if (!mo12783l()) {
            mo12780i();
            return;
        }
        mo12782k();
        mo12791m(gzVar);
        C6220i iVar = this.f17985a;
        C6219h hVar = iVar.f18390b;
        for (int i = 0; i < hVar.f18386a.size(); i++) {
            C6226o oVar = (C6226o) hVar.f18386a.get(i);
            C6226o oVar2 = (C6226o) hVar.f18387b.get(i);
            String str = (String) hVar.f18388c.get(i);
            C6226o g = oVar2.mo13187g(str);
            if (g != null) {
                g.mo13190j(oVar2);
                oVar2.mo13189i(str);
            }
            if (oVar.f18403b == null) {
                oVar.f18403b = new ArrayList();
            }
            oVar.f18403b.add(oVar2);
            if (oVar2.f18402a == null) {
                oVar2.f18402a = new LinkedHashMap();
            }
            oVar2.f18402a.put(str, oVar);
        }
        iVar.f18393e = true;
        iVar.f18392d = true;
        iVar.f18389a.mo13179b(iVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract void mo12791m(C6373gz gzVar);
}
