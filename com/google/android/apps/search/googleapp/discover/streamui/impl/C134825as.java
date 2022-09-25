package com.google.android.apps.search.googleapp.discover.streamui.impl;

import com.google.android.apps.search.googleapp.discover.p10181d.C134221j;
import com.google.android.apps.search.googleapp.discover.p10214s.C134546ak;
import com.google.android.apps.search.googleapp.discover.p10248y.C135270u;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4364d.C57200f;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4364d.C57203i;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4364d.C57204j;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57315dp;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import p5462h.C69677g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.impl.as */
/* compiled from: PG */
public final class C134825as {
    /* renamed from: a */
    public static final C134221j m218659a(C135270u uVar) {
        C69664n.m101061g(uVar, "failureReason");
        C135270u uVar2 = C135270u.REQUEST_FAILED_NO_INTERNET;
        switch (uVar.ordinal()) {
            case 0:
                return C134221j.NO_CARDS_REQUEST_ERROR_NO_INTERNET;
            case 1:
                return C134221j.NO_CARDS_REQUEST_ERROR_OTHER;
            case 2:
                return C134221j.NO_CARDS_RESPONSE_ERROR_NON_200;
            case 3:
                return C134221j.NO_CARDS_FAILED_TO_GET_AUTH_TOKEN;
            case 4:
                return C134221j.INELIGIBLE_USER_SIGNED_OUT;
            case 5:
                return C134221j.INELIGIBLE_DETERMINED_BY_SERVER;
            case 6:
                return C134221j.INELIGIBLE_DISCOVER_DISABLED;
            case 7:
                return C134221j.INELIGIBLE_GMS_CORE_MISSING;
            case 8:
                return C134221j.INELIGIBLE_GMS_CORE_DISABLED;
            case 9:
                return C134221j.INELIGIBLE_GMS_CORE_UPDATING;
            case 10:
                return C134221j.INELIGIBLE_GMS_CORE_INVALID;
            case 11:
                return C134221j.INELIGIBLE_GMS_CORE_MISSING_PERMISSION;
            case 12:
                return C134221j.INELIGIBLE_GMS_CORE_OTHER;
            case 13:
                return C134221j.NO_CARDS_PREVIOUS_REQUEST_RESPONSE_ERROR;
            case 14:
                return C134221j.NO_CARDS_RESPONSE_ERROR_ZERO_CARDS;
            case 15:
                return C134221j.NO_CARDS_UNKNOWN_REASON;
            case 16:
                return C134221j.FAILED_TO_RENDER;
            default:
                throw new C69677g();
        }
    }

    /* renamed from: b */
    public static final boolean m218660b(C134546ak akVar) {
        Object obj;
        C69664n.m101061g(akVar, "streamToken");
        if (akVar.f366407b != 5) {
            return false;
        }
        C57315dp dpVar = (C57315dp) akVar.f366408c;
        C62940bt r0 = C62942bv.checkIsLite(C57200f.f152712d);
        dpVar.mo58887l(r0);
        Object l = dpVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C57204j jVar = ((C57200f) obj).f152714a;
        if (jVar == null) {
            jVar = C57204j.f152718b;
        }
        int a = C57203i.m88268a(jVar.f152720a);
        return a != 0 && a == 2;
    }
}
