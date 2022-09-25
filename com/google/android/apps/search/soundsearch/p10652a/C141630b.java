package com.google.android.apps.search.soundsearch.p10652a;

import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.search.soundsearch.a.b */
/* compiled from: PG */
public final /* synthetic */ class C141630b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C141633e f384442a;

    public /* synthetic */ C141630b(C141633e eVar) {
        this.f384442a = eVar;
    }

    public final void run() {
        if (this.f384442a.f384445b.compareAndSet(false, true)) {
            ((C59052c) ((C59052c) C141633e.f384444a.mo56226d()).mo56372aa(41768)).mo56386p("Sound Search audio client deactivated before explicit mic close requested");
        }
    }
}
