package com.google.android.libraries.assistant.auto.tng.p1118r.p1119a.p1122b.p1123a;

import android.database.Cursor;
import android.text.TextUtils;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60804al;
import com.google.common.util.concurrent.C60812at;
import com.google.p4152bb.p4153a.C55072ev;
import com.google.p4152bb.p4153a.C55073ew;
import com.google.p4152bb.p4153a.C55094fq;
import com.google.p4152bb.p4153a.C55097ft;
import java.util.LinkedHashSet;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.a.b.a.a */
/* compiled from: PG */
public final /* synthetic */ class C15538a implements C60804al {

    /* renamed from: a */
    public static final /* synthetic */ C15538a f46517a = new C15538a();

    private /* synthetic */ C15538a() {
    }

    /* renamed from: a */
    public final Object mo20085a(C60812at atVar, Object obj) {
        int i;
        Cursor cursor = (Cursor) obj;
        C59071e eVar = C15553p.f46541a;
        C58480gp e = C58485gu.m89837e();
        int columnIndex = cursor.getColumnIndex("data1");
        int columnIndex2 = cursor.getColumnIndex("data4");
        int columnIndex3 = cursor.getColumnIndex("data2");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (cursor.moveToNext()) {
            String string = cursor.getString(columnIndex);
            if (!TextUtils.isEmpty(string)) {
                String string2 = cursor.getString(columnIndex2);
                if (true != TextUtils.isEmpty(string2)) {
                    string = string2;
                }
                if (!linkedHashSet.contains(string)) {
                    linkedHashSet.add(string);
                    C55072ev evVar = (C55072ev) C55073ew.f144880e.createBuilder();
                    evVar.copyOnWrite();
                    C55073ew ewVar = (C55073ew) evVar.instance;
                    string.getClass();
                    ewVar.f144882a |= 1;
                    ewVar.f144883b = string;
                    if (!cursor.isNull(columnIndex3)) {
                        C55094fq fqVar = (C55094fq) C55097ft.f144980d.createBuilder();
                        int i2 = cursor.getInt(columnIndex3);
                        if (i2 != 1) {
                            i = 3;
                            if (i2 != 2) {
                                i = i2 != 3 ? i2 != 12 ? 5 : 4 : 2;
                            }
                        } else {
                            i = 1;
                        }
                        fqVar.copyOnWrite();
                        C55097ft ftVar = (C55097ft) fqVar.instance;
                        ftVar.f144983b = i;
                        ftVar.f144982a = 1 | ftVar.f144982a;
                        C55097ft ftVar2 = (C55097ft) fqVar.build();
                        evVar.copyOnWrite();
                        C55073ew ewVar2 = (C55073ew) evVar.instance;
                        ftVar2.getClass();
                        ewVar2.f144884c = ftVar2;
                        ewVar2.f144882a |= 2;
                    }
                    e.mo55395g((C55073ew) evVar.build());
                }
            }
        }
        return e.mo55394f();
    }
}
