package com.google.frameworks.client.data.android.p4644k;

import com.google.android.libraries.phenotype.client.C31656al;
import com.google.apps.tiktok.experiments.phenotype.C46990dc;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.frameworks.client.data.android.p4641h.C61467a;
import com.google.frameworks.client.data.android.p4641h.C61479al;
import com.google.frameworks.client.data.android.p4641h.C61480am;
import com.google.frameworks.client.data.android.p4641h.C61481b;
import com.google.frameworks.client.data.android.p4641h.C61483d;
import com.google.frameworks.client.data.android.p4641h.C61485f;
import com.google.frameworks.client.data.p4631a.C61331a;
import com.google.p343ac.p346b.C6649k;
import com.google.p343ac.p346b.C6650l;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import p5488io.grpc.C70297cz;
import p5488io.grpc.C70334de;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.frameworks.client.data.android.k.d */
/* compiled from: PG */
public final class C61526d implements C61485f {

    /* renamed from: a */
    private static final C70297cz f166322a = C70297cz.m102495c(C61331a.m93818a(202964622), C70850d.m103696b(C6650l.f19886b));

    /* renamed from: b */
    private static final C59071e f166323b = C59071e.m91332i("com.google.frameworks.client.data.android.k.d");

    /* renamed from: c */
    private final C46990dc f166324c;

    /* renamed from: d */
    private C60870cx f166325d;

    public C61526d(C46990dc dcVar) {
        this.f166324c = dcVar;
    }

    /* renamed from: a */
    public final C61479al mo39483a(C61481b bVar) {
        try {
            C6650l a = C31656al.m58995a(C58485gu.m89842j(((Map) C60856cj.m92909r(this.f166325d)).values()));
            C70334de deVar = bVar.f166235a;
            C6650l lVar = C6650l.f19886b;
            C70297cz czVar = f166322a;
            if (deVar.mo62035j(czVar)) {
                lVar = (C6650l) deVar.mo62027b(czVar);
                C58838bb.m90866a(czVar, "key");
                C58838bb.m90866a(lVar, "value");
                int i = 0;
                while (true) {
                    if (i >= deVar.f187484f) {
                        break;
                    }
                    if (Arrays.equals(czVar.f187371b, deVar.mo62036k(i))) {
                        if (lVar.equals(deVar.mo62029d(i, czVar))) {
                            int i2 = i + i;
                            int i3 = i + 1;
                            int i4 = i3 + i3;
                            int i5 = deVar.f187484f;
                            Object[] objArr = deVar.f187483e;
                            System.arraycopy(objArr, i4, objArr, i2, (i5 + i5) - i4);
                            int i6 = deVar.f187484f - 1;
                            deVar.f187484f = i6;
                            deVar.f187483e[i6 + i6] = null;
                            byte[] bArr = null;
                            deVar.mo62034i(i6, (byte[]) null);
                            break;
                        }
                    }
                    i++;
                }
            }
            C70297cz czVar2 = f166322a;
            C6649k kVar = (C6649k) a.toBuilder();
            C62971cq cqVar = lVar.f19888a;
            kVar.copyOnWrite();
            C6650l lVar2 = (C6650l) kVar.instance;
            lVar2.mo13719a();
            C62947c.addAll((Iterable) cqVar, (List) lVar2.f19888a);
            deVar.mo62033h(czVar2, (C6650l) kVar.build());
        } catch (ExecutionException e) {
            ((C59052c) ((C59052c) ((C59052c) f166323b.mo56225c()).mo56382g(e)).mo56372aa(54893)).mo56386p("Unable to get experiment token.");
        }
        return C61479al.f166225a;
    }

    /* renamed from: b */
    public final C61479al mo39484b(C61481b bVar) {
        C60870cx a = this.f166324c.mo50962a();
        this.f166325d = a;
        return C61479al.m94190c(a);
    }

    /* renamed from: c */
    public final /* synthetic */ C61480am mo39485c(C61467a aVar) {
        return C61480am.f166232a;
    }

    /* renamed from: d */
    public final /* synthetic */ C61480am mo39486d(C61483d dVar) {
        return C61480am.f166232a;
    }

    /* renamed from: e */
    public final /* synthetic */ C61479al mo39487e() {
        return C61479al.f166225a;
    }

    /* renamed from: f */
    public final /* synthetic */ C61479al mo39488f() {
        return C61479al.f166225a;
    }

    /* renamed from: g */
    public final /* synthetic */ C61480am mo39489g() {
        return C61480am.f166232a;
    }
}
