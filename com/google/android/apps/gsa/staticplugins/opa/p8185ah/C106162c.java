package com.google.android.apps.gsa.staticplugins.opa.p8185ah;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.search.core.google.p6790a.C85812bd;
import com.google.android.apps.gsa.search.core.p6513aj.C84516aa;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.assistant.p3897e.p3917i.p3918a.C51439ht;
import com.google.assistant.p3897e.p3917i.p3918a.C51441hv;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C63088z;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ah.c */
/* compiled from: PG */
public final class C106162c implements C85812bd {

    /* renamed from: a */
    private final C89994f f296280a;

    /* renamed from: b */
    private final C86124t f296281b;

    /* renamed from: c */
    private final SharedPreferences f296282c;

    /* renamed from: d */
    private final C68214a f296283d;

    /* renamed from: e */
    private final C106174o f296284e;

    public C106162c(C89994f fVar, C86124t tVar, SharedPreferences sharedPreferences, C106174o oVar, C68214a aVar) {
        this.f296280a = fVar;
        this.f296281b = tVar;
        this.f296282c = sharedPreferences;
        this.f296284e = oVar;
        this.f296283d = aVar;
    }

    /* renamed from: a */
    public final C58833ax mo79460a(Query query) {
        boolean z;
        if (this.f296281b.mo79746e(C90014bt.f247331fD)) {
            z = ((C84516aa) this.f296283d.mo27525b()).f230023b.isDeviceLocked();
            C58976aa aaVar = C58975e.f156826a;
        } else {
            z = this.f296284e.f296315b;
        }
        if (!this.f296281b.mo79746e(C90014bt.f247232dK) || !z) {
            return C58836b.f156633a;
        }
        C51439ht htVar = (C51439ht) C51441hv.f133969d.createBuilder();
        if (this.f296281b.mo79746e(C90014bt.f247797nt)) {
            htVar.copyOnWrite();
            C51441hv hvVar = (C51441hv) htVar.instance;
            hvVar.f133971a |= 2;
            hvVar.f133973c = true;
            this.f296280a.mo83839y();
            if (!this.f296282c.getBoolean("opa_lockscreen_permission_promo_updated", false)) {
                SharedPreferences.Editor edit = this.f296282c.edit();
                edit.putBoolean("opa_lockscreen_permission_promo_not_needed", false);
                edit.putInt("opa_lockscreen_permission_promo_count", 0);
                edit.putBoolean("opa_lockscreen_permission_promo_updated", true);
                edit.apply();
            }
        }
        if ("and.opa.lockscreen.hotword".equals(query.mo84355bn()) && !this.f296280a.mo83835A() && !this.f296282c.getBoolean("opa_lockscreen_permission_promo_not_needed", false) && ((long) this.f296282c.getInt("opa_lockscreen_permission_promo_count", 0)) < this.f296281b.mo79743a(C90014bt.f247547jH)) {
            if (!this.f296281b.mo79746e(C90014bt.f247797nt) || this.f296280a.mo83838x() != 2) {
                C58976aa aaVar2 = C58975e.f156826a;
                htVar.copyOnWrite();
                C51441hv hvVar2 = (C51441hv) htVar.instance;
                hvVar2.f133972b = 1;
                hvVar2.f133971a |= 1;
            } else {
                C58976aa aaVar3 = C58975e.f156826a;
                htVar.copyOnWrite();
                C51441hv hvVar3 = (C51441hv) htVar.instance;
                hvVar3.f133972b = 3;
                hvVar3.f133971a |= 1;
            }
        }
        C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
        kbVar.copyOnWrite();
        C52232kc kcVar = (C52232kc) kbVar.instance;
        kcVar.f137064a |= 1;
        kcVar.f137065b = "asst.lockscreen.params";
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.params.LockscreenParams";
        C63088z byteString = ((C51441hv) htVar.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        C52230ka kaVar3 = (C52230ka) jzVar.build();
        kbVar.copyOnWrite();
        C52232kc kcVar2 = (C52232kc) kbVar.instance;
        kaVar3.getClass();
        kcVar2.f137066c = kaVar3;
        kcVar2.f137064a |= 2;
        return C58833ax.m90834k((C52232kc) kbVar.build());
    }
}
