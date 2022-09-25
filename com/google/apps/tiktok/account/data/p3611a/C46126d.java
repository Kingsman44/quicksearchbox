package com.google.apps.tiktok.account.data.p3611a;

import com.google.apps.tiktok.account.data.C46108a;
import com.google.apps.tiktok.account.data.C46167as;
import com.google.apps.tiktok.account.data.C46215j;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.List;

/* renamed from: com.google.apps.tiktok.account.data.a.d */
/* compiled from: PG */
public final /* synthetic */ class C46126d implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C46128f f121016a;

    /* renamed from: b */
    public final /* synthetic */ String f121017b;

    public /* synthetic */ C46126d(C46128f fVar, String str) {
        this.f121016a = fVar;
        this.f121017b = str;
    }

    public final Object apply(Object obj) {
        Object obj2;
        Object obj3;
        C46128f fVar = this.f121016a;
        String str = this.f121017b;
        List<C46108a> list = (List) obj;
        for (C46108a aVar : list) {
            if (C46128f.m82358h(aVar.mo50210b()) && fVar.mo50218f(aVar.mo50210b())) {
                if (str.equals(aVar.mo50210b().f121161f)) {
                    return aVar.mo50209a();
                }
                if (fVar.f121021c) {
                    C46215j b = aVar.mo50210b();
                    C62940bt r5 = C62942bv.checkIsLite(C46123ad.f121013a);
                    b.mo58887l(r5);
                    Object l = b.f169962ag.mo58854l(r5.f169971d);
                    if (l == null) {
                        obj3 = r5.f169969b;
                    } else {
                        obj3 = r5.mo58889c(l);
                    }
                    for (String equals : ((C46148z) obj3).f121059c) {
                        if (str.equals(equals)) {
                            return aVar.mo50209a();
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            }
        }
        String d = C46128f.m82356d(str);
        for (C46108a aVar2 : list) {
            if (C46128f.m82358h(aVar2.mo50210b()) && fVar.mo50218f(aVar2.mo50210b())) {
                if (d.equals(C46128f.m82356d(aVar2.mo50210b().f121161f))) {
                    return aVar2.mo50209a();
                }
                if (fVar.f121021c) {
                    C46215j b2 = aVar2.mo50210b();
                    C62940bt r4 = C62942bv.checkIsLite(C46123ad.f121013a);
                    b2.mo58887l(r4);
                    Object l2 = b2.f169962ag.mo58854l(r4.f169971d);
                    if (l2 == null) {
                        obj2 = r4.f169969b;
                    } else {
                        obj2 = r4.mo58889c(l2);
                    }
                    for (String str2 : ((C46148z) obj2).f121059c) {
                        if (C46128f.m82357g(str2)) {
                            ((C59052c) ((C59052c) C46128f.f121019a.mo56225c()).mo56372aa(54690)).mo56386p("Found google email address as the old primary email address. This shouldn't happen because the primary email address cannot change once set to a google domain one.");
                            if (d.equals(C46128f.m82356d(str2))) {
                                return aVar2.mo50209a();
                            }
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            }
        }
        throw new C46167as();
    }
}
