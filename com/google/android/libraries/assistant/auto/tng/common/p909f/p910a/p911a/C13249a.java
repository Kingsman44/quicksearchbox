package com.google.android.libraries.assistant.auto.tng.common.p909f.p910a.p911a;

import android.database.Cursor;
import android.text.TextUtils;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60801ai;
import com.google.common.util.concurrent.C60812at;
import com.google.common.util.concurrent.C60817ay;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.HashSet;

/* renamed from: com.google.android.libraries.assistant.auto.tng.common.f.a.a.a */
/* compiled from: PG */
public final /* synthetic */ class C13249a implements C60801ai {

    /* renamed from: a */
    public final /* synthetic */ C13254f f40907a;

    /* renamed from: b */
    public final /* synthetic */ long f40908b;

    /* renamed from: c */
    public final /* synthetic */ int f40909c;

    public /* synthetic */ C13249a(C13254f fVar, long j, int i) {
        this.f40907a = fVar;
        this.f40908b = j;
        this.f40909c = i;
    }

    /* renamed from: a */
    public final C60817ay mo20982a(C60812at atVar, Object obj) {
        C13254f fVar = this.f40907a;
        long j = this.f40908b;
        int i = this.f40909c;
        Cursor cursor = (Cursor) obj;
        if (cursor == null) {
            C59104x d = C13254f.f40921a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "RedialRetriever");
            ((C59052c) ((C59052c) d).mo56372aa(44714)).mo56386p("call log cursor is null");
            return new C60817ay(C60856cj.m92900i(C58485gu.m89845m()));
        }
        long b = fVar.f40924d.mo26870b() - j;
        HashSet hashSet = new HashSet();
        C60870cx i2 = C60856cj.m92900i(C58485gu.m89845m());
        cursor.moveToPosition(-1);
        int i3 = 0;
        while (true) {
            if (!cursor.moveToNext() || hashSet.size() >= 30 || i3 >= 200) {
                break;
            }
            int e = C13254f.m29513e(cursor);
            String c = C13254f.m29511c(cursor, "number");
            String c2 = C13254f.m29511c(cursor, "name");
            if (!TextUtils.isEmpty(c) && hashSet.add(c) && C13254f.m29514f(i, e)) {
                int columnIndex = cursor.getColumnIndex("date");
                long j2 = columnIndex >= 0 ? cursor.getLong(columnIndex) : -1;
                if (j2 < 0 || b > j2) {
                    C58976aa aaVar = C58975e.f156826a;
                } else {
                    i2 = C47633f.m84733g(C60856cj.m92907p(i2, fVar.mo20996b(c))).mo51515h(new C13252d(c2, c, j2), fVar.f40926f);
                }
            }
            i3++;
        }
        return new C60817ay(i2);
    }
}
