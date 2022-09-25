package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import java.util.Comparator;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.an */
/* compiled from: PG */
public final /* synthetic */ class C79177an implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ C79177an f217640a = new C79177an();

    private /* synthetic */ C79177an() {
    }

    public final int compare(Object obj, Object obj2) {
        int i = C79204bn.f217670a;
        int i2 = ((C80047aa) obj).f219660d;
        int i3 = ((C80047aa) obj2).f219660d;
        if (i2 == i3) {
            return 0;
        }
        return i2 >= i3 ? 1 : -1;
    }
}
