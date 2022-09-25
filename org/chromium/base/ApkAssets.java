package org.chromium.base;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import com.evernote.android.state.BuildConfig;
import java.io.IOException;

/* compiled from: PG */
public class ApkAssets {
    public static long[] open(String str, String str2) {
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            Context context = C72382h.f192527a;
            if (!TextUtils.isEmpty(str2) && BundleUtils.m107015c(context, str2)) {
                context = BundleUtils.m107013a(context, str2);
            }
            AssetFileDescriptor openNonAssetFd = context.getAssets().openNonAssetFd(str);
            long[] jArr = {(long) openNonAssetFd.getParcelFileDescriptor().detachFd(), openNonAssetFd.getStartOffset(), openNonAssetFd.getLength()};
            if (openNonAssetFd != null) {
                try {
                    openNonAssetFd.close();
                } catch (IOException e) {
                    Log.e("ApkAssets", "Unable to close AssetFileDescriptor", e);
                }
            }
            return jArr;
        } catch (IOException e2) {
            if (!e2.getMessage().equals(BuildConfig.FLAVOR) && !e2.getMessage().equals(str)) {
                Log.e("ApkAssets", "Error while loading asset " + str + ": " + e2);
            }
            long[] jArr2 = {-1, -1, -1};
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException e3) {
                    Log.e("ApkAssets", "Unable to close AssetFileDescriptor", e3);
                }
            }
            return jArr2;
        } catch (Throwable th) {
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException e4) {
                    Log.e("ApkAssets", "Unable to close AssetFileDescriptor", e4);
                }
            }
            throw th;
        }
    }
}
