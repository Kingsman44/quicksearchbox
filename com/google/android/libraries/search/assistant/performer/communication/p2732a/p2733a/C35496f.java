package com.google.android.libraries.search.assistant.performer.communication.p2732a.p2733a;

import android.database.Cursor;
import android.telephony.PhoneNumberUtils;
import com.google.android.libraries.p11002ag.C147576f;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60804al;
import com.google.common.util.concurrent.C60812at;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.a.a.f */
/* compiled from: PG */
public final /* synthetic */ class C35496f implements C60804al {

    /* renamed from: a */
    public final /* synthetic */ C35505o f93219a;

    /* renamed from: b */
    public final /* synthetic */ String f93220b;

    public /* synthetic */ C35496f(C35505o oVar, String str) {
        this.f93219a = oVar;
        this.f93220b = str;
    }

    /* renamed from: a */
    public final Object mo20085a(C60812at atVar, Object obj) {
        long j;
        C35505o oVar = this.f93219a;
        String str = this.f93220b;
        Cursor cursor = (Cursor) obj;
        if (cursor != null) {
            int columnIndex = cursor.getColumnIndex("duration");
            int columnIndex2 = cursor.getColumnIndex("number");
            int columnIndex3 = cursor.getColumnIndex("type");
            int columnIndex4 = cursor.getColumnIndex("date");
            int columnIndex5 = cursor.getColumnIndex("last_modified");
            if (!cursor.moveToLast()) {
                ((C59052c) ((C59052c) C35506p.f93237a.mo56225c()).mo56372aa(51725)).mo56386p("Query failed. cursor is empty.");
                j = -3;
            } else if (cursor.getLong(columnIndex4) < oVar.f93234g - 5000 && columnIndex5 != -1 && cursor.getLong(columnIndex5) < oVar.f93234g) {
                ((C59052c) ((C59052c) C35506p.f93237a.mo56226d()).mo56372aa(51724)).mo56386p("Log entry is older than the start of this call");
                j = -4;
            } else if (cursor.getInt(columnIndex3) != 2) {
                ((C59052c) ((C59052c) C35506p.f93237a.mo56226d()).mo56372aa(51723)).mo56386p("Log entry is not an outgoing call");
                j = -5;
            } else {
                int r = C147576f.m240621c().mo124327r(PhoneNumberUtils.normalizeNumber(cursor.getString(columnIndex2)), PhoneNumberUtils.normalizeNumber(str));
                if (r == 5 || r == 4 || r == 3) {
                    j = cursor.getLong(columnIndex);
                } else {
                    ((C59052c) ((C59052c) C35506p.f93237a.mo56226d()).mo56372aa(51722)).mo56386p("Log entry phone number doesn't match with the called number");
                    j = -6;
                }
            }
            cursor.close();
        } else {
            ((C59052c) ((C59052c) C35506p.f93237a.mo56225c()).mo56372aa(51719)).mo56386p("Failed to resolve content url.");
            j = -2;
        }
        if (j >= 0) {
            j *= 1000;
        }
        return Long.valueOf(j);
    }
}
