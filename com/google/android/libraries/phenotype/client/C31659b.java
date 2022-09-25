package com.google.android.libraries.phenotype.client;

import android.database.Cursor;
import androidx.p060c.C0977g;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.libraries.phenotype.client.b */
/* compiled from: PG */
public final /* synthetic */ class C31659b implements C31669h {

    /* renamed from: a */
    public final /* synthetic */ C31665d f85165a;

    public /* synthetic */ C31659b(C31665d dVar) {
        this.f85165a = dVar;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final Object mo37308a() {
        Map map;
        C31665d dVar = this.f85165a;
        Cursor query = dVar.f85172b.query(dVar.f85173c, C31665d.f85170a, (String) null, (String[]) null, (String) null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                Map emptyMap = Collections.emptyMap();
                query.close();
                return emptyMap;
            }
            if (count <= 256) {
                map = new C0977g(count);
            } else {
                map = new HashMap(count, 1.0f);
            }
            while (query.moveToNext()) {
                map.put(query.getString(0), query.getString(1));
            }
            query.close();
            return map;
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }
}
