package com.google.android.apps.search.podcasts.p10550b.p10552b;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.File;
import java.util.Set;

/* renamed from: com.google.android.apps.search.podcasts.b.b.w */
/* compiled from: PG */
public final /* synthetic */ class C140045w implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C140022ao f380615a;

    /* renamed from: b */
    public final /* synthetic */ Set f380616b;

    public /* synthetic */ C140045w(C140022ao aoVar, Set set) {
        this.f380615a = aoVar;
        this.f380616b = set;
    }

    public final void run() {
        C140022ao aoVar = this.f380615a;
        Set set = this.f380616b;
        try {
            File f = aoVar.mo115400f();
            if (f != null && f.exists() && f.canRead()) {
                if (f.isDirectory()) {
                    File[] listFiles = f.listFiles();
                    if (listFiles != null) {
                        for (File file : listFiles) {
                            String uri = file.toURI().toString();
                            if (!uri.endsWith(".nomedia")) {
                                if (!set.contains(uri) && file.exists()) {
                                    if (!file.delete()) {
                                        C59104x d = C140022ao.f380558a.mo56226d();
                                        d.mo56378ag(C58975e.f156826a, "EpisodeDownloadManager");
                                        ((C59052c) ((C59052c) d).mo56372aa(41547)).mo56389s("Failed to remove an un-indexed downloaded episode %s.", uri);
                                    } else {
                                        C59104x d2 = C140022ao.f380558a.mo56226d();
                                        d2.mo56378ag(C58975e.f156826a, "EpisodeDownloadManager");
                                        ((C59052c) ((C59052c) d2).mo56372aa(41545)).mo56389s("Removed an un-indexed downloaded episode %s.", uri);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            C59104x d3 = C140022ao.f380558a.mo56226d();
            d3.mo56378ag(C58975e.f156826a, "EpisodeDownloadManager");
            ((C59052c) ((C59052c) ((C59052c) d3).mo56382g(e)).mo56372aa(41546)).mo56386p("Exception in maybeCleanUpUnindexedFilesInDir:");
        }
    }
}
