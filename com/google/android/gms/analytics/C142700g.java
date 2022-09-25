package com.google.android.gms.analytics;

import android.net.Uri;
import android.text.TextUtils;
import android.util.LogPrinter;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.google.android.gms.analytics.g */
/* compiled from: PG */
public final class C142700g implements C142766s {

    /* renamed from: a */
    private static final Uri f387208a;

    /* renamed from: b */
    private final LogPrinter f387209b = new LogPrinter(4, "GA/LogCatTransport");

    static {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("uri");
        builder.authority("local");
        f387208a = builder.build();
    }

    /* renamed from: b */
    public final Uri mo117476b() {
        return f387208a;
    }

    /* renamed from: e */
    public final void mo117477e(C142701h hVar) {
        ArrayList arrayList = new ArrayList(hVar.f387216g.values());
        Collections.sort(arrayList, new C142699f());
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String obj = ((C142757j) arrayList.get(i)).toString();
            if (!TextUtils.isEmpty(obj)) {
                if (sb.length() != 0) {
                    sb.append(", ");
                }
                sb.append(obj);
            }
        }
        this.f387209b.println(sb.toString());
    }
}
