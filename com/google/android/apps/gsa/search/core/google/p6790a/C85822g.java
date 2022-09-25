package com.google.android.apps.gsa.search.core.google.p6790a;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.C91123v;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.search.assistant.platform.p9139g.p9140a.C120947c;
import com.google.android.libraries.assistant.auto.tng.common.p920j.p921a.C13273b;
import com.google.assistant.p3897e.p3917i.p3918a.C51231aa;
import com.google.assistant.p3897e.p3917i.p3918a.C51232ab;
import com.google.assistant.p3897e.p3917i.p3918a.C51233ac;
import com.google.assistant.p3897e.p3917i.p3918a.C51580mz;
import com.google.assistant.p3897e.p3917i.p3918a.C51636z;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C63088z;
import dagger.C68214a;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Collection;
import p3186j$.util.DesugarArrays;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.search.core.google.a.g */
/* compiled from: PG */
public final class C85822g {

    /* renamed from: a */
    public final Object f232057a = new Object();

    /* renamed from: b */
    public C63088z f232058b;

    /* renamed from: c */
    public C51580mz f232059c;

    /* renamed from: d */
    public String f232060d;

    /* renamed from: e */
    private final C68214a f232061e;

    /* renamed from: f */
    private final C68214a f232062f;

    /* renamed from: g */
    private final C68214a f232063g;

    /* renamed from: h */
    private final C68214a f232064h;

    public C85822g(C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4) {
        this.f232061e = aVar;
        this.f232062f = aVar2;
        this.f232063g = aVar3;
        this.f232064h = aVar4;
    }

    /* renamed from: b */
    public static C58833ax m137894b(C58833ax... axVarArr) {
        C51232ab abVar = (C51232ab) C51233ac.f133389b.createBuilder();
        C58485gu guVar = (C58485gu) DesugarArrays.stream((T[]) axVarArr).filter(C85819d.f232054a).map(C85820e.f232055a).collect(C58370cn.f155946a);
        if (guVar.isEmpty()) {
            return C58836b.f156633a;
        }
        Objects.requireNonNull(abVar);
        Collection.EL.forEach(guVar, new C85821f(abVar));
        C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
        kbVar.copyOnWrite();
        C52232kc kcVar = (C52232kc) kbVar.instance;
        kcVar.f137064a |= 1;
        kcVar.f137065b = "app_context_params";
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.params.AppContextParams";
        C63088z byteString = ((C51233ac) abVar.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        kbVar.copyOnWrite();
        C52232kc kcVar2 = (C52232kc) kbVar.instance;
        C52230ka kaVar3 = (C52230ka) jzVar.build();
        kaVar3.getClass();
        kcVar2.f137066c = kaVar3;
        kcVar2.f137064a |= 2;
        return C58833ax.m90834k((C52232kc) kbVar.build());
    }

    /* renamed from: c */
    public final C60870cx mo79465c() {
        C58833ax axVar;
        C58833ax axVar2;
        C51636z zVar;
        if (!((C86124t) this.f232061e.mo27525b()).mo79746e(C90086ek.f250516n) || !((C91123v) this.f232062f.mo27525b()).mo85390b()) {
            C58833ax[] axVarArr = new C58833ax[2];
            synchronized (this.f232057a) {
                C58833ax a = mo79464a();
                if (a.mo56113h() || this.f232059c != null) {
                    if (a.mo56113h()) {
                        zVar = (C51636z) a.mo56107c();
                    } else {
                        zVar = (C51636z) C51231aa.f133382f.createBuilder();
                    }
                    C51580mz mzVar = this.f232059c;
                    if (mzVar != null) {
                        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
                        jzVar.copyOnWrite();
                        C52230ka kaVar = (C52230ka) jzVar.instance;
                        kaVar.f137059a |= 1;
                        kaVar.f137060b = "assistant.api.params.ThirdPartyAppContextParams";
                        C63088z byteString = mzVar.toByteString();
                        jzVar.copyOnWrite();
                        C52230ka kaVar2 = (C52230ka) jzVar.instance;
                        byteString.getClass();
                        kaVar2.f137059a = 2 | kaVar2.f137059a;
                        kaVar2.f137061c = byteString;
                        zVar.mo53670b((C52230ka) jzVar.build());
                    }
                    axVar = C58833ax.m90834k((C51231aa) zVar.build());
                } else {
                    axVar = C58836b.f156633a;
                }
            }
            axVarArr[0] = axVar;
            C120947c cVar = (C120947c) ((AtomicReference) ((C58833ax) this.f232064h.mo27525b()).mo56106b(C85775a.f231927a).mo56109e(new AtomicReference())).get();
            if (cVar == null) {
                axVar2 = C58836b.f156633a;
            } else {
                axVar2 = C58833ax.m90833j(cVar.mo104960a());
            }
            axVarArr[1] = axVar2;
            return C60856cj.m92900i(m137894b(axVarArr));
        }
        C60870cx h = C60922j.m93045h(((C13273b) ((C58833ax) this.f232063g.mo27525b()).mo56107c()).mo21004a(), C85808b.f232031a, C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        return C60922j.m93044g(h, new C85818c(this), C60826bg.f164896a);
    }

    /* renamed from: a */
    public final C58833ax mo79464a() {
        synchronized (this.f232057a) {
            if (this.f232060d == null && this.f232058b == null) {
                C58836b bVar = C58836b.f156633a;
                return bVar;
            }
            C51636z zVar = (C51636z) C51231aa.f133382f.createBuilder();
            String str = this.f232060d;
            if (str != null) {
                zVar.copyOnWrite();
                C51231aa aaVar = (C51231aa) zVar.instance;
                aaVar.f133384a |= 2;
                aaVar.f133386c = str;
            }
            C63088z zVar2 = this.f232058b;
            if (zVar2 != null) {
                C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
                jzVar.copyOnWrite();
                C52230ka kaVar = (C52230ka) jzVar.instance;
                kaVar.f137059a |= 1;
                kaVar.f137060b = "assistant.api.params.UserContextParams";
                jzVar.copyOnWrite();
                C52230ka kaVar2 = (C52230ka) jzVar.instance;
                kaVar2.f137059a |= 2;
                kaVar2.f137061c = zVar2;
                zVar.mo53670b((C52230ka) jzVar.build());
            }
            C58833ax k = C58833ax.m90834k(zVar);
            return k;
        }
    }
}
