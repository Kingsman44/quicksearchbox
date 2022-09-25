package com.google.android.libraries.p579ar.sceneviewer.utilities;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.Spanned;
import com.google.android.libraries.p579ar.sceneviewer.concurrent.CompletableFuture;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.CompletionException;

/* renamed from: com.google.android.libraries.ar.sceneviewer.utilities.WebUtilities */
/* compiled from: PG */
public final class WebUtilities {
    private static final String CLOSE_TITLE_TAG = "</title>";
    private static final String END_TAG = ">";
    private static final String START_OPEN_TITLE_TAG = "<title";
    /* access modifiers changed from: private */
    public static final C59071e logger = C59071e.m91332i("com.google.android.libraries.ar.sceneviewer.utilities.WebUtilities");

    /* renamed from: com.google.android.libraries.ar.sceneviewer.utilities.WebUtilities$PageTitleListener */
    /* compiled from: PG */
    public interface PageTitleListener {
        void onPageTitleLoaded(Spanned spanned);
    }

    private WebUtilities() {
    }

    public static CompletableFuture download(Context context, Uri uri) {
        return download(context, uri, (Boolean) null);
    }

    public static CompletableFuture downloadDrawable(Context context, Uri uri) {
        return downloadDrawable(context, uri, (Boolean) null);
    }

    public static void getPageTitle(String str, WeakReference weakReference) {
        new C10765d(new URL(str), weakReference, new Handler(Looper.getMainLooper())).start();
    }

    static /* synthetic */ InputStream lambda$download$1(Uri uri, Boolean bool) {
        try {
            return (InputStream) LoadHelper.remoteUriToInputStreamCreator(uri, (Map) null, bool).call();
        } catch (Exception e) {
            throw new CompletionException("Unable to get inputstream of url", e);
        }
    }

    static /* synthetic */ Drawable lambda$downloadDrawable$0(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        Drawable createFromStream = Drawable.createFromStream(inputStream, (String) null);
        try {
            inputStream.close();
        } catch (IOException e) {
            ((C59052c) ((C59052c) ((C59052c) logger.mo56226d()).mo56382g(e)).mo56372aa(42396)).mo56386p("Error closing inputstream when downloading drawable");
        }
        return createFromStream;
    }

    public static CompletableFuture download(Context context, Uri uri, Boolean bool) {
        return CompletableFuture.supplyAsync(new WebUtilities$$ExternalSyntheticLambda1(uri, bool), ThreadPools.getThreadPoolExecutor());
    }

    public static CompletableFuture downloadDrawable(Context context, Uri uri, Boolean bool) {
        return download(context, uri, bool).thenApplyAsync(WebUtilities$$ExternalSyntheticLambda0.INSTANCE, ThreadPools.getThreadPoolExecutor());
    }
}
