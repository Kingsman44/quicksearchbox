package com.google.android.libraries.search.assistant.p2497ab;

import android.database.Cursor;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60804al;
import com.google.common.util.concurrent.C60812at;
import com.google.protobuf.C62995dn;
import java.util.HashMap;
import java.util.Map;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.ab.bc */
/* compiled from: PG */
public final /* synthetic */ class C32388bc implements C60804al {

    /* renamed from: a */
    public final /* synthetic */ Map f86811a;

    /* renamed from: b */
    public final /* synthetic */ String f86812b;

    public /* synthetic */ C32388bc(Map map, String str) {
        this.f86811a = map;
        this.f86812b = str;
    }

    /* renamed from: a */
    public final Object mo20085a(C60812at atVar, Object obj) {
        Optional optional;
        Optional optional2;
        Map map = this.f86811a;
        String str = this.f86812b;
        Cursor cursor = (Cursor) obj;
        HashMap hashMap = new HashMap();
        while (cursor != null && cursor.moveToNext()) {
            String d = C32389bd.m60179d(cursor, "contact_id");
            if (TextUtils.isEmpty(d)) {
                optional = Optional.empty();
            } else if (!map.containsKey(d)) {
                optional = Optional.empty();
            } else {
                C32364af afVar = (C32364af) map.get(d);
                if (afVar == null) {
                    optional = Optional.empty();
                } else {
                    String d2 = C32389bd.m60179d(cursor, "display_name");
                    if (d2 == null || d2.length() <= 500) {
                        String d3 = C32389bd.m60179d(cursor, "data1");
                        String d4 = C32389bd.m60179d(cursor, "data4");
                        try {
                            int columnIndex = cursor.getColumnIndex("starred");
                            if (cursor.isNull(columnIndex)) {
                                optional2 = Optional.empty();
                            } else {
                                optional2 = Optional.m71637of(Integer.valueOf(cursor.getInt(columnIndex)));
                            }
                        } catch (RuntimeException e) {
                            ((C59052c) ((C59052c) ((C59052c) C32389bd.f86813a.mo56226d()).mo56382g(e)).mo56372aa(52624)).mo56389s("Exception in getString from column: %s", "starred");
                            optional2 = Optional.empty();
                        }
                        afVar.copyOnWrite();
                        C32365ag agVar = (C32365ag) afVar.instance;
                        C32365ag agVar2 = C32365ag.f86758h;
                        d2.getClass();
                        agVar.f86760a |= 2;
                        agVar.f86762c = d2;
                        if (!TextUtils.isEmpty(d3)) {
                            afVar.mo38050a(d3);
                        }
                        if (!TextUtils.isEmpty(d4)) {
                            afVar.mo38050a(d4);
                            String formatNumberToE164 = PhoneNumberUtils.formatNumberToE164(d4, C32389bd.m60178c());
                            if (!TextUtils.isEmpty(formatNumberToE164) && !d4.equals(formatNumberToE164)) {
                                afVar.mo38050a(formatNumberToE164);
                            }
                        } else if (!TextUtils.isEmpty(d3)) {
                            String formatNumberToE1642 = PhoneNumberUtils.formatNumberToE164(d3, C32389bd.m60178c());
                            if (!TextUtils.isEmpty(formatNumberToE1642)) {
                                afVar.mo38050a(formatNumberToE1642);
                            }
                        }
                        optional2.ifPresent(new C32378at(afVar));
                        optional = Optional.m71637of((C32365ag) afVar.build());
                    } else {
                        optional = Optional.empty();
                    }
                }
            }
            optional.ifPresent(new C32380av(hashMap));
        }
        C32372an anVar = (C32372an) C32374ap.f86791d.createBuilder();
        anVar.copyOnWrite();
        C32374ap apVar = (C32374ap) anVar.instance;
        C62995dn dnVar = apVar.f86794b;
        if (!dnVar.f170058b) {
            apVar.f86794b = dnVar.mo58980a();
        }
        apVar.f86794b.putAll(hashMap);
        anVar.copyOnWrite();
        C32374ap apVar2 = (C32374ap) anVar.instance;
        apVar2.f86793a |= 2;
        apVar2.f86795c = str;
        return (C32374ap) anVar.build();
    }
}
