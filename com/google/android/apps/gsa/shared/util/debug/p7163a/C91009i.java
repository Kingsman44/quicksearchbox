package com.google.android.apps.gsa.shared.util.debug.p7163a;

import android.content.Context;
import com.google.android.apps.gsa.shared.util.p7158b.C90744a;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.base.C58832aw;
import java.io.File;

/* renamed from: com.google.android.apps.gsa.shared.util.debug.a.i */
/* compiled from: PG */
public final class C91009i implements C90991b {

    /* renamed from: a */
    private final Context f254248a;

    public C91009i(Context context) {
        this.f254248a = context;
    }

    /* renamed from: a */
    private final long m148672a(File file, C91006f fVar) {
        C91006f fVar2 = fVar;
        fVar2.mo85292s(C90752i.m148233g(file.toString()));
        C91006f e = fVar2.mo85281e((Object) null);
        long j = 0;
        try {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        try {
                            j += m148672a(file2, e);
                        } catch (SecurityException e2) {
                            e = e2;
                            fVar2.mo85293t("%s: %s", C90752i.m148229c("SecurityException"), C90752i.m148233g(e.getMessage()));
                            fVar2.mo85293t("%s (%s): %s", C90752i.m148229c("Total"), C90752i.m148233g(file.toString()), C90752i.m148230d(Long.valueOf(j)));
                            return j;
                        }
                    } else {
                        j += file2.length();
                        e.mo85293t("%s: %s", C90752i.m148233g(file2.toString().replace(file.toString(), ".")), C90752i.m148230d(Long.valueOf(file2.length())));
                    }
                }
            }
        } catch (SecurityException e3) {
            e = e3;
            fVar2.mo85293t("%s: %s", C90752i.m148229c("SecurityException"), C90752i.m148233g(e.getMessage()));
            fVar2.mo85293t("%s (%s): %s", C90752i.m148229c("Total"), C90752i.m148233g(file.toString()), C90752i.m148230d(Long.valueOf(j)));
            return j;
        }
        fVar2.mo85293t("%s (%s): %s", C90752i.m148229c("Total"), C90752i.m148233g(file.toString()), C90752i.m148230d(Long.valueOf(j)));
        return j;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        File filesDir;
        File parentFile;
        if (C58832aw.m90831a("dump", C90744a.m148217a("gsa.filedumper")) && (filesDir = this.f254248a.getFilesDir()) != null && (parentFile = filesDir.getParentFile()) != null) {
            fVar.mo85291r("Data files");
            m148672a(parentFile, fVar);
        }
    }
}
