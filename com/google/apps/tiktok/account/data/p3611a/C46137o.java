package com.google.apps.tiktok.account.data.p3611a;

import androidx.p060c.C0977g;
import com.google.android.libraries.onegoogle.owners.C30976k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.HashMap;

/* renamed from: com.google.apps.tiktok.account.data.a.o */
/* compiled from: PG */
public final /* synthetic */ class C46137o implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C46144v f121034a;

    /* renamed from: b */
    public final /* synthetic */ C58495hd f121035b;

    public /* synthetic */ C46137o(C46144v vVar, C58495hd hdVar) {
        this.f121034a = vVar;
        this.f121035b = hdVar;
    }

    public final C60870cx apply(Object obj) {
        C46144v vVar = this.f121034a;
        C58495hd hdVar = this.f121035b;
        C58485gu guVar = (C58485gu) obj;
        ((C59052c) ((C59052c) C46144v.f121047a.mo56224b()).mo56372aa(54692)).mo56387q("GMSCore Auth returned %d accounts.", hdVar.size());
        ((C59052c) ((C59052c) C46144v.f121047a.mo56224b()).mo56372aa(54693)).mo56387q("GoogleOwnersProvider returned %d accounts.", guVar.size());
        if (guVar.size() < hdVar.size()) {
            ((C59052c) ((C59052c) C46144v.f121047a.mo56226d()).mo56372aa(54695)).mo56386p("GoogleOwnersProvider did not return all accounts.");
        }
        HashMap hashMap = new HashMap(hdVar);
        C0977g gVar = new C0977g(hdVar.size());
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C30976k kVar = (C30976k) guVar.get(i);
            kVar.mo36650a().getClass();
            if (hdVar.containsKey(kVar.mo36650a())) {
                hashMap.remove(kVar.mo36650a());
                if (kVar.mo36657g() == null && !gVar.containsKey(kVar.mo36650a())) {
                    gVar.put(kVar.mo36650a(), vVar.mo50223a(kVar.mo36650a()));
                }
            }
        }
        for (String str : hashMap.keySet()) {
            if (!gVar.containsKey(str)) {
                gVar.put(str, vVar.mo50223a(str));
            }
        }
        if (!gVar.isEmpty()) {
            ((C59052c) ((C59052c) C46144v.f121047a.mo56226d()).mo56372aa(54694)).mo56387q("GoogleOwnersProvider had %d missing ids.", gVar.f3122d);
        }
        return C60922j.m93045h(C60856cj.m92892a(gVar.values()).mo57334a(C47810es.m84978r(new C46133k(guVar, hdVar, hashMap, gVar)), vVar.f121049c), C47810es.m84966f(new C46134l(vVar)), vVar.f121049c);
    }
}
