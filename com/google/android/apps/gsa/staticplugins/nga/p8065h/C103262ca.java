package com.google.android.apps.gsa.staticplugins.nga.p8065h;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6287i.C80467o;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6287i.C80468p;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.p2476a.C32160b;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p3186j$.util.DesugarArrays;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.h.ca */
/* compiled from: PG */
public final class C103262ca {

    /* renamed from: a */
    public static final C58974d f288039a = C58974d.m91136j();

    /* renamed from: b */
    public static final Integer f288040b = 4;

    /* renamed from: c */
    public static final Integer f288041c = 3;

    /* renamed from: d */
    public static final C58528ij f288042d = C58528ij.m90015O("www", "com", "org", "net", "html", "aspx", "htm");

    /* renamed from: e */
    public static final Integer f288043e = 3;

    /* renamed from: f */
    public final C32160b f288044f;

    /* renamed from: g */
    public final C22871g f288045g;

    public C103262ca(C32160b bVar, C22871g gVar) {
        this.f288045g = gVar;
        this.f288044f = bVar;
    }

    /* renamed from: a */
    public static C58528ij m171158a(String str, Set set) {
        String str2;
        if (str == null) {
            ((C58970a) ((C58970a) f288039a.mo56225c()).mo56372aa(21500)).mo56386p("URL is null.");
            return C58733pz.f156496a;
        }
        HashSet hashSet = new HashSet();
        try {
            URL url = new URL(str);
            List list = (List) DesugarArrays.stream((T[]) url.getHost().split("-|\\.|_|\\+")).map(C103246bl.f288019a).filter(C103255bu.f288029a).filter(C103256bv.f288030a).filter(C103257bw.f288031a).collect(Collectors.toList());
            if (list.isEmpty()) {
                return C58733pz.f156496a;
            }
            List list2 = (List) DesugarArrays.stream((T[]) url.getPath().split("/")).filter(C103258bx.f288032a).filter(C103259by.f288033a).filter(C103260bz.f288034a).collect(Collectors.toList());
            if (!list2.isEmpty()) {
                str2 = (String) C58557jl.m90131l(list2);
            } else {
                str2 = "/";
            }
            List list3 = (List) DesugarArrays.stream((T[]) str2.split("-|\\.|_|\\+")).map(C103247bm.f288020a).filter(C103248bn.f288021a).filter(C103249bo.f288022a).collect(Collectors.toList());
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list2.size() - 1; i++) {
                arrayList.addAll((Collection) DesugarArrays.stream((T[]) ((String) list2.get(i)).split("-|\\.|_|\\+")).map(C103252br.f288026a).filter(C103253bs.f288027a).filter(C103254bt.f288028a).collect(Collectors.toList()));
            }
            try {
                URL url2 = new URL(url.getProtocol(), url.getHost(), "/");
                URL url3 = new URL(url.getProtocol(), url.getHost(), url.getPath());
                if (!set.contains(url2.toString())) {
                    C80467o oVar = (C80467o) C80468p.f220849f.createBuilder();
                    String url4 = url2.toString();
                    oVar.copyOnWrite();
                    C80468p pVar = (C80468p) oVar.instance;
                    url4.getClass();
                    pVar.f220851a |= 1;
                    pVar.f220852b = url4;
                    oVar.mo74335a(list);
                    hashSet.add((C80468p) oVar.build());
                    set.add(url2.toString());
                }
                if (!set.contains(url3.toString()) && !list3.isEmpty()) {
                    C80467o oVar2 = (C80467o) C80468p.f220849f.createBuilder();
                    String url5 = url3.toString();
                    oVar2.copyOnWrite();
                    C80468p pVar2 = (C80468p) oVar2.instance;
                    url5.getClass();
                    pVar2.f220851a |= 1;
                    pVar2.f220852b = url5;
                    oVar2.mo74335a(list);
                    oVar2.copyOnWrite();
                    C80468p pVar3 = (C80468p) oVar2.instance;
                    C62971cq cqVar = pVar3.f220854d;
                    if (!cqVar.mo58948c()) {
                        pVar3.f220854d = C62942bv.mutableCopy(cqVar);
                    }
                    C62947c.addAll((Iterable) list3, (List) pVar3.f220854d);
                    oVar2.copyOnWrite();
                    C80468p pVar4 = (C80468p) oVar2.instance;
                    C62971cq cqVar2 = pVar4.f220855e;
                    if (!cqVar2.mo58948c()) {
                        pVar4.f220855e = C62942bv.mutableCopy(cqVar2);
                    }
                    C62947c.addAll((Iterable) arrayList, (List) pVar4.f220855e);
                    hashSet.add((C80468p) oVar2.build());
                    set.add(url3.toString());
                }
                return C58528ij.m90006F(hashSet);
            } catch (MalformedURLException unused) {
                ((C58970a) ((C58970a) f288039a.mo56225c()).mo56372aa(21498)).mo56389s("Unable to parse URL %s", str);
                return C58733pz.f156496a;
            }
        } catch (MalformedURLException unused2) {
            ((C58970a) ((C58970a) f288039a.mo56225c()).mo56372aa(21499)).mo56389s("Unable to parse URL %s", str);
            return C58733pz.f156496a;
        }
    }
}
