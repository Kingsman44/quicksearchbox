package com.google.android.libraries.assistant.auto.ondevice.p710d.p711a;

import android.net.Uri;
import com.google.android.libraries.mdi.C28595b;
import com.google.android.libraries.mdi.C29690f;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.libraries.storage.p3304a.p3312f.C42788l;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import java.io.File;
import java.util.Iterator;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.ondevice.d.a.a */
/* compiled from: PG */
public final class C11874a {

    /* renamed from: b */
    private static final C58974d f38217b = C58974d.m91136j();

    /* renamed from: a */
    public final C11877d f38218a;

    /* renamed from: c */
    private final C42813k f38219c;

    /* renamed from: d */
    private final String[] f38220d;

    public C11874a(C11877d dVar, C42813k kVar, String[] strArr) {
        this.f38218a = dVar;
        this.f38219c = kVar;
        this.f38220d = strArr;
    }

    /* renamed from: a */
    public final Optional mo20268a(String str, String str2) {
        Optional empty;
        Optional optional;
        ((C58970a) ((C58970a) f38217b.mo56224b()).mo56372aa(43721)).mo56354G("Read %s language pack file %s", str, str2);
        if (this.f38218a.mo20277f(str)) {
            C11876c cVar = (C11876c) this.f38218a.f38232b.get(str);
            Uri uri = null;
            if (cVar != null) {
                C29690f fVar = cVar.f38228h;
                if (fVar != null) {
                    String concat = !str2.startsWith("/") ? "/".concat(String.valueOf(str2)) : str2;
                    Iterator it = fVar.f80416g.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            ((C58970a) ((C58970a) C11876c.f38221a.mo56226d()).mo56372aa(43727)).mo56389s("did not find file: %s in language pack", concat);
                            break;
                        }
                        C28595b bVar = (C28595b) it.next();
                        if (concat.equals(bVar.f77798b)) {
                            ((C58970a) ((C58970a) C11876c.f38221a.mo56224b()).mo56372aa(43728)).mo56389s("found client file: %s", bVar.f77798b);
                            uri = Uri.parse(bVar.f77799c);
                            break;
                        }
                    }
                } else {
                    ((C58970a) ((C58970a) C11876c.f38221a.mo56226d()).mo56372aa(43729)).mo56354G("locale %s is not installed, while reading: %s", cVar.f38222b, str2);
                }
            }
            if (uri == null) {
                optional = Optional.empty();
            } else {
                try {
                    C42813k kVar = this.f38219c;
                    C42788l lVar = new C42788l();
                    lVar.f112052a = true;
                    File file = (File) kVar.mo45889c(uri, lVar);
                    if (file.exists()) {
                        optional = Optional.m71637of(file);
                    }
                } catch (Exception e) {
                    ((C58970a) ((C58970a) ((C58970a) f38217b.mo56226d()).mo56382g(e)).mo56372aa(43719)).mo56354G("Error reading downloaded %s language pack file %s", str, str2);
                }
                optional = Optional.empty();
            }
            if (optional.isPresent()) {
                ((File) optional.get()).getPath();
                return optional;
            }
            ((C58970a) ((C58970a) f38217b.mo56226d()).mo56372aa(43724)).mo56389s("Did not find language pack file %s from MDD directory", str2);
            return Optional.empty();
        }
        String[] strArr = this.f38220d;
        int i = 0;
        while (true) {
            if (i >= 2) {
                empty = Optional.empty();
                break;
            }
            File file2 = new File(String.format(strArr[i], new Object[]{str}), str2);
            if (file2.exists()) {
                empty = Optional.m71637of(file2);
                break;
            }
            i++;
        }
        if (empty.isPresent()) {
            ((File) empty.get()).getPath();
            return empty;
        }
        ((C58970a) ((C58970a) f38217b.mo56226d()).mo56372aa(43722)).mo56389s("Did not find language pack file %s from pre-installed directory", str2);
        return Optional.empty();
    }
}
