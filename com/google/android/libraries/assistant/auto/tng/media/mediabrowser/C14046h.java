package com.google.android.libraries.assistant.auto.tng.media.mediabrowser;

import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.media.mediabrowser.h */
/* compiled from: PG */
public final class C14046h {
    /* renamed from: a */
    public static Optional m30338a(String str) {
        int indexOf = str.indexOf("||");
        if (indexOf <= 0) {
            return Optional.empty();
        }
        return Optional.m71637of(str.substring(indexOf + 2));
    }
}
