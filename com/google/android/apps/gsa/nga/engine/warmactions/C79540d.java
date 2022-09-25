package com.google.android.apps.gsa.nga.engine.warmactions;

import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79570b;
import java.util.Comparator;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.d */
/* compiled from: PG */
public final /* synthetic */ class C79540d implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ C79540d f218256a = new C79540d();

    private /* synthetic */ C79540d() {
    }

    public final int compare(Object obj, Object obj2) {
        int a = C79563f.m127641a((C79570b) obj);
        int a2 = C79563f.m127641a((C79570b) obj2);
        if (a == a2) {
            return 0;
        }
        return a >= a2 ? 1 : -1;
    }
}
