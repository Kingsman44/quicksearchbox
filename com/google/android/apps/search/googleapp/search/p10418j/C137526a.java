package com.google.android.apps.search.googleapp.search.p10418j;

import android.util.Base64;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.protobuf.C63087y;
import com.google.protobuf.C63088z;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.j.a */
/* compiled from: PG */
public final class C137526a {

    /* renamed from: a */
    private static final C58974d f374053a = C58974d.m91135i("OptInProtoUtil");

    /* renamed from: a */
    public static final String m223402a(byte[] bArr) {
        C69664n.m101061g(bArr, "rawBytes");
        C63087y v = C63088z.m96150v();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(v);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
        } catch (IOException e) {
            ((C58970a) ((C58970a) f374053a.mo56226d()).mo56382g(e)).mo56386p("GZIP failure");
        }
        C63088z b = v.mo59165b();
        C69664n.m101060f(b, "byteStream.toByteString()");
        String encodeToString = Base64.encodeToString(b.mo59174N(), 11);
        C69664n.m101060f(encodeToString, "encodeToString(\n      co… URL_ENCODING_FLAGS\n    )");
        return encodeToString;
    }
}
