package com.google.android.apps.gsa.searchbox.p6960ui.p6961a;

import android.text.TextUtils;
import com.google.android.libraries.searchbox.shared.response.Response;
import com.google.android.libraries.searchbox.shared.suggestion.C41670aj;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.p4552o.C60455qr;
import com.google.common.p4552o.C60456qs;
import com.google.common.p4552o.C60646xp;
import com.google.common.p4552o.C60647xq;
import com.google.common.p4552o.apd;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.a.c */
/* compiled from: PG */
public final class C88694c {
    /* renamed from: a */
    public static C60456qs m143537a(CharSequence charSequence, Response response, apd apd) {
        C60455qr qrVar = (C60455qr) C60456qs.f163602g.createBuilder();
        if (charSequence != null) {
            String obj = charSequence.toString();
            qrVar.copyOnWrite();
            C60456qs qsVar = (C60456qs) qrVar.instance;
            obj.getClass();
            qsVar.f163604a |= 2;
            qsVar.f163606c = obj;
        }
        qrVar.copyOnWrite();
        ((C60456qs) qrVar.instance).f163605b = C60456qs.emptyProtobufList();
        if (response != null) {
            for (Suggestion suggestion : response.f108862b) {
                if (suggestion.mo44270w()) {
                    C60646xp xpVar = (C60646xp) C60647xq.f164533c.createBuilder();
                    int i = suggestion.f108910k;
                    String o = C41670aj.m73082o(suggestion);
                    if (!TextUtils.isEmpty(o)) {
                        xpVar.copyOnWrite();
                        C60647xq xqVar = (C60647xq) xpVar.instance;
                        o.getClass();
                        xqVar.f164535a |= 2;
                        xqVar.f164536b = o;
                    }
                    qrVar.copyOnWrite();
                    C60456qs qsVar2 = (C60456qs) qrVar.instance;
                    C60647xq xqVar2 = (C60647xq) xpVar.build();
                    xqVar2.getClass();
                    C62971cq cqVar = qsVar2.f163605b;
                    if (!cqVar.mo58948c()) {
                        qsVar2.f163605b = C62942bv.mutableCopy(cqVar);
                    }
                    qsVar2.f163605b.add(xqVar2);
                }
            }
        }
        qrVar.copyOnWrite();
        C60456qs qsVar3 = (C60456qs) qrVar.instance;
        apd.getClass();
        qsVar3.f163607d = apd;
        qsVar3.f163604a |= 4;
        return (C60456qs) qrVar.build();
    }
}
