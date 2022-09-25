package com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.p2865b;

import android.database.Cursor;
import com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.p2867d.C37123e;
import com.google.assistant.p3897e.p3921j.C52628yu;
import com.google.assistant.p3897e.p3921j.C52629yv;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.search.assistant.y.s.a.b.i */
/* compiled from: PG */
final class C37105i extends C69665o implements C69626l {
    public C37105i() {
        super(1);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        String c;
        C52629yv yvVar;
        Cursor cursor = (Cursor) obj;
        C69664n.m101061g(cursor, "it");
        String c2 = C37123e.m65882c(cursor, "contact_id");
        if (c2 == null || (c = C37123e.m65882c(cursor, "display_name")) == null) {
            return null;
        }
        C52628yu yuVar = (C52628yu) C52629yv.f138180g.createBuilder();
        C69664n.m101060f(yuVar, "newBuilder()");
        String c3 = C37123e.m65882c(cursor, "data1");
        if (c3 == null) {
            yvVar = null;
        } else {
            yuVar.copyOnWrite();
            C52629yv yvVar2 = (C52629yv) yuVar.instance;
            yvVar2.f138182a |= 2;
            yvVar2.f138184c = c3;
            String c4 = C37123e.m65882c(cursor, "data4");
            if (c4 != null) {
                yuVar.copyOnWrite();
                C52629yv yvVar3 = (C52629yv) yuVar.instance;
                yvVar3.f138182a |= 8;
                yvVar3.f138186e = c4;
            }
            yvVar = (C52629yv) yuVar.build();
        }
        if (yvVar == null) {
            return null;
        }
        Integer a = C37123e.m65880a(cursor, "starred");
        boolean z = false;
        if (a != null && a.intValue() > 0) {
            z = true;
        }
        return new C37103g(c2, c, yvVar, z);
    }
}
