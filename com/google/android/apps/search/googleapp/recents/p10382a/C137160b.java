package com.google.android.apps.search.googleapp.recents.p10382a;

import com.google.android.libraries.search.integrations.p3021e.C38511a;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.io.File;
import java.util.Set;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.googleapp.recents.a.b */
/* compiled from: PG */
public final /* synthetic */ class C137160b implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C137162d f373219a;

    /* renamed from: b */
    public final /* synthetic */ Set f373220b;

    public /* synthetic */ C137160b(C137162d dVar, Set set) {
        this.f373219a = dVar;
        this.f373220b = set;
    }

    public final C60870cx apply(Object obj) {
        C137162d dVar = this.f373219a;
        Set set = this.f373220b;
        String str = (String) obj;
        File a = C38511a.m67760a(dVar.f373228e, "recently");
        if (!a.exists()) {
            a.mkdir();
        }
        File[] listFiles = a.listFiles();
        if (listFiles == null) {
            return C60866ct.f164955a;
        }
        str.getClass();
        int length = str.length() + 1;
        for (File file : listFiles) {
            String name = file.getName();
            if (name.startsWith(str) && name.endsWith(".jpg")) {
                long parseLong = Long.parseLong(name.subSequence(length, name.length() - 4).toString());
                if (dVar.mo113578c(Instant.ofEpochMilli(file.lastModified())) || set.contains(Long.valueOf(parseLong))) {
                    file.delete();
                }
            }
        }
        return C60866ct.f164955a;
    }
}
