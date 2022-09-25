package com.google.android.libraries.lens.view.gallery.data;

import android.database.Cursor;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60804al;
import com.google.common.util.concurrent.C60812at;
import com.google.common.util.concurrent.C60856cj;
import java.util.HashMap;
import java.util.Locale;
import p3186j$.util.Map;

/* renamed from: com.google.android.libraries.lens.view.gallery.data.p */
/* compiled from: PG */
public final /* synthetic */ class C26397p implements C60804al {

    /* renamed from: a */
    public final /* synthetic */ C26398q f71816a;

    public /* synthetic */ C26397p(C26398q qVar) {
        this.f71816a = qVar;
    }

    /* renamed from: a */
    public final Object mo20085a(C60812at atVar, Object obj) {
        int i;
        C26398q qVar = this.f71816a;
        Cursor cursor = (Cursor) obj;
        if (cursor == null || !cursor.moveToFirst()) {
            if (cursor == null) {
                ((C59052c) ((C59052c) C26398q.f71817a.mo56224b()).mo56372aa(49421)).mo56386p("Tried to load photo library with null cursor.");
            } else if (!cursor.moveToFirst()) {
                ((C59052c) ((C59052c) C26398q.f71817a.mo56224b()).mo56372aa(49420)).mo56386p("Tried to load photo library with empty cursor.");
            }
            return C26406y.m48693e().mo31601a();
        }
        C26402u e = C26406y.m48693e();
        HashMap hashMap = new HashMap();
        do {
            if (cursor.getInt(1) <= 104857600) {
                long j = cursor.getLong(0);
                long j2 = cursor.getLong(2);
                String g = C58837ba.m90858g(cursor.getString(3));
                if (C26403v.f71834a.f71837d.equals(g)) {
                    i = 3;
                } else if (C26403v.f71835b.f71837d.equals(g)) {
                    i = 4;
                } else if (C26403v.f71836c.f71837d.equals(g)) {
                    i = 5;
                } else if (g.toLowerCase(Locale.ROOT).contains("whatsapp")) {
                    i = 6;
                } else if (g.equals("Instagram")) {
                    i = 7;
                } else if (g.equals("tiktok")) {
                    i = 8;
                } else if (g.equals("Pins")) {
                    i = 9;
                } else {
                    i = g.equals("Snapchat") ? 10 : 1;
                }
                C26403v vVar = (C26403v) Map.EL.computeIfAbsent(hashMap, g, C26395n.f71814a);
                C26383b bVar = new C26383b(j, j2, i);
                ((C58480gp) Map.EL.computeIfAbsent(e.f71831b, vVar, C26401t.f71829a)).mo55395g(bVar);
                if (!C26403v.f71834a.equals(vVar)) {
                    e.f71832c.mo55395g(bVar);
                }
                e.f71830a++;
            }
        } while (cursor.moveToNext());
        C26406y a = e.mo31601a();
        C26400s sVar = qVar.f71818b;
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(new C26399r(sVar, a, sVar.f71828c.mo26872d())), sVar.f71827b), "Failed to log library load end", new Object[0]);
        return a;
    }
}
