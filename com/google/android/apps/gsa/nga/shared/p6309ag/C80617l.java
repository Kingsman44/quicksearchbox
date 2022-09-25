package com.google.android.apps.gsa.nga.shared.p6309ag;

import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.p7130s.p7133b.C90479a;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.assistant.p1363c.p1371b.p1372a.C17030b;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.ag.l */
/* compiled from: PG */
public final class C80617l {

    /* renamed from: a */
    public static final C58974d f221294a = C58974d.m91136j();

    /* renamed from: b */
    public final C58495hd f221295b;

    /* renamed from: c */
    private final C58495hd f221296c;

    /* renamed from: d */
    private final C91142g f221297d;

    /* renamed from: e */
    private final C90479a f221298e;

    public C80617l(C91142g gVar, C90479a aVar, Map map) {
        this.f221297d = gVar;
        this.f221298e = aVar;
        this.f221296c = C58495hd.m89898l(map);
        this.f221295b = (C58495hd) Collection.EL.stream(((C58495hd) map).entrySet()).collect(C58370cn.m89403c(C80614i.f221291a, C80615j.f221292a, C80616k.f221293a));
    }

    /* renamed from: g */
    public static boolean m128238g(String str) {
        return str.startsWith("apa_") || str.equals(C80624s.NGA_DICTATION_FORMATTING.f221334z);
    }

    /* renamed from: a */
    public final C80627v mo74366a(String str) {
        return (C80627v) ((Optional) C80624s.m128250c(str).map(C80601a.f221275a).orElseGet(new C80607b(this, str))).orElse(C80627v.UNRECOGNIZED);
    }

    /* renamed from: b */
    public final Optional mo74367b(C80627v vVar) {
        if (!mo74371f()) {
            return Optional.empty();
        }
        return Optional.ofNullable((C17030b) this.f221296c.get(vVar));
    }

    /* renamed from: c */
    public final String mo74368c(C80627v vVar) {
        C80624s a = C80624s.m128248a(vVar);
        return mo74371f() ? (String) mo74367b(vVar).map(C80612g.f221288a).orElseGet(new C80613h(vVar, a)) : a.f221333y;
    }

    /* renamed from: d */
    public final String mo74369d(C80627v vVar) {
        if (!vVar.equals(C80627v.SKIP_COMPONENT_LIST) || mo74371f()) {
            return mo74368c(vVar);
        }
        return "nga_skip_component_list";
    }

    /* renamed from: e */
    public final String mo74370e() {
        return String.valueOf(mo74368c(C80627v.WEBREF)).concat("-index");
    }

    /* renamed from: f */
    public final boolean mo74371f() {
        return this.f221297d.mo85405j(C90126fx.f251736oT) && this.f221298e.mo84230e();
    }
}
