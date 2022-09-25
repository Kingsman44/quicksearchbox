package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.libraries.mdi.download.d.co */
/* compiled from: PG */
public final /* synthetic */ class C28950co implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78641a;

    /* renamed from: b */
    public final /* synthetic */ Map f78642b;

    /* renamed from: c */
    public final /* synthetic */ List f78643c;

    public /* synthetic */ C28950co(C29117fe feVar, Map map, List list) {
        this.f78641a = feVar;
        this.f78642b = map;
        this.f78643c = list;
    }

    public final C60870cx apply(Object obj) {
        C29117fe feVar = this.f78641a;
        Map map = this.f78642b;
        List list = this.f78643c;
        if (((Boolean) obj).booleanValue()) {
            return feVar.f78983l.mo34520b(map.values());
        }
        C29045l.m53937i("%s: Failed to remove %d pending versions of %d requested groups", "FileGroupManager", Integer.valueOf(map.size()), Integer.valueOf(list.size()));
        feVar.f78973b.mo34543h(1036);
        int size = list.size();
        return C60856cj.m92899h(new IOException("Failed to remove pending group keys, count = " + size));
    }
}
