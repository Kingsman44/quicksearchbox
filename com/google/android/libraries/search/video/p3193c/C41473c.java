package com.google.android.libraries.search.video.p3193c;

import com.google.common.base.C58817ah;
import com.google.p395al.p417d.p418a.C8590q;

/* renamed from: com.google.android.libraries.search.video.c.c */
/* compiled from: PG */
public final /* synthetic */ class C41473c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ int f108334a;

    public /* synthetic */ C41473c(int i) {
        this.f108334a = i;
    }

    public final Object apply(Object obj) {
        int i = this.f108334a;
        C8590q qVar = (C8590q) obj;
        if (i == 0) {
            return Boolean.valueOf(qVar.equals(C8590q.AUTOPLAY_ON_WIFI_AND_MOBILE_DATA));
        }
        boolean z = false;
        if (i != 1) {
            return false;
        }
        if (qVar.equals(C8590q.AUTOPLAY_ON_WIFI_ONLY) || qVar.equals(C8590q.AUTOPLAY_ON_WIFI_AND_MOBILE_DATA)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
