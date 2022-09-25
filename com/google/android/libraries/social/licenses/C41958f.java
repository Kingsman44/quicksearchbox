package com.google.android.libraries.social.licenses;

import android.content.Context;
import android.content.res.Resources;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58838bb;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.google.android.libraries.social.licenses.f */
/* compiled from: PG */
public final class C41958f {
    /* renamed from: a */
    public static String m73470a(Context context, License license) {
        long j = license.f109504b;
        int i = license.f109505c;
        String str = license.f109506d;
        if (str.isEmpty()) {
            return m73474e(context, "third_party_licenses", j, i);
        }
        try {
            String d = m73473d(new BufferedInputStream(new FileInputStream(str)), j, i);
            if (d != null && !d.isEmpty()) {
                return d;
            }
        } catch (FileNotFoundException unused) {
        }
        throw new RuntimeException(String.valueOf(str).concat(" does not contain res/raw/third_party_licenses"));
    }

    /* renamed from: b */
    public static ArrayList m73471b(String str, String str2) {
        ArrayList arrayList = new ArrayList(r2);
        for (String str3 : str.split("\n")) {
            int indexOf = str3.indexOf(32);
            String[] split = str3.substring(0, indexOf).split(":");
            C58838bb.m90884s(split.length == 2 && indexOf > 0, "Invalid license meta-data line:\n".concat(String.valueOf(str3)));
            arrayList.add(new License(str3.substring(indexOf + 1), Long.parseLong(split[0]), Integer.parseInt(split[1]), str2));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: c */
    public static ArrayList m73472c(Context context) {
        return m73471b(m73474e(context.getApplicationContext(), "third_party_license_metadata", 0, -1), BuildConfig.FLAVOR);
    }

    /* renamed from: d */
    private static String m73473d(InputStream inputStream, long j, int i) {
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            inputStream.skip(j);
            if (i <= 0) {
                i = Integer.MAX_VALUE;
            }
            while (i > 0) {
                int read = inputStream.read(bArr, 0, Math.min(i, 1024));
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
                i -= read;
            }
            inputStream.close();
            try {
                return byteArrayOutputStream.toString("UTF-8");
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("Unsupported encoding UTF8. This should always be supported.", e);
            }
        } catch (IOException e2) {
            throw new RuntimeException("Failed to read license or metadata text.", e2);
        }
    }

    /* renamed from: e */
    private static String m73474e(Context context, String str, long j, int i) {
        Resources resources = context.getApplicationContext().getResources();
        return m73473d(resources.openRawResource(resources.getIdentifier(str, "raw", resources.getResourcePackageName(R.id.dummy_placeholder))), j, i);
    }
}
