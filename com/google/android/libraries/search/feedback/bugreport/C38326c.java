package com.google.android.libraries.search.feedback.bugreport;

import com.google.apps.tiktok.p3633d.p3634a.C46669g;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62972cr;
import java.io.PrintWriter;
import java.util.Map;

/* renamed from: com.google.android.libraries.search.feedback.bugreport.c */
/* compiled from: PG */
public final /* synthetic */ class C38326c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ PrintWriter f101501a;

    public /* synthetic */ C38326c(PrintWriter printWriter) {
        this.f101501a = printWriter;
    }

    public final Object apply(Object obj) {
        PrintWriter printWriter = this.f101501a;
        Map map = (Map) obj;
        if (map.isEmpty()) {
            return null;
        }
        printWriter.println("Debug data:");
        for (Map.Entry entry : map.entrySet()) {
            printWriter.println("\t".concat(String.valueOf((String) entry.getKey())));
            printWriter.println("\t\t".concat(String.valueOf(((C46669g) entry.getValue()).mo50688b().mo59170I(C62972cr.f170009a))));
        }
        return null;
    }
}
