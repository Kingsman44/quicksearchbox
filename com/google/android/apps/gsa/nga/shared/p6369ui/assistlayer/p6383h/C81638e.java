package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6383h;

import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6386j.C81823p;
import java.util.Comparator;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.h.e */
/* compiled from: PG */
public final /* synthetic */ class C81638e implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ C81638e f223299a = new C81638e();

    private /* synthetic */ C81638e() {
    }

    public final int compare(Object obj, Object obj2) {
        int ordinal = ((C81823p) ((Map.Entry) obj).getKey()).ordinal();
        int ordinal2 = ((C81823p) ((Map.Entry) obj2).getKey()).ordinal();
        if (ordinal == ordinal2) {
            return 0;
        }
        return ordinal >= ordinal2 ? 1 : -1;
    }
}
