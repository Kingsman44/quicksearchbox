package com.google.android.apps.gsa.opa.p6435c;

import android.database.Cursor;
import android.provider.CallLog;
import android.telephony.PhoneNumberUtils;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.android.libraries.p11002ag.C147576f;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.apps.gsa.opa.c.d */
/* compiled from: PG */
public final /* synthetic */ class C83592d implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C83600l f227896a;

    /* renamed from: b */
    public final /* synthetic */ String f227897b;

    /* renamed from: c */
    public final /* synthetic */ long f227898c;

    public /* synthetic */ C83592d(C83600l lVar, String str, long j) {
        this.f227896a = lVar;
        this.f227897b = str;
        this.f227898c = j;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        long j;
        C83600l lVar = this.f227896a;
        String str = this.f227897b;
        long j2 = this.f227898c;
        Cursor query = lVar.f227915j.f227917b.getContentResolver().query(CallLog.Calls.CONTENT_URI.buildUpon().appendQueryParameter("limit", "1").build(), (String[]) null, (String) null, (String[]) null, "date DESC");
        if (query != null) {
            int columnIndex = query.getColumnIndex("duration");
            int columnIndex2 = query.getColumnIndex("number");
            int columnIndex3 = query.getColumnIndex("type");
            int columnIndex4 = query.getColumnIndex("date");
            int columnIndex5 = query.getColumnIndex("last_modified");
            if (!query.moveToLast()) {
                ((C59052c) ((C59052c) C83601m.f227916a.mo56225c()).mo56372aa(6775)).mo56386p("Query failed. cursor is empty.");
                j = -3;
            } else if (query.getLong(columnIndex4) < lVar.f227914i - 5000 && columnIndex5 != -1 && query.getLong(columnIndex5) < lVar.f227914i) {
                ((C59052c) ((C59052c) C83601m.f227916a.mo56225c()).mo56372aa(6774)).mo56386p("Log entry is older than the start of this call");
                j = -4;
            } else if (query.getInt(columnIndex3) != 2) {
                ((C59052c) ((C59052c) C83601m.f227916a.mo56225c()).mo56372aa(6773)).mo56386p("Log enty is not an outgoing call");
                j = -5;
            } else {
                int r = C147576f.m240621c().mo124327r(PhoneNumberUtils.normalizeNumber(query.getString(columnIndex2)), PhoneNumberUtils.normalizeNumber(str));
                if (r == 5 || r == 4 || r == 3) {
                    j = query.getLong(columnIndex);
                } else {
                    ((C59052c) ((C59052c) C83601m.f227916a.mo56225c()).mo56372aa(6772)).mo56386p("Log entry phone number doesn't match with the called number");
                    j = -6;
                }
            }
            query.close();
        } else {
            ((C59052c) ((C59052c) C83601m.f227916a.mo56225c()).mo56372aa(6767)).mo56386p("Failed to resolve content url.");
            j = -2;
        }
        if (j >= 0) {
            return C60856cj.m92900i(Long.valueOf(j * 1000));
        }
        return j2 <= 0 ? C60856cj.m92900i(Long.valueOf(j)) : lVar.mo76954a(str, j2 - 1);
    }
}
