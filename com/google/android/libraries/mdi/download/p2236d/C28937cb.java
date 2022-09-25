package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.C29392ep;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.libraries.mdi.download.d.cb */
/* compiled from: PG */
public final /* synthetic */ class C28937cb implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ Map f78600a;

    /* renamed from: b */
    public final /* synthetic */ C29392ep f78601b;

    /* renamed from: c */
    public final /* synthetic */ List f78602c;

    public /* synthetic */ C28937cb(Map map, C29392ep epVar, List list) {
        this.f78600a = map;
        this.f78601b = epVar;
        this.f78602c = list;
    }

    public final C60870cx apply(Object obj) {
        Map map = this.f78600a;
        C29392ep epVar = this.f78601b;
        List list = this.f78602c;
        C29334dr drVar = (C29334dr) obj;
        if (drVar != null) {
            map.put(epVar, drVar);
            list.add(drVar);
        }
        return C60866ct.f164955a;
    }
}
