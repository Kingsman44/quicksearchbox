package com.google.android.apps.gsa.staticplugins.p7537bk;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Base64;
import com.google.android.apps.gsa.search.core.p6879v.p6880a.C87242k;
import com.google.android.apps.gsa.shared.p6968aa.C89008af;
import com.google.android.apps.gsa.shared.p6968aa.C89009ag;
import com.google.android.apps.gsa.shared.p6968aa.C89018ap;
import com.google.android.apps.gsa.shared.p6968aa.C89020ar;
import com.google.android.apps.gsa.shared.p6968aa.C89053i;
import com.google.android.apps.gsa.shared.p6968aa.C89057m;
import com.google.android.apps.gsa.shared.p6968aa.C89066v;
import com.google.android.apps.gsa.shared.p6968aa.C89069y;
import com.google.android.apps.gsa.shared.p6968aa.C89070z;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.SettableFuture;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.gsa.staticplugins.bk.h */
/* compiled from: PG */
public final /* synthetic */ class C96649h implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C96651j f270390a;

    /* renamed from: b */
    public final /* synthetic */ Uri f270391b;

    /* renamed from: c */
    public final /* synthetic */ C89356b f270392c;

    public /* synthetic */ C96649h(C96651j jVar, Uri uri, C89356b bVar) {
        this.f270390a = jVar;
        this.f270391b = uri;
        this.f270392c = bVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        String str;
        SettableFuture settableFuture;
        File[] listFiles;
        int i;
        C96651j jVar = this.f270390a;
        Uri uri = this.f270391b;
        C89356b bVar = this.f270392c;
        C90748e.m148224b();
        C58976aa aaVar = C58975e.f156826a;
        File cacheDir = jVar.f270397b.getCacheDir();
        Uri c = C96651j.m160157c(uri);
        String concat = "networkimageloader_".concat(String.valueOf(Base64.encodeToString(c.toString().getBytes(), 8)));
        if (concat.length() > 255) {
            concat = String.format("%s_%08x", new Object[]{concat.substring(0, 246), Integer.valueOf(concat.hashCode())});
        }
        long f = jVar.f270398c.mo26874f();
        long b = jVar.f270398c.mo26870b();
        if (f - jVar.f270401h > 43210000) {
            long j = -43210000 + b;
            if (cacheDir == null || !cacheDir.isDirectory() || (listFiles = cacheDir.listFiles()) == null) {
                str = "Failed to load %s";
            } else {
                int length = listFiles.length;
                str = "Failed to load %s";
                int i2 = 0;
                while (i2 < length) {
                    File file = listFiles[i2];
                    if (!file.isFile() || file.lastModified() >= j) {
                        i = length;
                    } else {
                        i = length;
                        if (file.getName().startsWith("networkimageloader_")) {
                            file.delete();
                        }
                    }
                    i2++;
                    length = i;
                }
            }
            jVar.f270401h = f;
        } else {
            str = "Failed to load %s";
        }
        File file2 = new File(cacheDir, concat);
        if (!file2.exists() || file2.lastModified() < b - 43200000) {
            C89020ar e = C96651j.m160158e(c, C96651j.m160159f(uri));
            if (e == null) {
                return null;
            }
            try {
                C89053i a = ((C89057m) C90877ak.m148472f(((C87242k) jVar.f270399f.mo27525b()).mo80852a(bVar, C89066v.f241382a, new C89018ap(e, C89009ag.f241207b)))).mo83034a();
                file2.delete();
                C90748e.m148224b();
                try {
                    FileChannel channel = new FileOutputStream(file2).getChannel();
                    C90748e.m148224b();
                    SettableFuture settableFuture2 = new SettableFuture();
                    C60856cj.m92911t(a.mo27472b(), new C89008af(settableFuture2, a, channel), C60826bg.f164896a);
                    settableFuture2.mo4106b(new C89069y(settableFuture2, a), C60826bg.f164896a);
                    settableFuture2.mo4106b(new C89070z(settableFuture2, file2), C60826bg.f164896a);
                    settableFuture = settableFuture2;
                } catch (FileNotFoundException e2) {
                    a.mo27475d();
                    settableFuture = C60856cj.m92899h(e2);
                }
                C90877ak.m148472f(settableFuture);
            } catch (InterruptedException e3) {
                C59104x c2 = C96651j.f270396a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "NetworkImageLoaderWork");
                ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e3)).mo56372aa(20752)).mo56389s(str, uri);
                Thread.currentThread().interrupt();
            } catch (IOException | ExecutionException e4) {
                C59104x c3 = C96651j.f270396a.mo56225c();
                c3.mo56378ag(C58975e.f156826a, "NetworkImageLoaderWork");
                ((C59052c) ((C59052c) ((C59052c) c3).mo56382g(e4)).mo56372aa(20753)).mo56389s(str, uri);
            }
            try {
                return ParcelFileDescriptor.open(file2, 268435456);
            } catch (FileNotFoundException e5) {
                FileNotFoundException fileNotFoundException = e5;
                C59104x c4 = C96651j.f270396a.mo56225c();
                c4.mo56378ag(C58975e.f156826a, "NetworkImageLoaderWork");
                ((C59052c) ((C59052c) ((C59052c) c4).mo56382g(fileNotFoundException)).mo56372aa(20751)).mo56389s("Failed to open file %s", concat);
                return null;
            }
        } else {
            try {
                return ParcelFileDescriptor.open(file2, 268435456);
            } catch (FileNotFoundException e6) {
                FileNotFoundException fileNotFoundException2 = e6;
                C59104x c5 = C96651j.f270396a.mo56225c();
                c5.mo56378ag(C58975e.f156826a, "NetworkImageLoaderWork");
                ((C59052c) ((C59052c) ((C59052c) c5).mo56382g(fileNotFoundException2)).mo56372aa(20755)).mo56389s("Failed to open file %s", concat);
                return null;
            }
        }
    }
}
