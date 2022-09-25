package com.google.android.libraries.search.rendering.xuikit.bubbles.activity;

import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.search.rendering.xuikit.bubbles.C40126e;
import com.google.protobuf.contrib.android.ProtoParsers;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.activity.a */
/* compiled from: PG */
public final class C40093a {
    /* renamed from: a */
    public static final Intent m69617a(Context context, C40126e eVar) {
        C69664n.m101061g(context, "applicationContext");
        C69664n.m101061g(eVar, "bubbleLaunchParams");
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.libraries.search.rendering.xuikit.bubbles.activity.BubbleTrampolineActivity");
        ProtoParsers.m95531n(intent, "INTENT_EXTRA_BUBBLE_PARAMS", eVar);
        return intent;
    }
}
