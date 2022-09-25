package com.google.android.apps.search.googleapp.search.suggest.sources.p10459a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.search.suggest.C138020al;
import com.google.android.apps.search.googleapp.search.suggest.C138025aq;
import com.google.android.apps.search.googleapp.search.suggest.C138134p;
import com.google.android.apps.search.googleapp.search.suggest.C138542t;
import com.google.android.apps.search.googleapp.search.suggest.C138543u;
import com.google.android.apps.search.googleapp.search.suggest.C138678v;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.frameworks.client.data.android.C61366ah;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;
import com.google.p4017at.p4060h.p4073d.p4074a.C54229ar;
import com.google.p4017at.p4060h.p4073d.p4074a.C54231at;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.util.List;
import java.util.regex.Pattern;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.a.ay */
/* compiled from: PG */
public final class C138403ay {

    /* renamed from: a */
    public static final C58974d f376501a = C58974d.m91134h("CompleteServerParser");

    /* renamed from: b */
    private static final Pattern f376502b = Pattern.compile("<(/?b)>");

    /* renamed from: a */
    public static String m224817a(String str) {
        return f376502b.matcher(str).replaceAll(BuildConfig.FLAVOR);
    }

    /* renamed from: b */
    static final C138678v m224818b(C61366ah ahVar, long j, long j2) {
        C47558bi a = C47831fm.m85006a("CompleteServerResponseParser parse");
        try {
            C54229ar arVar = (C54229ar) C62942bv.parseFrom((C62942bv) C54229ar.f142352d, ahVar.f165946b, C62921ba.m95368a());
            C138020al alVar = (C138020al) C138025aq.f375512e.createBuilder();
            C54231at atVar = arVar.f142356c;
            if (atVar == null) {
                atVar = C54231at.f142359r;
            }
            boolean z = atVar.f142365e;
            alVar.copyOnWrite();
            C138025aq aqVar = (C138025aq) alVar.instance;
            aqVar.f375514a |= 1;
            aqVar.f375515b = z;
            List list = (List) Collection.EL.stream(arVar.f142355b).filter(C138400av.f376498a).map(new C138401aw((C138025aq) alVar.build())).collect(Collectors.toCollection(C138402ax.f376500a));
            C138134p pVar = (C138134p) C138542t.f376811i.createBuilder();
            C54231at atVar2 = arVar.f142356c;
            if (atVar2 == null) {
                atVar2 = C54231at.f142359r;
            }
            pVar.copyOnWrite();
            C138542t tVar = (C138542t) pVar.instance;
            atVar2.getClass();
            tVar.f376814b = atVar2;
            tVar.f376813a |= 1;
            if (j > 0) {
                pVar.copyOnWrite();
                C138542t tVar2 = (C138542t) pVar.instance;
                tVar2.f376813a |= 16;
                tVar2.f376818f = j;
            }
            if (j2 > 0) {
                pVar.copyOnWrite();
                C138542t tVar3 = (C138542t) pVar.instance;
                tVar3.f376813a |= 32;
                tVar3.f376819g = j2;
            }
            C54231at atVar3 = arVar.f142356c;
            if (atVar3 == null) {
                atVar3 = C54231at.f142359r;
            }
            if ((atVar3.f142361a & 256) != 0) {
                String a2 = m224817a(((C54228aq) arVar.f142355b.get(0)).f142331b);
                pVar.copyOnWrite();
                C138542t tVar4 = (C138542t) pVar.instance;
                a2.getClass();
                tVar4.f376813a |= 64;
                tVar4.f376820h = a2;
            }
            C138543u uVar = (C138543u) C138678v.f377195e.createBuilder();
            String str = arVar.f142354a;
            uVar.copyOnWrite();
            C138678v vVar = (C138678v) uVar.instance;
            str.getClass();
            vVar.f377197a |= 1;
            vVar.f377198b = str;
            uVar.copyOnWrite();
            C138678v vVar2 = (C138678v) uVar.instance;
            C138542t tVar5 = (C138542t) pVar.build();
            tVar5.getClass();
            vVar2.f377200d = tVar5;
            vVar2.f377197a |= 2;
            uVar.mo114309a(list);
            C138678v vVar3 = (C138678v) uVar.build();
            a.close();
            return vVar3;
        } catch (C62974ct e) {
            C58970a aVar = (C58970a) f376501a.mo56225c();
            aVar.mo56378ag(C38505d.f101864b, 145773063);
            ((C58970a) ((C58970a) aVar.mo56382g(e)).mo56372aa(41212)).mo56384n();
            throw e;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
