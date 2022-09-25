package com.google.android.apps.search.sceneviewer.modelviewer;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.libraries.p579ar.sceneviewer.concurrent.CompletableFuture;
import com.google.android.libraries.p579ar.sceneviewer.utilities.WebUtilities;
import com.google.common.p4526f.C59052c;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.sceneviewer.modelviewer.x */
/* compiled from: PG */
public final /* synthetic */ class C141620x implements Function {

    /* renamed from: a */
    public final /* synthetic */ C141584am f384421a;

    /* renamed from: b */
    public final /* synthetic */ Uri f384422b;

    /* renamed from: c */
    public final /* synthetic */ Uri f384423c;

    public /* synthetic */ C141620x(C141584am amVar, Uri uri, Uri uri2) {
        this.f384421a = amVar;
        this.f384422b = uri;
        this.f384423c = uri2;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C141584am amVar = this.f384421a;
        Uri uri = this.f384422b;
        Uri uri2 = this.f384423c;
        Drawable drawable = (Drawable) obj;
        if (drawable != null) {
            return CompletableFuture.completedFuture(drawable);
        }
        ((C59052c) ((C59052c) C141584am.f384271b.mo56226d()).mo56372aa(41742)).mo56389s("Failed to create obtain dark mode icon from %s, fetching regular icon", uri);
        return WebUtilities.downloadDrawable(amVar.f384337f.getContext(), uri2);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
