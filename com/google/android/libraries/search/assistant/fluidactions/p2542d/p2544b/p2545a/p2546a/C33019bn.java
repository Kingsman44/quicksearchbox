package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a;

import android.content.Context;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2550e.C33108d;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2550e.C33109e;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33116d;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33118f;
import com.google.assistant.p3897e.p3917i.p3918a.C51401gi;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52236kg;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.assistant.p3897e.p3921j.p3926e.C52056o;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.bn */
/* compiled from: PG */
public final class C33019bn implements C33109e {

    /* renamed from: a */
    private static final C59071e f88421a = C59071e.m91332i("com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.bn");

    /* renamed from: a */
    public final C60870cx mo38500a(Context context, C52070ec ecVar, C33108d dVar) {
        C32993ao aoVar;
        Optional optional;
        C32988aj ajVar = new C32988aj(dVar.mo38534c());
        if (dVar.mo38532a().mo38389s()) {
            aoVar = new C33017bl(ajVar);
        } else {
            aoVar = new C33018bm(ajVar);
        }
        if (!ajVar.mo38453b().isPresent() || !ajVar.f88385c.isPresent()) {
            optional = Optional.empty();
        } else if (!aoVar.mo38476f().isPresent() || aoVar.mo38476f().get() != C51401gi.DOWNLOAD_ASSISTANT_PHOTOS) {
            optional = Optional.empty();
        } else {
            C52236kg kgVar = ecVar.f136654b;
            if (kgVar == null) {
                kgVar = C52236kg.f137089d;
            }
            C52235kf a = C52235kf.m86549a(kgVar.f137092b);
            if (a == null) {
                a = C52235kf.OK;
            }
            Optional j = C33027bv.m61279j(ecVar);
            if (a != C52235kf.OK || j.isPresent()) {
                List list = (List) j.orElse(C58485gu.m89845m());
                if (a != C52235kf.OK) {
                    aoVar.mo38459D(C51401gi.CANCEL);
                    ArrayList arrayList = new ArrayList();
                    Optional g = aoVar.mo38477g();
                    if (g.isPresent()) {
                        arrayList.add(C33116d.m61457p((C51809dy) g.get()));
                    }
                    arrayList.add(C33116d.m61448g(C52056o.f136624a));
                    aoVar.mo38460E();
                    optional = Optional.m71637of(C33118f.m61461b(arrayList, C58733pz.f156496a, ajVar.mo38452a()));
                } else if (list == null) {
                    ((C59052c) ((C59052c) f88421a.mo56225c()).mo56372aa(50816)).mo56386p("uris should not be null with OK download status.");
                    optional = Optional.empty();
                } else {
                    C58485gu n = C58485gu.m89846n((C51809dy) aoVar.mo38484n(list).get());
                    C58485gu m = C58485gu.m89845m();
                    aoVar.mo38459D(C51401gi.FULFILLMENT);
                    ArrayList arrayList2 = new ArrayList();
                    Optional g2 = aoVar.mo38477g();
                    if (g2.isPresent()) {
                        arrayList2.add(C33116d.m61457p((C51809dy) g2.get()));
                    }
                    Optional c = C33036j.m61312c(context, aoVar, ajVar, (C51953ff) null);
                    if (c.isPresent()) {
                        arrayList2.add((C51809dy) c.get());
                    }
                    arrayList2.add(C33116d.m61448g(C52056o.f136624a));
                    arrayList2.addAll(n);
                    arrayList2.addAll(m);
                    aoVar.mo38460E();
                    optional = Optional.m71637of(C33118f.m61461b(arrayList2, C58733pz.f156496a, ajVar.mo38452a()));
                    optional.isPresent();
                }
            } else {
                optional = Optional.empty();
            }
        }
        return C60856cj.m92900i(optional);
    }
}
