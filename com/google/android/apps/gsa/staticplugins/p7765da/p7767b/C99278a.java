package com.google.android.apps.gsa.staticplugins.p7765da.p7767b;

import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4215bk.p4216a.p4217a.p4218a.C56037a;
import com.google.p4215bk.p4216a.p4217a.p4218a.C56040d;
import com.google.p4486ci.p4487a.C58098c;
import com.google.p4486ci.p4487a.C58100e;
import com.google.p4486ci.p4487a.C58119x;
import java.io.File;
import java.io.FileNotFoundException;

/* renamed from: com.google.android.apps.gsa.staticplugins.da.b.a */
/* compiled from: PG */
public final /* synthetic */ class C99278a implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C99282e f277721a;

    /* renamed from: b */
    public final /* synthetic */ Uri f277722b;

    public /* synthetic */ C99278a(C99282e eVar, Uri uri) {
        this.f277721a = eVar;
        this.f277722b = uri;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C99282e eVar = this.f277721a;
        Uri uri = this.f277722b;
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            return C60856cj.m92899h(new IllegalArgumentException("Empty OAuth token"));
        }
        try {
            File file = new File(uri.getPath());
            C58098c cVar = new C58098c(file);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(file.getAbsolutePath(), options);
            int i = options.outHeight;
            int i2 = options.outWidth;
            long length = file.length();
            C58100e eVar2 = new C58100e();
            eVar2.mo54653d("Authorization", "Bearer ".concat(String.valueOf(str)));
            eVar2.mo54653d("x-goog-upload-content-length", String.valueOf(length));
            C56037a aVar = (C56037a) C56040d.f149238g.createBuilder();
            aVar.copyOnWrite();
            C56040d dVar = (C56040d) aVar.instance;
            dVar.f149241b = 1;
            dVar.f149240a |= 1;
            aVar.copyOnWrite();
            C56040d dVar2 = (C56040d) aVar.instance;
            dVar2.f149242c = 1;
            dVar2.f149240a |= 2;
            aVar.copyOnWrite();
            C56040d dVar3 = (C56040d) aVar.instance;
            dVar3.f149240a |= 4;
            dVar3.f149243d = i2;
            aVar.copyOnWrite();
            C56040d dVar4 = (C56040d) aVar.instance;
            dVar4.f149240a |= 8;
            dVar4.f149244e = i;
            aVar.copyOnWrite();
            C56040d dVar5 = (C56040d) aVar.instance;
            dVar5.f149240a |= 16;
            dVar5.f149245f = length;
            C60870cx a = C58119x.m88920a("https://photos.googleapis.com/data/upload/penny-uploadmedia-autopush/interactive/gsa-collections", eVar2, cVar, Base64.encodeToString(((C56040d) aVar.build()).toByteArray(), 11)).mo54658a();
            new C90873ag(a, eVar.f277727b, "Transfer result", new C99279b(cVar)).mo85223a(new C99280c(cVar));
            return eVar.f277727b.mo28209i(a, "upload result to ImageTransferExceptionOrHttpResponse", C99281d.f277725a);
        } catch (FileNotFoundException e) {
            ((C59052c) ((C59052c) ((C59052c) C99282e.f277726a.mo56225c()).mo56382g(e)).mo56372aa(31803)).mo56389s("Could not find file with given URI: %s", uri);
            return C60856cj.m92899h(e);
        }
    }
}
