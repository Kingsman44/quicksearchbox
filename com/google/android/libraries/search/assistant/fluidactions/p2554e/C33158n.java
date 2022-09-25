package com.google.android.libraries.search.assistant.fluidactions.p2554e;

import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.assistant.p3897e.p3921j.C52610yc;
import com.google.assistant.p3897e.p3921j.C52611yd;
import com.google.assistant.p3897e.p3921j.C52613yf;
import com.google.assistant.p3897e.p3921j.C52616yi;
import com.google.assistant.p3897e.p3921j.C52617yj;
import com.google.assistant.p3897e.p3921j.C52622yo;
import com.google.assistant.p3897e.p3921j.C52623yp;
import com.google.assistant.p3897e.p3921j.C52624yq;
import com.google.assistant.p3897e.p3921j.C52625yr;
import com.google.assistant.p3897e.p3921j.C52626ys;
import com.google.assistant.p3897e.p3921j.C52627yt;
import com.google.assistant.p3897e.p3921j.C52628yu;
import com.google.assistant.p3897e.p3921j.C52629yv;
import com.google.assistant.p3897e.p3921j.C52632yy;
import com.google.assistant.p3897e.p3921j.C52633yz;
import com.google.assistant.p3897e.p3921j.adf;
import com.google.assistant.p3897e.p3921j.adm;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62947c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.e.n */
/* compiled from: PG */
public final /* synthetic */ class C33158n implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f88701a;

    /* renamed from: b */
    public final /* synthetic */ long f88702b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f88703c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f88704d;

    /* renamed from: e */
    public final /* synthetic */ C60870cx f88705e;

    /* renamed from: f */
    public final /* synthetic */ C60870cx f88706f;

    public /* synthetic */ C33158n(C60870cx cxVar, long j, C60870cx cxVar2, C60870cx cxVar3, C60870cx cxVar4, C60870cx cxVar5) {
        this.f88701a = cxVar;
        this.f88702b = j;
        this.f88703c = cxVar2;
        this.f88704d = cxVar3;
        this.f88705e = cxVar4;
        this.f88706f = cxVar5;
    }

    public final Object call() {
        Map map;
        HashSet hashSet;
        Iterator it;
        C60870cx cxVar = this.f88701a;
        long j = this.f88702b;
        C60870cx cxVar2 = this.f88703c;
        C60870cx cxVar3 = this.f88704d;
        C60870cx cxVar4 = this.f88705e;
        C60870cx cxVar5 = this.f88706f;
        if (cxVar != null) {
            try {
                map = (Map) C60856cj.m92909r(cxVar);
            } catch (ExecutionException e) {
                ((C59052c) ((C59052c) ((C59052c) C33163s.f88709a.mo56226d()).mo56382g(e)).mo56372aa(51197)).mo56388r("Failed to fetch PersonalContactData for ContactId %d", j);
                return Optional.empty();
            }
        } else {
            map = null;
        }
        Optional optional = (Optional) C60856cj.m92909r(cxVar2);
        List list = (List) C60856cj.m92909r(cxVar3);
        List list2 = (List) C60856cj.m92909r(cxVar4);
        List<Long> list3 = (List) C60856cj.m92909r(cxVar5);
        if (!optional.isPresent()) {
            ((C59052c) ((C59052c) C33163s.f88709a.mo56226d()).mo56372aa(51195)).mo56388r("fetchPersonalContactData() : No Result for ContactId: %d", j);
            return Optional.empty();
        }
        C52616yi yiVar = (C52616yi) C52617yj.f138146b.createBuilder();
        if (map != null) {
            Long valueOf = Long.valueOf(j);
            if (map.containsKey(valueOf)) {
                Map map2 = (Map) map.get(valueOf);
                map2.getClass();
                if (map2.containsKey("com.whatsapp")) {
                    List<C52633yz> list4 = (List) map2.get("com.whatsapp");
                    list4.getClass();
                    HashSet hashSet2 = new HashSet();
                    for (C52633yz yzVar : list4) {
                        C52613yf yfVar = yzVar.f138197d;
                        if (yfVar == null) {
                            yfVar = C52613yf.f138138f;
                        }
                        String str = yfVar.f138141b;
                        if (!TextUtils.isEmpty(str) && str.endsWith("@s.whatsapp.net")) {
                            hashSet2.add(PhoneNumberUtils.normalizeNumber(str.substring(0, str.length() - 15)));
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        C52629yv yvVar = (C52629yv) it2.next();
                        if (hashSet2.contains(PhoneNumberUtils.normalizeNumber(yvVar.f138184c).replace("+", BuildConfig.FLAVOR))) {
                            C52628yu yuVar = (C52628yu) yvVar.toBuilder();
                            C52624yq yqVar = (C52624yq) C52625yr.f138170e.createBuilder();
                            C52610yc ycVar = (C52610yc) C52611yd.f138135b.createBuilder();
                            C52632yy yyVar = (C52632yy) C52633yz.f138192f.createBuilder();
                            yyVar.copyOnWrite();
                            it = it2;
                            C52633yz yzVar2 = (C52633yz) yyVar.instance;
                            hashSet = hashSet2;
                            yzVar2.f138194a |= 2;
                            yzVar2.f138196c = "whatsapp";
                            yyVar.copyOnWrite();
                            C52633yz yzVar3 = (C52633yz) yyVar.instance;
                            yzVar3.f138194a |= 1;
                            yzVar3.f138195b = "com.whatsapp";
                            ycVar.mo53885a(yyVar);
                            yqVar.copyOnWrite();
                            C52625yr yrVar = (C52625yr) yqVar.instance;
                            C52611yd ydVar = (C52611yd) ycVar.build();
                            ydVar.getClass();
                            yrVar.f138174c = ydVar;
                            yrVar.f138172a |= 2;
                            yuVar.copyOnWrite();
                            C52629yv yvVar2 = (C52629yv) yuVar.instance;
                            C52625yr yrVar2 = (C52625yr) yqVar.build();
                            yrVar2.getClass();
                            yvVar2.f138183b = yrVar2;
                            yvVar2.f138182a |= 1;
                            arrayList.add((C52629yv) yuVar.build());
                        } else {
                            it = it2;
                            hashSet = hashSet2;
                            arrayList.add(yvVar);
                        }
                        it2 = it;
                        hashSet2 = hashSet;
                    }
                    list = arrayList;
                }
                for (List addAll : map2.values()) {
                    yiVar.copyOnWrite();
                    C52617yj yjVar = (C52617yj) yiVar.instance;
                    yjVar.mo53887a();
                    C62947c.addAll((Iterable) addAll, (List) yjVar.f138148a);
                }
            }
        }
        C52626ys ysVar = (C52626ys) C52627yt.f138176c.createBuilder();
        for (Long l : list3) {
            if (l.longValue() >= 0) {
                ysVar.mo53900b(l.longValue());
            }
        }
        ysVar.mo53901c(yiVar);
        adf adf = (adf) adm.f134889h.createBuilder();
        C52622yo yoVar = (C52622yo) ((C52623yp) optional.get()).toBuilder();
        yoVar.mo53890c(list);
        yoVar.mo53889b(list2);
        yoVar.copyOnWrite();
        C52623yp ypVar = (C52623yp) yoVar.instance;
        C52627yt ytVar = (C52627yt) ysVar.build();
        ytVar.getClass();
        ypVar.f138165b = ytVar;
        ypVar.f138164a |= 1;
        adf.copyOnWrite();
        adm adm = (adm) adf.instance;
        C52623yp ypVar2 = (C52623yp) yoVar.build();
        ypVar2.getClass();
        adm.f134892b = ypVar2;
        adm.f134891a |= 1;
        return Optional.m71637of((adm) adf.build());
    }
}
