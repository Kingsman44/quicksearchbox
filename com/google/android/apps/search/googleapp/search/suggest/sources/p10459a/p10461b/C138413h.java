package com.google.android.apps.search.googleapp.search.suggest.sources.p10459a.p10461b;

import android.util.Base64;
import com.google.android.apps.search.googleapp.search.suggest.C138133o;
import com.google.apps.tiktok.cache.C46407v;
import com.google.common.util.concurrent.C60888db;
import com.google.p395al.p417d.p418a.C8575bc;
import com.google.protos.p4932ax.C64260a;
import com.google.protos.p4932ax.C64270b;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.a.b.h */
/* compiled from: PG */
public final class C138413h {

    /* renamed from: a */
    public final C46407v f376514a;

    /* renamed from: b */
    public final C60888db f376515b;

    public C138413h(C46407v vVar, C60888db dbVar) {
        this.f376514a = vVar;
        this.f376515b = dbVar;
    }

    /* renamed from: a */
    static C138408c m224823a(C138133o oVar) {
        C138407b bVar = (C138407b) C138408c.f376504c.createBuilder();
        String str = oVar.f375825b;
        bVar.copyOnWrite();
        C138408c cVar = (C138408c) bVar.instance;
        str.getClass();
        cVar.f376506a |= 1;
        cVar.f376507b = str;
        return (C138408c) bVar.build();
    }

    /* renamed from: b */
    static String m224824b(C8575bc bcVar) {
        if ((bcVar.f29692a & 8) != 0) {
            return bcVar.f29697f;
        }
        C64260a aVar = (C64260a) C64270b.f173770c.createBuilder();
        aVar.copyOnWrite();
        C64270b bVar = (C64270b) aVar.instance;
        bVar.f173772a |= 1;
        bVar.f173773b = true;
        return Base64.encodeToString(((C64270b) aVar.build()).toByteArray(), 11);
    }
}
