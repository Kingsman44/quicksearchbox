package com.google.android.libraries.search.assistant.performer.communication;

import com.google.android.libraries.search.assistant.performer.p2728a.C35471g;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.android.libraries.search.assistant.performer.p2767j.C36183e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52292mi;
import com.google.assistant.p3897e.p3921j.C52297mn;
import com.google.assistant.p3897e.p3921j.C52378pn;
import com.google.assistant.p3897e.p3921j.ade;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62963cj;
import com.google.protobuf.C62974ct;
import java.util.ArrayList;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.ae */
/* compiled from: PG */
public final class C35512ae implements C35472h {

    /* renamed from: a */
    private static final C59071e f93258a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.communication.ae");

    /* renamed from: b */
    private final C60887da f93259b;

    /* renamed from: c */
    private final C35516ai f93260c;

    /* renamed from: d */
    private final C35558bq f93261d;

    public C35512ae(C60887da daVar, C35516ai aiVar, C35558bq bqVar) {
        this.f93259b = daVar;
        this.f93260c = aiVar;
        this.f93261d = bqVar;
    }

    /* renamed from: a */
    public final C60870cx mo20766a(C51809dy dyVar) {
        Optional optional;
        if (dyVar.f135936b.equals("contact.CALL_HISTORY_LOOKUP")) {
            try {
                Optional c = C36183e.m64585c(dyVar, "contact_query_args", C52292mi.f137270e.getParserForType());
                if (!c.isPresent()) {
                    ((C59052c) ((C59052c) f93258a.mo56226d()).mo56372aa(51610)).mo56386p("CallHistoryContactQueryArgs is not present");
                    return C60856cj.m92900i(C36180b.m64578b(C52235kf.INVALID_ARGUMENT));
                }
                C52292mi miVar = (C52292mi) c.get();
                C62963cj cjVar = new C62963cj(miVar.f137274c, C52292mi.f137269d);
                if (!cjVar.isEmpty()) {
                    if (cjVar.size() != 1 || !((C52297mn) cjVar.get(0)).equals(C52297mn.UNKNOWN_TYPE)) {
                        ArrayList arrayList = new ArrayList();
                        C52378pn pnVar = miVar.f137272a;
                        if (pnVar == null) {
                            pnVar = C52378pn.f137444j;
                        }
                        if ((pnVar.f137446a & 2) != 0) {
                            C52378pn pnVar2 = miVar.f137272a;
                            if (pnVar2 == null) {
                                pnVar2 = C52378pn.f137444j;
                            }
                            arrayList.add(pnVar2.f137450e);
                        }
                        C52378pn pnVar3 = miVar.f137272a;
                        if (pnVar3 == null) {
                            pnVar3 = C52378pn.f137444j;
                        }
                        ade ade = pnVar3.f137449d;
                        if (ade == null) {
                            ade = ade.f134877h;
                        }
                        if ((ade.f134879a & 8) != 0) {
                            C52378pn pnVar4 = miVar.f137272a;
                            if (pnVar4 == null) {
                                pnVar4 = C52378pn.f137444j;
                            }
                            ade ade2 = pnVar4.f137449d;
                            if (ade2 == null) {
                                ade2 = ade.f134877h;
                            }
                            arrayList.add(ade2.f134883e);
                        }
                        C52378pn pnVar5 = miVar.f137272a;
                        if (pnVar5 == null) {
                            pnVar5 = C52378pn.f137444j;
                        }
                        ade ade3 = pnVar5.f137449d;
                        if (ade3 == null) {
                            ade3 = ade.f134877h;
                        }
                        arrayList.addAll(ade3.f134884f);
                        C58485gu guVar = (C58485gu) Collection.EL.stream(miVar.f137273b).filter(C35780z.f93737a).map(C35508aa.f93252a).collect(C58370cn.f155946a);
                        if (arrayList.isEmpty()) {
                            return mo39683b(cjVar, (List) null);
                        }
                        C35558bq bqVar = this.f93261d;
                        C52378pn pnVar6 = miVar.f137272a;
                        if (((pnVar6 == null ? C52378pn.f137444j : pnVar6).f137446a & 32) != 0) {
                            if (pnVar6 == null) {
                                pnVar6 = C52378pn.f137444j;
                            }
                            optional = Optional.m71637of(pnVar6.f137452g);
                        } else {
                            optional = Optional.empty();
                        }
                        return C60922j.m93045h(bqVar.mo39702a(arrayList, guVar, optional), C47810es.m84966f(new C35509ab(this, cjVar)), this.f93259b);
                    }
                }
                return C60856cj.m92900i(C36180b.m64579c(C52235kf.INVALID_ARGUMENT, "CallHistoryType is not set."));
            } catch (C62974ct e) {
                ((C59052c) ((C59052c) ((C59052c) f93258a.mo56226d()).mo56382g(e)).mo56372aa(51609)).mo56386p("Failed to parse CallHistoryContactQueryArgs");
                return C60856cj.m92900i(C36180b.m64578b(C52235kf.INVALID_ARGUMENT));
            }
        } else {
            throw new C35471g(String.format("Unexpected ClientOpName. Expected %s, but got %s", new Object[]{"contact.CALL_HISTORY_LOOKUP", dyVar.f135936b}));
        }
    }

    /* renamed from: b */
    public final C60870cx mo39683b(List list, List list2) {
        C60870cx cxVar;
        ArrayList arrayList = new ArrayList();
        C58485gu guVar = (C58485gu) Collection.EL.stream(list).filter(C35510ac.f93255a).collect(C58370cn.f155946a);
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C52297mn mnVar = (C52297mn) guVar.get(i);
            if (list2 == null) {
                cxVar = this.f93260c.mo39689a(mnVar);
            } else {
                cxVar = this.f93260c.mo39690b(mnVar, list2);
            }
            arrayList.add(cxVar);
        }
        return C47638k.m84750a(arrayList).mo51520a(new C35511ad(arrayList, guVar), this.f93259b);
    }
}
