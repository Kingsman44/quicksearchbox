package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9576e;

import android.util.Base64;
import com.evernote.android.state.BuildConfig;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.protobuf.C63087y;
import com.google.protobuf.C63088z;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.e.ag */
/* compiled from: PG */
public final class C127303ag {
    /* renamed from: a */
    public static final String m208220a(byte[] bArr) {
        C69664n.m101061g(bArr, "rawBytes");
        C63087y v = C63088z.m96150v();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(v);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            String encodeToString = Base64.encodeToString(v.mo59165b().mo59174N(), 11);
            C69664n.m101060f(encodeToString, "encodeToString(compresse…ay(), URL_ENCODING_FLAGS)");
            return encodeToString;
        } catch (IOException e) {
            C59052c cVar = (C59052c) ((C59052c) C127306aj.f350602a.mo56226d()).mo56382g(e);
            cVar.mo56379ah(new C59094n(37289));
            cVar.mo56386p("GZIP failure");
            return BuildConfig.FLAVOR;
        }
    }
}
