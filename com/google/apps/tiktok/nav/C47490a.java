package com.google.apps.tiktok.nav;

import android.app.Activity;
import android.content.Intent;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.MessageLite;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.apps.tiktok.nav.a */
/* compiled from: PG */
public final class C47490a {

    /* renamed from: a */
    private final Activity f123301a;

    /* renamed from: b */
    private final C47491b f123302b;

    public C47490a(Activity activity, C47491b bVar) {
        this.f123301a = activity;
        this.f123302b = bVar;
    }

    /* renamed from: a */
    public final MessageLite mo51343a(MessageLite messageLite) {
        C47491b bVar = this.f123302b;
        Intent intent = this.f123301a.getIntent();
        if (!intent.hasExtra("activity_params")) {
            return null;
        }
        try {
            return ProtoParsers.m95520c(intent.getExtras(), "activity_params", messageLite, bVar.f123304b);
        } catch (Exception e) {
            ((C59052c) ((C59052c) ((C59052c) C47491b.f123303a.mo56226d()).mo56382g(e)).mo56372aa(54746)).mo56386p("Failed to get provided Intent params.");
            return null;
        }
    }
}
