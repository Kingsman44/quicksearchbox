package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import com.google.assistant.p3861at.C49875cf;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.net.Inet6Address;
import java.net.InetAddress;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.i */
/* compiled from: PG */
abstract class C108741i {

    /* renamed from: a */
    public static final C59071e f302388a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.deviceregistration.i");

    /* renamed from: j */
    static String m180855j(InetAddress inetAddress) {
        if (!(inetAddress instanceof Inet6Address)) {
            return String.format(inetAddress.getHostAddress(), new Object[0]);
        }
        if (!inetAddress.isLinkLocalAddress()) {
            return String.format("[%s]", new Object[]{inetAddress.getHostAddress()});
        }
        ((C59052c) ((C59052c) f302388a.mo56225c()).mo56372aa(24113)).mo56352E("Unsupported link-local IPv6 address: %s, scope_id: %d.", inetAddress.getHostAddress(), ((Inet6Address) inetAddress).getScopeId());
        return null;
    }

    /* renamed from: a */
    public abstract C108735h mo97098a();

    /* renamed from: b */
    public abstract C49875cf mo97099b();

    /* renamed from: c */
    public abstract Integer mo97100c();

    /* renamed from: d */
    public abstract String mo97101d();

    /* renamed from: e */
    public abstract String mo97102e();

    /* renamed from: f */
    public abstract String mo97103f();

    /* renamed from: g */
    public abstract String mo97104g();

    /* renamed from: h */
    public abstract String mo97105h();

    /* renamed from: i */
    public abstract String mo97106i();

    /* renamed from: k */
    public abstract String mo97107k();

    /* renamed from: l */
    public abstract String mo97108l();

    /* renamed from: m */
    public abstract String mo97109m();

    /* renamed from: n */
    public abstract String mo97110n();

    /* renamed from: o */
    public abstract String mo97111o();

    /* renamed from: p */
    public abstract InetAddress mo97112p();

    /* renamed from: q */
    public final boolean mo97113q() {
        return mo97109m() == null;
    }

    /* renamed from: r */
    public abstract boolean mo97114r();
}
