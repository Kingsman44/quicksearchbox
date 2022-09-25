package com.google.android.apps.gsa.nga.engine.p6260x;

import android.os.Bundle;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.i */
/* compiled from: PG */
public final class C79861i {
    /* renamed from: a */
    public static String m128008a(Bundle bundle) {
        if (bundle == null) {
            return "null";
        }
        return (String) Collection.EL.stream(bundle.keySet()).map(new C79860h(bundle)).collect(Collectors.joining(", ", "{", "}"));
    }

    /* renamed from: b */
    public static String m128009b(Object obj) {
        if (obj instanceof Bundle) {
            return m128008a((Bundle) obj);
        }
        return String.valueOf(obj);
    }
}
