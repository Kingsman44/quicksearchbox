package com.google.android.libraries.lens.view.p2083aw.p2084a;

import com.google.common.p4526f.p4527a.C58974d;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

/* renamed from: com.google.android.libraries.lens.view.aw.a.a */
/* compiled from: PG */
public final class C25590a {

    /* renamed from: a */
    public static final C58974d f69624a = C58974d.m91135i("LensMessageRecorder");

    /* renamed from: b */
    public BufferedOutputStream f69625b;

    /* renamed from: c */
    public BufferedOutputStream f69626c;

    /* renamed from: a */
    public static BufferedOutputStream m47195a(File file) {
        if (file.exists()) {
            file.delete();
        }
        file.createNewFile();
        return new BufferedOutputStream(new FileOutputStream(file, true));
    }
}
