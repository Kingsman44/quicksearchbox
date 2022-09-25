package com.google.android.apps.gsa.staticplugins.p7864du.p7866b;

import com.google.common.p4526f.C59071e;
import java.io.File;
import java.io.FileFilter;

/* renamed from: com.google.android.apps.gsa.staticplugins.du.b.t */
/* compiled from: PG */
public final /* synthetic */ class C100194t implements FileFilter {

    /* renamed from: a */
    public final /* synthetic */ String f280223a;

    public /* synthetic */ C100194t(String str) {
        this.f280223a = str;
    }

    public final boolean accept(File file) {
        String str = this.f280223a;
        C59071e eVar = C100125ad.f279965a;
        return file.getName().startsWith(str);
    }
}
