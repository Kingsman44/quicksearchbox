package com.google.android.libraries.assistant.auto.tng.common.p909f.p910a.p911a;

import android.database.Cursor;
import android.text.TextUtils;
import com.google.android.libraries.assistant.auto.tng.common.p909f.p910a.p912b.C13255a;
import com.google.android.libraries.assistant.auto.tng.common.p909f.p910a.p912b.C13256b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60801ai;
import com.google.common.util.concurrent.C60812at;
import com.google.common.util.concurrent.C60817ay;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60922j;
import java.util.Set;

/* renamed from: com.google.android.libraries.assistant.auto.tng.common.f.a.a.c */
/* compiled from: PG */
public final /* synthetic */ class C13251c implements C60801ai {

    /* renamed from: a */
    public final /* synthetic */ C13254f f40911a;

    /* renamed from: b */
    public final /* synthetic */ Set f40912b;

    /* renamed from: c */
    public final /* synthetic */ Set f40913c;

    /* renamed from: d */
    public final /* synthetic */ int f40914d;

    public /* synthetic */ C13251c(C13254f fVar, Set set, int i, Set set2) {
        this.f40911a = fVar;
        this.f40912b = set;
        this.f40914d = i;
        this.f40913c = set2;
    }

    /* renamed from: a */
    public final C60817ay mo20982a(C60812at atVar, Object obj) {
        C13254f fVar = this.f40911a;
        Set set = this.f40912b;
        int i = this.f40914d;
        Set set2 = this.f40913c;
        Cursor cursor = (Cursor) obj;
        if (cursor == null) {
            C59104x d = C13254f.f40921a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "RedialRetriever");
            ((C59052c) ((C59052c) d).mo56372aa(44712)).mo56386p("call log cursor is null");
            return new C60817ay(C60856cj.m92900i(C58836b.f156633a));
        }
        cursor.moveToPosition(-1);
        int i2 = 0;
        while (cursor.moveToNext() && set.size() < 30 && i2 < 200) {
            int e = C13254f.m29513e(cursor);
            String c = C13254f.m29511c(cursor, "number");
            String c2 = C13254f.m29511c(cursor, "name");
            if (TextUtils.isEmpty(c) || !set.add(c) || !C13254f.m29514f(i, e)) {
                i2++;
            } else if (set2 != null) {
                return new C60817ay(C60922j.m93044g(fVar.mo20996b(c), C47810es.m84963c(new C13253e(c, set2, c2)), fVar.f40926f));
            } else {
                C13255a aVar = (C13255a) C13256b.f40927g.createBuilder();
                aVar.copyOnWrite();
                C13256b bVar = (C13256b) aVar.instance;
                bVar.f40929a |= 2;
                bVar.f40931c = c;
                aVar.copyOnWrite();
                C13256b bVar2 = (C13256b) aVar.instance;
                bVar2.f40929a |= 1;
                bVar2.f40930b = c2;
                C58976aa aaVar = C58975e.f156826a;
                return new C60817ay(C60856cj.m92900i(C58833ax.m90834k((C13256b) aVar.build())));
            }
        }
        return new C60817ay(C60856cj.m92900i(C58836b.f156633a));
    }
}
