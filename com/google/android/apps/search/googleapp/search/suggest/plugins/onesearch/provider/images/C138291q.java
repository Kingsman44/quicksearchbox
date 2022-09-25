package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.images;

import com.bumptech.glide.load.p293a.p295b.C5685a;
import com.google.common.p4526f.C59052c;
import java.io.File;
import java.io.IOException;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.images.q */
/* compiled from: PG */
public final /* synthetic */ class C138291q implements C5685a {

    /* renamed from: a */
    public static final /* synthetic */ C138291q f376243a = new C138291q();

    private /* synthetic */ C138291q() {
    }

    /* renamed from: a */
    public final boolean mo12189a(File file) {
        file.getClass();
        try {
            if (file.createNewFile()) {
                return true;
            }
            if (file.setLastModified(System.currentTimeMillis())) {
                return true;
            }
            new StringBuilder("Unable to update modification time of ").append(file);
            throw new IOException("Unable to update modification time of ".concat(file.toString()));
        } catch (IOException e) {
            ((C59052c) ((C59052c) ((C59052c) OneSearchImageProvider.f376207a.mo56226d()).mo56382g(e)).mo56372aa(41152)).mo56386p("Could not prepare cache file for image.");
            return false;
        }
    }
}
