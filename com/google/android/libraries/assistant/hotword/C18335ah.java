package com.google.android.libraries.assistant.hotword;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.google.android.libraries.assistant.hotword.ah */
/* compiled from: PG */
final class C18335ah implements FilenameFilter {

    /* renamed from: a */
    final /* synthetic */ long f51992a;

    public C18335ah(long j) {
        this.f51992a = j;
    }

    public final boolean accept(File file, String str) {
        return str.startsWith("hotword_audio") && this.f51992a - file.lastModified() > 43200000;
    }
}
