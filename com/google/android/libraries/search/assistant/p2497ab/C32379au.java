package com.google.android.libraries.search.assistant.p2497ab;

import android.database.Cursor;
import android.text.TextUtils;
import android.util.Patterns;
import com.google.common.base.C58890d;
import com.google.common.util.concurrent.C60804al;
import com.google.common.util.concurrent.C60812at;
import java.util.HashMap;

/* renamed from: com.google.android.libraries.search.assistant.ab.au */
/* compiled from: PG */
public final /* synthetic */ class C32379au implements C60804al {

    /* renamed from: a */
    public static final /* synthetic */ C32379au f86802a = new C32379au();

    private /* synthetic */ C32379au() {
    }

    /* renamed from: a */
    public final Object mo20085a(C60812at atVar, Object obj) {
        Cursor cursor = (Cursor) obj;
        HashMap hashMap = new HashMap();
        while (cursor != null && cursor.moveToNext()) {
            String d = C32389bd.m60179d(cursor, "contact_id");
            if (!TextUtils.isEmpty(d)) {
                String d2 = C32389bd.m60179d(cursor, "account_name");
                if (TextUtils.isEmpty(d2) || TextUtils.isEmpty(d2) || !Patterns.EMAIL_ADDRESS.matcher(d2).matches() || C58890d.m90988c(d2).endsWith("@gmail.com") || C58890d.m90988c(d2).endsWith("@google.com")) {
                    String d3 = C32389bd.m60179d(cursor, "account_type");
                    C32364af afVar = (C32364af) C32365ag.f86758h.createBuilder();
                    afVar.copyOnWrite();
                    C32365ag agVar = (C32365ag) afVar.instance;
                    d.getClass();
                    agVar.f86760a |= 1;
                    agVar.f86761b = d;
                    afVar.copyOnWrite();
                    C32365ag agVar2 = (C32365ag) afVar.instance;
                    d3.getClass();
                    agVar2.f86760a |= 8;
                    agVar2.f86765f = d3;
                    afVar.copyOnWrite();
                    C32365ag agVar3 = (C32365ag) afVar.instance;
                    d2.getClass();
                    agVar3.f86760a |= 16;
                    agVar3.f86766g = d2;
                    hashMap.put(d, afVar);
                }
            }
        }
        return hashMap;
    }
}
