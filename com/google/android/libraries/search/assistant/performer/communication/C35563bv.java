package com.google.android.libraries.search.assistant.performer.communication;

import android.provider.ContactsContract;
import android.text.TextUtils;
import com.google.android.gms.appdatasearch.SearchResults;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C52622yo;
import com.google.assistant.p3897e.p3921j.C52623yp;
import com.google.assistant.p3897e.p3921j.adf;
import com.google.assistant.p3897e.p3921j.adm;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58532in;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.bv */
/* compiled from: PG */
public final /* synthetic */ class C35563bv implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C35573cb f93379a;

    /* renamed from: b */
    public final /* synthetic */ Optional f93380b;

    /* renamed from: c */
    public final /* synthetic */ List f93381c;

    public /* synthetic */ C35563bv(C35573cb cbVar, Optional optional, List list) {
        this.f93379a = cbVar;
        this.f93380b = optional;
        this.f93381c = list;
    }

    public final C60870cx apply(Object obj) {
        C35573cb cbVar = this.f93379a;
        Optional optional = this.f93380b;
        List list = this.f93381c;
        C58485gu guVar = (C58485gu) Collection.EL.stream(C58485gu.m89841i((SearchResults) obj)).map(C35564bw.f93382a).filter(C35565bx.f93383a).map(C35566by.f93384a).collect(C58370cn.f155946a);
        if (!optional.isEmpty() && !TextUtils.isEmpty((CharSequence) optional.get())) {
            C58480gp e = C58485gu.m89837e();
            int size = guVar.size();
            for (int i = 0; i < size; i++) {
                adm adm = (adm) guVar.get(i);
                C52623yp ypVar = adm.f134892b;
                if (ypVar == null) {
                    ypVar = C52623yp.f138162g;
                }
                C58485gu guVar2 = (C58485gu) Collection.EL.stream(ypVar.f138169f).filter(new C35567bz(optional)).collect(C58370cn.f155946a);
                C52623yp ypVar2 = adm.f134892b;
                if (ypVar2 == null) {
                    ypVar2 = C52623yp.f138162g;
                }
                C58485gu guVar3 = (C58485gu) Collection.EL.stream(ypVar2.f138168e).filter(new C35572ca(optional)).collect(C58370cn.f155946a);
                if (!guVar2.isEmpty() || !guVar3.isEmpty()) {
                    C52623yp ypVar3 = adm.f134892b;
                    if (ypVar3 == null) {
                        ypVar3 = C52623yp.f138162g;
                    }
                    C52622yo yoVar = (C52622yo) ypVar3.toBuilder();
                    if (!guVar2.isEmpty()) {
                        yoVar.copyOnWrite();
                        ((C52623yp) yoVar.instance).f138169f = C52623yp.emptyProtobufList();
                        yoVar.mo53890c(guVar2);
                    }
                    if (!guVar3.isEmpty()) {
                        yoVar.copyOnWrite();
                        ((C52623yp) yoVar.instance).f138168e = C52623yp.emptyProtobufList();
                        yoVar.mo53889b(guVar3);
                    }
                    adf adf = (adf) adm.toBuilder();
                    adf.copyOnWrite();
                    adm adm2 = (adm) adf.instance;
                    C52623yp ypVar4 = (C52623yp) yoVar.build();
                    ypVar4.getClass();
                    adm2.f134892b = ypVar4;
                    adm2.f134891a |= 1;
                    e.mo55395g((adm) adf.build());
                } else {
                    e.mo55395g(adm);
                }
            }
            guVar = e.mo55394f();
        }
        if (list.isEmpty()) {
            return C60856cj.m92900i(guVar);
        }
        return C60922j.m93044g(cbVar.f93397c.mo50872b(ContactsContract.Data.CONTENT_URI, new String[]{"contact_id", "account_type", "sourceid", "mimetype", "data1", "data3", "_id"}, String.format("%s IN (%s)", new Object[]{"contact_id", TextUtils.join(",", (C58528ij) Collection.EL.stream(guVar).map(C35560bs.f93376a).collect(C58370cn.f155947b))}), (String[]) null, (String) null).f121591a.mo57272e(C47810es.m84970j(new C35706eb((C58532in) Collection.EL.stream(list).filter(C35690dy.f93580a).collect(C58370cn.m89405e(C35691dz.f93581a, C35705ea.f93607a)), cbVar.f93398d)), cbVar.f93396b).mo57275g(), C47810es.m84963c(new C35561bt(guVar)), cbVar.f93396b);
    }
}
