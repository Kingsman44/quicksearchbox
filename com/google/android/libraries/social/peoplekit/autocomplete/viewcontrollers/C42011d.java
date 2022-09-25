package com.google.android.libraries.social.peoplekit.autocomplete.viewcontrollers;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.libraries.social.peoplekit.chips.viewcontrollers.C42064j;
import com.google.android.libraries.social.peoplekit.chips.viewcontrollers.ChannelChip;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;

/* renamed from: com.google.android.libraries.social.peoplekit.autocomplete.viewcontrollers.d */
/* compiled from: PG */
public final class C42011d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Channel f109706a;

    /* renamed from: b */
    final /* synthetic */ C42012e f109707b;

    public C42011d(C42012e eVar, Channel channel) {
        this.f109707b = eVar;
        this.f109706a = channel;
    }

    public final void run() {
        C42023p pVar = this.f109707b.f109708a;
        Channel channel = this.f109706a;
        for (C42064j jVar : pVar.f109743t) {
            if (jVar.f109938b.f109916a.f109918a.equals(channel)) {
                Context context = jVar.f109939c;
                if (context != null) {
                    Activity activity = (Activity) context;
                    if (!activity.isDestroyed() && !activity.isFinishing()) {
                        jVar.f109947k = channel.mo44631l(jVar.f109939c);
                        if (!TextUtils.isEmpty(jVar.f109947k) || !TextUtils.isEmpty(channel.mo44630k(jVar.f109939c))) {
                            ChannelChip channelChip = jVar.f109938b;
                            String str = jVar.f109947k;
                            String k = channel.mo44630k(jVar.f109939c);
                            channelChip.setContentDescription(str + ", " + k);
                        }
                        jVar.mo44556e(channel);
                    }
                }
                pVar.mo44497o(channel, jVar);
            }
        }
    }
}
