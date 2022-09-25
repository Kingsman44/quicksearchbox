package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.window;

import com.google.android.apps.gsa.nga.shared.p6417x.C83344ae;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.window.l */
/* compiled from: PG */
public final /* synthetic */ class C82178l implements C83344ae {

    /* renamed from: a */
    public static final /* synthetic */ C82178l f224609a = new C82178l();

    private /* synthetic */ C82178l() {
    }

    /* renamed from: a */
    public final Object mo73140a(Object obj, Object obj2, Object obj3, Object obj4) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        Boolean bool3 = (Boolean) obj3;
        Boolean bool4 = (Boolean) obj4;
        if (!bool.booleanValue() && !bool3.booleanValue()) {
            return Optional.empty();
        }
        boolean z = true;
        if ((!bool.booleanValue() || !bool2.booleanValue()) && (!bool3.booleanValue() || !bool4.booleanValue())) {
            z = false;
        }
        return Optional.m71637of(Boolean.valueOf(z));
    }
}
