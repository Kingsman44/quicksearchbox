package com.google.apps.tiktok.nav;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.common.base.C58838bb;
import com.google.protobuf.MessageLite;
import com.google.protobuf.contrib.android.ProtoParsers;
import java.util.Map;

/* renamed from: com.google.apps.tiktok.nav.c */
/* compiled from: PG */
public final class C47492c {

    /* renamed from: a */
    private final Context f123305a;

    /* renamed from: b */
    private final Map f123306b;

    public C47492c(Context context, Map map) {
        this.f123305a = context;
        this.f123306b = map;
    }

    /* renamed from: a */
    public final Intent mo51344a(MessageLite messageLite) {
        String str = (String) this.f123306b.get(messageLite.getClass());
        C58838bb.m90869d(str != null, "No matching activity found");
        Intent component = new Intent().setComponent(new ComponentName(this.f123305a, str));
        ProtoParsers.m95531n(component, "activity_params", messageLite);
        return component;
    }
}
