package com.google.android.apps.gsa.staticplugins.nowcards.p8119i.p8121b.p8122a;

import android.view.View;
import java.util.Comparator;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.i.b.a.h */
/* compiled from: PG */
public final /* synthetic */ class C105007h implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ C105007h f292576a = new C105007h();

    private /* synthetic */ C105007h() {
    }

    public final int compare(Object obj, Object obj2) {
        int[] iArr = new int[2];
        ((View) obj).getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        ((View) obj2).getLocationOnScreen(iArr2);
        return iArr[1] - iArr2[1];
    }
}
