package com.google.android.apps.gsa.staticplugins.p7638ca.p7639a;

import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88246uo;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88363yx;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88365yz;
import com.google.android.apps.gsa.shared.monet.p7070b.p7099p.C90268a;
import com.google.android.apps.gsa.staticplugins.p7638ca.p7640b.C97506a;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.common.base.C58833ax;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.speech.p5208h.C66554ak;

/* renamed from: com.google.android.apps.gsa.staticplugins.ca.a.b */
/* compiled from: PG */
public final class C97504b extends C23056g implements C90268a {

    /* renamed from: a */
    private final C97506a f272309a;

    public C97504b(C23052c cVar, C97506a aVar) {
        super(cVar);
        this.f272309a = aVar;
    }

    /* renamed from: a */
    public final void mo83976a(ServiceEventData serviceEventData) {
        Object obj;
        C88244um umVar = C88244um.ATTACH_WEBVIEW;
        C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
        if (a == null) {
            a = C88244um.ATTACH_WEBVIEW;
        }
        int ordinal = a.ordinal();
        if (ordinal == 27) {
            C88246uo uoVar = serviceEventData.f236959a;
            C62940bt r0 = C62942bv.checkIsLite(C88363yx.f238960a);
            uoVar.mo58887l(r0);
            Object l = uoVar.f169962ag.mo58854l(r0.f169971d);
            if (l == null) {
                obj = r0.f169969b;
            } else {
                obj = r0.mo58889c(l);
            }
            C88365yz yzVar = (C88365yz) obj;
            if (yzVar != null) {
                ((C97503a) this.f272309a).f272306a.mo28730f(C58833ax.m90833j(C66554ak.m97248a(yzVar.f238964b)), false);
            }
        } else if (ordinal != 53) {
            C88244um a2 = C88244um.m142794a(serviceEventData.f236959a.f238699b);
            if (a2 == null) {
                a2 = C88244um.ATTACH_WEBVIEW;
            }
            throw new IllegalArgumentException("Unexpected event id: ".concat(String.valueOf(String.valueOf(a2))));
        } else {
            ((C97503a) this.f272309a).f272307b.mo28730f(C58833ax.m90834k(serviceEventData), false);
        }
    }

    /* renamed from: iA */
    public final boolean mo28438iA() {
        return true;
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
    }

    /* renamed from: iE */
    public final void mo28498iE() {
    }
}
