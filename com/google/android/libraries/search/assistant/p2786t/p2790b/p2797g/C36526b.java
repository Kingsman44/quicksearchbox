package com.google.android.libraries.search.assistant.p2786t.p2790b.p2797g;

import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.p11029ao.p11032c.C147806g;
import com.google.common.p4541l.C59332o;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

/* renamed from: com.google.android.libraries.search.assistant.t.b.g.b */
/* compiled from: PG */
public final class C36526b {
    /* renamed from: a */
    public static void m65065a(Context context, Uri uri, File file) {
        FileOutputStream fileOutputStream;
        file.getAbsolutePath();
        InputStream b = C147806g.m240908b(context, uri);
        if (b != null) {
            try {
                fileOutputStream = new FileOutputStream(file);
                C59332o.m92211b(b, fileOutputStream);
                fileOutputStream.close();
            } catch (Throwable th) {
                try {
                    b.close();
                } catch (Throwable th2) {
                    C36525a.m65064a(th, th2);
                }
                throw th;
            }
        }
        if (b != null) {
            b.close();
            return;
        }
        return;
        throw th;
    }
}
