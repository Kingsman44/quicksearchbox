package com.google.android.apps.gsa.staticplugins.smartspace;

import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.staticplugins.smartspace.p8759a.C117337a;
import com.google.android.apps.gsa.staticplugins.smartspace.p8759a.C117341c;
import com.google.assistant.p3886c.C50785ci;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50818do;
import com.google.assistant.p3886c.C50819dp;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58970a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.Map;
import p3186j$.util.Objects;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.staticplugins.smartspace.g */
/* compiled from: PG */
public final /* synthetic */ class C117390g implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C117432m f325875a;

    /* renamed from: b */
    public final /* synthetic */ C58528ij f325876b;

    /* renamed from: c */
    public final /* synthetic */ C50785ci f325877c;

    public /* synthetic */ C117390g(C117432m mVar, C58528ij ijVar, C50785ci ciVar) {
        this.f325875a = mVar;
        this.f325876b = ijVar;
        this.f325877c = ciVar;
    }

    public final Object apply(Object obj) {
        C117432m mVar = this.f325875a;
        C58528ij ijVar = this.f325876b;
        C50785ci ciVar = this.f325877c;
        List list = (List) obj;
        if (list == null) {
            ((C58970a) ((C58970a) mVar.f325946a.mo56225c()).mo56372aa(32991)).mo56386p("The bluechip card list is null");
        }
        ((C58970a) ((C58970a) mVar.f325946a.mo56224b()).mo56372aa(32988)).mo56387q("Non-empty bluechip card list, size: %d", list.size());
        Stream map = Collection.EL.stream(list).filter(new C117425i(ijVar)).map(C117428j.f325935a).map(new C117430k(mVar));
        Objects.requireNonNull(ciVar);
        map.forEach(new C117431l(ciVar));
        Collections.unmodifiableList(((C50819dp) ciVar.instance).f132332a).size();
        ((C58970a) ((C58970a) mVar.f325946a.mo56224b()).mo56372aa(32990)).mo56386p("attempt to aiaiConnect");
        if (!mVar.f325947b.mo79746e(C90017bw.f247869K)) {
            return (C50819dp) ciVar.build();
        }
        C117341c cVar = mVar.f325949d;
        ArrayList arrayList = new ArrayList();
        for (C50818do doVar : ((C50819dp) ciVar.build()).f132332a) {
            Map map2 = cVar.f325710a;
            C50794cr a = C50794cr.m85938a(doVar.f132315l);
            if (a == null) {
                a = C50794cr.UNDEFINED;
            }
            arrayList.add(((C117337a) Map.EL.getOrDefault(map2, Integer.valueOf(a.f132222T), cVar.f325712c)).mo103265a(doVar));
        }
        Collections.sort(arrayList, Comparator.EL.reversed(cVar.f325711b));
        C50785ci ciVar2 = (C50785ci) C50819dp.f132330b.createBuilder();
        ciVar2.mo53456a(arrayList);
        return (C50819dp) ciVar2.build();
    }
}
