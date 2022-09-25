package com.google.android.libraries.social.peoplekit.avatars.viewcontrollers;

import android.util.Log;
import com.bumptech.glide.load.C5637a;
import com.bumptech.glide.load.p293a.C5673ap;
import com.bumptech.glide.p287f.C5592i;
import com.bumptech.glide.p287f.p288a.C5572n;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;

/* renamed from: com.google.android.libraries.social.peoplekit.avatars.viewcontrollers.a */
/* compiled from: PG */
public final class C42024a implements C5592i {

    /* renamed from: a */
    private final String f109777a;

    /* renamed from: b */
    private final C42027d f109778b;

    /* renamed from: c */
    private final Channel f109779c;

    public C42024a(String str, C42027d dVar, Channel channel) {
        this.f109777a = str;
        this.f109778b = dVar;
        this.f109779c = channel;
    }

    /* renamed from: a */
    public final boolean mo11905a(C5673ap apVar, Object obj, C5572n nVar, boolean z) {
        if (Log.isLoggable("AvatarGlideListener", 6)) {
            Log.e("AvatarGlideListener", "Could not load avatar: ".concat(this.f109777a), apVar);
        }
        Channel channel = this.f109779c;
        if (channel != null) {
            this.f109778b.mo44508d(channel.mo44634o(), channel.mo44635p());
            return true;
        }
        this.f109778b.mo44508d((String) null, BuildConfig.FLAVOR);
        return true;
    }

    /* renamed from: b */
    public final boolean mo11906b(Object obj, Object obj2, C5572n nVar, C5637a aVar, boolean z) {
        this.f109778b.f109786b.mo44500a(false, 0, true);
        return false;
    }
}
