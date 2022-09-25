package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import android.database.Cursor;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14524mk;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14525ml;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14635y;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14636z;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60804al;
import com.google.common.util.concurrent.C60812at;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.f */
/* compiled from: PG */
public final /* synthetic */ class C14876f implements C60804al {

    /* renamed from: a */
    public static final /* synthetic */ C14876f f44764a = new C14876f();

    private /* synthetic */ C14876f() {
    }

    /* renamed from: a */
    public final Object mo20085a(C60812at atVar, Object obj) {
        Cursor cursor = (Cursor) obj;
        C58480gp gpVar = new C58480gp(4);
        if (cursor == null) {
            C59104x d = C14878h.f44766a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Morris.ContactDataSrc");
            ((C59052c) ((C59052c) d).mo56372aa(45502)).mo56386p("ContentResolver query returned a null cursor.");
            return gpVar.mo55394f();
        }
        int columnIndex = cursor.getColumnIndex("display_name");
        int columnIndex2 = cursor.getColumnIndex("_id");
        int columnIndex3 = cursor.getColumnIndex("number");
        int columnIndex4 = cursor.getColumnIndex("label");
        while (cursor.moveToNext()) {
            String string = cursor.getString(columnIndex);
            if (string != null) {
                C14635y yVar = (C14635y) C14636z.f44230e.createBuilder();
                yVar.copyOnWrite();
                ((C14636z) yVar.instance).f44232a = string;
                long j = cursor.getLong(columnIndex2);
                yVar.copyOnWrite();
                ((C14636z) yVar.instance).f44234c = j;
                C14524mk mkVar = (C14524mk) C14525ml.f43904d.createBuilder();
                String g = C58837ba.m90858g(cursor.getString(columnIndex3));
                mkVar.copyOnWrite();
                ((C14525ml) mkVar.instance).f43906a = g;
                String string2 = cursor.getString(columnIndex4);
                mkVar.copyOnWrite();
                ((C14525ml) mkVar.instance).f43908c = C58837ba.m90858g(string2);
                yVar.copyOnWrite();
                C14636z zVar = (C14636z) yVar.instance;
                C14525ml mlVar = (C14525ml) mkVar.build();
                mlVar.getClass();
                zVar.mo21563a();
                zVar.f44235d.add(mlVar);
                gpVar.mo55395g((C14636z) yVar.build());
            } else {
                C59104x d2 = C14878h.f44766a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "Morris.ContactDataSrc");
                ((C59052c) ((C59052c) d2).mo56372aa(45501)).mo56386p("Provider returned contact with no display name.");
            }
        }
        return gpVar.mo55394f();
    }
}
