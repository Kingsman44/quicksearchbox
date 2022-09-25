package com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6076i;

import com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6067d.C76667a;
import com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6067d.C76691b;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.C83334w;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82356cd;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.C122548d;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;
import p5488io.grpc.Status;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.d.i.e */
/* compiled from: PG */
public final class C76745e implements C76741a {

    /* renamed from: a */
    public static final C58974d f212096a = C58974d.m91136j();

    /* renamed from: c */
    private static final C58485gu f212097c = C58485gu.m89849q("getIntent", "callIGDP", "fulfillment", "annotate");

    /* renamed from: b */
    public final C83334w f212098b;

    /* renamed from: d */
    private final C83305i f212099d;

    public C76745e(C83305i iVar, C83334w wVar) {
        this.f212099d = iVar;
        this.f212098b = wVar;
    }

    /* renamed from: b */
    public static C76744d m123361b(Status status) {
        return m123362c("StatusException_".concat(String.valueOf(status.getCode().toString())), C58837ba.m90858g(status.getDescription()));
    }

    /* renamed from: c */
    public static C76744d m123362c(String str, String str2) {
        String[] split = str2.split(";", 3);
        if (split.length == 3 && f212097c.contains(split[0])) {
            str = str + '_' + split[0] + '_' + split[1];
            str2 = split[2];
        }
        return new C76744d(str, str2);
    }

    /* renamed from: d */
    public static String m123363d(Throwable th) {
        if (th instanceof C122548d) {
            return "FulfillmentCancelledException";
        }
        if (th instanceof C76691b) {
            return "NotInitializedException";
        }
        if (th instanceof C76667a) {
            return "NoConnectionException";
        }
        return th.getClass().getName();
    }

    /* renamed from: a */
    public final void mo72316a(C60870cx cxVar, String str, Optional optional) {
        C60856cj.m92911t(cxVar, new C76743c(this, str, optional), C60826bg.f164896a);
    }

    /* renamed from: e */
    public final void mo72317e(C76744d dVar, String str) {
        StringBuilder sb = new StringBuilder(dVar.f212093b);
        if (!dVar.f212094c.isEmpty()) {
            sb.append(":");
            sb.append(dVar.f212094c);
        }
        this.f212099d.mo75579d(new C82356cd("NGA_FULFILLMENT_GRPC_STATUS", sb.toString(), str));
    }
}
