package com.google.android.apps.gsa.staticplugins.nga.vis;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.service.voice.VoiceInteractionSession;
import com.google.android.apps.gsa.p5846e.C74507e;
import com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9048a.C120034s;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import dagger.C68214a;
import p3186j$.util.Optional;

/* compiled from: PG */
public class NgaRemoteVoiceInteractionSessionService extends C104168a {

    /* renamed from: a */
    public static final C58974d f289746a = C58974d.m91134h("NgaRemoteVisService");

    /* renamed from: b */
    public C104197ap f289747b;

    /* renamed from: c */
    public C68214a f289748c;

    /* renamed from: d */
    public C120034s f289749d;

    /* renamed from: b */
    public static Context m172140b(Context context) {
        if (Build.VERSION.SDK_INT < 31) {
            return context;
        }
        try {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager == null) {
                return context;
            }
            return context.createDisplayContext(displayManager.getDisplay(0)).createWindowContext(2031, (Bundle) null);
        } catch (RuntimeException e) {
            ((C58970a) ((C58970a) ((C58970a) f289746a.mo56226d()).mo56382g(e)).mo56372aa(21889)).mo56386p("Exception in createWindowContext");
            return context;
        }
    }

    public final void onCreate() {
        C74507e.m120466b(32);
        super.onCreate();
    }

    public final VoiceInteractionSession onNewSession(Bundle bundle) {
        Optional optional;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (!bundle2.getBoolean("EXTRA_REMOTE_APA_SESSION_REQUESTED", false)) {
            optional = Optional.empty();
        } else {
            IBinder binder = bundle2.getBinder("EXTRA_SESSION_TOKEN");
            if (binder == null) {
                ((C58970a) ((C58970a) f289746a.mo56226d()).mo56372aa(21893)).mo56386p("APA session requested, but EXTRA_SESSION_TOKEN is not provided.");
                optional = Optional.empty();
            } else {
                optional = Optional.m71637of(this.f289749d.mo104639a(m172140b(this), binder, bundle2));
            }
        }
        return (VoiceInteractionSession) optional.orElseGet(new C104198aq(this, bundle));
    }
}
