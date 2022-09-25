package com.google.android.apps.gsa.shared.util;

import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4575r.C60761r;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63010eb;
import com.google.protobuf.MessageLite;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.google.android.apps.gsa.shared.util.ar */
/* compiled from: PG */
public final class C90734ar {

    /* renamed from: a */
    private static final C59071e f253811a = C59071e.m91332i("com.google.android.apps.gsa.shared.util.ar");

    /* renamed from: a */
    public static long m148198a(byte[] bArr) {
        try {
            return C60761r.m92757c(MessageDigest.getInstance("MD5").digest(bArr));
        } catch (NoSuchAlgorithmException e) {
            throw ar$$ExternalSyntheticBackport0.m148204m("MD5 digest must exist!", e);
        }
    }

    /* renamed from: b */
    public static Object m148199b(Bundle bundle, String str, C63010eb ebVar) {
        try {
            byte[] byteArray = bundle.getByteArray(str);
            if (byteArray == null) {
                return null;
            }
            return ebVar.mo59015n(byteArray, C62921ba.m95368a());
        } catch (C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) f253811a.mo56225c()).mo56382g(e)).mo56372aa(11319)).mo56389s("Error parsing proto extra: %s", str);
            return null;
        }
    }

    /* renamed from: c */
    public static void m148200c(Intent intent, String str, MessageLite messageLite) {
        if (messageLite != null) {
            intent.putExtra(str, messageLite.toByteArray());
        }
    }

    /* renamed from: d */
    public static byte[] m148201d(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
        } catch (IOException e) {
            ((C59052c) ((C59052c) ((C59052c) f253811a.mo56226d()).mo56382g(e)).mo56372aa(11320)).mo56386p("GZIP failure");
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: e */
    public static byte[] m148202e(byte[] bArr) {
        try {
            return Base64.decode(bArr, 8);
        } catch (IllegalArgumentException e) {
            ((C59052c) ((C59052c) ((C59052c) f253811a.mo56225c()).mo56382g(e)).mo56372aa(11321)).mo56386p("Could not decode base64 string");
            throw new C90457d((Throwable) e, (int) C89885b.GWS_BAD_BASE64_STRING_VALUE);
        }
    }

    /* renamed from: f */
    public static byte[] m148203f(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr2, 0, 1024);
                if (read <= 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            gZIPInputStream.close();
        } catch (IOException e) {
            ((C59052c) ((C59052c) ((C59052c) f253811a.mo56226d()).mo56382g(e)).mo56372aa(11322)).mo56386p("GZIP failure");
        }
        return byteArrayOutputStream.toByteArray();
    }
}
