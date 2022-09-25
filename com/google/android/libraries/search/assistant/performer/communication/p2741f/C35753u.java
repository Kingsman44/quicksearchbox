package com.google.android.libraries.search.assistant.performer.communication.p2741f;

import android.database.Cursor;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58526ih;
import com.google.common.util.concurrent.C60804al;
import com.google.common.util.concurrent.C60812at;
import p3186j$.util.Collection;
import p3186j$.util.DesugarArrays;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.f.u */
/* compiled from: PG */
public final /* synthetic */ class C35753u implements C60804al {

    /* renamed from: a */
    public final /* synthetic */ String f93681a;

    public /* synthetic */ C35753u(String str) {
        this.f93681a = str;
    }

    /* renamed from: a */
    public final Object mo20085a(C60812at atVar, Object obj) {
        String str = this.f93681a;
        Cursor cursor = (Cursor) obj;
        if (cursor == null) {
            return C58485gu.m89845m();
        }
        if (!cursor.moveToFirst()) {
            return C58485gu.m89845m();
        }
        C58526ih ihVar = new C58526ih();
        for (int i = 0; i < cursor.getCount(); i++) {
            cursor.moveToPosition(i);
            long j = cursor.getLong(cursor.getColumnIndex("_id"));
            if (Collection.EL.stream((C58485gu) DesugarArrays.stream((T[]) C35733aa.f93650b).map(new C35746n(cursor)).filter(C35747o.f93674a).collect(C58370cn.f155946a)).anyMatch(new C35743k(str))) {
                ihVar.mo55373c(Long.valueOf(j));
            }
        }
        return ihVar.mo55486f().mo55229u();
    }
}
