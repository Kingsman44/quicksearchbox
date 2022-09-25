package com.p278b.p279a;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.b.a.f */
/* compiled from: PG */
final class C5497f implements FilenameFilter {

    /* renamed from: a */
    final /* synthetic */ String f16646a;

    public C5497f(String str) {
        this.f16646a = str;
    }

    public final boolean accept(File file, String str) {
        return str.startsWith(this.f16646a);
    }
}
