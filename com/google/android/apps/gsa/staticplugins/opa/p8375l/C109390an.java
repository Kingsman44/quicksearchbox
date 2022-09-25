package com.google.android.apps.gsa.staticplugins.opa.p8375l;

import com.google.assistant.p4008y.p4009a.C53592by;
import com.google.assistant.p4008y.p4009a.C53593bz;
import com.google.common.base.C58817ah;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.l.an */
/* compiled from: PG */
public final /* synthetic */ class C109390an implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C53593bz f304676a;

    public /* synthetic */ C109390an(C53593bz bzVar) {
        this.f304676a = bzVar;
    }

    public final Object apply(Object obj) {
        C53593bz bzVar = this.f304676a;
        C109383ag agVar = (C109383ag) obj;
        Pattern pattern = C109398av.f304687a;
        if (agVar == null) {
            return bzVar;
        }
        Matcher matcher = C109398av.f304687a.matcher(bzVar.f140661b);
        C53592by byVar = (C53592by) bzVar.toBuilder();
        while (matcher.find()) {
            String group = matcher.group(1);
            String str = "%" + group + "%";
            if (group != null && group.equals("call_contact")) {
                List list = (List) Collection.EL.stream(agVar.mo97803a()).limit(5).filter(C109391ao.f304677a).collect(Collectors.toList());
                if (C109398av.f304688b.size() == list.size()) {
                    C109398av.f304688b.clear();
                }
                C109398av.m182093b(list, C109398av.f304688b, str, byVar, bzVar.f140661b);
            } else if (group != null && group.equals("text_contact")) {
                List list2 = (List) Collection.EL.stream(agVar.mo97804b()).limit(5).filter(C109392ap.f304678a).collect(Collectors.toList());
                if (C109398av.f304689c.size() == list2.size()) {
                    C109398av.f304689c.clear();
                }
                C109398av.m182093b(list2, C109398av.f304689c, str, byVar, bzVar.f140661b);
            }
        }
        return (C53593bz) byVar.build();
    }
}
