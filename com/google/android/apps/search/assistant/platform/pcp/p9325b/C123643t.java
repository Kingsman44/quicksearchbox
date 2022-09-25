package com.google.android.apps.search.assistant.platform.pcp.p9325b;

import android.database.Cursor;
import com.google.android.libraries.storage.p3315b.C42839ay;
import com.google.android.libraries.storage.p3315b.C42844bc;
import com.google.android.libraries.storage.p3315b.C42847bf;
import com.google.common.base.C58880cq;
import com.google.common.p4526f.C59071e;
import p3186j$.util.DesugarArrays;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.b.t */
/* compiled from: PG */
public final /* synthetic */ class C123643t implements C42844bc {

    /* renamed from: a */
    public final /* synthetic */ C42839ay f341574a;

    public /* synthetic */ C123643t(C42839ay ayVar) {
        this.f341574a = ayVar;
    }

    /* renamed from: a */
    public final Object mo45922a(C42847bf bfVar) {
        C42839ay ayVar = this.f341574a;
        C59071e eVar = C123610ac.f341528a;
        Cursor d = bfVar.mo45932d(ayVar);
        try {
            StringBuilder sb = new StringBuilder();
            if (d.moveToFirst()) {
                StringBuilder sb2 = new StringBuilder();
                for (int i = 0; i < d.getColumnCount(); i++) {
                    String columnName = d.getColumnName(i);
                    if (columnName.contains("_")) {
                        columnName = String.valueOf(columnName.substring(0, columnName.indexOf("_"))).concat(String.valueOf((String) DesugarArrays.stream((T[]) columnName.substring(columnName.indexOf("_") + 1).split("_")).map(C123621an.f341547a).collect(Collectors.joining())));
                    }
                    sb2.append(C58880cq.m90967c(columnName, C123622ao.m202984a(columnName)));
                    sb2.append(" | ");
                }
                sb2.append("\n");
                sb.append(sb2.toString());
                sb.append(C123622ao.m202985b(d));
                while (d.moveToNext()) {
                    sb.append(C123622ao.m202985b(d));
                }
            }
            String sb3 = sb.toString();
            if (d != null) {
                d.close();
            }
            return sb3;
        } catch (Throwable th) {
            C123633j.m203004a(th, th);
        }
        throw th;
    }
}
