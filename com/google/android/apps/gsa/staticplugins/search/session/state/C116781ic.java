package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.core.state.C87143ik;
import java.util.Comparator;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.ic */
/* compiled from: PG */
public final class C116781ic implements Comparator {

    /* renamed from: a */
    private static final int[] f323985a = new int[250];

    /* renamed from: b */
    private static final int[] f323986b;

    static {
        int[] iArr = {177, 156, 150, 162, 159, 151, 161, 153, 152, 182, 157, 155, 163, 166, 183, 170, 184, 173, 158, 186, 181, 168, 175, 172};
        f323986b = iArr;
        int i = 1;
        int i2 = 0;
        while (i2 < 24) {
            f323985a[iArr[i2]] = i;
            i2++;
            i++;
        }
        for (int i3 = 0; i3 < 250; i3++) {
            int[] iArr2 = f323985a;
            if (iArr2[i3] == 0) {
                iArr2[i3] = i;
                i++;
            }
        }
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int[] iArr = f323985a;
        return iArr[((C116780ib) ((C87143ik) obj).mo80512a()).f235452J] - iArr[((C116780ib) ((C87143ik) obj2).mo80512a()).f235452J];
    }
}
