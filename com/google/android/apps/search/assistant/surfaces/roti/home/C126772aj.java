package com.google.android.apps.search.assistant.surfaces.roti.home;

import androidx.p104d.p105a.C2164c;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119840ch;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119841ci;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119843ck;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119844cl;
import com.google.android.libraries.search.assistant.p2705n.p2706a.C34830d;
import com.google.android.libraries.search.assistant.p2705n.p2706a.p2707a.C34822b;
import com.google.android.libraries.search.assistant.p2705n.p2708b.C34834b;
import com.google.assistant.p3897e.p3921j.C51806dv;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51808dx;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.agb;
import com.google.assistant.p3897e.p3921j.agc;
import com.google.protobuf.C63088z;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.roti.home.aj */
/* compiled from: PG */
public final /* synthetic */ class C126772aj implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C126778ap f349110a;

    /* renamed from: b */
    public final /* synthetic */ C119844cl f349111b;

    public /* synthetic */ C126772aj(C126778ap apVar, C119844cl clVar) {
        this.f349110a = apVar;
        this.f349111b = clVar;
    }

    public final void run() {
        C119843ck ckVar;
        C119840ch chVar;
        C119840ch chVar2;
        C126778ap apVar = this.f349110a;
        C119844cl clVar = this.f349111b;
        C119834cb cbVar = apVar.f349121a.f349132k;
        C119834cb cbVar2 = clVar.f333792c;
        if (cbVar2 == null) {
            cbVar2 = C119834cb.f333765b;
        }
        if (Objects.equals(cbVar, cbVar2)) {
            apVar.f349121a.mo107779l();
            int i = clVar.f333790a;
            int b = C119841ci.m198738b(i);
            int i2 = b - 1;
            if (b != 0) {
                if (i2 == 0) {
                    if (i == 2) {
                        ckVar = (C119843ck) clVar.f333791b;
                    } else {
                        ckVar = C119843ck.f333783d;
                    }
                    if (ckVar.f333786b) {
                        ((C2164c) apVar.f349121a.f349133l.orElseThrow(C126769ag.f349105a)).mo5439d(new C126848i());
                        apVar.f349121a.f349133l = Optional.empty();
                    }
                } else if (i2 == 1) {
                    ((C2164c) apVar.f349121a.f349133l.orElseThrow(C126767ae.f349103a)).mo5439d(new C126850k());
                    apVar.f349121a.f349133l = Optional.empty();
                } else if (i2 == 2) {
                    if (i == 4) {
                        chVar = (C119840ch) clVar.f333791b;
                    } else {
                        chVar = C119840ch.f333779b;
                    }
                    C34822b bVar = chVar.f333781a;
                    if (bVar == null) {
                        bVar = C34822b.f92358d;
                    }
                    C34834b bVar2 = bVar.f92362c;
                    if (bVar2 == null) {
                        bVar2 = C34834b.f92401c;
                    }
                    if (bVar2.f92404b != 386306917 || apVar.f349121a.f349139r.isEmpty()) {
                        C2164c cVar = (C2164c) apVar.f349121a.f349133l.orElseThrow(C126768af.f349104a);
                        if (clVar.f333790a == 4) {
                            chVar2 = (C119840ch) clVar.f333791b;
                        } else {
                            chVar2 = C119840ch.f333779b;
                        }
                        C34822b bVar3 = chVar2.f333781a;
                        if (bVar3 == null) {
                            bVar3 = C34822b.f92358d;
                        }
                        cVar.mo5439d(C34830d.m63594a(bVar3));
                        apVar.f349121a.f349133l = Optional.empty();
                    } else {
                        String str = (String) apVar.f349121a.f349139r.get();
                        agb agb = (agb) agc.f135031e.createBuilder();
                        agb.copyOnWrite();
                        agc agc = (agc) agb.instance;
                        str.getClass();
                        agc.f135033a |= 1;
                        agc.f135034b = str;
                        C51806dv dvVar = (C51806dv) C51807dw.f135930b.createBuilder();
                        C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
                        kbVar.copyOnWrite();
                        C52232kc kcVar = (C52232kc) kbVar.instance;
                        kcVar.f137064a |= 1;
                        kcVar.f137065b = "set_search_result_args";
                        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
                        jzVar.copyOnWrite();
                        C52230ka kaVar = (C52230ka) jzVar.instance;
                        kaVar.f137059a |= 1;
                        kaVar.f137060b = "assistant.api.client_op.SetSearchResultArgs";
                        C63088z byteString = ((agc) agb.build()).toByteString();
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
                        kcVar2.f137064a = 2 | kcVar2.f137064a;
                        dvVar.mo53732b(kbVar);
                        C51808dx dxVar = (C51808dx) C51809dy.f135933f.createBuilder();
                        dxVar.copyOnWrite();
                        C51809dy dyVar = (C51809dy) dxVar.instance;
                        dyVar.f135935a = 1 | dyVar.f135935a;
                        dyVar.f135936b = "search.SET_SEARCH_RESULT";
                        dxVar.copyOnWrite();
                        C51809dy dyVar2 = (C51809dy) dxVar.instance;
                        C51807dw dwVar = (C51807dw) dvVar.build();
                        dwVar.getClass();
                        dyVar2.f135938d = dwVar;
                        dyVar2.f135935a |= 4;
                        C51809dy dyVar3 = (C51809dy) dxVar.build();
                        C52235kf kfVar = C52235kf.OK;
                        try {
                            ((C2164c) apVar.f349121a.f349133l.get()).mo5437b(C126780ar.m207388h(dyVar3));
                        } catch (C126849j e) {
                            ((C2164c) apVar.f349121a.f349133l.get()).mo5439d(e);
                        } catch (C126852m e2) {
                            ((C2164c) apVar.f349121a.f349133l.get()).mo5439d(e2);
                        }
                    }
                }
                apVar.f349121a.f349132k = C119834cb.f333765b;
                return;
            }
            throw null;
        }
    }
}
