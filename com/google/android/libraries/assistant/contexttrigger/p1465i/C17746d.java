package com.google.android.libraries.assistant.contexttrigger.p1465i;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.session.MediaController;
import android.media.session.MediaSessionManager;
import android.media.session.PlaybackState;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.ArrayList;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.i.d */
/* compiled from: PG */
public final class C17746d extends MediaController.Callback implements MediaSessionManager.OnActiveSessionsChangedListener {

    /* renamed from: a */
    public static final C58528ij f50969a = C58528ij.m90014N(0, 1, 2, 7, 8);

    /* renamed from: b */
    private static final C59071e f50970b = C59071e.m91332i("com.google.android.libraries.assistant.contexttrigger.i.d");

    /* renamed from: c */
    private final Context f50971c;

    /* renamed from: d */
    private final MediaSessionManager f50972d;

    public C17746d(Context context, MediaSessionManager mediaSessionManager) {
        this.f50971c = context;
        this.f50972d = mediaSessionManager;
    }

    public final void onActiveSessionsChanged(List list) {
        if (list == null) {
            list = new ArrayList();
        }
        ((C59052c) ((C59052c) f50970b.mo56224b()).mo56372aa(47036)).mo56387q("#onActiveSessionsChanged: for %s controllers", list.size());
        Collection.EL.forEach(list, new C17745c(this));
    }

    public final void onPlaybackStateChanged(PlaybackState playbackState) {
        Context context = this.f50971c;
        context.sendBroadcast(new Intent().setClassName(context, "com.google.android.libraries.assistant.contexttrigger.impl.ContextTriggerBroadcastReceiver_Receiver").setAction("MEDIA_CHANGE_ACTION").putExtra("CURRENTLY_PLAYING", (String[]) ((C58528ij) Collection.EL.stream(this.f50972d.getActiveSessions((ComponentName) null)).filter(C17743a.f50966a).map(C17744b.f50967a).collect(C58370cn.f155947b)).toArray()));
    }
}
