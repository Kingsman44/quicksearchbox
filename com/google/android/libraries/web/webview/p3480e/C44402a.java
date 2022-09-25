package com.google.android.libraries.web.webview.p3480e;

import com.google.android.libraries.web.localassets.AccountStorageWebDirectory;
import java.io.File;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.webview.e.a */
/* compiled from: PG */
final class C44402a {

    /* renamed from: a */
    public final AccountStorageWebDirectory f115427a;

    /* renamed from: b */
    public final File f115428b;

    public C44402a(AccountStorageWebDirectory accountStorageWebDirectory, File file) {
        C69664n.m101061g(accountStorageWebDirectory, "directory");
        C69664n.m101061g(file, "file");
        this.f115427a = accountStorageWebDirectory;
        this.f115428b = file;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44402a)) {
            return false;
        }
        C44402a aVar = (C44402a) obj;
        return C69664n.m101066l(this.f115427a, aVar.f115427a) && C69664n.m101066l(this.f115428b, aVar.f115428b);
    }

    public final int hashCode() {
        return (this.f115427a.hashCode() * 31) + this.f115428b.hashCode();
    }

    public final String toString() {
        AccountStorageWebDirectory accountStorageWebDirectory = this.f115427a;
        File file = this.f115428b;
        return "WebViewAssetInfo(directory=" + accountStorageWebDirectory + ", file=" + file + ")";
    }
}
