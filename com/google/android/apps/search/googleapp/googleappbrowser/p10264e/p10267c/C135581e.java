package com.google.android.apps.search.googleapp.googleappbrowser.p10264e.p10267c;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.search.googleapp.googleappbrowser.C135521bn;
import com.google.android.apps.search.googleapp.googleappbrowser.C135522bo;
import com.google.android.apps.search.googleapp.googleappbrowser.C135523bp;
import com.google.android.apps.search.googleapp.googleappbrowser.C135524bq;
import com.google.android.apps.search.googleapp.googleappbrowser.C136117x;
import com.google.android.apps.search.googleapp.googleappbrowser.C136118y;
import com.google.android.apps.search.googleapp.googleappbrowser.C136119z;
import com.google.android.apps.search.googleapp.googleappbrowser.p10269f.C135587c;
import com.google.android.gms.clearcut.C143657j;
import com.google.android.gms.clearcut.C143658k;
import com.google.android.libraries.p1975k.p1980e.C24006d;
import com.google.android.libraries.p3339v.C43205e;
import com.google.android.libraries.web.base.C43269t;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.e.c.e */
/* compiled from: PG */
public final class C135581e {

    /* renamed from: a */
    public static final C59071e f369316a = C59071e.m91332i("com.google.android.apps.search.googleapp.googleappbrowser.e.c.e");

    /* renamed from: b */
    public final C60870cx f369317b;

    /* renamed from: c */
    public final C60887da f369318c;

    /* renamed from: d */
    public final C135587c f369319d;

    /* renamed from: e */
    private final Context f369320e;

    public C135581e(Context context, AccountId accountId, C46128f fVar, C60887da daVar, C135587c cVar, C43269t tVar) {
        C60870cx cxVar;
        this.f369320e = context;
        this.f369318c = daVar;
        this.f369319d = cVar;
        boolean z = !tVar.mo46386d().f114485c;
        ((C59052c) ((C59052c) f369316a.mo56224b()).mo56372aa(40657)).mo56389s("HasFootprintsPermission: %s.", Boolean.valueOf(z));
        if (z) {
            cxVar = C60922j.m93044g(fVar.mo50215b(accountId), C47810es.m84963c(new C135579c(context)), daVar);
        } else {
            cxVar = C60856cj.m92900i(Optional.empty());
        }
        this.f369317b = cxVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ C60870cx mo112393a(C60870cx cxVar, String str, String str2, String str3, String str4, boolean z, boolean z2, int i, int i2, List list) {
        try {
            Boolean bool = (Boolean) C60856cj.m92909r(cxVar);
            try {
                Optional optional = (Optional) C60856cj.m92909r(this.f369317b);
                if (!bool.booleanValue() || !optional.isPresent()) {
                    ((C59052c) ((C59052c) f369316a.mo56224b()).mo56372aa(40653)).mo56355H("Failed to send footprints to the clearcut: Swaa permission: %s , ClearcutLogger present: %s", bool, optional.isPresent());
                    return C60866ct.f164955a;
                }
                ((C59052c) ((C59052c) f369316a.mo56224b()).mo56372aa(40654)).mo56386p("Sending new footprint record to the clearcut.");
                C143658k kVar = (C143658k) optional.get();
                C135521bn bnVar = (C135521bn) C135524bq.f369183j.createBuilder();
                bnVar.copyOnWrite();
                C135524bq bqVar = (C135524bq) bnVar.instance;
                str.getClass();
                bqVar.f369185a |= 1;
                bqVar.f369186b = str;
                bnVar.copyOnWrite();
                C135524bq bqVar2 = (C135524bq) bnVar.instance;
                str2.getClass();
                bqVar2.f369185a |= 2;
                bqVar2.f369187c = str2;
                bnVar.copyOnWrite();
                C135524bq bqVar3 = (C135524bq) bnVar.instance;
                str3.getClass();
                bqVar3.f369185a |= 4;
                bqVar3.f369188d = str3;
                bnVar.copyOnWrite();
                C135524bq bqVar4 = (C135524bq) bnVar.instance;
                str4.getClass();
                bqVar4.f369185a |= 512;
                bqVar4.f369193i = str4;
                int i3 = z ? 9 : z2 ? 8 : 1;
                bnVar.copyOnWrite();
                C135524bq bqVar5 = (C135524bq) bnVar.instance;
                bqVar5.f369190f = i3 - 1;
                bqVar5.f369185a |= 128;
                bnVar.copyOnWrite();
                C135524bq bqVar6 = (C135524bq) bnVar.instance;
                bqVar6.f369185a |= 256;
                bqVar6.f369191g = i;
                bnVar.copyOnWrite();
                C135524bq bqVar7 = (C135524bq) bnVar.instance;
                bqVar7.f369185a |= 32;
                bqVar7.f369189e = i2;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C135522bo boVar = (C135522bo) C135523bp.f369179c.createBuilder();
                    String uri = ((Uri) it.next()).toString();
                    boVar.copyOnWrite();
                    C135523bp bpVar = (C135523bp) boVar.instance;
                    uri.getClass();
                    bpVar.f369181a |= 1;
                    bpVar.f369182b = uri;
                    C135523bp bpVar2 = (C135523bp) boVar.build();
                    bnVar.copyOnWrite();
                    C135524bq bqVar8 = (C135524bq) bnVar.instance;
                    bpVar2.getClass();
                    C62971cq cqVar = bqVar8.f369192h;
                    if (!cqVar.mo58948c()) {
                        bqVar8.f369192h = C62942bv.mutableCopy(cqVar);
                    }
                    bqVar8.f369192h.add(bpVar2);
                }
                C136117x xVar = (C136117x) C136118y.f370716c.createBuilder();
                C135524bq bqVar9 = (C135524bq) bnVar.build();
                xVar.copyOnWrite();
                C136118y yVar = (C136118y) xVar.instance;
                bqVar9.getClass();
                yVar.f370719b = bqVar9;
                yVar.f370718a |= 1;
                C143657j d = kVar.mo118999d((C136118y) xVar.build());
                d.f389472n = C24006d.m44596b(this.f369320e, new C136119z());
                d.f389473o = 4;
                return C60922j.m93044g(C43205e.m76191a(d.mo118992a()), C47810es.m84963c(C135580d.f369315a), this.f369318c);
            } catch (CancellationException | ExecutionException e) {
                return C60856cj.m92899h(new IllegalStateException("Failed to get clearcut logger.", e));
            }
        } catch (CancellationException | ExecutionException e2) {
            return C60856cj.m92899h(new IllegalStateException("Failed to get swaa permission.", e2));
        }
    }
}
