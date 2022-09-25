package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a;

import com.google.android.apps.gsa.nga.api.C74713bn;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6293m.p6294a.C80496d;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a.p8083c.C103551m;
import com.google.assistant.p3897e.p3917i.p3918a.C51303cs;
import com.google.assistant.p3897e.p3917i.p3918a.C51334dw;
import com.google.assistant.p3897e.p3917i.p3918a.C51353eo;
import com.google.assistant.p3897e.p3917i.p3918a.C51357es;
import com.google.assistant.p3897e.p3917i.p3918a.C51358et;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.a.u */
/* compiled from: PG */
public final /* synthetic */ class C103641u implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C58833ax f288698a;

    /* renamed from: b */
    public final /* synthetic */ C69464a f288699b;

    /* renamed from: c */
    public final /* synthetic */ C103551m f288700c;

    /* renamed from: d */
    public final /* synthetic */ C69464a f288701d;

    public /* synthetic */ C103641u(C58833ax axVar, C69464a aVar, C103551m mVar, C69464a aVar2) {
        this.f288698a = axVar;
        this.f288699b = aVar;
        this.f288700c = mVar;
        this.f288701d = aVar2;
    }

    public final Object apply(Object obj) {
        C51357es esVar;
        C58833ax axVar = this.f288698a;
        C69464a aVar = this.f288699b;
        C103551m mVar = this.f288700c;
        C51334dw dwVar = (C51334dw) obj;
        int i = 3;
        int i2 = true != ((C74713bn) this.f288701d.mo17428b()).mo71078c() ? 4 : 3;
        C51303cs csVar = (C51303cs) dwVar.toBuilder();
        csVar.copyOnWrite();
        C51334dw dwVar2 = (C51334dw) csVar.instance;
        dwVar2.f133670K = i2 - 1;
        dwVar2.f133688b |= 65536;
        if (true != mVar.equals(C103551m.TEXT)) {
            i = 2;
        }
        csVar.copyOnWrite();
        C51334dw dwVar3 = (C51334dw) csVar.instance;
        dwVar3.f133676R = i - 1;
        dwVar3.f133688b |= 536870912;
        if (axVar.mo56113h()) {
            C80496d dVar = (C80496d) axVar.mo56107c();
            if ((!((C90021c) aVar.mo17428b()).mo79746e(C90126fx.f251492jo) || !dVar.f220971b) && dVar.f220970a) {
                esVar = C51357es.ON;
            } else {
                esVar = C51357es.OFF;
            }
            C51358et etVar = dwVar.f133710x;
            if (etVar == null) {
                etVar = C51358et.f133769d;
            }
            C51353eo eoVar = (C51353eo) etVar.toBuilder();
            eoVar.copyOnWrite();
            C51358et etVar2 = (C51358et) eoVar.instance;
            etVar2.f133772b = esVar.f133768d;
            etVar2.f133771a |= 1;
            csVar.copyOnWrite();
            C51334dw dwVar4 = (C51334dw) csVar.instance;
            C51358et etVar3 = (C51358et) eoVar.build();
            etVar3.getClass();
            dwVar4.f133710x = etVar3;
            dwVar4.f133685a |= 268435456;
        }
        return (C51334dw) csVar.build();
    }
}
