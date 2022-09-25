package com.google.frameworks.client.data.android.server.p4646a.p4647a;

import android.os.Parcelable;
import com.google.common.p4522b.C58485gu;
import com.google.p4238bo.p4239a.p4240a.p4241a.C56125i;
import java.util.concurrent.atomic.AtomicReference;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70148al;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70761fa;
import p5488io.grpc.Status;

/* renamed from: com.google.frameworks.client.data.android.server.a.a.g */
/* compiled from: PG */
public final class C61543g {
    /* renamed from: a */
    public static final Parcelable m94274a(C61541e eVar) {
        C69664n.m101061g(eVar, "<this>");
        return m94277d(eVar);
    }

    /* renamed from: b */
    public static final Parcelable m94275b(C61541e eVar, C70148al alVar) {
        C69664n.m101061g(eVar, "<this>");
        C69664n.m101061g(alVar, "context");
        return (Parcelable) eVar.f166336b.mo61711a(alVar);
    }

    /* renamed from: c */
    public static final void m94276c(C61541e eVar, Parcelable parcelable, C70148al alVar) {
        C69664n.m101061g(eVar, "<this>");
        C69664n.m101061g(parcelable, "value");
        C69664n.m101061g(alVar, "context");
        ((AtomicReference) eVar.f166337c.mo61711a(alVar)).set(parcelable);
    }

    /* renamed from: d */
    public static /* synthetic */ Parcelable m94277d(C61541e eVar) {
        C70148al m = C70148al.m102135m();
        C69664n.m101060f(m, "current()");
        C69664n.m101061g(eVar, "<this>");
        C69664n.m101061g(m, "context");
        Parcelable b = m94275b(eVar, m);
        C69664n.m101059e(b, "null cannot be cast to non-null type T of com.google.frameworks.client.data.android.server.contrib.parcelables.ParcelableOverMetadataKt.fromRequestHeaders");
        return b;
    }

    /* renamed from: e */
    public static /* synthetic */ Parcelable m94278e(C61541e eVar) {
        C70148al m = C70148al.m102135m();
        C69664n.m101060f(m, "current()");
        return m94275b(eVar, m);
    }

    /* renamed from: f */
    public static final Parcelable m94279f(C56125i iVar, C61541e eVar) {
        C70334de deVar;
        C70334de deVar2;
        C69664n.m101061g(iVar, "<this>");
        C69664n.m101061g(eVar, "keys");
        C61542f fVar = C61542f.f166339a;
        if (!iVar.f149527a.mo61679g()) {
            Status status = iVar.f149527a;
            C70334de deVar3 = iVar.f149530d;
            if (deVar3 == null) {
                deVar = new C70334de();
            } else {
                synchronized (deVar3) {
                    deVar2 = new C70334de();
                    deVar2.mo62032g(iVar.f149530d);
                }
                deVar = deVar2;
            }
            throw new C70761fa(status, deVar, true);
        }
        C58485gu guVar = (C58485gu) fVar.mo5192a(iVar, eVar.f166335a);
        Parcelable parcelable = (Parcelable) C69540x.m100821C(guVar);
        if (parcelable != null) {
            return parcelable;
        }
        throw new C61537a(eVar, guVar);
    }

    /* renamed from: g */
    public static /* synthetic */ void m94280g(C61541e eVar, Parcelable parcelable) {
        C70148al m = C70148al.m102135m();
        C69664n.m101060f(m, "current()");
        m94276c(eVar, parcelable, m);
    }
}
