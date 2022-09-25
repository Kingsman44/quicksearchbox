package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29334dr;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.io.PrintWriter;
import java.util.List;

/* renamed from: com.google.android.libraries.mdi.download.d.ee */
/* compiled from: PG */
public final /* synthetic */ class C29064ee implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ PrintWriter f78879a;

    public /* synthetic */ C29064ee(PrintWriter printWriter) {
        this.f78879a = printWriter;
    }

    public final C60870cx apply(Object obj) {
        PrintWriter printWriter = this.f78879a;
        for (C29334dr drVar : (List) obj) {
            printWriter.format("GroupName: %s\nDataFileGroup:\n%s\n", new Object[]{drVar.f79501c, drVar.toString()});
        }
        return C60866ct.f164955a;
    }
}
