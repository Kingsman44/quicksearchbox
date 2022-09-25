package com.google.android.libraries.gsa.util.p1935a;

import android.content.ComponentName;
import android.content.Intent;

/* renamed from: com.google.android.libraries.gsa.util.a.a */
/* compiled from: PG */
public final class C23336a {
    /* renamed from: a */
    public static Intent m43768a(String str) {
        Intent parseUri = Intent.parseUri(str, 1);
        parseUri.addCategory("android.intent.category.BROWSABLE");
        parseUri.setComponent((ComponentName) null);
        Intent selector = parseUri.getSelector();
        if (selector != null) {
            selector.addCategory("android.intent.category.BROWSABLE");
            selector.setComponent((ComponentName) null);
            selector.setSelector((Intent) null);
        }
        return parseUri;
    }
}
