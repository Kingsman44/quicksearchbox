package com.google.android.libraries.mdi.download.p2236d;

import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.mdi.download.C29332dp;
import com.google.android.libraries.mdi.download.C29398ev;
import com.google.android.libraries.mdi.download.C29402ez;
import com.google.android.libraries.mdi.download.p2236d.p2239c.C28927o;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29090d;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.io.PrintWriter;

/* renamed from: com.google.android.libraries.mdi.download.d.lm */
/* compiled from: PG */
public final /* synthetic */ class C29287lm implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29290lp f79377a;

    /* renamed from: b */
    public final /* synthetic */ PrintWriter f79378b;

    /* renamed from: c */
    public final /* synthetic */ C29398ev f79379c;

    public /* synthetic */ C29287lm(C29290lp lpVar, PrintWriter printWriter, C29398ev evVar) {
        this.f79377a = lpVar;
        this.f79378b = printWriter;
        this.f79379c = evVar;
    }

    public final C60870cx apply(Object obj) {
        C29290lp lpVar = this.f79377a;
        PrintWriter printWriter = this.f79378b;
        C29398ev evVar = this.f79379c;
        C29402ez ezVar = (C29402ez) obj;
        if (ezVar == null) {
            C29045l.m53935g("%s: Unable to read sharedFile from shared preferences.", "SharedFileManager");
            return C60866ct.f164955a;
        }
        printWriter.format("FileKey: %s\nFileName: %s\nSharedFile: %s\n", new Object[]{evVar, ezVar.f79714b, ezVar.toString()});
        if (ezVar.f79716d) {
            printWriter.format("Checksum Android-shared file: %s\n", new Object[]{ezVar.f79718f});
        } else {
            Context context = lpVar.f79385a;
            int a = C29332dp.m54217a(evVar.f79704e);
            Uri e = C29090d.m53984e(context, a == 0 ? 1 : a, ezVar.f79714b, evVar.f79703d, lpVar.f79386b, lpVar.f79394j, false);
            if (e != null) {
                printWriter.format("Checksum downloaded file: %s\n", new Object[]{C28927o.m53847b(lpVar.f79389e, e)});
            }
        }
        return C60866ct.f164955a;
    }
}
