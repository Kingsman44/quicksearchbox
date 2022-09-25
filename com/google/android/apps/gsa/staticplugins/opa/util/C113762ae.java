package com.google.android.apps.gsa.staticplugins.opa.util;

import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88092ow;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88093ox;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88094oy;
import com.google.assistant.p3897e.p3902c.p3907c.C51016dg;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52089ev;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.ae */
/* compiled from: PG */
public final class C113762ae {
    /* renamed from: a */
    public static final C58833ax m188327a(C51016dg dgVar) {
        if ((dgVar.f132829a & 8) == 0) {
            return C58836b.f156633a;
        }
        C88093ox oxVar = (C88093ox) C88094oy.f238174g.createBuilder();
        if ((dgVar.f132829a & 2) != 0) {
            String str = dgVar.f132831c;
            oxVar.copyOnWrite();
            C88094oy oyVar = (C88094oy) oxVar.instance;
            str.getClass();
            oyVar.f238176a |= 4;
            oyVar.f238179d = str;
            if ((dgVar.f132829a & 4) != 0) {
                C52089ev evVar = dgVar.f132832d;
                if (evVar == null) {
                    evVar = C52089ev.f136706c;
                }
                C63088z byteString = evVar.toByteString();
                oxVar.copyOnWrite();
                C88094oy oyVar2 = (C88094oy) oxVar.instance;
                byteString.getClass();
                oyVar2.f238176a |= 8;
                oyVar2.f238180e = byteString;
            }
        }
        C51805du duVar = dgVar.f132833e;
        if (duVar == null) {
            duVar = C51805du.f135924e;
        }
        C63088z byteString2 = duVar.toByteString();
        oxVar.copyOnWrite();
        C88094oy oyVar3 = (C88094oy) oxVar.instance;
        byteString2.getClass();
        oyVar3.f238176a |= 1;
        oyVar3.f238177b = byteString2;
        C88489j jVar = new C88489j(C87739bu.OPA_CLIENT_INPUT);
        jVar.mo82014b(C88092ow.f238173a, (C88094oy) oxVar.build());
        return C58833ax.m90834k(jVar.mo82013a());
    }
}
