package com.google.android.libraries.mdi.download.p2236d.p2242f;

import android.content.Context;
import android.net.Uri;
import android.system.ErrnoException;
import android.system.Os;
import com.google.android.libraries.storage.p3304a.p3305a.C42718e;
import com.google.android.libraries.storage.p3304a.p3305a.C42719f;
import com.google.android.libraries.storage.p3304a.p3305a.C42720g;
import com.google.android.libraries.storage.p3304a.p3305a.C42729p;
import com.google.android.libraries.storage.p3304a.p3307c.C42764q;
import java.io.IOException;

/* renamed from: com.google.android.libraries.mdi.download.d.f.z */
/* compiled from: PG */
public final class C29112z {
    /* renamed from: a */
    public static Uri m54046a(Context context, Uri uri) {
        try {
            String readlink = Os.readlink(new C42720g(context, (C42729p) null).mo45823a(uri).getAbsolutePath());
            if (readlink != null) {
                C42718e a = C42719f.m75461a(context);
                a.mo45822c(readlink, (C42729p) null);
                return a.mo45820a();
            }
            throw new IOException("Unable to read symlink");
        } catch (ErrnoException | C42764q e) {
            throw new IOException("Unable to read symlink", e);
        }
    }

    /* renamed from: b */
    public static void m54047b(Context context, Uri uri, Uri uri2) {
        try {
            C42720g gVar = new C42720g(context, (C42729p) null);
            Os.symlink(gVar.mo45823a(uri2).getAbsolutePath(), gVar.mo45823a(uri).getAbsolutePath());
        } catch (ErrnoException | C42764q e) {
            throw new IOException("Unable to create symlink", e);
        }
    }
}
