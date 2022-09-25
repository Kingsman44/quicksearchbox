package com.google.android.apps.gsa.staticplugins.accl.performers.p7342c;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import com.google.android.voiceinteraction.C45390as;
import com.google.common.p4526f.C59071e;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.c.ai */
/* compiled from: PG */
public final class C92934ai {

    /* renamed from: a */
    public static final C59071e f259264a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.accl.performers.c.ai");

    /* renamed from: b */
    public final ComponentName f259265b;

    /* renamed from: c */
    public final Context f259266c;

    /* renamed from: d */
    public C45390as f259267d = null;

    /* renamed from: e */
    public boolean f259268e;

    /* renamed from: f */
    public boolean f259269f;

    /* renamed from: g */
    public List f259270g = null;

    /* renamed from: h */
    final ServiceConnection f259271h = new C92933ah(this);

    public C92934ai(Context context) {
        this.f259266c = context;
        this.f259265b = new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.voiceinteraction.GsaVoiceInteractionService");
    }
}
