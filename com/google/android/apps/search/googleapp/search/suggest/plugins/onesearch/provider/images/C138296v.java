package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.images;

import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.google.common.base.C58817ah;
import java.io.File;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.images.v */
/* compiled from: PG */
public final /* synthetic */ class C138296v implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ OneSearchImageProvider f376254a;

    public /* synthetic */ C138296v(OneSearchImageProvider oneSearchImageProvider) {
        this.f376254a = oneSearchImageProvider;
    }

    public final Object apply(Object obj) {
        Context context = this.f376254a.f376208b;
        Uri a = FileProvider.m5057a(context, String.valueOf(context.getPackageName()).concat(".provider.OneSearchImageProvider")).mo5044a((File) Objects.requireNonNull((File) obj));
        context.grantUriPermission("com.google.android.apps.nexuslauncher", a, 1);
        return a.toString();
    }
}
