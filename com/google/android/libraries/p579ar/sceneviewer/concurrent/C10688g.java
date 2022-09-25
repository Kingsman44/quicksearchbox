package com.google.android.libraries.p579ar.sceneviewer.concurrent;

import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.ar.sceneviewer.concurrent.g */
/* compiled from: PG */
final class C10688g implements Callable {

    /* renamed from: a */
    final /* synthetic */ ArrayList f35620a;

    public C10688g(ArrayList arrayList) {
        this.f35620a = arrayList;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        ArrayList arrayList = this.f35620a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C60870cx) arrayList.get(i)).get();
        }
        return null;
    }
}
