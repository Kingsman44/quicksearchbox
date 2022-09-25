package com.google.apps.tiktok.cache;

import com.google.apps.tiktok.p3648i.p3649a.C47153d;
import com.google.common.p4526f.C59052c;
import java.io.File;

/* renamed from: com.google.apps.tiktok.cache.ac */
/* compiled from: PG */
public final /* synthetic */ class C46365ac implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C46367ae f121376a;

    /* renamed from: b */
    public final /* synthetic */ C47153d f121377b;

    public /* synthetic */ C46365ac(C46367ae aeVar, C47153d dVar) {
        this.f121376a = aeVar;
        this.f121377b = dVar;
    }

    public final void run() {
        C46367ae aeVar = this.f121376a;
        File b = aeVar.f121382d.mo51050b(this.f121377b);
        String[] list = b.list(new C46366ad(aeVar));
        if (list != null) {
            for (String str : list) {
                if (new File(b, str).delete()) {
                    ((C59052c) ((C59052c) C46367ae.f121379a.mo56224b()).mo56372aa(54719)).mo56389s("Removed orphaned cache file: %s", str);
                } else {
                    ((C59052c) ((C59052c) C46367ae.f121379a.mo56225c()).mo56372aa(54718)).mo56389s("Failed to remove orphaned cache file: %s", str);
                }
            }
        }
    }
}
