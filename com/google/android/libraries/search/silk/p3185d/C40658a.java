package com.google.android.libraries.search.silk.p3185d;

import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.libraries.storage.p3304a.p3305a.C42718e;
import com.google.android.libraries.storage.p3304a.p3305a.C42719f;
import com.google.common.base.C58838bb;
import com.google.common.p4541l.C59316ad;
import java.io.File;
import java.io.IOException;

/* renamed from: com.google.android.libraries.search.silk.d.a */
/* compiled from: PG */
public final class C40658a {

    /* renamed from: a */
    private final Context f106678a;

    /* renamed from: b */
    private final C42813k f106679b;

    public C40658a(Context context, C42813k kVar) {
        this.f106678a = context;
        this.f106679b = kVar;
    }

    /* renamed from: a */
    public final Uri mo42585a(String str) {
        C58838bb.m90869d(!str.isEmpty(), "File name must not be empty.");
        int i = 0;
        while (i <= 10000) {
            try {
                String name = new File(str).getName();
                int lastIndexOf = name.lastIndexOf(46);
                if (lastIndexOf != -1) {
                    name = name.substring(0, lastIndexOf);
                }
                String a = C59316ad.m92161a(str);
                StringBuilder sb = new StringBuilder();
                sb.append(name);
                if (i != 0) {
                    sb.append("-");
                    sb.append(i);
                }
                if (!a.isEmpty()) {
                    sb.append(".");
                    sb.append(a);
                }
                C42718e a2 = C42719f.m75461a(this.f106678a);
                C42719f.m75462b("cache");
                a2.f111967b = "cache";
                C42719f.m75463c("silk");
                a2.f111968c = "silk";
                a2.mo45821b(sb.toString());
                Uri a3 = a2.mo45820a();
                if (!this.f106679b.mo45894h(a3)) {
                    return a3;
                }
                i++;
            } catch (IOException e) {
                throw new IOException("Cannot access cache storage.", e);
            }
        }
        throw new IOException("Cannot get file: The number of files with given name and indexed suffixes has reached the limit.");
    }
}
