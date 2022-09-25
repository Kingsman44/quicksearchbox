package com.google.android.libraries.search.assistant.performer.communication;

import com.google.common.base.C58817ah;
import com.google.common.base.C58894dd;
import com.google.common.p4522b.C58485gu;
import java.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.az */
/* compiled from: PG */
public final /* synthetic */ class C35533az implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C35533az f93313a = new C35533az();

    private /* synthetic */ C35533az() {
    }

    public final Object apply(Object obj) {
        Optional optional = (Optional) obj;
        if (!optional.isEmpty()) {
            return C58485gu.m89842j((Collection) optional.get());
        }
        throw new C58894dd("Failed to get photos from downloader.");
    }
}
