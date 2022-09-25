package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import android.database.Cursor;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.C14782b;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14526mm;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14528mo;
import com.google.android.libraries.assistant.auto.tng.morris.p1096h.C15388p;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60804al;
import com.google.common.util.concurrent.C60812at;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import java.util.HashSet;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.ct */
/* compiled from: PG */
public final /* synthetic */ class C14859ct implements C60804al {

    /* renamed from: a */
    public final /* synthetic */ C14863cx f44733a;

    public /* synthetic */ C14859ct(C14863cx cxVar) {
        this.f44733a = cxVar;
    }

    /* renamed from: a */
    public final Object mo20085a(C60812at atVar, Object obj) {
        String str;
        long j;
        int i;
        C14863cx cxVar = this.f44733a;
        Cursor cursor = (Cursor) obj;
        if (cursor == null) {
            C59104x c = C14863cx.f44739a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Morris.RcntCallsDataSrc");
            ((C59052c) ((C59052c) c).mo56372aa(45653)).mo56386p("Null cursor, unable to perform lookup.");
            return C14782b.ERROR;
        }
        C58976aa aaVar = C58975e.f156826a;
        cursor.getCount();
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("number");
        int columnIndex = cursor.getColumnIndex("type");
        int columnIndex2 = cursor.getColumnIndex("date");
        int columnIndex3 = cursor.getColumnIndex("name");
        C58480gp e = C58485gu.m89837e();
        HashSet hashSet = new HashSet();
        int i2 = 0;
        while (cursor.moveToNext() && i2 < 4) {
            String formatNumberToE164 = PhoneNumberUtils.formatNumberToE164(cursor.getString(columnIndexOrThrow), C15388p.m32016d());
            if (!TextUtils.isEmpty(formatNumberToE164) && !hashSet.contains(formatNumberToE164)) {
                if (columnIndex3 == -1) {
                    str = BuildConfig.FLAVOR;
                } else {
                    str = C58837ba.m90858g(cursor.getString(columnIndex3));
                }
                if (columnIndex2 == -1) {
                    j = 0;
                } else {
                    j = cursor.getLong(columnIndex2);
                }
                if (columnIndex == -1) {
                    i = 0;
                } else {
                    i = cursor.getInt(columnIndex);
                }
                C14526mm mmVar = (C14526mm) C14528mo.f43909f.createBuilder();
                mmVar.copyOnWrite();
                formatNumberToE164.getClass();
                ((C14528mo) mmVar.instance).f43911a = formatNumberToE164;
                mmVar.copyOnWrite();
                ((C14528mo) mmVar.instance).f43912b = str;
                C63042fg i3 = C62953e.m95484i(j);
                mmVar.copyOnWrite();
                i3.getClass();
                ((C14528mo) mmVar.instance).f43914d = i3;
                int i4 = 3;
                if (i != 1) {
                    i4 = i != 2 ? i != 3 ? i != 5 ? 2 : 6 : 5 : 4;
                }
                mmVar.copyOnWrite();
                ((C14528mo) mmVar.instance).f43913c = i4 - 2;
                e.mo55395g((C14528mo) mmVar.build());
                hashSet.add(formatNumberToE164);
                i2++;
            }
        }
        cxVar.f44743d = e.mo55394f();
        return C14782b.SUCCESS;
    }
}
