package com.google.android.libraries.assistant.hotword;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.google.android.libraries.assistant.hotword.o */
/* compiled from: PG */
final class C18378o implements FilenameFilter {

    /* renamed from: a */
    final /* synthetic */ long f52154a;

    public C18378o(long j) {
        this.f52154a = j;
    }

    public final boolean accept(File file, String str) {
        return str.startsWith("hotword_audio") && this.f52154a - file.lastModified() > 43200000;
    }
}
