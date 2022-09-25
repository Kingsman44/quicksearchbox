package com.google.android.apps.gsa.nga.engine.understanding.p6238e;

import com.google.android.apps.gsa.nga.engine.understanding.C78979af;
import java.util.Comparator;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.e.f */
/* compiled from: PG */
public final /* synthetic */ class C79092f implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ C79092f f217469a = new C79092f();

    private /* synthetic */ C79092f() {
    }

    public final int compare(Object obj, Object obj2) {
        int number = ((C78979af) obj).mo73736a().getNumber();
        int number2 = ((C78979af) obj2).mo73736a().getNumber();
        if (number == number2) {
            return 0;
        }
        return number >= number2 ? 1 : -1;
    }
}
