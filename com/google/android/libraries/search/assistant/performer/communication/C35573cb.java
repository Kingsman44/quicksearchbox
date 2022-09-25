package com.google.android.libraries.search.assistant.performer.communication;

import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.appdatasearch.C142826w;
import com.google.android.gms.appdatasearch.CorpusId;
import com.google.android.gms.appdatasearch.GlobalSearchQuerySpecification;
import com.google.android.gms.search.queries.C145948p;
import com.google.android.gms.search.queries.p10874b.C145929a;
import com.google.android.gms.search.queries.p10874b.C145931c;
import com.google.android.libraries.p3339v.C43205e;
import com.google.apps.tiktok.dataservice.C46877q;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C52610yc;
import com.google.assistant.p3897e.p3921j.C52611yd;
import com.google.assistant.p3897e.p3921j.C52624yq;
import com.google.assistant.p3897e.p3921j.C52625yr;
import com.google.assistant.p3897e.p3921j.C52632yy;
import com.google.assistant.p3897e.p3921j.C52633yz;
import com.google.common.base.C58827ar;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.cb */
/* compiled from: PG */
public final class C35573cb implements C35558bq {

    /* renamed from: a */
    public static final C52625yr f93393a;

    /* renamed from: e */
    private static final C59071e f93394e = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.communication.cb");

    /* renamed from: f */
    private static final CorpusId f93395f = new CorpusId("com.google.android.gms", "internal.3p:Person", (Bundle) null);

    /* renamed from: b */
    public final C60887da f93396b;

    /* renamed from: c */
    public final C46877q f93397c;

    /* renamed from: d */
    public final PackageManager f93398d;

    /* renamed from: g */
    private final C145948p f93399g;

    static {
        C52624yq yqVar = (C52624yq) C52625yr.f138170e.createBuilder();
        C52610yc ycVar = (C52610yc) C52611yd.f138135b.createBuilder();
        C52632yy yyVar = (C52632yy) C52633yz.f138192f.createBuilder();
        yyVar.copyOnWrite();
        C52633yz yzVar = (C52633yz) yyVar.instance;
        yzVar.f138194a |= 2;
        yzVar.f138196c = "whatsapp";
        yyVar.copyOnWrite();
        C52633yz yzVar2 = (C52633yz) yyVar.instance;
        yzVar2.f138194a |= 1;
        yzVar2.f138195b = "com.whatsapp";
        ycVar.mo53885a(yyVar);
        yqVar.copyOnWrite();
        C52625yr yrVar = (C52625yr) yqVar.instance;
        C52611yd ydVar = (C52611yd) ycVar.build();
        ydVar.getClass();
        yrVar.f138174c = ydVar;
        yrVar.f138172a |= 2;
        f93393a = (C52625yr) yqVar.build();
    }

    public C35573cb(C60887da daVar, C145948p pVar, C46877q qVar, PackageManager packageManager) {
        this.f93396b = daVar;
        this.f93399g = pVar;
        this.f93397c = qVar;
        this.f93398d = packageManager;
    }

    /* renamed from: b */
    public static String m63951b(String str) {
        return Normalizer.normalize(str.trim(), Normalizer.Form.NFKC).toLowerCase(Locale.ROOT);
    }

    /* renamed from: a */
    public final C60870cx mo39702a(List list, List list2, Optional optional) {
        ArrayList arrayList;
        C142826w wVar = new C142826w();
        wVar.f387610c = 3;
        wVar.mo117756b(f93395f);
        wVar.f387614g = "apa-contact-lookup-performer";
        GlobalSearchQuerySpecification a = wVar.mo117755a();
        if (list.isEmpty()) {
            ((C59052c) ((C59052c) f93394e.mo56226d()).mo56372aa(51641)).mo56386p("findAllByDisplayNameAndAndroidAppInfo: no names to query");
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        new C58827ar(",").mo56097d(list);
        Collection.EL.stream(list2).map(C35562bu.f93378a).collect(Collectors.joining(","));
        String str = "QT";
        if (list.size() == 1) {
            C58485gu guVar = C145929a.f394530a;
            if (C145929a.f394530a.contains(str)) {
                arrayList = new ArrayList();
                C145929a.m237739b((String) list.get(0), arrayList);
            } else {
                throw new IllegalArgumentException("Unexpected operator %sQT");
            }
        } else {
            C58485gu guVar2 = C145929a.f394530a;
            if (C145929a.f394530a.contains("OR")) {
                arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    if (C145929a.f394530a.contains(str)) {
                        ArrayList arrayList2 = new ArrayList();
                        C145929a.m237739b(str2, arrayList2);
                        arrayList.add(new C145931c(C145929a.m237738a(str, arrayList2)));
                    } else {
                        throw new IllegalArgumentException("Unexpected operator %sQT");
                    }
                }
                str = "OR";
            } else {
                throw new IllegalArgumentException("Unexpected operator %sOR");
            }
        }
        C60870cx b = C43205e.m76192b(this.f93399g.mo122338b(C145929a.m237738a(str, arrayList).toString(), 10, a));
        C35563bv bvVar = new C35563bv(this, optional, list2);
        return C60922j.m93045h(b, C47810es.m84966f(bvVar), this.f93396b);
    }
}
