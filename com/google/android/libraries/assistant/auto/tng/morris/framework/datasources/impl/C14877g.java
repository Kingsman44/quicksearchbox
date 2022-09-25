package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import android.database.Cursor;
import android.telephony.PhoneNumberUtils;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14524mk;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14525ml;
import com.google.android.libraries.assistant.auto.tng.morris.p1096h.C15388p;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60804al;
import com.google.common.util.concurrent.C60812at;
import java.util.HashSet;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.g */
/* compiled from: PG */
public final /* synthetic */ class C14877g implements C60804al {

    /* renamed from: a */
    public static final /* synthetic */ C14877g f44765a = new C14877g();

    private /* synthetic */ C14877g() {
    }

    /* renamed from: a */
    public final Object mo20085a(C60812at atVar, Object obj) {
        Cursor cursor = (Cursor) obj;
        C58480gp gpVar = new C58480gp(4);
        if (cursor == null) {
            C59104x d = C14878h.f44766a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Morris.ContactDataSrc");
            ((C59052c) ((C59052c) d).mo56372aa(45504)).mo56386p("ContentResolver query returned a null cursor.");
            return gpVar.mo55394f();
        }
        int columnIndex = cursor.getColumnIndex("data1");
        int columnIndex2 = cursor.getColumnIndex("data3");
        int columnIndex3 = cursor.getColumnIndex("data2");
        HashSet hashSet = new HashSet();
        while (cursor.moveToNext()) {
            String g = C58837ba.m90858g(cursor.getString(columnIndex));
            if (g.isEmpty()) {
                C59104x d2 = C14878h.f44766a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "Morris.ContactDataSrc");
                ((C59052c) ((C59052c) d2).mo56372aa(45503)).mo56386p("Provider returned contact with no number.");
            } else {
                String g2 = C58837ba.m90858g(PhoneNumberUtils.formatNumberToE164(g, C15388p.m32016d()));
                if (hashSet.add(g2)) {
                    C14524mk mkVar = (C14524mk) C14525ml.f43904d.createBuilder();
                    mkVar.copyOnWrite();
                    ((C14525ml) mkVar.instance).f43906a = g2;
                    String string = cursor.getString(columnIndex2);
                    mkVar.copyOnWrite();
                    ((C14525ml) mkVar.instance).f43908c = C58837ba.m90858g(string);
                    int i = cursor.getInt(columnIndex3);
                    mkVar.copyOnWrite();
                    ((C14525ml) mkVar.instance).f43907b = i;
                    gpVar.mo55395g((C14525ml) mkVar.build());
                }
            }
        }
        return gpVar.mo55394f();
    }
}
