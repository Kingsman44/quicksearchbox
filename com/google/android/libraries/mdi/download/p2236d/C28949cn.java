package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.libraries.mdi.download.d.cn */
/* compiled from: PG */
public final /* synthetic */ class C28949cn implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78638a;

    /* renamed from: b */
    public final /* synthetic */ Map f78639b;

    /* renamed from: c */
    public final /* synthetic */ List f78640c;

    public /* synthetic */ C28949cn(C29117fe feVar, Map map, List list) {
        this.f78638a = feVar;
        this.f78639b = map;
        this.f78640c = list;
    }

    public final C60870cx apply(Object obj) {
        C29117fe feVar = this.f78638a;
        Map map = this.f78639b;
        List list = this.f78640c;
        if (((Boolean) obj).booleanValue()) {
            return feVar.f78983l.mo34520b(map.values());
        }
        C29045l.m53937i("%s: Failed to remove %d downloaded versions of %d requested groups", "FileGroupManager", Integer.valueOf(map.size()), Integer.valueOf(list.size()));
        feVar.f78973b.mo34543h(1036);
        int size = map.size();
        return C60856cj.m92899h(new IOException("Failed to remove downloaded groups, count = " + size));
    }
}
