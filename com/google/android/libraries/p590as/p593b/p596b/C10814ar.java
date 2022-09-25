package com.google.android.libraries.p590as.p593b.p596b;

import com.google.android.libraries.p590as.p593b.p596b.p604g.C10879g;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.p4527a.C58970a;
import java.util.HashMap;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.as.b.b.ar */
/* compiled from: PG */
public final /* synthetic */ class C10814ar implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C58528ij f35855a;

    public /* synthetic */ C10814ar(C58528ij ijVar) {
        this.f35855a = ijVar;
    }

    public final Object apply(Object obj) {
        C58528ij ijVar = this.f35855a;
        HashMap hashMap = new HashMap();
        C58800sl lA = ((C58528ij) obj).iterator();
        while (lA.hasNext()) {
            C10879g gVar = (C10879g) lA.next();
            C58833ax axVar = C58836b.f156633a;
            C58800sl lA2 = ijVar.iterator();
            while (lA2.hasNext()) {
                C10882h hVar = (C10882h) lA2.next();
                if ((gVar.f35960a & 1) == 0) {
                    ((C58970a) ((C58970a) C10846ba.f35901a.mo56226d()).mo56372aa(53981)).mo56386p("Languagepack request is missing locale. This is probably a bug by the caller.");
                }
                if (((gVar.f35960a & 1) == 0 || gVar.f35961b.equals(hVar.mo19289g().toLanguageTag())) && ((gVar.f35960a & 2) == 0 || gVar.f35962c == ((long) hVar.mo19282a()))) {
                    if (axVar.mo56113h() && ((C10882h) axVar.mo56107c()).mo19282a() >= hVar.mo19282a()) {
                        if (((C10882h) axVar.mo56107c()).mo19282a() != hVar.mo19282a()) {
                            continue;
                        } else {
                            int h = hVar.mo19290h();
                            if (h == 0) {
                                throw null;
                            } else if (h != 3) {
                            }
                        }
                    }
                    axVar = C58833ax.m90834k(hVar);
                }
            }
            hashMap.put(gVar, axVar);
        }
        return (C58528ij) Collection.EL.stream(hashMap.entrySet()).filter(C10818av.f35860a).map(C10819aw.f35861a).distinct().collect(C58370cn.f155947b);
    }
}
