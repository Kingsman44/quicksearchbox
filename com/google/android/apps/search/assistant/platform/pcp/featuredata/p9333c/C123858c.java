package com.google.android.apps.search.assistant.platform.pcp.featuredata.p9333c;

import android.database.Cursor;
import android.text.TextUtils;
import android.text.format.Time;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123783l;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123785n;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123786o;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123787p;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import com.google.common.util.concurrent.C60804al;
import com.google.common.util.concurrent.C60812at;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.c.c */
/* compiled from: PG */
public final /* synthetic */ class C123858c implements C60804al {

    /* renamed from: a */
    public static final /* synthetic */ C123858c f342138a = new C123858c();

    private /* synthetic */ C123858c() {
    }

    /* renamed from: a */
    public final Object mo20085a(C60812at atVar, Object obj) {
        String str;
        Cursor cursor = (Cursor) obj;
        C58881cr crVar = C123860e.f342142c;
        if (cursor == null || !cursor.moveToFirst()) {
            return C58485gu.m89845m();
        }
        ArrayList d = C58597ky.m90213d(cursor.getCount());
        do {
            long j = cursor.getLong(3) / 1000;
            long j2 = (j << 16) ^ cursor.getLong(0);
            int a = C123783l.m203112a(cursor.getInt(5));
            if (a == 0) {
                a = 1;
            }
            int a2 = C123785n.m203113a(cursor.getInt(6));
            C123786o oVar = (C123786o) C123787p.f341948n.createBuilder();
            oVar.copyOnWrite();
            C123787p pVar = (C123787p) oVar.instance;
            pVar.f341950a |= 1;
            pVar.f341951b = j2;
            long j3 = cursor.getLong(0);
            oVar.copyOnWrite();
            C123787p pVar2 = (C123787p) oVar.instance;
            pVar2.f341950a |= 2;
            pVar2.f341952c = j3;
            oVar.copyOnWrite();
            C123787p pVar3 = (C123787p) oVar.instance;
            pVar3.f341950a |= 8;
            pVar3.f341954e = j;
            long j4 = cursor.getLong(4);
            oVar.copyOnWrite();
            C123787p pVar4 = (C123787p) oVar.instance;
            pVar4.f341950a |= 16;
            pVar4.f341955f = j4 / 1000;
            oVar.copyOnWrite();
            C123787p pVar5 = (C123787p) oVar.instance;
            pVar5.f341957h = a - 1;
            pVar5.f341950a |= 128;
            if (a2 == 0) {
                a2 = 1;
            }
            oVar.copyOnWrite();
            C123787p pVar6 = (C123787p) oVar.instance;
            pVar6.f341958i = a2 - 1;
            pVar6.f341950a |= 512;
            String string = cursor.getString(1);
            String string2 = cursor.getString(2);
            if (!C123860e.m203170d(string)) {
                oVar.copyOnWrite();
                C123787p pVar7 = (C123787p) oVar.instance;
                string.getClass();
                pVar7.f341950a = 4 | pVar7.f341950a;
                pVar7.f341953d = string;
            } else {
                oVar.copyOnWrite();
                C123787p pVar8 = (C123787p) oVar.instance;
                pVar8.f341950a = 4 | pVar8.f341950a;
                pVar8.f341953d = "No title";
            }
            if (cursor.getInt(10) != 0) {
                int julianDay = Time.getJulianDay(cursor.getLong(3), 0);
                oVar.copyOnWrite();
                C123787p pVar9 = (C123787p) oVar.instance;
                pVar9.f341950a |= 8192;
                pVar9.f341961l = true;
                long c = C123860e.m203169c(julianDay);
                oVar.copyOnWrite();
                C123787p pVar10 = (C123787p) oVar.instance;
                pVar10.f341950a |= 8;
                pVar10.f341954e = c;
                long c2 = C123860e.m203169c(julianDay + 1);
                oVar.copyOnWrite();
                C123787p pVar11 = (C123787p) oVar.instance;
                pVar11.f341950a |= 16;
                pVar11.f341955f = c2;
            }
            if (!C123860e.m203170d(string2)) {
                oVar.copyOnWrite();
                C123787p pVar12 = (C123787p) oVar.instance;
                string2.getClass();
                pVar12.f341950a |= 32;
                pVar12.f341956g = string2;
            }
            if ("com.google".equals(cursor.getString(7))) {
                oVar.copyOnWrite();
                C123787p pVar13 = (C123787p) oVar.instance;
                pVar13.f341950a |= 16384;
                pVar13.f341962m = true;
                if (!TextUtils.isEmpty(cursor.getString(8))) {
                    str = cursor.getString(8);
                } else {
                    str = cursor.getString(9);
                }
                if (!TextUtils.isEmpty(str)) {
                    oVar.copyOnWrite();
                    C123787p pVar14 = (C123787p) oVar.instance;
                    str.getClass();
                    pVar14.f341950a |= 2048;
                    pVar14.f341960k = str;
                }
                long j5 = cursor.getLong(11);
                oVar.copyOnWrite();
                C123787p pVar15 = (C123787p) oVar.instance;
                pVar15.f341950a |= 1024;
                pVar15.f341959j = j5;
            }
            d.add((C123787p) oVar.build());
        } while (cursor.moveToNext());
        return C58485gu.m89842j(d);
    }
}
