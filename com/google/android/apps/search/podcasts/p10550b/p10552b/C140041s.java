package com.google.android.apps.search.podcasts.p10550b.p10552b;

import android.net.Uri;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.File;

/* renamed from: com.google.android.apps.search.podcasts.b.b.s */
/* compiled from: PG */
public final /* synthetic */ class C140041s implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f380609a;

    public /* synthetic */ C140041s(String str) {
        this.f380609a = str;
    }

    public final void run() {
        File file = new File(Uri.parse(this.f380609a).getPath());
        if (!file.exists()) {
            C58976aa aaVar = C58975e.f156826a;
        } else if (file.delete()) {
            C59104x b = C140022ao.f380558a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "EpisodeDownloadManager");
            ((C59052c) ((C59052c) b).mo56372aa(41550)).mo56389s("Removed downloaded episode %s", file.getName());
        } else {
            C59104x d = C140022ao.f380558a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "EpisodeDownloadManager");
            ((C59052c) ((C59052c) d).mo56372aa(41549)).mo56389s("Faild to remove a downloaded episode %s", file.getName());
        }
    }
}
