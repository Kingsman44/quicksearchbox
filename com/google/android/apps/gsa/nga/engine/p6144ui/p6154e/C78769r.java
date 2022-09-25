package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e;

import java.util.Comparator;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.r */
/* compiled from: PG */
public final /* synthetic */ class C78769r implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ C78769r f216839a = new C78769r();

    private /* synthetic */ C78769r() {
    }

    public final int compare(Object obj, Object obj2) {
        int ordinal = ((C78721m) ((Map.Entry) obj).getKey()).ordinal();
        int ordinal2 = ((C78721m) ((Map.Entry) obj2).getKey()).ordinal();
        if (ordinal == ordinal2) {
            return 0;
        }
        return ordinal >= ordinal2 ? 1 : -1;
    }
}
