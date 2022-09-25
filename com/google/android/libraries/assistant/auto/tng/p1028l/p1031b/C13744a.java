package com.google.android.libraries.assistant.auto.tng.p1028l.p1031b;

import java.io.File;
import java.io.FileFilter;
import java.util.regex.Pattern;

/* renamed from: com.google.android.libraries.assistant.auto.tng.l.b.a */
/* compiled from: PG */
public final /* synthetic */ class C13744a implements FileFilter {

    /* renamed from: a */
    public static final /* synthetic */ C13744a f41911a = new C13744a();

    private /* synthetic */ C13744a() {
    }

    public final boolean accept(File file) {
        int i = C13747d.f41918a;
        return Pattern.matches("cpu[0-9]", file.getName());
    }
}
