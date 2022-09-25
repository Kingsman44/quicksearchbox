package com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p971c.p976c;

import android.content.res.AssetFileDescriptor;
import android.os.ParcelFileDescriptor;
import com.google.common.base.C58838bb;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.C61920cc;
import java.io.File;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.d.a.c.c.d */
/* compiled from: PG */
public final class C13485d {
    /* renamed from: a */
    public static C13484c m29743a(File file, C13483b bVar, int i) {
        C58838bb.m90873h(file.exists(), "Model file does not exist: %s", file.getAbsolutePath());
        return new C13482a(bVar, i, C61920cc.m94585c(new AssetFileDescriptor(ParcelFileDescriptor.open(file, 268435456), 0, file.length())));
    }
}
