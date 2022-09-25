package com.google.android.apps.search.assistant.verticals.ambient.p9905c.p9910e;

import com.google.android.apps.gsa.opa.smartspace.p6455d.C83778u;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3886c.C50698aj;
import com.google.assistant.p3886c.C50699ak;
import com.google.assistant.p3886c.C50777ca;
import com.google.assistant.p3886c.C50778cb;
import com.google.assistant.p3886c.C50790cn;
import com.google.assistant.p3886c.C50812di;
import com.google.assistant.p3886c.C50813dj;
import com.google.assistant.p3886c.C50818do;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.c.e.a */
/* compiled from: PG */
public final /* synthetic */ class C130587a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C130588b f357682a;

    /* renamed from: b */
    public final /* synthetic */ C83778u f357683b;

    public /* synthetic */ C130587a(C130588b bVar, C83778u uVar) {
        this.f357682a = bVar;
        this.f357683b = uVar;
    }

    public final Object apply(Object obj) {
        C130588b bVar = this.f357682a;
        C83778u uVar = this.f357683b;
        C50818do doVar = (C50818do) obj;
        C50698aj ajVar = (C50698aj) C50699ak.f131906e.createBuilder();
        Iterable iterable = (Iterable) Collection.EL.stream(uVar.f228344d).limit(10).collect(C58370cn.f155946a);
        ajVar.copyOnWrite();
        C50699ak akVar = (C50699ak) ajVar.instance;
        C62971cq cqVar = akVar.f131909b;
        if (!cqVar.mo58948c()) {
            akVar.f131909b = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) akVar.f131909b);
        int i = uVar.f228345e;
        ajVar.copyOnWrite();
        C50699ak akVar2 = (C50699ak) ajVar.instance;
        akVar2.f131908a |= 1;
        akVar2.f131910c = i;
        if (uVar.f228345e == 0) {
            String string = bVar.f357684a.getString(R.string.assistant_shopping_list_no_items_placeholder);
            ajVar.copyOnWrite();
            C50699ak akVar3 = (C50699ak) ajVar.instance;
            string.getClass();
            akVar3.f131908a |= 2;
            akVar3.f131911d = string;
        }
        C50777ca caVar = (C50777ca) C50778cb.f132140c.createBuilder();
        caVar.copyOnWrite();
        C50778cb cbVar = (C50778cb) caVar.instance;
        C50699ak akVar4 = (C50699ak) ajVar.build();
        akVar4.getClass();
        cbVar.f132144b = akVar4;
        cbVar.f132143a |= 1;
        C50778cb cbVar2 = (C50778cb) caVar.build();
        C50790cn cnVar = (C50790cn) doVar.toBuilder();
        C50813dj djVar = doVar.f132329z;
        if (djVar == null) {
            djVar = C50813dj.f132278a;
        }
        C50812di diVar = (C50812di) djVar.toBuilder();
        diVar.mo58885m(C50778cb.f132141d, cbVar2);
        cnVar.copyOnWrite();
        C50818do doVar2 = (C50818do) cnVar.instance;
        C50813dj djVar2 = (C50813dj) diVar.build();
        djVar2.getClass();
        doVar2.f132329z = djVar2;
        doVar2.f132304a |= 33554432;
        return (C50818do) cnVar.build();
    }
}
