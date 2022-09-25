package com.google.android.apps.search.assistant.platform.pcp.p9325b;

import android.database.Cursor;
import com.google.android.libraries.storage.p3315b.C42844bc;
import com.google.android.libraries.storage.p3315b.C42847bf;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C63010eb;
import com.google.protobuf.MessageLite;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.b.v */
/* compiled from: PG */
public final /* synthetic */ class C123645v implements C42844bc {

    /* renamed from: a */
    public final /* synthetic */ String f341577a;

    /* renamed from: b */
    public final /* synthetic */ int f341578b;

    /* renamed from: c */
    public final /* synthetic */ C53306j f341579c;

    /* renamed from: d */
    public final /* synthetic */ C63010eb f341580d;

    public /* synthetic */ C123645v(String str, int i, C53306j jVar, C63010eb ebVar) {
        this.f341577a = str;
        this.f341578b = i;
        this.f341579c = jVar;
        this.f341580d = ebVar;
    }

    /* renamed from: a */
    public final Object mo45922a(C42847bf bfVar) {
        Optional optional;
        String str = this.f341577a;
        int i = this.f341578b;
        C53306j jVar = this.f341579c;
        C63010eb ebVar = this.f341580d;
        Cursor d = bfVar.mo45932d(C123611ad.m202952k(C58485gu.m89846n(str), C58485gu.m89846n(Integer.valueOf(i)), jVar));
        if (d != null) {
            try {
                if (d.moveToFirst()) {
                    int columnIndex = d.getColumnIndex("data_content");
                    if (columnIndex < 0) {
                        optional = Optional.empty();
                    } else {
                        byte[] blob = d.getBlob(columnIndex);
                        if (blob != null && blob.length > 0) {
                            optional = Optional.m71637of((MessageLite) ebVar.mo59015n(blob, C62921ba.m95368a()));
                        }
                    }
                    d.close();
                    return optional;
                }
            } catch (Throwable th) {
                C123633j.m203004a(th, th);
            }
        }
        optional = Optional.empty();
        if (d != null) {
            d.close();
        }
        return optional;
        throw th;
    }
}
