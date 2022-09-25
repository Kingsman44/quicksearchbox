package com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e;

import com.google.assistant.p3897e.p3921j.C52393qb;
import com.google.assistant.p3897e.p3921j.C52395qd;
import com.google.assistant.p3897e.p3921j.C52403ql;
import com.google.assistant.p3897e.p3921j.C52405qn;
import p3186j$.time.Instant;
import p3186j$.time.LocalDateTime;
import p3186j$.time.ZoneId;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.q.e.j */
/* compiled from: PG */
public final class C131241j {
    /* renamed from: a */
    public static Instant m213734a(C52395qd qdVar) {
        ZoneId zoneId;
        C52405qn qnVar = qdVar.f137490d;
        if (qnVar == null) {
            qnVar = C52405qn.f137519c;
        }
        if ((qnVar.f137521a & 1) != 0) {
            C52405qn qnVar2 = qdVar.f137490d;
            if (qnVar2 == null) {
                qnVar2 = C52405qn.f137519c;
            }
            zoneId = ZoneId.m71280of(qnVar2.f137522b);
        } else {
            zoneId = ZoneId.systemDefault();
        }
        C52393qb qbVar = qdVar.f137488b;
        if (qbVar == null) {
            qbVar = C52393qb.f137479e;
        }
        int i = qbVar.f137482b;
        C52393qb qbVar2 = qdVar.f137488b;
        int i2 = (qbVar2 == null ? C52393qb.f137479e : qbVar2).f137483c;
        if (qbVar2 == null) {
            qbVar2 = C52393qb.f137479e;
        }
        int i3 = qbVar2.f137484d;
        C52403ql qlVar = qdVar.f137489c;
        if (qlVar == null) {
            qlVar = C52403ql.f137512f;
        }
        int i4 = qlVar.f137515b;
        C52403ql qlVar2 = qdVar.f137489c;
        int i5 = (qlVar2 == null ? C52403ql.f137512f : qlVar2).f137516c;
        if (qlVar2 == null) {
            qlVar2 = C52403ql.f137512f;
        }
        return LocalDateTime.m71184of(i, i2, i3, i4, i5, qlVar2.f137517d).atZone(zoneId).toInstant();
    }
}
