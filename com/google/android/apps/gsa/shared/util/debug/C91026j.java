package com.google.android.apps.gsa.shared.util.debug;

import android.content.Context;
import android.content.Intent;
import androidx.core.content.FileProvider;
import com.evernote.android.state.BuildConfig;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.shared.util.debug.j */
/* compiled from: PG */
public final class C91026j {

    /* renamed from: a */
    public static final Object f254263a = new Object();

    /* renamed from: a */
    public static File m148686a(Context context) {
        return new File(context.getFilesDir(), "dump");
    }

    /* renamed from: b */
    public static File m148687b(Context context, String str) {
        File a = m148686a(context);
        a.mkdir();
        return new File(a, str);
    }

    /* renamed from: c */
    public static File m148688c(Context context, String str, byte[] bArr) {
        File b = m148687b(context, str);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(b);
            fileOutputStream.write(bArr);
            fileOutputStream.close();
            return b;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: d */
    public static void m148689d(Context context, String str, File... fileArr) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder(str);
        if (sb.length() > 0) {
            sb.append(": ");
        }
        for (int i = 0; i < fileArr.length; i++) {
            arrayList.add(FileProvider.m5057a(context, "com.google.android.nowdev.trustedtestprovider").mo5044a(fileArr[i]));
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(fileArr[i].getName());
        }
        Intent intent = new Intent("android.intent.action.SEND_MULTIPLE");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.SUBJECT", sb.toString());
        intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
        intent.addFlags(268435457);
        context.startActivity(intent);
    }

    /* renamed from: e */
    public static final void m148690e(Context context, String str, byte[] bArr, String str2, byte[] bArr2) {
        m148689d(context, BuildConfig.FLAVOR, m148688c(context, str, bArr), m148688c(context, str2, bArr2));
    }

    /* renamed from: f */
    public static final void m148691f(Context context, String str, byte[] bArr, String str2, byte[] bArr2) {
        m148688c(context, str, bArr);
        m148688c(context, str2, bArr2);
    }
}
