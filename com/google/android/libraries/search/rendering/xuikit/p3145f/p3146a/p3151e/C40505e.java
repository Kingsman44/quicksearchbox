package com.google.android.libraries.search.rendering.xuikit.p3145f.p3146a.p3151e;

import android.content.Intent;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4317v.C56828e;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.f.a.e.e */
/* compiled from: PG */
final class C40505e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C40506f f106270a;

    /* renamed from: b */
    final /* synthetic */ Intent f106271b;

    public C40505e(C40506f fVar, Intent intent) {
        this.f106270a = fVar;
        this.f106271b = intent;
    }

    public final void run() {
        C40506f fVar = this.f106270a;
        Intent intent = this.f106271b;
        String action = intent.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode != -2128145023) {
                if (hashCode == -1454123155 && action.equals("android.intent.action.SCREEN_ON")) {
                    fVar.mo42476b(C56828e.ON);
                    return;
                }
            } else if (action.equals("android.intent.action.SCREEN_OFF")) {
                fVar.mo42476b(C56828e.OFF);
                return;
            }
        }
        C59052c cVar = (C59052c) C40506f.f106272a.mo56226d();
        String action2 = intent.getAction();
        cVar.mo56379ah(new C59094n(53344));
        cVar.mo56389s("onReceive: Unknown action %s", action2);
    }
}
