package com.google.android.libraries.mdi.download.p2236d.p2242f;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.mdi.download.C29328dl;
import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.libraries.storage.p3304a.p3307c.C42758k;
import com.google.android.libraries.storage.p3304a.p3307c.C42764q;
import com.google.android.libraries.storage.p3304a.p3307c.C42768u;
import com.google.android.libraries.storage.p3304a.p3312f.C42790n;
import com.google.android.libraries.storage.p3304a.p3312f.C42796t;
import com.google.common.p4541l.C59332o;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.google.android.libraries.mdi.download.d.f.c */
/* compiled from: PG */
public final class C29089c {
    /* renamed from: a */
    public static void m53978a(Context context, String str, Uri uri, C29334dr drVar, C29328dl dlVar, C42813k kVar, boolean z) {
        OutputStream outputStream;
        String str2 = BuildConfig.FLAVOR;
        int i = 0;
        try {
            Uri c = C29090d.m53982c(context, str);
            InputStream inputStream = (InputStream) kVar.mo45889c(uri, new C42790n());
            try {
                outputStream = (OutputStream) kVar.mo45889c(c, new C42796t());
                C59332o.m92211b(inputStream, outputStream);
                if (outputStream != null) {
                    outputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (Throwable th) {
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        } catch (C42768u e) {
            if (!TextUtils.isEmpty(e.getMessage())) {
                str2 = e.getMessage();
            }
            C29045l.m53941m("%s: Failed to share after download for file %s, file group %s. UnsupportedFileStorageOperation was thrown with message \"%s\"", "AndroidSharingUtil", dlVar.f79473b, drVar.f79501c, str2);
            str2 = "UnsupportedFileStorageOperation was thrown: ".concat(String.valueOf(str2));
            i = 24;
        } catch (C42758k unused) {
            C29045l.m53937i("%s: Failed to share after download for file %s, file group %s due to LimitExceededException", "AndroidSharingUtil", dlVar.f79473b, drVar.f79501c);
            str2 = String.format("System limit exceeded for file %s, group %s", new Object[]{dlVar.f79473b, drVar.f79501c});
            i = 25;
        } catch (C42764q unused2) {
            C29045l.m53937i("%s: Malformed lease uri file %s, file group %s", "AndroidSharingUtil", dlVar.f79473b, drVar.f79501c);
            str2 = String.format("Malformed blob Uri for file %s, group %s", new Object[]{dlVar.f79473b, drVar.f79501c});
            i = 17;
        } catch (IOException unused3) {
            C29045l.m53937i("%s: Failed to copy to the blobstore after download for file %s, file group %s", "AndroidSharingUtil", dlVar.f79473b, drVar.f79501c);
            int i2 = true != z ? 21 : 22;
            str2 = String.format("Error while copying file %s, group %s, to the shared blob storage", new Object[]{dlVar.f79473b, drVar.f79501c});
            i = i2;
        } catch (Throwable th2) {
            C29087a.m53977a(th, th2);
        }
        if (i != 0) {
            throw new C29088b(i, str2);
        }
        return;
        throw th;
    }

    /* renamed from: b */
    public static boolean m53979b(Context context, String str, C29334dr drVar, C29328dl dlVar, C42813k kVar) {
        boolean z;
        String str2 = BuildConfig.FLAVOR;
        int i = 0;
        try {
            z = kVar.mo45894h(C29090d.m53982c(context, str));
        } catch (C42768u e) {
            if (!TextUtils.isEmpty(e.getMessage())) {
                str2 = e.getMessage();
            }
            C29045l.m53941m("%s: Failed to share for file %s, file group %s. UnsupportedFileStorageOperation was thrown with message \"%s\"", "AndroidSharingUtil", dlVar.f79473b, drVar.f79501c, str2);
            str2 = "UnsupportedFileStorageOperation was thrown: ".concat(String.valueOf(str2));
            z = false;
            i = 24;
        } catch (C42764q unused) {
            C29045l.m53937i("%s: Malformed lease uri file %s, file group %s", "AndroidSharingUtil", dlVar.f79473b, drVar.f79501c);
            str2 = String.format("Malformed blob Uri for file %s, group %s", new Object[]{dlVar.f79473b, drVar.f79501c});
            z = false;
            i = 17;
        } catch (IOException unused2) {
            C29045l.m53937i("%s: Failed to check existence in the shared storage for file %s, file group %s", "AndroidSharingUtil", dlVar.f79473b, drVar.f79501c);
            str2 = String.format("Error while checking if file %s, group %s, exists in the shared blob storage.", new Object[]{dlVar.f79473b, drVar.f79501c});
            z = false;
            i = 19;
        }
        if (i == 0) {
            return z;
        }
        throw new C29088b(i, str2);
    }
}
