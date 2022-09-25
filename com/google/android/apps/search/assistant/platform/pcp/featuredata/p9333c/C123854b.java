package com.google.android.apps.search.assistant.platform.pcp.featuredata.p9333c;

import android.database.Cursor;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123760c;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123775d;
import com.google.common.base.C58837ba;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import com.google.common.util.concurrent.C60804al;
import com.google.common.util.concurrent.C60812at;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.c.b */
/* compiled from: PG */
public final /* synthetic */ class C123854b implements C60804al {

    /* renamed from: a */
    public static final /* synthetic */ C123854b f342136a = new C123854b();

    private /* synthetic */ C123854b() {
    }

    /* renamed from: a */
    public final Object mo20085a(C60812at atVar, Object obj) {
        Cursor cursor = (Cursor) obj;
        C58881cr crVar = C123860e.f342142c;
        if (cursor == null || !cursor.moveToFirst()) {
            return C58485gu.m89845m();
        }
        ArrayList d = C58597ky.m90213d(cursor.getCount());
        Pattern pattern = (Pattern) C123860e.f342142c.mo6453a();
        do {
            String string = cursor.getString(1);
            String string2 = cursor.getString(2);
            if (string2 == null) {
                string2 = cursor.getString(3);
            }
            String string3 = cursor.getString(4);
            if (string3 == null || !pattern.matcher(string3).matches()) {
                string3 = String.format("%s_%s", new Object[]{string2, string});
            }
            C123760c cVar = (C123760c) C123775d.f341913h.createBuilder();
            long j = cursor.getLong(0);
            cVar.copyOnWrite();
            C123775d dVar = (C123775d) cVar.instance;
            dVar.f341915a = 1 | dVar.f341915a;
            dVar.f341916b = j;
            String g = C58837ba.m90858g(string);
            cVar.copyOnWrite();
            C123775d dVar2 = (C123775d) cVar.instance;
            dVar2.f341915a = 4 | dVar2.f341915a;
            dVar2.f341918d = g;
            cVar.copyOnWrite();
            C123775d dVar3 = (C123775d) cVar.instance;
            dVar3.f341915a |= 8;
            dVar3.f341919e = C58837ba.m90858g(string2);
            cVar.copyOnWrite();
            C123775d dVar4 = (C123775d) cVar.instance;
            string3.getClass();
            dVar4.f341915a |= 2;
            dVar4.f341917c = string3;
            int i = cursor.getInt(5);
            cVar.copyOnWrite();
            C123775d dVar5 = (C123775d) cVar.instance;
            dVar5.f341915a |= 16;
            dVar5.f341920f = i;
            int i2 = cursor.getInt(6);
            cVar.copyOnWrite();
            C123775d dVar6 = (C123775d) cVar.instance;
            dVar6.f341915a |= 32;
            dVar6.f341921g = i2;
            d.add((C123775d) cVar.build());
        } while (cursor.moveToNext());
        return d;
    }
}
