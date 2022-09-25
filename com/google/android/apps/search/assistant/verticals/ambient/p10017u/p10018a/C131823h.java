package com.google.android.apps.search.assistant.verticals.ambient.p10017u.p10018a;

import java.io.File;
import java.util.Comparator;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.u.a.h */
/* compiled from: PG */
public final /* synthetic */ class C131823h implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ C131823h f360023a = new C131823h();

    private /* synthetic */ C131823h() {
    }

    public final int compare(Object obj, Object obj2) {
        return (((File) obj2).lastModified() > ((File) obj).lastModified() ? 1 : (((File) obj2).lastModified() == ((File) obj).lastModified() ? 0 : -1));
    }
}
